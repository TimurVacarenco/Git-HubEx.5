public class main {
    public static void main (String[] args)
    {
        System.out.println("Hello everybody");
    }
/*<<<<<<< branch3*/
    public static void GetData(String name, int age)
    {
        name="Alex";
        age=212;
        System.out.println(name+age);
    }
    public static void Reg()
    {
        int id;
        String name;
    }
    public static void GetReg(int id, String name)
    {
        id=11;
        name="Alex1";
        System.out.println(id+name);
/*=======*/
    public static void GetData(String name, int age, String address) {
        name = "Alex";
        age = 21;
        address="Alba-Iulia 194/1";
        System.out.println(name + age+address);

/*>>>>>>> master*/
    }
}
