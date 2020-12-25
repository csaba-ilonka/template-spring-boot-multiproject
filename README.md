# Getting started

- Change the `rootProject.name` in  [settings.gradle](settings.gradle)
- Enable annotation processing in IntelliJ Idea

## Gradle

- Upgrade to the latest [Gradle release](https://gradle.org/releases/):
    ```shell script
    gradlew wrapper --gradle-version=<VERSION> --distribution-type=all
    ```

- Upgrade the following plugins and libraries in [build.gradle](build.gradle):
    - [io.spring.dependency-management](https://plugins.gradle.org/plugin/io.spring.dependency-management) 
    - [org.springframework.boot](https://plugins.gradle.org/plugin/org.springframework.boot)
    - [io.freefair.lombok](https://plugins.gradle.org/plugin/io.freefair.lombok)
    - [lombok](https://projectlombok.org/download)

# Frequently used libraries 

- [Lombok](https://projectlombok.org/setup/gradle)
- [Jackson](https://github.com/FasterXML/jackson/wiki/Jackson-Releases)
- [Google Guava](https://github.com/FasterXML/jackson/wiki/Jackson-Releases)
- [Apache Commons](https://commons.apache.org/downloads/index.html)