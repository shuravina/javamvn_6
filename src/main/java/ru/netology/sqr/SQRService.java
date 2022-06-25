package ru.netology.sqr;

public class SQRService {
    public int searchForSqr(int d1, int d2) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= d1) & (i * i <= d2)) {
                x++;

            }
        }
        return x;
    }

}

