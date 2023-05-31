# Project Name: ProjectAI

## Application Description

The project is a Spring Boot application that provides functionality to retrieve and process country data from the
public REST Countries API. The application aims to facilitate easy access to country information and offers various
features for filtering, sorting, and pagination of the retrieved data.

The application leverages the REST Countries API (https://restcountries.com/v3.1/all) to fetch comprehensive information
about countries worldwide. It provides endpoints that allow users to query and manipulate the data based on specific
criteria.

With the implemented endpoints, users can retrieve all countries or apply filters to search for countries based on name
and population. Additionally, the application offers sorting capabilities to order the countries by name in ascending or
descending order. Users can also limit the number of retrieved records to streamline the data according to their needs.

By combining these functionalities, users can perform powerful queries and obtain relevant country information. The
project's design aims to provide a user-friendly and efficient experience for exploring and analyzing country data.

The project utilizes Spring Boot's framework, allowing for easy development, testing, and deployment of the application.
It follows RESTful principles, enabling standard communication between the client and server. The application's codebase
adheres to best practices and maintains a modular structure for scalability and maintainability.

## How to Run the Application Locally

To run the Spring Boot application locally, follow these steps:

1. Clone the repository to your local machine.
2. Ensure that you have Java Development Kit (JDK) installed. The recommended version is JDK 8 or higher.
3. Open the project in your preferred Integrated Development Environment (IDE).
4. Build the project and resolve any dependencies if prompted.
5. Run the application by executing the main class or using the appropriate IDE command.
6. The application will start on the configured port (usually `http://localhost:8080`).

## Example URLs

Here are some example URLs to demonstrate the usage of the endpoints:

1. Retrieve all countries:
    - `GET http://localhost:8080/api/countries`

2. Filter countries by name (e.g., find countries with "st" in their name):
    - `GET http://localhost:8080/api/countries?name=[name]`

3. Filter countries by population (e.g., find countries with a population less than 10 million):
    - `GET http://localhost:8080/api/countries?population=[population]`

4. Sort countries by name in ascending order:
    - `GET http://localhost:8080/api/countries?sortOrder=ascend`

5. Sort countries by name in descending order:
    - `GET http://localhost:8080/api/countries?sortOrder=descend`

6. Limit the number of retrieved countries:
    - `GET http://localhost:8080/api/countries?recordsSize=[limit]`

7. Filter countries by name and sort in descending order:
    - `GET http://localhost:8080/api/countries?name=sp&sortOrder=descend`

8. Filter countries by population and limit to 5 records:
    - `GET http://localhost:8080/api/countries?population=5&recordsSize=5`

9. Filter countries by name, sort in ascending order, and limit to 20 records:
    - `GET http://localhost:8080/api/countries?name=un&sortOrder=ascend&recordsSize=20`

10. Filter countries by population, sort in descending order, and limit to 10 records:
    - `GET http://localhost:8080/api/countries?population=50&sortOrder=descend&recordsSize=10`

Please note that you can replace `[name]`, `[population]`, `[ascend/descend]`, and `[limit]` with the appropriate values
based on your requirements.

Note: Make sure to replace http://localhost:8080 with the appropriate base URL for your application.

Feel free to explore these URLs and adjust them as needed according to your application's endpoint structure.