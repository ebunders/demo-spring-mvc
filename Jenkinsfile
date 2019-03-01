#!/usr/bin/env groovy
pipeline {
    agent { docker { image 'maven:3.3.3' }
    environment{
        FOOBAR = credentials('foo.bar')
    }
    stages {
        stage('build') {
            steps {
                echo "$FOOBAR"
                sh 'mvn --version'
            }
        }
    }
}