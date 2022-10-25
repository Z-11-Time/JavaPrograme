package demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //有多少个cpu
        System.out.println(runtime.availableProcessors());
    }
}
