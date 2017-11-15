pipeline {
node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/vikram-mehta/LocationAPI.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      //junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('dev2') {
    echo 'deployed to Dev2'
   }
}
  input "Deploy to ITCA?"
stage('ITCA') {

 // milestone()
 // lock('Deployment') {
//    node {
     echo "Deploying to ITCA"
//    }
//  }
}
input "Deploy to PRDR?"
stage('PRDR') {
 echo "Deploying to PRDR"
}
input "Deploy to PROD?"
stage('PROD') {
 echo "Deploying to PROD"
}
}
