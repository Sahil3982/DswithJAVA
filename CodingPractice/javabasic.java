public class javabasic {  
    public static void main(String[] args) {  
        String name = "sahilll";
        String name1 = "patelll";
        String newstr[] = name.split("");
        String newstr1[] = name1.split("");
        int count = 0;
        for(int i=0 ;  i<name.length() ; i++ )  {
            if(newstr[i].equals(newstr1[i])){
                count ++ ;
            }
        }
        System.out.print(count);
    }  
}
    