FROM centos

MAINTAINER rayan saleh <rayan@saleh.fr>

RUN yum install -y \
       java-1.8.0-openjdk \
       java-1.8.0-openjdk-devel

COPY postgresql-42.2.1.jar lib/jvm/jre/lib/ext 

COPY Entreprise_Ebiz /usr/appEbiz

WORKDIR /usr/appEbiz/src

RUN javac -encoding utf8 *.java

RUN jar -cf appEbiz.jar *

WORKDIR /

CMD export CLASSPATH=/usr/appEbiz/src/appEbiz.jar:/lib/jvm/jre/lib//ext/postgresql-42.2.1.jar && java /usr/appEbiz/src/Main 

