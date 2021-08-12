import java.text.SimpleDateFormat
def idtag
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
                    //props = readProperties(file: 'server.properties')
                    
                    date = new Date()
                    def sdf = new SimpleDateFormat("yyyy-MM-dd_H:mm:ss")
                    idtag = sdf.format(date)                    
                    echo "idtag: ${idtag}"
                }
                
                //echo "props ${props['project']}"
            }
        }
        stage('Test') {
            steps {
                script {
                    //echo "props ${props.server}"
                    echo "idtag: ${idtag}"
                }
            }
        }
        
        stage('Grep') {
            steps {
                script {
                    echo "idtag: ${idtag}"
                    
                    def tcid = sh returnStdout: true, script: "grep ${params.testcase} samples.txt | awk -F\':\' \'{print \$1}\'"
                    echo "tcid ${name}"
                }
            }
        }
    
    }  
  
}
