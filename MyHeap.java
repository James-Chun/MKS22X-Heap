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
      while (index !=0 && !(data[index] < data[(index - 1) / 2])){
              int hold = data [index];
              data [index] = data [(index - 1) / 2];
              data [(index - 1) / 2] = hold;
              index = (index - 1) / 2;

              System.out.println(HeapHelp.toString(data));
      }
  }

    public static void main(String[] args){
      int[] test = {3,2,4};
      System.out.println(HeapHelp.toString(test));
      pushDown(test,3,0);
      System.out.println(HeapHelp.toString(test));
    }

}
