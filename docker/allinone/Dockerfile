FROM ubuntu:latest

RUN apt-get update -y; apt-get upgrade -y;
RUN apt-get install net-tools curl dnsutils -y

RUN apt-get install mysql-client -y

RUN apt-get install -y locales
RUN locale-gen ko_KR.UTF-8
ENV LC_ALL ko_KR.UTF-8

# docker build -t ojt90902/ubuntu-all:latest .
# docker buildx


#docker buildx build --platform linux/arm64 --push -t ojt90902/ubuntu-all:latest .