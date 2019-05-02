public class MyHeap{
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

    private static void pushUp(int[]data,int index){
        int parent = data[index];
        boolean done = false;
        while (!done){
            if (index == 0){
                done = true;
            }
            if (data[index] < data[(index + 1) / 2]){
                done = true;
            }
            else{
                int hold = data [index];
                data [index] = data [(index + 1) / 2];
                data [(index + 1) / 2] = hold;
                index = (index + 1) / 2;
            }
        }
    }

    public static void main(String[] args){
      int[] test = {3,2,4};
      System.out.println(HeapHelp.toString(test));
      pushDown(test,3,0);
      System.out.println(HeapHelp.toString(test));
    }

}
