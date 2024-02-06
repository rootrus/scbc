package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import p040o.C10827Iterators;
import p040o.CameraSource;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.CustomConcurrentHashMap;
import p040o.Detector;
import p040o.GiftingBaseListAdapter$GiftViewHolder;
import p040o.ILocationSourceDelegate;
import p040o.Iterables;
import p040o.LinkedHashMultimap;
import p040o.Multisets;
import p040o.access$2300;
import p040o.getLegacySharedPrefs;
import p040o.setNextExpirable;
import p040o.writeUInt64NoTag;
import p040o.zzcb;

/* renamed from: o.Image */
public final /* synthetic */ class Image implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ Image MediaBrowserCompat$ItemReceiver = new Image();

    /* renamed from: o.Image$ImageFileRep */
    public final /* synthetic */ class ImageFileRep implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ ImageFileRep MediaBrowserCompat$CustomActionResultReceiver = new ImageFileRep();

        private /* synthetic */ ImageFileRep() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.Image$KenBitmap */
    public final /* synthetic */ class KenBitmap implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ KenBitmap IconCompatParcelizer = new KenBitmap();

        private /* synthetic */ KenBitmap() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).write();
        }
    }

    private /* synthetic */ Image() {
    }

    public final void IconCompatParcelizer(Object obj) {
        clearBitmapWithoutRecycle.MediaBrowserCompat$ItemReceiver((CheckExtractActivity_MembersInjector.setShortcut.read) obj);
    }

    /* renamed from: o.Image$a */
    public class C3461a extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.ActionMenuItemView> {
        @HmlPinActivity
        public C3461a(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
        }
    }

    /* renamed from: o.Image$BitmapDataObject */
    public final class BitmapDataObject extends writeUInt64NoTag<CreditCard> {
        public CustomConcurrentHashMap.NullEntry IconCompatParcelizer;
        /* access modifiers changed from: private */
        public final checkExpiration MediaBrowserCompat$ItemReceiver;
        public final LinkedHashMultimap.C35651 read;
        /* access modifiers changed from: private */
        public List<zzcb.zzd> write = HmlNationalIdActivity.IconCompatParcelizer;

        /* renamed from: o.Image$BitmapDataObject$read */
        static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCard> {
            private /* synthetic */ BitmapDataObject write;

            read(BitmapDataObject bitmapDataObject) {
                this.write = bitmapDataObject;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
                if ((!p040o.GoodToKnowActivity.read(r0.MediaDescriptionCompat)) != false) goto L_0x0081;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r6) {
                /*
                    r5 = this;
                    o.CreditCard r6 = (p040o.CreditCard) r6
                    o.Image$BitmapDataObject r0 = r5.write
                    o.CustomConcurrentHashMap$NullEntry r0 = p040o.Image.BitmapDataObject.read((p040o.Image.BitmapDataObject) r0)
                    java.lang.String r1 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r2 = 1
                    r1 = r1 ^ r2
                    r3 = 0
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = r0.write
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = r0.IconCompatParcelizer
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = r0.read
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = r0.MediaBrowserCompat$SearchResultReceiver
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = r0.RatingCompat
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L_0x0080
                    o.CustomConcurrentHashMap$EntryFactory$1 r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r4 = r1.MediaBrowserCompat$ItemReceiver
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    boolean r4 = p040o.GoodToKnowActivity.read(r4)
                    r4 = r4 ^ r2
                    if (r4 == 0) goto L_0x0072
                    java.lang.String r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    boolean r4 = p040o.GoodToKnowActivity.read(r4)
                    r4 = r4 ^ r2
                    if (r4 == 0) goto L_0x0072
                    java.lang.String r1 = r1.IconCompatParcelizer
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = p040o.GoodToKnowActivity.read(r1)
                    r1 = r1 ^ r2
                    if (r1 != 0) goto L_0x0070
                    goto L_0x0072
                L_0x0070:
                    r1 = r2
                    goto L_0x0073
                L_0x0072:
                    r1 = r3
                L_0x0073:
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r0 = r0.MediaDescriptionCompat
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    boolean r0 = p040o.GoodToKnowActivity.read(r0)
                    r0 = r0 ^ r2
                    if (r0 != 0) goto L_0x0081
                L_0x0080:
                    r2 = r3
                L_0x0081:
                    r6.write((boolean) r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.Image.BitmapDataObject.read.IconCompatParcelizer(java.lang.Object):void");
            }
        }

        /* renamed from: o.Image$BitmapDataObject$write */
        public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
            private /* synthetic */ BitmapDataObject write;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public write(BitmapDataObject bitmapDataObject) {
                super(1);
                this.write = bitmapDataObject;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                onGetStartedClick.write((Object) th, "throwable");
                this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }

        /* renamed from: o.Image$BitmapDataObject$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCard> {
            public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

            IconCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((CreditCard) obj).AlertController$RecycleListView();
            }
        }

        /* renamed from: o.Image$BitmapDataObject$MediaMetadataCompat */
        public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder, HmlVerifyPhoneValidateOtpActivity> {
            private /* synthetic */ BitmapDataObject write;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MediaMetadataCompat(BitmapDataObject bitmapDataObject) {
                super(1);
                this.write = bitmapDataObject;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                final RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder = (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder) obj;
                onGetStartedClick.write((Object) riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder, "it");
                BitmapDataObject bitmapDataObject = this.write;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCard>() {
                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        CreditCard creditCard = (CreditCard) obj;
                        creditCard.aj_();
                        creditCard.write(riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.IconCompatParcelizer);
                    }
                };
                if (bitmapDataObject.RatingCompat != null) {
                    r1.IconCompatParcelizer(bitmapDataObject.RatingCompat);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }

        public static final /* synthetic */ CustomConcurrentHashMap.NullEntry read(BitmapDataObject bitmapDataObject) {
            CustomConcurrentHashMap.NullEntry nullEntry = bitmapDataObject.IconCompatParcelizer;
            if (nullEntry == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
            }
            return nullEntry;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public BitmapDataObject(RegularImmutableBiMap regularImmutableBiMap, LinkedHashMultimap.C35651 r3, checkExpiration checkexpiration) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            onGetStartedClick.write((Object) r3, "easycashMCMCDetailController");
            onGetStartedClick.write((Object) checkexpiration, "addressMapper");
            this.read = r3;
            this.MediaBrowserCompat$ItemReceiver = checkexpiration;
        }

        /* access modifiers changed from: private */
        public static List<String> MediaBrowserCompat$ItemReceiver(String str) {
            ArrayList arrayList = new ArrayList();
            try {
                int i = Calendar.getInstance().get(1);
                int parseInt = Integer.parseInt(str);
                if (i >= parseInt) {
                    while (true) {
                        arrayList.add(String.valueOf(i));
                        if (i == parseInt) {
                            break;
                        }
                        i--;
                    }
                }
                return arrayList;
            } catch (NumberFormatException unused) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
        }

        public final void read(String str) {
            onGetStartedClick.write((Object) str, "plate");
            CustomConcurrentHashMap.NullEntry nullEntry = this.IconCompatParcelizer;
            if (nullEntry == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
            }
            CustomConcurrentHashMap.EntryFactory.C32861 r0 = nullEntry.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str, "<set-?>");
            r0.MediaBrowserCompat$ItemReceiver = str;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
            if (this.RatingCompat != null) {
                read2.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void IconCompatParcelizer(String str) {
            onGetStartedClick.write((Object) str, "year");
            CustomConcurrentHashMap.NullEntry nullEntry = this.IconCompatParcelizer;
            if (nullEntry == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
            }
            onGetStartedClick.write((Object) str, "<set-?>");
            nullEntry.MediaDescriptionCompat = str;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
            if (this.RatingCompat != null) {
                read2.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void read(int i) {
            String str;
            String str2;
            CustomConcurrentHashMap.NullEntry nullEntry = this.IconCompatParcelizer;
            if (nullEntry == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
            }
            CustomConcurrentHashMap.EntryFactory.C32861 r0 = nullEntry.MediaBrowserCompat$CustomActionResultReceiver;
            zzcb.zzd zzd = (zzcb.zzd) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write, i);
            String str3 = "";
            if (zzd == null || (str = zzd.write) == null) {
                str = str3;
            }
            onGetStartedClick.write((Object) str, "<set-?>");
            r0.MediaBrowserCompat$CustomActionResultReceiver = str;
            if (!(zzd == null || (str2 = zzd.read) == null)) {
                str3 = str2;
            }
            onGetStartedClick.write((Object) str3, "<set-?>");
            r0.IconCompatParcelizer = str3;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
            if (this.RatingCompat != null) {
                read2.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(BitmapDataObject bitmapDataObject) {
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(bitmapDataObject);
            if (bitmapDataObject.RatingCompat != null) {
                read2.IconCompatParcelizer(bitmapDataObject.RatingCompat);
            }
        }

        public static final /* synthetic */ CustomConcurrentHashMap.NullEntry MediaBrowserCompat$ItemReceiver(BitmapDataObject bitmapDataObject, ignoreResult ignoreresult) {
            CustomConcurrentHashMap.NullEntry nullEntry = bitmapDataObject.IconCompatParcelizer;
            if (nullEntry == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
            }
            String str = ignoreresult.write;
            onGetStartedClick.write((Object) str, "<set-?>");
            nullEntry.IconCompatParcelizer = str;
            String str2 = ignoreresult.IconCompatParcelizer;
            onGetStartedClick.write((Object) str2, "<set-?>");
            nullEntry.read = str2;
            String str3 = ignoreresult.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) str3, "<set-?>");
            nullEntry.MediaBrowserCompat$SearchResultReceiver = str3;
            String str4 = ignoreresult.MediaMetadataCompat;
            onGetStartedClick.write((Object) str4, "<set-?>");
            nullEntry.RatingCompat = str4;
            CustomConcurrentHashMap.EntryFactory.C32861 r4 = new CustomConcurrentHashMap.EntryFactory.C32861(ignoreresult.read, ignoreresult.MediaBrowserCompat$SearchResultReceiver, ignoreresult.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.write((Object) r4, "<set-?>");
            nullEntry.MediaBrowserCompat$CustomActionResultReceiver = r4;
            String str5 = ignoreresult.RatingCompat;
            onGetStartedClick.write((Object) str5, "<set-?>");
            nullEntry.MediaDescriptionCompat = str5;
            return nullEntry;
        }
    }

    /* renamed from: o.Image$FileRestriction */
    public final class FileRestriction extends setImageFilePath<CheckExtractActivity_MembersInjector.setForceShowIcon> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public FileRestriction(RegularImmutableBiMap regularImmutableBiMap, isStrictlyOrdered isstrictlyordered, detectorIsOperational detectorisoperational, Iterables.ConsumingQueueIterator consumingQueueIterator) {
            super(regularImmutableBiMap, isstrictlyordered, detectorisoperational, consumingQueueIterator);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            onGetStartedClick.write((Object) isstrictlyordered, "receivingAccountSourceMapper");
            onGetStartedClick.write((Object) detectorisoperational, "easycashLoanOffersCase");
            onGetStartedClick.write((Object) consumingQueueIterator, "operativeAccountController");
        }

        public final void read(GiftingBaseListAdapter$GiftViewHolder.IconCompatParcelizer iconCompatParcelizer) {
            onGetStartedClick.write((Object) iconCompatParcelizer, "easycashOperativeAccount");
            super.read(iconCompatParcelizer);
            List<QuickAccountSelectAdapter$FooterHolder> MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.read, "LENDING_TARGET");
            boolean z = true;
            if (!MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                writeUInt64NoTag.IconCompatParcelizer image$FileRestriction$MediaBrowserCompat$ItemReceiver = new Image$FileRestriction$MediaBrowserCompat$ItemReceiver(this, MediaBrowserCompat$CustomActionResultReceiver);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    image$FileRestriction$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    /* renamed from: o.Image$OutputColor */
    public final class OutputColor extends getChannels<CheckExtractActivity_MembersInjector.MediaMetadataCompat> {
        public getExecutor MediaBrowserCompat$MediaItem;
        private final CameraSource.ShutterCallback MediaBrowserCompat$SearchResultReceiver;
        final quicksortLeastK MediaDescriptionCompat;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public OutputColor(RegularImmutableBiMap regularImmutableBiMap, Multisets.UnmodifiableMultiset unmodifiableMultiset, setMaxGapFrames setmaxgapframes, setRequestedFps setrequestedfps, CameraSource.ShutterCallback shutterCallback, quicksortLeastK quicksortleastk, toLongArray tolongarray) {
            super(regularImmutableBiMap, unmodifiableMultiset, setmaxgapframes, setrequestedfps, tolongarray);
            onGetStartedClick.write((Object) unmodifiableMultiset, "easycashContactInformationDisplayMapper");
            onGetStartedClick.write((Object) setmaxgapframes, "termsAndConditionsCase");
            onGetStartedClick.write((Object) setrequestedfps, "easycashNCBCase");
            onGetStartedClick.write((Object) shutterCallback, "easycashConfirmReferralCase");
            onGetStartedClick.write((Object) quicksortleastk, "easycashSuccessDisplayMapper");
            onGetStartedClick.write((Object) tolongarray, "mTermsAndConsMapper");
            this.MediaBrowserCompat$SearchResultReceiver = shutterCallback;
            this.MediaDescriptionCompat = quicksortleastk;
        }

        /* renamed from: o.Image$OutputColor$write */
        final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<performAction> {

            /* renamed from: o.Image$OutputColor$write$IconCompatParcelizer */
            static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.MediaMetadataCompat> {
                private /* synthetic */ write write;

                IconCompatParcelizer(write write2) {
                    this.write = write2;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((CheckExtractActivity_MembersInjector.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(OutputColor.this.MediaDescriptionCompat.IconCompatParcelizer());
                }
            }

            public write() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                performAction performaction = (performAction) obj;
                onGetStartedClick.write((Object) performaction, "easycashReferralConfirmation");
                OutputColor.IconCompatParcelizer(OutputColor.this);
                if (performaction.MediaBrowserCompat$CustomActionResultReceiver) {
                    OutputColor outputColor = OutputColor.this;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
                    if (outputColor.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(outputColor.RatingCompat);
                    }
                }
            }

            public final void onError(Throwable th) {
                String str;
                onGetStartedClick.write((Object) th, "e");
                if (th instanceof RetrofitException) {
                    ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "e.response");
                    ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                    onGetStartedClick.IconCompatParcelizer((Object) zza, "e.response.error");
                    str = zza.IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "e.response.error.code");
                } else {
                    str = "";
                }
                boolean z = true;
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("3013", str, true)) {
                    OutputColor.this.MediaBrowserCompat$ItemReceiver(OutputColor.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                } else if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("9200", str, true)) {
                    OutputColor outputColor = OutputColor.this;
                    writeUInt64NoTag.IconCompatParcelizer image$OutputColor$write$MediaBrowserCompat$ItemReceiver = new Image$OutputColor$write$MediaBrowserCompat$ItemReceiver(this);
                    if (outputColor.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        image$OutputColor$write$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(outputColor.RatingCompat);
                    }
                } else {
                    OutputColor.this.MediaBrowserCompat$ItemReceiver(OutputColor.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C3466x40f485e1(this)));
                }
            }
        }

        public final void onDestroy() {
            CameraSource.ShutterCallback shutterCallback = this.MediaBrowserCompat$SearchResultReceiver;
            if (!shutterCallback.MediaBrowserCompat$MediaItem.isDisposed()) {
                shutterCallback.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        public static final /* synthetic */ void IconCompatParcelizer(OutputColor outputColor) {
            if (outputColor.RatingCompat != null) {
                outputColor.RatingCompat.aj_();
            }
        }

        public final void read() {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            CameraSource.ShutterCallback shutterCallback = this.MediaBrowserCompat$SearchResultReceiver;
            setNextExpirable.write write2 = new setNextExpirable.write();
            String str = this.read;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
            }
            write2.ParcelableVolumeInfo = str;
            getExecutor getexecutor = this.MediaBrowserCompat$MediaItem;
            if (getexecutor == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.MediaBrowserCompat$ItemReceiver = getexecutor.IconCompatParcelizer;
            getExecutor getexecutor2 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.read = getexecutor2.read;
            getExecutor getexecutor3 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.MediaBrowserCompat$SearchResultReceiver = getexecutor3.MediaMetadataCompat;
            getExecutor getexecutor4 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.MediaMetadataCompat = getexecutor4.RatingCompat;
            getExecutor getexecutor5 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.RatingCompat = getexecutor5.MediaDescriptionCompat;
            getExecutor getexecutor6 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.MediaDescriptionCompat = getexecutor6.MediaBrowserCompat$CustomActionResultReceiver;
            getExecutor getexecutor7 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.MediaBrowserCompat$MediaItem = getexecutor7.MediaBrowserCompat$SearchResultReceiver;
            getExecutor getexecutor8 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.write = getexecutor8.MediaBrowserCompat$ItemReceiver;
            getExecutor getexecutor9 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.IconCompatParcelizer = getexecutor9.write;
            write2.MediaBrowserCompat$CustomActionResultReceiver = new CustomConcurrentHashMap.EntryFactory.C32902(new CustomConcurrentHashMap.EntryFactory.C32902.write(), (byte) 0);
            getExecutor getexecutor10 = this.MediaBrowserCompat$MediaItem;
            if (getexecutor10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmationDisplay");
            }
            write2.f2952x50fd9e4a = getexecutor10.MediaBrowserCompat$MediaItem;
            shutterCallback.MediaBrowserCompat$CustomActionResultReceiver(new setNextExpirable(write2, (byte) 0));
            this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new write());
        }
    }

    /* renamed from: o.Image$b */
    public class C3462b extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setExpandedFormat> {
        /* access modifiers changed from: private */
        public final toLongArray MediaBrowserCompat$ItemReceiver;
        public final setMaxGapFrames read;

        @HmlPinActivity
        public C3462b(setMaxGapFrames setmaxgapframes, isOrdered isordered, RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
            super(regularImmutableBiMap);
            this.read = setmaxgapframes;
            this.MediaBrowserCompat$ItemReceiver = tolongarray;
        }

        static /* synthetic */ void write(C3462b bVar) {
            if (bVar.RatingCompat != null) {
                bVar.RatingCompat.aj_();
            }
        }
    }

    /* renamed from: o.Image$FileIOEngine */
    public class FileIOEngine extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setPopupCallback> {
        Double IconCompatParcelizer = Double.valueOf(0.0d);
        public LinkedHashMultimap.SetDecorator MediaBrowserCompat$ItemReceiver;
        public nextInChain MediaDescriptionCompat;
        public List<generateEventId> read;
        public Detector.Processor write;

        @HmlPinActivity
        public FileIOEngine(RegularImmutableBiMap regularImmutableBiMap, Detector.Processor processor, LinkedHashMultimap.SetDecorator setDecorator) {
            super(regularImmutableBiMap);
            this.write = processor;
            this.MediaBrowserCompat$ItemReceiver = setDecorator;
        }

        public final void read(String str) {
            nextInChain nextinchain = this.MediaDescriptionCompat;
            onGetStartedClick.write((Object) str, "<set-?>");
            nextinchain.MediaBrowserCompat$CustomActionResultReceiver = str;
            DetectionResult detectionResult = new DetectionResult(this);
            if (this.RatingCompat != null) {
                detectionResult.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(String str) {
            nextInChain nextinchain = this.MediaDescriptionCompat;
            onGetStartedClick.write((Object) str, "<set-?>");
            nextinchain.MediaBrowserCompat$SearchResultReceiver = str;
            DetectionResult detectionResult = new DetectionResult(this);
            if (this.RatingCompat != null) {
                detectionResult.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            CustomConcurrentHashMap.HashIterator hashIterator = this.MediaDescriptionCompat.IconCompatParcelizer;
            onGetStartedClick.write((Object) str, "<set-?>");
            hashIterator.read = str;
            DetectionResult detectionResult = new DetectionResult(this);
            if (this.RatingCompat != null) {
                detectionResult.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void write(String str) {
            CustomConcurrentHashMap.HashIterator hashIterator = this.MediaDescriptionCompat.IconCompatParcelizer;
            onGetStartedClick.write((Object) str, "<set-?>");
            hashIterator.MediaBrowserCompat$CustomActionResultReceiver = str;
            DetectionResult detectionResult = new DetectionResult(this);
            if (this.RatingCompat != null) {
                detectionResult.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void IconCompatParcelizer(String str) {
            String replaceAll = str.replaceAll(",", "");
            nextInChain nextinchain = this.MediaDescriptionCompat;
            onGetStartedClick.write((Object) replaceAll, "<set-?>");
            nextinchain.read = replaceAll;
            DetectionResult detectionResult = new DetectionResult(this);
            if (this.RatingCompat != null) {
                detectionResult.IconCompatParcelizer(this.RatingCompat);
            }
        }

        static String MediaBrowserCompat$CustomActionResultReceiver(zzwk zzwk) {
            StringBuilder sb = new StringBuilder(zzwk.MediaBrowserCompat$ItemReceiver);
            sb.append(" ");
            sb.append(zzwk.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("\n");
            sb.append(zzwk.write);
            sb.append(" ");
            sb.append(zzwk.read);
            return sb.toString();
        }
    }

    /* renamed from: o.Image$FriendI */
    public class FriendI extends writeUInt64NoTag<C6395xeeeefe7> {
        public final C10827Iterators.C35478 IconCompatParcelizer;
        public final C10827Iterators.C35467 MediaBrowserCompat$ItemReceiver;
        public doOnboarding MediaDescriptionCompat;
        private final unmodifiableMultiset MediaMetadataCompat;
        List<doOnboarding> read;
        final Multisets.C36841 write;

        @HmlPinActivity
        public FriendI(RegularImmutableBiMap regularImmutableBiMap, Multisets.C36841 r2, greatestOf greatestof, unmodifiableMultiset unmodifiablemultiset, C10827Iterators.C35478 r5, C10827Iterators.C35467 r6) {
            super(regularImmutableBiMap);
            this.write = r2;
            this.MediaMetadataCompat = unmodifiablemultiset;
            this.IconCompatParcelizer = r5;
            this.MediaBrowserCompat$ItemReceiver = r6;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            boolean z = true;
            if (this.read.size() > i) {
                doOnboarding doonboarding = this.read.get(i);
                this.MediaDescriptionCompat = doonboarding;
                getOriginalImage getoriginalimage = new getOriginalImage(this, doonboarding);
                if (this.RatingCompat != null) {
                    getoriginalimage.IconCompatParcelizer(this.RatingCompat);
                }
            }
            setCenterPoint setcenterpoint = new setCenterPoint(i);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setcenterpoint.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(double d) {
            CrashlyticsBackgroundWorker.C32164 r5;
            for (onPreExecute next : this.MediaDescriptionCompat.MediaDescriptionCompat) {
                if (d >= next.write.doubleValue() && d <= next.MediaBrowserCompat$CustomActionResultReceiver.doubleValue()) {
                    unmodifiableMultiset unmodifiablemultiset = this.MediaMetadataCompat;
                    boolean z = true;
                    if (next.read == null || next.read.isEmpty()) {
                        CrashlyticsBackgroundWorker.C32164.read read2 = new CrashlyticsBackgroundWorker.C32164.read();
                        read2.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
                        read2.write = false;
                        r5 = read2.MediaBrowserCompat$CustomActionResultReceiver();
                    } else {
                        List<RestrictedComponentContainer> MediaBrowserCompat$ItemReceiver2 = unmodifiableMultiset.MediaBrowserCompat$ItemReceiver(next.read, new findFragmentByWho() {
                            public final Object IconCompatParcelizer(Object obj) {
                                unmodifiableMultiset unmodifiablemultiset = unmodifiableMultiset.this;
                                performCreateApp performcreateapp = (performCreateApp) obj;
                                if (performcreateapp.MediaDescriptionCompat == null || performcreateapp.write == null) {
                                    return null;
                                }
                                if ("REMARK".equals(performcreateapp.MediaBrowserCompat$CustomActionResultReceiver)) {
                                    return new RestrictedComponentContainer(performcreateapp.MediaBrowserCompat$ItemReceiver, (List<C3758xd990f62c>) Collections.singletonList(new C3758xd990f62c(performcreateapp.MediaDescriptionCompat, unmodifiablemultiset.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.dark_gray))));
                                }
                                return new RestrictedComponentContainer(performcreateapp.MediaBrowserCompat$ItemReceiver, performcreateapp.MediaDescriptionCompat);
                            }
                        });
                        CrashlyticsBackgroundWorker.C32164.read read3 = new CrashlyticsBackgroundWorker.C32164.read();
                        read3.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2;
                        read3.write = true;
                        r5 = read3.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    if (r5.write) {
                        getToleranceFraction gettolerancefraction = new getToleranceFraction(r5);
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            gettolerancefraction.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }

        static getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs) {
            getLegacySharedPrefs.IconCompatParcelizer iconCompatParcelizer = new getLegacySharedPrefs.IconCompatParcelizer();
            iconCompatParcelizer.RatingCompat = "REFERRAL_UNSECURED";
            iconCompatParcelizer.read = getlegacysharedprefs.read;
            getLegacySharedPrefs.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
            iconCompatParcelizer2.MediaDescriptionCompat = getlegacysharedprefs.MediaDescriptionCompat;
            getLegacySharedPrefs.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer2;
            iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs.MediaBrowserCompat$MediaItem;
            getLegacySharedPrefs.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer3;
            iconCompatParcelizer4.write = getlegacysharedprefs.IconCompatParcelizer;
            getLegacySharedPrefs.IconCompatParcelizer iconCompatParcelizer5 = iconCompatParcelizer4;
            iconCompatParcelizer5.MediaMetadataCompat = getlegacysharedprefs.MediaBrowserCompat$SearchResultReceiver;
            iconCompatParcelizer5.f2839x50fd9e4a = getlegacysharedprefs.MediaSessionCompat$Token;
            iconCompatParcelizer5.MediaBrowserCompat$ItemReceiver = getlegacysharedprefs.MediaBrowserCompat$CustomActionResultReceiver;
            iconCompatParcelizer5.IconCompatParcelizer = getlegacysharedprefs.MediaBrowserCompat$ItemReceiver;
            iconCompatParcelizer5.MediaBrowserCompat$MediaItem = getlegacysharedprefs.RatingCompat;
            iconCompatParcelizer5.ParcelableVolumeInfo = getlegacysharedprefs.MediaSessionCompat$ResultReceiverWrapper;
            iconCompatParcelizer5.MediaSessionCompat$QueueItem = getlegacysharedprefs.MediaSessionCompat$QueueItem;
            return new getLegacySharedPrefs(iconCompatParcelizer5, (byte) 0);
        }

        public void onDestroy() {
            this.MediaDescriptionCompat = null;
            this.read = null;
            this.IconCompatParcelizer.IconCompatParcelizer();
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            super.onDestroy();
        }
    }

    /* renamed from: o.Image$ImageRep */
    public final /* synthetic */ class ImageRep implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getBitsPerChannel read;

        public /* synthetic */ ImageRep(getBitsPerChannel getbitsperchannel) {
            this.read = getbitsperchannel;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.MenuItemImpl) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.Image$ImageMimeType */
    public final /* synthetic */ class ImageMimeType implements Runnable {
        private final /* synthetic */ getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

        public /* synthetic */ ImageMimeType(getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver getbitsperchannel_mediabrowsercompat_customactionresultreceiver) {
            this.IconCompatParcelizer = getbitsperchannel_mediabrowsercompat_customactionresultreceiver;
        }

        public final void run() {
            getBitsPerChannel getbitsperchannel = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            setImageLongitude setimagelongitude = setImageLongitude.write;
            if (getbitsperchannel.RatingCompat != null) {
                setimagelongitude.IconCompatParcelizer(getbitsperchannel.RatingCompat);
            }
        }
    }
}
