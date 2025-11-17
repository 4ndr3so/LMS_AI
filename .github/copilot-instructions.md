<!-- Copied and authored for the LMS repository. Keep concise and runnable. -->
# Copilot instructions for contributors and AI agents

This repository contains a minimal Spring Boot backend and a placeholder `front/` directory.
When making changes, prefer edits in `back/lms` (the Maven module). Below are the practical patterns
and commands an AI coding agent should follow to be immediately productive.

- Project type: **Spring Boot (Java 17)**. See `back/lms/pom.xml` for dependencies (Spring Boot 3.5.7).
- Main application: `back/lms/src/main/java/com/orjuelasso/back/lms/LmsApplication.java`.
- Config: `back/lms/src/main/resources/application.properties` (add DB or environment properties here).

Build & run (local dev)
- Use the included Maven wrapper from `back/lms`:
  - Build: `cd back/lms && ./mvnw clean package`
  - Run: `cd back/lms && ./mvnw spring-boot:run`
  - Test: `cd back/lms && ./mvnw test`
- The project includes `spring-boot-devtools` for hot reload during development.

Database & runtime notes
- The `pom.xml` declares `mysql-connector-j` with `runtime` scope. No datasource URL is committed.
  Expect contributors to add `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password`
  to `back/lms/src/main/resources/application.properties` or supply them via environment variables when running.

Code patterns and structure to follow
- Add application code inside the `com.orjuelasso.back.lms` package. Example main class: `LmsApplication.java`.
- Typical layers to create: `controller`, `service`, `repository`, `model` under the package root.
  - Repositories should extend Spring Data `JpaRepository`.
  - Services are plain Spring `@Service` classes and are injected into controllers.
- Tests use JUnit 5 and Spring Boot test support (`@SpringBootTest`). Keep tests small and focused.

Conventions & useful examples
- Java version: target **17** (set in `pom.xml`). Keep source compatibility aligned.
- When adding endpoints, use REST-style controllers (`@RestController`) and validation annotations (`@Valid`) as the project already includes validation.
- Keep the `pom.xml` minimal: prefer adding dependencies to the module `back/lms/pom.xml` rather than top-level changes.

Integration points
- `front/` is a separate workspace area for front-end code. Coordinate changes between `front/` and `back/lms` by documenting API routes added in controllers and updating `front/` accordingly.

Editing guidance for AI
- If creating files, put them under `back/lms/src/main/java/com/orjuelasso/back/lms/...` and run `./mvnw -DskipTests package` to validate compilation.
- Do not add production secrets to `application.properties`. Use environment variables for DB credentials.
- When modifying `pom.xml`, be conservative: prefer adding only required dependencies and keep the Spring Boot parent version unless asked otherwise.

Key files to reference when working in this repo
- `back/lms/pom.xml` — dependency and build configuration
- `back/lms/HELP.md` — project notes and useful Spring guides
- `back/lms/src/main/java/com/orjuelasso/back/lms/LmsApplication.java` — application entrypoint
- `back/lms/src/main/resources/application.properties` — runtime configuration

If anything here is unclear or you need more examples (controllers, repositories, DTOs), ask for permission and I will add a small example scaffold inside `back/lms`.

-- End of instructions --
