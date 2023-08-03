pipeline{
    agent any
    stages {
        stage("Clean"){
            steps{
                deleteDir()
            }
        }
        stage("Checkout"){
            steps{
                sh "git clone https://github.com/uyanda-shezi/cards.git"
                dir("cards"){
                    sh "git checkout develop"
                }
            }
        }
        stage("Build"){
            steps{
                dir("cards"){
                    sh "mvn clean install -Denforcer.skip=true"
                }
            }
        }
        stage("Test"){
            steps{
                dir("cards"){
                    sh "mvn test -Denforcer.skip=true"
                }
            }
        }
    }
}