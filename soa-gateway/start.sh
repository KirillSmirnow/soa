java -Deureka.client.service-url.defaultZone=http://soa-registry:8761/eureka \
    -Dsecurity-key=$SECURITY_KEY \
-jar *.jar
