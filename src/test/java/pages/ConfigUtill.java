package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class ConfigUtill {

    private ConfigUtill() {
        throw new IllegalStateException("Utility class");
    }

    public static Properties getConfig() {
        final Logger LOGGER = Logger.getLogger(ConfigUtill.class.getName());
        final Properties myProp = new Properties();
        try {
            final File configExternalFile = new File(System.getProperty("user.dir") + "/src/test/java/Configuration/config.properties");
            LOGGER.log(INFO, () -> "This is user dir file path: " + configExternalFile);
            if (configExternalFile.exists()) {
                LOGGER.log(INFO, "Using config: " + configExternalFile.getAbsolutePath());
                myProp.load(new FileInputStream(configExternalFile));
            } else {
                LOGGER.log(INFO, "Using default config.properties");
                final InputStream fProp = ConfigUtill.class.getClassLoader().getResourceAsStream("config.properties");
                myProp.load(fProp);
            }

        } catch (Exception e) {
            LOGGER.log(INFO, e.getMessage(), e);
        }
        return myProp;
    }
}