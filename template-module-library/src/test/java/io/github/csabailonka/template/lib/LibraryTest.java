package io.github.csabailonka.template.lib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryTest {

    @Autowired
    @Qualifier("library-bean")
    private String libraryBean;

    @Test
    public void testAutoConfiguration() {
        Assertions.assertNotNull(libraryBean, "Bean is null");
        Assertions.assertEquals("template", libraryBean, "Bean is incorrect");
    }
}
