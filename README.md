
# Spring Boot Structured JSON Logging with Log4j

Spring's Logs are structered with pattern see: [log4j2.yml](https://github.com/G-khan/spring-boot-json-logging/blob/main/src/main/resources/log4j2.yml)

Logger logs are structured as a json objects:

    {"instant":{"epochSecond":1612380749,"nanoOfSecond":934528300},"thread":"main","level":"INFO","loggerName":"LOGGER_WITH_JSON_LAYOUT","message":"Programmer: A machine that turns coffee into code.","endOfBatch":false,"loggerFqcn":"org.apache.logging.log4j.spi.AbstractLogger","threadId":1,"threadPriority":5}

## Adding Dependincies to gradle


    implementation ('org.springframework.boot:spring-boot-starter-log4j2')  
    implementation ('org.springframework.boot:spring-boot-starter-web'){  
      exclude group: 'org.springframework.boot', module: 'spring-boot-starter-logging'  
    }  
    implementation group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-yaml', version: '2.12.1'

configurations for logs: [log4j2.yml](https://github.com/G-khan/spring-boot-json-logging/blob/main/src/main/resources/log4j2.yml) and the log4j2 Layouts: [from apache](https://logging.apache.org/log4j/2.x/manual/layouts.html#JSONLayout)
