public class bangun {
    protected double luas;
    protected double keliling;
    protected String name;

    public double getLuas() {
        return this.luas;
    }

    public double getKeliling() {
        return this.keliling;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("name :" + this.name);
        System.out.println("luas :" + this.luas);
        System.out.println("keliling :" + this.keliling);
    }
}