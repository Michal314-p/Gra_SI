package inne;

import java.util.ArrayList;

public class minimax {



    private boolean sprawdz_czy_pelna(Integer[][] tablica)
    {
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if (tablica[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public String wykonaj(Integer[][] tablica) {
        int wspolrzedna_x = 0;
        int wspolrzedna_y = 0;
        int player = 2; // O
        int najlepsza_wartosc = Integer.MIN_VALUE;

        for(int j = 0; j < 5; j++)
        {
            for (int i = 0; i < 5; i++)
            {
                if(tablica[j][i]==0)
                {
                    tablica[j][i]=player;
                    // dla 1 minimalizacja, dla -1 maksymalizacja
                    int aktualna_wartosc = mini_maks(1, tablica, 0);
                    tablica[j][i]=0;

                    if(aktualna_wartosc > najlepsza_wartosc)
                    {
                        wspolrzedna_x = j;
                        wspolrzedna_y = i;
                        najlepsza_wartosc = aktualna_wartosc;
                    }
                }
            }
        }

        String wynik = null;
        wynik = wspolrzedna_x + "" + wspolrzedna_y;
        return wynik;
    }

    public int wartosc_wynik_ruchu(Integer[][] tablica)
    {
        int wynik_score = 0;
        int powtorki = 2;
        // diagonals 8
        // ((1|0 2|1 3|2 4|3 (I NA ODWROT))) + ((0|0 1|1 2|2 3|3 + 1|1 2|2 3|3 4|4)) (GÓRA -> DÓł)
        // ((3|0 2|1 1|2 0|3 + 4|1 3|2 2|3 1|4)) + ((4|0 3|1 2|2 1|3 + 3|1 2|2 1|3 0|4)) (DÓł -> GÓRA)

        // GÓRA -> DÓł
        for(int i = 0; i < powtorki; i++)
        {
            ArrayList<Integer> tor = new ArrayList<>(4);
            for (int j = 0; j < 4; j++)
            {
                if(i==0)
                {
                    tor.add(tablica[j+1][j]);
                }
                else {
                    tor.add(tablica[j][j+1]);
                }
            }
            wynik_score += wartosc_tory(tor);
        }

        for(int i = 0; i < powtorki; i++)
        {
            ArrayList<Integer> tor = new ArrayList<>(4);
            for(int j = 0; j < 4; j++)
            {
                tor.add(tablica[j+i][j+i]);
            }
            wynik_score += wartosc_tory(tor);
        }

        // DÓł -> GÓRA
        for(int i = 0; i < powtorki; i++)
        {
            ArrayList<Integer> tor = new ArrayList<>(4);
            for(int j = 0; j < 4; j++)
            {
                tor.add(tablica[5 -2-j+i][j+i]);
            }
            wynik_score += wartosc_tory(tor);
        }

        for (int i = 0; i < powtorki; i++)
        {
            ArrayList<Integer> tor = new ArrayList<>(4);
            for(int j = 0; j < 4; j++)
            {
                tor.add(tablica[5 -1-j-i][j+i]);
            }
            wynik_score += wartosc_tory(tor);
        }
        // horizontal 10
        // 0|0 0|1 0|2 0|3 + 0|1 0|2 0|3 0|4

        for(int h = 0; h < 5; h++)
        {
            for (int i = 0; i < powtorki; i++)
            {
                ArrayList<Integer> tor = new ArrayList<>(4);
                for (int j = 0; j < 4; j++)
                {
                    tor.add(tablica[h][j+i]);
                }
                wynik_score += wartosc_tory(tor);
            }
        }

        // vertical 10
        for(int h = 0; h < 5; h++)
        {
            for (int i = 0; i < powtorki; i++)
            {
                ArrayList<Integer> tor = new ArrayList<>(4);
                for (int j = 0; j < 4; j++)
                {
                    tor.add(tablica[j+i][h]);
                }
                wynik_score += wartosc_tory(tor);
            }
        }
        return wynik_score;
    }



    public int mini_maks(int gracz, Integer[][] tablica, int aktualna_depth)
    {
        int wynik_score = wartosc_wynik_ruchu(tablica);

        if(wynik_score >= 1000 && wynik_score != Integer.MAX_VALUE)
        {
            return 1000 - aktualna_depth; // prefer min depth
        }
        if (wynik_score <= -1000 && wynik_score != Integer.MIN_VALUE)
        {
            return -1000 + aktualna_depth; // prefer min depth
        }

        if(!sprawdz_czy_pelna(tablica))
        {
            return 0;
        }

        if(gracz == 2){ //maksymalizacja
            int najlepszy = Integer.MIN_VALUE;
            if(aktualna_depth >= 6)
            {
                return najlepszy;
            }
            for(int j = 0; j < 5; j++)
            {
                for (int i = 0; i < 5; i++)
                {
                    if(tablica[j][i]==0){
                        tablica[j][i]=gracz;

                        // dla 1 minimalizacja, dla -1 maksymalizacja
                        najlepszy = Math.max(najlepszy, mini_maks(1, tablica, aktualna_depth + 1));
                        tablica[j][i]=0;


                        return wynik_score;

                    }
                }
            }
        } else if (gracz == 1){ //minimalizacja
            int najlepszy = Integer.MAX_VALUE;
            if(aktualna_depth >= 6)
            {
                return najlepszy;
            }
            for(int j = 0; j < 5; j++)
            {
                for (int i = 0; i < 5; i++)
                {
                    if(tablica[j][i]==0){
                        tablica[j][i]=gracz;

                        // dla 1 minimalizacja, dla -1 maksymalizacja
                        najlepszy = Math.min(najlepszy, mini_maks(2, tablica, aktualna_depth + 1));
                        tablica[j][i]=0;


                        return wynik_score;

                    }
                }
            }
        }

        return wynik_score;

    }



    public int wartosc_tory(ArrayList<Integer> tor)
    {
        int wystapienias = 0;
        int wynik_score;
        int gracz = 0;

        // jesli to i to to 0
        if(tor.contains(1) && tor.contains(2))
        {
            return 0;
        }
        // jesli nie zawiera ani 1 ani -1 to 0
        else if(!tor.contains(1) && !tor.contains(2))
        {
            return 0;
        }
        else {
            // jesli zawiera 1 i nie zawiera -1 to zwroc
            if(tor.contains(1))
            {
                gracz = 1;
                int n = tor.size();
                for(int i = 0; i < n; i++)
                {
                    if(tor.get(i) == 1)
                    {
                        wystapienias++;
                    }
                }
            }
            // jesli zawiera -1 i nie zawiera 1 to zwroc
            else if(tor.contains(2))
            {
                gracz = 2;
                int n = tor.size();
                for(int i = 0; i < n; i++)
                {
                    if(tor.get(i) == 2)
                    {
                        wystapienias++;
                    }
                }
            }
        }

        /*
        +1000 for EACH 4-in-a-line
        +100 for EACH 3-in-a-line
        +10 for EACH 2-in-a-line
        +1 for EACH 1-in-a-line
         */
        wynik_score = (int) Math.pow(10, wystapienias - 1);

        if(gracz != 2)
        {
            wynik_score *= -2;
        }
        return wynik_score;
    }
}
