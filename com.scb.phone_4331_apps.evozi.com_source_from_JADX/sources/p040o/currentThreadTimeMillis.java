package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.currentThreadTimeMillis */
public final /* synthetic */ class currentThreadTimeMillis implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment read;

    public /* synthetic */ currentThreadTimeMillis(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.read = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final Object write(Object obj) {
        nextNonWhitespace nextnonwhitespace = (nextNonWhitespace) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) nextnonwhitespace, "merchantVerification");
        return new getICheckDetector(nextnonwhitespace.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
