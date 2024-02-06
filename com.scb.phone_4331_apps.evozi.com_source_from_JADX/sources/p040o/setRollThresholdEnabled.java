package p040o;

import p040o.setPosY;

/* renamed from: o.setRollThresholdEnabled */
public final /* synthetic */ class setRollThresholdEnabled implements Runnable {
    private final /* synthetic */ setPosY.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setRollThresholdEnabled(setPosY.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void run() {
        setPosY setposy = setPosY.this;
        getPreviewImage getpreviewimage = getPreviewImage.MediaBrowserCompat$ItemReceiver;
        if (setposy.RatingCompat != null) {
            getpreviewimage.IconCompatParcelizer(setposy.RatingCompat);
        }
    }
}
