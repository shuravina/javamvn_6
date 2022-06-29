package ru.netology.sqr;

public class SqrService {
    public int searchForSqr(int lowerLimit, int upperLimit) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= lowerLimit) & (i * i <= upperLimit)) {
                x++;

            }
        }
        return x;
    }

}

