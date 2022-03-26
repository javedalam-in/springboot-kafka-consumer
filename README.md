# Kafka Consumer Example with Spring Boot

In this project I have covered how to use Kafka to Consume String or JSON message form a Kafka topic with Spring Boot.

## Downloading/Installation and Run Apache Kafka on Windows/Linux

### Apache Kafka can be downloaded from its official site https://kafka.apache.org/downloads

For the installation process, follow the steps given below:

- From Downloads folder and select the downloaded Binary file.
- Extract the file and move the extracted folder to the directory/folder where you want to keep the files.
- Copy the path of the Kafka folder. Now go to config inside kafka folder and open zookeeper.properties file. Copy the path against the field dataDir and add /zookeeper-data to the path e.g C:/kafka/zookeeper-data.
- Now open from same config folder server.properties and scroll down to log.dirs and paste the path. To the path add C:/kafka-logs
- Configuration of zookeeper and kafka server is completed. Now open command prompt or terminal and go to directory/folder to the kafka.

## Start Zookeeper
- Windows `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`
- Linux `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- Windows `.\bin\windows\kafka-server-start.bat .\config\server.properties`
- Linux `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- Windows `.\bin\windows\kafka-topics.bat --create --topic KafkaTopicExample --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1`
- Linux `bin/kafka-topics.sh --create --topic KafkaTopicExample --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1`

## Publish to Kafka Topic via Console
- Windows `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic KafkaTopicExample`
- Linux `.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic KafkaTopicExample`
