node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'libtoolport'), string(name: 'DESCRIPTION', 'GNU Libtool is a generic library support script that hides the complexity of using shared libraries behind a consistent, portable interface.' )]
        }
}
