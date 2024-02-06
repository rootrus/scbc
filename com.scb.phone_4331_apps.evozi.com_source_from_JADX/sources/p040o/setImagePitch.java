package p040o;

import p040o.getBitsPerChannel;

/* renamed from: o.setImagePitch */
public final /* synthetic */ class setImagePitch implements Runnable {
    private final /* synthetic */ getBitsPerChannel.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setImagePitch(getBitsPerChannel.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void run() {
        getBitsPerChannel getbitsperchannel = getBitsPerChannel.this;
        setImageLongitude setimagelongitude = setImageLongitude.write;
        if (getbitsperchannel.RatingCompat != null) {
            setimagelongitude.IconCompatParcelizer(getbitsperchannel.RatingCompat);
        }
    }
}
