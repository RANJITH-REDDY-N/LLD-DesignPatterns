package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Classmate classmateShort = new Classmate("Classmate-Short","Ruled","10cm x 10cm",29.99);
        Classmate classmateM = new Classmate("Classmate-Medium","Blank","20cm x 15cm",59.99);
        Classmate classmateLongRuled = new Classmate("Classmate-LongR","Ruled","A4",89.99);
        Classmate classmateLongBlank = new Classmate("Classmate-LongB","Blank","A4",84.99);

        Register registry = new Register();
        registry.add(classmateShort);
        registry.add(classmateM);
        registry.add(classmateLongRuled);
        registry.add(classmateLongBlank);

        Classmate classmateFootBallModel = registry.get(classmateShort).clone();
        classmateFootBallModel.setFrontPageDesignName("Ronaldo's Reverse Kick 🔥");
        classmateFootBallModel.setBackPageInfoDesignName("Quiz about ChampionsLeague! ⚽️");
        System.out.println(classmateFootBallModel);
    }
}
