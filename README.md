# Spring Cloud Stream Kafka Application

This is a sample application for Spring Cloud Stream and Kafka.

1. Provision Azure Event Hub with Kafka API enabled.
1. Fill the Kafka namespace and auth information in the `application.yaml`.
1. Start this Spring Boot application.
1. GET `http://localhost:8080/send?message=Hello` to manually send a message to Kafka.
1. You will see the log like `Received message: Hello`.

## Connection String Auth

```yaml
spring:
  cloud:
    azure:
      eventhubs:
        connection-string: <Connection_String>
```

## Managed Identity Auth

```yaml
spring:
  cloud:
    azure:
      eventhubs:
        credential:
          managed-identity-enabled: true
          client-id: <Client_Id>
```
