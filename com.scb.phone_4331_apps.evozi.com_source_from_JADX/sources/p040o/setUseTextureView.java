package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;

/* renamed from: o.setUseTextureView */
public final /* synthetic */ class setUseTextureView implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ setStringValue IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setUseTextureView(setStringValue setstringvalue, String str) {
        this.IconCompatParcelizer = setstringvalue;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ILocationSourceDelegate iLocationSourceDelegate;
        setStringValue setstringvalue = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = (Throwable) obj;
        if (!(th instanceof RetrofitException) || !((iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer) == null || iLocationSourceDelegate.write == null || !"1002".equalsIgnoreCase(iLocationSourceDelegate.write.IconCompatParcelizer))) {
            setstringvalue.MediaBrowserCompat$ItemReceiver(setstringvalue.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        } else if (str == null) {
            boolean z = true;
            if (setstringvalue.RatingCompat != null) {
                setstringvalue.RatingCompat.ay_();
            }
            setstringvalue.write = false;
            DecoratedBarcodeView decoratedBarcodeView = new DecoratedBarcodeView(setstringvalue, th);
            if (setstringvalue.RatingCompat == null) {
                z = false;
            }
            if (z) {
                decoratedBarcodeView.IconCompatParcelizer(setstringvalue.RatingCompat);
            }
        }
    }
}
