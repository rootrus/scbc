package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddAccountItemCustomView;
import p040o.confirmRegistrationDirectDebit;

/* renamed from: o.getStandAloneAddress */
public final /* synthetic */ class getStandAloneAddress implements View.OnClickListener {
    private final /* synthetic */ AddAccountItemCustomView IconCompatParcelizer;
    private final /* synthetic */ getSignal read;

    public /* synthetic */ getStandAloneAddress(AddAccountItemCustomView addAccountItemCustomView, getSignal getsignal) {
        this.IconCompatParcelizer = addAccountItemCustomView;
        this.read = getsignal;
    }

    public final void onClick(View view) {
        AddAccountItemCustomView addAccountItemCustomView = this.IconCompatParcelizer;
        getSignal getsignal = this.read;
        boolean z = !getsignal.MediaMetadataCompat;
        addAccountItemCustomView.selectorCheckBox.setChecked(z);
        confirmRegistrationDirectDebit.read read2 = addAccountItemCustomView.read;
        if (read2 != null) {
            read2.read(getsignal, z);
        }
    }
}
