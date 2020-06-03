/* Nesneye Yönelik Programlama da SINIF (class), NESNE(objeckt)kavramları örnek uygulamaları..
bu uygulamada gezegenler adında bir sınıf oluşturup özelliklerini belirteceğim nesneler yardımıylada gezegeni tanımlayacağım. */
package gezegenler;

public class Gezegenler {//gezegen adında bir sınıf oluşturduk.
    String Uydu;         //özellikleri neye göre yazacağımızı belirttik.
    int DunyayaUzaklık;  // örneğin yazıylamı (String)ya da sayıyla mı (int).
    String GezegenTürü;  
    
    public static void main(String[] args) 
    {
        Gezegenler Mars=new Gezegenler(); //gezegenler sınıfından mars adında ki nesnemizi oluşturduk.
        Mars.GezegenTürü="karasal gezegen"; //nesnemizin özellikleri ni sıraladık
        Mars.DunyayaUzaklık=55;
        Mars.Uydu="Deimos ve Phobos";
        
            System.out.println("Mars Gezegeninin Türü :"+Mars.GezegenTürü);
            System.out.println("Mars Gezegeninin Dünya'ya Uzaklığı :"+Mars.DunyayaUzaklık +" Milyon km");
            System.out.println("Mars Gezegeninin Uyduları :"+ Mars.Uydu +"'tur");
        //sout ile yazdırdık.
    }
    
}
