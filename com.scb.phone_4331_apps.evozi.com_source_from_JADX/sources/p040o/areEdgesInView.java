package p040o;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p040o.IdExtractActivity;
import p040o.LinkedListMultimap;
import p040o.PlaceFilter;
import p040o.Predicates;
import p040o.writeUInt64NoTag;

/* renamed from: o.areEdgesInView */
public final class areEdgesInView extends writeUInt64NoTag<IdExtractActivity.IconCompatParcelizer> {
    public final forPredicate IconCompatParcelizer;
    public final LinkedListMultimap.MultisetView.C35822.C35831.C35841 MediaBrowserCompat$ItemReceiver;
    private FileLogStore MediaBrowserCompat$MediaItem;
    private final C4801in MediaBrowserCompat$SearchResultReceiver;
    private final isNot MediaDescriptionCompat;
    private final Predicates.AndPredicate MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    public Uri read;
    public Uri.Builder write;

    /* renamed from: o.areEdgesInView$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<FileLogStore, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(areEdgesInView areedgesinview) {
            super(1, areedgesinview);
        }

        public final String getName() {
            return "onGetInsightHeaderSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(areEdgesInView.class);
        }

        public final String getSignature() {
            return "onGetInsightHeaderSuccess(Lcom/scb/phone/presentation/model/display/justforyou/JustForYouInsightHeaderResponseDisplay;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FileLogStore fileLogStore = (FileLogStore) obj;
            onGetStartedClick.write((Object) fileLogStore, "p1");
            areEdgesInView.MediaBrowserCompat$ItemReceiver((areEdgesInView) this.receiver, fileLogStore);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.areEdgesInView$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractActivity.IconCompatParcelizer> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractActivity.IconCompatParcelizer) obj).IconCompatParcelizer((Throwable) new NullPointerException());
        }
    }

    /* renamed from: o.areEdgesInView$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public write(areEdgesInView areedgesinview) {
            super(1, areedgesinview);
        }

        public final String getName() {
            return "onGetInsightHeaderFailed";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(areEdgesInView.class);
        }

        public final String getSignature() {
            return "onGetInsightHeaderFailed(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "p1");
            areEdgesInView.IconCompatParcelizer((areEdgesInView) this.receiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public areEdgesInView(forPredicate forpredicate, isNot isnot, LinkedListMultimap.MultisetView.C35822.C35831.C35841 r4, Predicates.AndPredicate andPredicate, C4801in inVar, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) forpredicate, "getJustForYouWebViewUrlCase");
        onGetStartedClick.write((Object) isnot, "justForYouFunctionEnabledCase");
        onGetStartedClick.write((Object) r4, "justForYouInsightHeaderController");
        onGetStartedClick.write((Object) andPredicate, "getUserLanguageCase");
        onGetStartedClick.write((Object) inVar, "getMaskAccountFlagCase");
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = forpredicate;
        this.MediaDescriptionCompat = isnot;
        this.MediaBrowserCompat$ItemReceiver = r4;
        this.MediaMetadataCompat = andPredicate;
        this.MediaBrowserCompat$SearchResultReceiver = inVar;
        this.MediaSessionCompat$QueueItem = str;
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Set<String> set;
        String queryParameter;
        PlaceFilter.zzb zzb;
        PlaceFilter.zzb zzb2;
        PlaceFilter.zzb zzb3;
        PlaceFilter.zzb zzb4;
        PlaceFilter.zzb zzb5;
        HashMap hashMap = new HashMap();
        zzwi MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z6 = false;
        if (MediaBrowserCompat$CustomActionResultReceiver == null || (zzb5 = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z = false;
        } else {
            z = zzb5.MediaBrowserCompat$MediaItem;
        }
        hashMap.put("insights", String.valueOf(z ? 1 : 0));
        zzwi MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (zzb4 = MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z2 = false;
        } else {
            z2 = zzb4.f2770x50fd9e4a;
        }
        hashMap.put("your_accounts", String.valueOf(z2 ? 1 : 0));
        zzwi MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver3 == null || (zzb3 = MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z3 = false;
        } else {
            z3 = zzb3.MediaSessionCompat$ResultReceiverWrapper;
        }
        hashMap.put("your_reward", String.valueOf(z3 ? 1 : 0));
        zzwi MediaBrowserCompat$CustomActionResultReceiver4 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver4 == null || (zzb2 = MediaBrowserCompat$CustomActionResultReceiver4.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z4 = false;
        } else {
            z4 = zzb2.MediaSessionCompat$QueueItem;
        }
        hashMap.put("monthly_spending", String.valueOf(z4 ? 1 : 0));
        zzwi MediaBrowserCompat$CustomActionResultReceiver5 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver5 == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver5.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z5 = false;
        } else {
            z5 = zzb.MediaMetadataCompat;
        }
        hashMap.put("insight_header", String.valueOf(z5 ? 1 : 0));
        hashMap.put("account_masked", String.valueOf(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker() ? 1 : 0));
        FileLogStore fileLogStore = this.MediaBrowserCompat$MediaItem;
        if (fileLogStore == null || (str = String.valueOf(fileLogStore.read ? 1 : 0)) == null) {
            str = "0";
        }
        hashMap.put("new_insight", str);
        hashMap.put("tiles_version", this.MediaSessionCompat$QueueItem);
        hashMap.put("lang", this.MediaMetadataCompat.read.setCheckable());
        Uri uri = this.read;
        if (uri == null || (set = uri.getQueryParameterNames()) == null) {
            set = HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        for (String str2 : set) {
            Uri uri2 = this.read;
            if (!(uri2 == null || (queryParameter = uri2.getQueryParameter(str2)) == null)) {
                onGetStartedClick.IconCompatParcelizer((Object) queryParameter, "uri?.getQueryParameter(key) ?: return@forEach");
                onGetStartedClick.IconCompatParcelizer((Object) str2, "key");
                hashMap.put(str2, queryParameter);
            }
        }
        Uri.Builder builder = this.write;
        if (builder != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            writeUInt64NoTag.IconCompatParcelizer areedgesinview_mediabrowsercompat_customactionresultreceiver = new areEdgesInView$MediaBrowserCompat$CustomActionResultReceiver(builder);
            if (this.RatingCompat != null) {
                z6 = true;
            }
            if (z6) {
                areedgesinview_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(areEdgesInView areedgesinview) {
        areedgesinview.MediaBrowserCompat$MediaItem = null;
        areedgesinview.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(areEdgesInView areedgesinview, FileLogStore fileLogStore) {
        areedgesinview.MediaBrowserCompat$MediaItem = fileLogStore;
        areedgesinview.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
