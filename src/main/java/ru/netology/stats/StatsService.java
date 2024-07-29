package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSalesMonth(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSalesMonth(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                count++;
            }
        }
        return count;
    }

}
