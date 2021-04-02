package cn.edu.ncu.eureka.exercise.exe01;

public class Exe01 {
    public static void main(String[] Args){
        System.out.printf("byte类型的数据的取值范围：%d ~ %d\n",Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("short类型的数据的取值范围：%d ~ %d\n",Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("int类型的数据的取值范围：%d ~ %d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("long类型的数据的取值范围：%d ~ %d\n",Long.MIN_VALUE,Long.MAX_VALUE);
        System.out.printf("float类型的数据的取值范围：%f ~ %f\n",Float.MIN_VALUE,Float.MAX_VALUE);
        System.out.printf("double类型的数据的取值范围：%f ~ %f\n",Double.MIN_VALUE,Double.MAX_VALUE);

        String str1 = "234453232454467980349";
        String str2 = Long.toString(Long.MAX_VALUE);
        boolean flag = true;
        if (str1.length()>str2.length())
            flag = false;
        else if (str1.length() == str2.length()){
            if (str1.compareTo(str2)>0)
                flag = false;
        }
        System.out.print("234_453_232_454_467_980_349L"+(flag?"":"不")+"在long长整数的取值范围之内");
    }
}
