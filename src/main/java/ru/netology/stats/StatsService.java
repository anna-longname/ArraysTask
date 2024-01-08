package ru.netology.stats;

public class StatsService {

    public long amount(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale;
    }


    public long average(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        long averageSale = allSale / 12;
        return averageSale;
    }

    public int lastMonthWithMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int lastMonthWithMinSale(long[] sales) {
        int monthMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }

        return monthMin + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int months = 0;
        long AverageSale = average(sales);
        for (long sale : sales) {
            if (sale < AverageSale) {
                months++;
            }
        }
        return months;
    }

    public int monthsAboveAverage(long[] sales) {
        int months = 0;
        long AverageSale = average(sales);
        for (long sale : sales) {
            if (sale > AverageSale) {
                months++;
            }
        }
        return months;
    }
}