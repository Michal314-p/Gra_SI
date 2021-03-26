
#include <bits/stdc++.h>
#include "nat_Biblioteka.h"
#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <stdio.h>

using namespace std;


std::pair<int,int> losowy(int board[5][5])
{
	unsigned long j;
	srand( (unsigned)time(NULL));
	int wspolrzedne_x,wspolrzedne_y;
	while(true)
	{
	    wspolrzedne_x=rand() % 5;
	    wspolrzedne_y=rand() % 5;
	    if(board[wspolrzedne_x][wspolrzedne_y]==0)
	    {
		    break;
	    }
	}
	return std::make_pair(wspolrzedne_x, wspolrzedne_y);
}

JNIEXPORT jintArray JNICALL Java_nat_Biblioteka_losowy_1ruch(JNIEnv *env, jobject thisObject, jintArray javaArray)
{
    jintArray wynik;
    wynik = env->NewIntArray(2);
    jint *array = env->GetIntArrayElements(javaArray, JNI_FALSE);
    int size = 5;
    int tablica[5][5];

    for (int i = 0; i < size; i++)
    {
	    for(int j = 0; j < size; j++)
	    {
		    tablica[i][j] = array[i*size+j];
	    }
    }
	std::pair<int,int> wspolrzedne = losowy(tablica);
	jint fill[2];
	fill[0]=wspolrzedne.first;
	fill[1]=wspolrzedne.second;
	env->SetIntArrayRegion(wynik, 0, 2, fill);
	return wynik;
}




