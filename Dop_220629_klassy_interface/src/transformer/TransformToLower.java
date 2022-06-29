package transformer;

public class TransformToLower extends WordsTransformer{


    @Override
    public boolean check(String string) {
        return string.length()==4;
    }

    @Override
    public String transform(String string) {
        return string.toLowerCase();
    }
}
