public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public void compareStudents (Gryffindor studentSecond){
        int powerOne = this.nobility + this.honor + this.courage;
        int powerTwo = studentSecond.nobility + studentSecond.honor + studentSecond.courage;
        if(powerOne > powerTwo){
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName );
        } else {
            System.out.println(this.fullName + "равен по силе с " + studentSecond.fullName);
        }
    }

    public Gryffindor(String fullName, int magic, int transgression, int nobility, int honor, int courage) {
        if (nobility < 0 || nobility > 100){
            throw new RuntimeException(" Неверное значение nobility");
        }
        if (honor < 0 || honor > 100){
            throw new RuntimeException(" Неверное значение honor");
        }
        if (courage < 0 || courage > 100){
            throw new RuntimeException(" Неверное значение courage");
        }
        this.transgression = transgression;
        this.fullName = fullName;
        this.magic = magic;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Я " + fullName +
               "\nстудент факультета = " + "Gryffindor" +
                "\nnobility =" + nobility +
                "\nhonor =" + honor +
                "\ncourage =" + courage +
                "\nmagic =" + magic +
                "\ntransgression =" + transgression +
                "\n";
    }
}
