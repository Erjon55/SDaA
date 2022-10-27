public class LowerCaseFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        String line1 = input.toLowerCase();
        return line1;
    }
}
