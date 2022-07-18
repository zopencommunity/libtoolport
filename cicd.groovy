node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'libtoolport'), string(name: 'DESCRIPTION', 'libtoolport' )]
        }
}
