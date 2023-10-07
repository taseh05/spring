call mvn clean package -DskipTests=true
call docker build -t springbootdemo -f Dockerfilejdk11 .
