package org.example;


import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

public class Task1 {

    // TODO

    void stringInvestigation() {
        String str1 = "Hello";
        String str2 = str1;
        str2.replace('l', 'q');
        System.out.println(str1);
        System.out.println(str2);
    }
    public double mean(double[] values)
    {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty values");
        } else {
            return Arrays.stream(values).sum() / Arrays.stream(values).count();
        }
    }

    // TODO
    public double median(double[] values)
    {
        extracted(values);
        double[] sortedArray = Arrays.stream(values).sorted().toArray();

        if (sortedArray.length % 2 == 0)
        {
            double a = sortedArray[sortedArray.length / 2 - 1];
            double b = sortedArray[sortedArray.length / 2];
            return (a + b) / 2;
        } else {
            return sortedArray[(int) sortedArray.length / 2];
        }
    }

    // TODO
    public double sum(double[] values)
    {
        extracted(values);
        return Arrays.stream(values).sum();
    }

    // TODO
    public double standardDeviation(double[] values)
    {
        extracted(values);

        double mean = mean(values);
        double[] doubles = Arrays.stream(values).map(number -> number - mean)
                .map(number -> Math.pow(number, 2))
                .toArray();
        double deviation = sum(doubles) / doubles.length;
        double result = Math.sqrt(deviation);
        return change(result, 4);
    }
    static double change(double value, int decimalpoint)
    {
        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        return value;
    }
    // TODO
    public double firstQuartile(double[] values) {

        extracted(values);

        double median = median(values);

        double[] fistPart = new double[values.length/2];

        for (int i = 0; i < values.length/2; i++) {
            fistPart[i] = values[i];
        }
        return median(fistPart);
    }

    private static void extracted(double[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Empty values");
        }
    }

    // TODO
    public double thirdQuartile(double[] values) {
        extracted(values);

        double[] secondPart = new double[values.length/2];
        int j = 0;
        for (int i = values.length - 1; i > values.length / 2; i--) {
            secondPart[j] = values[i];
            j++;
        }

        return median(secondPart);
    }
}
