pipeline {
    agent any


    tools {
        maven 'Maven'
    }


    stages {
        stage('Build') {
            steps {
                echo 'Compilation en cours...'
                //
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                echo 'Exécution des tests unitaires...'
                //
                sh 'mvn test'
            }
            post {
                always {

                    junit 'target/surefire-reports/*.xml'
                    
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Déploiement...de l\'application'
                //
            }
        }
    }


    post {
        success {
            echo 'Le pipeline a réussi !'
 
        }
        failure {
            echo 'Le pipeline a échoué'
        }
    }
}