class extarct_integers {
    public static void main(String[] args){
        String s = "abc123def45";
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                sb.append(" ");
            }
        }
        String[] str = sb.toString().trim().split(" ");
        System.out.println(str.toString());
    }
}
