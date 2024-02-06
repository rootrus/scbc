package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.custom.profilemanagement.AddAccountSelectorCustomView;
import p040o.confirmRegistrationDirectDebit;

/* renamed from: o.getPhoneNumberFromServer */
public final /* synthetic */ class getPhoneNumberFromServer implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ setThreads MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AddAccountSelectorCustomView MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getPhoneNumberFromServer(AddAccountSelectorCustomView addAccountSelectorCustomView, setThreads setthreads) {
        this.MediaBrowserCompat$ItemReceiver = addAccountSelectorCustomView;
        this.MediaBrowserCompat$CustomActionResultReceiver = setthreads;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AddAccountSelectorCustomView addAccountSelectorCustomView = this.MediaBrowserCompat$ItemReceiver;
        setThreads setthreads = this.MediaBrowserCompat$CustomActionResultReceiver;
        confirmRegistrationDirectDebit.IconCompatParcelizer iconCompatParcelizer = addAccountSelectorCustomView.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setthreads, z);
        }
    }
}
