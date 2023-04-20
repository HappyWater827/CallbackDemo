public class Clerk {

    public void arrive(ReportCallback callback){
        for (int i=0;i<5;i++){
            try {
                System.out.println("还在路上");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        callback.report("已到达烟酒行");
    }
}
