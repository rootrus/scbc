package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getVideoPlayerCameraPlayer */
public final /* synthetic */ class getVideoPlayerCameraPlayer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4176cd read;

    public /* synthetic */ getVideoPlayerCameraPlayer(C4176cd cdVar, String str) {
        this.read = cdVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4176cd cdVar = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        KtaJsonCheck.RatingCompat ratingCompat = (KtaJsonCheck.RatingCompat) obj;
        if (!cdVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()) {
            ratingCompat.read();
        } else if ("0".equals(str)) {
            ratingCompat.MediaBrowserCompat$SearchResultReceiver();
        } else {
            ratingCompat.IconCompatParcelizer(false);
        }
    }
}
