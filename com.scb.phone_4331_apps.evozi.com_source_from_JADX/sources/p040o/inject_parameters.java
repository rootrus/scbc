package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.Ints;
import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_parameters */
public final class inject_parameters extends writeUInt64NoTag<ServerProjectProvider.C12918> {
    /* access modifiers changed from: private */
    public final Ints.IntArrayAsList IconCompatParcelizer;
    public final SquareCap MediaBrowserCompat$ItemReceiver;
    public final Ints read;
    public reportToJson write;

    /* renamed from: o.inject_parameters$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C12918> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C12918) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public inject_parameters(SquareCap squareCap, Ints.IntArrayAsList intArrayAsList, Ints ints, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) squareCap, "giftsCase");
        onGetStartedClick.write((Object) intArrayAsList, "giftSelectionDisplayMapper");
        onGetStartedClick.write((Object) ints, "giftTransferInputMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = squareCap;
        this.IconCompatParcelizer = intArrayAsList;
        this.read = ints;
    }

    /* renamed from: o.inject_parameters$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setPanningGesturesEnabled> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ inject_parameters MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 read;

        public IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder, inject_parameters inject_parameters, String str, AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r4) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder;
            this.MediaBrowserCompat$ItemReceiver = inject_parameters;
            this.IconCompatParcelizer = str;
            this.read = r4;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setPanningGesturesEnabled setpanninggesturesenabled = (setPanningGesturesEnabled) obj;
            onGetStartedClick.write((Object) setpanninggesturesenabled, "giftMoneyVerification");
            inject_parameters.read(this.MediaBrowserCompat$ItemReceiver);
            Ints IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.read;
            AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2 = this.read;
            reportToJson reporttojson = this.MediaBrowserCompat$ItemReceiver.write;
            if (reporttojson == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transferGiftingInputDisplay");
            }
            String str = reporttojson.MediaBrowserCompat$ItemReceiver;
            AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder = this.MediaBrowserCompat$CustomActionResultReceiver;
            reportToJson reporttojson2 = this.MediaBrowserCompat$ItemReceiver.write;
            if (reporttojson2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transferGiftingInputDisplay");
            }
            final setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(setpanninggesturesenabled, r2, str, builder, getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(reporttojson2.MediaBrowserCompat$CustomActionResultReceiver), this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setItemInvoker());
            inject_parameters inject_parameters = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C12918>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    setUuidFromUtf8Bytes setuuidfromutf8bytes = MediaBrowserCompat$CustomActionResultReceiver2;
                    onGetStartedClick.IconCompatParcelizer((Object) setuuidfromutf8bytes, "reviewDisplay");
                    ((ServerProjectProvider.C12918) obj).read(setuuidfromutf8bytes);
                }
            };
            if (inject_parameters.RatingCompat != null) {
                r1.IconCompatParcelizer(inject_parameters.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public static final /* synthetic */ void read(inject_parameters inject_parameters) {
        if (inject_parameters.RatingCompat != null) {
            inject_parameters.RatingCompat.aj_();
        }
    }
}
