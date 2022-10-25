package com.zcc.demo.demo2;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //创建地图；
        for(int i = 0;i < map.length;i++){
            for(int j = 0;j < map[i].length;j++){
                if(i == 0||i == map.length - 1){
                    map[i][j] = 1;
                }
                else if(j == 0||j == map[i].length - 1){
                    map[i][j] = 1;
                }
                else
                    map[i][j] = 0;
            }
        }
        map[3][1] = map[3][2] = 1;
        for(int i = 0;i < map.length;i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        T t1 = new T();
        t1.finaway(map,1,1);
        System.out.println("找路的情况；");
        for(int i = 0;i < map.length;i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class T{
    //0 表示可以走 1 表示不能走 2 表示可以走 3 表示走过，但是是死路
    //决定走路的方向为先向下，再往右，在再上，再向左
    public boolean finaway(int[][] map,int i,int j){
        if(map[6][5] == 2)
            return true;
        else {
            if (map[i][j] == 0){
                //假定这个位置可以走通
                map[i][j] = 2;
                //决定走路的方向为先向下，再往右，在再上，再向左
                //finaway(map,i + 1,j) 在判断这个位置是否为true，然后追下一个位置的返回值
                if(finaway(map,i + 1,j)){
                    return true;
                }else if(finaway(map,i,j + 1)){
                    return true;
                }else if(finaway(map,i - 1,j)) {
                    return true;
                }
                else if(finaway(map,i,j - 1)) {
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}