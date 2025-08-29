public static String priority(int level) {

        String priority = "Code ";
        switch (level) {
            case 3:
                priority = priority + "Red";
                break;
            case 2: // Case 2 will fall through to next statement (case1)

            case 1:
                priority = priority + "Amber";
                break;

            default: // e.g. if case is 99 or some random number or doesn't match any expressions
                priority = "Error";
                break;
        }
        return priority;
    }