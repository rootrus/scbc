package p040o;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.scb.phone.view.activity.deeplink.C5584x1d866acf;
import p040o.BackgroundDetector;
import p040o.GoogleMap;
import p040o.ImmutableMultiset;

/* renamed from: o.FragmentBuilder_BindQuickPromptPayFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6697xa3eba5a5 implements SubsamplingScaleImageView.IconCompatParcelizer {
    public final FragmentBuilder_BindRequestToPayLandingFragment IconCompatParcelizer;
    private final C5584x1d866acf MediaBrowserCompat$CustomActionResultReceiver;

    private C6697xa3eba5a5() {
    }

    @HmlPinActivity
    public C6697xa3eba5a5(C5584x1d866acf eTBProductDetailDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindRequestToPayLandingFragment fragmentBuilder_BindRequestToPayLandingFragment, BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eTBProductDetailDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = fragmentBuilder_BindRequestToPayLandingFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final DebitCardResetOtpActivity<GoogleMap.OnMyLocationClickListener> MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return DebitCardResetOtpActivity.just(BackgroundDetector.BackgroundStateChangeListener.read(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getPromptPayQR().doOnNext(new getPackagesForUid(this)).map(new packageManager(this));
    }

    public final DebitCardResetOtpActivity<GoogleMap.OnMyLocationClickListener> write(ImmutableMultiset.FieldSettersHolder fieldSettersHolder) {
        if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getQRCode(fieldSettersHolder).doOnNext(new Wrappers(this)).map(new checkPermission(this));
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = null;
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getQRCode(fieldSettersHolder).doOnNext(new isCallerInstantApp(this)).map(new getBytes(this));
    }
}
