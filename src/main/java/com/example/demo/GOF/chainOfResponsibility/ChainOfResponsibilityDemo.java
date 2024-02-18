package com.example.demo.GOF.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Account privat = new Privat(Priority.LOW);
        Account mono = new Mono(Priority.MIDDLE);
        Account payPal = new PayPal(Priority.HIGH);

        privat.setNextAccount(mono);
        mono.setNextAccount(payPal);

        privat.processPayment(1000L, Priority.LOW);

        System.out.println("---------------------------------------------------------------------");
        privat.processPayment(2000L, Priority.MIDDLE);

        System.out.println("---------------------------------------------------------------------");
        privat.processPayment(3000L, Priority.HIGH);
    }
}
