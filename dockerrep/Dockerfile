FROM centos 

MAINTAINER Rayan Saleh <rayan@saleh.fr>

RUN yum -y update; yum clean all
RUN yum -y install sudo epel-release; yum clean all

RUN sed -i 's/.*requiretty$/#Defaults requiretty/' /etc/sudoers

RUN yum install -y https://download.postgresql.org/pub/repos/yum/10/redhat/rhel-7-x86_64/pgdg-centos10-10-2.noarch.rpm

RUN yum install -y postgresql10

RUN yum install -y postgresql10-server

ADD ./postgresql-setup /usr/pgsql-10/bin/postgresql-setup

RUN chown -R postgres.postgres /var/lib/pgsql

RUN chmod +x /usr/pgsql-10/bin/postgresql-setup

RUN sh /usr/pgsql-10/bin/postgresql-setup initdb

ADD ./start_postgres.sh /start_postgres.sh

RUN chmod +x /start_postgres.sh

EXPOSE 5432

CMD ["/start_postgres.sh"]
