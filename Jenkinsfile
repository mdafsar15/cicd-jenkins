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
                classifier: '', file: 
                'target/cicd-jenkins-0.0.1.war', 
                type: 'war'
                ]
              ], 
              credentialsId: '24598f4d-5e13-4f54-ae8a-8d299cea8b89', 
              groupId: 'com.genx', 
              nexusUrl: '15.207.100.147:8081', 
              nexusVersion: 'nexus2', 
              protocol: 'http', 
              repository: 'http://15.207.100.147:8081/repository/simpleapp-release-nexus/', 
              version: '0.0.1'
            }
        }
	
    }
	
}
