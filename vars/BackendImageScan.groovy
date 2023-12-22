def call(){
    dir('/var/lib/jenkins/workspace/Pipeline/app/backend') {
                    sh '''trivy image backend > scan1.txt
                    cat scan1.txt
                    '''
}