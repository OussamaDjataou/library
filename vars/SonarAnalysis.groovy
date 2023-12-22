def call() {
    withSonarQubeEnv('sonar') {
        sh " $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Bank -Dsonar.projectKey=Bank "
    }    
    
}