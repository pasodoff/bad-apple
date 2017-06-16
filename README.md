# bad-apple

Example Java REST application to test hard coded passwords and code vulnerability scanning

## Vulnerabilities
 
Credentials

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
 - Jersy Rest client
   - ~~Hardcoded credentials~~
   - ~~Credentials from configuration~~
 - SQL
   - ~~H2 database create a new user assign password in ddl~~
   - ~~Create table and insert username password~~
   - Create oracle db link with hard coded credentials
 - Encryption class
   - ~~Hard coded IV and Keys~~
- Script
   - call mysql database connection and pass a static plaintext password
   - call mysql database connection with variable (assignment above with plaintext password)
 
