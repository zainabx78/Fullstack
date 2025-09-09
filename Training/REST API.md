# REST API

- A mechanism which allows 2 computer programs to communicate with each other. 

## REST
- Representational State Transfer.
- REST is an architectural style. 

**Popular because:**
- Call from JavaScript in web pages. 
- Call from mobile apps to get data. 
- General integration of applications --> 
  - wide support for HTTP in programming languages. 
  - JSON is a text based transfer format --> easy to understand. 
  - Wide support for JSON in programming languages. 
  - Wide support for development of REST API's in many languages. 

## RESTful 
- Means compiles with the REST architectural style. 


## Architectural style of REST

- Client-server structure. 
- Statelessness --> there's no client specific state information stored on server side. All information needed for request is included in the request itself. 
- Cacheability 
- Layered system --> clear separation between different elements. 
- Uniform interface

## Typical REST technologies
- Message exchange --> HTTP. 
- Describing the location, actions and target --> URIs, HTTP methods(GET, PUT, POST).
- Representing the data --> JSON, XML or HTML (Less frequent).
- Describing the service --> Swagger/OpenAPI

## CRUD

- Describes how we often access data. 
- C = Create --> Insert a new record into the data store. 
- R = Read --> Read an existing record or records from the data store.
- U = Update --> Modify an ecisting record in the data store.
- D = Delete --> Remove an existing reocrd from the data store. 

--> REST API is often just CRUD using HTTP/JSON. 