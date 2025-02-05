**Program 1** :  **File Name: Main.java**

Implement below Program using Java OOPs concepts – Create below three classes and corresponding variables and methods Account (Base Class) – Include Interest as one variable and corresponding method to calculate Interest and add to the Account SavingsAccount (Derived Class) – Implement overridden methods of
Account Class CurrentAccount (Derived Class) – Implement overridden methods of Account Class

**Program 2** :  **File Name:  student_school_with_main.py**

Implement below program using Python. Create a Python class Student with two variables (Name, Grade and Age). Create a display() – To display Name, Grade and Age of an Object created
using Student Class. Create another class School which inherits from Student class and crate another method SchoolStudentDisplay() – which displays Name, Grade and Age. Which object created using School class.

**Program 3** :  **File Name:  VerifyLogoPresence.java**

Launch a below browser in Firefox and verify makemytrip logo is present or not on the Page. Implement using Selenium with Web Driver concept https://www.makemytrip.com/

**Program 4** :  **File Name:  MakeMyTripAutomation.java** 
Launch a below browser in Chrome and click on Flights and Select OneWay to enter FROM and TO locations. ((Find the WebElements (Flights, OneWay, FROM and To Webelements using XPaths)
https://www.makemytrip.com/  Note: While Implementing above Program, write generic functions to interact with the browser.

**Program 5** :  **File Name:  MakeMyTripTests.java**     **Note:TestNG XML Configuration File: testng.xml**

Implement 3 and 4 Programs using TestNG Concepts and write it using @Test annotation. To launch the browser (Repeated code) maintain it in @BeforeMethod annotation 
Generate TestNG HTML Reports and find the Test Results

**Program 6** :  **File Name:  pom.xml**
Steps Creation Maven Project and run all programs which are required the jars files
To create a Maven project and implement Java programs, follow these steps:
Step 1: Install Maven
   First, ensure you have Maven installed on your machine.
   After installation, verify by running the following command in your terminal:
   mvn -version
Step 2: Create a New Maven Project
         To create a new Maven project, open a terminal/command prompt and run the following command:
		 mvn archetype:generate -DgroupId=com.example -DartifactId=my-maven-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
Step 3: Project Structure
        my-maven-project
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── example
                    └── App.java
					
Step 4: Add Dependencies to pom.xml
Step 5: Write Programs
        You can now add your Java programs in the src/main/java/com/example directory.
Step 6: Compile and Run Your Project with Maven
        To compile your project, run the following Maven command:
		mvn compile
Step 7: Clean and Package Your Project
        To clean the project and remove previously compiled files, run:
		mvn clean
		To package your project into a JAR file, run:
		mvn package
		This will create a target directory with a my-maven-project-1.0-SNAPSHOT.jar file (name might vary depending on your artifactId and version).
Step 8: Run the JAR File
		You can run the packaged JAR file using the following command:
		java -jar target/my-maven-project-1.0-SNAPSHOT.jar
Step 9: Running Tests (Optional)
        If you have unit tests in the src/test/java directory, you can run them with:
		mvn test
This will run all test classes using JUnit or another testing framework specified in your dependencies.
We can  implement any Java programs in the src/main/java directory and manage your project with Maven.

**Program 7** :  **Path :   https://github.com/venkatS9927/SDET_ComprehensiveAssignment/tree/SDET_Programs**

Create a branch in GitHub and write all the programs in that branch and push the code into the same branch. Share the GitHub details to evaluate.

**Program 8** :  **Collection Postive and Negative Testcases.postman_collection.json**

Create a collection in Postman and create positive and negative cases for below APIs. And use Http methods to get valid responses.
GET: https://api.restful-api.dev/objects/5
POST: https://api.restful-api.dev/objects
PUT: https://api.restful-api.dev/objects/5
DELETE: https://api.restful-api.dev/objects/7

**Program 9** :  **JMeter_Assignment.jmx**

To create a Thread Group in JMeter and send requests to the URL you provided (https://www.makemytrip.com/), then use assertions to validate the responses, follow these steps:
1. Open JMeter and Create a Test Plan
Open Apache JMeter.
From the File menu, choose New to create a new Test Plan.
2. Add a Thread Group
A Thread Group defines the number of users to simulate and the frequency of requests sent to the server.
Right-click on the Test Plan in the Test Plan tree.
Select Add → Threads (Users) → Thread Group.
In the Thread Group settings:
Number of Threads (Users): Define the number of virtual users (e.g., 10).
Ramp-Up Period: How long it should take for JMeter to start all the threads (e.g., 5 seconds).
Loop Count: Number of times the test will run (e.g., 1 for a single run).
3. Add HTTP Request Sampler
This is where you define the actual request to be sent to the server (https://www.makemytrip.com/).
Right-click on Thread Group → Add → Sampler → HTTP Request.
In the HTTP Request settings:
Server Name or IP: www.makemytrip.com
Protocol: https
Path: Leave this blank if you want to hit the homepage.
You can also customize the request further if needed (e.g., adding parameters or headers).
4. Add Assertions
Assertions are used to validate the response. You can add several types of assertions, such as Response Assertion, to validate specific conditions.
Right-click on HTTP Request → Add → Assertions → Response Assertion.
In the Response Assertion settings:
Response Field to Test: Choose Text Response.
Pattern to Test: Enter the text you want to validate in the response. For example, you could use "MakeMyTrip" to check that the homepage loads properly.
You can also check if the response code is 200 OK, or any other condition that you want to validate.
5. Add Listeners to View Results
Listeners allow you to view and analyze the results of your test execution.
Right-click on Thread Group → Add → Listener → Choose one of the following:
View Results Tree – Provides detailed info on request/response and errors.
Summary Report – Provides overall test statistics like average response time.
Assertion Results – To view the results of the assertions.
For this task, add Assertion Results to check how the assertions performed.
6. Save the Test Plan
From the File menu, choose Save to save your test plan.
Give it a relevant name, like **MakeMyTripTestPlan.jmx**.
7. Run the Test
Click on the green Start button (play icon) in the toolbar to start the test.
Once the test runs, you can view the results in the listeners you’ve added.
8. Analyze the Results
The Assertion Results listener will show whether your assertions passed or failed.
If the assertions fail, check the request/response in the View Results Tree to troubleshoot.
Example JMeter Setup:
Test Plan
Thread Group
HTTP Request: https://www.makemytrip.com/
Response Assertion: Check for "MakeMyTrip" in the response.
Listeners: Assertion Results, View Results Tree.
This setup will simulate a basic load on the https://www.makemytrip.com/ website, validate the response for the presence of specific text, and show the assertion results in a listener.

**Program 10** :  **File Name:  test_w3schools_logo.py**

Launch a below browser in Chrome and verify W3Schools logo is present on the Page. Implement using Selenium with Web Driver concept (Implement it in Python and use pytest Fixtures)
https://www.w3schools.com/
