package p040o;

import com.scb.phone.view.activity.transferandpay.PullSlipActivity$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureActivity */
public final /* synthetic */ class CaptureActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ setStringValue read;

    /* renamed from: o.CaptureActivity$a */
    public final /* synthetic */ class C3146a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C3146a IconCompatParcelizer = new C3146a();

        private /* synthetic */ C3146a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getCompressedFrontImageSize) obj).IconCompatParcelizer();
        }
    }

    public /* synthetic */ CaptureActivity(setStringValue setstringvalue) {
        this.read = setstringvalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        setStringValue setstringvalue = this.read;
        PullSlipActivity$MediaBrowserCompat$ItemReceiver pullSlipActivity$MediaBrowserCompat$ItemReceiver = (PullSlipActivity$MediaBrowserCompat$ItemReceiver) obj;
        boolean z = true;
        if (setstringvalue.RatingCompat != null) {
            setstringvalue.RatingCompat.ay_();
        }
        setCores IconCompatParcelizer = setstringvalue.MediaBrowserCompat$MediaItem.IconCompatParcelizer(pullSlipActivity$MediaBrowserCompat$ItemReceiver);
        setstringvalue.read = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null || IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            nativeSaveToFile nativesavetofile = nativeSaveToFile.write;
            if (setstringvalue.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativesavetofile.IconCompatParcelizer(setstringvalue.RatingCompat);
            }
        } else {
            setStatusText setstatustext = new setStatusText(setstringvalue, IconCompatParcelizer);
            if (setstringvalue.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setstatustext.IconCompatParcelizer(setstringvalue.RatingCompat);
            }
        }
        setstringvalue.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.read;
        setstringvalue.write = false;
    }
}
