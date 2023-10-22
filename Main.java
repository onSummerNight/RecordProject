public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            DuckStudent s = new DuckStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Duck";
                        case 2 -> "Donald";
                        case 3 -> "Lumi";
                        case 4 -> "Anastasia";
                        case 5 -> "Bruh";
                        default -> "Anon";
                    },
                    "01/01/1993",
                    "Duck Class");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006","Anya","01/01/1993","Duck Class");
        DuckStudent recordStudent = new DuckStudent("S923007","Anyas","01/01/1993","Duck Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
