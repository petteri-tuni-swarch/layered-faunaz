# Layered SW Architecture 2021 - Case Fauna LR

The project follows demonstrates the layered architecture.
It is a monolith with all the required functionality as one deployable node.
However, the functionalities have been separated to packages.

## Versions

Versions or evolution of the example can be reviewed by checking out the TAGS:

````
git tag -n
1.0-Initial-REST-component-only 
2.0-Service-layer-added 
3.0-Ducks-data-layer-added 

````

## CLI - Building and running the code

````
git clone <git repo url>
cd faunalr
mvn clean
mvn install
cd faunapi
EITHER
java -jar target/<jar>
OR
mvn spring-boot:run
````

## Configuration
Configuration at file `application.yml`.   
Port to listen to.

## Rest calls 

Test API:

````curl http://localhost:8471/sample-api/1.0/info````  

Fetch single ... something:

````curl http://localhost:8471/sample-api/1.0/id/7````  

