public class persegi extends bangun{
    public persegi(double sisi){
        super.setName("Persegi");
        this.hitungLuas(sisi);
        this.hitungKeliling(sisi);
    }

    public void hitungLuas(double sisi){
        super.luas = sisi * sisi;
    }

    public void hitungKeliling(double sisi){
        super.keliling = sisi * sisi;
    }
    
}
