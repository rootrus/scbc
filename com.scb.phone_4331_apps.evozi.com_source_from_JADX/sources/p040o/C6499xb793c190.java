package p040o;

import net.sourceforge.zbar.ImageScanner;

/* renamed from: o.FragmentBuilder_BindDepositProductDetailFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6499xb793c190 extends CheckEligibilityActivity implements FundActionsSuccessActivity<ImageScanner> {
    public static final C6499xb793c190 MediaBrowserCompat$ItemReceiver = new C6499xb793c190();

    C6499xb793c190() {
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        ImageScanner imageScanner = new ImageScanner();
        imageScanner.setConfig(128, 256, 0);
        imageScanner.setConfig(128, 257, 0);
        imageScanner.setConfig(64, 256, 0);
        imageScanner.setConfig(64, 257, 0);
        imageScanner.setConfig(128, 0, 1);
        imageScanner.setConfig(64, 0, 1);
        return imageScanner;
    }
}
