package io.github.csabailonka.template.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
    }

    @Test
    void testLibraryAutoConfiguration(@Autowired @Qualifier("library-bean") String libraryBean) {
        Assertions.assertNotNull(libraryBean, "Bean is null");
        Assertions.assertEquals("template", libraryBean, "Bean is incorrect");
    }
}
