public class Plane {

    public void boom(ReportCallback callback){
        for (int i=0;i<5;i++){
            try {
                System.out.println("执行轰炸任务");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        callback.report("已成功摧毁基地");
    }
}
