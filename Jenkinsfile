def gv

pipeline {
    agent any
  
    stages {
        
        stage('Init') {
            steps {
                script {
                    gv = load "functions.groovy"
                }
                
                echo """ppp ${props['server']}"""
            }
        }
        stage('Test') {
            steps {
                script {
                    echo gv.getProperty("server")
                }
            }
        }
    
    }  
  
}
