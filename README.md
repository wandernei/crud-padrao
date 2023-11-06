To run Java EE 8 and Hibernate 5 project:

1. **Install a Java EE 8 compatible application server** such as WildFly or GlassFish on your local machine.
   1. Download the application server from the official website.
   2. Follow the installation instructions for your operating system.

2. **Build your project using Maven:**
   1. Open a terminal or command prompt.
   2. Navigate to your project directory.
   3. Run the command `mvn clean install` to build the project.

3. **Deploy the WAR file to the application server:**
   1. Locate the generated WAR file in the `target` directory of your project.
   2. Copy the WAR file to the deployment directory of your application server.

4. **Start the application server:**
   1. Navigate to the bin directory of your application server.
   2. Run the command to start the application server.

5. **Access the application:**
   1. Open a web browser.
   2. Enter the URL of your application, typically `http://localhost:8080/crud-padrao`.

6. **Test the REST endpoints:**
   1. Use an API testing tool like Postman or cURL to send HTTP requests to the REST endpoints.
   2. Make sure to test the `GET`, `POST`, `PUT`, and `DELETE` methods for your user CRUD operations.

7. **Verify the database operations:**
   1. Check the database connected to your application server.
   2. Verify that the CRUD operations performed through the REST endpoints have the desired effects on the database.

8. **Check the server logs for any errors or warnings:**
   1. Navigate to the logs directory of your application server.
   2. Open the log file to check for any error messages related to your application.

9. **Ensure that the necessary libraries and dependencies are available and properly configured:**
   1. Review the `pom.xml` file to confirm that all required libraries are included.
   2. Check the deployment descriptors and configuration files to ensure that they are properly configured for your application.

10. **Perform thorough testing of your application's functionality:**
    1. Test all the CRUD operations thoroughly to ensure that they are working as expected.
    2. Check for any unexpected behavior and handle any issues that arise during testing.

11. **Monitor the performance of your application:**
    1. Use monitoring tools to track the performance metrics of your application.
    2. Monitor factors such as response time, resource usage, and any bottlenecks in your application's performance.

Make sure to follow best practices for deploying Java EE applications and handle any issues that arise during the testing process.