def gv

pipeline {
    agent any
  
    stages {
        
        stage('Init') {
            steps {
                script {
                    gv = load "functions.groovy"
                    def props = readProperties(file: 'server.properties')
                }
                
                // echo """ppp ${props['server']}"""
            }
        }
        stage('Test') {
            steps {
                script {
                    // echo gv.getProperty("server")
                    echo "asdf ${props.server}"
                }
            }
        }
    
    }  
  
}
