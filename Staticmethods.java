class Mobile
{
    String brand;
    int price;
    static String name;

    public void Show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+ obj.price +" : "+Mobile.name);
	}
    
}

public class Staticmethods 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 75000;
        mobile.name = "Smart Phone";

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 69000;
        mobile.name = "Smart Phone";


        mobile.name = "AI Phones";
        obj1.Show();
        obj2.Show();

        Mobile.show1(obj2);

    }
    
}
