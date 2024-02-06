package p040o;

import android.content.res.Resources;
import p040o.C10178z;
import p040o.Finalizer;
import p040o.LargestFaceFocusingProcessor;
import p040o.Lists;
import p040o.access$2300;
import p040o.getStackTraceAsString;
import p040o.writeUInt64NoTag;

/* renamed from: o.buildNameMap */
public class buildNameMap extends KtaJsonExactionHelper<QuickExtractorAgent> {
    public String MediaBrowserCompat$MediaItem = null;
    public parseProcMapsJsonFromStream MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Resources f2801x50fd9e4a;
    final getRootCause MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public Lists.RandomAccessListWrapper MediaSessionCompat$ResultReceiverWrapper;

    /* renamed from: o.buildNameMap$MediaMetadataCompat */
    interface MediaMetadataCompat {
        void write();
    }

    static /* synthetic */ void read() {
    }

    @HmlPinActivity
    public buildNameMap(RegularImmutableBiMap regularImmutableBiMap, Resources resources, LargestFaceFocusingProcessor.Builder builder, PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding personalLimitAdapter$LimitCustomViewHolder_ViewBinding, Lists.RandomAccessListWrapper randomAccessListWrapper, getRootCause getrootcause) {
        super(regularImmutableBiMap, builder, personalLimitAdapter$LimitCustomViewHolder_ViewBinding);
        this.MediaSessionCompat$ResultReceiverWrapper = randomAccessListWrapper;
        this.f2801x50fd9e4a = resources;
        this.MediaDescriptionCompat = getrootcause;
    }

