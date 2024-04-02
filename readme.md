bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic person --from-beginning
bin/windows/kafka-server-start.bat config/server.properties
bin/windows/zookeeper-server-start.bat config/zookeeper.properties
