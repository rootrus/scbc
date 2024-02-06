package p040o;

import p040o.C4131c;

/* renamed from: o.onCheckedChanged  reason: case insensitive filesystem */
public final /* synthetic */ class C10851onCheckedChanged implements Runnable {
    private final /* synthetic */ C4131c.C41333.write IconCompatParcelizer;

    public /* synthetic */ C10851onCheckedChanged(C4131c.C41333.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void run() {
        C4131c.C41333 r0 = C4131c.C41333.this;
        setTorchButtonEnabled settorchbuttonenabled = setTorchButtonEnabled.MediaBrowserCompat$ItemReceiver;
        if (r0.RatingCompat != null) {
            settorchbuttonenabled.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
