class Student{
    int rollno;
    String name;
    int marks;
}

public class arrayOfObjects{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ravi";
        s1.marks = 96;
        
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Musu";
        s2.marks = 99;

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        //System.out.println(s1.name + " : " + s1.marks);

        for(int i=0 ; i<students.length ; i++){
            System.out.println(students[i].rollno + ". " + students[i].name + " : " + students[i].marks);
        }

        //for each loop

        for(Student stud : students){
            System.out.println(stud.rollno + ". " + stud.name + " : " + stud.marks);
        }
        
    }
}