package p040o;

import android.content.SharedPreferences;

/* renamed from: o.DeejungTransferInstallmentsConfirmationActivity */
public final /* synthetic */ class DeejungTransferInstallmentsConfirmationActivity implements FragmentBuilder_BindIssuerSearchFragment {
    private final /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment IconCompatParcelizer;
    private final /* synthetic */ FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ECouponDetailActivity_ViewBinding read;

    public /* synthetic */ DeejungTransferInstallmentsConfirmationActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        this.read = eCouponDetailActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOperatingBankFragment;
    }

    public final Object read(Object obj) {
        return this.read.read(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, (SharedPreferences) obj);
    }
}
