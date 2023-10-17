pipeline {
    agent any
    tools{
        maven 'maven-3.9.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ramanujds/jenkins-cicd']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t ram1uj/emp-app .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                   sh 'docker login -u ram1uj -p ${dockerhubpwd}'

}
                   sh 'docker push ram1uj/emp-app'
                }
            }
        }
       
    }
}