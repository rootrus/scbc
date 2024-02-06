package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.decode */
public final /* synthetic */ class decode implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDepositMoreInfoFragment read;

    public /* synthetic */ decode(FragmentBuilder_BindDepositMoreInfoFragment fragmentBuilder_BindDepositMoreInfoFragment) {
        this.read = fragmentBuilder_BindDepositMoreInfoFragment;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.read.MediaBrowserCompat$CustomActionResultReceiver.write((addAnimatorUpdateListener) ((SingleDataEntity) obj).getData()));
    }
}
