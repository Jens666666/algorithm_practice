import java.util.*;

public class prim{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        //c从1号节点开始，更符合习惯
        int[][] grid = new int[v+1][v+1];
        for(int i = 0; i<= v; i++){
            Arrays.fill(grid[i],10001);
        }
        for(int i = 0; i < e; i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            int q = sc.nextInt();
            grid[s][t] = q;
            grid[t][s] = q;
        }

        //存储每个节点到最小生成树的距离
        int[] minDir = new int[v+1];
        Arrays.fill(minDir,10001);

        //记录哪些节点已经加入生成树
        boolean[] isAddTree= new boolean[v+1];

        for(int i = 1; i <= v; i++){
            //1.选择距离生成树最近的节点
            int min = Integer.MAX_VALUE;
            int curNode = -1;
            for(int j = 1; j <= v; j++){
                //如果j结点没有加入并且距离最小，记录当前距离，看看是不是最近的，是最近的就加入
                if(!isAddTree[j] && minDir[j] < min){
                    curNode = j;
                    min = minDir[j];

                }
            }

            //2.将最近的节点加入到最小生成树
            isAddTree[curNode] = true;

            //3.更新节点到最小生成树的距离，因为最小生成树已经更新了(实际只需要更新和curNode的最小距离)
            for(int j = 1; j<=v; j++){
                if(!isAddTree[j] && grid[curNode][j] < minDir[j]){
                    minDir[j] = grid[curNode][j];
                    //System.out.println(minDir[j]);
                }
            }
        }

        //统计结果
        int res = 0;
        for(int i = 2; i <=v; i++){
            res += minDir[i];
        }
        System.out.println(res);
        
        
        
        
        
        /*/打印邻接矩阵
        for(int i = 0; i<v+1;i++){
            for(int j = 0; j<v+1; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        //*/
    }
}