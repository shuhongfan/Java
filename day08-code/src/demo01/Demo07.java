package demo01;

public class Demo07 {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1=str1.split(",");
        System.out.println(str1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String str2="aaa bbb ccc";
        String[] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String str3="XXX.YYY.ZZZ";
        String[] array3=str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
