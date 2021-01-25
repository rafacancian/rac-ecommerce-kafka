package com.ecommerce.kafka.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction<T> {

    void parse(final ConsumerRecord<String, T> record);
}
