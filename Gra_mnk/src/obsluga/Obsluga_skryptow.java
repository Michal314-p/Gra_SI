package obsluga;

import javafx.util.Pair;
import jdk.nashorn.api.scripting.JSObject;
import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import nat.Biblioteka;

public class Obsluga_skryptow {
    static String sciezka = "src/main/resources/";
    final static String silnik = "nashorn";
    static String wspolrzedne = null;

    public String wybor(String strategia, String rodzaj_skryptu,Integer[][] tablica)
    {
        String ruch = null;
        if(rodzaj_skryptu=="js")
        {
            sciezka = "C:\\Users\\Sorin\\Desktop\\java\\GraKK\\src\\nashorn_skrypty";
            ruch = skrypt_java(tablica,strategia);
            return ruch;
        }
        if(rodzaj_skryptu=="cpp")
        {
            ruch = String.valueOf(cpp_native(tablica));
            String utnij = ruch.replaceAll("=","");
            return utnij;
        }
        else
        {
            System.out.println("Nie wybrano rodzaju skryptu.");
            return null;
        }
    }



    public String skrypt_java(Integer[][] tablica, String strategia)
    {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName(silnik);
        Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("tablica", tablica);
        try {
            JSObject wynik = (JSObject) engine.eval(new FileReader(sciezka + "\\" + strategia +".js"));
            wspolrzedne = wynik.getMember("x") + "" +wynik.getMember("y");

        } catch (ScriptException | FileNotFoundException ex)
        {
            System.err.println("Blad");
        }
        return wspolrzedne;
    }


    public static Pair<Integer, Integer> cpp_native(Integer[][] tablica){

        Pair<Integer, Integer> wspolrzedne;
        Biblioteka cpp = new Biblioteka();

        int[] tab = new int[(int) Math.pow(5,2)];
        for(int i=0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                tab[i * 5 + j] = tablica[i][j];
            }
        }
        int[] wsporzedne_cpp;

        wsporzedne_cpp = cpp.losowy_ruch(tab);
        wspolrzedne = new Pair<>(wsporzedne_cpp[0],wsporzedne_cpp[1]);

        return wspolrzedne;
    }

}
