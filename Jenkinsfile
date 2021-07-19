def gv

pipeline {
    agent any
  
    stages {
        
        stage('Init') {
            steps {
                gv = load "functions.groovy"
            }
        }
        stage('Test') {
            echo gv.getProperty("server")
        }
    
    }  
  
}
