public abstract class Hogwarts {
    String fullName;
    int magic;
    int transgression;

    public void compareStudents(Hogwarts studentSecond){
        int powerOne = this.magic + this.transgression;
        int powerTwo = studentSecond.magic + studentSecond.transgression;
        if(powerOne > powerTwo){
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName );
        } else {
            System.out.println(this.fullName + "равен по силе с " + studentSecond.fullName);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.magic=magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0 || transgression > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.transgression = transgression;
    }

}
