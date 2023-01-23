class Solution {
    public String intToRoman(int num) {
        final String[] M = {"","M","MM","MMM"}; //1000,2000,3000
        final String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; //0,100,500,900
        final String[] X = {"","X", "XX","XXX","XL","L","LX","LXX","LXXX","XC"}; //0,10,50,90
        final String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"}; //0,1,5,9

        return M[num/1000] + C[(num % 1000) /100] + X[(num%100)/10] + I[num%10];
    }
}
