package nat;

public class Biblioteka {
    static {
        System.loadLibrary("native");
    }

    public native int[] losowy_ruch(int[] tablica);



}
