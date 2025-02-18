public class RemoveDuplicate{

   static String myDulicateNumber(String str1){
        String str[] = str1.split("");
        String char1 = "";
        for( int i=0 ; i<str1.length();i++){
          for( int j=i+1 ; j<str1.length();j++)  {
            if(str[i] != str[j]){
                char1=char1+str[i];
            }
          }
          
        }
    return char1;
    }

    public static void main(String args[]){
        System.out.print(myDulicateNumber("Programming"));
    }
}