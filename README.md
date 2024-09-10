### tc-test


Sample project replicating the issue described here: https://github.com/testcontainers/testcontainers-java/issues/9212

Log output:

```
C:\Users\danie\.jdks\corretto-17.0.12\bin\java.exe -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\lib\idea_rt.jar=52754:C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\danie\.m2\repository\org\junit\platform\junit-platform-launcher\1.10.3\junit-platform-launcher-1.10.3.jar;C:\Users\danie\.m2\repository\org\junit\vintage\junit-vintage-engine\5.10.3\junit-vintage-engine-5.10.3.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\plugins\junit\lib\junit-rt.jar;C:\Users\danie\IdeaProjects\tc-test\target\test-classes;C:\Users\danie\IdeaProjects\tc-test\target\classes;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-graphql\3.3.3\spring-boot-starter-graphql-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.3\spring-boot-starter-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot\3.3.3\spring-boot-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.3\spring-boot-starter-logging-3.3.3.jar;C:\Users\danie\.m2\repository\ch\qos\logback\logback-classic\1.5.7\logback-classic-1.5.7.jar;C:\Users\danie\.m2\repository\ch\qos\logback\logback-core\1.5.7\logback-core-1.5.7.jar;C:\Users\danie\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\danie\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\danie\.m2\repository\org\slf4j\jul-to-slf4j\2.0.16\jul-to-slf4j-2.0.16.jar;C:\Users\danie\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\danie\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.3\spring-boot-starter-json-3.3.3.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\danie\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.2\jackson-module-parameter-names-2.17.2.jar;C:\Users\danie\.m2\repository\org\springframework\graphql\spring-graphql\1.3.2\spring-graphql-1.3.2.jar;C:\Users\danie\.m2\repository\io\micrometer\context-propagation\1.1.1\context-propagation-1.1.1.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.3\spring-boot-starter-web-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.3\spring-boot-starter-tomcat-3.3.3.jar;C:\Users\danie\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.28\tomcat-embed-core-10.1.28.jar;C:\Users\danie\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.28\tomcat-embed-el-10.1.28.jar;C:\Users\danie\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.28\tomcat-embed-websocket-10.1.28.jar;C:\Users\danie\.m2\repository\org\springframework\spring-web\6.1.12\spring-web-6.1.12.jar;C:\Users\danie\.m2\repository\io\micrometer\micrometer-observation\1.13.3\micrometer-observation-1.13.3.jar;C:\Users\danie\.m2\repository\io\micrometer\micrometer-commons\1.13.3\micrometer-commons-1.13.3.jar;C:\Users\danie\.m2\repository\org\springframework\spring-webmvc\6.1.12\spring-webmvc-6.1.12.jar;C:\Users\danie\.m2\repository\org\springframework\spring-aop\6.1.12\spring-aop-6.1.12.jar;C:\Users\danie\.m2\repository\org\springframework\spring-expression\6.1.12\spring-expression-6.1.12.jar;C:\Users\danie\.m2\repository\org\projectlombok\lombok\1.18.34\lombok-1.18.34.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-starter-test\3.3.3\spring-boot-starter-test-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-test\3.3.3\spring-boot-test-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-test-autoconfigure\3.3.3\spring-boot-test-autoconfigure-3.3.3.jar;C:\Users\danie\.m2\repository\com\jayway\jsonpath\json-path\2.9.0\json-path-2.9.0.jar;C:\Users\danie\.m2\repository\org\slf4j\slf4j-api\2.0.16\slf4j-api-2.0.16.jar;C:\Users\danie\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.2\jakarta.xml.bind-api-4.0.2.jar;C:\Users\danie\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.3\jakarta.activation-api-2.1.3.jar;C:\Users\danie\.m2\repository\net\minidev\json-smart\2.5.1\json-smart-2.5.1.jar;C:\Users\danie\.m2\repository\net\minidev\accessors-smart\2.5.1\accessors-smart-2.5.1.jar;C:\Users\danie\.m2\repository\org\ow2\asm\asm\9.6\asm-9.6.jar;C:\Users\danie\.m2\repository\org\assertj\assertj-core\3.25.3\assertj-core-3.25.3.jar;C:\Users\danie\.m2\repository\net\bytebuddy\byte-buddy\1.14.19\byte-buddy-1.14.19.jar;C:\Users\danie\.m2\repository\org\awaitility\awaitility\4.2.2\awaitility-4.2.2.jar;C:\Users\danie\.m2\repository\org\hamcrest\hamcrest\2.2\hamcrest-2.2.jar;C:\Users\danie\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.3\junit-jupiter-5.10.3.jar;C:\Users\danie\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.3\junit-jupiter-api-5.10.3.jar;C:\Users\danie\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\danie\.m2\repository\org\junit\platform\junit-platform-commons\1.10.3\junit-platform-commons-1.10.3.jar;C:\Users\danie\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\danie\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.3\junit-jupiter-params-5.10.3.jar;C:\Users\danie\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.3\junit-jupiter-engine-5.10.3.jar;C:\Users\danie\.m2\repository\org\junit\platform\junit-platform-engine\1.10.3\junit-platform-engine-1.10.3.jar;C:\Users\danie\.m2\repository\org\mockito\mockito-core\5.11.0\mockito-core-5.11.0.jar;C:\Users\danie\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.19\byte-buddy-agent-1.14.19.jar;C:\Users\danie\.m2\repository\org\objenesis\objenesis\3.3\objenesis-3.3.jar;C:\Users\danie\.m2\repository\org\mockito\mockito-junit-jupiter\5.11.0\mockito-junit-jupiter-5.11.0.jar;C:\Users\danie\.m2\repository\org\skyscreamer\jsonassert\1.5.3\jsonassert-1.5.3.jar;C:\Users\danie\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\danie\.m2\repository\org\springframework\spring-core\6.1.12\spring-core-6.1.12.jar;C:\Users\danie\.m2\repository\org\springframework\spring-jcl\6.1.12\spring-jcl-6.1.12.jar;C:\Users\danie\.m2\repository\org\springframework\spring-test\6.1.12\spring-test-6.1.12.jar;C:\Users\danie\.m2\repository\org\xmlunit\xmlunit-core\2.9.1\xmlunit-core-2.9.1.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-testcontainers\3.3.3\spring-boot-testcontainers-3.3.3.jar;C:\Users\danie\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.3\spring-boot-autoconfigure-3.3.3.jar;C:\Users\danie\.m2\repository\org\testcontainers\testcontainers\1.19.8\testcontainers-1.19.8.jar;C:\Users\danie\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\danie\.m2\repository\org\hamcrest\hamcrest-core\2.2\hamcrest-core-2.2.jar;C:\Users\danie\.m2\repository\org\apache\commons\commons-compress\1.24.0\commons-compress-1.24.0.jar;C:\Users\danie\.m2\repository\org\rnorth\duct-tape\duct-tape\1.0.8\duct-tape-1.0.8.jar;C:\Users\danie\.m2\repository\org\jetbrains\annotations\17.0.0\annotations-17.0.0.jar;C:\Users\danie\.m2\repository\com\github\docker-java\docker-java-api\3.3.6\docker-java-api-3.3.6.jar;C:\Users\danie\.m2\repository\com\github\docker-java\docker-java-transport-zerodep\3.3.6\docker-java-transport-zerodep-3.3.6.jar;C:\Users\danie\.m2\repository\com\github\docker-java\docker-java-transport\3.3.6\docker-java-transport-3.3.6.jar;C:\Users\danie\.m2\repository\net\java\dev\jna\jna\5.13.0\jna-5.13.0.jar;C:\Users\danie\.m2\repository\org\springframework\spring-webflux\6.1.12\spring-webflux-6.1.12.jar;C:\Users\danie\.m2\repository\org\springframework\spring-beans\6.1.12\spring-beans-6.1.12.jar;C:\Users\danie\.m2\repository\io\projectreactor\reactor-core\3.6.9\reactor-core-3.6.9.jar;C:\Users\danie\.m2\repository\org\reactivestreams\reactive-streams\1.0.4\reactive-streams-1.0.4.jar;C:\Users\danie\.m2\repository\org\springframework\graphql\spring-graphql-test\1.3.2\spring-graphql-test-1.3.2.jar;C:\Users\danie\.m2\repository\com\graphql-java\graphql-java\22.1\graphql-java-22.1.jar;C:\Users\danie\.m2\repository\com\graphql-java\java-dataloader\3.3.0\java-dataloader-3.3.0.jar;C:\Users\danie\.m2\repository\org\springframework\spring-context\6.1.12\spring-context-6.1.12.jar;C:\Users\danie\.m2\repository\org\testcontainers\junit-jupiter\1.19.8\junit-jupiter-1.19.8.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.dmustafa.tctest.TcTestApplicationTests,contextLoads
08:54:00.730 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.dmustafa.tctest.TcTestApplicationTests]: TcTestApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
08:54:00.843 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.dmustafa.tctest.TcTestApplication for test class com.dmustafa.tctest.TcTestApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.3)

2024-09-10T08:54:01.240-05:00  INFO 15800 --- [tc-test] [           main] c.d.tctest.TcTestApplicationTests        : Starting TcTestApplicationTests using Java 17.0.12 with PID 15800 (started by danie in C:\Users\danie\IdeaProjects\tc-test)
2024-09-10T08:54:01.241-05:00  INFO 15800 --- [tc-test] [           main] c.d.tctest.TcTestApplicationTests        : No active profile set, falling back to 1 default profile: "default"
2024-09-10T08:54:02.538-05:00  INFO 15800 --- [tc-test] [           main] c.d.tctest.TcTestApplicationTests        : Started TcTestApplicationTests in 1.543 seconds (process running for 2.458)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2024-09-10T08:54:03.317-05:00  INFO 15800 --- [tc-test] [           main] org.testcontainers.images.PullPolicy     : Image pull policy will be performed by: DefaultPullPolicy()
2024-09-10T08:54:03.321-05:00  INFO 15800 --- [tc-test] [           main] o.t.utility.ImageNameSubstitutor         : Image name substitution will be performed by: DefaultImageNameSubstitutor (composite of 'ConfigurationFileImageNameSubstitutor' and 'PrefixingImageNameSubstitutor')
2024-09-10T08:54:03.584-05:00  INFO 15800 --- [tc-test] [           main] o.t.d.DockerClientProviderStrategy       : Loaded org.testcontainers.dockerclient.NpipeSocketClientProviderStrategy from ~/.testcontainers.properties, will try it first
2024-09-10T08:54:03.808-05:00  INFO 15800 --- [tc-test] [           main] o.t.d.DockerClientProviderStrategy       : Found Docker environment with local Npipe socket (npipe:////./pipe/docker_engine)
2024-09-10T08:54:03.810-05:00  INFO 15800 --- [tc-test] [           main] org.testcontainers.DockerClientFactory   : Docker host IP address is localhost
2024-09-10T08:54:03.827-05:00  INFO 15800 --- [tc-test] [           main] org.testcontainers.DockerClientFactory   : Connected to docker: 
  Server Version: 27.2.0
  API Version: 1.47
  Operating System: Docker Desktop
  Total Memory: 7904 MB
2024-09-10T08:54:03.827-05:00  INFO 15800 --- [tc-test] [           main] o.t.utility.RyukResourceReaper           : Ryuk started - will monitor and terminate Testcontainers containers on JVM exit
2024-09-10T08:54:03.827-05:00  INFO 15800 --- [tc-test] [           main] org.testcontainers.DockerClientFactory   : Checking the system...
2024-09-10T08:54:03.827-05:00  INFO 15800 --- [tc-test] [           main] org.testcontainers.DockerClientFactory   : ✔︎ Docker server version should be at least 1.6.0
2024-09-10T08:54:03.840-05:00  INFO 15800 --- [tc-test] [           main] tc.testcontainers/ryuk:0.7.0             : Creating container for image: testcontainers/ryuk:0.7.0
2024-09-10T08:54:04.127-05:00  INFO 15800 --- [tc-test] [           main] tc.testcontainers/ryuk:0.7.0             : Container testcontainers/ryuk:0.7.0 is starting: 98f33b7265cd1c87ec4fc561d4eca6e357d7e9eabdce64095b4f548b5b4805ef
2024-09-10T08:54:04.546-05:00  INFO 15800 --- [tc-test] [           main] tc.testcontainers/ryuk:0.7.0             : Container testcontainers/ryuk:0.7.0 started in PT0.7060391S
2024-09-10T08:54:04.552-05:00  INFO 15800 --- [tc-test] [           main] o.t.containers.ComposeDelegate           : Preemptively checking local images for 'wiremock/wiremock:3.0.4', referenced via a compose file or transitive Dockerfile. If not available, it will be pulled.
2024-09-10T08:54:04.557-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Local Docker Compose is running command: compose up -d
2024-09-10T08:54:04.696-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            : time="2024-09-10T08:54:04-05:00" level=warning msg="C:\\Users\\danie\\IdeaProjects\\tc-test\\src\\test\\resources\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
2024-09-10T08:54:04.707-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Network sxyekqzd9hgt_default  Creating
2024-09-10T08:54:04.756-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Network sxyekqzd9hgt_default  Created
2024-09-10T08:54:04.756-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Creating
2024-09-10T08:54:04.900-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Created
2024-09-10T08:54:04.904-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Starting
2024-09-10T08:54:05.228-05:00  INFO 15800 --- [tc-test] [      Thread-24] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Started
2024-09-10T08:54:05.253-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Docker Compose has finished running
2024-09-10T08:54:05.254-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Creating container for image: alpine/socat:1.7.4.3-r0
2024-09-10T08:54:05.421-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 is starting: cc92668133f1f9eae829a6a3e67d4c6b5875f0061bcfe76e51b33ac345a80b33
2024-09-10T08:54:05.933-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 started in PT0.6790146S
2024-09-10T08:54:05.953-05:00  WARN 15800 --- [tc-test] [     ducttape-0] o.t.c.wait.strategy.HttpWaitStrategy     : Unexpected error occurred - will proceed to try to wait anyway

java.lang.IllegalStateException: Target port 8099 is not exposed
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$waitUntilReady$2(HttpWaitStrategy.java:236) ~[testcontainers-1.19.8.jar:1.19.8]
	at java.base/java.util.Optional.orElseThrow(Optional.java:403) ~[na:na]
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:236) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:52) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.waitUntilNestedStrategiesAreReady(WaitAllStrategy.java:66) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.lambda$waitUntilReady$0(WaitAllStrategy.java:58) ~[testcontainers-1.19.8.jar:1.19.8]
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539) ~[na:na]
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635) ~[na:na]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

2024-09-10T08:54:07.114-05:00  INFO 15800 --- [tc-test] [           main] c.d.tctest.TcTestApplicationTests        : Containers loaded and validated
2024-09-10T08:54:07.536-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Local Docker Compose is running command: compose down -v
2024-09-10T08:54:07.661-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            : time="2024-09-10T08:54:07-05:00" level=warning msg="C:\\Users\\danie\\IdeaProjects\\tc-test\\src\\test\\resources\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
2024-09-10T08:54:07.666-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Stopping
2024-09-10T08:54:08.358-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Stopped
2024-09-10T08:54:08.358-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Removing
2024-09-10T08:54:08.373-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Container sxyekqzd9hgt-wiremock-1  Removed
2024-09-10T08:54:08.376-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Network sxyekqzd9hgt_default  Removing
2024-09-10T08:54:08.613-05:00  INFO 15800 --- [tc-test] [      Thread-26] tc.docker.exe                            :  Network sxyekqzd9hgt_default  Removed
2024-09-10T08:54:08.638-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Docker Compose has finished running
2024-09-10T08:54:08.641-05:00  INFO 15800 --- [tc-test] [           main] o.t.containers.ComposeDelegate           : Preemptively checking local images for 'wiremock/wiremock:3.0.4', referenced via a compose file or transitive Dockerfile. If not available, it will be pulled.
2024-09-10T08:54:08.643-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Local Docker Compose is running command: compose up -d
2024-09-10T08:54:08.763-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            : time="2024-09-10T08:54:08-05:00" level=warning msg="C:\\Users\\danie\\IdeaProjects\\tc-test\\src\\test\\resources\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
2024-09-10T08:54:08.776-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Network 4pevjgajm4km_default  Creating
2024-09-10T08:54:08.821-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Network 4pevjgajm4km_default  Created
2024-09-10T08:54:08.821-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Creating
2024-09-10T08:54:08.941-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Created
2024-09-10T08:54:08.945-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Starting
2024-09-10T08:54:09.281-05:00  INFO 15800 --- [tc-test] [      Thread-28] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Started
2024-09-10T08:54:09.305-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Docker Compose has finished running
2024-09-10T08:54:09.306-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Creating container for image: alpine/socat:1.7.4.3-r0
2024-09-10T08:54:09.452-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 is starting: 8e38b63c8ba111710092cac99b1d058c43f71fe576e3bc57998d633477fd020e
2024-09-10T08:54:09.955-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 started in PT0.6491788S
2024-09-10T08:54:09.969-05:00  WARN 15800 --- [tc-test] [     ducttape-0] o.t.c.wait.strategy.HttpWaitStrategy     : Unexpected error occurred - will proceed to try to wait anyway

java.lang.IllegalStateException: Target port 8099 is not exposed
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$waitUntilReady$2(HttpWaitStrategy.java:236) ~[testcontainers-1.19.8.jar:1.19.8]
	at java.base/java.util.Optional.orElseThrow(Optional.java:403) ~[na:na]
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:236) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:52) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.waitUntilNestedStrategiesAreReady(WaitAllStrategy.java:66) ~[testcontainers-1.19.8.jar:1.19.8]
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.lambda$waitUntilReady$0(WaitAllStrategy.java:58) ~[testcontainers-1.19.8.jar:1.19.8]
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539) ~[na:na]
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635) ~[na:na]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

2024-09-10T08:54:11.095-05:00  INFO 15800 --- [tc-test] [           main] c.d.tctest.TcTestApplicationTests        : Containers loaded and validated
2024-09-10T08:54:11.526-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Local Docker Compose is running command: compose down -v
2024-09-10T08:54:11.650-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            : time="2024-09-10T08:54:11-05:00" level=warning msg="C:\\Users\\danie\\IdeaProjects\\tc-test\\src\\test\\resources\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
2024-09-10T08:54:11.655-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Stopping
2024-09-10T08:54:12.287-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Stopped
2024-09-10T08:54:12.287-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Removing
2024-09-10T08:54:12.303-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Container 4pevjgajm4km-wiremock-1  Removed
2024-09-10T08:54:12.306-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Network 4pevjgajm4km_default  Removing
2024-09-10T08:54:12.544-05:00  INFO 15800 --- [tc-test] [      Thread-30] tc.docker.exe                            :  Network 4pevjgajm4km_default  Removed
2024-09-10T08:54:12.557-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Docker Compose has finished running
2024-09-10T08:54:12.559-05:00  INFO 15800 --- [tc-test] [           main] o.t.containers.ComposeDelegate           : Preemptively checking local images for 'wiremock/wiremock:3.0.4', referenced via a compose file or transitive Dockerfile. If not available, it will be pulled.
2024-09-10T08:54:12.561-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Local Docker Compose is running command: compose up -d
2024-09-10T08:54:12.682-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            : time="2024-09-10T08:54:12-05:00" level=warning msg="C:\\Users\\danie\\IdeaProjects\\tc-test\\src\\test\\resources\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
2024-09-10T08:54:12.694-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Network jfdcrrr8xc9h_default  Creating
2024-09-10T08:54:12.739-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Network jfdcrrr8xc9h_default  Created
2024-09-10T08:54:12.740-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Container jfdcrrr8xc9h-wiremock-1  Creating
2024-09-10T08:54:12.863-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Container jfdcrrr8xc9h-wiremock-1  Created
2024-09-10T08:54:12.868-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Container jfdcrrr8xc9h-wiremock-1  Starting
2024-09-10T08:54:13.215-05:00  INFO 15800 --- [tc-test] [      Thread-32] tc.docker.exe                            :  Container jfdcrrr8xc9h-wiremock-1  Started
2024-09-10T08:54:13.239-05:00  INFO 15800 --- [tc-test] [           main] tc.docker.exe                            : Docker Compose has finished running
2024-09-10T08:54:13.240-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Creating container for image: alpine/socat:1.7.4.3-r0
2024-09-10T08:54:13.392-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 is starting: fcd4efba6820e63aa1e634cfd427f797da96541f36ef36b0d13e2a0137689ee2
2024-09-10T08:54:13.854-05:00  INFO 15800 --- [tc-test] [           main] tc.alpine/socat:1.7.4.3-r0               : Container alpine/socat:1.7.4.3-r0 started in PT0.6140952S
2024-09-10T08:54:13.867-05:00  INFO 15800 --- [tc-test] [     ducttape-0] o.t.c.wait.strategy.HttpWaitStrategy     : /jfdcrrr8xc9h-wiremock-1: Waiting for 60 seconds for URL: http://localhost:52784/__admin/mappings (where port 52784 maps to container port 8099)

java.lang.RuntimeException: org.testcontainers.containers.ContainerLaunchException: Timed out waiting for URL to be accessible (http://localhost:52784/__admin/mappings should return HTTP 200)

	at org.rnorth.ducttape.timeouts.Timeouts.callFuture(Timeouts.java:68)
	at org.rnorth.ducttape.timeouts.Timeouts.doWithTimeout(Timeouts.java:60)
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.waitUntilReady(WaitAllStrategy.java:54)
	at org.testcontainers.containers.ComposeDelegate.waitUntilServiceStarted(ComposeDelegate.java:229)
	at java.base/java.util.concurrent.ConcurrentHashMap.forEach(ConcurrentHashMap.java:1603)
	at org.testcontainers.containers.ComposeDelegate.waitUntilServiceStarted(ComposeDelegate.java:203)
	at org.testcontainers.containers.ComposeContainer.start(ComposeContainer.java:140)
	at com.dmustafa.tctest.TcTestApplicationTests.contextLoads(TcTestApplicationTests.java:27)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
Caused by: org.testcontainers.containers.ContainerLaunchException: Timed out waiting for URL to be accessible (http://localhost:52784/__admin/mappings should return HTTP 200)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:320)
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:52)
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.waitUntilNestedStrategiesAreReady(WaitAllStrategy.java:66)
	at org.testcontainers.containers.wait.strategy.WaitAllStrategy.lambda$waitUntilReady$0(WaitAllStrategy.java:58)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.rnorth.ducttape.TimeoutException: Timeout waiting for result with exception
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:54)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:252)
	... 8 more
Caused by: java.lang.RuntimeException: java.net.SocketException: Unexpected end of file from server
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$null$6(HttpWaitStrategy.java:312)
	at org.rnorth.ducttape.ratelimits.RateLimiter.doWhenReady(RateLimiter.java:27)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$waitUntilReady$7(HttpWaitStrategy.java:257)
	at org.rnorth.ducttape.unreliables.Unreliables.lambda$retryUntilSuccess$0(Unreliables.java:43)
	... 4 more
Caused by: java.net.SocketException: Unexpected end of file from server
	at java.base/sun.net.www.http.HttpClient.parseHTTPHeader(HttpClient.java:954)
	at java.base/sun.net.www.http.HttpClient.parseHTTP(HttpClient.java:761)
	at java.base/sun.net.www.http.HttpClient.parseHTTPHeader(HttpClient.java:951)
	at java.base/sun.net.www.http.HttpClient.parseHTTP(HttpClient.java:761)
	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1709)
	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1610)
	at java.base/java.net.HttpURLConnection.getResponseCode(HttpURLConnection.java:529)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$null$6(HttpWaitStrategy.java:276)
	... 7 more


Process finished with exit code -1
```
