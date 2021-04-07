// Quicksort_StaticLib.cpp : Defines the functions for the static library.
//

// #include "pch.h"

// #include <iostream> 
#include <time.h>


void swap(int* a, int* b)
{
	int t = *a;
	*a = *b;
	*b = t;
}

int partition(int *A, int lo, int hi) {
	int pivot = A[hi];
	int i = lo;
	int j = lo;

	for (j = lo; j < hi; j++) {
		if (A[j] <= pivot) {
			swap(&A[i], &A[j]);
			i++;
		}
	}
	swap(&A[i], &A[hi]);
	return i;
}

void quicksort(int *A, int lo, int hi) {
	if (lo < hi) {
		int p = partition(A, lo, hi);
		quicksort(A, lo, p - 1);
		quicksort(A, p + 1, hi);
	}
}