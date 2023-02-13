package day48_Stream2.Tasks.Traders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

// 1. Find all transactions in the year 2011 and sort them by value(small to high)

        transactions.stream()
                .filter(year -> year.getYear() == 2011)
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

// 2. What are all the unique cities where the traders work?

        transactions.stream()
                .map(trader -> trader.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

// 3. Find all traders from Cambridge and sort them by name.

        transactions.stream()
                .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
                .map(trader -> trader.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

// 4. Return a string of all traders’ names sorted alphabetically.

        String tradersSorted = transactions.stream()
                .map(trader -> trader.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(tradersSorted);
        System.out.println("--------------------------------------------------");

// 5. Are any traders based in Milan?

        transactions.stream()
                .filter(trader -> trader.getTrader().getCity().equals("Milan"))
                .distinct()
                .forEach(System.out::println);
    // OR
        boolean fromMilan = transactions.stream()
                .anyMatch(trader -> trader.getTrader().getCity().equals("Milan"));
        System.out.println("Traders from Milan: " + fromMilan);
        System.out.println("--------------------------------------------------");

// 6. Print the values of all transactions from the traders living in Cambridge.

        transactions.stream()
                .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

// 7. What is the highest value of all the transactions?

        int max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .get();
        System.out.println(max);
        System.out.println("--------------------------------------------------");

// 8. Find the transaction with the smallest value.

        int min = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min)
                .get();
        System.out.println(min);

    }
}
/*
1. Find all transactions in the year 2011 and sort them by value(small to high)
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print the values of all transactions from the traders living in Cambridge.
7. What is the highest value of all the transactions?
8. Find the transaction with the smallest value.
 */