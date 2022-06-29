package transformer;

public class TransformToUpper extends WordsTransformer{
    @Override
    public boolean check(String string) {
        return string.length()==3;
    }

    @Override
    public String transform(String string) {
        return string.toUpperCase();
    }
}
