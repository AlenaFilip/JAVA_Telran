package TransformerInterfaces;

public class LowerCaseChecker implements WordChecker{
    @Override
    public boolean check(String word) {
        return word.length()==4;
    }

    @Override
    public String transform(String word) {
        return word.toLowerCase();
    }
}
