#  MATRIX API - SPRING BOOT

## REQUIREMENTS:
This app use the following dependencies:

- Spring Boot DevTools
- Spring Web

## SET UP
Fisrt you have to clone the project with:
```
git clone https://github.com/d-antonio-romeroa/hai-spring-boot-api.git
```

Then, on project's root folder, pls execute the next command to get working the api on Docker container. Pls be noted that you need to have installed [Docker](https://www.docker.com/products/docker-desktop) and must be active.
```
docker-compose up --build -d
```

If you're not using Docker, project's the following commands must be executed on the terminal from project's root path (The first one builds the project to a jar file, and then is executed trough maven).

```
nvmw spring-boot:build-image

nvmw spring-boot:run
```

## ENDPOINTS

This project has th following endpoints:
- http://127.0.0.1:8080/api/v1/matrix
Sending a Post http request to this url you can get his sum on the response depending on request body parameters.
Body must have the structure:

```    
{    
    "matrix":
        {
            "R":4,
            "C":3,
            "Z":2
        },
    "x":1,
    "y":2
}
```
## TESTING

This project can be tested with attached Postman collections on this [link](https://github.com/d-antonio-romeroa/hai-spring-boot-api/blob/main/tests/APRING%20BOOT%20MATRIX%20API.postman_collection.json).

These tests doesn't require a body to be sent on the request, just needs a Get request call to both url's above.
