package JAVA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        Map<String,Integer> describes = new HashMap<>();
        describes.put("type", 0);
        describes.put("color", 1);
        describes.put("name", 2);

        for(int i = 0; i < items.size(); i++) {

            if (ruleKey.equals("type") && ruleValue.equals(items.get(i).get(describes.get(ruleKey)))){
                count ++;
            }
            if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(describes.get(ruleKey)))){
                count ++;
            }
            if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(describes.get(ruleKey)))){
                count ++;
            }
        }

        return count;

    }
}
