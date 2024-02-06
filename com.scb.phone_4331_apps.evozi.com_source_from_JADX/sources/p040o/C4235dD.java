package p040o;

import android.content.res.Resources;
import com.scb.phone.domain.errors.RetrofitException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ILocationSourceDelegate;
import p040o.Iterables;
import p040o.createEntries;
import p040o.fromDataField;
import p040o.writeUInt64NoTag;

/* renamed from: o.dD */
public final class C4235dD extends writeUInt64NoTag<fromDataField.read> {
    public C10839getFilename IconCompatParcelizer;
    final Resources MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Iterables.C352212 MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final nullToEmpty MediaBrowserCompat$SearchResultReceiver;
    public String read;
    public final constrainedAsMapEntries write;

    /* renamed from: o.dD$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<PlaceBuffer, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(C4235dD dDVar) {
            super(1, dDVar);
        }

        public final String getName() {
            return "onPreAuthenticateReceive";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C4235dD.class);
        }

        public final String getSignature() {
            return "onPreAuthenticateReceive(Lcom/scb/phone/domain/entity/isprint/PreAuthenticate;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            PlaceBuffer placeBuffer = (PlaceBuffer) obj;
            onGetStartedClick.write((Object) placeBuffer, "p1");
            C4235dD.MediaBrowserCompat$ItemReceiver((C4235dD) this.receiver, placeBuffer);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dD$RatingCompat */
    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4235dD IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(C4235dD dDVar) {
            super(1);
            this.IconCompatParcelizer = dDVar;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
            if (r1.equals("9101") != false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            if (r1.equals("3044") != false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
            if (r1.equals("3028") != false) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
            if (r1.equals("3024") != false) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            p040o.C4235dD.read(r4.IconCompatParcelizer, r5, (java.lang.Runnable) new p040o.C4235dD.RatingCompat.C42385(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
            if (r1.equals("3014") != false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
            r0 = r4.IconCompatParcelizer;
            r1 = new p040o.C4235dD.RatingCompat.C42361(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (r0.RatingCompat == null) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
            if (r2 == false) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
            r1.IconCompatParcelizer(r0.RatingCompat);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                java.lang.String r0 = "throwable"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                boolean r0 = r5 instanceof com.scb.phone.domain.errors.RetrofitException
                r1 = 0
                if (r0 != 0) goto L_0x000e
                r0 = r1
                goto L_0x000f
            L_0x000e:
                r0 = r5
            L_0x000f:
                com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
                if (r0 == 0) goto L_0x001d
                o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
                if (r0 == 0) goto L_0x001d
                o.ILocationSourceDelegate$zza r0 = r0.write
                if (r0 == 0) goto L_0x001d
                java.lang.String r1 = r0.IconCompatParcelizer
            L_0x001d:
                if (r1 == 0) goto L_0x00e4
                int r0 = r1.hashCode()
                r2 = 1
                r3 = 0
                switch(r0) {
                    case 1567040: goto L_0x00c5;
                    case 1567070: goto L_0x00b5;
                    case 1567071: goto L_0x00a0;
                    case 1567074: goto L_0x0099;
                    case 1567075: goto L_0x0090;
                    case 1567133: goto L_0x0087;
                    case 1567136: goto L_0x006b;
                    case 1746713: goto L_0x0062;
                    case 1746714: goto L_0x002a;
                    default: goto L_0x0028;
                }
            L_0x0028:
                goto L_0x00e4
            L_0x002a:
                java.lang.String r0 = "9102"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                o.dD r0 = r4.IconCompatParcelizer
                o.constrainedAsMapEntries r0 = r0.write
                o.dD r1 = r4.IconCompatParcelizer
                o.getFilename r1 = p040o.C4235dD.IconCompatParcelizer(r1)
                java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r2 = "nationalId"
                p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
                o.synchronizedSupplier r0 = r0.read
                o.FragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver r0 = r0.IconCompatParcelizer
                r0.IconCompatParcelizer((java.lang.String) r1)
                o.dD r0 = r4.IconCompatParcelizer
                com.scb.phone.domain.errors.RetrofitException r5 = (com.scb.phone.domain.errors.RetrofitException) r5
                android.content.res.Resources r1 = r0.MediaBrowserCompat$ItemReceiver
                int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_register_scb
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "resources.getString(R.st…touchpoints_register_scb)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
                r0.MediaBrowserCompat$ItemReceiver(r5, r1, false)
                goto L_0x00e9
            L_0x0062:
                java.lang.String r0 = "9101"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                goto L_0x00cd
            L_0x006b:
                java.lang.String r0 = "3047"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                o.dD r5 = r4.IconCompatParcelizer
                o.dD$RatingCompat$4 r0 = p040o.C4235dD.RatingCompat.C42374.IconCompatParcelizer
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r5.RatingCompat
                if (r1 == 0) goto L_0x007e
                goto L_0x007f
            L_0x007e:
                r2 = r3
            L_0x007f:
                if (r2 == 0) goto L_0x00e9
                T r5 = r5.RatingCompat
                r0.IconCompatParcelizer(r5)
                goto L_0x00e9
            L_0x0087:
                java.lang.String r0 = "3044"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                goto L_0x00cd
            L_0x0090:
                java.lang.String r0 = "3028"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                goto L_0x00a8
            L_0x0099:
                java.lang.String r0 = "3027"
                boolean r0 = r1.equals(r0)
                goto L_0x00e4
            L_0x00a0:
                java.lang.String r0 = "3024"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
            L_0x00a8:
                o.dD r0 = r4.IconCompatParcelizer
                o.dD$RatingCompat$5 r1 = new o.dD$RatingCompat$5
                r1.<init>(r4)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r5, (java.lang.Runnable) r1))
                goto L_0x00e9
            L_0x00b5:
                java.lang.String r0 = "3023"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
                o.dD r0 = r4.IconCompatParcelizer
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r5, (p040o.access$2300.write) r1))
                goto L_0x00e9
            L_0x00c5:
                java.lang.String r0 = "3014"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e4
            L_0x00cd:
                o.dD r0 = r4.IconCompatParcelizer
                o.dD$RatingCompat$1 r1 = new o.dD$RatingCompat$1
                r1.<init>(r4, r5)
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r5 = r0.RatingCompat
                if (r5 == 0) goto L_0x00db
                goto L_0x00dc
            L_0x00db:
                r2 = r3
            L_0x00dc:
                if (r2 == 0) goto L_0x00e9
                T r5 = r0.RatingCompat
                r1.IconCompatParcelizer(r5)
                goto L_0x00e9
            L_0x00e4:
                o.dD r0 = r4.IconCompatParcelizer
                r0.MediaDescriptionCompat(r5)
            L_0x00e9:
                o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4235dD.RatingCompat.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: o.dD$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<fromDataField.read> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        read(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            fromDataField.read read = (fromDataField.read) obj;
            read.read(this.MediaBrowserCompat$ItemReceiver, getOversizeImage.ERROR);
            read.read();
        }
    }

    /* renamed from: o.dD$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<resetMinMaxZoomPreference, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4235dD IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(C4235dD dDVar) {
            super(1);
            this.IconCompatParcelizer = dDVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final resetMinMaxZoomPreference resetminmaxzoompreference = (resetMinMaxZoomPreference) obj;
            onGetStartedClick.write((Object) resetminmaxzoompreference, "touchPointValidate");
            C4235dD dDVar = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<fromDataField.read>(this) {
                private /* synthetic */ write write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    fromDataField.read read = (fromDataField.read) obj;
                    read.aj_();
                    nullToEmpty read2 = this.write.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                    read2.MediaBrowserCompat$ItemReceiver.write(resetminmaxzoompreference.write);
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) C4235dD.IconCompatParcelizer(this.write.IconCompatParcelizer).read)) {
                        read.read(resetminmaxzoompreference.MediaBrowserCompat$CustomActionResultReceiver);
                    } else if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "0", (Object) C4235dD.IconCompatParcelizer(this.write.IconCompatParcelizer).read) || resetminmaxzoompreference.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        read.MediaBrowserCompat$CustomActionResultReceiver();
                    } else {
                        String str = resetminmaxzoompreference.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str != null) {
                            int hashCode = str.hashCode();
                            if (hashCode != 78) {
                                if (hashCode == 89 && str.equals("Y")) {
                                    read.MediaDescriptionCompat();
                                    return;
                                }
                            } else if (str.equals("N")) {
                                read.MediaMetadataCompat();
                                return;
                            }
                        }
                        read.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                }
            };
            if (dDVar.RatingCompat != null) {
                r1.IconCompatParcelizer(dDVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ C10839getFilename IconCompatParcelizer(C4235dD dDVar) {
        C10839getFilename getfilename = dDVar.IconCompatParcelizer;
        if (getfilename == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointCidInputDisplay");
        }
        return getfilename;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4235dD(constrainedAsMapEntries constrainedasmapentries, Resources resources, RegularImmutableBiMap regularImmutableBiMap, nullToEmpty nulltoempty, Iterables.C352212 r6) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) constrainedasmapentries, "controller");
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) nulltoempty, "allowNewRegistrationCase");
        onGetStartedClick.write((Object) r6, "ekycEntryPointCase");
        this.write = constrainedasmapentries;
        this.MediaBrowserCompat$ItemReceiver = resources;
        this.MediaBrowserCompat$SearchResultReceiver = nulltoempty;
        this.MediaBrowserCompat$MediaItem = r6;
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$ItemReceiver(RetrofitException retrofitException, String str, boolean z) {
        String str2;
        ILocationSourceDelegate.zza zza;
        ILocationSourceDelegate.zza zza2;
        setFilename setfilename = new setFilename();
        setfilename.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_ekyc_title);
        ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
        String str3 = null;
        if (iLocationSourceDelegate == null || (zza2 = iLocationSourceDelegate.write) == null) {
            str2 = null;
        } else {
            str2 = zza2.write;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = str4;
        }
        setfilename.MediaMetadataCompat = str2;
        ILocationSourceDelegate iLocationSourceDelegate2 = retrofitException.IconCompatParcelizer;
        if (!(iLocationSourceDelegate2 == null || (zza = iLocationSourceDelegate2.write) == null)) {
            str3 = zza.read;
        }
        if (str3 != null) {
            str4 = str3;
        }
        setfilename.IconCompatParcelizer = str4;
        setfilename.MediaBrowserCompat$CustomActionResultReceiver = str;
        boolean z2 = false;
        setfilename.MediaBrowserCompat$ItemReceiver = false;
        setfilename.read = false;
        writeUInt64NoTag.IconCompatParcelizer dd_mediabrowsercompat_customactionresultreceiver = new dD$MediaBrowserCompat$CustomActionResultReceiver(setfilename, z);
        if (this.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            dd_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4235dD dDVar, PlaceBuffer placeBuffer) {
        constrainedAsMapEntries constrainedasmapentries = dDVar.write;
        String str = dDVar.read;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pin");
        }
        String read2 = constrainedasmapentries.MediaBrowserCompat$CustomActionResultReceiver.read(str);
        if (read2 != null) {
            C10839getFilename getfilename = dDVar.IconCompatParcelizer;
            if (getfilename == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointCidInputDisplay");
            }
            String str2 = getfilename.MediaBrowserCompat$CustomActionResultReceiver;
            C10839getFilename getfilename2 = dDVar.IconCompatParcelizer;
            if (getfilename2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointCidInputDisplay");
            }
            String str3 = getfilename2.IconCompatParcelizer;
            String str4 = placeBuffer.read;
            onGetStartedClick.IconCompatParcelizer((Object) str4, "preAuthenticate.e2eeSid");
            hasSameComparator hassamecomparator = new hasSameComparator(str2, str3, read2, str4);
            constrainedAsMapEntries constrainedasmapentries2 = dDVar.write;
            FundFactSheetActivity write2 = new write(dDVar);
            FundFactSheetActivity ratingCompat = new RatingCompat(dDVar);
            onGetStartedClick.write((Object) write2, "onSuccess");
            onGetStartedClick.write((Object) ratingCompat, "onError");
            onGetStartedClick.write((Object) hassamecomparator, "request");
            constrainedasmapentries2.IconCompatParcelizer.IconCompatParcelizer(write2, ratingCompat, new createEntries.read(hassamecomparator), constrainedasmapentries2.MediaBrowserCompat$ItemReceiver);
            return;
        }
        dDVar.MediaDescriptionCompat((Throwable) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r5 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaDescriptionCompat(java.lang.Throwable r5) {
        /*
            r4 = this;
            T r0 = r4.RatingCompat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            T r0 = r4.RatingCompat
            r0.aj_()
        L_0x0010:
            if (r5 == 0) goto L_0x0023
            o.RegularImmutableBiMap r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2300$write r3 = p040o.access$2300.write.JUST_DISMISS
            o.access$2200 r5 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r5, (p040o.access$2300.write) r3)
            java.lang.String r0 = "errorDisplayMapper.transform(throwable)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r5 = r5.IconCompatParcelizer
            if (r5 != 0) goto L_0x0030
        L_0x0023:
            android.content.res.Resources r5 = r4.MediaBrowserCompat$ItemReceiver
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            java.lang.String r5 = r5.getString(r0)
            java.lang.String r0 = "resources.getString(R.st…g.error_generic_resource)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
        L_0x0030:
            o.dD$read r0 = new o.dD$read
            r0.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r5 = r4.RatingCompat
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            T r5 = r4.RatingCompat
            r0.IconCompatParcelizer(r5)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4235dD.MediaDescriptionCompat(java.lang.Throwable):void");
    }
}
