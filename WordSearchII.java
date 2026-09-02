import java.util.*;
// 111524202055 Surendhar L 
class Solution {

    int[] d={-1,0,1,0,-1};

    class TrieNode {
        TrieNode[] child=new TrieNode[26];
        String word;
    }

    TrieNode root=new TrieNode();
    Set<String> set=new HashSet<>();

    public List<String> findWords(char[][] board,String[] words){

        for(String word:words){
            insert(word);
        }

        int R=board.length;
        int C=board[0].length;

        boolean[][] vis=new boolean[R][C];

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){

                dfs(board,row,col,root,vis);
            }
        }

        return new ArrayList<>(set);
    }

    public void insert(String word){

        TrieNode curr=root;

        for(int i=0;i<word.length();i++){

            int idx=word.charAt(i)-'a';

            if(curr.child[idx]==null){
                curr.child[idx]=new TrieNode();
            }

            curr=curr.child[idx];
        }

        curr.word=word;
    }

    public void dfs(char[][] board,int row,int col,
                    TrieNode node,boolean[][] vis){

        int R=board.length;
        int C=board[0].length;

        if(row<0 || row>=R ||
           col<0 || col>=C ||
           vis[row][col]){
            return;
        }

        int idx=board[row][col]-'a';

        if(node.child[idx]==null){
            return;
        }

        TrieNode curr=node.child[idx];

        if(curr.word!=null){
            set.add(curr.word);
        }

        vis[row][col]=true;

        for(int i=0;i<4;i++){

            int nr=row+d[i];
            int nc=col+d[i+1];

            dfs(board,nr,nc,curr,vis);
        }

        vis[row][col]=false;
    }
}