# Performance Testing Scripts

This project demonstrates basic performance testing using Gatling.

## Setup

1. **Add dependencies** to your `pom.xml` if using Maven:

    ```xml
    <dependencies>
        <dependency>
            <groupId>io.gatling</groupId>
            <artifactId>gatling-core</artifactId>
            <version>3.8.3</version>
        </dependency>
        <dependency>
            <groupId>io.gatling</groupId>
            <artifactId>gatling-http</artifactId>
            <version>3.8.3</version>
        </dependency>
    </dependencies>
    ```

2. **Run the performance test** using Maven:

    ```bash
    mvn gatling:test
    ```

## Usage

1. Clone the repository and navigate to the project directory.
2. Ensure you have Maven installed.
3. Execute the performance test using:

    ```bash
    mvn gatling:test
    ```

## License

This project is licensed under the MIT License.
