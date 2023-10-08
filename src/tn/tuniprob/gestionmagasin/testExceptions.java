package tn.tuniprob.gestionmagasin;

import java.util.Arrays;

public class testExceptions {
    int i ;
    int v;
    int arr[]=new int[5] ;
    testExceptions(int index ,int val){
        if(index>5)
        {
            throw new ArrayIndexOutOfBoundsException("fik ") ;
        }
        arr[i]=val ;
    }

    @Override
    public String toString() {
        return "testExceptions{" +
                "i=" + i +
                ", v=" + v +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
