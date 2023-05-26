#!/bin/bash

# 환경변수로 인자 전달 받음.

trap "exit" SIGINT
echo Configured to generate new fortune every "$INTERVAL" seconds
mkdir -p /var/htdocs
while :
do
  echo $(date) Writing fortune to /var/htdocs/index.html
  /usr/games/fortune > /var/htdocs/index.html
  sleep $INTERVAL
done
