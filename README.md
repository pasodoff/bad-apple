# bad-apple

Example Java REST application to test hard coded passwords and code vulnerability scanning

## Vulnerabilities

| Location                                                       | Line number |Description                                                   | 
|----------------------------------------------------------------|-------------|---------------------------------------------------------------| 
| ./src/main/java/com/pasodoff/hcp/badapple/Application.java     | 54          | HCP Comment within security framework constructor arguements | 
| ./src/main/java/com/pasodoff/hcp/badapple/Application.java     | 56          | Hard coded admin username and password                       | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java      | 44          | Hard coded default password                                  | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java      | 46          | Password left in comment                                     | 
| ./src/main/java/com/pasodoff/hcp/badapple/util/Encryption.java | 15          | Hard coded encryption key                                    | 
| ./src/main/java/com/pasodoff/hcp/badapple/util/Encryption.java | 17          | Hard coded initialization vector                             | 
| ./src/main/resources/application-local.properties              | 13          |SSL Keystore exposed credentials                             | 
| ./src/main/resources/application-prod.properties               | 5           |Plaintext Password in configuration                          | 
| ./src/main/resources/application-prod.properties               | 15          |Base64 encoded password                                      | 
| ./src/main/resources/application-prod.properties               | 18          |SSL Keystore exposed credentials                             | 
| ./src/main/resources/application-uat.properties                | 5           |Plaintext Password in configuration                          | 
| ./src/main/resources/application-uat.properties                | 14          |Base64 encoded password                                      | 
| ./src/main/resources/application-uat.properties                | 18          |SSL Keystore exposed credentials                             | 
| ./src/main/resources/application.properties                    | 4           |Plaintext Password in configuration                          | 
| ./src/main/resources/application.properties                    | 14          |Base64 encoded password                                      | 
| ./src/main/resources/application.properties                    | 17          |SSL Keystore exposed credentials                             | 



### TODO

 - ~~Spring boot REST application~~
 - Spring Security
   - ~~Hardcoded admin username and password~~
   - ~~Commented out passwords~~
 - Enable SSL
   - ~~Hard coded password for keystore~~
   - ~~Keystore `p12` file with private, public keys~~
 - Mybatis mappers
   - ~~user mapper~~
   - lack of sql injection protection
 - Plain text password within a config/properties file
     - ~~Used to connect to in memory database~~
     - ~~Used to connect to REST endpoint~~
     - ~~base64 encoded~~
 - Jersey Rest client
   - ~~Hardcoded credentials~~
   - ~~Credentials from configuration~~
 - SQL
   - ~~H2 database create a new user assign password in ddl~~
   - ~~Create table and insert username password~~
   - Create oracle db link with hard coded credentials
 - Encryption class
   - ~~Hard coded IV and Keys~~
- Script
   - call mysql database connection and pass a static plain-text password
   - call mysql database connection with variable (assignment above with plain-text password)
 
