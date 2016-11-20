class MyClass {
    @Test(value1 = 2, value2 = 4)
    public void test(int a, int b) {
        System.out.printf("First Value = %d\nSecond Value = %d", a, b);
    }
}
