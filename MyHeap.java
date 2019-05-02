public class MyHeap{
  private static void pushDown(int[]data,int size,int index){
      while ( size > 0 &&  2 * index+1 < data.length && 2 * index+2 < data.length ){ //if the child (left cause if theres no left theres no right) is out then stop
          
          if ( data[2 * index+1] > data[2 * index+2] ){
              int temp = data[index];
              data[index] = data[2 * index+1];   //youre going through heap wrong, dont check all only index
              data[2 * index+1] = temp;
              index = 2 * index+1;
          }
          else{
              int temp = data[index];
              data[index] = data[2 * index+2];
              data[2 * index+2] = temp;
              index = 2 * index+2;
          }
      }
  }

  private static void pushUp(int[]data,int index){
      while (index !=0 && !(data[index] < data[(index - 1) / 2])){  //if parent is larger or index is zero (top of heap)
              int hold = data [index];
              data [index] = data [(index - 1) / 2];
              data [(index - 1) / 2] = hold;
              index = (index - 1) / 2;

              //System.out.println(HeapHelp.toString(data));
      }
  }


  public static void heapify(int[] a){
    int index = a.length - 1;
    while (index >= 0){
        if(2 * index + 2 > a.length - 1){
            if (2 * index + 1 > a.length - 1){
                index--;
            }
        }
        // goes from bottom of the list to top to see if all the parents and children follow heap rules
        pushDown(a, a.length, index);
        // if not fix them
        index --;
    }
}

public static void main(String[] args){
  int[] test = {1,2,4,0,0,1,2};
  System.out.println(HeapHelp.toString(test));
  heapify(test);
  //pushDown(test,3,0);
  System.out.println(HeapHelp.toString(test));

  //int[] test1 = {51,2,4,0,0,1,5};
  //System.out.println(HeapHelp.toString(test1));
  //pushUp(test1,6);
//System.out.println(HeapHelp.toString(test1));
}

}
