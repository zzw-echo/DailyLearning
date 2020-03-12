package Java8新特性;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by zhangzewen on 2020/3/12
 * <p>
 * 线程状态
 * NEW, RUNNABLE, RUNNING, BLOCKED, DEAD
 */
public class TestForkJoin {

    @Test
    public void test1() {

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0, 100000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);

    }

    @Test
    public void test2() {
        long sum = 0L;
        for (long i = 0; i < 100000000L; i++) {
            sum += i;
        }
        System.out.println(sum);

    }


}
