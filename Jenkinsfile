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
                sh 'cp target/*.war /home/ibrahim/Downloads/tomcat9/webapps/'
                echo 'Le fichier WAR a été copié avec succès dans webapps.'
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