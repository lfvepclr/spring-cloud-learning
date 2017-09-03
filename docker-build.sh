#!/usr/bin/env bash
projectDir=$PWD
echo $projectDir
echo '==> START: Config'
cd ${projectDir}/config/
mvn clean package docker:build
echo '>>> FINISHED: Config...'


echo '==> START: Gateway'
cd ${projectDir}/gateway/
mvn clean package docker:build
echo '>>> FINISHED: Gateway...'

echo '==> START: Monitor'
cd ${projectDir}/monitor/
mvn clean package docker:build
echo '>>> FINISHED: Monitor...'

echo '==> START: Discovery'
cd ${projectDir}/discovery/
mvn clean package docker:build
echo '>>> FINISHED: Discovery...'

echo '==> START: UserServer'
cd ${projectDir}/server-user/
mvn clean package docker:build
echo '>>> FINISHED: UserServer...'


echo '==> START: BalanceCenterServer'
cd ${projectDir}/server-balance-center/
mvn clean package docker:build
echo '>>> FINISHED: BalanceCenterServer...'