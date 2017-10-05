#!/usr/bin/env groovy

node {
  stage('Checkout') {
    checkout scm
  }
  stage('Build') {
    echo 'Building and unit testing the API.'
    // this step is faked
    echo 'API built and unit-tested.'
  }
  stage('Deploy') {
    echo 'Deploying the API.'
    // this step is faked
    echo 'API deployed.'
  }
  stage('Test') {
    echo 'Testing the API with Restlet Client maven plugin'


    withCredentials([
      string(credentialsId: 'RESTLET_CLIENT_LICENSE', variable: 'RESTLET_CLIENT_LICENSE'),
      string(credentialsId: 'CONTACTS_API_KEY', variable: 'CONTACTS_API_KEY')]) {

        // Maven installation declared in the Jenkins "Global Tool Configuration"
        withMaven(maven: 'Maven 3.5.0') {
          sh "mvn clean test -B \
          -Dapi_key=\"$CONTACTS_API_KEY\" \
          -Dselected_environment='restlet-cloud' \
          -Dtest_file='src/test/resources/contacts_api_tests.json' \
          -Dlicense_key=\"$RESTLET_CLIENT_LICENSE\""
        }
        echo 'API tested.'
    }
  }
}
