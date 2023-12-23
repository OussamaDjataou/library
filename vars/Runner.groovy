def call(){
    dir('/var/lib/jenkins/workspace/Pipeline/app') {
                    sh '''docker-compose up -d
                    '''
    }
}