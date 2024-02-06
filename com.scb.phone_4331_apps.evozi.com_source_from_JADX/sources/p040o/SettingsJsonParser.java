package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzby;
import p040o.zzdy;

/* renamed from: o.SettingsJsonParser */
public class SettingsJsonParser extends writeUInt64NoTag<getLAR> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2780x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem;
    private final setAutoFocusEnabled MediaSessionCompat$ResultReceiverWrapper;
    private final Barcode ParcelableVolumeInfo;
    public boolean read;
    public String write;

    /* renamed from: o.SettingsJsonParser$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
        public static final MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getLAR) obj).read(false);
        }
    }

    /* renamed from: o.SettingsJsonParser$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getLAR) obj).read(false);
        }
    }

    /* renamed from: o.SettingsJsonParser$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
        private /* synthetic */ SettingsJsonParser MediaBrowserCompat$CustomActionResultReceiver;

        public ParcelableVolumeInfo(SettingsJsonParser settingsJsonParser) {
            this.MediaBrowserCompat$CustomActionResultReceiver = settingsJsonParser;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getLAR) obj).MediaBrowserCompat$CustomActionResultReceiver(SettingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem);
        }
    }

    /* renamed from: o.SettingsJsonParser$RatingCompat */
    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getLAR, HmlVerifyPhoneValidateOtpActivity> {
        public static final RatingCompat read = new RatingCompat();

        RatingCompat() {
            super(1);
        }

        public final String getName() {
            return "navigateToCaptureScreen";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getLAR.class);
        }

        public final String getSignature() {
            return "navigateToCaptureScreen()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getLAR getlar = (getLAR) obj;
            onGetStartedClick.write((Object) getlar, "p1");
            getlar.write();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.SettingsJsonParser$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
        private /* synthetic */ SettingsJsonParser write;

        public IconCompatParcelizer(SettingsJsonParser settingsJsonParser) {
            this.write = settingsJsonParser;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getLAR) obj).read(SettingsJsonParser.read(this.write), this.write.MediaSessionCompat$QueueItem);
        }
    }

    public static final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(SettingsJsonParser settingsJsonParser) {
        String str = settingsJsonParser.MediaBrowserCompat$SearchResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewPath");
        }
        return str;
    }

    public static final /* synthetic */ String read(SettingsJsonParser settingsJsonParser) {
        String str = settingsJsonParser.MediaBrowserCompat$MediaItem;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("path");
        }
        return str;
    }

    public static final /* synthetic */ String write(SettingsJsonParser settingsJsonParser) {
        String str = settingsJsonParser.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public SettingsJsonParser(setAutoFocusEnabled setautofocusenabled, RegularImmutableBiMap regularImmutableBiMap, Barcode barcode) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) setautofocusenabled, "easycashAdditionDocumentCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) barcode, "deleteUploadedDocumentsCase");
        this.MediaSessionCompat$ResultReceiverWrapper = setautofocusenabled;
        this.ParcelableVolumeInfo = barcode;
    }

    /* renamed from: o.SettingsJsonParser$write */
    public static final class write implements findFragmentByWho {
        private write() {
        }

        public /* synthetic */ write(isUidGoogleSigned isuidgooglesigned) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            parseFonts parsefonts = (parseFonts) obj;
            return new zzdy.zze(parsefonts.MediaBrowserCompat$CustomActionResultReceiver, parsefonts.write, parsefonts.MediaBrowserCompat$MediaItem, parsefonts.read, parsefonts.MediaMetadataCompat, parsefonts.IconCompatParcelizer, parsefonts.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [o.SettingsController$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r4 = this;
            boolean r0 = r4.read
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            o.SettingsJsonParser$MediaMetadataCompat r0 = p040o.SettingsJsonParser.MediaMetadataCompat.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x000f
            r1 = r2
        L_0x000f:
            if (r1 == 0) goto L_0x0016
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.String r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0020
            java.lang.String r3 = "flow"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0020:
            java.lang.String r3 = "hml"
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r3, r0, r2)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r4.IconCompatParcelizer
            if (r0 != 0) goto L_0x0031
            java.lang.String r3 = "documentType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0031:
            java.lang.String r3 = "SALARY"
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r3, r0, r2)
            if (r0 == 0) goto L_0x004a
            o.SettingsJsonParser$MediaDescriptionCompat r0 = p040o.SettingsJsonParser.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0042
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0049:
            return
        L_0x004a:
            o.SettingsJsonParser$RatingCompat r0 = p040o.SettingsJsonParser.RatingCompat.read
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0056
            o.SettingsController$1 r3 = new o.SettingsController$1
            r3.<init>()
            r0 = r3
        L_0x0056:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x005d
            r1 = r2
        L_0x005d:
            if (r1 == 0) goto L_0x0064
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SettingsJsonParser.read():void");
    }

    /* renamed from: o.SettingsJsonParser$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzby.zza> {
        final /* synthetic */ SettingsJsonParser IconCompatParcelizer;

        /* renamed from: o.SettingsJsonParser$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
            final /* synthetic */ read IconCompatParcelizer;
            final /* synthetic */ zzby.zza MediaBrowserCompat$CustomActionResultReceiver;

            IconCompatParcelizer(read read, zzby.zza zza) {
                this.IconCompatParcelizer = read;
                this.MediaBrowserCompat$CustomActionResultReceiver = zza;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                final getLAR getlar = (getLAR) obj;
                String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "additionDocument.reuploadErrorTitle");
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver.read;
                onGetStartedClick.IconCompatParcelizer((Object) str2, "additionDocument.reuploadErrorBody");
                getlar.MediaBrowserCompat$ItemReceiver(str, str2, new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(this) {
                    private /* synthetic */ IconCompatParcelizer read;

                    {
                        this.read = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        SettingsJsonParser settingsJsonParser = this.read.IconCompatParcelizer.IconCompatParcelizer;
                        String str = this.read.MediaBrowserCompat$CustomActionResultReceiver.write;
                        onGetStartedClick.IconCompatParcelizer((Object) str, "additionDocument.documentId");
                        settingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver(str);
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                }, new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>() {
                    public final /* synthetic */ Object invoke() {
                        getlar.read();
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                });
            }
        }

        /* renamed from: o.SettingsJsonParser$read$read  reason: collision with other inner class name */
        static final class C10812read<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
            final /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;
            final /* synthetic */ zzby.zza write;

            C10812read(read read, zzby.zza zza) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read;
                this.write = zza;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                String str = this.write.MediaBrowserCompat$SearchResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "additionDocument.reuploadErrorTitle");
                String str2 = this.write.read;
                onGetStartedClick.IconCompatParcelizer((Object) str2, "additionDocument.reuploadErrorBody");
                ((getLAR) obj).write(str, str2, new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(this) {
                    private /* synthetic */ C10812read MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        SettingsJsonParser settingsJsonParser = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                        String str = this.MediaBrowserCompat$ItemReceiver.write.write;
                        onGetStartedClick.IconCompatParcelizer((Object) str, "additionDocument.documentId");
                        settingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver(str);
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                });
            }
        }

        /* renamed from: o.SettingsJsonParser$read$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
            public static final write MediaBrowserCompat$ItemReceiver = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((getLAR) obj).read(true);
            }
        }

        read(SettingsJsonParser settingsJsonParser) {
            this.IconCompatParcelizer = settingsJsonParser;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzby.zza zza = (zzby.zza) obj;
            onGetStartedClick.write((Object) zza, "additionDocument");
            SettingsJsonParser.IconCompatParcelizer(this.IconCompatParcelizer);
            zzby.zza.read read = zza.MediaMetadataCompat;
            boolean z = false;
            if (read != null) {
                int i = loadSettingsData.MediaBrowserCompat$CustomActionResultReceiver[read.ordinal()];
                if (i == 1) {
                    SettingsJsonParser settingsJsonParser = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer read2 = new C10812read(this, zza);
                    if (settingsJsonParser.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        read2.IconCompatParcelizer(settingsJsonParser.RatingCompat);
                        return;
                    }
                    return;
                } else if (i == 2) {
                    SettingsJsonParser settingsJsonParser2 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, zza);
                    if (settingsJsonParser2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(settingsJsonParser2.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            if (SettingsJsonParser.MediaMetadataCompat(this.IconCompatParcelizer) && GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("SALARY", SettingsJsonParser.write(this.IconCompatParcelizer), true)) {
                SettingsJsonParser settingsJsonParser3 = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C9823x139b46bd.IconCompatParcelizer;
                if (settingsJsonParser3.RatingCompat != null) {
                    iconCompatParcelizer2.IconCompatParcelizer(settingsJsonParser3.RatingCompat);
                }
            }
            SettingsJsonParser settingsJsonParser4 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = write.MediaBrowserCompat$ItemReceiver;
            if (settingsJsonParser4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(settingsJsonParser4.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void MediaDescriptionCompat(Throwable th) {
        onGetStartedClick.write((Object) th, "error");
        if (this.MediaDescriptionCompat) {
            String str = this.MediaBrowserCompat$MediaItem;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("path");
            }
            write(str);
            return;
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public void onDestroy() {
        setAutoFocusEnabled setautofocusenabled = this.MediaSessionCompat$ResultReceiverWrapper;
        if (!setautofocusenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            setautofocusenabled.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void IconCompatParcelizer(SettingsJsonParser settingsJsonParser) {
        if (settingsJsonParser.RatingCompat != null) {
            settingsJsonParser.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ boolean MediaMetadataCompat(SettingsJsonParser settingsJsonParser) {
        String str = settingsJsonParser.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("hml", str, true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "documentId");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(str);
        this.ParcelableVolumeInfo.IconCompatParcelizer(new SettingsJsonParser$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "imagePath");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setAutoFocusEnabled setautofocusenabled = this.MediaSessionCompat$ResultReceiverWrapper;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
        }
        String str3 = this.write;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("applicationId");
        }
        String str4 = this.f2780x50fd9e4a;
        if (str4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        setautofocusenabled.MediaBrowserCompat$CustomActionResultReceiver("documentFile", str, str2, str3, str4, str5);
        this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new read(this));
    }
}
