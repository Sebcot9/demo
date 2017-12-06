pipeline
{
	agent any
	
	stages
	{
		stage('Build') 
		{
			steps
			{
				bat 'mvn -B -DskipTests clean package'
			}
		}
		stage('Test') 
		{
			steps
			{			
				bat 'mvn test'	
			}
		}
		stage('Deploy')
		{
			steps
			{
				bat 'mvn tomcat:deploy'
			}
		}
	}
}