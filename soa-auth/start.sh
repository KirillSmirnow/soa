java -Deureka.client.service-url.defaultZone=http://soa-registry:8761/eureka \
    -Dspring.data.mongodb.host=soa-auth-mongo \
    -Dsecurity-key=$SECURITY_KEY \
-jar *.jar
