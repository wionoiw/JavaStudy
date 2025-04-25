//Day04
package class_Demo.Test2;
//需求:定义一个长度为3的数组,数组存储1~3~名学生对象作为初始数据,学生对象的学号,姓名各不相同
//学生的属性:学号,姓名,年龄
//要求1:再次添加一个学生对象,并在添加的时候进行学号的唯一性判断
//要求2:添加完毕之后,遍历所有学生信息
//要求3:通过id删除学生信息,如果存在,则删除,如果不存在，则提示删除失败
//要求4:删除完毕后,遍历所有学生信息
//要求5:查询数组id为"2"的学生,如果存在,则将他的年龄+1岁
public class classTest2 {
    public static void main(String[] args){
        Student stu1 = new Student(1,"张三",17);
        Student stu2 = new Student(2,"李四",18);
        Student stu3 = new Student(3,"王五",19);
        Student[] arr1 = {stu1,stu2,stu3};
        //要求1:添加一个学生对象
        Student stu4 = new Student(4,"赵六",20);
        arr1 = tianJIa(arr1,stu4);
        //要求2:遍历所有学生信息
        print(arr1);
        //要求3:通过id删除学生信息
        int id1 = 3;
        delete(id1,arr1);
        //要求4:遍历所有学生信息
        print(arr1);
        //要求5:查询数组id为"2"的学生,如果存在,则将他的年龄+1岁
        int id2 = 2;
        addAge(id2,arr1);
        print(arr1);
    }

    //要求5
    public static void  addAge(int id,Student[] arr){
        //有该id可以增加
        if(panDuan(id,arr)){
            for(int i = 0;i < arr.length;i++){
                //如果数组在该位为空,跳过本次循环
                if(arr[i] == null){
                    continue;
                }else if(arr[i].getId() == id){
                    arr[i].setAge(arr[i].getAge() + 1);
                }
            }
        }
    }

    //要求3:删除学生信息,传递的是地址值,可以直接删除对应项,不用返回删除后的数组
    public static void delete(int id,Student[] arr){
        //有该id可以删除
        if(panDuan(id,arr)){
            for(int i = 0;i < arr.length;i++){
                //如果数组在该位为空,跳过本次循环
                if(arr[i] == null){
                    continue;
                }else if(arr[i].getId() == id){
                    arr[i] = null;
                }
            }
        }
    }

    //要求3:判断数组中是否存在该id
    public static boolean panDuan(int id,Student[] arr){
        for(int i = 0;i < arr.length;i++){
            //如果数组在该位为空,跳过本次循环
            if(arr[i] == null){
                continue;
            }else if(id == arr[i].getId()){
                return true;
            }
        }
        System.out.println("没有id为" + id +"的学生");
        return false;
    }

    //要求2: 循环打印Studednt数组
    public static void print(Student[] arr){
        for(int i = 0;i < arr.length;i++){
            //如果数组在该位为空,跳过本次循环
            if(arr[i] == null){
                continue;
            }
            System.out.println(arr[i].getId() + "  "+ arr[i].getName() + "  " + arr[i].getAge() + "  ");
        }
        System.out.println("----------");
    }

    //要求1:在数组中添加一个学生对象
    public static Student[] tianJIa(Student[] arr,Student stu){
        //没有重复可以添加
        if(panDuan(arr,stu)){
            //数组长度大于非空位个数,有空位可以添加
            if(arr.length > kongWei(arr)){
                //循环遍历查找数组空位,添加stu
                for(int i = 0 ;i < arr.length;i++ ){
                    if(arr[i] == null){
                       arr[i] = stu;
                       return arr;
                    }
                }
            }else{
                //原数组已满,建立新数组,copy原数组每一项,并在最后一项添加stu
                Student[] Arr = new Student[arr.length+1];
                //循环拷贝数组
                for(int i = 0;i < Arr.length;i++){
                    //如果是最后一行,添加stu
                    if(i == Arr.length - 1){
                        Arr[i] = stu;
                    }else{
                        Arr[i] = arr[i];
                    }
                }
                return Arr;
            }
        }
        return arr;
    }

    //要求1:查看数组中有几个非空位
    public static int kongWei(Student[] arr){
        //记录非空位个数
        int temp = 0 ;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != null){
                temp++;
            }
        }
        return temp;
    }

    //要求1:循环进行学号唯一性判断
    public static boolean panDuan(Student[] arr,Student stu){
        for(int i = 0;i < arr.length;i++){
            //如果数组在该位为空,跳过本次循环
            if(arr[i] == null){
                continue;
            }
            //学号如果重复,输出已有该学号
            if(stu.getId() == arr[i].getId()){
                System.out.println("已有该学号,请勿重复添加学生");
                return false;
            }
        }
        return true;
    }
}



