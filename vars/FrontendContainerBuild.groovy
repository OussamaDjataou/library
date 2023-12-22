def call (){
    dir('/var/lib/jenkins/workspace/Pipeline/app/frontend') {
                    sh '''docker build -t frontend .
                    '''
                }
}