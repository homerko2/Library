# Library

This code provides Entities and REST Endpoints for the following assignment:

- A **book** has a **title**, a **genre**, a **price**, and exactly one **author**. (The library has only one copy of
  each book.)
- An **author** has a **name** and a **date of birth** and can have multiple books.
- A **member** has a **unique username**, an **email**, an **address**, and a **phone number**.
- Every member can loan up to 5 different books at a time. The loan has a lend and return date (consider only whole
  days, no timestamps).

## Appendix

This project uses **CrudRepository** Interface to **generate** the usual **CRUD Endpoints** and reduce code. If **more**
are needed,
they can be created by using a **Service** and a **Controller**.

## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`DATABASE_PASS`

`EXTERNAL_PORT`

`INTERNAL_PORT`

`DATABASE_USER`

`DATABASE_NAME`

`DATABASE_URL`

As well as these environment variables while editing your **Run Configuration**.

`DATABASE_URL`

`DATABASE_PASS`

`DATABASE_USER`

## Deployment

After introducing environment variables, you need to run:

```bash
  ./gradlew clean build   
````

This will create a build which the Docker will have to use to deploy.
Then use:

```bash
  docker-compose up
````

This will start your Services together with your Application.

## FYI

It seems like the automatic generation of API Documentation doesn't work with the generic CrudRepository Interface.
Introducing JpaRepository and implementing CRUD Endpoints
in Controllers should fix that.

There are ways to **improve** this application's **robustness** by using **JUnit** testing and **Error-Catching**.

As my research suggests, this Docker-Container could run in a Kubernetes environment with some additional configuration.

## Used Plugins or Tools

**JPA Buddy** to ease the work with Entities, Repositories etc.

**OpenApi Editor** to ease the API-Documentation process. (Has not been used due to generic Interface, which was
mentioned earlier).

**AI** was used partially for commit messages.

## Authors

- [@nikolaev](https://github.com/homerko2)

