node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/nanoport.git'), string(name: 'PORT_DESCRIPTION', value: 'GNU nano is a text editor for Unix-like operating systems' )]
  }
}
