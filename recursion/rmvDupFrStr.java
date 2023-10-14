public class rmvDupFrStr {
    public static void removeDuplicates(String str,int indx,StringBuilder newStr,boolean []map){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(indx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str,indx+1,newStr,map);
        }else {
            map[currChar - 'a']=true;
            removeDuplicates(str, indx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args){
        String str="appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean [26]);
;    }
}
