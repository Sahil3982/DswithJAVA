class Square {
    public static void main(String[] args) {
        int side = 5;
        int area = mySquare(side);
        System.out.println("Area of square with side " + side + " is: " + area);

      
        
    }

    private static int mySquare(int side) {
        // TODO Auto-generated method stub
          if(side <= 0) {
                return 0;   
            }
            return side * side;
    }
}