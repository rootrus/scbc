package p040o;

import p040o.TaskRunner;

/* renamed from: o.getOriginalValue */
public final /* synthetic */ class getOriginalValue implements Runnable {
    private final /* synthetic */ TaskRunner.C3843b.C38441 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getOriginalValue(TaskRunner.C3843b.C38441 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void run() {
        TaskRunner.C3843b.C38441 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        setStopTime setstoptime = setStopTime.read;
        if (r0.RatingCompat != null) {
            setstoptime.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
