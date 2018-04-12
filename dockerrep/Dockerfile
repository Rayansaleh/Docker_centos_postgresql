FROM centos

MAINTAINER rayan saleh <rayan@saleh.fr>

RUN yum install -y https://yum.postgresql.org/10/redhat/rhel-7-x86_64/pgdg-centos10-10-2.noarch.rpm

RUN yum install -y postgresql10-server postgresql10

RUN chown -R postgres.postgres /var/lib/pgsql

ADD ./postgresql-setup /usr/pgsql-10/bin/postgresql-10-setup

ADD ./start_postgres.sh /start_postgres.sh

RUN chmod +x /usr/pgsql-10/bin/postgresql-10-setup

RUN chmod +x /start_postgres.sh

RUN /usr/pgsql-10/bin/postgresql-10-setup initdb

EXPOSE 5432

CMD ["/start_postgres.sh"]

