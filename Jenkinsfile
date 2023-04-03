pipeline {
     agent any
  stages {
  
  stage('Build'){
  sh "mvn clean install"
  }
  
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sq1') { 
          sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131:sonar'
        }
      }
    }
  }
}
