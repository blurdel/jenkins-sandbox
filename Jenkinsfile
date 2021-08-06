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
                
                echo "props ${props['project']}"
            }
        }
        stage('Test') {
            steps {
                script {
                    echo "props ${props.server}"
                }
            }
        }
        stage('Grep') {
            steps {
                def name = sh 'grep "GoPath" samples.txt | awk '{print $1}''
                echo "name ${name}"

                script {
                    echo "props ${props.server}"
                }
            }
        }
    
    }  
  
}
