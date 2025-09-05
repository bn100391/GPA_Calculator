import java.util.Scanner; 

public class Project2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 

        //Initializes global variables. 
        int courseNum = 0;
        int terms = 0;
        double totalGradePoints = 0; 
        int totalCredits = 0; 
        double sumGpa = 0; 
        

        //Prompts user to enter courses until they are finished entering courses.  
        while(courseNum != -1){
            System.out.println(" "); 
            System.out.println("How many courses this term? (-1 if done)"); 
            courseNum = scan.nextInt();
        
            if(courseNum > -1){
            
                //Initializes varibles local to the loop. 
                double gradePoints = 0.00; 
                double gradePointAverage = 0.00; 
                String grade = "";
                int credit = 0; 
                int creditCurrent = 0;
                terms++; 

            System.out.println("Enter the grade and number of credits for each course: " );

        
    
            //Collects grades and credits, and converts them to algorithm friendly values. 
            for(int i = 0; i < courseNum; i++){
                grade = scan.next();
                creditCurrent = scan.nextInt();
                credit += creditCurrent;
                 

                //Converts letter grade to gradepoint value.
                switch (grade) {            
                    case "A": gradePoints += (4.00 * creditCurrent); break; 
                    case "A-": gradePoints += (3.67 * creditCurrent); break; 
                    case "B+": gradePoints += (3.33 * creditCurrent); break; 
                    case "B": gradePoints += (3.00 * creditCurrent); break; 
                    case "B-": gradePoints += (2.67 * creditCurrent); break; 
                    case "C+": gradePoints += (2.33 * creditCurrent); break; 
                    case "C": gradePoints += (2.00 * creditCurrent); break; 
                    case "C-": gradePoints += (1.67 * creditCurrent); break; 
                    case "D+": gradePoints += (1.33 * creditCurrent); break; 
                    case "D": gradePoints += (1.00 * creditCurrent); break; 
                    case "D-": gradePoints += (0.67 * creditCurrent); break; 
                    case "F": gradePoints += (0.00 * creditCurrent); break; 
                }

            }
        
            //Algorthm to calculate benchmarks. 
            double gpa = (gradePoints / credit); 
            totalGradePoints += gradePoints; 
            totalCredits += credit; 
            sumGpa += gpa; 
     
            //Prints out term summary. 
            System.out.println(" "); 
            System.out.println("Summary for term " + terms); 
            System.out.println("-----------------------------------"); 
            System.out.println("Term total grade points: " + gradePoints); 
            System.out.println("     Term total credits: " + credit); 
            System.out.printf("               Term GPA: %.2f ", gpa); 
            System.out.println(" "); 
       
        
            
        }
    }
       //Calculates cumulative GPA.  
       double cumulativeGPA = (sumGpa / terms);

       //Produces Final Summary. 
       System.out.println(" "); 
       System.out.println("Final Summary"); 
       System.out.println("-----------------------------------"); 
       System.out.println("Overall terms"); 
       System.out.println("Total grade points: " + totalGradePoints); 
       System.out.println("     Total credits: " + totalCredits); 
       System.out.printf("    Cumulative GPA: %.2f \n", cumulativeGPA); 
       System.out.println(" "); 
       System.out.println("Done. Normal termination."); 
       System.out.println(" ");     
    
    }
}
