//Day03
package Method_Demo.Test6;
//随机产生一个六位验证码，随即包含大小字母和数字
//ASCII表中0~9为48~57,A~Z为65~90,a~z为97~122
import java.util.Random;

public class MethodTest6 {
    public static void main(String[] orgs){
        System.out.print(yanZhengMa(maBiao()));
    }

    //随机生成密码
    public static String yanZhengMa(char[] maBiao){
        String yanzhengma = "";
        Random random = new Random();
        for(int i = 0;i < 6;i++){
            int ran = random.nextInt(62);
            yanzhengma += maBiao[ran];
        }
        return yanzhengma;
    }

    //创建密码表数组,即0~9,A~Z,a~z
    public static char[] maBiao(){
        char[] maBiao = new char[62];
        for(int i = 0 ;i < maBiao.length;i++){
            if(i < 10){
                maBiao[i] = (char)( 48 + i );
            }else if(i < 36){
                maBiao[i] = (char)( 55 + i );
            }else{
                maBiao[i] = (char)( 61 + i );
            }
        }
        return maBiao;
    }


}

