pipeline {
  agent any
  tools {
  maven 'Maven 3.3.9'
  jdk 'jdk8'
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sq1') { 
          sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131:sonar'
        }
      }
    }
  }
}