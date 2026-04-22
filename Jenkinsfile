pipeline 
{
    agent any

<<<<<<< HEAD
    tools {
        maven "maven3.9"
    }

    environment {
        DOCKER_REPO = "hm-calculator"
        DOCKER_CREDENTIALS_ID = "dockerhub-credentials"
        DOCKER_HOST_PORT = "7575"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/travvizzzz/calculator.git'
            }
        }

        stage('Build, Test & Coverage') {
            steps {
                // This generates JaCoCo HTML at target/site/jacoco
                sh 'mvn clean verify'
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('JaCoCo Report') {
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Coverage'
                ])
            }
        }

        stage("Static Code Analysis (Checkstyle)") {
            steps {
                sh 'mvn checkstyle:checkstyle'
              publishHTML(target: [
    allowMissing: false,
    alwaysLinkToLastBuild: true,
    keepAll: true,
    reportDir: 'target/site/jacoco',
    reportFiles: 'index.html',
    reportName: 'JaCoCo Coverage'
])
            }
        }

        stage('Build Jar') {
            steps {
                // Jar build AFTER coverage
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    def imageTag = "${env.BUILD_NUMBER}"
                    sh "docker build -t ${DOCKER_REPO}:${imageTag} ."
                    sh "docker tag ${DOCKER_REPO}:${imageTag} ${DOCKER_REPO}:latest"
                    env.IMAGE_TAG = imageTag
=======
    tools 
    {
        // Make sure Maven is installed on your Jenkins node
        maven 'Maven-3.9.0' 
        jdk 'OpenJDK-17'
    }

    stages 
    {
        stage('Checkout') 
        {
            steps 
            {
                // Pull code from your repository
                git branch: 'main', url: 'https://github.com/your-repo/demo.git'
            }
        }

        stage('Build') 
        {
            steps 
            {
                // Compile the project
                sh 'mvn clean compile'
            }
        }

        stage('Test') 
        {
            steps 
            {
                // Run JUnit tests
                sh 'mvn test'
            }
            post 
            {
                always 
                {
                    // Archive test reports
                    junit 'target/surefire-reports/*.xml'
>>>>>>> 1ad0304 (update file)
                }
            }
        }

<<<<<<< HEAD
        stage('Run Docker Container') {
            steps {
                sh """
                    docker stop hm-calculator-container || true
                    docker rm hm-calculator-container || true
                    docker run -d --name hm-calculator-container -p 7575:8080 ${DOCKER_REPO}:${env.IMAGE_TAG}
                """
=======
        stage('Package') 
        {
            steps 
            {
                // Build the JAR
                sh 'mvn package'
>>>>>>> 1ad0304 (update file)
            }
        }
    }

    post {
<<<<<<< HEAD
        always {
            echo "✅ Pipeline finished."
        }
        success {
            echo "🎉 Pipeline succeeded! App running at http://localhost:${env.DOCKER_HOST_PORT}/"
            emailext(
                to: 'htetmyat1105@gmail.com',
                subject: 'Pipeline Email Test',
                body: 'Pipeline email sent successfully ✅'
            )
        }
        failure {
            echo "❌ Pipeline failed."
            emailext(
                to: 'htetmyat1105@gmail.com',
                subject: 'Pipeline Email Test',
                body: 'Pipeline email sent fail'
            )
=======
        success 
        {
            echo 'Pipeline completed successfully!'
        }
        failure 
        {
            echo 'Pipeline failed.'
>>>>>>> 1ad0304 (update file)
        }
    }
}
