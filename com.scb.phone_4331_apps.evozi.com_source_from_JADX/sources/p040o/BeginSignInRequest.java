package p040o;

import p040o.zzbo;
import p040o.zzdy;

/* renamed from: o.BeginSignInRequest */
public final class BeginSignInRequest implements OPRStatusRewardsLandingActivity_ViewBinding<IdentityProviders> {
    private static final BeginSignInRequest read = new BeginSignInRequest();

    /* renamed from: o.BeginSignInRequest$Builder */
    public final class Builder implements OPRStatusRewardsLandingActivity_ViewBinding<setGoogleIdTokenRequestOptions> {
        private final HmlReviewDocumentActivity<enableUsingApkIndependentContext> write;

        private Builder(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity) {
            this.write = hmlReviewDocumentActivity;
        }

        public static Builder IconCompatParcelizer(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity) {
            return new Builder(hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            return new setGoogleIdTokenRequestOptions(this.write.get());
        }
    }

    /* renamed from: o.BeginSignInRequest$GoogleIdTokenRequestOptions */
    public final class GoogleIdTokenRequestOptions implements OPRStatusRewardsLandingActivity_ViewBinding<filterByAuthorizedAccounts> {
        private static final GoogleIdTokenRequestOptions MediaBrowserCompat$ItemReceiver = new GoogleIdTokenRequestOptions();

        public static GoogleIdTokenRequestOptions MediaBrowserCompat$CustomActionResultReceiver() {
            return MediaBrowserCompat$ItemReceiver;
        }

        /* renamed from: o.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder */
        public final class Builder extends FragmentBuilder_BindSummaryFragment {
            public static zzbo.zza write(RenderMode renderMode) {
                zzdy.zzd zzd = null;
                if (renderMode == null) {
                    return null;
                }
                zzbo.zza zza = new zzbo.zza();
                onFrameRendered onframerendered = renderMode.read;
                if (onframerendered != null) {
                    zzd = new zzdy.zzd();
                    zzd.IconCompatParcelizer = onframerendered.IconCompatParcelizer;
                }
                zza.MediaBrowserCompat$CustomActionResultReceiver = zzd;
                zza.write = renderMode.write;
                zza.MediaBrowserCompat$ItemReceiver = renderMode.MediaBrowserCompat$ItemReceiver;
                zza.IconCompatParcelizer = renderMode.IconCompatParcelizer;
                zza.read = renderMode.RatingCompat;
                return zza;
            }
        }

        public final /* synthetic */ Object get() {
            return new filterByAuthorizedAccounts();
        }
    }

    /* renamed from: o.BeginSignInRequest$PasswordRequestOptions */
    public final class PasswordRequestOptions implements OPRStatusRewardsLandingActivity_ViewBinding<Builder> {
        private static final PasswordRequestOptions MediaBrowserCompat$ItemReceiver = new PasswordRequestOptions();

        /* renamed from: o.BeginSignInRequest$PasswordRequestOptions$Builder */
        public final class Builder extends FragmentBuilder_BindSummaryFragment {
        }

        public static PasswordRequestOptions write() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new Builder();
        }
    }

    public static BeginSignInRequest write() {
        return read;
    }

    public final /* synthetic */ Object get() {
        return new IdentityProviders();
    }
}
