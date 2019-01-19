# spring-boot-bootstrap
Example of a MVC application with Spring Boot and Bootstrap, deployed at Heroku.

# Playing at Heroku
After idle for a while, Heroku falls asleep and id counter goes back to 1.
- https://infinite-waters-58424.herokuapp.com/greeting

# Heroku tips
heroku create

heroku git:remote -a your_app_name_just_created

heroku buildpacks:set heroku/java

git push heroku master

heroku open

heroku logs
