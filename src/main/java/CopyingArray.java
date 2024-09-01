public class CopyingArray {

    public static void main(String[] args) {
        int[] oldArray = {1,2,3,4,5};
        int[] newArrya = new int[oldArray.length+5];
        System.arraycopy(oldArray,0,newArrya,2,oldArray.length);
        for (int num:newArrya){
            System.out.println(num);
        }
    }
}
