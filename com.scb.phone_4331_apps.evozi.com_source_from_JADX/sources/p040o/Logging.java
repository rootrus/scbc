package p040o;

import p040o.C4121bx;
import p040o.writeUInt64NoTag;

/* renamed from: o.Logging */
public final /* synthetic */ class Logging implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4121bx.C41232 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zoomOut write;

    public /* synthetic */ Logging(C4121bx.C41232 r1, zoomOut zoomout) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.write = zoomout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0090, code lost:
        if ((r10 == null || r10.length() == 0) != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            o.bx$2 r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.zoomOut r2 = r0.write
            r3 = r17
            o.getVariant r3 = (p040o.getVariant) r3
            r3.aj_()
            o.bx r4 = p040o.C4121bx.this
            p040o.zoomOut unused = r4.read = r2
            o.bx r4 = p040o.C4121bx.this
            o.readLine r4 = r4.write
            if (r2 == 0) goto L_0x001d
            o.GoogleMap r6 = r2.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            java.lang.String r7 = "dd MMM yyyy"
            r8 = 0
            r9 = 1
            if (r6 != 0) goto L_0x0027
        L_0x0024:
            r10 = 0
            goto L_0x00bc
        L_0x0027:
            java.lang.String r10 = r6.MediaDescriptionCompat
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0035
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0035
            r10 = r8
            goto L_0x0036
        L_0x0035:
            r10 = r9
        L_0x0036:
            if (r10 == 0) goto L_0x0093
            java.lang.String r10 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0046
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0046
            r10 = r8
            goto L_0x0047
        L_0x0046:
            r10 = r9
        L_0x0047:
            if (r10 == 0) goto L_0x0093
            java.lang.String r10 = r6.RatingCompat
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0057
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0057
            r10 = r8
            goto L_0x0058
        L_0x0057:
            r10 = r9
        L_0x0058:
            if (r10 == 0) goto L_0x0093
            java.lang.String r10 = r6.IconCompatParcelizer
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0068
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0068
            r10 = r8
            goto L_0x0069
        L_0x0068:
            r10 = r9
        L_0x0069:
            if (r10 == 0) goto L_0x0093
            org.threeten.bp.OffsetDateTime r10 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 != 0) goto L_0x0093
            java.lang.String r10 = r6.MediaBrowserCompat$MediaItem
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x007d
            int r10 = r10.length()
            if (r10 == 0) goto L_0x007d
            r10 = r8
            goto L_0x007e
        L_0x007d:
            r10 = r9
        L_0x007e:
            if (r10 == 0) goto L_0x0093
            java.lang.String r10 = r6.read
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x008f
            int r10 = r10.length()
            if (r10 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r10 = r8
            goto L_0x0090
        L_0x008f:
            r10 = r9
        L_0x0090:
            if (r10 == 0) goto L_0x0093
            goto L_0x0024
        L_0x0093:
            o.toBuilder r10 = new o.toBuilder
            r10.<init>()
            java.lang.String r11 = r6.MediaDescriptionCompat
            r10.MediaBrowserCompat$MediaItem = r11
            java.lang.String r11 = r6.MediaBrowserCompat$ItemReceiver
            r10.write = r11
            java.lang.String r11 = r6.RatingCompat
            r10.MediaMetadataCompat = r11
            java.lang.String r11 = r6.IconCompatParcelizer
            java.lang.String r11 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((boolean) r8, (boolean) r8, (java.lang.String) r11)
            r10.IconCompatParcelizer = r11
            org.threeten.bp.OffsetDateTime r11 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = r4.IconCompatParcelizer((java.lang.String) r7, (org.threeten.p041bp.OffsetDateTime) r11)
            r10.MediaBrowserCompat$CustomActionResultReceiver = r11
            java.lang.String r11 = r6.MediaBrowserCompat$MediaItem
            r10.MediaBrowserCompat$ItemReceiver = r11
            java.lang.String r6 = r6.read
            r10.read = r6
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            o.zoomTo r6 = r2.IconCompatParcelizer
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            if (r2 == 0) goto L_0x00c7
            o.GoogleMap r11 = r2.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            if (r6 == 0) goto L_0x00cd
            java.lang.String r12 = r6.IconCompatParcelizer
            goto L_0x00ce
        L_0x00cd:
            r12 = 0
        L_0x00ce:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x00da
            int r12 = r12.length()
            if (r12 == 0) goto L_0x00da
            r12 = r8
            goto L_0x00db
        L_0x00da:
            r12 = r9
        L_0x00db:
            if (r12 == 0) goto L_0x0106
            if (r6 == 0) goto L_0x00ec
            java.util.List<java.lang.String> r12 = r6.MediaBrowserCompat$ItemReceiver
            if (r12 == 0) goto L_0x00ec
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r9
            if (r12 == r9) goto L_0x0106
        L_0x00ec:
            if (r11 == 0) goto L_0x00f1
            java.lang.String r12 = r11.write
            goto L_0x00f2
        L_0x00f1:
            r12 = 0
        L_0x00f2:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x00ff
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r12 = r8
            goto L_0x0100
        L_0x00ff:
            r12 = r9
        L_0x0100:
            if (r12 != 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r12 = 0
            goto L_0x018b
        L_0x0106:
            o.AutoValue_CrashlyticsReport r12 = new o.AutoValue_CrashlyticsReport
            r12.<init>()
            if (r6 == 0) goto L_0x0178
            java.util.List<java.lang.String> r13 = r6.MediaBrowserCompat$ItemReceiver
            if (r13 == 0) goto L_0x0178
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.String r15 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r15)
            boolean r15 = r13 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0126
            r15 = r13
            java.util.Collection r15 = (java.util.Collection) r15
            int r15 = r15.size()
            goto L_0x0128
        L_0x0126:
            r15 = 10
        L_0x0128:
            r14.<init>(r15)
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Iterator r13 = r13.iterator()
        L_0x0131:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0175
            java.lang.Object r15 = r13.next()
            java.lang.String r15 = (java.lang.String) r15
            o.LifestyleCustomizationActivity r8 = new o.LifestyleCustomizationActivity
            java.lang.String r9 = "[^0-9]"
            r8.<init>((java.lang.String) r9)
            r9 = r15
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.String r5 = ""
            java.lang.String r5 = r8.read(r9, r5)
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0158
            r8 = 1
            goto L_0x0159
        L_0x0158:
            r8 = 0
        L_0x0159:
            if (r8 == 0) goto L_0x016f
            int r8 = r5.length()
            r9 = 10
            if (r8 != r9) goto L_0x016f
            r8 = 0
            r9 = 1
            java.lang.String r15 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((boolean) r8, (boolean) r9, (java.lang.String) r5)
            java.lang.String r5 = "Utilities.maskingFormat(false, true, mobileNumber)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r15, (java.lang.String) r5)
            goto L_0x0171
        L_0x016f:
            r8 = 0
            r9 = 1
        L_0x0171:
            r14.add(r15)
            goto L_0x0131
        L_0x0175:
            java.util.List r14 = (java.util.List) r14
            goto L_0x0179
        L_0x0178:
            r14 = 0
        L_0x0179:
            r12.write = r14
            if (r11 == 0) goto L_0x0180
            java.lang.String r5 = r11.write
            goto L_0x0181
        L_0x0180:
            r5 = 0
        L_0x0181:
            r12.MediaBrowserCompat$CustomActionResultReceiver = r5
            if (r6 == 0) goto L_0x0188
            java.lang.String r5 = r6.IconCompatParcelizer
            goto L_0x0189
        L_0x0188:
            r5 = 0
        L_0x0189:
            r12.MediaBrowserCompat$ItemReceiver = r5
        L_0x018b:
            if (r2 == 0) goto L_0x0190
            o.zoomBy r5 = r2.write
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            if (r5 == 0) goto L_0x0196
            java.lang.String r6 = r5.read
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x01a3
            int r6 = r6.length()
            if (r6 == 0) goto L_0x01a3
            r6 = r8
            goto L_0x01a4
        L_0x01a3:
            r6 = r9
        L_0x01a4:
            if (r6 == 0) goto L_0x01e5
            if (r5 == 0) goto L_0x01ab
            java.lang.String r6 = r5.write
            goto L_0x01ac
        L_0x01ab:
            r6 = 0
        L_0x01ac:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x01b8
            int r6 = r6.length()
            if (r6 == 0) goto L_0x01b8
            r6 = r8
            goto L_0x01b9
        L_0x01b8:
            r6 = r9
        L_0x01b9:
            if (r6 == 0) goto L_0x01e5
            if (r5 == 0) goto L_0x01c0
            java.lang.String r6 = r5.MediaBrowserCompat$ItemReceiver
            goto L_0x01c1
        L_0x01c0:
            r6 = 0
        L_0x01c1:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x01cd
            int r6 = r6.length()
            if (r6 == 0) goto L_0x01cd
            r6 = r8
            goto L_0x01ce
        L_0x01cd:
            r6 = r9
        L_0x01ce:
            if (r6 == 0) goto L_0x01e5
            if (r5 == 0) goto L_0x01d5
            java.lang.String r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x01d6
        L_0x01d5:
            r6 = 0
        L_0x01d6:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x01e0
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01e1
        L_0x01e0:
            r8 = r9
        L_0x01e1:
            if (r8 == 0) goto L_0x01e5
            r6 = 0
            goto L_0x020a
        L_0x01e5:
            o.getPlatform r6 = new o.getPlatform
            r6.<init>()
            if (r5 == 0) goto L_0x01ef
            java.lang.String r8 = r5.read
            goto L_0x01f0
        L_0x01ef:
            r8 = 0
        L_0x01f0:
            r6.IconCompatParcelizer = r8
            if (r5 == 0) goto L_0x01f7
            java.lang.String r8 = r5.write
            goto L_0x01f8
        L_0x01f7:
            r8 = 0
        L_0x01f8:
            r6.MediaBrowserCompat$CustomActionResultReceiver = r8
            if (r5 == 0) goto L_0x01ff
            java.lang.String r8 = r5.MediaBrowserCompat$ItemReceiver
            goto L_0x0200
        L_0x01ff:
            r8 = 0
        L_0x0200:
            r6.MediaBrowserCompat$ItemReceiver = r8
            if (r5 == 0) goto L_0x0207
            java.lang.String r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0208
        L_0x0207:
            r5 = 0
        L_0x0208:
            r6.read = r5
        L_0x020a:
            if (r10 != 0) goto L_0x021a
            if (r12 != 0) goto L_0x021a
            if (r6 != 0) goto L_0x021a
            if (r2 == 0) goto L_0x0215
            org.threeten.bp.OffsetDateTime r5 = r2.read
            goto L_0x0216
        L_0x0215:
            r5 = 0
        L_0x0216:
            if (r5 != 0) goto L_0x021a
            r5 = 0
            goto L_0x0231
        L_0x021a:
            o.getSdkVersion r5 = new o.getSdkVersion
            r5.<init>()
            r5.IconCompatParcelizer = r10
            r5.read = r12
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6
            if (r2 == 0) goto L_0x022a
            org.threeten.bp.OffsetDateTime r2 = r2.read
            goto L_0x022b
        L_0x022a:
            r2 = 0
        L_0x022b:
            java.lang.String r2 = r4.IconCompatParcelizer((java.lang.String) r7, (org.threeten.p041bp.OffsetDateTime) r2)
            r5.MediaBrowserCompat$ItemReceiver = r2
        L_0x0231:
            r3.IconCompatParcelizer(r5)
            o.bx r1 = p040o.C4121bx.this
            p040o.C4121bx.MediaBrowserCompat$ItemReceiver(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Logging.IconCompatParcelizer(java.lang.Object):void");
    }
}
