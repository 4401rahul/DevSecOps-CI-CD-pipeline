pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "rahuljoshi4/devsecops-rj:v1"
    }

    stages {

        stage('Clone Code') {
            steps {
                git branch: 'main', url: 'https://github.com/4401rahul/DevSecOps-CI-CD-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Scan') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: false
                }
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Trivy Scan') {
            steps {
                sh 'trivy image --exit-code 1 --severity CRITICAL $DOCKER_IMAGE'
            }
        }

        stage('Push to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'docker-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh '''
                    echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                    docker push $DOCKER_IMAGE
                    '''
                }
            }
        }
    }
}
