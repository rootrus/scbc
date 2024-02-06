package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.p041bp.OffsetDateTime;
import p040o.HmlWorkAddressActivity;
import p040o.ILocationSourceDelegate;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingStrategy */
public final class FieldNamingStrategy extends writeUInt64NoTag<getFirstName.MediaDescriptionCompat> {
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public Component$$Lambda$2 MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final partitionImpl MediaMetadataCompat;
    public ArrayList<isAlwaysEager> read = new ArrayList<>();
    /* access modifiers changed from: private */
    public AtomicBoolean write = new AtomicBoolean();

    /* renamed from: o.FieldNamingStrategy$Keep */
    static final class Keep<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
        private /* synthetic */ FieldNamingStrategy MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ Component$$Lambda$2 write;

        Keep(FieldNamingStrategy fieldNamingStrategy, Component$$Lambda$2 component$$Lambda$2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fieldNamingStrategy;
            this.write = component$$Lambda$2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = this.write;
            this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
            this.MediaBrowserCompat$CustomActionResultReceiver.read.addAll(this.write.MediaBrowserCompat$ItemReceiver);
            ((getFirstName.MediaDescriptionCompat) obj).IconCompatParcelizer(this.write.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.FieldNamingStrategy$MediaDescriptionCompat */
    static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<IdCaptureActivity, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(1);
        }

        public final String getName() {
            return "showTapToRetryForNextPage";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(IdCaptureActivity.class);
        }

        public final String getSignature() {
            return "showTapToRetryForNextPage()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) obj;
            onGetStartedClick.write((Object) idCaptureActivity, "p1");
            idCaptureActivity.MediaSessionCompat$Token();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FieldNamingStrategy$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Component$$Lambda$2, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ FieldNamingStrategy MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(FieldNamingStrategy fieldNamingStrategy) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = fieldNamingStrategy;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Component$$Lambda$2 component$$Lambda$2 = (Component$$Lambda$2) obj;
            onGetStartedClick.write((Object) component$$Lambda$2, "display");
            this.MediaBrowserCompat$ItemReceiver.write.set(false);
            FieldNamingStrategy.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$ItemReceiver);
            FieldNamingStrategy.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, component$$Lambda$2);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FieldNamingStrategy$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
        final /* synthetic */ FieldNamingStrategy MediaBrowserCompat$CustomActionResultReceiver;

