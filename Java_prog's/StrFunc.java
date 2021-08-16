class StrFunc
{
    public static void main(String[] args)
    {
        String str = "Mirror";
        int l = "Mirror".length();
        System.out.println("Length = " + l);
        String str2 = str.toUpperCase();
        System.out.println("In  UC - " + str2);
        System.out.println("this IS MY BOOK".toLowerCase());
        System.out.println("Snow".replace('n','l'));
        String str3 = "    Snow ";
        System.out.println(str3);
        System.out.println(str3.trim());
        System.out.println(str3.concat("is cool if we take it in the hand"));
        int N=45;
        System.out.println(String.valueOf(N)+10);
        
    }
}