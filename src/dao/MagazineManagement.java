package dao;

import model.Book;
import model.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagazineManagement  {
    public static Scanner scan = new Scanner (System.in);
    static List<Magazine> magazineList = new ArrayList<>();

    public List<Magazine> getList(){
        return magazineList;
    }

    public static void addMagazine(Magazine magazine)
    {
        magazineList.add(magazine);
    }

    public static void deleteMagazine(Magazine magazine){
        magazineList.remove(magazine);
    }

    public static void updateMagazine(Magazine updateMagazine){
        for(Magazine magazine1 : magazineList){
            if(updateMagazine.getID() == magazine1.getID()){
                int choose =Integer.parseInt(scan.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Enter New Producer : ");
                        magazine1.getProducer(scan.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 2:
                        System.out.println("Enter New Release Number : ");
                        magazine1.getReleaseNumber(scan.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 3:
                        System.out.println("Enter  New Release Month");
                        magazine1.getReleaseMonth(scan.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 4:
                        System.out.println("Enter New Issue Number");
                        magazine1.getIssueNumber(scan.nextInt());
                        System.out.println("Successful Update !!");
                        break;
                    default:
                        System.out.println("Enter Again");
                }
            }
        }
    }
    public static Magazine searchByID(int ID){
        for(Magazine magazine : magazineList){
            if(magazine.getID() == ID){
                return magazine;
            }
        }
        return null;
    }
}
