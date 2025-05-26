public class StudentCourse {
    public void showCoursesAndMarks() { 
        String[] courses = {"DBMS", "OOPs", "DevOps"}; 
        int[] marks = {45, 39, 50}; 
        for (int i = 0; i < courses.length; i++) { 
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]); 
        } 
    } 

    public static void main(String[] args) {
        StudentCourse sc = new StudentCourse(); 
    sc.showCoursesAndMarks();
    }

}
