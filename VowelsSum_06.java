package BASIC.ForCycleLab;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int value =0;

        for (int i = 0; i <text.length() ; i++) {   // <=text.length -1
            if(text.charAt(i)=='a'){
                value+=1;
            }
            if(text.charAt(i)=='e'){
                value+=2;
            }
            if(text.charAt(i)=='i'){
                value+=3;
            }
            if(text.charAt(i)=='o'){
                value+=4;
            }
            if(text.charAt(i)=='u'){
                value+=5;
            }
        }
        System.out.println(value);
    }
}
