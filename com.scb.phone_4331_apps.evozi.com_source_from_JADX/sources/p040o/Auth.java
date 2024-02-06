package p040o;

import p040o.NullsLastOrdering;

/* renamed from: o.Auth */
public final class Auth implements OPRStatusRewardsLandingActivity_ViewBinding<NullsLastOrdering.write> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindTransferInstallmentReviewBottomFragment> MediaBrowserCompat$CustomActionResultReceiver;

    private Auth(HmlReviewDocumentActivity<FragmentBuilder_BindTransferInstallmentReviewBottomFragment> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static Auth MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<FragmentBuilder_BindTransferInstallmentReviewBottomFragment> hmlReviewDocumentActivity) {
        return new Auth(hmlReviewDocumentActivity);
    }

    /* renamed from: o.Auth$AuthCredentialsOptions */
    public final class AuthCredentialsOptions extends FragmentBuilder_BindSummaryFragment {

        /* renamed from: o.Auth$AuthCredentialsOptions$Builder */
        public final /* synthetic */ class Builder implements findFragmentByWho {
            public static final /* synthetic */ Builder read = new Builder();

            private /* synthetic */ Builder() {
            }

            public final Object IconCompatParcelizer(Object obj) {
                hasImages hasimages = (hasImages) obj;
                return new zzvp(hasimages.read, hasimages.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final /* synthetic */ Object get() {
        return new NullsLastOrdering.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
