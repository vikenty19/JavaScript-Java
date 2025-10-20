import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewExamples {
    public static void main(String[] args) {
        //max diff between adjacent index
        int []a ={1,4,4,15,17};
        int maxDelta = 0;
        for(int i = 0;i<a.length-1;i++){
            int delta =Math.abs(a[i+1]-a[i]);
            if(delta> maxDelta){
                maxDelta=delta;

        }

    } System.out.println(maxDelta);
        // Task with aster
        String aster ="*";
        for (int i =0;i<5;i++){
            System.out.println(aster);
            aster=aster+("*");
        }
        System.out.println("*");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
                System.out.print("\t");

            }
            System.out.println();

        }


        ///////sort array
        int[]c ={1,4,4,15,17};
        int[]d = {6,4,3,7,17};

        System.out.println(Arrays.toString(createArray(c,d)));
        for (Object temp:createArray(c,d)){
            System.out.println(temp);
        }
        int[]cd ={1,20,4,15,17};
        System.out.println(Arrays.toString(sortArrayDesc(cd)));
     /*   for (Object temp:sortArray()){
            System.out.println(temp);
        }*/
    }

    public static Object[] createArray(int[]a, int[]b){
    //    int[]a ={1,4,4,15,17};
    //    int[]b = {6,4,3,7,17};
        List<Integer>newArray= new ArrayList<>();
        for(int i =0;i<a.length;i++){
        //    for(int j = 0;j<b.length;j++){
                if(a[i]==b[i]){
                    newArray.add(a[i]);
                }
            }

        return newArray.toArray();

    }

    public  static int[] sortArray(int[]c){
        for (int i=0;i<c.length-1;i++){
           for(int j =0;j<c.length-1-i;j++){
                if (c[j] > c[j+1]) {
                  int temp = c[j];
                   c[j] =c[j+1];
                   c[j+1]=temp;
                }
            }
        }
        return  c;
    }
    public  static int[] sortArrayDesc(int[]c){
        for (int i=0;i<c.length-1;i++){
            for(int j =0;j<c.length-1-i;j++){
                if (c[j] < c[j+1]) {
                    int temp = c[j];
                    c[j] =c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        return  c;
    }
}
