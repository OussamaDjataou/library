def call (){
    dir('/var/lib/jenkins/workspace/Pipeline/app/backend') {
                    sh '''docker build -t backend .
                    '''
                }
}