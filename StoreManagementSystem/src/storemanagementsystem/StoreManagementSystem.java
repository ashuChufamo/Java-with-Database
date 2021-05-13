package storemanagementsystem;

import java.io.IOException;
import java.util.Scanner;

public class StoreManagementSystem {
    
    
    public static void main(String[] args) throws IOException 
    {
      StoreManagementSystem s=new StoreManagementSystem();
        s.main_method(); } 
        
        public void main_method() throws IOException{
    StoreManagementSystem s = new StoreManagementSystem();
        Scanner input = new Scanner(System.in);
        System.out.println("____Welcome to our Store System___");
        System.out.println("who are you");
        System.out.println("_Admin");
        System.out.println("____print 1");
        System.out.println("_Store_keeper");
        System.out.println("____print 2");
        System.out.println("Librerian");
        System.out.println("____print 3");
        System.out.println("department_head");
        System.out.println("____print 4");
        System.out.println("EXIT");
        System.out.println("____print 0");

        //int valuee=input.nextInt(); 
        while (true) {
            int valuee = input.nextInt();
            switch (valuee) {
                case 1:
                    s.Admin_method();
                    break;
                case 2:
                    s.Store_keeper_method();
                    break;
//                case 3:s.librerian_method();
//                    break;
//                case 4:s.head_department_method();
//                    break;
//                case 0:s.main_method();
//                    break;
            }
        }

    }
    

    public void Admin_method() throws IOException {
        StoreManagementSystem s = new StoreManagementSystem();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to add?");
        System.out.println("_Store_keeper");
        System.out.println("_____print 1");
        System.out.println("_Auditor");
        System.out.println("____print 2");
        System.out.println("back");
        System.out.println("____print 3");
        Admin a = new Admin();
        //int value=input.nextInt();
        while (true) {
            int value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("how many StoreKeeper do you want to add");
                    int num1 = input.nextInt();

                    for (int i = 0; i < num1; i++) {
                        System.out.println("what is Store_keeper first name");
                        String f_name = input.next();
                        System.out.println("what is Store_keeper last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_StoreKeeper(f_name, l_name, u_name, password);
                    }
                case 2:
                    System.out.println("how many Auditor  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what is Auditor first name");
                        String f_name = input.next();
                        System.out.println("what is Auditor last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_Auditor(f_name, l_name, u_name, password);
                    }

                case 3:
                    s.main_method();
//                case 4:
//                    s.head_department_method();
            }

        }

    }
     public void Store_keeper_method() throws IOException {
        StoreManagementSystem s = new StoreManagementSystem();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to do?");
        System.out.println("add_department_head");
        System.out.println("_____print 1");
        System.out.println("add_item");
        System.out.println("____print 2");
        System.out.println("add librery_head");
        System.out.println("_____print 3");
        System.out.println("add_other_head");
        System.out.println("____print 4");
        System.out.println("notify buying item");
        System.out.println("____print 5");
        System.out.println("back");
        System.out.println("____print 0");

        storeKeeper a = new storeKeeper();
        int value = input.nextInt();
        while (true) {
            switch (value) {
                case 1:
                    System.out.println("how many department head  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what is department head first name");
                        String f_name = input.next();
                        System.out.println("what is department head last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();
                        System.out.println("what is the department it owns?");
                        String department = input.next();

                        a.register_department_head(f_name, l_name, u_name, password, department, num2);
                    }
                    s.Store_keeper_method();
                    break;
                case 2:
                    System.out.println("how many item do you want to add");
                    int num1 = input.nextInt();

                    for (int i = 0; i < num1; i++) {
                        System.out.println("what is the item name");
                        String item_name = input.next();
                        System.out.println("what is the item brand");
                        String brand_name = input.next();
                        System.out.println("what is the item_type");
                        String type_name = input.next();
                        System.out.println("what is item_id");
                        String item_id = input.next();
                        System.out.println("is item damaged or not?");
                        String damagedd = input.next();

                        a.registerItem(item_name, brand_name, type_name, item_id, damagedd, num1);
                    }
                    s.Store_keeper_method();
                    break;
                case 3:
                    System.out.println("how many librery head  do you want to add");
                    int num3 = input.nextInt();

                    for (int i = 0; i < num3; i++) {
                        System.out.println("what is librery head first name");
                        String f_name = input.next();
                        System.out.println("what is libreryhead last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_librery_head(f_name, l_name, u_name, password, num3);
                    }
                    s.Store_keeper_method();
                    break;

//                case 5:
//                    System.out.println("thise is the item view method");
//                    a.notifyBuyingItem();
//                    s.Store_keeper_method();
//                    break;
                case 0:s.main_method();
                    break;
            }
        }
    }
    }
    

