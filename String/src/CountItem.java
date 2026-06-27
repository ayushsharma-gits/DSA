import java.util.List;

public class CountItem {
    static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;

        switch(ruleKey){
            case "name":
                index= 2;
                break;
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
        }

        int ans = 0;

        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                ans++;
            }
        }

        return ans;
    }
}
