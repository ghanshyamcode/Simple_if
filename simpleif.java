public class simpleif {
    public static void main(String args[]){
        int i=5, j=7, k=9, a=1, b=3, c=5, d=10;
        
        if(i==10){
            if(j<20) System.out.println(a=b);
            if(k>100) System.out.println(c=d);
            else System.out.println(a=c);
        }
        else System.out.println(a=d);
    }
    
}
