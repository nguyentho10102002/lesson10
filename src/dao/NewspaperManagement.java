package dao;

import model.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewspaperManagement {
    Scanner input = new Scanner(System.in);
    List<Newspaper> newspaperList = new ArrayList<>();

    public List<Newspaper> getList(){
        return newspaperList;
    }

    public void addNewspaper(Newspaper newspaper){
        for (Newspaper newspaper1 : newspaperList){
            newspaperList.add(newspaper);
        }
    }

    public void deleteNewspaper(Newspaper newspaper){
        for( Newspaper newspaper1 : newspaperList){
            newspaperList.remove(newspaper1);
        }
    }

    public void updateNewspaper(Newspaper updateNewspaper){
        for(Newspaper newspaper : newspaperList){
            if(newspaper.getID() == updateNewspaper.getID()){
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    //String producer, int releaseNumber, String releaseDate
                    case 1:
                        System.out.println("Enter New Producer : ");
                        newspaper.getProducer(input.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 2:
                        System.out.println("Enter New Release Number : ");
                        newspaper.getReleaseNumber(input.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    case 3 :
                        System.out.println("Enter New Release Date : ");
                        newspaper.getReleaseDate(input.nextLine());
                        System.out.println("Successful Update !!");
                        break;
                    default:
                        System.out.println("Not Found !!");
                }
            }
        }
    }

    public Newspaper searchByID(int ID){
        for(Newspaper newspaper : newspaperList){
            if(newspaper.getID() == ID){
                return newspaper;
            }
        }
        return null;
    }
}
