pipeline {
  agent any
  
  tools {
  maven "3.6.0"
  }

  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sq1') { 
          sh 'mvn sonar:sonar'
        }
      }
    }
  }
}