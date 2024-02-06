package p040o;

import p040o.zzcb;

/* renamed from: o.getBitsPerChannel$MediaBrowserCompat$ItemReceiver */
public class getBitsPerChannel$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzcb.zze> {
    String IconCompatParcelizer;
    final /* synthetic */ getBitsPerChannel MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void onNext(Object obj) {
        getBitsPerChannel getbitsperchannel = this.MediaBrowserCompat$CustomActionResultReceiver;
        setImageRoll setimageroll = new setImageRoll(this, (zzcb.zze) obj);
        if (getbitsperchannel.RatingCompat != null) {
            setimageroll.IconCompatParcelizer(getbitsperchannel.RatingCompat);
        }
        getBitsPerChannel.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public getBitsPerChannel$MediaBrowserCompat$ItemReceiver(getBitsPerChannel getbitsperchannel, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getbitsperchannel;
        this.IconCompatParcelizer = str;
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new setImageOriginalDateTime(this)));
    }
}
