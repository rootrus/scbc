package p040o;

/* renamed from: o.RewardsHomeActivity_ViewBinding */
public abstract class RewardsHomeActivity_ViewBinding {
    /* access modifiers changed from: protected */
    public abstract String write();

    /* renamed from: o.RewardsHomeActivity_ViewBinding$read */
    public static class read extends RewardsHomeActivity_ViewBinding {
        private String write = "";

        public read(String str) {
            this.write = str;
        }

        /* access modifiers changed from: protected */
        public final String write() {
            return this.write;
        }
    }

    public final boolean IconCompatParcelizer() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 4; i < 8; i++) {
            if (write().equals(stackTrace[i].getClassName())) {
                return true;
            }
        }
        return false;
    }
}
