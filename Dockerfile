FROM openjdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/user-0.0.1-SNAPSHOT.jar user-0.0.1-SNAPSHOT.jar

# Set environment variable for optional Java options
ENV JAVA_OPTS=""

# Run the application
ENTRYPOINT exec java $JAVA_OPTS -jar user-0.0.1-SNAPSHOT.jar
