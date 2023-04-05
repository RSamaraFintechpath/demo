pipeline {
  agent any
  
  tools {
  maven "3.6.0"
  }

  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sq1') { 
          sh 'mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131:sonar'
        }
      }
    }
    stage ('Quality Gate'){
       steps {
       timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true, credentialsId: 'SonarQube-Token'
              }
       }
    }
  }
}