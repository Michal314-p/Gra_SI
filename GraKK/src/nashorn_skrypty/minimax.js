     sprawdz_czy_pelna = function (tablica) {
        for (var i = 0; i < 5; i++) {
            {
                for (var j = 0; j < 5; j++) {
                    {
                        if (tablica[i][j] === 0) {
                            return true;
                        }
                    }
                    ;
                }
            }
            ;
        }
        return false;
    };
    wykonaj = function (tablica) {
        var wspolrzedna_x = 0;
        var wspolrzedna_y = 0;
        var player = 2;
        var najlepsza_wartosc = -2147483648;
        for (var j = 0; j < 5; j++) {
            {
                for (var i = 0; i < 5; i++) {
                    {
                        if (tablica[j][i] === 0) {
                            tablica[j][i] = player;
                            var aktualna_wartosc = this.mini_maks(1, tablica, 0);
                            tablica[j][i] = 0;
                            if (aktualna_wartosc > najlepsza_wartosc) {
                                wspolrzedna_x = j;
                                wspolrzedna_y = i;
                                najlepsza_wartosc = aktualna_wartosc;
                            }
                        }
                    }
                    ;
                }
            }
            ;
        }
        var wynik = null;
        wynik = wspolrzedna_x + "" + wspolrzedna_y;
        return wynik;
    };
    wartosc_wynik_ruchu = function (tablica) {
        var wynik_score = 0;
        var powtorki = 2;
        for (var i = 0; i < powtorki; i++) {
            {
                var tor = ([]);
                for (var j = 0; j < 4; j++) {
                    {
                        if (i === 0) {
                            /* add */ (tor.push(tablica[j + 1][j]) > 0);
                        }
                        else {
                            /* add */ (tor.push(tablica[j][j + 1]) > 0);
                        }
                    }
                    ;
                }
                wynik_score += this.wartosc_tory(tor);
            }
            ;
        }
        for (var i = 0; i < powtorki; i++) {
            {
                var tor = ([]);
                for (var j = 0; j < 4; j++) {
                    {
                        /* add */ (tor.push(tablica[j + i][j + i]) > 0);
                    }
                    ;
                }
                wynik_score += this.wartosc_tory(tor);
            }
            ;
        }
        for (var i = 0; i < powtorki; i++) {
            {
                var tor = ([]);
                for (var j = 0; j < 4; j++) {
                    {
                        /* add */ (tor.push(tablica[5 - 2 - j + i][j + i]) > 0);
                    }
                    ;
                }
                wynik_score += this.wartosc_tory(tor);
            }
            ;
        }
        for (var i = 0; i < powtorki; i++) {
            {
                var tor = ([]);
                for (var j = 0; j < 4; j++) {
                    {
                        /* add */ (tor.push(tablica[5 - 1 - j - i][j + i]) > 0);
                    }
                    ;
                }
                wynik_score += this.wartosc_tory(tor);
            }
            ;
        }
        for (var h = 0; h < 5; h++) {
            {
                for (var i = 0; i < powtorki; i++) {
                    {
                        var tor = ([]);
                        for (var j = 0; j < 4; j++) {
                            {
                                /* add */ (tor.push(tablica[h][j + i]) > 0);
                            }
                            ;
                        }
                        wynik_score += this.wartosc_tory(tor);
                    }
                    ;
                }
            }
            ;
        }
        for (var h = 0; h < 5; h++) {
            {
                for (var i = 0; i < powtorki; i++) {
                    {
                        var tor = ([]);
                        for (var j = 0; j < 4; j++) {
                            {
                                /* add */ (tor.push(tablica[j + i][h]) > 0);
                            }
                            ;
                        }
                        wynik_score += this.wartosc_tory(tor);
                    }
                    ;
                }
            }
            ;
        }
        return wynik_score;
    };
    mini_maks = function (gracz, tablica, aktualna_depth) {
        var wynik_score = this.wartosc_wynik_ruchu(tablica);
        if (wynik_score >= 1000 && wynik_score !== 2147483647) {
            return 1000 - aktualna_depth;
        }
        if (wynik_score <= -1000 && wynik_score !== -2147483648) {
            return -1000 + aktualna_depth;
        }
        if (!this.sprawdz_czy_pelna(tablica)) {
            return 0;
        }
        if (gracz === 2) {
            var najlepszy = -2147483648;
            if (aktualna_depth >= 6) {
                return najlepszy;
            }
            for (var j = 0; j < 5; j++) {
                {
                    for (var i = 0; i < 5; i++) {
                        {
                            if (tablica[j][i] === 0) {
                                tablica[j][i] = gracz;
                                najlepszy = Math.max(najlepszy, this.mini_maks(1, tablica, aktualna_depth + 1));
                                tablica[j][i] = 0;

                                return wynik_score;

                            }
                        }
                        ;
                    }
                }
                ;
            }
        }
        else if (gracz === 1) {
            var najlepszy = 2147483647;
            if (aktualna_depth >= 6) {
                return najlepszy;
            }
            for (var j = 0; j < 5; j++) {
                {
                    for (var i = 0; i < 5; i++) {
                        {
                            if (tablica[j][i] === 0) {
                                tablica[j][i] = gracz;
                                najlepszy = Math.min(najlepszy, this.mini_maks(2, tablica, aktualna_depth + 1));
                                tablica[j][i] = 0;

                                return wynik_score;

                            }
                        }
                        ;
                    }
                }
                ;
            }
        }
        return wynik_score;
    };
    wartosc_tory = function (tor) {
        var wystapienias = 0;
        var wynik_score;
        var gracz = 0;
        if ((tor.indexOf((1)) >= 0) && (tor.indexOf((2)) >= 0)) {
            return 0;
        }
        else if (!(tor.indexOf((1)) >= 0) && !(tor.indexOf((2)) >= 0)) {
            return 0;
        }
        else {
            if ((tor.indexOf((1)) >= 0)) {
                gracz = 1;
                var n = tor.length;
                for (var i = 0; i < n; i++) {
                    {
                        if (tor[i] === 1) {
                            wystapienias++;
                        }
                    }
                    ;
                }
            }
            else if ((tor.indexOf((2)) >= 0)) {
                gracz = 2;
                var n = tor.length;
                for (var i = 0; i < n; i++) {
                    {
                        if (tor[i] === 2) {
                            wystapienias++;
                        }
                    }
                    ;
                }
            }
        }
        wynik_score = (Math.pow(10, wystapienias - 1) | 0);
        if (gracz !== 2) {
            wynik_score *= -2;
        }
        return wynik_score;
    };

var rozwiaz = function(tablica){


    var wspolrzedne = wykonaj(tablica);
    var wynik = {
        "x" : wspolrzedne[0],
        "y" : wspolrzedne[1]
    }
    return wynik;
};

rozwiaz(tablica);
