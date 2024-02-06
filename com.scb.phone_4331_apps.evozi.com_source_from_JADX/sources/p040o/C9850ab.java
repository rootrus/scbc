package p040o;

import com.scb.phone.view.activity.deeplink.PartnerInAppLoginDeepLinkActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.ab */
public final /* synthetic */ class C9850ab implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C9850ab(getFileSHA getfilesha) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPassportNumber) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.ab$a */
    public final class C7095a implements MileageQuantitySelectionActivity<PartnerInAppLoginDeepLinkActivity> {
        public static void MediaBrowserCompat$ItemReceiver(PartnerInAppLoginDeepLinkActivity partnerInAppLoginDeepLinkActivity, isEdgeSupportStrongerThanThreshold isedgesupportstrongerthanthreshold) {
            partnerInAppLoginDeepLinkActivity.presenter = isedgesupportstrongerthanthreshold;
        }
    }
}
