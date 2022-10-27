import java.util.Arrays;

public class RemoveNamesFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        String[] fields = input.split(",");
        String[] noNames = Arrays.copyOfRange(fields, 2, fields.length);
        String res = "";
        for (String field : noNames){
            res += field + ",";
        }

        return res;
    }
}
