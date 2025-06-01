public class SwitchExerciseRunner {
    public static void main(String[] args) {
        System.out.println(determinationNameOfDay(10));
        System.out.println(isWeakDay(1));
    }

    public static boolean isWeakDay(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
        }
        return false;
    }

    public static String determinationNameOfDay(int dayNumber) {
        String result = "";
//        switch (dayNumber) {
//            case 0:
//                result = "Sunday";
//                break;
//            case 1:
//                result = "Monday";
//                break;
//            case 2:
//                result = "Tuesday";
//                break;
//            case 3:
//                result = "Wednesday";
//                break;
//            case 4:
//                result = "Thursday";
//                break;
//            case 5:
//                result = "Friday";
//                break;
//            case 6:
//                result = "Saturday";
//                break;
//        }
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
//        return result;
        return "Invalid Entry";
    }
}
