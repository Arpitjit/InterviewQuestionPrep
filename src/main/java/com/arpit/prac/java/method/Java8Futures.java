package com.arpit.prac.java.method;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Java8Futures {

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = getStringCompletableFuture(" Completed1 ");

        System.out.println("this is after first");

        CompletableFuture<String> completableFuture2 = getStringCompletableFuture("Completed2");

        System.out.println("this is after seconnd");


        completableFuture.thenApply((string) -> {
            return "";
        });


        CompletableFuture<CompletableFuture<String>> sf = completableFuture.thenApply((str) -> getStringCompletableFuture(str));


        CompletableFuture<String> completableFuture10 = completableFuture.thenCombine(completableFuture2, (s, s2) -> {

            return "processing togther " + s + " " + s2;
        });

        System.out.println("this is after third");

        try {
            System.out.println(completableFuture10.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("this is after 4");

    }

    private static CompletableFuture<String> getStringCompletableFuture(final String str) {
        return CompletableFuture.supplyAsync(() -> {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return str;
        });
    }


}
