package jan4;
//create read update delete CRUD

import java.util.*;

class Student {

    int rollno[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mobile[] = new String[10];
    int i = 0;
    Scanner tej1 = new Scanner(System.in);

    public void inputData() {
        System.out.println("Enter roll no: ");
        rollno[i] = tej1.nextInt();
        System.out.println("Enter name: ");
        name[i] = tej1.next();
        System.out.println("Enter mobile no: ");
        mobile[i] = tej1.next();

        System.out.println("Enter city name: ");
        city[i] = tej1.next();
        ++i;
    }

    public void showInfo() {
        System.out.println("rollno\tname\tmobileNo\tcity");
        System.out.println("*******************************************************************");
        for (int j = 0; j < i; j++) {
            System.out.println(rollno[j] + "\t" + name[j] + "\t" + mobile[j] + "\t" + city[j] + "\t");

        }
        System.out.println("*******************************************************************");

    }

    public void updateInfo() {
        int rollnoUpdate;
        Scanner tej2 = new Scanner(System.in);
        System.out.println("Enter the roll no to be updated: ");
        rollnoUpdate = tej2.nextInt();

        int indexUpdate = -1;
        for (int j = 0; j < i; j++) {
            if (rollno[j] == rollnoUpdate) {
                indexUpdate = j;
                break;
            }

        }
        if (indexUpdate == -1) {
            System.out.println("Roll no not found!!!!");
        } else {
            System.out.println("Enter roll no: ");
            rollno[indexUpdate] = tej2.nextInt();
            System.out.println("Enter name: ");
            name[indexUpdate] = tej2.next();
            System.out.println("Enter mobile no: ");
            mobile[indexUpdate] = tej2.next();
            System.out.println("Enter city name: ");
            city[indexUpdate] = tej2.next();
        }
        // tej2.close();
    }

    public void deleteInfo() {
        int rollnoDelete;
        Scanner tej2 = new Scanner(System.in);
        System.out.println("Enter the roll no to be updated: ");
        rollnoDelete = tej2.nextInt();

        int indexDelete = -1;
        for (int j = 0; j < i; j++) {
            if (rollno[j] == rollnoDelete) {
                indexDelete = j;
                break;
            }

        }
        if (indexDelete == -1) {
            System.out.println("Roll no not found!!!!, No element is deleted");

        } else {
            for (int k = indexDelete; k < i - 1; k++) {
                rollno[k] = rollno[k + 1];
                name[k] = name[k + 1];
                mobile[k] = mobile[k + 1];
                city[k] = city[k + 1];

            }
            i--;
            System.out.println("Info of is deleted from database!!!");
        }

    }
}

class CRUD {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner tej = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("Select any option: ");
            System.out.println("1.Input Data");
            System.out.println("2.Show Data");
            System.out.println("3.Update Data");
            System.out.println("4.Delete Data");
            System.out.println("5.Exit Program");
            ch = tej.nextInt();

            switch (ch) {
                case 1:
                    s.inputData();
                    break;
                case 2:
                    s.showInfo();
                    break;
                case 3:
                    s.updateInfo();
                    break;
                case 4:
                    s.deleteInfo();
                    break;
                case 5:
                    System.exit(0);
            }
        }
        // tej.close(); 
    }

}
