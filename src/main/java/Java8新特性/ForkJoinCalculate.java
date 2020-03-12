package Java8新特性;

import java.util.concurrent.RecursiveTask;

/**
 * Created by zhangzewen on 2020/3/12
 */
public class ForkJoinCalculate extends RecursiveTask<Long> {

    private static final long serialVersionUID = 121212334776L;

    private long start;
    private long end;

    private static final long THRESHOLD = 10000;

    public ForkJoinCalculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;

        if (length <= THRESHOLD){
            long sum = 0;

            for (long i = start; i <= end; i++) {
                sum += i;
            }

            return sum;
        }else {
            long middle = (start + end) / 2;

            ForkJoinCalculate left = new ForkJoinCalculate(start, middle);
            left.fork();

            ForkJoinCalculate right = new ForkJoinCalculate(middle, end);
            right.fork();

            return left.join() + right.join();
        }

    }
}
