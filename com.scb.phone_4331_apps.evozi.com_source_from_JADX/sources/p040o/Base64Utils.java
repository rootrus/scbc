package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.Base64Utils */
public final /* synthetic */ class Base64Utils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDepositMoreInfoFragment write;

    public /* synthetic */ Base64Utils(FragmentBuilder_BindDepositMoreInfoFragment fragmentBuilder_BindDepositMoreInfoFragment) {
        this.write = fragmentBuilder_BindDepositMoreInfoFragment;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.write.MediaBrowserCompat$CustomActionResultReceiver.write((addAnimatorUpdateListener) ((SingleDataEntity) obj).getData()));
    }
}
