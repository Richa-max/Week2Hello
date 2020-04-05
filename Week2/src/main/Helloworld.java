public class Helloworld
{
    public String s1;
    public Helloworld(String s1) {
        this.s1 = s1;
    }

    public String getS1() {
        return s1;
    }

    public void Happy(String s1)
    {
        if ( s1.equals("HAPPY"))
        {
            System.out.println("I am Happy Today");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("I am luck today");
        System.out.println("How about you buddy ? ") ; 
    }

}




