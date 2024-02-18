package com.example.demo.GOF.chainOfResponsibility;

public abstract class Account {
    private final Priority priority;
    private Account nextAccount;

    public Account(Priority priorityLevel) {
        this.priority = priorityLevel;
    }

    public void setNextAccount(Account nextAccount) {
        this.nextAccount = nextAccount;
    }

    public void processPayment(Long payment, Priority level){
        if(level.ordinal() == priority.ordinal()){
            handleProcess(payment);
        }
        if(nextAccount != null){
            nextAccount.processPayment(payment, level);
        }
    }

    public abstract void handleProcess(Long payment);
}