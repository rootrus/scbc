package p040o;

import com.scb.phone.view.fragment.bulktransfer.ManageRecipientGroupFragment;

/* renamed from: o.getPromptpayProfiles */
public final /* synthetic */ class getPromptpayProfiles implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ManageRecipientGroupFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getPromptpayProfiles(ManageRecipientGroupFragment manageRecipientGroupFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageRecipientGroupFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        ManageRecipientGroupFragment manageRecipientGroupFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        manageRecipientGroupFragment.manageRecipientGroupPresenter.read(manageRecipientGroupFragment.setStackedBackground());
    }
}
