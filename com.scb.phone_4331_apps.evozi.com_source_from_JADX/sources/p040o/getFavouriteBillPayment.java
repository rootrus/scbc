package p040o;

import com.scb.phone.view.adapter.bulktransfer.ManageGroupAdapter;
import com.scb.phone.view.fragment.bulktransfer.ManageRecipientGroupFragment;

/* renamed from: o.getFavouriteBillPayment */
public final /* synthetic */ class getFavouriteBillPayment implements ManageGroupAdapter.write {
    private final /* synthetic */ ManageRecipientGroupFragment read;

    public /* synthetic */ getFavouriteBillPayment(ManageRecipientGroupFragment manageRecipientGroupFragment) {
        this.read = manageRecipientGroupFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(UncaughtExceptionHandlers uncaughtExceptionHandlers) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.read.manageRecipientGroupPresenter;
        getFirebaseInstallationId getfirebaseinstallationid = new getFirebaseInstallationId(autoValue_InstallationResponse, uncaughtExceptionHandlers);
        if (autoValue_InstallationResponse.RatingCompat != null) {
            getfirebaseinstallationid.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }
}
