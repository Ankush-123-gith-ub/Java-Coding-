class reverse_words {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] new_s = s.split(" ");
        for(int i = new_s.length-1 ; i >= 0  ; i--){
            System.out.print(new_s[i]+" ");
        }
        
    }
}
