java -Deureka.client.service-url.defaultZone=http://soa-registry:8761/eureka \
    -Dspring.data.mongodb.host=soa-profile-mongo \
-jar *.jar
