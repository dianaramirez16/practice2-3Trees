// author Diana Ramirez
// personal project to learn how the 2-3 tree works

import java.util.Scanner;
public class menuClient {
      
      public static void main(String[] args){
            //this will call heap to be created
            Scanner scan1 = new Scanner(System.in); //SCAN1 -- STRINGS
            Scanner scan2 = new Scanner(System.in); //SCAN1 -- INTEGERS
            System.out.println("Would you like to add new characters to your tree?");
            System.out.println("Type  yes  or  no");
            String newData = scan1.nextLine();
            
            if (newData=="yes"){
                  //TODO instantiate tree
            }  else {
                  System.out.println("Select an option: \n1.Print tree\n2.Delete an Item\n3.Insert Item\n");
            }
            int optionSelect = scan2.nextInt();
            
            if (optionSelect==1){
                  //TODO insert printing method for tree
                  //TODO make 3 print methods, inorder, pre-order, and post-order
            } else if (optionSelect==2) {
                  //TODO decide how to delete items, node? int? data itself?
            } else if (optionSelect==3){
                  //TODO prompt insert method again
            } else {
                  System.out.println("Thanks! Come again");
            }
            
      }
}
