node('linux') 
{
        stage ('Poll') {
                checkout([
                        $class: 'GitSCM',
                        branches: [[name: '*/main']],
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [],
                        userRemoteConfigs: [[url: 'https://github.com/ZOSOpenTools/libtoolport.git']]])
        }

        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'libtoolport'), string(name: 'DESCRIPTION', 'GNU Libtool is a generic library support script that hides the complexity of using shared libraries behind a consistent, portable interface.' )]
        }
}
