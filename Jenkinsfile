def gv

pipeline {
    agent any
    
    options {
        timestamps() // Add timestamps to logging
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }
  
    stages {
        
        stage('Init') {
            steps {
                script {
                    // gv = load "functions.groovy"
                    props = readProperties(file: 'server.properties')
                }
                
                echo "props ${props['server']}"
            }
        }
        stage('Test') {
            steps {
                script {
                    echo "props ${props.server}"
                }
            }
        }
    
    }  
  
}
