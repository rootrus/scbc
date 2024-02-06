package p040o;

import com.scb.phone.view.custom.investment.onboarding.CustomFundAddressDetail;
import com.scb.phone.view.custom.investment.onboarding.CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.investment.onboarding.CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getChequeStatusIssueSummary */
public final /* synthetic */ class getChequeStatusIssueSummary implements CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ CustomFundAddressDetail read;

    public /* synthetic */ getChequeStatusIssueSummary(CustomFundAddressDetail customFundAddressDetail) {
        this.read = customFundAddressDetail;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver customFundAddressDetail$MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver;
        if (customFundAddressDetail$MediaBrowserCompat$ItemReceiver != null) {
            customFundAddressDetail$MediaBrowserCompat$ItemReceiver.write();
        }
    }
}
