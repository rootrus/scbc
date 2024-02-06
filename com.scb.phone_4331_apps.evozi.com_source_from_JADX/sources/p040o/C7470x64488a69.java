package p040o;

import p040o.setVwModelConsentSeparator;

/* renamed from: o.setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver */
final class C7470x64488a69 implements Runnable {
    private setVwModelConsentSeparator.write IconCompatParcelizer;
    private /* synthetic */ setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    C7470x64488a69(setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver setvwmodelconsentseparator_mediabrowsercompat_itemreceiver, setVwModelConsentSeparator.write write) {
        this.MediaBrowserCompat$ItemReceiver = setvwmodelconsentseparator_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = write;
    }

    public final void run() {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.remove(this.IconCompatParcelizer);
    }
}
