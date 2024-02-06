package com.scb.phone.view.activity.bankingagent;

import com.scb.phone.R;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;

final class BankingAgentSuccessActivity$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ BankingAgentSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;

    BankingAgentSuccessActivity$MediaBrowserCompat$ItemReceiver(BankingAgentSuccessActivity bankingAgentSuccessActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentSuccessActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Throwable th = (Throwable) obj;
        BankingAgentSuccessActivity bankingAgentSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) th, "it");
        onGetStartedClick.write((Object) th, "exception");
        bankingAgentSuccessActivity.write(bankingAgentSuccessActivity, R.id.root_view, bankingAgentSuccessActivity.getString(R.string.banking_success_saved_slip_error), getOversizeImage.ERROR);
    }
}
