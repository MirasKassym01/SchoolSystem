If you don`t have gradle or maven on your computer you can use gradlew to be able to run the project

gradle wrapper (run Gradle wrapper)

After this operation you can run every Gradle command of this guide with 

./gradlew xxxxxtask (Unix, Linux)
gradlew.bat XXXtask  (Windows)

Example

./gradlew clean compile (Unix, Linux)
gradlew.bat clean compile (Windows)

You can build this project with Maven or Gradle. Here you have several snippets about how to use them:

mvn clean install (install jar to your local m2 )
mvn spring-boot:run (run web app modules)
gradle buid (build modules)
gradle bootRun (run web app modules)

ждем когда запуститься сервер. После запуска сервера, заходим в браузер по адресу: http://localhost:3030/SchoolSystem_war_exploded
Заходим на Login
Водим на логин a@admin
На пароль admin
Заходим в Add student.
Водим 
name,surname,patronymic,grade,phone number email, password. Нажимаем на конпку submit. Открываеся Student list. Внутри водим id студента который видим на верху, нажимаем удалить.  
