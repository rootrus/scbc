package p040o;

/* renamed from: o.PrepaidDetailsActivity_ViewBinding */
public class PrepaidDetailsActivity_ViewBinding {
    private long IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    public write write = write.UNSTARTED;

    /* renamed from: o.PrepaidDetailsActivity_ViewBinding$read */
    public enum read {
        SPLIT,
        UNSPLIT
    }

    /* renamed from: o.PrepaidDetailsActivity_ViewBinding$write */
    public enum write {
    }

    public static PrepaidDetailsActivity_ViewBinding write() {
        PrepaidDetailsActivity_ViewBinding prepaidDetailsActivity_ViewBinding = new PrepaidDetailsActivity_ViewBinding();
        prepaidDetailsActivity_ViewBinding.IconCompatParcelizer();
        return prepaidDetailsActivity_ViewBinding;
    }

    public PrepaidDetailsActivity_ViewBinding() {
        read read2 = read.UNSPLIT;
    }

    public final void IconCompatParcelizer() {
        if (this.write == write.STOPPED) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        } else if (this.write == write.UNSTARTED) {
            this.IconCompatParcelizer = System.nanoTime();
            this.write = write.RUNNING;
        } else {
            throw new IllegalStateException("Stopwatch already started. ");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.write == write.RUNNING || this.write == write.SUSPENDED) {
            if (this.write == write.RUNNING) {
                this.MediaBrowserCompat$CustomActionResultReceiver = System.nanoTime();
            }
            this.write = write.STOPPED;
            return;
        }
        throw new IllegalStateException("Stopwatch is not running. ");
    }

    public String toString() {
        long j;
        long j2;
        long j3;
        if (this.write == write.STOPPED || this.write == write.SUSPENDED) {
            j3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            j2 = this.IconCompatParcelizer;
        } else if (this.write == write.UNSTARTED) {
            j = 0;
            return PrepaidCardAdapter$PrepaidHolder_ViewBinding.write(j / 1000000);
        } else if (this.write == write.RUNNING) {
            j3 = System.nanoTime();
            j2 = this.IconCompatParcelizer;
        } else {
            throw new RuntimeException("Illegal running state has occurred.");
        }
        j = j3 - j2;
        return PrepaidCardAdapter$PrepaidHolder_ViewBinding.write(j / 1000000);
    }
}
