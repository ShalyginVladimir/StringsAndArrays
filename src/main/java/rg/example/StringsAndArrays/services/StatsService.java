package rg.example.StringsAndArrays.services;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[maximumMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];
            }
        }
        return maximumMonth + 1;
    }

    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[minimumMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumMonth = i;
                minimumSale = sales[i];
            }
        }
        return minimumMonth + 1;
    }

    public int bellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }

}