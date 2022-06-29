package TransformerInterfaces;

public class UpperCaseChecker implements WordChecker{
    @Override
    public boolean check(String word) {
        return word.length()==3;
    }

    @Override
    public String transform(String word) {
        return word.toUpperCase();
    }
}
