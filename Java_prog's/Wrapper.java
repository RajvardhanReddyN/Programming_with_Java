class Wrapper
{
    public static void main(String[] args)
    {
        int num; char c; boolean b;
        num = Integer.parseInt("23");
        System.out.println("String to Number : " + num );
        String S = Integer.toString(45);
        System.out.println("Number to String : " + S);
        c = 'i';
        c=Character.toUpperCase(c);
        System.out.println("Upper Case of i : " + c );
        c='M';
        c=Character.toLowerCase(c);
        System.out.println("Lower Case of i : " + c );
        b=Character.isUpperCase(c);
        System.out.println("Whether M is Upper Case or not : " + b);
        b=Character.isLowerCase(c);
        System.out.println("Whether M is Lower Case or not : " + b);
        b=Character.isDigit(c);
        System.out.println("Whether M is Digit or not : " + b);
        b=Character.isLetter(c);
        System.out.println("Whether M is Alphabet or not : " + b);
        
    }
}