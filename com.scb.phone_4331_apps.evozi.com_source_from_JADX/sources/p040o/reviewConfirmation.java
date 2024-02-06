package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddAccountSelectorCustomView;
import p040o.confirmRegistrationDirectDebit;

/* renamed from: o.reviewConfirmation */
public final /* synthetic */ class reviewConfirmation implements View.OnClickListener {
    private final /* synthetic */ AddAccountSelectorCustomView MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setThreads read;

    public /* synthetic */ reviewConfirmation(AddAccountSelectorCustomView addAccountSelectorCustomView, setThreads setthreads) {
        this.MediaBrowserCompat$ItemReceiver = addAccountSelectorCustomView;
        this.read = setthreads;
    }

    public final void onClick(View view) {
        AddAccountSelectorCustomView addAccountSelectorCustomView = this.MediaBrowserCompat$ItemReceiver;
        setThreads setthreads = this.read;
        boolean z = !setthreads.MediaBrowserCompat$ItemReceiver;
        addAccountSelectorCustomView.selectorCheckBox.setChecked(z);
        confirmRegistrationDirectDebit.IconCompatParcelizer iconCompatParcelizer = addAccountSelectorCustomView.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setthreads, z);
        }
    }
}
