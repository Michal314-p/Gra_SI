package glowna;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;



import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import obsluga.Obsluga_skryptow;

import javax.imageio.ImageIO;


public class Gra_Controller implements Initializable
{

    @FXML Button p1 ;
    @FXML Button p2 ;
    @FXML Button p3 ;
    @FXML Button p4 ;
    @FXML Button p5 ;
    @FXML Button p6 ;
    @FXML Button p7 ;
    @FXML Button p8 ;
    @FXML Button p9 ;
    @FXML Button p10 ;
    @FXML Button p11 ;
    @FXML Button p12 ;
    @FXML Button p13 ;
    @FXML Button p14 ;
    @FXML Button p15 ;
    @FXML Button p16 ;
    @FXML Button p17 ;
    @FXML Button p18 ;
    @FXML Button p19 ;
    @FXML Button p20 ;
    @FXML Button p21 ;
    @FXML Button p22 ;
    @FXML Button p23 ;
    @FXML Button p24 ;
    @FXML Button p25 ;
    @FXML Label gracz;
    @FXML Label zwyciezca;
    @FXML ChoiceBox algorytmy;
    @FXML ImageView obrazek;

    public Image mario;
    public Image luigi;
    public Image bowser;


    String rodzaj_skryptu = null;
    static int k1 = 0;
    static int k2 = 0;
    static boolean flag = true;
    public Integer wygrana_gracz_z = 0;
    public Integer wygrana_gracz_c = 0;
    public Integer tura_gracza = null;
    public Integer tablica[][] = { {0, 0, 0, 0,0}, {0, 0, 0, 0,0},{0, 0, 0, 0,0},{0, 0, 0, 0,0},{0, 0, 0, 0,0} };


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        FileInputStream input = null;
        try {
            input = new FileInputStream("C:/Users/Sorin/Desktop/java/GraKK/src/obrazki/luigi.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        luigi = new Image(input);

        try {
            input = new FileInputStream("C:/Users/Sorin/Desktop/java/GraKK/src/obrazki/mario.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        mario = new Image(input);

        try {
            input = new FileInputStream("C:/Users/Sorin/Desktop/java/GraKK/src/obrazki/bowser.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bowser = new Image(input);

        obrazek.setImage(luigi);
        tura_gracza = 1;
        gracz.setText("Zielony");
        gracz.setStyle("-fx-text-fill: #00ff00");

        setup_wstepny();
    }


    public void klik_1()
    {
        if(tura_gracza == 1)
        {
            p1.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[0][0] = 1;
            zmiana_gracza(2);

        }
        else if(tura_gracza == 2)
        {
            p1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[0][0] = 2;
            zmiana_gracza(1);

        }
        p1.setDisable(true);
    }

    public void klik_2()
    {
        if(tura_gracza == 1)
        {
            p2.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[0][1] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p2.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[0][1] = 2;
            zmiana_gracza(1);
        }
        p2.setDisable(true);
    }

    public void klik_3()
    {
        if(tura_gracza == 1)
        {
            p3.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[0][2] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p3.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[0][2] = 2;
            zmiana_gracza(1);
        }
        p3.setDisable(true);
    }

    public void klik_4()
    {
        if(tura_gracza == 1)
        {
            p4.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[0][3] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p4.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[0][3] = 2;
            zmiana_gracza(1);
        }
        p4.setDisable(true);
    }

    public void klik_5()
    {
        if(tura_gracza == 1)
        {
            p5.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[0][4] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p5.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[0][4] = 2;
            zmiana_gracza(1);
        }
        p5.setDisable(true);
    }

    public void klik_6()
    {
        if(tura_gracza == 1)
        {
            p6.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[1][0] = 1;
            zmiana_gracza(2);

        }
        else if(tura_gracza == 2)
        {
            p6.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[1][0] = 2;
            zmiana_gracza(1);

        }
        p6.setDisable(true);
    }

    public void klik_7()
    {
        if(tura_gracza == 1)
        {
            p7.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[1][1] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p7.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[1][1] = 2;
            zmiana_gracza(1);
        }
        p7.setDisable(true);
    }

    public void klik_8()
    {
        if(tura_gracza == 1)
        {
            p8.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[1][2] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p8.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[1][2] = 2;
            zmiana_gracza(1);
        }
        p8.setDisable(true);
    }

    public void klik_9()
    {
        if(tura_gracza == 1)
        {
            p9.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[1][3] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p9.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[1][3] = 2;
            zmiana_gracza(1);
        }
        p9.setDisable(true);
    }

    public void klik_10()
    {
        if(tura_gracza == 1)
        {
            p10.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[1][4] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p10.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[1][4] = 2;
            zmiana_gracza(1);
        }
        p10.setDisable(true);
    }

    public void klik_11()
    {
        if(tura_gracza == 1)
        {
            p11.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[2][0] = 1;
            zmiana_gracza(2);

        }
        else if(tura_gracza == 2)
        {
            p11.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[2][0] = 2;
            zmiana_gracza(1);

        }
        p11.setDisable(true);
    }

    public void klik_12()
    {
        if(tura_gracza == 1)
        {
            p12.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[2][1] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p12.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[2][1] = 2;
            zmiana_gracza(1);
        }
        p12.setDisable(true);
    }

    public void klik_13()
    {
        if(tura_gracza == 1)
        {
            p13.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[2][2] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p13.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[2][2] = 2;
            zmiana_gracza(1);
        }
        p13.setDisable(true);
    }

    public void klik_14()
    {
        if(tura_gracza == 1)
        {
            p14.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[2][3] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p14.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[2][3] = 2;
            zmiana_gracza(1);
        }
        p14.setDisable(true);
    }

    public void klik_15()
    {
        if(tura_gracza == 1)
        {
            p15.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[2][4] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p15.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[2][4] = 2;
            zmiana_gracza(1);
        }
        p15.setDisable(true);
    }

    public void klik_16()
    {
        if(tura_gracza == 1)
        {
            p16.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[3][0] = 1;
            zmiana_gracza(2);

        }
        else if(tura_gracza == 2)
        {
            p16.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[3][0] = 2;
            zmiana_gracza(1);

        }
        p16.setDisable(true);
    }

    public void klik_17()
    {
        if(tura_gracza == 1)
        {
            p17.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[3][1] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p17.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[3][1] = 2;
            zmiana_gracza(1);
        }
        p17.setDisable(true);
    }

    public void klik_18()
    {
        if(tura_gracza == 1)
        {
            p18.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[3][2] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p18.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[3][2] = 2;
            zmiana_gracza(1);
        }
        p18.setDisable(true);
    }

    public void klik_19()
    {
        if(tura_gracza == 1)
        {
            p19.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[3][3] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p19.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[3][3] = 2;
            zmiana_gracza(1);
        }
        p19.setDisable(true);
    }

    public void klik_20()
    {
        if(tura_gracza == 1)
        {
            p20.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[3][4] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p20.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[3][4] = 2;
            zmiana_gracza(1);
        }
        p20.setDisable(true);
    }

    public void klik_21()
    {
        if(tura_gracza == 1)
        {
            p21.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[4][0] = 1;
            zmiana_gracza(2);

        }
        else if(tura_gracza == 2)
        {
            p21.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[4][0] = 2;
            zmiana_gracza(1);

        }
        p21.setDisable(true);
    }

    public void klik_22()
    {
        if(tura_gracza == 1)
        {
            p22.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[4][1] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p22.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[4][1] = 2;
            zmiana_gracza(1);
        }
        p22.setDisable(true);
    }

    public void klik_23()
    {
        if(tura_gracza == 1)
        {
            p23.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[4][2] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p23.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[4][2] = 2;
            zmiana_gracza(1);
        }
        p23.setDisable(true);
    }

    public void klik_24()
    {
        if(tura_gracza == 1)
        {
            p24.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[4][3] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p24.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[4][3] = 2;
            zmiana_gracza(1);
        }
        p24.setDisable(true);
    }

    public void klik_25()
    {
        if(tura_gracza == 1)
        {
            p25.setStyle("-fx-border-color: #008000; -fx-border-width: 5px; -fx-background-color: #00ff00");
            tablica[4][4] = 1;
            zmiana_gracza(2);
        }
        else if(tura_gracza == 2)
        {
            p25.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px; -fx-background-color: #b22222");
            tablica[4][4] = 2;
            zmiana_gracza(1);
        }
        p25.setDisable(true);
    }



    public void zmiana_gracza(int jaki)
    {
        if(jaki == 2)
        {
            obrazek.setImage(mario);
            tura_gracza = 2;
            gracz.setText("Czerwony");
            gracz.setStyle("-fx-text-fill: #b22222");
        }
        if(jaki == 1)
        {
            obrazek.setImage(luigi);
            tura_gracza = 1;
            gracz.setText("Zielony");
            gracz.setStyle("-fx-text-fill: #00ff00");
        }

        sprawdz_wygrana();

        boolean remis = true;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(tablica[i][j]==0)
                {
                    remis = false;
                    break;
                }
            }
        }
        if(remis==true)
        {
            zwyciezca.setText("REMIS!!!");
            obrazek.setImage(bowser);
        }
    }

    public void sprawdz_wygrana()
    {
        /**Poziomo------------------------------**/
        for (int i = 0;i<5;i++)
        {
            for (int j =0;j<5;j++)
            {
                czytnik_zielony(tablica[i][j]);
            }
            wygrana_zeruj();
        }
        for (int i = 0;i<5;i++)
        {
            for (int j =0;j<5;j++)
            {
                czytnik_czerwony(tablica[i][j]);
            }
            wygrana_zeruj();
        }
        wygrana_zeruj();

        /**Pionowo------------------------------**/
        for (int i = 0;i<5;i++)
        {
            for (int j =0;j<5;j++)
            {
                czytnik_czerwony(tablica[j][i]);
            }
            wygrana_zeruj();
        }
        for (int i = 0;i<5;i++)
        {
            for (int j =0;j<5;j++)
            {
                czytnik_zielony(tablica[j][i]);
            }
            wygrana_zeruj();
        }
        wygrana_zeruj();

        /**Lewa góra------------------------------**/
        for (int line = 1; line <= (5 + 5 - 1); line++)
        {
            int start_col = max(0, line - 5);
            int count = min3(line, (5 - start_col), 5);
            for (int j = 0; j < count; j++)
            {
                czytnik_zielony(tablica[min2(5, line) - j - 1][start_col + j]);
            }
            wygrana_zeruj();
        }

        for (int line = 1; line <= (5 + 5 - 1); line++)
        {
            int start_col = max(0, line - 5);
            int count = min3(line, (5 - start_col), 5);
            for (int j = 0; j < count; j++)
            {
                czytnik_czerwony(tablica[min2(5, line) - j - 1][start_col + j]);
            }
            wygrana_zeruj();
        }
        wygrana_zeruj();


        /**Lewa dół------------------------------**/
        czerwony_dol_skos(tablica,0,0,5,5);
        wygrana_zeruj();
        k1 = 0;
        k2 = 0;
        flag = true;
        zielony_dol_skos(tablica,0,0,5,5);
        wygrana_zeruj();
        k1 = 0;
        k2 = 0;
        flag = true;
        wygrana_zeruj();

    }



    boolean czerwony_dol_skos(Integer m[][], int i, int j, int rzad, int kolumna)
    {
        if (i >= rzad || j >= kolumna)
        {
            if (flag)
            {
                int a = k1;
                k1 = k2;
                k2 = a;
                flag = !flag;
                k1++;
            }
            else
            {
                int a = k1;
                k1 = k2;
                k2 = a;
                flag = !flag;
            }
            return false;
        }
        czytnik_czerwony(m[i][j]);
        if (czerwony_dol_skos(m, i + 1, j + 1, rzad, kolumna))
        {
            return true;
        }
        wygrana_zeruj();
        if (czerwony_dol_skos(m, k1, k2, rzad, kolumna))
        {
            return true;
        }
        wygrana_zeruj();
        return true;
    }

    boolean zielony_dol_skos(Integer m[][], int i, int j, int rzad, int kolumna)
    {
        if (i >= rzad || j >= kolumna)
        {
            if (flag)
            {
                int a = k1;
                k1 = k2;
                k2 = a;
                flag = !flag;
                k1++;
            }
            else
            {
                int a = k1;
                k1 = k2;
                k2 = a;
                flag = !flag;
            }
            return false;
        }
        czytnik_zielony(m[i][j]);
        if (zielony_dol_skos(m, i + 1, j + 1, rzad, kolumna))
        {
            return true;
        }
        wygrana_zeruj();
        if (zielony_dol_skos(m, k1, k2, rzad, kolumna))
        {
            return true;
        }
        wygrana_zeruj();
        return true;
    }




    static int min2(int a, int b) {
        return (a < b) ? a : b;
    }


    static int min3(int a, int b, int c) {
        return min2(min2(a, b), c);
    }


    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public void wygrana_zeruj()
    {
        if(wygrana_gracz_c < 4)
        {
            wygrana_gracz_c = 0;
        }
        if(wygrana_gracz_z < 4)
        {
            wygrana_gracz_z = 0;
        }
    }

    public void zablokuj_odblokuj(boolean blokowanie)
    {
        p1.setDisable(blokowanie);
        p2.setDisable(blokowanie);
        p3.setDisable(blokowanie);
        p4.setDisable(blokowanie);
        p5.setDisable(blokowanie);
        p6.setDisable(blokowanie);
        p7.setDisable(blokowanie);
        p8.setDisable(blokowanie);
        p9.setDisable(blokowanie);
        p10.setDisable(blokowanie);
        p11.setDisable(blokowanie);
        p12.setDisable(blokowanie);
        p13.setDisable(blokowanie);
        p14.setDisable(blokowanie);
        p15.setDisable(blokowanie);
        p16.setDisable(blokowanie);
        p17.setDisable(blokowanie);
        p18.setDisable(blokowanie);
        p19.setDisable(blokowanie);
        p20.setDisable(blokowanie);
        p21.setDisable(blokowanie);
        p22.setDisable(blokowanie);
        p23.setDisable(blokowanie);
        p24.setDisable(blokowanie);
        p25.setDisable(blokowanie);
    }

    public void zwyciestwoc()
    {
        obrazek.setImage(mario);
        zwyciezca.setText("Wygrywa gracz czerwony!!!");
        zablokuj_odblokuj(true);
    }

    public void zwyciestwoz()
    {
        obrazek.setImage(luigi);
        zwyciezca.setText("Wygrywa gracz zielony!!!");
        zablokuj_odblokuj(true);
    }

    public void czytnik_czerwony(int tab)
    {
        if(tab==2)
        {
            wygrana_gracz_c+=1;
        }
        else
        {
            wygrana_gracz_c=0;
        }
        if(wygrana_gracz_c==4)
        {
            zwyciestwoc();
        }
    }

    public void czytnik_zielony(int tab)
    {
        if(tab==1)
        {
            wygrana_gracz_z+=1;
        }
        else
        {
            wygrana_gracz_z=0;
        }
        if(wygrana_gracz_z==4)
        {
            zwyciestwoz();
        }
    }

    public void setup_wstepny()
    {
        p1.setStyle("-fx-background-color:#3c7fb1; -fx-border-color: black; -fx-border-width: 5px");
        p2.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p3.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p4.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p5.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p6.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p7.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p8.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p9.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p10.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p11.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p12.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p13.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p14.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p15.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p16.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p17.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p18.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p19.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p20.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p21.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p22.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p23.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p24.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
        p25.setStyle("-fx-background-color:#3c7fb1;-fx-border-color: black; -fx-border-width: 5px");
    }

    public void pomoc_SI()
    {
        String wybor = String.valueOf(algorytmy.getValue());
        Obsluga_skryptow hand = new Obsluga_skryptow();
        wybor_komputera(hand.wybor(wybor,rodzaj_skryptu,tablica));
    }

    public void reset()
    {
        zwyciezca.setText("");
        wygrana_zeruj();
        tura_gracza = 1;
        gracz.setText("Zielony");
        gracz.setStyle("-fx-text-fill: #00ff00");
        tablica= new Integer[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        zablokuj_odblokuj(false);
        setup_wstepny();
    }

    public void wybor_komputera(String wybor)
    {
        if(wybor.equals("00")){klik_1();}
        if(wybor.equals("01")){klik_2();}
        if(wybor.equals("02")){klik_3();}
        if(wybor.equals("03")){klik_4();}
        if(wybor.equals("04")){klik_5();}
        if(wybor.equals("10")){klik_6();}
        if(wybor.equals("11")){klik_7();}
        if(wybor.equals("12")){klik_8();}
        if(wybor.equals("13")){klik_9();}
        if(wybor.equals("14")){klik_10();}
        if(wybor.equals("20")){klik_11();}
        if(wybor.equals("21")){klik_12();}
        if(wybor.equals("22")){klik_13();}
        if(wybor.equals("23")){klik_14();}
        if(wybor.equals("24")){klik_15();}
        if(wybor.equals("30")){klik_16();}
        if(wybor.equals("31")){klik_17();}
        if(wybor.equals("32")){klik_18();}
        if(wybor.equals("33")){klik_19();}
        if(wybor.equals("34")){klik_20();}
        if(wybor.equals("40")){klik_21();}
        if(wybor.equals("41")){klik_22();}
        if(wybor.equals("42")){klik_23();}
        if(wybor.equals("43")){klik_24();}
        if(wybor.equals("44")){klik_25();}
    }

    public void cpp()
    {
        algorytmy.getItems().clear();
        algorytmy.getItems().add("losowy");
        rodzaj_skryptu = "cpp";
    }

    public void js()
    {
        algorytmy.getItems().clear();
        File folder = new File("C:\\Users\\Sorin\\Desktop\\java\\GraKK\\src\\nashorn_skrypty");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles)
        {
            if (file.isFile())
            {
                String usun;
                String skrypt = file.getName();
                usun = skrypt.replaceAll(".js", "");
                algorytmy.getItems().add(usun);
            }
        }
        rodzaj_skryptu = "js";
    }
}