    /* renamed from: o.buildNameMap$2 */
    public static /* synthetic */ class C41182 {
        public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.parseProcMapsJsonFromStream[] r0 = p040o.parseProcMapsJsonFromStream.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.parseProcMapsJsonFromStream r1 = p040o.parseProcMapsJsonFromStream.FAST_EASY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.parseProcMapsJsonFromStream r1 = p040o.parseProcMapsJsonFromStream.PIN_LOCK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.parseProcMapsJsonFromStream r1 = p040o.parseProcMapsJsonFromStream.DEAD_CARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.parseProcMapsJsonFromStream r1 = p040o.parseProcMapsJsonFromStream.PIN_LOCK_DEAD_CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.buildNameMap.C41182.<clinit>():void");
        }
    }

    public final String MediaDescriptionCompat() {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.registration_card_detail_header_register_flow);
        }
        int i = C41182.MediaBrowserCompat$CustomActionResultReceiver[this.MediaBrowserCompat$SearchResultReceiver.ordinal()];
        if (i == 1) {
            return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.registration_card_detail_header_register_flow);
        }
        if (i == 2) {
            return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.registration_card_detail_header_pin_lock_flow);
        }
        if (i == 3) {
            return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.activate_card_detail_header_register_flow);
        }
        if (i != 4) {
            return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.registration_card_detail_header_pin_lock_flow);
        }
        return this.f2801x50fd9e4a.getString(Iterables$3$MediaBrowserCompat$MediaItem.registration_card_detail_header_pin_lock_flow);
    }

    /* renamed from: o.buildNameMap$RatingCompat */
    class RatingCompat {
        private RatingCompat() {
        }

        /* synthetic */ RatingCompat(buildNameMap buildnamemap, byte b) {
            this();
        }
    }

    /* renamed from: o.buildNameMap$read */
    class read implements MediaMetadataCompat {
        private read() {
        }

        /* synthetic */ read(buildNameMap buildnamemap, byte b) {
            this();
        }

        public final void write() {
            Lists.RandomAccessListWrapper MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = buildNameMap.this.MediaSessionCompat$ResultReceiverWrapper;
            C10178z.C54855 r1 = new FundFactSheetActivity() {
                public final Object invoke(Object obj) {
                    return buildNameMap.write(buildNameMap.this, (PlaceBuffer) obj);
                }
            };
            C10178z.C54834.C54841 r2 = new FundFactSheetActivity() {
                public final Object invoke(Object obj) {
                    return buildNameMap.read(buildNameMap.this, (Throwable) obj);
                }
            };
            onGetStartedClick.write((Object) r1, "onSuccess");
            onGetStartedClick.write((Object) r2, "onError");
            validateModelFilesJni validatemodelfilesjni = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer;
            validatemodelfilesjni.read(validatemodelfilesjni.read(), new Lists.RandomAccessPartition(r1), new Lists.RandomAccessPartition(r2));
        }
    }

    /* renamed from: o.buildNameMap$MediaDescriptionCompat */
    class MediaDescriptionCompat {
        private MediaDescriptionCompat() {
        }

        /* synthetic */ MediaDescriptionCompat(buildNameMap buildnamemap, byte b) {
            this();
        }
    }

    /* renamed from: o.buildNameMap$IconCompatParcelizer */
    class IconCompatParcelizer implements buildNameMap$MediaBrowserCompat$MediaItem {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(buildNameMap buildnamemap, byte b) {
            this();
        }

        public final void IconCompatParcelizer(PlaceBuffer placeBuffer) {
            Lists.RandomAccessListWrapper MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = buildNameMap.this.MediaSessionCompat$ResultReceiverWrapper;
            C10178z.C548025 r1 = new FundFactSheetActivity() {
                public final Object invoke(Object obj) {
                    return buildNameMap.MediaBrowserCompat$CustomActionResultReceiver(buildNameMap.this, (getMaxZoomPreference) obj);
                }
            };
            C10178z.C54877 r2 = new FundFactSheetActivity() {
                public final Object invoke(Object obj) {
                    return buildNameMap.IconCompatParcelizer(buildNameMap.this, (Throwable) obj);
                }
            };
            String IconCompatParcelizer = buildNameMap.this.read;
            String MediaBrowserCompat$ItemReceiver = buildNameMap.this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) r1, "onSuccess");
            onGetStartedClick.write((Object) r2, "onError");
            onGetStartedClick.write((Object) IconCompatParcelizer, "cardNumber");
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "pin");
            onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, r1, r2, new getStackTraceAsString.write(IconCompatParcelizer, MediaBrowserCompat$ItemReceiver, placeBuffer));
        }
    }

    /* renamed from: o.buildNameMap$write */
    class write implements buildNameMap$MediaBrowserCompat$MediaItem {
        private write() {
        }

        /* synthetic */ write(buildNameMap buildnamemap, byte b) {
            this();
        }

        public final void IconCompatParcelizer(PlaceBuffer placeBuffer) {
            Lists.RandomAccessListWrapper MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = buildNameMap.this.MediaSessionCompat$ResultReceiverWrapper;
            C10178z.C54909.C54911 r1 = new FundActionsSuccessActivity() {
                public final Object invoke() {
                    return buildNameMap.MediaBrowserCompat$CustomActionResultReceiver(buildNameMap.this);
                }
            };
            C10178z.C54866 r2 = new FundFactSheetActivity() {
                public final Object invoke(Object obj) {
                    return buildNameMap.write(buildNameMap.this, (Throwable) obj);
                }
            };
            String MediaBrowserCompat$MediaItem = buildNameMap.this.read;
            String MediaDescriptionCompat = buildNameMap.this.MediaBrowserCompat$ItemReceiver;
            String MediaMetadataCompat = buildNameMap.this.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) r1, "onSuccess");
            onGetStartedClick.write((Object) r2, "onError");
            onGetStartedClick.write((Object) MediaBrowserCompat$MediaItem, "creditCardNumber");
            onGetStartedClick.write((Object) MediaDescriptionCompat, "creditAmount");
            onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaBrowserCompat$ItemReceiver(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaMetadataCompat, new Lists.RandomAccessListWrapper.write(r1), r2, new Finalizer.IconCompatParcelizer(MediaDescriptionCompat, MediaBrowserCompat$MediaItem, placeBuffer, MediaMetadataCompat));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.equals("3009") != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ p040o.HmlVerifyPhoneValidateOtpActivity IconCompatParcelizer(p040o.buildNameMap r7, java.lang.Throwable r8) {
        /*
            T r0 = r7.RatingCompat
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            T r0 = r7.RatingCompat
            r0.aj_()
        L_0x0010:
            boolean r0 = r8 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x001e
            r0 = r8
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x001e
            o.ILocationSourceDelegate$zza r0 = r0.write
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            o.Lists$RandomAccessListWrapper r3 = r7.MediaSessionCompat$ResultReceiverWrapper
            o.validateModelFilesJni r3 = r3.IconCompatParcelizer
            o.tY r3 = r3.read
            r3.read()
            if (r0 != 0) goto L_0x0036
            o.access$2300$write r0 = p040o.access$2300.write.JUST_DISMISS
            o.RegularImmutableBiMap r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r8 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r8, (p040o.access$2300.write) r0)
            r7.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r8)
            goto L_0x0091
        L_0x0036:
            java.lang.String r0 = r0.IconCompatParcelizer
            r3 = -1
            int r4 = r0.hashCode()
            r5 = 2
            r6 = 3
            switch(r4) {
                case 1567013: goto L_0x0060;
                case 1567014: goto L_0x0057;
                case 1567036: goto L_0x004d;
                case 1567037: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x006a
        L_0x0043:
            java.lang.String r1 = "3011"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            r1 = r5
            goto L_0x006b
        L_0x004d:
            java.lang.String r1 = "3010"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            r1 = r2
            goto L_0x006b
        L_0x0057:
            java.lang.String r4 = "3009"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x006a
            goto L_0x006b
        L_0x0060:
            java.lang.String r1 = "3008"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            r1 = r6
            goto L_0x006b
        L_0x006a:
            r1 = r3
        L_0x006b:
            if (r1 == 0) goto L_0x008e
            if (r1 == r2) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            if (r1 == r6) goto L_0x007f
            o.access$2300$write r0 = p040o.access$2300.write.JUST_DISMISS
            o.RegularImmutableBiMap r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r8 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r8, (p040o.access$2300.write) r0)
            r7.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r8)
            goto L_0x0091
        L_0x007f:
            o.z$24 r0 = new o.z$24
            r0.<init>()
            o.RegularImmutableBiMap r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r8 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r8, (java.lang.Runnable) r0)
            r7.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r8)
            goto L_0x0091
        L_0x008e:
            r7.RatingCompat(r8)
        L_0x0091:
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.buildNameMap.IconCompatParcelizer(o.buildNameMap, java.lang.Throwable):o.HmlVerifyPhoneValidateOtpActivity");
    }

    static /* synthetic */ HmlVerifyPhoneValidateOtpActivity MediaBrowserCompat$CustomActionResultReceiver(buildNameMap buildnamemap) {
        boolean z = true;
        if (buildnamemap.RatingCompat != null) {
            buildnamemap.RatingCompat.aj_();
        }
        C4928lP lPVar = C4928lP.read;
        if (buildnamemap.RatingCompat == null) {
            z = false;
        }
        if (z) {
            lPVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    static /* synthetic */ HmlVerifyPhoneValidateOtpActivity MediaBrowserCompat$CustomActionResultReceiver(buildNameMap buildnamemap, getMaxZoomPreference getmaxzoompreference) {
        boolean z = true;
        if (buildnamemap.RatingCompat != null) {
            buildnamemap.RatingCompat.aj_();
        }
        C10178z.C54823 r0 = new writeUInt64NoTag.IconCompatParcelizer(getmaxzoompreference) {
            private final /* synthetic */ getMaxZoomPreference write;

            {
                this.write = r2;
            }

            public final void IconCompatParcelizer(Object obj) {
                buildNameMap buildnamemap = buildNameMap.this;
                QuickExtractorAgent quickExtractorAgent = (QuickExtractorAgent) obj;
                if (!this.write.IconCompatParcelizer || buildnamemap.MediaDescriptionCompat.write.MediaMetadataCompat() != null) {
                    quickExtractorAgent.MediaSessionCompat$Token();
                } else {
                    quickExtractorAgent.read(mB$MediaBrowserCompat$ItemReceiver.FORGOTPIN);
                }
            }
        };
        if (buildnamemap.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r0.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r3.equals("3004") != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ p040o.HmlVerifyPhoneValidateOtpActivity write(p040o.buildNameMap r9, java.lang.Throwable r10) {
        /*
            T r0 = r9.RatingCompat
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            T r0 = r9.RatingCompat
            r0.aj_()
        L_0x0010:
            boolean r0 = r10 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x001e
            r0 = r10
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x001e
            o.ILocationSourceDelegate$zza r0 = r0.write
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            o.Lists$RandomAccessListWrapper r3 = r9.MediaSessionCompat$ResultReceiverWrapper
            o.validateModelFilesJni r3 = r3.IconCompatParcelizer
            o.tY r3 = r3.read
            r3.read()
            if (r0 != 0) goto L_0x0037
            o.access$2300$write r0 = p040o.access$2300.write.JUST_DISMISS
            o.RegularImmutableBiMap r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r10 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r10, (p040o.access$2300.write) r0)
            r9.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r10)
            goto L_0x00b8
        L_0x0037:
            java.lang.String r3 = r0.IconCompatParcelizer
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            switch(r5) {
                case 1567009: goto L_0x006d;
                case 1567010: goto L_0x0063;
                case 1567038: goto L_0x0059;
                case 1567039: goto L_0x004f;
                case 1567040: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0076
        L_0x0045:
            java.lang.String r1 = "3014"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0076
            r1 = r6
            goto L_0x0077
        L_0x004f:
            java.lang.String r1 = "3013"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0076
            r1 = r7
            goto L_0x0077
        L_0x0059:
            java.lang.String r1 = "3012"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0076
            r1 = r8
            goto L_0x0077
        L_0x0063:
            java.lang.String r1 = "3005"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0076
            r1 = r2
            goto L_0x0077
        L_0x006d:
            java.lang.String r5 = "3004"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r4
        L_0x0077:
            if (r1 == 0) goto L_0x00a0
            if (r1 == r2) goto L_0x009c
            if (r1 == r8) goto L_0x009c
            if (r1 == r7) goto L_0x009c
            if (r1 == r6) goto L_0x008d
            o.access$2300$write r0 = p040o.access$2300.write.JUST_DISMISS
            o.RegularImmutableBiMap r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r10 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r10, (p040o.access$2300.write) r0)
            r9.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r10)
            goto L_0x00b8
        L_0x008d:
            o.lR r0 = new o.lR
            r0.<init>(r9)
            o.RegularImmutableBiMap r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r10 = r1.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r10, (java.lang.Runnable) r0)
            r9.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r10)
            goto L_0x00b8
        L_0x009c:
            r9.RatingCompat(r10)
            goto L_0x00b8
        L_0x00a0:
            java.lang.String r1 = r0.write
            java.lang.String r2 = r0.read
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.hml_document_unclear_proceed
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.registration_tc_agree_notnow
            o.lQ r5 = new o.lQ
            r5.<init>(r9)
            o.z$20 r6 = p040o.C10178z.C547720.IconCompatParcelizer
            o.RegularImmutableBiMap r0 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2200 r10 = r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r4, r5, r6)
            r9.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r10)
        L_0x00b8:
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.buildNameMap.write(o.buildNameMap, java.lang.Throwable):o.HmlVerifyPhoneValidateOtpActivity");
    }

    static /* synthetic */ HmlVerifyPhoneValidateOtpActivity read(buildNameMap buildnamemap, Throwable th) {
        if (buildnamemap.RatingCompat != null) {
            buildnamemap.RatingCompat.aj_();
        }
        buildnamemap.MediaBrowserCompat$ItemReceiver(buildnamemap.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    static /* synthetic */ HmlVerifyPhoneValidateOtpActivity write(buildNameMap buildnamemap, PlaceBuffer placeBuffer) {
        buildNameMap$MediaBrowserCompat$MediaItem buildnamemap_mediabrowsercompat_mediaitem;
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(buildnamemap, (byte) 0);
        Boolean valueOf = Boolean.valueOf(buildnamemap.write);
        parseProcMapsJsonFromStream parseprocmapsjsonfromstream = buildnamemap.MediaBrowserCompat$SearchResultReceiver;
        if (valueOf.booleanValue()) {
            buildnamemap_mediabrowsercompat_mediaitem = (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.FAST_EASY || parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.DEAD_CARD) ? new buildNameMap$MediaBrowserCompat$ItemReceiver(buildNameMap.this, (byte) 0) : new IconCompatParcelizer(buildNameMap.this, (byte) 0);
        } else {
            buildnamemap_mediabrowsercompat_mediaitem = (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.FAST_EASY || parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.DEAD_CARD) ? new write(buildNameMap.this, (byte) 0) : new buildNameMap$MediaBrowserCompat$CustomActionResultReceiver(buildNameMap.this, (byte) 0);
        }
        buildnamemap_mediabrowsercompat_mediaitem.IconCompatParcelizer(placeBuffer);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void write() {
        C4980mu muVar = C4980mu.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            muVar.IconCompatParcelizer(this.RatingCompat);
        }
        RatingCompat ratingCompat = new RatingCompat(this, (byte) 0);
        (Boolean.valueOf(this.write).booleanValue() ? new read(buildNameMap.this, (byte) 0) : new buildNameMap$MediaBrowserCompat$SearchResultReceiver(buildNameMap.this, (byte) 0)).write();
    }
}
