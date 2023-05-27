public class Cast {
    public static void main(String[] args) {
        char a = 'q';
        byte b = 32;
        short sh = 250;
        int i = 500;
        long l = 43657895445L;
        float f = 33.123455F;
        double d = 22.123456789012344;
        System.out.println(b);
        System.out.println(sh);
        int castLongToInt = (int) l;
        System.out.println(castLongToInt);
        byte castLongToByte = (byte) ((int) l);
        System.out.println(castLongToByte);
        int castFloatToInt = (int) f;
        System.out.println(castFloatToInt);
        float castDoubleToFloat = (float) d;
        System.out.println(castDoubleToFloat);
        double castFloatToDouble = (double) f;
        System.out.println(castFloatToDouble);
    }
}
