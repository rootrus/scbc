package p040o;

import p040o.Image;

/* renamed from: o.getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver */
public final class getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ getBitsPerChannel MediaBrowserCompat$CustomActionResultReceiver;

    private getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver(getBitsPerChannel getbitsperchannel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getbitsperchannel;
    }

    public /* synthetic */ getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver(getBitsPerChannel getbitsperchannel, byte b) {
        this(getbitsperchannel);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getBitsPerChannel.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        getBitsPerChannel getbitsperchannel = this.MediaBrowserCompat$CustomActionResultReceiver;
        setImageSrcID setimagesrcid = new setImageSrcID(this, (String) obj);
        if (getbitsperchannel.RatingCompat != null) {
            setimagesrcid.IconCompatParcelizer(getbitsperchannel.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Image.ImageMimeType(this)));
    }
}
