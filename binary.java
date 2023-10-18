public class binary {
static void mugi(int []arr , int khate){
    int l=0,r=arr.length;
    while(l<=r){
    int m = r+(l-r)/2;
    if(arr[m]==khate){
        System.out.println("Element found in index " + m);
        return ;
    }else if(arr[m]>khate){
        r=m-1;
    }else{
        l=m+1;
    }
}
System.out.println("Element not found ");
}

public static void main(String[] args) {
    int[] aa = {1,10,230,444,567,766,6969};
    int khate=766;
    long start =System.nanoTime();
     mugi(aa, khate);
    long end = System.nanoTime();
    float  time= (end - start)/1000;
    System.out.println("Time taken : "+time);
    
}
}
