#  MATRIX API - SPRING BOOT

## REQUIREMENTS:
This app use the following dependencies:

- Spring Boot DevTools
- Spring Web

## SET UP
On project's root folder, pls execute the next command to get working the api on Docker container
```
docker-compose up --build -d
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

