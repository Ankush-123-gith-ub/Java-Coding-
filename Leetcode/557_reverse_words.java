class reverse_words {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            StringBuilder temp = new StringBuilder(str);
            temp.reverse();
            sb.append(temp);
            sb.append(" ");

        }
        return sb.toString().trim();
    }
}
