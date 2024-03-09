FROM adoptopenjdk/openjdk11:latest as build
WORKDIR /workspace/app

COPY mvnw .
COPY pom.xml .
COPY .mvn .mvn
COPY src src

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
WORKDIR /app
ARG PORT
ENV PORT "$PORT"
EXPOSE ${PORT}
ARG DEPENDENCY=/workspace/app/target/dependency
ARG JAVAJAR=/workspace/app/target
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
COPY --from=build ${JAVAJAR}/retro-0.0.1-SNAPSHOT /app/retro.jar
CMD ["java", "-jar", "retro.jar"]
ENTRYPOINT ["java", "-jar", "retro.jar"]