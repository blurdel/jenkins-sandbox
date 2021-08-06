def gv

pipeline {
    agent any
    
    options {
        timestamps() // Add timestamps to logging
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }
    
    parameters {
         string(name: 'testcase', defaultValue: 'GoPath', description: 'Test Manager testcase_id')
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
                script {
                    def proc = 'cat samples.txt'.execute()
                    println proc.text
                    
                    echo "props ${props.server}"
                }
            }
        }
    
    }  
  
}
