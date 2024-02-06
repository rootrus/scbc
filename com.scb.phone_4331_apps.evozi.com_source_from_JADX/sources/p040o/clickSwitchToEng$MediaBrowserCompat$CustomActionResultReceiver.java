package p040o;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver */
final class clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver<T> extends HmlETBBusinessInformationActivity<DebitCardResetPinActivity<T>> {
    final AtomicInteger MediaBrowserCompat$ItemReceiver = new AtomicInteger();
    final BlockingQueue<DebitCardResetPinActivity<T>> read = new ArrayBlockingQueue(1);

    public final void onComplete() {
    }

    clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ void onNext(Object obj) {
        DebitCardResetPinActivity debitCardResetPinActivity = (DebitCardResetPinActivity) obj;
        if (this.MediaBrowserCompat$ItemReceiver.getAndSet(0) != 1) {
            Object obj2 = debitCardResetPinActivity.MediaBrowserCompat$ItemReceiver;
            if (obj2 != null && !HmlCaptureDocumentActivity.write(obj2)) {
                return;
            }
        }
        while (!this.read.offer(debitCardResetPinActivity)) {
            DebitCardResetPinActivity debitCardResetPinActivity2 = (DebitCardResetPinActivity) this.read.poll();
            if (debitCardResetPinActivity2 != null) {
                Object obj3 = debitCardResetPinActivity2.MediaBrowserCompat$ItemReceiver;
                if (!(obj3 != null && !HmlCaptureDocumentActivity.write(obj3))) {
                    debitCardResetPinActivity = debitCardResetPinActivity2;
                }
            }
        }
    }

    public final void onError(Throwable th) {
        AlertController$RecycleListView.read.read(th);
    }
}
