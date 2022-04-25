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
                sh script: 'mvn clean package'
            }
        }
	
    }
	
}
