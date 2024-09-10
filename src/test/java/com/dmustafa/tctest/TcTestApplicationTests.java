package com.dmustafa.tctest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.ComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;

import java.io.File;

@SpringBootTest
@Slf4j
class TcTestApplicationTests {

    private static ComposeContainer compose_container;

    @Test
    void contextLoads() {

        for (int i = 0; i < 10; i++) {
            var compose_container = new ComposeContainer(new File("src/test/resources/docker-compose.yml"))
                    .withExposedService("wiremock", 8099,
                            Wait.forHttp("/__admin/mappings"))
                    .withLocalCompose(true);

            compose_container.start();
            log.info("Containers loaded and validated");
            compose_container.stop();
        }
    }

}
