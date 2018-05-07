FROM centos

MAINTAINER rayan saleh <rayan@saleh.fr>

RUN yum install -y \
       java-1.8.0-openjdk \
       java-1.8.0-openjdk-devel

COPY postgresql-42.2.1.jar lib/jvm/jre/lib/ext 

COPY ./Entreprise_Ebiz /usr/appEbiz 

COPY ./Manifest.txt /usr/appEbiz/src

WORKDIR /usr/appEbiz/src

RUN javac -encoding utf8 *.java

RUN jar cfm appEbiz.jar Manifest.txt *.class

WORKDIR /

COPY ./execute.sh /execute.sh

RUN chmod +x /execute.sh

CMD ["/execute.sh"]
