FROM ubuntu:20.04
RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install -y dnsutils net-tools curl

ENTRYPOINT ["tail", "-f", "/dev/null"]