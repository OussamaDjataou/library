def call(){
    dir('/var/lib/jenkins/workspace/Pipeline/app/frontend') {
                    sh ''' docker login -u djataououssama -p Owaxadjdada12*
                    docker tag frontend djataououssama/testjenkins:${BUILD_ID}.0 
                      docker push djataououssama/testjenkins:${BUILD_ID}.0
                         '''
                    
                }
}