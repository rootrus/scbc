package p040o;

import java.util.concurrent.ThreadFactory;

/* renamed from: o.CustomExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6408x8e4bbfc9 {
    private int IconCompatParcelizer;
    final C6409x3591e258[] MediaBrowserCompat$ItemReceiver;
    private long write;

    C6408x8e4bbfc9(ThreadFactory threadFactory, int i) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = new C6409x3591e258[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.MediaBrowserCompat$ItemReceiver[i2] = new C6409x3591e258(threadFactory);
        }
    }

    public final C6409x3591e258 write() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return CustomExternalSelector_ViewBinding.write;
        }
        C6409x3591e258[] customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiverArr = this.MediaBrowserCompat$ItemReceiver;
        long j = this.write;
        this.write = 1 + j;
        return customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiverArr[(int) (j % ((long) i))];
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        for (C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver : this.MediaBrowserCompat$ItemReceiver) {
            customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.write = true;
            customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.shutdownNow();
            setSelectedTextView.read(customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        }
    }
}
