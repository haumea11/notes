
public class palindromer
{
    public boolean isDrome(String palin){
        String nilap = new String("");
        for (int j = palin.length()-1; j >= 0; j --){
            nilap = nilap+Character.toString(palin.charAt(j));
        }
        return nilap.equals(palin);
    }
    
    public static void main(String[] args){
        palindromer bob = new palindromer();
        System.out.println(bob.isDrome("gohangasalamiimalasagnahog"));
        System.out.println("Help, I'm trapped in a universe factory!");
    }
}
