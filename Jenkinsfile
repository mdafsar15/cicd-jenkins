pipeline 
	{
    agent any
	tools {
		maven 'maven_3_5_0'
	}
    stages 
		{
        stage('Build') {
            steps 
			{
                sh script: 'mvn clean package'
            }
        }
		stage('Upload Jar to Nexus') {
            steps 
			{
                nexusArtifactUploader artifacts: [
                [
                artifactId: 'cicd-jenkins', 
                classifier: '', 
                file: '/var/lib/jenkins/workspace/nexus-jenkins/target/cicd-jenkins-0.0.1.jar', 
                type: 'jar'
                ]
              ], 
              credentialsId: '24598f4d-5e13-4f54-ae8a-8d299cea8b89', 
              groupId: 'com.genx', 
              nexusUrl: '13.234.75.8:8081', 
              nexusVersion: 'nexus2', 
              protocol: 'http', 
              repository: 'http://13.234.75.8:8081/repository/simpleapp-release-nexus', 
              version: '0.0.1'
            }
        }
	
    }
	
}
