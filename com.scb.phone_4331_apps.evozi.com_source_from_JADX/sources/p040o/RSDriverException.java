package p040o;

import java.util.concurrent.Executor;

/* renamed from: o.RSDriverException */
public final class RSDriverException implements Executor {
    private final Executor IconCompatParcelizer;

    public RSDriverException(Executor executor) {
        this.IconCompatParcelizer = executor;
    }

    public final void execute(Runnable runnable) {
        this.IconCompatParcelizer.execute(new write(runnable));
    }

    /* renamed from: o.RSDriverException$write */
    static class write implements Runnable {
        private final Runnable IconCompatParcelizer;

        write(Runnable runnable) {
            this.IconCompatParcelizer = runnable;
        }

        public final void run() {
            try {
                this.IconCompatParcelizer.run();
            } catch (Exception e) {
                AlertController$RecycleListView.write("Executor", "Background execution failure.", (Throwable) e);
            }
        }
    }
}
