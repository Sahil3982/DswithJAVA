class Character{
    public static void main(String []args){
        String str = "I love Priyanka patel";
        String [] str1 = str.split(" ");
        String longstr = "";
        for (String string : str1) {
            if (string.length() > longstr.length()) {
                longstr = string;
            }
        }

        System.out.println(longstr);
        

    }
}