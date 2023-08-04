package ru.netology.stats.hwjava.arrays;

public class StatsService {

    public long sum(long[] sales) { //сумма всех продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) { //средняя сумма продаж в месяц
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int monthMaxSale(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }

    public long lowAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                result++;
            }
        }
        return result;
    }

    public long heightAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                result++;
            }
        }
        return result;
    }
}
