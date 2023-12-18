def call(String branchName, String credentialsId, String repositoryUrl) {
    
            script {
                git branch: branchName, changelog: false, credentialsId: credentialsId, poll: false, url: repositoryUrl
            }
        
    
}