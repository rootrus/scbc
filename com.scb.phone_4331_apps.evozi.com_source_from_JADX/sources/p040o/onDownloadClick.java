package p040o;

import java.util.concurrent.locks.LockSupport;
import p040o.omGMBSectionClick;

/* renamed from: o.onDownloadClick */
public abstract class onDownloadClick extends MwCreateQrActivity_ViewBinding {
    /* access modifiers changed from: protected */
    public abstract Thread write();

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        Thread write = write();
        if (Thread.currentThread() != write) {
            LockSupport.unpark(write);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(long j, omGMBSectionClick.write write) {
        onGetStartedClick.write((Object) write, "delayedTask");
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(this != lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver)) {
                throw new AssertionError();
            }
        }
        lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(j, write);
    }
}
