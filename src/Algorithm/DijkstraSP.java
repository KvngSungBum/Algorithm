package Algorithm;

import java.util.*;


public class DijkstraSP {
    public static void main(String[] args){
        Graph g = new Graph(6);
        g.input(0,1,7);
        g.input(0,2,9);
        g.input(0,5,14);
        g.input(1,2,10);
        g.input(1,3,15);
        g.input(2,3,11);
        g.input(2,5,2);
        g.input(3,4,6);
        g.input(4,5,9);

        g.dijkstra(0);
    }
}

class Graph{
    private int n;
    private int maps[][];

    public Graph(int n){
        this.n = n;
        maps = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                maps[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    class Node implements Comparable<Node>{
        private int weight;
        private int index;

        public Node(int weight,int index){
            this.weight = weight;
            this.index = index;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(this.weight, node.weight);
        }
    }
    public void input(int i, int j, int w){
        maps[i][j] = w;
        maps[j][i] = w;
    }

    public void dijkstra(int v){
        PriorityQueue<Node> que = new PriorityQueue<>();
        int distance[] = new int[n];
        boolean[] check = new boolean[n];

        for(int i=0;i<n;++i){
            distance[i] = Integer.MAX_VALUE;
        }

        que.add(new Node(v,0));
        distance[v]=0;
        check[v] = true;

        for(int i=0;i<n;++i){
            if(distance[i] ==2147483647)
                System.out.print("*");
            else
                System.out.print(distance[i]+" ");
        }
        System.out.println();

        for(int i=0;i<n;++i){
            if(!check[i] &&maps[v][i] !=Integer.MAX_VALUE){
                distance[i] = maps[v][i];
                que.add(new Node(maps[v][i],i));
            }
        }

        for(int i=0;i<n;++i){
            if(distance[i] ==2147483647)
                System.out.print("*");
            else
                System.out.print(distance[i]+" ");
        }
        System.out.println();

        while(!que.isEmpty()){
            int min = Integer.MAX_VALUE;
            int min_index = -1;

            Node node = que.poll();
            min = node.weight;
            min_index = node.index;

            check[min_index] = true;
            for(int i=0;i<n;++i){
                if(!check[i]&&maps[min_index][i] != Integer.MAX_VALUE){
                    if(distance[min_index]+maps[min_index][i] < distance[i]){
                        distance[i] = distance[min_index] + maps[min_index][i];
                        que.add(new Node(distance[i],i));
                    }
                }
            }
            for(int i=0;i<n;++i){
                if(distance[i] == 2147483647) System.out.print("*");
                else System.out.print(distance[i]+" ");
            }
            System.out.println();
        }
    }
}
