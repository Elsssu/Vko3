package main;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pinCode = "0000";
        Safe newSafe = null;
        newSafe = new Safe(pinCode);
        newSafe.setDefaultPIN();
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna uusi PIN-koodi:");
                        String tempCode  = sc.nextLine();

                        newSafe.setPIN(tempCode);
                        break;
                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto:");
                        String info  = sc.nextLine();
                        newSafe.addToSafe(info);
                        
                        break;
                    case 3:
                        System.out.println("Anna PIN-koodi:");
                        String code = sc.nextLine();
                        String pin = newSafe.getPIN();
                        ArrayList<String> safeFolder =  newSafe.getlist(code);
                        if(code.equals(pin)){
                            for(int x = 0; x < safeFolder.size(); x++){
                                System.out.println(safeFolder.get(x));
                            }
                        }else {
                            System.out.println("Väärä PIN-koodi!");
                        }
                        
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
        sc.close();
	}

}
