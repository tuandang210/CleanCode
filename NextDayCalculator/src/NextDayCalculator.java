import java.util.Scanner;

public class NextDayCalculator {
    public static String message;

    public static String showDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    message = "1-" + (month + 1) + "-" + year;
                } else {
                    message = (day + 1) + "-" + month + "-" + year;
                }
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0) {
                    if (day == 29) {
                        message = "1-" + (month + 1) + "-" + year;
                    } else {
                        message = (day + 1) + "-" + month + "-" + year;
                    }
                } else if (year % 100 == 0 && year % 400 == 0) {
                    if (day == 29) {
                        message = "1-" + (month + 1) + "-" + year;
                    } else {
                        message = (day + 1) + "-" + month + "-" + year;
                    }
                } else {
                    if (day == 28) {
                        message = "1-" + (month + 1) + "-" + year;
                    } else {
                        message = (day + 1) + "-" + month + "-" + year;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    message = "1-" + (month + 1) + "-" + year;
                } else {
                    message = (day + 1) + "-" + month + "-" + year;
                }
                break;
            case 12:
                if (day == 31) {
                    message = "1-1-" + (year + 1);
                } else {
                    message = (day + 1) + "-" + month + "-" + year;
                }
                break;
        }
        return message;
    }
}
