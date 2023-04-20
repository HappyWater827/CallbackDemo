public class Obama implements ReportCallback {
    private Plane plane = new Plane();

    public Obama() {
        super();
    }

    public Obama(Plane plane) {
        this.plane = plane;
    }

    public void command() {
        plane.boom(this);
    }

    @Override
    public void report(String result) {
        System.out.println("任务完成情况：" + result);
    }
}
