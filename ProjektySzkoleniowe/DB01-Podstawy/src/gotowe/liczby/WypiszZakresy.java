package gotowe.liczby;
 
public class WypiszZakresy {
 
    public static void main(String[] args) {
        System.out.println("byte  " + Byte.BYTES + " bajtów, od " + Byte.MIN_VALUE + " do " + Byte.MAX_VALUE);
        System.out.println("short " + Short.BYTES + " bajtów, od " + Short.MIN_VALUE + " do " + Short.MAX_VALUE);
        System.out.println("int   " + Integer.BYTES + " bajtów, od " +Integer.MIN_VALUE + " do " + Integer.MAX_VALUE);
        System.out.println("long  " + Long.BYTES + " bajtów, od " +Long.MIN_VALUE + " do " + Long.MAX_VALUE);
 
        System.out.println("char  " + Character.BYTES + " bajtów, od " + (int) Character.MIN_VALUE + " do " + (int) Character.MAX_VALUE);
        System.out.println();
        
        // bez ograniczen: klasy BigInteger (calkowite) i BigDecimal (z ulamkiem)
        
        System.out.println("float  " + Float.BYTES + " bajtów, od " +Float.MIN_VALUE + " do " + Float.MAX_VALUE);
        System.out.println("    min normal : " + Float.MIN_NORMAL);
        System.out.println("double  " + Double.BYTES + " bajtów, od " +Double.MIN_VALUE + " do " + Double.MAX_VALUE);
        System.out.println("    min normal : " + Double.MIN_NORMAL);
    }
}
