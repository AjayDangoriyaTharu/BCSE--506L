class honda {
    void display() {
        System.out.println("Running at 40 km/hr ....");
    }
}

class hondasine extends honda {
    void display() {
        System.out.println("Running at 60 km/hr....");
    }
}

public class moverriding {
    public static void main(String[] args) {
        hondasine obj = new hondasine();
        honda bike = new honda();
        bike.display();
        obj.display();
    }
}
