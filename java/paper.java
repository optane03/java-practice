public class paper {
    public static void main(String[] args) {
        int h=1189, w=891,i,temp;
        for(i=0;i<=8;i++)
        {
            System.out.println("Paper A"+i+" Height "+h+" Weight "+w);
            temp=w;
            w=h/2;
            h=temp;
        } 
    }
}
