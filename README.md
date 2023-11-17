# spring-apache-shiro-wizards
Wizard api for magicians only

-------------INFO--------------
1. Written by Martin Papalakov

-------------Setup-------------
1. Open MySQL and get/set up your username and password.

2. Change the username and password of spring.database in the application.properties to the ones from your MySQL database.

3. Run the project. After it runs successfully, close it.

4. Open application.properties and assign: spring.jpa.hibernate.ddl-auto=update

5. Fill info in the tables. NOTE: permission name column values should match permisions used in the Anotation Permissions (user:all, user:admin etc.)

-------------NOTE--------------
Before running the application ensure that spring.jpa.hibernate.ddl-auto is set to update.
