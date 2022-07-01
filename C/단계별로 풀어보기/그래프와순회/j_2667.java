import java.util.*;

public class j_2667 {

    static boolean visit[][];
    static int arr[][];
    static int N;
    static int home_group=0;
    static int home_group_count=0;
    static ArrayList<Integer> homeGroupCount;


    static void dfs(int x,int y){
        
        if(!visit[x][y]){
            visit[x][y]=true;
    
            if(arr[x][y]==1){
                home_group_count++;
                //상
                if(y>=1 && y<=N-1){
                    dfs(x,y-1);
                }

                //하
                if(y>=0 && y<=N-2){
                    dfs(x,y+1);
                }
                
                //좌
                if(x>=1 && x<=N-1){
                    dfs(x-1,y);
                }
                //우
                if(x>=0 && x<=N-2){
                    dfs(x+1,y);
                }
            }
            else {
                return;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
    
        N = in.nextInt();
        in.nextLine();
        homeGroupCount = new ArrayList<Integer>();
        visit =new boolean[N][N];
        arr =new int[N][N];
        String s;
        for(int i=0;i<N;i++){
            s= in.nextLine();
            for(int j=0;j<s.length();j++){
                arr[i][j]=Character.getNumericValue(s.charAt(j));
            }    
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                dfs(i,j);
                if(home_group_count>0){
                    homeGroupCount.add(home_group_count);
                    home_group++;
                    home_group_count=0;
                }
            }
        }  
        System.out.println(home_group);

        Collections.sort(homeGroupCount);
        for(int i=0;i<homeGroupCount.size();i++){
            System.out.println(homeGroupCount.get(i));
        }
        in.close();
    }

    
}

// 1. 64개 배열을 전부 visit[][]으로 설정하고 for문으로 (0,0) 부터 전부 dfs로 탐색
// 2. 만약 1이 있으면 거기서 부터 bfs, dfs 로 탐색 시작하고 더이상 탐색하지 못할때 단지의 수(count)
// 를 증가하고, 탐색했던 집의 수를 저장
// 3. 탐색할대는 상하좌우 배열 범위 안넘어가게 주의해서
// 4. home_group_count가 0 이상이면 그룹이 있다는것
// 5. 이과정을 1의 탐색이 끝날때가지 , 그리고 bfs, dfs 구분이 안되는듯?