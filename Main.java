package ej3;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Integer s = 0;
        for(int i = 0; i < 100; i++){
            a[i] = i + 1;
        }

        for(int i = 0; i < 100; i++){
            s += a[i];
        }

        System.out.println("La suma total del 1 al 100 es igual a: "+s+"\nLa media es igual a "+(s.floatValue() / 100));
    }
}

