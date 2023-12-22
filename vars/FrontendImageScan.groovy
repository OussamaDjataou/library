def call (){
    dir('/var/lib/jenkins/workspace/Pipeline/app/frontend') {
                    sh '''trivy image frontend > scan2.txt
                    cat scan2.txt
                    '''
                }
}