# Sleuth Zipkin Test Project



# Download and start the zipkin server
```
wget -O zipkin.jar 'https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec'

java -jar zipkin.jar
```

Open the zipkin server URL  
http://localhost:9411

# Test Request

```
curl http://localhost:8090/testzip

```
