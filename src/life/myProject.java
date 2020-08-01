package life;

public class myProject {


    public static void main(String[] args) {

        String str = "Cybertek";
        reverse(str);


    }
    public static String reverse (String str) {

        String result = "";
        for (int i =str.length()-1; i>=0; i--){
            result += str.charAt(i);

        }
        System.out.println(result);
        return result;


    }









/*

        String name = "istanbul";

        int num = name.length();
        System.out.println(num);

        String boss = "Hugo";
        String r2 = boss.substring(0,2);
        System.out.println(r2);

        String world = "Life   ";
        String h2 = world.trim();
        System.out.println(h2);



        //int a =11; int b = 12;
        //int c =40;
       // if(a>100 || b>3){
         //   System.out.println(a);
       // }else{
        //    System.out.println(c);




        int a = 11; int b =12; int c =40;

            switch(a){
                case 40:
                    System.out.println(b);
                    break;
                default:
                    System.out.println(c);
            }


*/
            public static String returnIt (String name){


                

                return name;

           }




}
