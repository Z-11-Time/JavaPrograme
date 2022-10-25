package com.zcc.demo.demo2.other;
import java.util.Scanner;
public class HanNuoTower {
    public static void main(String[] args) {
            Tower tower = new Tower();
            Scanner input = new Scanner(System.in);
            System.out.println("输入汉诺塔的层数:");
            tower.move(input.nextInt(),'A','B','C');
    }
}
class Tower{
    public void move(int num,char a,char b,char c){
        //如果只有一个,a-->c
        if(num == 1)
            System.out.println(a + "-->" + c);
        //执行三步走
        // 如果有多个,分为两部分，最底下的1和num-1的
        else{
            move(num - 1,a,c,b);
            //得有一个输出，除了最后一层以外的层数
            // 之所以只写一个输出是因为在输出完上一部分的移动之后是底下一层的移动，在num = 1那
            System.out.println(a + "-->" + c);
            move(num - 1,b,a,c);
        }
    }
}