package p040o;

import p040o.getCurrentImageIndex;

/* renamed from: o.OcrWord */
public final /* synthetic */ class OcrWord implements Runnable {
    private final /* synthetic */ getCurrentImageIndex.C45414 write;

    public /* synthetic */ OcrWord(getCurrentImageIndex.C45414 r1) {
        this.write = r1;
    }

    public final void run() {
        getCurrentImageIndex getcurrentimageindex = getCurrentImageIndex.this;
        isReadOnly isreadonly = isReadOnly.MediaBrowserCompat$CustomActionResultReceiver;
        if (getcurrentimageindex.RatingCompat != null) {
            isreadonly.IconCompatParcelizer(getcurrentimageindex.RatingCompat);
        }
    }
}
