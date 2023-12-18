# 🧑‍💻 Exo 9

### SonarQube

Go to this [link](http://localhost:9000/projects/create) and create a new project.

Run this command :
```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=exo9 \
  -Dsonar.projectName='exo9' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=YOUR_TOKEN \
  ```