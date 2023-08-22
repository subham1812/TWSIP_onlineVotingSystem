import java.util.Scanner;

public class OnlineVotingSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pa=0,pb=0,pc=0,choice;
        do{
            System.out.println("Enter Name: ");
        String name=sc.next();
        System.out.println("Enter Phone: ");
        long num=sc.nextLong();
        System.out.println("Cast Your Vote Here: ");
            System.out.println("Choose A for party A");
            System.out.println("Choose B for party B");
            System.out.println("Choose C for party C");
            char vote=sc.next().charAt(0);
            if(vote=='A')
            {
                pa++;
            }
            else if(vote=='B')
            {
                pb++;
            }
            else if(vote=='C')
            {
                pc++;
            }
            else
            {
                System.out.println("Choose from given option only");
            }
            System.out.println("Choose 1 to submit your vote");
            System.out.println("Choose 2 to check results");
            choice=sc.nextInt();
        }while(choice!=2);
        if(pa>pb&&pa>pc)
        {
            System.out.println("Party A has a lead");
        }
        else if(pb>pa&&pb>pc)
        {
            System.out.println("Party B has a lead");
        }
        else
        {
            System.out.println("Party C has a lead");
        }
    }
}
