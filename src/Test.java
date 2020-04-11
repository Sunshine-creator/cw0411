import  java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        Integer [] intArrary = {new Integer(2), new Integer(4),new Integer(3)};
        Double[] doubleArrary = {new Double(3.4),new Double(1.3),new Double(-22.1)};
        Character[] charArrary = {new Character('a'),new Character(']'),new Character('r')};
        String[] stringArrary = {"Tom","John","Fred"};
        sort(intArrary);
        sort(doubleArrary);
        sort(charArrary);
        sort(stringArrary);
        System.out.println("Sorted Integer objects");
        System.out.println("Sorted Double objects");
        System.out.println("Sorted Character objects");
        System.out.println("Sorted String objects");
    }
    public  static  void sort(Comparable[] list){
        Comparable currentMin;
        int currentMinIndex;
        for(int i =0;i<list.length-1;i++){
            currentMin = list[i];
            currentMinIndex = i;
            for(int j =i+1;i<list.length;i++){
                if(currentMin.compareTo(list[j])>0){
                  currentMin =list[j];
                  currentMinIndex =j;
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex] =list[i];
                list[i] =currentMin;
            }
        }
    }
    public  static  void  printList(Object[] list){
        for(int i =0;i<list.length;i++){
            System.out.print(list[i] + "");
            System.out.println();
        }
    }
}
