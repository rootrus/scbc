package p040o;

import p040o.TaskRunner;
import p040o.access$2300;

/* renamed from: o.setErrorCode */
public final /* synthetic */ class setErrorCode implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TaskRunner.TaskCompletedEvent write;

    public /* synthetic */ setErrorCode(TaskRunner.TaskCompletedEvent taskCompletedEvent) {
        this.write = taskCompletedEvent;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.TaskCompletedEvent taskCompletedEvent = this.write;
        Throwable th = (Throwable) obj;
        if (taskCompletedEvent.RatingCompat != null) {
            taskCompletedEvent.RatingCompat.aj_();
        }
        taskCompletedEvent.MediaBrowserCompat$ItemReceiver(taskCompletedEvent.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
