




// PROGRAMA QUE CREE UN PASSWORD

import java.util.Scanner;

public class Password {

	public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        

        String letras = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZz";
        char letra;
        int size;
        StringBuilder pass= new StringBuilder();


        System.out.println("Say Size of PASSWORD: ");
        size= sc.nextInt();

            for (int i=0; i<size; i++){

                int random = (int)(Math.random()* letras.length());
                letra =letras.charAt(random);
                pass.append(letra) ;        
                
             

            }

        System.out.println("The new PASSWORD is: "+ pass);
    }


}
