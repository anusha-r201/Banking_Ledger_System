package dev.codescreen.dto;

import lombok.Data;

@Data
public class balance {
    private Double amount = 0D;
    private String currency;
    private String debitOrCredit;
}
