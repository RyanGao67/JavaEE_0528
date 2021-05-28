### To start server

mvn clean package


* Make sure no process on port 8080 
  
sudo lsof -i -P -n | grep LISTEN

sudo kill -9 `sudo lsof -t -i:8080`


* Start default domain 1

~/Downloads/payara-5.2021.3/payara5/bin/asadmin start-domain 

~/Downloads/payara-5.2021.3/payara5/bin/asadmin version

~/Downloads/payara-5.2021.3/payara5/bin/asadmin list-domains

~/Downloads/payara-5.2021.3/payara5/bin/asadmin deploy ./target/JpaExample-1.0-SNAPSHOT.war 

curl localhost:8080/JpaExample-1.0-SNAPSHOT/rest/company/1

  
