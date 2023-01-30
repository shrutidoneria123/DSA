Method 1------brute force
                            class Solution {
                                public int findCenter(int[][] edges) {
                                    // calculate the number of edges;
                                    // create an array of edges
                                    // for each edge in eges:
                                    int n = edges.length+1;
                                  int[] edgeCount=new int[n+1];
                                for(int[] edge:edges){
                                   int x=edge[0];
                                   int y=edge[1];
                                    edgeCount[x]++;
                             edgeCount[y]++;
                             if(edgeCount[x]>1)return x;
                             if(edgeCount[y]>1)return y;
                                }

                                return 0;
                                }
                            }
  Method 2-- HashSet optimize solution
    
                              import java.util.HashSet;
                          import java.util.Set;
                               class Solution{
                                     public int findCenter(int[][] edges){
                                         Set<Integer> outEdgesFound = new HashSet<>();
                                         for(int[] edge:edges){
                                             if(outEdgesFound.contains(edge[0])){
                                                 return edge[0];
                                             }
                                             outEdgesFound.add(edge[0]);
                                             if(outEdgesFound.contains(edge[1])){
                                                 return edge[1];
                                             }
                                             outEdgesFound.add(edge[1]);
                                         }
                                         return -1;
                                     }
                              }
method 3 -----
                        class Solution{
                          public int findCenter(int[][] edges){
                              int a =edges[0][0];
                              int b =edges[0][1];
                                  int c =edges[1][0];
                                  int d =edges[1][1];
                                  return a==c||a==d?a:b;

                      }
                      }
method 4--------
                            class Solution{
                            public int findCenter(int[][] edges){
                                if(edges[0][0]==edges[1][0]|| edges[0][0]==edges[1][1]){
                                    return edges[0][0];
                                }
                                return edges[0][1];
                            }
                          }

