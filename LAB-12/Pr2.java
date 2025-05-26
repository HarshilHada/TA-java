
import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Candidate cn = new Candidate();
        System.out.println("");
        cn.GetCandidateDetails();
        System.out.println("Candidate Details:");
        cn.DisplayCandidateDetails();
        
    }    
}
class Candidate{
    int Candidate_ID,Candidate_Age;
    String Candidate_Name;
    double Candidate_Weight;
    double Candidate_Height;

    void GetCandidateDetails() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candidate ID: ");
        Candidate_ID = sc.nextInt();
        System.out.println("Enter Candidate Name: ");
        Candidate_Name = sc.next();
        System.out.println("Enter Candidate Age: ");
        Candidate_Age = sc.nextInt();
        System.out.println("Enter Candidate Weight: ");
        Candidate_Weight = sc.nextDouble();
        System.out.println("Enter Candidate Height: ");
        Candidate_Height = sc.nextDouble();
            
    }
    void DisplayCandidateDetails() {
        System.out.println("Candidate ID: " + Candidate_ID);
        System.out.println("Candidate Name: " + Candidate_Name);
        System.out.println("Candidate Age: " + Candidate_Age);
        System.out.println("Candidate Weight: " + Candidate_Weight);
        System.out.println("Candidate Height: " + Candidate_Height);
    }
}