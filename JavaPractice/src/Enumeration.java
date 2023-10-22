public enum Enumeration {
    DAT_HANG(2),
    GIAO_HANG(5);
    private final int time;

    Enumeration(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
