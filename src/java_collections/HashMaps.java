package java_collections;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tridev on 30-07-2017.
 */
public class HashMaps {

    public static void main(String[] args) {

        Map<Integer, Integer> productsAndIds = new HashMap<>();
        productsAndIds.put(101,5);
        productsAndIds.put(110,6);
        productsAndIds.put(120,10);
        productsAndIds.put(115,8);
        productsAndIds.put(106,7);

        JSONArray jArray = new JSONArray();
        for (Map.Entry<Integer, Integer> entry : productsAndIds.entrySet()) {
            JSONObject jsonObject = new JSONObject();
            for (int j = 0; j < 2; j++) {
                jsonObject.put("product_id", entry.getKey());
                jsonObject.put("product_quantity", entry.getValue());
            }
            jArray.put(jsonObject);
        }
        System.out.println(jArray);
    }

}
