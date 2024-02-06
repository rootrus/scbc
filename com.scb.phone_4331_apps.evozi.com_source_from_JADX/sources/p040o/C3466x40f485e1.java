package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.Image$OutputColor$write$MediaBrowserCompat$CustomActionResultReceiver */
final class C3466x40f485e1 implements Runnable {
    private /* synthetic */ Image.OutputColor.write MediaBrowserCompat$CustomActionResultReceiver;

    C3466x40f485e1(Image.OutputColor.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void run() {
        Image.OutputColor outputColor = Image.OutputColor.this;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C34672.MediaBrowserCompat$CustomActionResultReceiver;
        if (outputColor.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(outputColor.RatingCompat);
        }
    }
}
