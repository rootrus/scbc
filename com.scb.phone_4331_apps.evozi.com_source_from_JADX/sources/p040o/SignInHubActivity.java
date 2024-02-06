package p040o;

/* renamed from: o.SignInHubActivity */
public final class SignInHubActivity implements OPRStatusRewardsLandingActivity_ViewBinding<hash> {
    private static final SignInHubActivity read = new SignInHubActivity();

    /* renamed from: o.SignInHubActivity$zzc */
    public final class zzc implements OPRStatusRewardsLandingActivity_ViewBinding<addObject> {
        private final HmlReviewDocumentActivity<Storage> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<SignInConfiguration> read;

        private zzc(HmlReviewDocumentActivity<SignInConfiguration> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Storage> hmlReviewDocumentActivity2) {
            this.read = hmlReviewDocumentActivity;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        }

        public static zzc write(HmlReviewDocumentActivity<SignInConfiguration> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Storage> hmlReviewDocumentActivity2) {
            return new zzc(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
        }

        public final /* synthetic */ Object get() {
            return new addObject(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get());
        }
    }

    public static SignInHubActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }

    public final /* synthetic */ Object get() {
        return new hash();
    }
}
