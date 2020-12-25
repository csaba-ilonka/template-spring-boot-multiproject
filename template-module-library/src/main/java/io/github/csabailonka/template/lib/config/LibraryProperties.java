package io.github.csabailonka.template.lib.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="library")
public class LibraryProperties {
    private String property = "template";
}
