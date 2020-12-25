package io.github.csabailonka.template.lib.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("template-module-library.LibraryAutoConfig")
public class LibraryAutoConfig {

    @Autowired
    private LibraryProperties properties;

    @Bean("library-bean")
    public String libraryBean() {
        return properties.getProperty();
    }

    @Bean
    @ConditionalOnMissingBean
    public LibraryProperties properties() {
        return new LibraryProperties();
    }
}
