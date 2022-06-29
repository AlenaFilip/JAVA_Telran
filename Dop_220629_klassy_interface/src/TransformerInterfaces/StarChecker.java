package TransformerInterfaces;

public class StarChecker implements WordChecker{
    @Override
    public boolean check(String word) {
        return word.length()==5;
    }

    @Override
    public String transform(String word) {
        return "*****";
    }
}
