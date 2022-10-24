# Meerkat API

The following API is made for educational purposes only and does not provide any meaningful functionalities.

## Getting started

This project requires Java 17 or a newer version to be installed on the machine.
For developers, Amazon Coretta or Eclipse Termium are recommended JDKs.

For development purposes only, the relational H2 database is initialized in the local runtime.
On the shutdown, the database is torn down. There is no other option to set a persistent database.

### For Linux users (bash)

```bash
./gradlew build # Builds the application and runs tests.
./gradlew bootRun # Starts the application on a local network. 
```

### For Windows users

```bash
gradlew build # Builds the application and runs tests.
gradlew bootRun # Starts the application on a local network. 
```


A static resource can be accessed on `http://localhost:8080/index.html`

Overall time consumption is 4 hours. Most time was spent refreshing knowledge about vanilla JS and HTML.
No database dump is given, as test data is inserted for testing via `TestDataLoader` component.

Late findings: Multiselect for sectors is not supported.
