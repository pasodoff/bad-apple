# bad-apple

Example Java REST application to test hard coded passwords and code vulnerability scanning

## Vulnerabilities

| Path                                                                     |  Line |  Comment                                                      | 
|--------------------------------------------------------------------------|-------|---------------------------------------------------------------| 
| ./src/main/java/com/pasodoff/hcp/badapple/Application.java               | 54    |  HCP Comment within security framework constructor arguements | 
| ./src/main/java/com/pasodoff/hcp/badapple/Application.java               | 56    |  Hard coded admin username and password                       | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 13    |  Not Finalizing Class                                         | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 20    |  Not Restricting Access to variables                          | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 23    |  Password in comments                                         | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 43    |  Variable assignment of static default password               | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 49    |  Hard coded default password                                  | 
| ./src/main/java/com/pasodoff/hcp/badapple/model/User.java                | 51    |  Password left in comment                                     | 
| ./src/main/java/com/pasodoff/hcp/badapple/resource/NslookupResource.java | 29    |  Insecure cookie HttpOnly flag not set                        | 
| ./src/main/java/com/pasodoff/hcp/badapple/resource/UserResource.java     | 24    |  XSS circumvent Same Origin Policy                            | 
| ./src/main/java/com/pasodoff/hcp/badapple/service/CmdService.java        | 24    |  Unsanitized commandline input                                | 
| ./src/main/java/com/pasodoff/hcp/badapple/util/CORSResponseFilter.java   | 18    |  XSS circumvent Same Origin Policy                            | 
| ./src/main/java/com/pasodoff/hcp/badapple/util/Encryption.java           | 15    |  Hard coded encryption key                                    | 
| ./src/main/java/com/pasodoff/hcp/badapple/util/Encryption.java           | 17    |  Hard coded initialization vector                             | 
| ./src/main/resources/application-local.properties                        | 13    |  SSL Keystore exposed credentials                             | 
| ./src/main/resources/application-prod.properties                         | 5     |  Plaintext Password in configuration                          | 
| ./src/main/resources/application-prod.properties                         | 15    |  Base64 encoded password                                      | 
| ./src/main/resources/application-prod.properties                         | 18    |  SSL Keystore exposed credentials                             | 
| ./src/main/resources/application-uat.properties                          | 5     |  Plaintext Password in configuration                          | 
| ./src/main/resources/application-uat.properties                          | 14    |  Base64 encoded password                                      | 
| ./src/main/resources/application-uat.properties                          | 18    |  SSL Keystore exposed credentials                             | 
| ./src/main/resources/application.properties                              | 4     |  Plaintext Password in configuration                          | 
| ./src/main/resources/application.properties                              | 14    |  Base64 encoded password                                      | 
| ./src/main/resources/application.properties                              | 17    |  SSL Keystore exposed credentials                             | 
| ./src/main/resources/com/pasodoff/hcp/badapple/mapper/UserMapper.xml     | 23    |  SQL injection vulnerability                              | 
| ./src/main/resources/import.sql                                          | 4     |  Hard coded user creation in SQL script                       | 


### TODO


#### HCP 

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
 
#### OWASP

2017 Top Ten OWASP vulnerabilities and bad-apple coverage:

  - A1 ~~Injection~~ : SQL, commandline injection with no sanitized input
  - A2 Broken Authentication and Session Management: 
  - A3 ~~Cross-Site Scripting (XSS)~~: CORS use of * for domain
  - A4 Broken Access Control (As it was in 2004)
  - A5 ~~Security Misconfiguration~~: Static admin username/password
  - A6 ~~Sensitive Data Exposure~~: User passwords exposed by application
  - A7 Insufficient Attack Protection (NEW)
  - A8 Cross-Site Request Forgery (CSRF)
  - A9 Using Components with Known Vulnerabilities
  - A10 Underprotected APIs (NEW)