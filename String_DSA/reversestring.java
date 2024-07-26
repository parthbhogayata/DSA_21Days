class Rev{

    // Reverse String Using Loop

    void method1(String str){
        int n = str.length() - 1;
        char[] ch = str.toCharArray();
        for(int i = 0 ; i < str.length() / 2 ; i++){
            char temp = str.charAt(i);
            ch[i] = str.charAt(n);
            ch[n] = temp;
            n--;
        }
        String strans = new String(ch);
        System.out.println(strans);
    }

    // Using InBuild Method

    void method2(String str){
        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        System.out.println(str1.toString());
    }

    // Using Recursion

    // void method3(String str){

    // }


    public static void main(String[] args) {
        String str = "Parth Bhogayata";
        Rev r1 = new Rev();
        // r1.method1(str);
        // r1.method2(str);
        // r1.method3(str);
    }
}