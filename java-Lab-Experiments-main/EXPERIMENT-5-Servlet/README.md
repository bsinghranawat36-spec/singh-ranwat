EXPERIMENT 5: JAVA SERVLET

Aim

To develop and execute a Java Servlet using Apache Tomcat Server.

Software Requirements

- Java JDK 26
- Apache Maven 3.9.16
- Apache Tomcat 11.0.26
- Visual Studio Code

Description

Java Servlet is a server-side Java technology used to handle client requests and generate dynamic web responses.

In this experiment, a HelloServlet program was created using the Jakarta Servlet API and deployed on Apache Tomcat Server.

Program Name

HelloServlet.java

Procedure

1. Created a Maven web application project.
2. Added the Jakarta Servlet API dependency in pom.xml.
3. Created HelloServlet.java inside src/main/java.
4. Configured the web application using WEB-INF/web.xml.
5. Executed the command "mvn clean package".
6. Generated the WAR file successfully.
7. Copied the WAR file into the Tomcat webapps folder.
8. Tested the servlet using a web browser.

URL

http://localhost:8080/experiment5-servlet-1.0/hello

Output

Hello! Servlet is Working.

Welcome to Java Web Programming.

Result

The Java Servlet application was successfully built and executed using Apache Tomcat 11.0.26.