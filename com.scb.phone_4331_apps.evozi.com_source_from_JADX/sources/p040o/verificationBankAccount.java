package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddAccountFooterCustomView;

/* renamed from: o.verificationBankAccount */
public final /* synthetic */ class verificationBankAccount implements View.OnClickListener {
    private final /* synthetic */ AddAccountFooterCustomView IconCompatParcelizer;

    public /* synthetic */ verificationBankAccount(AddAccountFooterCustomView addAccountFooterCustomView) {
        this.IconCompatParcelizer = addAccountFooterCustomView;
    }

    public final void onClick(View view) {
        confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver != null) {
            confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver.read();
        }
    }
}
