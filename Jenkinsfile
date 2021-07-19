def gv

pipeline {
    agent any
  
    stages {
        
        stage('Init') {
            steps {
                gv = load "functions.groovy"
                
                echo """ppp ${props['server']}"""
            }
        }
        stage('Test') {
            echo gv.getProperty("server")
        }
    
    }  
  
}
