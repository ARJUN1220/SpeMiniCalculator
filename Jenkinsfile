pipeline{
    agent any
    tools{
        maven 'maven'
    }
    environment {
            DOCKER_IMAGE_NAME = 'spe_calculator'
            GITHUB_REPO_URL = 'https://github.com/ARJUN1220/DemoCaclculator.git'
    }

        stages {
            stage('Checkout') {
                steps {
                    script {
                        // Checkout the code from the GitHub repository
                        git branch: 'main', url: "${GITHUB_REPO_URL}"
                    }
                }
            }

             stage('Build maven'){
                steps{
                    sh 'mvn clean install'
                }
             }

             stage('Build Docker Image') {
                steps {
                    script {
                        // Build Docker image
                        docker.build("${DOCKER_IMAGE_NAME}", '.')
                    }
                }
             }

             stage('Test'){
                steps{
                    sh 'mvn test'
                }
             }

        }
}