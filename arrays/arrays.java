public class arrays {

    public static void main(String[] args) {
        // defining and declaring the array

        int[] marks=new int[5];

          marks[0]=97;//physics
          marks[1]=98;//chemistry
          marks[2]=99;//maths
          marks[3]=78;//english
          marks[4]=100;//pysical education

        // System.out.println(marks[0]);
         //System.out.println(marks[1]);
         //System.out.println(marks[2]);
        // System.out.println(marks[3]);
       //  System.out.println(marks[4]);

       
       for(int i=0; i<5;i++){
        System.out.println(marks[i]);
       }
    }
}