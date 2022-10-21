public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int lustForPower;

    public void compareStudents (Slytherin studentSecond){
        int powerOne = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + resourcefulness + this.lustForPower;
        if(powerOne > powerTwo){
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName );
        } else {
            System.out.println(this.fullName + "равен по силе с " + studentSecond.fullName);
        }
    }

    public Slytherin(String fullName, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        if (cunning < 0 || cunning > 100){
            throw new RuntimeException(" Неверное значение cunning");
        }
        if (determination < 0 || determination > 100){
            throw new RuntimeException(" Неверное значение determination");
        }
        if (ambition < 0 || ambition > 100){
            throw new RuntimeException(" Неверное значение ambition");
        }
        if (resourcefulness < 0 || resourcefulness > 100){
            throw new RuntimeException(" Неверное значение resourcefulness");
        }
        if (lustForPower < 0 || lustForPower > 100){
            throw new RuntimeException(" Неверное значение lustForPower");
        }
        this.transgression = transgression;
        this.fullName = fullName;
        this.magic = magic;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Я " +fullName +
                "\nстудент факультета = " + "Slytherin" +
                "\ncunning = " + cunning +
                "\ndetermination = " + determination +
                "\nambition = " + ambition +
                "\nresourcefulness = " + resourcefulness +
                "\nlustForPower = " + lustForPower +
                "\nmagic = " + magic +
                "\ntransgression = " + transgression +
                "\n";
    }
}
