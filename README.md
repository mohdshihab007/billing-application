Problem statement:
On a retail website, the following discounts apply:
1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

I have used Maven to build the project. To import the project in any IDE, load the pom.xml and import dependecies. 
To run via commandline , execute "mvn clean install" 
TO run the test cases alone, execute "mvn test"

Code coverage has been done in Jacoco. coverage reports will be available in /target/site/jacoco/index.html

Code uses Java 1.8 and JUnit 4.2 
