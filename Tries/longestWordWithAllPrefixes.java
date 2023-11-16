package Tries;

public class longestWordWithAllPrefixes {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++)
            children[i]=null;
        }
    }

    public static Node root=new Node();

    //Insert In Trie
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            curr.children[idx]=new Node();
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    //Searching In Trie
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null) return false;
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }
    //Longest Word With All Prefixes
    public static String ans="";
    public static void longestWord(Node root,StringBuilder temp){
        if(root == null) return;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()) ans=temp.toString();
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String []args){
        
    }
}
