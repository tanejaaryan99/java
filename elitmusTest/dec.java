package elitmusTest;
import java.util.*;
public class dec
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Integer,Character>hm=new HashMap<Integer,Character>();
        HashSet<Character>hs=new HashSet<Character>();
        int k=0;
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            if(!(s.charAt(i)>=48 && s.charAt(i)<=57)){
                hm.put(k,s.charAt(i));
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)>=48 &&s.charAt(i)<=57){
                res+=hm.get(s.charAt(i)-'0');
            }
            else{
                res+=s.charAt(i);
            }
            if(s.charAt(i)>=48 &&s.charAt(i)<=57){
                if(hm.get(s.charAt(i)-'0')==null){
                    res="invalid code";
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
