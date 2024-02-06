package p040o;

import com.scb.phone.view.activity.etb.EtbSuccessActivity;

/* renamed from: o.pw */
public final /* synthetic */ class C7390pw implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ EtbSuccessActivity write;

    public /* synthetic */ C7390pw(EtbSuccessActivity etbSuccessActivity) {
        this.write = etbSuccessActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.write.presenter;
        boolean z = true;
        if (getsecondpasstexelheightuniform.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
            onSurfaceChanged onsurfacechanged = onSurfaceChanged.MediaBrowserCompat$ItemReceiver;
            if (getsecondpasstexelheightuniform.RatingCompat == null) {
                z = false;
            }
            if (z) {
                onsurfacechanged.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
                return;
            }
            return;
        }
        setMaxTextureSize setmaxtexturesize = setMaxTextureSize.read;
        if (getsecondpasstexelheightuniform.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setmaxtexturesize.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
    }
}
