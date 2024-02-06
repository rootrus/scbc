package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.custom.profilemanagement.AddAccountItemCustomView;
import p040o.confirmRegistrationDirectDebit;

/* renamed from: o.saveMerchantNickname */
public final /* synthetic */ class saveMerchantNickname implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ getSignal MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AddAccountItemCustomView read;

    public /* synthetic */ saveMerchantNickname(AddAccountItemCustomView addAccountItemCustomView, getSignal getsignal) {
        this.read = addAccountItemCustomView;
        this.MediaBrowserCompat$CustomActionResultReceiver = getsignal;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AddAccountItemCustomView addAccountItemCustomView = this.read;
        getSignal getsignal = this.MediaBrowserCompat$CustomActionResultReceiver;
        confirmRegistrationDirectDebit.read read2 = addAccountItemCustomView.read;
        if (read2 != null) {
            read2.read(getsignal, z);
        }
    }
}
