package p040o;

import p040o.KtaServiceCaller;

/* renamed from: o.LevelChangedEvent */
public final /* synthetic */ class LevelChangedEvent implements Runnable {
    private final /* synthetic */ KtaServiceCaller.JOB_TYPE.C35622 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ LevelChangedEvent(KtaServiceCaller.JOB_TYPE.C35622 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void run() {
        KtaServiceCaller.JOB_TYPE.this.write();
    }
}
