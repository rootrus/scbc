package p040o;

import android.app.Activity;
import com.thunderhead.connectivity.NetworkOperationError;
import p040o.FragmentBuilder_BindOutgoingFragment;

/* renamed from: o.DeejungTransferInstallmentsConfirmationActivity_ViewBinding */
public final class DeejungTransferInstallmentsConfirmationActivity_ViewBinding extends ConfirmRedemptionActivity {
    public final void read(String str, NetworkOperationError networkOperationError) {
        super.read(str, networkOperationError);
        IconCompatParcelizer(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), 0, networkOperationError, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
    }

    public final void IconCompatParcelizer(Activity activity, int i, NetworkOperationError networkOperationError, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
        super.IconCompatParcelizer(activity, i, networkOperationError, onaccountsummaryclick_mediabrowsercompat_itemreceiver);
        onSaveSlipClick onsaveslipclick = new onSaveSlipClick(onaccountsummaryclick_mediabrowsercompat_itemreceiver);
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindOutgoingFragment.read.MediaBrowserCompat$CustomActionResultReceiver);
        if (DeejungTransferMinFullOtpActivity.read == null) {
            DeejungTransferMinFullOtpActivity.read = new DeejungTransferMinFullOtpActivity();
        }
        DeejungTransferMinFullOtpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(activity, i, networkOperationError, onsaveslipclick);
    }
}
