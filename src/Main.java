public class Main {
    public static void main(String[] args) {
        Gryffindor harryPoter = new Gryffindor("Harry Potter", 36, 20, 6, 14, 57);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger ", 59, 10, 14, 31, 63);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 16, 36, 56, 18, 7);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 60, 13, 24, 1, 18);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 13, 6, 17, 8, 81);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 36, 61, 47, 20, 33);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 12, 0, 8, 43, 40, 51);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 19, 3, 9, 35, 24, 52);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 2, 16, 63, 34, 34, 52);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 25, 40, 53, 74, 34, 2, 85);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 5, 4, 3, 7, 4, 2, 8);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 2, 0, 5, 7, 34, 2, 5);

        System.out.println(harryPoter);
        System.out.println(cedricDiggory);
        System.out.println(padmaPatil);
        System.out.println(dracoMalfoy);

        ronWeasley.compareStudents(hermioneGranger);
        harryPoter.compareStudents(dracoMalfoy);
        System.out.println();
        justinFinchFletchley.compareStudents(zachariasSmith);
        cedricDiggory.compareStudents(grahamMontague);
        System.out.println();
        marcusBelby.compareStudents(padmaPatil);
        zhouChang.compareStudents(cedricDiggory);
        System.out.println();
        grahamMontague.compareStudents(dracoMalfoy);
        gregoryGoyle.compareStudents(marcusBelby);

    }
}