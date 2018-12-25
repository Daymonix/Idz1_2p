import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static Manager[] array;
    public static void main(String[] args) {
        array = new Manager[10];
        array[0] = new Manager("BManager1", 25,true);
        array[1] = new Manager("AManager2", 21,true);
        array[2] = new Manager("CManager3", 22,false);
        array[3] = new Manager("EManager4", 23,true);
        array[4] = new Manager("KManager5", 24,false);
        array[5] = new Manager("GManager6", 25,true);
        array[6] = new Manager("HManager7", 26,false);
        array[7] = new Manager("ZManager8", 27,true);
        array[8] = new Manager("TManager9", 28,false);
        array[9] = new Manager("TManager10", 29,true);
        /*Первый вывод массива*/
        for (int i=0;i<array.length;i++){
            array[i].toString();
            System.out.println(array[i].toString());

        }
        /*Второй с сортировкой по возрасту пузырьком*/
        Manager[] arrForSorting =  AvarageAge(array);
        Manager[] SortArr = bubbleSort(arrForSorting);
        for (int i=0;i<SortArr.length-1;i++){
            SortArr[i].toString();
            System.out.println(SortArr[i].toString());
        }


        Arrays.sort(SortArr);
        for(int i = 0; i <  SortArr.length; i++) {
            System.out.print(SortArr[i].toString());
        }

    }
    /*Выводим средний возраст*/
    public static Manager[] AvarageAge(Manager[] array){
        Integer avAge = 0;
        Integer count = 0;
        for (int i=0;i<array.length;i++){
            if(array[i].isGood == true){
                avAge += array[i].Age;
                count++;
            }
        }
        Manager[] newArr = new Manager[count];
        count = 0;
        for (int i=0;i<array.length;i++){
            if(array[i].isGood == true){
                newArr[count] = array[i];
                count++;
            }
        }
        avAge = avAge/count;
        System.out.println("Средний возраст "+ avAge + "\n Справляются с обязанностями "+ count);
        return newArr;
    }
    /*Сортировка по возрасту*/
    public static Manager[] bubbleSort(Manager[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j].Age > arr[j+1].Age ){
                Manager tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        return arr;
}

}
