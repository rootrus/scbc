package p040o;

import p040o.GoogleSignInOptions;

/* renamed from: o.GoogleAnalytics */
public class GoogleAnalytics extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.GoogleAnalytics$zzb */
    public final class zzb extends FragmentBuilder_BindSummaryFragment {
    }

    public GoogleAnalytics() {
    }

    /* renamed from: o.GoogleAnalytics$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<reportActivityStart> {
        private static final zza write = new zza();

        public static zza IconCompatParcelizer() {
            return write;
        }

        public final /* synthetic */ Object get() {
            return new reportActivityStart();
        }
    }

    @HmlPinActivity
    public GoogleAnalytics(requestEmail requestemail, GoogleSignInOptions.Builder builder, getExtensions getextensions, requestServerAuthCode requestserverauthcode) {
        onGetStartedClick.write((Object) requestemail, "clientEntityMapper");
        onGetStartedClick.write((Object) builder, "depositEntityMapper");
        onGetStartedClick.write((Object) getextensions, "cardEntityMapper");
        onGetStartedClick.write((Object) requestserverauthcode, "profileEntityMapper");
    }
}
