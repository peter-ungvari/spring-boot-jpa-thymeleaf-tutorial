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

Steps
-----

### Create a Web Application
1. Create an new, empty directory
2. Initialize a local Git repository
3. Set .gitignore to ignore target directory and IDE config files
4. Create pom.xml
5. Set the project, parent, java version, spring boot maven plugin and the required dependencies
6. Create new package by groupId and the Application configuration class inside
7. Annotate the Application class to enable autoconfig, component scan and create the `main()` method to be able to start the application
8. Run the application with the `spring-boot:run` maven goal

### Create HTML page
10. Create HTML page for a bulletin board, `src/main/resources/templates/bboard.html`
11. Link some nice predefined CSS, for exaple Bootstrap to the page
12. Create a form with name and message input fields and a submit button on the bulletin board page
13. Make some space for the posts on the page and add some static data for preview
13. View the the html file in a browser
14. Add the xhtml namespace as default and th: for thymeleaf to the xml root html tag
15. Ensure that the whole html file fits for the xhtml standard (all tags are closed, attributes are in the right format)

### Create Controller
17. Create a Spring MVC Controller class as `BulletinBoardController.java`
18. Create a `page()` method which returns the bulletin board view `"bboard"`, and use the `@RequestMapping` on it to map it as default page.
19. (Re)start the application and check if http://localhost:8080 really returns the bulletin board page in your browser
20. Disable caching Thymeleaf templates by creating `src/main/resources/config/application.properties` with content `spring.thymeleaf.cache=false`
21. Make available some server-side data for the page by creating a `@ModelAttribute public List<Post> loadPosts()` method in the controller. The return value of the method can be hard-coded for now. `Post` should be a DTO class, with `name` and `message` properties.
22. Create another controller method which will be mapped to handle the post requests of posting posts :) This method should only log the posted name and message for now.

### Use Thymeleaf
23. Modify the action of the form, if necessary, to match the @RequestMapping of the request processor controller method.
24. Modify the input names of the form to match with the properties of the `Post` DTO.
25. Use the th:each and th:unless attributes to show the list of posts dynamically.
  * Note1: The variable name for the list of post is generated the from the return type of the `loadPosts()` method as `postList` which can be overriden by specifying a string parameter of the `@ModelAttribute` annotation.
  * Note2: `${#lists.isEmpty(<variable>)}` comes handy