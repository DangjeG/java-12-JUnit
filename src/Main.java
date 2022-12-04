public class Main {


    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testEmptyParam();
        tests.testNegativeParam();
        tests.testPositiveParam();
        tests.test0xParam();
        tests.testSharpParam();
        tests.testZeroParam();
        tests.testIllegalPositionParam();
        tests.testIllegalParam();

    }
}