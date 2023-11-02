import java.util.*;

public class jobSequencing {
    static class Job{
        int deadline;
        int id;
        int profit;

        public Job(int i,int d,int p){
            id=i;
            profit=p;
            deadline=d;
        }
    }
   
    /**
     * @param args
     */
    public static void main(String []args){
        int jobsInfo[][]={{4,40},{1,20},{1,40},{1,30}};
        ArrayList<Job> jobss=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobss.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobss,(obj1,obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobss.size();i++){
            Job curr=jobss.get(i);
            if(curr.deadline>time){
                time++;
                seq.add(curr.id);
            }
        }
        System.out.print("Max Jobs= "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
