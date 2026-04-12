~~(Missing HEALTHCHECK instruction)~~>FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
copy newrelic.jar /newrelic.jar
COPY ./target/standing-orders-services.jar standing-orders-services.jar
ENTRYPOINT ["java","-jar","/standing-orders-services.jar"]
USER appuser
