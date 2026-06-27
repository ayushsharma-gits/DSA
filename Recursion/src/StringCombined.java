public class StringCombined {
    static void main(String[] args) {
        String[] word1={"ab", "c"};
        String[] word2={"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 ="";
        for(int i=0;i<word1.length;i++){
            result1=result1 +word1[i];
        }
        String result2 ="";
        for(int j=0;j<word2.length;j++){
            result2=result2 +word2[j];
        }
        if(result1.equals(result2)){
            return true;
        }else{
            return false;
        }
    }
}
