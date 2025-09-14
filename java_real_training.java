import java.util.Scanner;
class java_real_training {
    static class Liver {
        String color;
        final String name;
        Boolean hasDisease;
        int probeg;
        public Liver(String color, String name, Boolean hasDisease, int probeg) {
            this.color = color;
            this.name = name;
            this.hasDisease = hasDisease;
            this.probeg = probeg;
        }
        public void votLiver() {
            System.out.println("This liver is " + color + ", it's name is " + name + ". Unfortunately or not, the statement that it has disease is " + hasDisease + " and it already worked hard for " + probeg + " hours");
        }
    }
    static class Organs_Builder {
        String color = "red";
        String name = "Neizvestno";
        Boolean hasDisease = false;
        int probeg = 0;
        public Organs_Builder votcolor(String color) {
            this.color = color;
            return this;
        }
        public Organs_Builder votname(String name) {
            this.name = name;
            return this;
        }
        public Organs_Builder votdisease(Boolean hasDisease) {
            this.hasDisease = hasDisease;
            return this;
        }
        public Organs_Builder votprobeg(int probeg) {
            this.probeg = probeg;
            return this;
        }
        public Liver proverka() {
            return new Liver(color, name, hasDisease, probeg);
        }
    }
    public static void main(String[] poopiSHE) {
        Liver liver1 = new Organs_Builder()
                .votcolor("Brown")
                .votname("Khovansky")
                .votdisease(true)
                .votprobeg(228228)
                .proverka();
        liver1.votLiver();
    }
}