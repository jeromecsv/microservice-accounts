package com.microservices.accounts.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
public class Cards {

    private int cardId;

    private int customerId;

    private String cardNumber;

    private String cardType;

    private int totalLimit;

    private int amountUsed;

    private int availableAmount;

    private Date createDt;
}
