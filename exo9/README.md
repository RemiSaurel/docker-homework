# 🧑‍💻 Exo 9

### 📖 Énoncé
> IX - Déploiement d'une application répartie avec
conteneurs utilitaires
A l'exercice précédent, on souhaite maintenant
déployer en plus :
> - SonarQube pour auditer le code construit
> - PhpMyAdmin pour gérer le cas échéant une BD
> 1) Etablir une orchestration avec Docker compose
pour automatiser la solution
> On prendra garde à une bonne isolation des
réseaux et volumes le cas échéant

### 📡 SonarQube

Go to this [link](http://localhost:9000/projects/create) and create a new project.

Run this command :
```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=exo9 \
  -Dsonar.projectName='exo9' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=YOUR_TOKEN \
  ```