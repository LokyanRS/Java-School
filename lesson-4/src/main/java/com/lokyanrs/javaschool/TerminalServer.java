package com.lokyanrs.javaschool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalServer {

    /**
     * Тестовые данные
     */
    private static final List<Client> clients = Arrays.asList(
            new Client("Смирнов", 1_000, 1234),
            new Client("Попов", 10_000, 6789),
            new Client("Васильев", 1_000_000, 9876),
            new Client("Петров", 59_178, 1598));

    public

    public int getAmount(String name){
        //is present
        clients.stream().filter(client -> client.getName().equals(name)).findFirst().get();
    }
}
