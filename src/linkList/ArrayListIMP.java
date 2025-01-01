package linkList;

import interfacee.ArrayListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIMP implements ArrayListInterface {
    public  static int arraySize=5;
    public static int counter=1;
    private static int[] array = new int[arraySize];
    private int index = 0;
    @Override
    public int size() {
        int temp = 0;
        for (int i=0;i<array.length;i++) {
            if(array[i]==999) {
                temp=i;
            }
        }
        return temp;
    }

    @Override
    public List<Integer> add(int val) {
        if (index == array.length) {
            counter++;
            int [] arrayNew=new int[arraySize*(counter)];
            for (int i = 0; i < array.length; i++) {
                if(array[i]!=999) {
                    arrayNew[i] = array[i];
                }
            }
        }
            array[index] = val;
            index++;
            return List.of();
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < array.length; i++) {
            array[i] = array[i + 1];
        }
        if (index == array.length) {
            array[index] = 999;
        }
        System.out.println("remove done! "+index);
    }

    @Override
    public int get(int index) {
//        if(array[index] == 999){
//            return 0
//        }
        return array[index];
    }

    /*public  static ArrayList<Integer> add(int val){
        demoList.add(val);
        System.out.println("add dine! "+ val + " " + demoList);
        return  demoList;
    }
    public static void removeByIndex(int index){
        boolean flag=false;
        int tempI=0;
        for(int i=0;i<demoList.size();i++){
            if(demoList.get(i).equals(index)){
                demoList.remove(i);
                flag=true;
                tempI=i;
                System.out.println("remove dine! "+ demoList.get(i) + " " + demoList);
            }
        }
        if(flag){
            for (int i=tempI;i<demoList.size();i++){
                demoList.set(i, demoList.get(i++));
            }
        }

    }
*/

}
