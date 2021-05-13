package forfinal;
/*java -enableassertions ForFinal;*/
public class Forfinal {
    public void ashu() 
    {
        try{
            throw new NullPointerException("i'm the man");
        }
        catch(NullPointerException e){
        throw e;}
    }
    
    public static void main(String[] args) {
//        try {Forfinal a= new Forfinal();
//            a.ashu();}catch(NullPointerException e){System.out.println(e.getMessage());}
//int a=15;
//assert a>=20: "underweight";
//        System.out.println("value is "+a);
//        

//ashe.ashuti();

        
    }}
    class ashe extends Exception
    {
        public static void ashuti() throws ashe
        {
            throw new ashe();
        }
    }
    

