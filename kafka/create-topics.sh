#!/bin/sh

create_topic() {
    topicList=(
        BCA
     )
        echo -e "zookeeper:2182 partition 1 replication-factor 1"
        for topicName in ${topicList[*]}; do
          echo -e "Creating topic '$topicName' "
          docker exec vb8-kafka kafka-topics --bootstrap-server localhost:9093 \
                --create --topic $topicName --partitions 1 --replication-factor 1 --if-not-exists
        done

}

echo -e "Creating topics...\n"

create_topic

# EOF content
echo "\n"
