package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void check1() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.searchForSqr(200, 300);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "===" + expected);

    }

    @Test
    public void Check2() {
        SqrService service = new SqrService();
        int expected = 1;
        int actual = service.searchForSqr(100, 100);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "===" + expected);

    }

    @Test
    public void Check3() {
        SqrService service = new SqrService();
        int expected = 0;
        int actual = service.searchForSqr(10, 90);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual + "===" + expected);
    }


}
