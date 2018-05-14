/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2;

import controller.StudentController;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Quyeens
 */
public class ADF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        StudentController ctrl = new StudentController();
        Scanner sc =  new Scanner(System.in);
        while (true) {            
            ctrl.menu();
            int chocse = sc.nextInt();
            switch(chocse){
                case 1:
                    ctrl.addStudent();
                    break;
                case 2:
                    ctrl.save();
                    break;
                case 3:
                    ctrl.displayStudent();
                    break;
                case 4:
                    System.out.println("Ban muon thoat");
                    break;
                default:
                    System.err.println("Nhap sai roi");
                    break;
            }
            if (chocse == 4) {
                break;
                        
                        
            }
                    
        }
            
        
        
    }
    
}
