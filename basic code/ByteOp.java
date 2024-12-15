class ByteOp{
    public static void main(String[] args) {
        byte x=10;
        byte y=20;
        final byte a=10;
        final byte b=20;//always use final to perform opration btwn bytes
         byte c=a+b;
        System.out.println(c);
        x+=y;//self type casting(byte->int)
        System.out.println(x);

    }
}