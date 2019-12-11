import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;

public class JavaDriver {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\tools\\goland2\\goland2\\config\\scratches\\auto_fill_data.json";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer noOfTestCases = Integer.parseInt(bufferedReader.readLine());

        JSONArray jsonArray = (JSONArray) readJson(fileName);

        List<String> output = getAutoFillResponse(jsonArray);
    }

    private static List<String> getAutoFillResponse(JSONArray jsonArray) {
//        String val = (String) ((JSONObject) jsonArray.get(2)).get("question");
        return null;
    }

    public static Object readJson(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser parser = new JSONParser();
        return parser.parse(reader);
    }
}
