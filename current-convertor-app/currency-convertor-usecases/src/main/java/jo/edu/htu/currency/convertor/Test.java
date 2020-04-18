package jo.edu.htu.currency.convertor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    private static String Currency;
    private static String from;
    private static String to;

    public static void main(String[] args) {
        String csvFile = "/Users/DELL/Downloads/table-i3-e.csv";
        Scanner currencies = new Scanner(System.in);
        System.out.println("enter the currencies");
        System.out.println("from");
        String from = currencies.next();
        System.out.println("to");
        String to = currencies.next();
        run(csvFile, from, to);

    }

    public static void run(String csvFile, String currencyFrom, String currencyTo) {
        String line = "";
        String csvSplitBy = ",";
        Map<String, Integer> Namecurrency = new HashMap<String, Integer>();
        Map<String, Integer> currencyRate = new HashMap<String, Integer>();
        Scanner record = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int count = 1;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if (data.length < 4 || data[2].equalsIgnoreCase("Currency"))
                    continue;

                if (Namecurrency.get(data[2].toLowerCase()) != null) {
                    count = Namecurrency.get(data[2].toLowerCase()) + 1;
                    Namecurrency.put(data[2].toLowerCase(), count);
                } else {
                    Namecurrency.put(data[2].toLowerCase(), 1);
                }

                if (currencyRate.get(data[data.length - 1]) != null) {
                    count = currencyRate.get(data[data.length - 1]) + 1;
                    currencyRate.put(data[data.length - 1], count);

                } else {
                    currencyRate.put(data[data.length - 1], 1);
                }

                if (data[2].contains(currencyFrom))
                    from = data[data.length - 1];
                if (data[2].contains(currencyTo))
                    to = data[data.length - 1];
                System.out.println(from +"          "+ to);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


/*
        String csvFile = "/Users/DELL/Downloads/table-i3 edited-e.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                Currency = country[2];
                String rate2019 = country[country.length-1];
                System.out.println("currency=       " + Currency + "        ,        rate 2019= " + rate2019 + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void currencySearch(String csvFile, String Search) {

        boolean found = false;
        String Currency = "";
        String rate2019 = "";
        String line = "";

        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null && !found) {
                String[] country = line.split(cvsSplitBy);
                Currency = country[1];
                rate2019 = country[country.length-1];
                System.out.println("currency=       " + Currency + "        ,        rate 2019= " + rate2019 + "]");

                if (Currency.equals(Search)){
                    found = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}*/

