package com.zcc.demo.demo2;

public class MiGong_1 {
    public static void main(String[] args) {
        //先做地图 周围一圈为 1
        int[][] map = new int[9][9];
        Find find = new Find();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || i == map.length - 1) {
                    map[i][j] = 1;
                } else if (j == 0 || j == map[i].length - 1) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        map[3][2] = 1;
        map[3][1] = 1;
        map[2][2] = 1;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        find.findway(map,1,1);
        //老鼠的路径
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
//找路
class Find{
    //i，j是老鼠的位置
    // 0 是可以走 1 是走不了 2 是可以走，且走过了 3 是走过了，不通
    public boolean findway(int[][] map,int i,int j){
        //终点位置判断
        if(map[7][7] == 2)
            return true;
        else {//画路径
            if(map[i][j] == 0){
                map[i][j] = 2;
                //寻找下一步能不能实现
                if(findway(map,i + 1,j)){
                    return true;
                }else if(findway(map,i,j + 1)){
                    return true;
                }else if(findway(map,i - 1,j)) {
                    return true;
                }
                else if(findway(map,i,j - 1)) {
                    return true;
                }else{
                    //如果都走不通(回去的路为2)
                    //那就不往这个方向走，直接回到没走这个方向前的递归判断
                    //然后由于这里是3所以不会继续这个方向走了
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}


