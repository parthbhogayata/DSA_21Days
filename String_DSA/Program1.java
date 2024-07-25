// Basic String Program to Concat sting with out use Any Libary and First Step to understand how  String DSA Works acctually.


class HelloWorld {
    public static void main(String[] args) {
       String str1 = "Parth";
       String str2 = "Bhogayata";
      
       int len1 = str1.length();
       int len2 = str2.length();
       char ch[] = new char[len1+len2];
       int temp = ch.length-1;
      
      for(int i = 0 ; i < str1.length() ; i++){
          ch[i] = str1.charAt(i);
          while(temp > len1){
              for(int j = str2.length() - 1 ; j > -1 ; j--){
                  ch[temp--] = str2.charAt(j);
              }
          }
      }
      
       String str3 = new String(ch);
       System.out.print(str3);
       
    }
}