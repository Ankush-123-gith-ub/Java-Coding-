class check_rotation {
    public static void main(String[] args){
        String a = "ABCD";
        String b = "CDAB";
        if(a.length() != b.length()) System.out.println("false");
        String temp = a+a;
        System.out.println(temp.contains(b));
        

    } 
}
