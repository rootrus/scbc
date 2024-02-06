package p040o;

import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import p040o.onFrontImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSDKVersion */
public final /* synthetic */ class setSDKVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSDKVersion(MarketingCSentWebViewActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((onFrontImageProcessed.IconCompatParcelizer) obj).MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver.RatingCompat);
    }
}
