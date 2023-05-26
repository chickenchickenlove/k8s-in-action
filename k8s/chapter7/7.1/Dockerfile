FROM ubuntu:latest
RUN apt-get update -y; apt-get -y install fortune
ADD fortuneloop.sh /bin/fortuneloop.sh

# 실행할 프로세스 정의
ENTRYPOINT ["/bin/fortuneloop.sh"]

# 실행할 때 사용할 기본인자
CMD ["10"]