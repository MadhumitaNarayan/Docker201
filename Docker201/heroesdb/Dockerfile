FROM mysql:8.0.3
# Add a database
ENV MYSQL_DATABASE heroesdb
ENV MYSQL_ROOT_PASSWORD root
# Add data.sql  to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
ADD ./mysql-scripts/ /docker-entrypoint-initdb.d/
