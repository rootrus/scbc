package p040o;

import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.forMap */
public final class forMap extends IndoorBuilding {
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final FragmentBuilder_BindBaseInvestmentSuccessFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public forMap(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, FragmentBuilder_BindBaseInvestmentSuccessFragment fragmentBuilder_BindBaseInvestmentSuccessFragment, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) fragmentBuilder_BindBaseInvestmentSuccessFragment, "partnerConsentRepositoryContractor");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "profileRepositoryContractor");
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseInvestmentSuccessFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "sessionId");
        write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str));
    }

    public final void read(maximumSize maximumsize, String str) {
        onGetStartedClick.write((Object) maximumsize, "requestBody");
        onGetStartedClick.write((Object) str, "resStatusCode");
        switch (str.hashCode()) {
            case 1567006:
                if (str.equals("3001")) {
                    write(this.MediaBrowserCompat$ItemReceiver.write(maximumsize));
                    return;
                }
                return;
            case 1567007:
                if (str.equals("3002")) {
                    write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(maximumsize));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        write(this.MediaBrowserCompat$ItemReceiver.write(str));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(softValues softvalues, String str) {
        onGetStartedClick.write((Object) softvalues, "requestBody");
        onGetStartedClick.write((Object) str, "resStatusCode");
        switch (str.hashCode()) {
            case 1567006:
                if (str.equals("3001")) {
                    write(this.MediaBrowserCompat$ItemReceiver.read(softvalues));
                    return;
                }
                return;
            case 1567007:
                if (str.equals("3002")) {
                    write(this.MediaBrowserCompat$ItemReceiver.write(softvalues));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
