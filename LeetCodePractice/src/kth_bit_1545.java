public class kth_bit_1545 {

    class Solution {
        public char findKthBit(int n, int k) {

            if(k==1)
                return'0';

            int c = k;
            String s = "0";
            for(int i = 0; i<n; i++){

                s = s + '1'+reverseStr(inverseStr(s));
            }

            return s.charAt(c);

        }

        public static String inverseStr(String s)
        {
            String a = s;
            String res = "";
            for(int i = 0; i< a.length()-1;i++){
                if(a.charAt(i) == '0')
                    res+='1';
                else
                    res+='0';

            }
            return res;
        }


        public static String reverseStr(String res)
        {
            String str = res;
            String res1 = "";
            for(int i = str.length()-1; i>=0;i--){
                res1 += str.charAt(i);
            }
            return res1;
        }






    }

}
