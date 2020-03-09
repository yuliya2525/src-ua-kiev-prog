package ua.kiev.prog;

public class AgeCheck {
    public static boolean isCorrectAge(String ageS) {
        boolean res = true;
        try {
            int age = Integer.parseInt(ageS);
            if (age <= 10 || age >= 120) {
                res = false;
            }
        } catch (Exception e) {
            res = false;
        }
        return res;
    }

}
