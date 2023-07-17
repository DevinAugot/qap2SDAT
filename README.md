# Aviation REST API
This project is a simple REST API for an aviation-related data model. It allows you to manage cities, passengers, airports, and aircraft. 

# Note: This program works in correlation with MySqlWorkbench database which I have called qap2db

# How to Run the Project in Docker

Follow these steps to run the project in Docker:

Install Docker on your machine if you haven't already.

Clone this repository to your local machine.

Open a terminal and navigate to the project directory.

Build the Docker image:
docker build -t qap2sdat .

Run the Docker container:
docker run -p 8080:8080 qap2sdat

OR alternative way to run through docker desktop is command : docker-compose up


The API should now be accessible at http://localhost:8080.

# Testing the API

You can use tools like cURL, Postman, or any other HTTP client to test the API endpoints.

Create a City:

Endpoint: POST http://localhost:8080/cities

Sample JSON Payload:

{
  "name": "New York City"
}

Create a Passenger:

Endpoint: POST http://localhost:8080/passengers

Sample JSON Payload:

{
  "name": "John Doe"
}

Create an Airport:

Endpoint: POST http://localhost:8080/airports

Sample JSON Payload:

{
   "name": "Gander International",
   "code": "YYZ"
}

Create an Aircraft:

Endpoint: POST http://localhost:8080/aircrafts
Sample JSON Payload:

{
  "tailNumber": "ABC123",
  "type": "Aircraft Type 1",
  "brand": "Aircraft Brand 1",
  "model": "Aircraft Model 1",
}

Please replace {cityId} with the actual ID of the city to which the passenger or airport belongs.

# Example of key reltionship information which can be achieved by this program 

Airports can only be in one city:

URL: GET http://localhost:8080/airports/{airportId}/city

Please replace {cityId}, {passengerId}, and {aircraftId} with the actual IDs of the cities, passengers, and aircraft in your system.
