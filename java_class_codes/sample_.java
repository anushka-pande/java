class College
{
    public College(){
    	System.out.println("Base Constructer");
    }
};

class SGGS1 extends College 
{
    public SGGS1() {
    	System.out.println("SGGS Constructor");
    }
    public static void main(String args[])
    {
        SGGS1 sggs= new SGGS1();
    }
}
