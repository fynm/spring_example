package com.javaPractice.spring.basics.springexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgorithms{
    public int[] sort(int[] nums){
        //Quick sort logic here
        return nums;
    }
}