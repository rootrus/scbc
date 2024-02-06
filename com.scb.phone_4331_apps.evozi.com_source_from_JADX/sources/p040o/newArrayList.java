package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.newArrayList */
public final /* synthetic */ class newArrayList implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDepositMoreInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ newArrayList(FragmentBuilder_BindDepositMoreInfoFragment fragmentBuilder_BindDepositMoreInfoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindDepositMoreInfoFragment;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.write((addAnimatorUpdateListener) ((SingleDataEntity) obj).getData()));
    }
}
