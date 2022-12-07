package pom_xml_props;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PomProps {

    @Test
    void checkPropsInBuildDirectory() throws IOException {
        PropertiesReader reader = new PropertiesReader("pom.properties");
        String property = reader.getProperty("baseUrl");
        Assertions.assertEquals("https://countrystage.siberianhealth.com/kz-ru/", property);
    }
}
