package p040o;

/* renamed from: o.CardActivationDeepLinkActivity */
public final class CardActivationDeepLinkActivity extends CardlessAtmDeepLinkActivity<DataPrivacyManagementDeepLinkActivity> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        try {
            ((DataPrivacyManagementDeepLinkActivity) obj).read();
        } catch (Throwable th) {
            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }

    public CardActivationDeepLinkActivity(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        super(dataPrivacyManagementDeepLinkActivity);
    }
}
