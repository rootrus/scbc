package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;

/* renamed from: o.getMerchantStatic */
public final /* synthetic */ class getMerchantStatic implements Runnable {
    private final /* synthetic */ AccountManagementItemCustomView read;

    public /* synthetic */ getMerchantStatic(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.read = accountManagementItemCustomView;
    }

    public final void run() {
        AccountManagementItemCustomView accountManagementItemCustomView = this.read;
        accountManagementItemCustomView.accountTypeText.setText(accountManagementItemCustomView.getContext().getString(R.string.account_management_scbs_label));
    }
}
