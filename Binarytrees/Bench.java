import java.util.Random;


class Bench {


private static int[] keys(int k, int n) {
        Random rnd = new Random();
        int[] indx = new int[k];
        for (int i = 0; i < k ; i++) {
            indx[i] = rnd.nextInt(n);
        }
            return indx;
        }

    public static void main(String[] args) {
        int[] sizes = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};
        int k = 10000;
        double t0, t1, tmin;
        double b0, b1, bmin;

        System.out.println("n\tTree\t\tSearch");

        for(int n : sizes)
        {
            int[] key = Bench.keys(k, n);
            int[] shuffle = BinaryTree.shuffle(n);
            int[] ordered = BinaryTree.ordered(n);
            BinaryTree tree = BinaryTree.generate(shuffle);
            tmin = bmin = 0;

            for(int i = 0; i < k; i++)
            {
                t0 = System.nanoTime();
                tree.lookup(key[i]);
                t1 = System.nanoTime() - t0;
                tmin = tmin + t1;

                b0 = System.nanoTime();
                Binary.search(ordered, key[i]);
                b1 = System.nanoTime() - b0;
                bmin = bmin + b1;
            }
            System.out.println(n + "\t" + tmin/k + "\t" + bmin/k);
        }
    }

}
