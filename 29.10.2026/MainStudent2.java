class MainStudent2 {
    public static void main(String[] args) {
        Student2 s = new Student2();

        int id = 101;
        String name = "Kumar";
        int[] marks = {80, 70, 60, 50, 40};

	s.setstudent(id,name,marks);
        s.display(id,name,marks);
    }
}