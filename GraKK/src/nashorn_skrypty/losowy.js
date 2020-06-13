var wykonaj_ruch = function(tablica){

    var wspolrzedne = losowe(tablica);
    var wynik = {
        "x" : wspolrzedne[0],
        "y" : wspolrzedne[1]
    }
    return wynik;
};


losowe = function (tablica) {
        var min = 0;
        var max = 5;
        var los_x = 0;
        var los_y = 0;
        while ((true)) {
            {
                var pelne = false;
                for (var i = 0; i < 5; i++) {
                    {
                        for (var j = 0; j < 5; j++) {
                            {
                                if (tablica[i][j] === 0) {
                                    pelne = true;
                                    break;
                                }
                            }
                            ;
                        }
                    }
                    ;
                }
                if (!pelne) {
                    los_x = 2147483647;
                    los_y = 2147483647;
                    break;
                }
                los_x = ((Math.random() * (max - min) + min) | 0);
                los_y = ((Math.random() * (max - min) + min) | 0);
                if (tablica[los_x][los_y] === 0) {
                    break;
                }
            }
        }
        ;
        var wynik = ([]);
        (wynik.push(los_x) > 0);
        (wynik.push(los_y) > 0);
        return wynik;
};
wykonaj_ruch(tablica);
