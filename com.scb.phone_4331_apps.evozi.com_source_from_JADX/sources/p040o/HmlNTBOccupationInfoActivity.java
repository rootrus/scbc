package p040o;

import java.lang.ref.ReferenceQueue;
import p039io.realm.internal.NativeObjectReference;
import p039io.realm.log.RealmLog;

/* renamed from: o.HmlNTBOccupationInfoActivity */
final class HmlNTBOccupationInfoActivity implements Runnable {
    private final ReferenceQueue<HmlNTBMonthlyIncomeAboutActivity> read;

    HmlNTBOccupationInfoActivity(ReferenceQueue<HmlNTBMonthlyIncomeAboutActivity> referenceQueue) {
        this.read = referenceQueue;
    }

    public final void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.read.remove()).IconCompatParcelizer();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.MediaBrowserCompat$CustomActionResultReceiver("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
