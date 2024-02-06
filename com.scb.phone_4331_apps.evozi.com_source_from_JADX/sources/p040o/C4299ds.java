package p040o;

import com.google.gson.Gson;
import com.scb.phone.data.network.service.SecuritiesService;
import p040o.writeUInt64NoTag;

/* renamed from: o.ds */
public final class C4299ds extends writeUInt64NoTag<getInnerThrowables> {
    final removeExact IconCompatParcelizer;
    public final orientation MediaBrowserCompat$ItemReceiver;
    public String read;
    public final Gson write = new Gson();

    /* renamed from: o.ds$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
        private /* synthetic */ getGenerator IconCompatParcelizer;
        private /* synthetic */ C4299ds MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(C4299ds dsVar, getGenerator getgenerator) {
            this.MediaBrowserCompat$ItemReceiver = dsVar;
            this.IconCompatParcelizer = getgenerator;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            removeExact removeexact = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            getGenerator getgenerator = this.IconCompatParcelizer;
            onGetStartedClick.write((Object) getgenerator, "response");
            String json = removeexact.IconCompatParcelizer.toJson((Object) getgenerator);
            onGetStartedClick.IconCompatParcelizer((Object) json, "googleSigninDisplayMapper.toData(display)");
            ((getInnerThrowables) obj).mo15013o_(json);
        }
    }

    /* renamed from: o.ds$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
        private /* synthetic */ String write;

        public MediaMetadataCompat(String str) {
            this.write = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) str, "json");
            ((getInnerThrowables) obj).MediaBrowserCompat$SearchResultReceiver(str);
        }
    }

    /* renamed from: o.ds$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
        private /* synthetic */ getGenerator MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ C4299ds read;

        RatingCompat(C4299ds dsVar, getGenerator getgenerator) {
            this.read = dsVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = getgenerator;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            removeExact removeexact = this.read.IconCompatParcelizer;
            getGenerator getgenerator = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) getgenerator, "response");
            String json = removeexact.IconCompatParcelizer.toJson((Object) getgenerator);
            onGetStartedClick.IconCompatParcelizer((Object) json, "googleSigninDisplayMapper.toData(display)");
            ((getInnerThrowables) obj).mo15013o_(json);
        }
    }

    /* renamed from: o.ds$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getInnerThrowables, HmlVerifyPhoneValidateOtpActivity> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(1);
        }

        public final String getName() {
            return "onGoogleSignout";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getInnerThrowables.class);
        }

        public final String getSignature() {
            return "onGoogleSignout()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getInnerThrowables getinnerthrowables = (getInnerThrowables) obj;
            onGetStartedClick.write((Object) getinnerthrowables, "p1");
            getinnerthrowables.as_();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.ds$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getInnerThrowables) obj).aq_();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4299ds(RegularImmutableBiMap regularImmutableBiMap, orientation orientation, removeExact removeexact) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) orientation, "googleSigninCase");
        onGetStartedClick.write((Object) removeexact, "googleSigninDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = orientation;
        this.IconCompatParcelizer = removeexact;
    }

    /* renamed from: o.ds$write */
    public static final class write {
        public SecuritiesService IconCompatParcelizer;

        private write() {
        }

        @HmlPinActivity
        public write(SecuritiesService securitiesService) {
            this.IconCompatParcelizer = securitiesService;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        orientation orientation = this.MediaBrowserCompat$ItemReceiver;
        if (!orientation.MediaBrowserCompat$MediaItem.isDisposed()) {
            orientation.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void write() {
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(this, new getGenerator(new setEvents("unidentifiedError", "ERROR")));
        if (this.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(C4299ds dsVar) {
        if (dsVar.RatingCompat != null) {
            dsVar.RatingCompat.aj_();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = p040o.GoodToKnowActivity.read(r0)
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0026
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0020
            boolean r0 = p040o.GoodToKnowActivity.read(r0)
            if (r0 != 0) goto L_0x0020
            r0 = r1
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            java.lang.String r4 = "SUCCESS"
            java.lang.String r3 = r4.toLowerCase(r3)
            java.lang.String r5 = "(this as java.lang.String).toLowerCase(locale)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r5)
            o.setEvents r5 = new o.setEvents
            r5.<init>(r3, r4)
            o.AutoValue_CrashlyticsReport_FilesPayload_File$1 r3 = new o.AutoValue_CrashlyticsReport_FilesPayload_File$1
            r3.<init>(r0, r7, r8, r5)
            com.google.gson.Gson r7 = r6.write
            java.lang.String r7 = r7.toJson((java.lang.Object) r3)
            o.ds$MediaSessionCompat$QueueItem r8 = new o.ds$MediaSessionCompat$QueueItem
            r8.<init>(r7)
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r7 = r6.RatingCompat
            if (r7 == 0) goto L_0x0057
            r1 = r2
        L_0x0057:
            if (r1 == 0) goto L_0x005e
            T r7 = r6.RatingCompat
            r8.IconCompatParcelizer(r7)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4299ds.MediaBrowserCompat$ItemReceiver(java.lang.String, java.lang.String):void");
    }
}
