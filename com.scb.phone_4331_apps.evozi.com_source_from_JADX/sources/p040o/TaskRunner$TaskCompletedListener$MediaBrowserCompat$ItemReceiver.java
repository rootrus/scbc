package p040o;

import p040o.TaskRunner;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver */
public final class TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    final /* synthetic */ TaskRunner.TaskCompletedListener read;

    public TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver(TaskRunner.TaskCompletedListener taskCompletedListener) {
        this.read = taskCompletedListener;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final Throwable th = (Throwable) obj;
        TaskRunner.TaskCompletedListener taskCompletedListener = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1219xa97c14d5>(this) {
            private /* synthetic */ TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C1219xa97c14d5) obj).aj_();
                this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        };
        if (taskCompletedListener.RatingCompat != null) {
            r1.IconCompatParcelizer(taskCompletedListener.RatingCompat);
        }
    }
}
