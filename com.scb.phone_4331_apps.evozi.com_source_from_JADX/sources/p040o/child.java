package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.SignedBytes;

/* renamed from: o.child */
public final class child extends SignedBytes.LexicographicalComparator {
    public read MediaBrowserCompat$ItemReceiver = read.TRANSFER;
    private getEulerY read;

    /* renamed from: o.child$read */
    public enum read {
        TOPUP,
        TRANSFER,
        BILLPAYMENT
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public child(Resources resources, SharedPreferences sharedPreferences, getEulerY geteulery, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) geteulery, "getUserProfileUseCase");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.read = geteulery;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r9 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r9 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if (r8 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017f, code lost:
        if (r0 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0188, code lost:
        if (r10.equals("OWN") != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        if (r10.equals("3RD") != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a3, code lost:
        if (r0 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a6, code lost:
        r0 = r27;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.C3080xc2f5febc.Builder read(p040o.GoogleMapOptions r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.String r2 = "domain"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            int r4 = r1.MediaBrowserCompat$ItemReceiver
            boolean r5 = r1.IconCompatParcelizer
            java.lang.Integer r2 = r1.read
            if (r2 == 0) goto L_0x0017
            int r2 = r2.intValue()
            r7 = r2
            goto L_0x0018
        L_0x0017:
            r7 = 0
        L_0x0018:
            java.lang.String r6 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.util.List<o.compassEnabled> r1 = r1.write
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 10
            java.lang.String r9 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r9)
            boolean r9 = r1 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0032
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
        L_0x0032:
            r2.<init>(r8)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x01c6
            java.lang.Object r8 = r1.next()
            o.compassEnabled r8 = (p040o.compassEnabled) r8
            java.lang.Integer r9 = r8.MediaSessionCompat$Token
            if (r9 == 0) goto L_0x0051
            int r9 = r9.intValue()
            r11 = r9
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            java.lang.String r14 = r8.MediaSessionCompat$ResultReceiverWrapper
            o.child$read r9 = r0.MediaBrowserCompat$ItemReceiver
            int[] r10 = p040o.validatePart.write
            int r9 = r9.ordinal()
            r9 = r10[r9]
            r10 = 3
            r12 = 2
            r13 = 1
            java.lang.String r15 = ""
            if (r9 == r13) goto L_0x0079
            if (r9 == r12) goto L_0x0074
            if (r9 != r10) goto L_0x006e
            java.lang.String r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x008d
            goto L_0x008e
        L_0x006e:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0074:
            java.lang.String r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x008d
            goto L_0x008e
        L_0x0079:
            java.lang.String r9 = r8.MediaDescriptionCompat
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0088
            java.lang.String r9 = r8.MediaMetadataCompat
            if (r9 == 0) goto L_0x008d
            goto L_0x008e
        L_0x0088:
            java.lang.String r9 = r8.read
            if (r9 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r9 = r15
        L_0x008e:
            java.lang.String r10 = r8.read
            if (r10 != 0) goto L_0x0095
            r16 = r15
            goto L_0x0097
        L_0x0095:
            r16 = r10
        L_0x0097:
            java.lang.String r10 = r8.IconCompatParcelizer
            java.lang.String r12 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.String r18 = r0.mo26549c_(r12)
            java.lang.String r12 = r8.write
            java.lang.Double r12 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r12)
            java.lang.String r19 = write((java.lang.Double) r12)
            boolean r12 = r8.f2809x50fd9e4a
            boolean r13 = r8.MediaBrowserCompat$MediaItem
            java.lang.String r3 = r8.ParcelableVolumeInfo
            r24 = r1
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss"
            r21 = r10
            java.lang.String r10 = "dd MMM - HH:mm"
            r22 = r12
            r12 = 0
            java.lang.String r1 = p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(r3, r1, r10, r12)
            java.lang.String r3 = r8.MediaBrowserCompat$SearchResultReceiver
            if (r3 == 0) goto L_0x00c4
            r12 = r3
            goto L_0x00c5
        L_0x00c4:
            r12 = r15
        L_0x00c5:
            o.camera r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 != 0) goto L_0x00cd
            r25 = r13
            r3 = 0
            goto L_0x00dd
        L_0x00cd:
            java.lang.String r10 = r3.MediaBrowserCompat$ItemReceiver
            java.lang.String r10 = r0.mo26549c_(r10)
            java.lang.String r3 = r3.IconCompatParcelizer
            r25 = r13
            o.getCausedBy r13 = new o.getCausedBy
            r13.<init>(r10, r3)
            r3 = r13
        L_0x00dd:
            o.child$read r10 = r0.MediaBrowserCompat$ItemReceiver
            int[] r13 = p040o.validatePart.read
            int r10 = r10.ordinal()
            r10 = r13[r10]
            r13 = 1
            if (r10 == r13) goto L_0x0122
            r13 = 2
            if (r10 == r13) goto L_0x00fb
            r13 = 3
            if (r10 != r13) goto L_0x00f5
            java.lang.String r8 = r8.RatingCompat
            if (r8 != 0) goto L_0x011c
            goto L_0x011d
        L_0x00f5:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x00fb:
            java.lang.String r10 = r8.MediaSessionCompat$QueueItem
            java.lang.String r13 = "PREPAID"
            r27 = r15
            r15 = 1
            boolean r10 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r13, r10, r15)
            if (r10 == 0) goto L_0x0115
            java.lang.String r8 = r8.MediaSessionCompat$ResultReceiverWrapper
            r10 = 0
            java.lang.String r15 = p040o.getICheckDeserializerRtti.IconCompatParcelizer(r8, r10)
            java.lang.String r8 = "Utilities.maskCreditCard…main.serviceNumber, null)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r15, (java.lang.String) r8)
            goto L_0x011d
        L_0x0115:
            java.lang.String r8 = r8.MediaSessionCompat$ResultReceiverWrapper
            if (r8 != 0) goto L_0x011c
            r15 = r27
            goto L_0x011d
        L_0x011c:
            r15 = r8
        L_0x011d:
            r23 = r15
            r15 = 0
            goto L_0x01aa
        L_0x0122:
            r27 = r15
            r15 = r13
            o.getEulerY r10 = r0.read
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r10 = r10.MediaBrowserCompat$ItemReceiver
            o.GoogleMap$OnMarkerDragListener r10 = r10.AppCompatDelegateImpl$ListMenuDecorView()
            java.lang.String r13 = "getUserProfileUseCase.userProfile"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r13)
            int r10 = r10.MediaSessionCompat$ResultReceiverWrapper
            if (r10 <= 0) goto L_0x0138
            r13 = r15
            goto L_0x0139
        L_0x0138:
            r13 = 0
        L_0x0139:
            java.lang.String r10 = r8.MediaDescriptionCompat
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x015d
            o.animateCameraWithCallback r10 = p040o.animateCameraWithCallback.MOB
            java.lang.String r10 = r10.name()
            java.lang.String r15 = r8.MediaDescriptionCompat
            boolean r10 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r10, (java.lang.Object) r15)
            java.lang.String r8 = r8.MediaMetadataCompat
            java.lang.String r15 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((boolean) r13, (boolean) r10, (java.lang.String) r8)
            java.lang.String r8 = "Utilities.maskingFormat(…mber, domain.promptpayId)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r15, (java.lang.String) r8)
            r0 = r15
            r15 = 0
            goto L_0x01a8
        L_0x015d:
            java.lang.String r10 = r8.MediaSessionCompat$QueueItem
            if (r10 == 0) goto L_0x01a0
            int r15 = r10.hashCode()
            r0 = 51621(0xc9a5, float:7.2336E-41)
            if (r15 == r0) goto L_0x018b
            r0 = 78694(0x13366, float:1.10274E-40)
            if (r15 == r0) goto L_0x0182
            r0 = 2434545(0x2525f1, float:3.411524E-39)
            if (r15 != r0) goto L_0x01a0
            java.lang.String r0 = "ORFT"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = r8.read
            r15 = 0
            if (r0 == 0) goto L_0x01a6
            goto L_0x01a8
        L_0x0182:
            java.lang.String r0 = "OWN"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01a0
            goto L_0x0193
        L_0x018b:
            java.lang.String r0 = "3RD"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01a0
        L_0x0193:
            java.lang.String r0 = r8.read
            r15 = 0
            java.lang.String r0 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((boolean) r13, (boolean) r15, (java.lang.String) r0)
            java.lang.String r8 = "Utilities.maskingFormat(… false, domain.accountTo)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r8)
            goto L_0x01a8
        L_0x01a0:
            r15 = 0
            java.lang.String r0 = r8.read
            if (r0 == 0) goto L_0x01a6
            goto L_0x01a8
        L_0x01a6:
            r0 = r27
        L_0x01a8:
            r23 = r0
        L_0x01aa:
            o.setFrames r0 = new o.setFrames
            r8 = r21
            r10 = r0
            r20 = r22
            r21 = r25
            r13 = r1
            r1 = r15
            r15 = r9
            r17 = r8
            r22 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r0)
            r0 = r26
            r1 = r24
            goto L_0x003b
        L_0x01c6:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder r0 = new o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.child.read(o.GoogleMapOptions):o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder");
    }
}
