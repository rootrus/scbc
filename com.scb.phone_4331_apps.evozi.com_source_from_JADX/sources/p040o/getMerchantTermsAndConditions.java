package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;

/* renamed from: o.getMerchantTermsAndConditions */
public final /* synthetic */ class getMerchantTermsAndConditions implements View.OnClickListener {
    private final /* synthetic */ AccountManagementItemCustomView IconCompatParcelizer;

    public /* synthetic */ getMerchantTermsAndConditions(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.IconCompatParcelizer = accountManagementItemCustomView;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.editText.setText("");
    }
}
