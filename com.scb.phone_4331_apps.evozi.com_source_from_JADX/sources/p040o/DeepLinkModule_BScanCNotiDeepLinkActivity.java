package p040o;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesLoanInformationFragment;

/* renamed from: o.DeepLinkModule_BScanCNotiDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_BScanCNotiDeepLinkActivity implements View.OnClickListener {
    private final /* synthetic */ EasycashFeaturesLoanInformationFragment write;

    public /* synthetic */ DeepLinkModule_BScanCNotiDeepLinkActivity(EasycashFeaturesLoanInformationFragment easycashFeaturesLoanInformationFragment) {
        this.write = easycashFeaturesLoanInformationFragment;
    }

    public final void onClick(View view) {
        EasycashFeaturesLoanInformationFragment easycashFeaturesLoanInformationFragment = this.write;
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(easycashFeaturesLoanInformationFragment.getContext()).IconCompatParcelizer(easycashFeaturesLoanInformationFragment.getString(R.string.request_more_loan_link_title)).MediaBrowserCompat$ItemReceiver(easycashFeaturesLoanInformationFragment.getString(R.string.request_more_loan_link_text));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new RemittanceService(easycashFeaturesLoanInformationFragment));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), verifyByCreditCard.read).show();
    }
}
