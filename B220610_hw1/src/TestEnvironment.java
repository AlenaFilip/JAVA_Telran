public class TestEnvironment implements MakeArrayable{
    @Override
    public int[] makeArray() {
        int n = 6;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i ] = (int) (Math.random()*100.0);
        }
        return arr;
    }
}
