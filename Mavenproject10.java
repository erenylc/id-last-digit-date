/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

/**
 *
 * @author Eren
 */
public class Mavenproject10 {

    public static void main(String[] args) {
        String identity="12345678901";
        char lastDigit=identity.charAt(10);
        //id last digit date
        switch(lastDigit){
            case '0':
                System.out.println("01.01.2020");
                break;
            case '1':
                System.out.println("02.01.2020");
                break;
            case '2':
                System.out.println("03.01.2020");
                break;
            case '3':
                System.out.println("04.01.2020");
                break;
            case '4':
                System.out.println("05.01.2020");
                break;
            case '5':
                System.out.println("06.01.2020");
                break;
            case '6':
                System.out.println("07.01.2020");
                break;
            case '7':
                System.out.println("08.01.2020");
                break;
            case '8':
                System.out.println("09.01.2020");
                break;
            case '9':
                System.out.println("10.01.2020");
                break; 
            default:
                System.out.println("Not fully Understood....");
            
        }
    }
}
