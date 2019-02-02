public class Psychiatrist {

    public void examine(MoodyObject moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(MoodyObject moodyObject) {
        moodyObject.expressFeelings();
        System.out.println(moodyObject.toString());
    }

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        MoodyObject sad = new SadObject();
        MoodyObject happy = new HappyObject();

        psychiatrist.examine(happy);
        System.out.println();
        psychiatrist.observe(happy);

        psychiatrist.examine(sad);
        System.out.println();
        psychiatrist.observe(sad);

        System.out.println("Press any key to continue...");
    }
}
