package p040o;

import com.scb.phone.view.activity.partner.PartnerLandingAdapter;

/* renamed from: o.hasData */
public final /* synthetic */ class hasData implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ PartnerLandingAdapter.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getLatLngBoundsForCameraTarget write;

    public /* synthetic */ hasData(PartnerLandingAdapter.IconCompatParcelizer iconCompatParcelizer, getLatLngBoundsForCameraTarget getlatlngboundsforcameratarget) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.write = getlatlngboundsforcameratarget;
    }

    public final Object write(Object obj) {
        PartnerLandingAdapter.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        return iconCompatParcelizer.write.postRegisterNewPin(this.write);
    }
}
