package p040o;

import p040o.C10859sendImage;

/* renamed from: o.setkfsPassword */
public final /* synthetic */ class setkfsPassword implements Runnable {
    private final /* synthetic */ C10859sendImage.write read;

    public /* synthetic */ setkfsPassword(C10859sendImage.write write) {
        this.read = write;
    }

    public final void run() {
        C10859sendImage sendimage = C10859sendImage.this;
        packageRequest packagerequest = packageRequest.write;
        if (sendimage.RatingCompat != null) {
            packagerequest.IconCompatParcelizer(sendimage.RatingCompat);
        }
    }
}
