package p040o;

import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.activity.prepaid.C8902x24e4e8fb;
import java.util.Date;
import p040o.Barcode;
import p040o.ByteStreams;
import p040o.CheckExtractor;
import p040o.CustomConcurrentHashMap;
import p040o.access$2300;

/* renamed from: o.ch */
public class C4180ch extends writeUInt64NoTag<CheckExtractor.C63961> {
    public Boolean IconCompatParcelizer = Boolean.FALSE;
    public ch$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE;
    public String MediaBrowserCompat$MediaItem = "";
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2805x50fd9e4a = "";
    public final Barcode.Sms MediaDescriptionCompat;
    public PartnerLandingActivity.write MediaMetadataCompat;
    private final Barcode.Email MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String read;
    public Date write;

    @HmlPinActivity
    public C4180ch(Barcode.Email email, Barcode.Sms sms, newDataOutput newdataoutput, ByteStreams.C31331 r4) {
        super(newdataoutput);
        this.MediaSessionCompat$ResultReceiverWrapper = email;
        this.MediaDescriptionCompat = sms;
    }

    public final void write(CustomConcurrentHashMap.StrongExpirableEvictableEntry strongExpirableEvictableEntry) {
        if (this.IconCompatParcelizer.booleanValue()) {
            this.IconCompatParcelizer = Boolean.FALSE;
            int i = C41812.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$ItemReceiver.ordinal()];
            boolean z = false;
            boolean z2 = true;
            if (i == 1) {
                C9876ca caVar = C9876ca.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    caVar.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (i == 2) {
                getMemoryBitmapCache getmemorybitmapcache = new getMemoryBitmapCache(this);
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getmemorybitmapcache.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (i == 3) {
                getIsgDocumentDetector getisgdocumentdetector = new getIsgDocumentDetector(this, ByteStreams.C31331.read(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$SearchResultReceiver));
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getisgdocumentdetector.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (i == 4) {
                if (this.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(strongExpirableEvictableEntry);
                this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new read(this, (byte) 0));
            }
        }
    }

    /* renamed from: o.ch$2 */
    static /* synthetic */ class C41812 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.ch$MediaBrowserCompat$CustomActionResultReceiver[] r0 = p040o.ch$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.ch$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_ID_STATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.ch$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.ch$MediaBrowserCompat$CustomActionResultReceiver.SCANNING_PASSPORT_STATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.ch$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.ch$MediaBrowserCompat$CustomActionResultReceiver.LIVENESS_CHECK_STATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.ch$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.ch$MediaBrowserCompat$CustomActionResultReceiver.FINISHED_FLOW_STATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4180ch.C41812.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            o.RegularImmutableBiMap r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2 instanceof p040o.newDataOutput
            if (r2 == 0) goto L_0x01bf
            o.RegularImmutableBiMap r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.newDataOutput r2 = (p040o.newDataOutput) r2
            int[] r3 = p040o.C4180ch.C41812.MediaBrowserCompat$ItemReceiver
            o.ch$MediaBrowserCompat$CustomActionResultReceiver r4 = r0.MediaBrowserCompat$ItemReceiver
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r5 = -1
            java.lang.String r6 = "1005"
            java.lang.String r7 = "1004"
            java.lang.String r8 = "1003"
            java.lang.String r9 = "1002"
            java.lang.String r10 = "1001"
            r11 = 4
            r12 = 1
            r13 = 3
            r14 = 2
            if (r3 == r14) goto L_0x00d9
            if (r3 == r13) goto L_0x002e
            r1 = 0
            goto L_0x01ba
        L_0x002e:
            o.access$2200 r3 = new o.access$2200
            r3.<init>()
            int r15 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_default_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r15)
            int r15 = r17.hashCode()
            switch(r15) {
                case 1507424: goto L_0x0063;
                case 1507425: goto L_0x005b;
                case 1507426: goto L_0x0053;
                case 1507427: goto L_0x004b;
                case 1507428: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x006a
        L_0x0043:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x006a
            r5 = r11
            goto L_0x006a
        L_0x004b:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x006a
            r5 = r13
            goto L_0x006a
        L_0x0053:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x006a
            r5 = r14
            goto L_0x006a
        L_0x005b:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x006a
            r5 = r12
            goto L_0x006a
        L_0x0063:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x006a
            r5 = 0
        L_0x006a:
            if (r5 == 0) goto L_0x00b9
            if (r5 == r12) goto L_0x00b0
            if (r5 == r14) goto L_0x00a7
            if (r5 == r13) goto L_0x0096
            if (r5 == r11) goto L_0x0085
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_default_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_default_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x00c1
        L_0x0085:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1005_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1005_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x00c1
        L_0x0096:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1004_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1004_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x00c1
        L_0x00a7:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1003_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x00c1
        L_0x00b0:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1002_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x00c1
        L_0x00b9:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_liveness_1001_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
        L_0x00c1:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00c9
            r3.MediaBrowserCompat$ItemReceiver = r4
        L_0x00c9:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00d1
            r3.IconCompatParcelizer = r1
        L_0x00d1:
            o.access$2300 r1 = r2.IconCompatParcelizer()
            r3.MediaBrowserCompat$CustomActionResultReceiver = r1
            goto L_0x01b9
        L_0x00d9:
            o.access$2200 r3 = new o.access$2200
            r3.<init>()
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_default_title
            android.content.res.Resources r15 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r15.getString(r4)
            int r15 = r17.hashCode()
            switch(r15) {
                case 1507424: goto L_0x0111;
                case 1507425: goto L_0x0109;
                case 1507426: goto L_0x0101;
                case 1507427: goto L_0x00f9;
                case 1507428: goto L_0x00f1;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            switch(r15) {
                case 1537215: goto L_0x012d;
                case 1537216: goto L_0x0123;
                case 1537217: goto L_0x0119;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0137
        L_0x00f1:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0137
            r1 = r11
            goto L_0x0138
        L_0x00f9:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0137
            r1 = r13
            goto L_0x0138
        L_0x0101:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0137
            r1 = r14
            goto L_0x0138
        L_0x0109:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0137
            r1 = r12
            goto L_0x0138
        L_0x0111:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0137
            r1 = 0
            goto L_0x0138
        L_0x0119:
            java.lang.String r6 = "2003"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0137
            r1 = 7
            goto L_0x0138
        L_0x0123:
            java.lang.String r6 = "2002"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0137
            r1 = 6
            goto L_0x0138
        L_0x012d:
            java.lang.String r6 = "2001"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0137
            r1 = 5
            goto L_0x0138
        L_0x0137:
            r1 = r5
        L_0x0138:
            switch(r1) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0192;
                case 2: goto L_0x0189;
                case 3: goto L_0x0180;
                case 4: goto L_0x0177;
                case 5: goto L_0x0166;
                case 6: goto L_0x0155;
                case 7: goto L_0x014c;
                default: goto L_0x013b;
            }
        L_0x013b:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_default_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_default_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x014c:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_2003_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0155:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_2002_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_2002_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0166:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_2001_title
            android.content.res.Resources r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getString(r1)
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_2001_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0177:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1005_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0180:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1004_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0189:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1003_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x0192:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1002_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            goto L_0x01a3
        L_0x019b:
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1001_text
            android.content.res.Resources r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
        L_0x01a3:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x01ab
            r3.MediaBrowserCompat$ItemReceiver = r4
        L_0x01ab:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x01b3
            r3.IconCompatParcelizer = r1
        L_0x01b3:
            o.access$2300 r1 = r2.IconCompatParcelizer()
            r3.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x01b9:
            r1 = r3
        L_0x01ba:
            if (r1 == 0) goto L_0x01bf
            r0.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r1)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4180ch.IconCompatParcelizer(java.lang.String):void");
    }

    /* renamed from: o.ch$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<C8902x24e4e8fb> {
        private read() {
        }

        /* synthetic */ read(C4180ch chVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C8902x24e4e8fb prepaidTravelTopupLandingActivity$MediaBrowserCompat$ItemReceiver = (C8902x24e4e8fb) obj;
            boolean z = true;
            if (prepaidTravelTopupLandingActivity$MediaBrowserCompat$ItemReceiver.read.equalsIgnoreCase("EXISTS")) {
                C4180ch chVar = C4180ch.this;
                getGpuDocumentDetector getgpudocumentdetector = getGpuDocumentDetector.write;
                if (chVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getgpudocumentdetector.IconCompatParcelizer(chVar.RatingCompat);
                }
            } else if (prepaidTravelTopupLandingActivity$MediaBrowserCompat$ItemReceiver.read.equalsIgnoreCase("DOPA")) {
                C4180ch chVar2 = C4180ch.this;
                C9865bK bKVar = C9865bK.MediaBrowserCompat$CustomActionResultReceiver;
                if (chVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bKVar.IconCompatParcelizer(chVar2.RatingCompat);
                }
            } else {
                C4180ch chVar3 = C4180ch.this;
                C9875cV cVVar = C9875cV.MediaBrowserCompat$CustomActionResultReceiver;
                if (chVar3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cVVar.IconCompatParcelizer(chVar3.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            C4180ch.MediaBrowserCompat$CustomActionResultReceiver(C4180ch.this);
        }

        public final void onError(Throwable th) {
            C4180ch.this.MediaBrowserCompat$ItemReceiver(C4180ch.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            C4180ch.IconCompatParcelizer(C4180ch.this);
            Boolean unused = C4180ch.this.IconCompatParcelizer = Boolean.TRUE;
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4180ch chVar) {
        if (chVar.RatingCompat != null) {
            chVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4180ch chVar) {
        if (chVar.RatingCompat != null) {
            chVar.RatingCompat.aj_();
        }
    }
}
