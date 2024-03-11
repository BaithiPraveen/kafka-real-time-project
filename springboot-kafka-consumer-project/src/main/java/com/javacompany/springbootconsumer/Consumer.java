package com.javacompany.springbootconsumer;

import com.javacompany.springbootconsumer.entity.WikiMediaData;
import com.javacompany.springbootconsumer.repository.WikiMediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    private WikiMediaDataRepository wikiMediaDataRepository;


    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String eventMessage){

        LOGGER.info(String.format("Event message received -> %s", eventMessage));

        WikiMediaData wikiMediaData = new WikiMediaData();
        wikiMediaData.setWikiEventData(eventMessage);

        wikiMediaDataRepository.save(wikiMediaData);
    }
}
