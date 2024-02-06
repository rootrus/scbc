package p039io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.NativeObjectReference */
public final class NativeObjectReference extends PhantomReference<HmlNTBMonthlyIncomeAboutActivity> {
    private static NativeObjectReference$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new NativeObjectReference$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final long IconCompatParcelizer;
    private final HmlNTBOperatingAccountActivity MediaBrowserCompat$ItemReceiver;
    private NativeObjectReference MediaBrowserCompat$MediaItem;
    private NativeObjectReference read;
    private final long write;

    private static native void nativeCleanUp(long j, long j2);

    NativeObjectReference(HmlNTBOperatingAccountActivity hmlNTBOperatingAccountActivity, HmlNTBMonthlyIncomeAboutActivity hmlNTBMonthlyIncomeAboutActivity, ReferenceQueue<? super HmlNTBMonthlyIncomeAboutActivity> referenceQueue) {
        super(hmlNTBMonthlyIncomeAboutActivity, referenceQueue);
        this.IconCompatParcelizer = hmlNTBMonthlyIncomeAboutActivity.MediaBrowserCompat$ItemReceiver();
        this.write = hmlNTBMonthlyIncomeAboutActivity.read();
        this.MediaBrowserCompat$ItemReceiver = hmlNTBOperatingAccountActivity;
        NativeObjectReference$MediaBrowserCompat$ItemReceiver nativeObjectReference$MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
        synchronized (nativeObjectReference$MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$MediaItem = null;
            this.read = nativeObjectReference$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (nativeObjectReference$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null) {
                nativeObjectReference$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem = this;
            }
            nativeObjectReference$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = this;
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            nativeCleanUp(this.write, this.IconCompatParcelizer);
        }
        NativeObjectReference$MediaBrowserCompat$ItemReceiver nativeObjectReference$MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
        synchronized (nativeObjectReference$MediaBrowserCompat$ItemReceiver) {
            NativeObjectReference nativeObjectReference = this.read;
            NativeObjectReference nativeObjectReference2 = this.MediaBrowserCompat$MediaItem;
            this.read = null;
            this.MediaBrowserCompat$MediaItem = null;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.read = nativeObjectReference;
            } else {
                nativeObjectReference$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = nativeObjectReference;
            }
            if (nativeObjectReference != null) {
                nativeObjectReference.MediaBrowserCompat$MediaItem = nativeObjectReference2;
            }
        }
    }
}
