import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,1,3};
        Arrays.sort(array);
        int answerCount = 0;
        int c=0;
        for(int i=array.length-1; i>=0 ;i--){
            if(i==array.length-1){
                System.out.println(i+" "+array[i]+" "+c);
                if(array[i]==c){
                    answerCount+=1;
                }
                c++;
            }

//            This is the interesting part, where this piece of code can handle this same question if the repetition
//            of numbers/elements is considered as a single unit of number

//            else if(array[i]==array[i+1]){
//                c--;
//                System.out.println(i+" "+array[i]+" "+c);
//                if(array[i]==c){
//                    answerCount+=1;
//                }
//                c++;
//            }

            else{
                System.out.println(i+" "+array[i]+" "+c);
                if(array[i]==c){
                    answerCount+=1;
                }
                c++;
            }
        }
        System.out.println(answerCount);
    }
}