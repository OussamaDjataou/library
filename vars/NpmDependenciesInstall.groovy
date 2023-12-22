def call(){
    sh '''npm install
          npm audit fix --force
       '''
}