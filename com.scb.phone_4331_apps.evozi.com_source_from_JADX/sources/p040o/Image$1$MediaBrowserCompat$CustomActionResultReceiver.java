package p040o;

import p040o.BoundingTetragon;
import p040o.Image;
import p040o.access$2300;

/* renamed from: o.Image$1$MediaBrowserCompat$CustomActionResultReceiver */
class Image$1$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ Image.C34591 MediaBrowserCompat$ItemReceiver;
    private boolean write;

    private Image$1$MediaBrowserCompat$CustomActionResultReceiver(Image.C34591 r1, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.write = z;
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        Image.C34591.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        if (this.write) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            return;
        }
        boolean z = false;
        if (Boolean.valueOf(new show(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper).read(new setTopLeft("NCB_CONSENT"), 0)).booleanValue()) {
            String MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            char c = 65535;
            int hashCode = MediaMetadataCompat.hashCode();
            if (hashCode != 277399877) {
                if (hashCode == 2090361232 && MediaMetadataCompat.equals("PURPOSEFUL_LOAN")) {
                    c = 0;
                }
            } else if (MediaMetadataCompat.equals("HOME_TOP_UP")) {
                c = 1;
            }
            if (c == 0 || c == 1) {
                Image.C34591 r6 = this.MediaBrowserCompat$ItemReceiver;
                isAllZero isallzero = new isAllZero(this);
                if (r6.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    isallzero.IconCompatParcelizer(r6.RatingCompat);
                    return;
                }
                return;
            }
            Image.C34591 r62 = this.MediaBrowserCompat$ItemReceiver;
            BoundingTetragon.FriendBT friendBT = new BoundingTetragon.FriendBT(this);
            if (r62.RatingCompat != null) {
                z = true;
            }
            if (z) {
                friendBT.IconCompatParcelizer(r62.RatingCompat);
                return;
            }
            return;
        }
        Image.C34591 r63 = this.MediaBrowserCompat$ItemReceiver;
        imageClearBitmap imageclearbitmap = imageClearBitmap.MediaBrowserCompat$CustomActionResultReceiver;
        if (r63.RatingCompat != null) {
            z = true;
        }
        if (z) {
            imageclearbitmap.IconCompatParcelizer(r63.RatingCompat);
        }
    }
}
