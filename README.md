# Mosaiq Store PoC for sharing session across services using a centralized repository .

- For the sample to work, Redis 2.8+ must be installed on localhost and run the redis-server on the default port (6379).
- Additionally redis-cli can also be started to run Redis commands.
- Run the docker-compose.yml and export the realm configuration in keycloak.


## What the POC does:
- This POC uses Spring Session to transparently leverage Redis to back the application’s HttpSession.
- Once the application is up and running and the user is logged in, a session is created and stored in redis-server. If we check values
 in Redis-cli(using "keys *" command), we will get our session id.

## NOTE: 
  - Now we can check values in Redis-cli(using "keys *" command) and we can see that a single sesion ID per user is created for keycloak-Session for all 
  applications.

## What has been not achieved:
  - Let's say we have two application authenticated via keycloak and sharing the same realm, we run both applications on different browsers.
  while creating the POC task we also targeted to find a way so that once a user is logged into any of the application, he should not be asked to
  login again into the other application.