public class Exam2_1{
    public static void main(String[] args){
        //字符型
        char name1 = '张';
        char name2 = '三';
        System.out.println("姓名为：" + name1 + name2);

        //整数型
        short x = 30;
        int y = 030;
        long z = 0x30L;
        System.out.println("转化为十进制：x=" + x + ",y="+y+",z="+z);
        
        //浮点型
        float m=12.345f;
        double n=10;
        System.out.println("计算乘积m*n="+ m*n);

        //布尔型
        boolean flag1 = false, flag2 = true;
        System.out.println("逻辑值：flag1="+ flag1+"flag2"+ flag2); 
    }
}