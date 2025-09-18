package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jpmc.midascore.foundation.Transaction;

@Service
public class TransactionListener {

    @KafkaListener(topics = "${midas.kafka.topic}", groupId = "midas-group")
    public void consume(Transaction transaction) {
        System.out.println("AMOUNT: " + transaction.getAmount());
    }
}
