# Banking-System
 ## Features:
 - Authenticated login system
 - GUI with Java Swing (Will upgrade to `JavaFx` later)
 - Modular design, with different segments handled by different panels and Canvases
 - All standard banking facilities types supported (Loan system, Online Deposits, Balance Checking, Loan details and new Policies/Offers)
 - MySQL integration with JDBC Driver
 - Triggers used in MySQL when necessary to reduce load on the Application program

## Todo:
- Make design even more modular so that it can be changed to a template library
- Encrypt passwords/implement OTP system for login
- Use `PreparedStatements` to prevent SQL Injection attacks.

## Schema:

|Table|Attributes|Role
|-------|---------|-----|
userinfo|username, password, email, contact, name | Stores details of users
balance|balance, accountno|Stores the balance of each account
loans|accountno, loanamount|Spacifically stores loans
policies| accountno, policyid|Stores what policies are active for an account

## Working:

On the startup of the application, the user is greeted with the bank policies and the **login/register** screen
On successfully logging in, he/she will be greeted with another screen with the various options, all of which are parts of the above schema. Successfully navigating between all parts of the application has been implemented.
MyDrawPanel.java and Details.java are primarily helper classes.

More documentation coming soon!

<!---## Images:

![Screenshot (4)](https://user-images.githubusercontent.com/25523604/64916998-645ffa80-d7a8-11e9-9817-4366e31b79ed.png)
![Screenshot (8)](https://user-images.githubusercontent.com/25523604/64916999-645ffa80-d7a8-11e9-80c8-07d1de5aea41.png)
![Screenshot (9)](https://user-images.githubusercontent.com/25523604/64917000-645ffa80-d7a8-11e9-9c3e-6f58577db958.png)--->
