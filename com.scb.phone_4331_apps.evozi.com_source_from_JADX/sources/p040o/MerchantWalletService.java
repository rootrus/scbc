package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.MerchantWalletService */
public final /* synthetic */ class MerchantWalletService implements Runnable {
    private final /* synthetic */ AccountManagementItemCustomView MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder read;

    public /* synthetic */ MerchantWalletService(AccountManagementItemCustomView accountManagementItemCustomView, AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        this.MediaBrowserCompat$ItemReceiver = accountManagementItemCustomView;
        this.read = builder;
    }

    public final void run() {
        AccountManagementItemCustomView accountManagementItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder = this.read;
        accountManagementItemCustomView.accountNicknameText.setText(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() ? accountManagementItemCustomView.getContext().getString(R.string.account_management_nickname_placeholder) : accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        accountManagementItemCustomView.accountNoText.setText(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        accountManagementItemCustomView.accountTypeText.setText(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver.read);
        accountManagementItemCustomView.separator.setVisibility(builder.MediaDescriptionCompat() ? 8 : 0);
        accountManagementItemCustomView.read(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
        accountManagementItemCustomView.editText.setHint(accountManagementItemCustomView.getContext().getString(R.string.account_management_nickname_placeholder));
    }
}
