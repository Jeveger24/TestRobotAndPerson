class TestRobotAndPerson {
    public static void main(String[] args) {
        Robot r1 = new Robot("Tom", "red", 30);
        Robot r2 = new Robot("Jerry", "Blue", 40);
        Person p1 = new Person("Alice", "aggressive", false, r2);
        Person p2 = new Person("Becky", "talkative", true, r1);
        r1.introduceSelf();
        r2.introduceSelf();
        p1.sitDown();
        p2.standUp();
        System.out.println(p1.isSitting());
        System.out.println(p2.isSitting());
    }

    static class Robot {
        String name;
        String color;
        int weight;

        Robot(String n, String c, int w) {
            this.name = n;
            this.color = c;
            this.weight = w;
        }

        String getName() {
            return this.name;
        }

        void introduceSelf() {
            System.out.println("Hello! My name is " + getName());
        }

    }

    static class Person {
        String name;
        String personality;
        Boolean isSitting;
        Robot robotOwner;

        Person(String n, String p, Boolean i, Robot r) {
            this.name = n;
            this.personality = p;
            this.isSitting = i;
            this.robotOwner = r;
        }

        void sitDown() {
            this.isSitting = true;
        }

        void standUp() {
            this.isSitting = false;
        }

        boolean isSitting() {
            return this.isSitting;
        }
    }
}
