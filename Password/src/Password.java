




// PROGRAMA QUE CREE UN PASSWORD

import java.util.Scanner;

public class Password {

	public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        

        String letras = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZz";
        char letra;
        int size;
        StringBuilder pass= new StringBuilder();


       
        
            try {
                System.out.println("Say Size of PASSWORD: ");
                size= sc.nextInt();

                boolean flag = false;    

                if (size>0){
                    for (int i=0; i<size; i++){

                        int random = (int)(Math.random()* letras.length());
                        letra =letras.charAt(random);
                        pass.append(letra);  
                        System.out.println("The new PASSWORD is: "+ pass.toString());      
                    }    

                } else {
                    flag=true;

                }
                if (flag){
                    throw new Exception("Size must be positive");
                }
             
                
            } catch (Exception e) {
                System.out.println(e);
            } 
       
             

            

        
    }


}