        public ParcelableVolumeInfo(FieldNamingStrategy fieldNamingStrategy) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fieldNamingStrategy;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final getFirstName.MediaDescriptionCompat mediaDescriptionCompat = (getFirstName.MediaDescriptionCompat) obj;
            mediaDescriptionCompat.write();
            mediaDescriptionCompat.AlertController$RecycleListView();
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(FieldNamingStrategy.write(this.MediaBrowserCompat$CustomActionResultReceiver), new nullEntry(FieldNamingStrategy.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver), 0), new FundFactSheetActivity<Component$$Lambda$2, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ ParcelableVolumeInfo MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Component$$Lambda$2 component$$Lambda$2 = (Component$$Lambda$2) obj;
                    onGetStartedClick.write((Object) component$$Lambda$2, "display");
                    mediaDescriptionCompat.aj_();
                    FieldNamingStrategy.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, component$$Lambda$2);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }, new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ ParcelableVolumeInfo IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    onGetStartedClick.write((Object) th, "e");
                    mediaDescriptionCompat.aj_();
                    FieldNamingStrategy.write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, th);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            });
        }
    }

    /* renamed from: o.FieldNamingStrategy$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
        private /* synthetic */ isAlwaysEager write;

        public RatingCompat(isAlwaysEager isalwayseager) {
            this.write = isalwayseager;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.MediaDescriptionCompat) obj).MediaBrowserCompat$ItemReceiver(this.write);
        }
    }

    /* renamed from: o.FieldNamingStrategy$read */
    static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<IdCaptureActivity, HmlVerifyPhoneValidateOtpActivity> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(1);
        }

        public final String getName() {
            return "hideTapToRetryForNextPage";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(IdCaptureActivity.class);
        }

        public final String getSignature() {
            return "hideTapToRetryForNextPage()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) obj;
            onGetStartedClick.write((Object) idCaptureActivity, "p1");
            idCaptureActivity.MediaSessionCompat$ResultReceiverWrapper();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FieldNamingStrategy$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
        private /* synthetic */ int read;

        public write(int i) {
            this.read = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.MediaDescriptionCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    public static final /* synthetic */ String write(FieldNamingStrategy fieldNamingStrategy) {
        String str = fieldNamingStrategy.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRef");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FieldNamingStrategy(RegularImmutableBiMap regularImmutableBiMap, partitionImpl partitionimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) partitionimpl, "controller");
        this.MediaMetadataCompat = partitionimpl;
    }

    /* renamed from: o.FieldNamingStrategy$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ KeepName read;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(KeepName keepName) {
            this.read = keepName;
        }

        public final Object IconCompatParcelizer(Object obj) {
            ShapeFillParser shapeFillParser = (ShapeFillParser) obj;
            return new HmlWorkAddressActivity.read(shapeFillParser.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindSummaryFragment.write(shapeFillParser.write, (OffsetDateTime) null), shapeFillParser.MediaBrowserCompat$ItemReceiver, shapeFillParser.IconCompatParcelizer);
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [o.Gson] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r6 = this;
            o.Component$$Lambda$2 r0 = r6.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r1 = "transactionDisplay"
            if (r0 != 0) goto L_0x0009
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.setInstantiation r0 = r0.read
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x006f
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.write
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006f
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.write
            r2 = 1
            r0.set(r2)
            o.FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver r0 = p040o.FieldNamingStrategy$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0029
            o.Gson r3 = new o.Gson
            r3.<init>(r0)
            r0 = r3
        L_0x0029:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r6.RatingCompat
            if (r3 == 0) goto L_0x0031
            r3 = r2
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x0039
            T r3 = r6.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0039:
            o.partitionImpl r0 = r6.MediaMetadataCompat
            java.lang.String r3 = r6.IconCompatParcelizer
            if (r3 != 0) goto L_0x0044
            java.lang.String r4 = "cardRef"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0044:
            boolean r4 = r6.MediaBrowserCompat$ItemReceiver
            if (r4 != r2) goto L_0x004b
            java.lang.String r4 = "valid"
            goto L_0x004d
        L_0x004b:
            java.lang.String r4 = "invalid"
        L_0x004d:
            o.Component$$Lambda$2 r5 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r5 != 0) goto L_0x0054
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0054:
            o.setInstantiation r1 = r5.read
            int r1 = r1.read
            o.nullEntry r5 = new o.nullEntry
            int r1 = r1 + r2
            r5.<init>(r4, r1)
            o.FieldNamingStrategy$MediaMetadataCompat r1 = new o.FieldNamingStrategy$MediaMetadataCompat
            r1.<init>(r6)
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            o.FieldNamingStrategy$MediaSessionCompat$Token r2 = new o.FieldNamingStrategy$MediaSessionCompat$Token
            r2.<init>(r6)
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            r0.MediaBrowserCompat$CustomActionResultReceiver(r3, r5, r1, r2)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FieldNamingStrategy.read():void");
    }

    public static final /* synthetic */ String IconCompatParcelizer(FieldNamingStrategy fieldNamingStrategy) {
        return fieldNamingStrategy.MediaBrowserCompat$ItemReceiver ? "valid" : "invalid";
    }

    public static final /* synthetic */ String MediaDescriptionCompat(Throwable th) {
        if (!(th instanceof RetrofitException)) {
            return "OTHER_ERROR";
        }
        RetrofitException retrofitException = (RetrofitException) th;
        if (retrofitException.IconCompatParcelizer == null) {
            return "OTHER_ERROR";
        }
        ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "throwable.response");
        if (iLocationSourceDelegate.write == null) {
            return "OTHER_ERROR";
        }
        ILocationSourceDelegate iLocationSourceDelegate2 = retrofitException.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate2, "throwable.response");
        ILocationSourceDelegate.zza zza = iLocationSourceDelegate2.write;
        onGetStartedClick.IconCompatParcelizer((Object) zza, "throwable.response.error");
        return zza.IconCompatParcelizer;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [o.Gson] */
    /* JADX WARNING: type inference failed for: r1v7, types: [o.Gson] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void MediaBrowserCompat$MediaItem(p040o.FieldNamingStrategy r4) {
        /*
            o.FieldNamingStrategy$read r0 = p040o.FieldNamingStrategy.read.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x000c
            o.Gson r1 = new o.Gson
            r1.<init>(r0)
            r0 = r1
        L_0x000c:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r4.RatingCompat
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 == 0) goto L_0x001e
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x001e:
            o.FieldNamingStrategy$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.C3358xeb06cb62.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x002a
            o.Gson r1 = new o.Gson
            r1.<init>(r0)
            r0 = r1
        L_0x002a:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r4.RatingCompat
            if (r1 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x0039
            T r4 = r4.RatingCompat
            r0.IconCompatParcelizer(r4)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FieldNamingStrategy.MediaBrowserCompat$MediaItem(o.FieldNamingStrategy):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [o.Gson] */
    /* JADX WARNING: type inference failed for: r1v7, types: [o.Gson] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void MediaDescriptionCompat(p040o.FieldNamingStrategy r4) {
        /*
            o.FieldNamingStrategy$MediaBrowserCompat$MediaItem r0 = p040o.FieldNamingStrategy$MediaBrowserCompat$MediaItem.read
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x000c
            o.Gson r1 = new o.Gson
            r1.<init>(r0)
            r0 = r1
        L_0x000c:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r4.RatingCompat
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 == 0) goto L_0x001e
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x001e:
            o.FieldNamingStrategy$MediaDescriptionCompat r0 = p040o.FieldNamingStrategy.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x002a
            o.Gson r1 = new o.Gson
            r1.<init>(r0)
            r0 = r1
        L_0x002a:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r4.RatingCompat
            if (r1 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x0039
            T r4 = r4.RatingCompat
            r0.IconCompatParcelizer(r4)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FieldNamingStrategy.MediaDescriptionCompat(o.FieldNamingStrategy):void");
    }

    public static final /* synthetic */ void write(FieldNamingStrategy fieldNamingStrategy, Throwable th) {
        writeUInt64NoTag.IconCompatParcelizer fieldNamingStrategy$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new C3359x306c173b(fieldNamingStrategy, th);
        if (fieldNamingStrategy.RatingCompat != null) {
            fieldNamingStrategy$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(FieldNamingStrategy fieldNamingStrategy, RetrofitException retrofitException) {
        writeUInt64NoTag.IconCompatParcelizer fieldNamingStrategy$MediaSessionCompat$QueueItem = new FieldNamingStrategy$MediaSessionCompat$QueueItem(fieldNamingStrategy, retrofitException);
        if (fieldNamingStrategy.RatingCompat != null) {
            fieldNamingStrategy$MediaSessionCompat$QueueItem.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(FieldNamingStrategy fieldNamingStrategy, Component$$Lambda$2 component$$Lambda$2) {
        writeUInt64NoTag.IconCompatParcelizer fieldNamingStrategy$AlertController$RecycleListView = new FieldNamingStrategy$AlertController$RecycleListView(fieldNamingStrategy, component$$Lambda$2);
        if (fieldNamingStrategy.RatingCompat != null) {
            fieldNamingStrategy$AlertController$RecycleListView.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(FieldNamingStrategy fieldNamingStrategy, Component$$Lambda$2 component$$Lambda$2) {
        writeUInt64NoTag.IconCompatParcelizer keep = new Keep(fieldNamingStrategy, component$$Lambda$2);
        if (fieldNamingStrategy.RatingCompat != null) {
            keep.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
    }
}
