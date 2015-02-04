spring-boot-jpa-thymeleaf-tutorial
==================================

This is a tutorial of easy Java web development.

Applied technologies
--------------------

* Java SE 8
* Apache Maven 3+ (build tool)
* Spring Boot 1.2.1.RELEASE (web framework)
* Spring Data JPA (ORM framework)
* HSQLDB (in-memory database engine)
* Thymeleaf (template engine)
* Git (version control)

Steps
-----

### Create a Web Application
1. Create an new, empty directory
2. Initialize a local Git repository
3. Set .gitignore to ignore target directory and IDE config files
4. Create pom.xml
5. Set the project, parent, java version, spring boot maven plugin and the required dependencies
6. Create new package by groupId and the Application configuration class inside
7. Annotate the Application class to enable autoconfig, component scan and create the main() method to be able to start the application
8. Run the application with the spring-boot:run maven goal
9. Add you changes to git and commit

### Create HTML page
10. Create HTML page for a bulletin board, name it bboard.html
11. Link some nice predefined CSS, for exaple Bootstrap to the page
12. Create a form with name and message input fields and a submit button on the bulletin board page
13. Make some space for the posts on the page and add some static data for preview
13. View the the html file in a browser
14. Add the xhtml namespace as default and th: for thymeleaf to the xml root html tag
15. Ensure that the whole html file fits for the xhtml standard (all tags are closed, attributes are in the right format)
16. Commit your work


