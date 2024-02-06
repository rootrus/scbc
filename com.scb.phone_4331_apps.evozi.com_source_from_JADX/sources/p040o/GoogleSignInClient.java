package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.GoogleSignInClient */
public final class GoogleSignInClient extends FragmentBuilder_BindSummaryFragment {
    private final zai read;

    /* renamed from: o.GoogleSignInClient$zzc */
    public final class zzc implements OPRStatusRewardsLandingActivity_ViewBinding<getSignInResultFromIntent> {
        private final HmlReviewDocumentActivity<GoogleSignInOptions> read;

        private zzc(HmlReviewDocumentActivity<GoogleSignInOptions> hmlReviewDocumentActivity) {
            this.read = hmlReviewDocumentActivity;
        }

        public static zzc MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<GoogleSignInOptions> hmlReviewDocumentActivity) {
            return new zzc(hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            return new getSignInResultFromIntent(this.read.get());
        }
    }

    @HmlPinActivity
    public GoogleSignInClient(zai zai) {
        onGetStartedClick.write((Object) zai, "policyInfoEntityMapper");
        this.read = zai;
    }

    /* renamed from: o.GoogleSignInClient$zzd */
    public final class zzd implements OPRStatusRewardsLandingActivity_ViewBinding<zae> {
        private static final zzd write = new zzd();

        public static zzd IconCompatParcelizer() {
            return write;
        }

        public final /* synthetic */ Object get() {
            return new zae();
        }
    }

    public final setNotificationResponsiveness MediaBrowserCompat$ItemReceiver(getHighlightAngle gethighlightangle) {
        List list;
        onGetStartedClick.write((Object) gethighlightangle, "entity");
        String str = gethighlightangle.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        String str2 = gethighlightangle.MediaBrowserCompat$ItemReceiver;
        String str3 = gethighlightangle.write;
        List<getCapType> list2 = gethighlightangle.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            Iterable<getCapType> iterable = list2;
            zai zai = this.read;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getCapType MediaBrowserCompat$ItemReceiver : iterable) {
                arrayList.add(zai.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return new setNotificationResponsiveness(str, str2, str3, list);
    }
}
