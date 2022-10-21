public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public void compareStudents (Ravenclaw studentSecond){
        int powerOne = this.smart + this.wise + this.witty + this.creativity;
        int powerTwo = studentSecond.smart + studentSecond.wise + studentSecond.witty + creativity;
        if(powerOne > powerTwo){
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName );
        } else {
            System.out.println(this.fullName + "равен по силе с " + studentSecond.fullName);
        }
    }

    public Ravenclaw(String fullName, int magic, int transgression, int smart, int wise, int witty, int creativity) {
        if (smart < 0 || smart > 100){
            throw new RuntimeException(" Неверное значение smart");
        }
        if (wise < 0 || wise > 100){
            throw new RuntimeException(" Неверное значение wise");
        }
        if (witty < 0 || witty > 100){
            throw new RuntimeException(" Неверное значение witty");
        }
        if (creativity < 0 || creativity > 100){
            throw new RuntimeException(" Неверное значение creativity");
        }
        this.transgression = transgression;
        this.fullName = fullName;
        this.magic = magic;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Я " + fullName +
                "\nстудент факультета = " + "Ravenclaw" +
                "\nsmart = " + smart +
                "\nwise = " + wise +
                "\nwitty = " + witty +
                "\ncreativity = " + creativity +
                "\nmagic = " + magic +
                "\ntransgression = " + transgression +
                "\n";
    }
}
