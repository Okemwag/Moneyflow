# pesaflow

This project was created using the [Ktor Project Generator](https://start.ktor.io).

Here are some useful links to get you started:

- [Ktor Documentation](https://ktor.io/docs/home.html)
- [Ktor GitHub page](https://github.com/ktorio/ktor)
- The [Ktor Slack chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9). You'll need to [request an invite](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up) to join.

## Features

Here's a list of features included in this project:

| Name                                                                   | Description                                                                        |
| ------------------------------------------------------------------------|------------------------------------------------------------------------------------ |
| [Raw Sockets](https://start.ktor.io/p/ktor-network)                    | Adds raw socket support for TCP and UDP                                            |
| [Raw Secure SSL/TLS Sockets](https://start.ktor.io/p/ktor-network-tls) | Adds secure socket support for TCP and UDP                                         |
| [Task Scheduling](https://start.ktor.io/p/ktor-server-task-scheduling) | Manages scheduled tasks across instances of your distributed Ktor server           |
| [Rate Limiting](https://start.ktor.io/p/ktor-server-rate-limiting)     | Manage request rate limiting as you see fit                                        |
| [Routing](https://start.ktor.io/p/routing)                             | Provides a structured routing DSL                                                  |
| [WebSockets](https://start.ktor.io/p/ktor-websockets)                  | Adds WebSocket protocol support for bidirectional client connections               |
| [Koin](https://start.ktor.io/p/koin)                                   | Provides dependency injection                                                      |
| [kotlinx.serialization](https://start.ktor.io/p/kotlinx-serialization) | Handles JSON serialization using kotlinx.serialization library                     |
| [Content Negotiation](https://start.ktor.io/p/content-negotiation)     | Provides automatic content conversion according to Content-Type and Accept headers |
| [Postgres](https://start.ktor.io/p/postgres)                           | Adds Postgres database to your application                                         |
| [Kafka](https://start.ktor.io/p/ktor-server-kafka)                     | Adds Kafka support to your application                                             |
| [Jackson](https://start.ktor.io/p/ktor-jackson)                        | Handles JSON serialization using Jackson library                                   |
| [GSON](https://start.ktor.io/p/ktor-gson)                              | Handles JSON serialization using GSON library                                      |
| [Micrometer Metrics](https://start.ktor.io/p/metrics-micrometer)       | Enables Micrometer metrics in your Ktor server application.                        |
| [Metrics](https://start.ktor.io/p/metrics)                             | Adds supports for monitoring several metrics                                       |
| [Call Logging](https://start.ktor.io/p/call-logging)                   | Logs client requests                                                               |
| [Swagger](https://start.ktor.io/p/swagger)                             | Serves Swagger UI for your project                                                 |
| [Simple Cache](https://start.ktor.io/p/simple-cache)                   | Provides API for cache management                                                  |
| [Simple Redis Cache](https://start.ktor.io/p/simple-redis-cache)       | Provides Redis cache for Simple Cache plugin                                       |
| [OpenAPI](https://start.ktor.io/p/openapi)                             | Serves OpenAPI documentation                                                       |
| [HttpsRedirect](https://start.ktor.io/p/https-redirect)                | Redirects insecure HTTP requests to the respective HTTPS endpoint                  |
| [Forwarded Headers](https://start.ktor.io/p/forwarded-header-support)  | Allows handling proxied headers (X-Forwarded-*)                                    |
| [Default Headers](https://start.ktor.io/p/default-headers)             | Adds a default set of headers to HTTP responses                                    |
| [CORS](https://start.ktor.io/p/cors)                                   | Enables Cross-Origin Resource Sharing (CORS)                                       |
| [Conditional Headers](https://start.ktor.io/p/conditional-headers)     | Skips response body, depending on ETag and LastModified headers                    |
| [Compression](https://start.ktor.io/p/compression)                     | Compresses responses using encoding algorithms like GZIP                           |
| [Caching Headers](https://start.ktor.io/p/caching-headers)             | Provides options for responding with standard cache-control headers                |
| [Status Pages](https://start.ktor.io/p/status-pages)                   | Provides exception handling for routes                                             |
| [Static Content](https://start.ktor.io/p/static-content)               | Serves static files from defined locations                                         |
| [Resources](https://start.ktor.io/p/resources)                         | Provides type-safe routing                                                         |
| [Request Validation](https://start.ktor.io/p/request-validation)       | Adds validation for incoming requests                                              |
| [DoubleReceive](https://start.ktor.io/p/double-receive)                | Allows ApplicationCall.receive several times                                       |
| [AutoHeadResponse](https://start.ktor.io/p/auto-head-response)         | Provides automatic responses for HEAD requests                                     |
| [Sessions](https://start.ktor.io/p/ktor-sessions)                      | Adds support for persistent sessions through cookies or headers                    |
| [Authentication](https://start.ktor.io/p/auth)                         | Provides extension point for handling the Authorization header                     |
| [Authentication OAuth](https://start.ktor.io/p/auth-oauth)             | Handles OAuth Bearer authentication scheme                                         |
| [CSRF](https://start.ktor.io/p/csrf)                                   | Cross-site request forgery mitigation                                              |
| [Authentication JWT](https://start.ktor.io/p/auth-jwt)                 | Handles JSON Web Token (JWT) bearer authentication scheme                          |
| [Authentication Basic](https://start.ktor.io/p/auth-basic)             | Handles 'Basic' username / password authentication scheme                          |

## Building & Running

To build or run the project, use one of the following tasks:

| Task                          | Description                                                          |
| -------------------------------|---------------------------------------------------------------------- |
| `./gradlew test`              | Run the tests                                                        |
| `./gradlew build`             | Build everything                                                     |
| `buildFatJar`                 | Build an executable JAR of the server with all dependencies included |
| `buildImage`                  | Build the docker image to use with the fat JAR                       |
| `publishImageToLocalRegistry` | Publish the docker image locally                                     |
| `run`                         | Run the server                                                       |
| `runDocker`                   | Run using the local docker image                                     |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```

