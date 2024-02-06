package p040o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p040o.PrepaidCashOutSuccessActivity;

/* renamed from: o.PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver */
final class PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver {
    private final int MediaBrowserCompat$ItemReceiver;
    final WeakReference read;

    /* synthetic */ PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(Object obj, byte b) {
        this(obj);
    }

    /* synthetic */ PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(Object obj, ReferenceQueue referenceQueue, byte b) {
        this(obj, referenceQueue);
    }

    private PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(Object obj) {
        this.read = new WeakReference(obj);
        this.MediaBrowserCompat$ItemReceiver = obj.hashCode();
    }

    private PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver(Object obj, ReferenceQueue referenceQueue) {
        this.read = new PrepaidCashOutSuccessActivity.read(obj, referenceQueue, this, (byte) 0);
        this.MediaBrowserCompat$ItemReceiver = obj.hashCode();
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver) {
            PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver = (PrepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver) obj;
            Object obj2 = this.read.get();
            Object obj3 = prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver.read.get();
            if (obj2 != null) {
                return obj2.equals(obj3);
            }
            if ((obj3 == null) && hashCode() == prepaidCashOutSuccessActivity$MediaBrowserCompat$ItemReceiver.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
