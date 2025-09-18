package appenders;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;

@Plugin(name = "AllureAppender", category = "Core", elementType = Appender.ELEMENT_TYPE)
public class AllureAppender extends AbstractAppender {

    protected AllureAppender(String name, Layout<? extends Serializable> layout) {
        super(name, null, layout, false, null);
    }

    @PluginFactory
    public static AllureAppender createAppender(
            @PluginAttribute("name") String name,
            @PluginElement("Layout") Layout<? extends Serializable> layout) {
        if (layout == null) {
            layout = PatternLayout.newBuilder()
                    .withPattern("%d{yyyy-MM-dd HH:mm:ss} %-5p [%c{1}] %m%n")
                    .withCharset(StandardCharsets.UTF_8)
                    .build();
        }
        return new AllureAppender(name, layout);
    }

    @Override
    public void append(LogEvent event) {
        // Get the full formatted log line
        String formattedLog = getLayout().toSerializable(event).toString();
        // Send full formatted log to Allure step
        Allure.step(formattedLog);
    }
}
