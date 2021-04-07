// Quicksort_Tester.cpp
//
// Copyright (c) Dr. Shiping Chen
//  
//

#include <iostream> 
#include <time.h>

// extern "C" {
void quicksort(int *,int,int);
// }


const int N = 10;


void initList(int *A)
{
	int i;

	srand(time(NULL));

	for (i = 0; i < N; i++)
		A[i] = rand() % 10 + 1;
}

void printList(int *A)
{
	int i;

	for (i = 0; i < N; i++)
		printf("%d  ", A[i]);
	printf("\n");
}


int main()
{
	int *A = new int[N] { 0 };
	int lo, hi;

	initList(A);
	printList(A);

	quicksort(A, 0, N-1);
	printList(A);

	return 1;
}