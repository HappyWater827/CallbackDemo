public class Mayor implements ReportCallback {
    private Clerk clerk = new Clerk();

    public Mayor() {
        super();
    }

    public Mayor(Clerk clerk) {
        this.clerk = clerk;
    }

    public void command() {
        clerk.arrive(this);
    }

    @Override
    public void report(String result) {
        System.out.println("秘书当前位置：" + result);
    }
}
