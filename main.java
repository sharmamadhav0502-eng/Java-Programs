interface Student {
    void grade();
    void attendance();
}

class PGStudent implements Student {

    public void grade() {
        System.out.println("PG Grade: A");
    }

    public void attendance() {
        System.out.println("PG Attendance: 90%");
    }
}

class UGStudent implements Student {

    public void grade() {
        System.out.println("UG Grade: B");
    }

    public void attendance() {
        System.out.println("UG Attendance: 85%");
    }
}

public class main {

    public static void main(String[] args) {

        PGStudent pg = new PGStudent();
        UGStudent ug = new UGStudent();

        pg.grade();
        pg.attendance();

        ug.grade();
        ug.attendance();
    }
}