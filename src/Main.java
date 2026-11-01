
class Entry {
        private int roll_no, marks;
        private String f_name, l_name, dept;
        private String course;

public int getRoleNo() {
    return roll_no;
}

public int getMarks() {
    return marks;
}

public String getL_name() {
    return l_name;
}

public String getF_name() {
    return f_name;
}

public String getCourse() {
    return course;
}

public String getDept() {
    return dept;
}

public void setDetails(int roll_no, String first_name, String last_name, String department, String Course_name, int t_marks) {
    this.f_name = first_name;
    this.l_name = last_name;
    this.course = Course_name;
    this.dept = department;
    this.roll_no = roll_no;
    this.marks = t_marks;
}

public void Display(){
    System.out.println("Admission Process Details");
    System.out.println("-------------------------------");
    System.out.println("Roll no:"+ roll_no);
    System.out.println("First Name:"+ f_name);
    System.out.println("Last Name :"+ l_name);
    System.out.println("Marks:"+ marks);
    System.out.println("Department:" + dept);
    System.out.println("Course Enrolled:"+ course);
}
}

public void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

Entry e =  new Entry();


    e.setDetails(26,"Harini","Gnanavel","Information Technology","Java", 1055);
    e.Display();







}






