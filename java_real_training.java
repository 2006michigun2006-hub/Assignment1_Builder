class BuilderPattern {
    //Product
    public static class Heart {
        private int p;
        private int b;
        public int getP() {
            return p;
        }
        public int getB() {
            return b;
        }
        public void talk() {
            System.out.println("I have " + p + " pression and " + b + " liters of blood");
        }
    }
    //Builder interface
    public static abstract interface HeartBuilder {
        void setP(int p);
        void setB(int b);
        Heart build();
    }
    //Concrete builder
    public static class StrongHeartBuilder implements HeartBuilder {
        Heart heart = new Heart();
        @Override
        public void setP(int p) {
            heart.p = p;
        }
        @Override
        public void setB(int b) {
            heart.b = b;
        }
        @Override
        public Heart build() {
            return heart;
        }
    }
    //Director
    public static class Director {
        public Heart create(HeartBuilder builder) {
            builder.setP(1000);
            builder.setB(5);
            return builder.build();
        }
    }
    //Client
    public static void main(String[] poop) {
        Director d = new Director();
        HeartBuilder builder = new StrongHeartBuilder();
        Heart heart = d.create(builder);
        System.out.println(heart.getB());
    }
}
