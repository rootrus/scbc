package p040o;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AutoValue_CrashlyticsReport;
import p040o.LinkedListMultimap;
import p040o.Sets;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIconType */
public final class getIconType extends C4128bz {
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Sets.C37701 f2836x50fd9e4a;
    private final setSelectedTabIndicator ParcelableVolumeInfo;
    final LinkedListMultimap.C35733.C35741 read;

    /* renamed from: o.getIconType$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getIconType IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getIconType geticontype) {
            super(1);
            this.IconCompatParcelizer = geticontype;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            getIconType geticontype = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getFrontImage>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            };
            if (geticontype.RatingCompat != null) {
                r1.IconCompatParcelizer(geticontype.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getIconType$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getIconType MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(getIconType geticontype) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = geticontype;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "e");
            getIconType geticontype = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getFrontImage>(this) {
                private /* synthetic */ MediaMetadataCompat IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            };
            if (geticontype.RatingCompat != null) {
                r1.IconCompatParcelizer(geticontype.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getIconType$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<AutoValue_CrashlyticsReport.Builder, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getIconType MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ List read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(getIconType geticontype, List list) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = geticontype;
            this.read = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            T t;
            AutoValue_CrashlyticsReport.Builder builder = (AutoValue_CrashlyticsReport.Builder) obj;
            onGetStartedClick.write((Object) builder, "display");
            this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = builder;
            String str = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.MediaBrowserCompat$MediaItem;
            AutoValue_CrashlyticsReport.Builder MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
            for (zzwh zzwh : this.read) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) zzwh.read, (Object) this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.MediaBrowserCompat$MediaItem)) {
                    zzui<String> zzui = zzwh.IconCompatParcelizer;
                    boolean z = true;
                    if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(onGetLayoutInflater.IconCompatParcelizer(), "th", true)) {
                        t = zzui.write;
                    } else {
                        t = zzui.read;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = (String) t;
                    getIconType geticontype = this.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getFrontImage>(this) {
                        private /* synthetic */ read MediaBrowserCompat$ItemReceiver;

                        {
                            this.MediaBrowserCompat$ItemReceiver = r1;
                        }

                        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                            ((getFrontImage) obj).write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat);
                        }
                    };
                    if (geticontype.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        r1.IconCompatParcelizer(geticontype.RatingCompat);
                    }
                    this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.MediaBrowserCompat$MediaItem = str;
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: o.getIconType$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<removeActivityTransitionUpdates, AutoValue_CrashlyticsReport.Builder> {
        private /* synthetic */ getIconType write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(getIconType geticontype) {
            super(1);
            this.write = geticontype;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            removeActivityTransitionUpdates removeactivitytransitionupdates = (removeActivityTransitionUpdates) obj;
            onGetStartedClick.write((Object) removeactivitytransitionupdates, "hmlVerifyEkycStatus");
            Sets.C37701 unused = this.write.f2836x50fd9e4a;
            onGetStartedClick.write((Object) removeactivitytransitionupdates, "hmlVerifyKycStatus");
            AutoValue_CrashlyticsReport.Builder builder = new AutoValue_CrashlyticsReport.Builder();
            builder.MediaBrowserCompat$MediaItem = removeactivitytransitionupdates.write;
            builder.MediaDescriptionCompat = removeactivitytransitionupdates.read.MediaBrowserCompat$SearchResultReceiver;
            builder.MediaBrowserCompat$SearchResultReceiver = removeactivitytransitionupdates.read.MediaBrowserCompat$CustomActionResultReceiver;
            builder.MediaBrowserCompat$CustomActionResultReceiver = removeactivitytransitionupdates.read.MediaMetadataCompat;
            builder.RatingCompat = removeactivitytransitionupdates.read.RatingCompat;
            builder.read = removeactivitytransitionupdates.read.read;
            builder.MediaMetadataCompat = removeactivitytransitionupdates.read.IconCompatParcelizer;
            builder.MediaBrowserCompat$ItemReceiver = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(removeactivitytransitionupdates.read.MediaBrowserCompat$ItemReceiver, "yyyy-MM-dd", "dd/MM/yyyy", false);
            builder.IconCompatParcelizer = removeactivitytransitionupdates.read.write.MediaBrowserCompat$CustomActionResultReceiver;
            builder.f2673x50fd9e4a = removeactivitytransitionupdates.read.write.IconCompatParcelizer;
            builder.MediaSessionCompat$Token = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(removeactivitytransitionupdates.read.write.MediaBrowserCompat$ItemReceiver, "yyyy-MM-dd", "dd/MM/yyyy", false);
            return builder;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @p040o.HmlPinActivity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getIconType(p040o.getConditionalUserPropertiesAs r17, p040o.LatLng r18, p040o.loadFinalizer r19, p040o.Enums.C33301 r20, p040o.initDetectorJni r21, p040o.Equivalences.Impl r22, p040o.trackSingleFaceJni r23, p040o.ByteStreams.ByteArrayDataInputStream r24, p040o.RegularImmutableBiMap r25, p040o.MapMaker r26, p040o.readFully r27, p040o.LinkedListMultimap.C35733.C35741 r28, p040o.setSelectedTabIndicator r29, p040o.Sets.C37701 r30, p040o.synchronizedSupplier r31) {
        /*
            r16 = this;
            r13 = r16
            r14 = r28
            r15 = r29
            r12 = r30
            java.lang.String r0 = "personalInfoCase"
            r1 = r17
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r0)
            java.lang.String r0 = "addressCase"
            r2 = r18
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
            java.lang.String r0 = "ndidRpUploadPhotoCase"
            r3 = r19
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.String r0 = "formatCitizenCase"
            r4 = r20
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "formatDobCase"
            r5 = r21
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = "ndidRpRequestVerificationCase"
            r6 = r22
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "validateDateOfBirthCase"
            r7 = r23
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            java.lang.String r0 = "ekycTitleDisplayMapper"
            r8 = r24
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.String r0 = "errorDisplayMapper"
            r9 = r25
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r0 = "countryDisplayMapper"
            r10 = r26
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r0 = "ndidRpVerificationRequestMapper"
            r11 = r27
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
            java.lang.String r0 = "hmlNdidNationalIdInputController"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r0 = "hmlUploadCitPhotoCase"
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            java.lang.String r0 = "hmlNdidNationalIdInputDisplayMapper"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
            java.lang.String r0 = "registrationPersonalInfoCase"
            r12 = r31
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.read = r14
            r13.ParcelableVolumeInfo = r15
            r0 = r30
            r13.f2836x50fd9e4a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getIconType.<init>(o.getConditionalUserPropertiesAs, o.LatLng, o.loadFinalizer, o.Enums$1, o.initDetectorJni, o.Equivalences$Impl, o.trackSingleFaceJni, o.ByteStreams$ByteArrayDataInputStream, o.RegularImmutableBiMap, o.MapMaker, o.readFully, o.LinkedListMultimap$3$1, o.setSelectedTabIndicator, o.Sets$1, o.synchronizedSupplier):void");
    }

    public final void write(String str) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getIconType$MediaBrowserCompat$MediaItem.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        LinkedListMultimap.C35733.C35741 r4 = this.read;
        FundFactSheetActivity geticontype_mediabrowsercompat_searchresultreceiver = new getIconType$MediaBrowserCompat$SearchResultReceiver(this);
        FundFactSheetActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) geticontype_mediabrowsercompat_searchresultreceiver, "onNext");
        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
        r4.write.MediaBrowserCompat$ItemReceiver();
        r4.write.IconCompatParcelizer(new LinkedListMultimap.C35733.C35741.IconCompatParcelizer(geticontype_mediabrowsercompat_searchresultreceiver, mediaMetadataCompat));
    }

    public final void onDestroy() {
        this.read.IconCompatParcelizer();
        setSelectedTabIndicator setselectedtabindicator = this.ParcelableVolumeInfo;
        if (!setselectedtabindicator.MediaBrowserCompat$MediaItem.isDisposed()) {
            setselectedtabindicator.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void read(getIconType geticontype) {
        if (geticontype.RatingCompat != null) {
            geticontype.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(File file) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setSelectedTabIndicator setselectedtabindicator = this.ParcelableVolumeInfo;
        AutoValue_CrashlyticsReport.Builder builder = this.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) builder, "ndidNationalIdInputDisplay");
        String str = builder.MediaSessionCompat$ResultReceiverWrapper;
        onGetStartedClick.IconCompatParcelizer((Object) str, "ndidNationalIdInputDisplay.nationalIdImageUri");
        setselectedtabindicator.write(str);
        this.ParcelableVolumeInfo.IconCompatParcelizer(new getIconType$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void read(String str, int i) {
        onGetStartedClick.write((Object) str, "imagePath");
        AutoValue_CrashlyticsReport.Builder builder = this.MediaDescriptionCompat;
        boolean z = true;
        if (!(builder == null || builder.MediaSessionCompat$ResultReceiverWrapper == null)) {
            getSupportedFocusModes getsupportedfocusmodes = new getSupportedFocusModes(this);
            if (this.RatingCompat != null) {
                getsupportedfocusmodes.IconCompatParcelizer(this.RatingCompat);
            }
        }
        AutoValue_CrashlyticsReport.Builder builder2 = this.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) builder2, "ndidNationalIdInputDisplay");
        builder2.MediaSessionCompat$ResultReceiverWrapper = str;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer geticontype_mediabrowsercompat_customactionresultreceiver = new getIconType$MediaBrowserCompat$CustomActionResultReceiver(this, i);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            geticontype_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
