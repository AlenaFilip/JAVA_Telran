package transformer;

public class TransformToStars extends WordsTransformer{
    @Override
    public boolean check(String string) {
        return string.length()==5;
    }

    @Override
    public String transform(String string) {
        return "*****";
    }
}
