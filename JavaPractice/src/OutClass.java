public class OutClass {
    private int outId;

    public OutClass(int outId) {
        this.outId = outId;
    }

    public class InnerClass{
        private int innerId;

        public int getId() {
            return innerId;
        }

        public void setId(int innerId) {
            this.innerId = innerId;
        }
        public int getOutId(){
          return outId;
        }
    }

    public static class InnerClass2{
        public int innerId2;

        public InnerClass2(int innerId2) {
            this.innerId2 = innerId2;
        }
    }
}
