package com.javaPractice.spring.basics.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired //Interface dependency
    private SortAlgorithms sortAlgo;

    public BinarySearchImpl(SortAlgorithms sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] numbers, int target){
        //Sort Array
            //bubblesort -> tightly coupled with this algo
            //why?  If you want to use quick sort instead you have to change the whole algorithm 
            //instead create a bubble sort function to call
            int[] sortedNums = sortAlgo.sort(numbers);
            System.out.println(sortAlgo);

        //Search Array

        //return result
        return 1;
    }

    
}