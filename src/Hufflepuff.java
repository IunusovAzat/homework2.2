public class Hufflepuff  extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public void compareStudents (Hufflepuff studentSecond){
        int powerOne = this.diligence + this.loyalty + this.honesty;
        int powerTwo = studentSecond.diligence + studentSecond.loyalty + studentSecond.honesty;
        if(powerOne > powerTwo){
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName );
        } else {
            System.out.println(this.fullName + "равен по силе с " + studentSecond.fullName);
        }
    }

    public Hufflepuff(String fullName, int magic, int transgression, int diligence, int loyalty, int honesty) {
        if (diligence < 0 || diligence > 100){
        throw new RuntimeException(" Неверное значение diligence");
    }
        if (loyalty < 0 || loyalty > 100){
            throw new RuntimeException(" Неверное значение loyalty");
        }
        if (honesty < 0 || honesty > 100){
            throw new RuntimeException(" Неверное значение honesty");
        }
        this.transgression = transgression;
        this.fullName = fullName;
        this.magic = magic;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Я " + fullName +
               "\nстудент факультета = " + "Hufflepuff" +
                "\ndiligence=" + diligence +
                "\nloyalty=" + loyalty +
                "\nhonesty=" + honesty +
                "\nmagic=" + magic +
                "\ntransgression = " + transgression +
                "\n";
    }
}
