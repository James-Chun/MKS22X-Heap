public class MyHeap{

    private MyHeap leftChild;
    private MyHeap rightChild;

    public MyHeap(MyHeap l, MyHeap r){
        leftChild = l;
        rightChild = r;
    }

    //We discussed these 2 methods already:
    private static void pushDown(int[]data,int size,int index){
        while ( 2 * index+1 < data.length && 2 * index+2 < data.length ){ //if the child (left cause if theres no left theres no right) is out then stop
            if ( data[index] > data[2 * index+1] ){
                int temp = data[index];
                data[index] = data[2 * index+1];   //youre going through heap wrong, dont check all only index
                data[2 * index+1] = temp;
                index = 2 * index+1;
            }
            if ( data[index]>data[2 * index+2] ){
                int temp = data[index];
                data[index] = data[2 * index+2];
                data[2 * index+2] = temp;
                index = 2 * index+2;
            }
        }
    }
        /*
         - size  is the number of elements in the data array.
         - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided that child is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
         - precondition: index is between 0 and size-1 inclusive
         - precondition: size is between 0 and data.length-1 inclusive.*/



    private static void pushUp(int[]data,int index){
      return;
    }
         /*- push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
         - precondition: index is between 0 and data.length-1 inclusive.*/


    //We will discuss this today:
    public static void heapify(int[] d){
      return;
        //possibly could do it recursively
    }
        //- convert the array into a valid heap. [ should be O(n) ]

    public static void heapsort(int[] d){
      return;
    }
        /*- sort the array [ should be O(nlogn) ] :
         converting it into a heap
         removing the largest value n-1 times (remove places at end of the sub-array).*/


    public static void main(String[] args){
      int[] test = {3,2,4};
      pushDown(test,3,0);
      System.out.println(test);
    }

}
