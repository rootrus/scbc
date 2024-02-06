package p040o;

import com.scb.phone.view.activity.deeplink.RtpInputDeepLinkActivity;
import p040o.zzct;

/* renamed from: o.ag */
public final /* synthetic */ class C4022ag {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[zzct.zza.values().length];
        IconCompatParcelizer = iArr;
        iArr[zzct.zza.CONSUMER.ordinal()] = 1;
        IconCompatParcelizer[zzct.zza.BUSINESS_OWNER.ordinal()] = 2;
    }

    /* renamed from: o.ag$a */
    public final class C4024a implements MileageQuantitySelectionActivity<RtpInputDeepLinkActivity> {
        public static void IconCompatParcelizer(RtpInputDeepLinkActivity rtpInputDeepLinkActivity, getInfoWindowAnchorU getinfowindowanchoru) {
            rtpInputDeepLinkActivity.deepLinkCase = getinfowindowanchoru;
        }

        public static void MediaBrowserCompat$ItemReceiver(RtpInputDeepLinkActivity rtpInputDeepLinkActivity, skipBytes skipbytes) {
            rtpInputDeepLinkActivity.mapper = skipbytes;
        }
    }
}
