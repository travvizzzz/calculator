pipeline {
    agent any

    tools {
        // Make sure Maven is installed on your Jenkins node
        maven 'maven3.9'
        jdk 'jdk21'
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull code from your repository
                git branch: 'main', url: 'https://github.com/your-repo/demo.git'
            }
        }

        stage('Build') {
            steps {
                // Compile the project
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests
                sh 'mvn test'
            }
            post {
                always {
                    // Archive test reports
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                // Build the JAR
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
