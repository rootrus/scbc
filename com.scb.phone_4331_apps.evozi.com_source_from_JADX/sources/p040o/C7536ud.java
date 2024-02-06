package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity;

/* renamed from: o.ud */
public final /* synthetic */ class C7536ud implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BaseDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7536ud(BaseDeepLinkActivity baseDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDeepLinkActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BaseDeepLinkActivity baseDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = (Intent) obj;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = baseDeepLinkActivity.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            baseDeepLinkActivity.MediaBrowserCompat$MediaItem.dispose();
        }
        getClsId getclsid = (getClsId) intent.getParcelableExtra("com.scb.phone.EXTRA_CONFIG");
        baseDeepLinkActivity.IconCompatParcelizer(getclsid.MediaBrowserCompat$ItemReceiver, getclsid.MediaDescriptionCompat, getclsid.RatingCompat);
    }
}
