package p040o;

import android.nfc.tech.IsoDep;
import android.os.AsyncTask;
import com.google.common.primitives.Bytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.BACKeySpec;
import org.jmrtd.PassportService;
import org.jmrtd.lds.icao.DG1File;
import org.jmrtd.lds.icao.MRZInfo;
import p039io.beid.beidk.parcelable.PassportDataParcelable;

/* renamed from: o.CloseAccountEligibilityModule */
public class CloseAccountEligibilityModule extends AsyncTask<Void, CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver, CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver> {
    public static int MediaBrowserCompat$CustomActionResultReceiver = 0;
    public static int MediaBrowserCompat$ItemReceiver = 0;
    private static final String write = CloseAccountEligibilityModule.class.getName();
    private IsoDep IconCompatParcelizer;
    private CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private ChequeSuccessActivity MediaMetadataCompat;
    private BACKeySpec read;

    public CloseAccountEligibilityModule(IsoDep isoDep, BACKeySpec bACKeySpec, ChequeSuccessActivity chequeSuccessActivity) {
        this.IconCompatParcelizer = isoDep;
        this.read = bACKeySpec;
        this.MediaMetadataCompat = chequeSuccessActivity;
    }

    private static byte[] IconCompatParcelizer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read2 = inputStream.read(bArr, 0, 16384);
            if (read2 != -1) {
                byteArrayOutputStream.write(bArr, 0, read2);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(InputStream inputStream) {
        try {
            byte[] bArr = {Integer.valueOf(PassportService.DEFAULT_MAX_BLOCKSIZE).byteValue(), Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256).byteValue()};
            byte[] IconCompatParcelizer2 = IconCompatParcelizer(inputStream);
            int indexOf = Bytes.indexOf(IconCompatParcelizer2, bArr);
            return new String(Arrays.copyOfRange(IconCompatParcelizer2, indexOf, Byte.valueOf(IconCompatParcelizer2[indexOf - 1]).intValue() + indexOf), "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver write() {
        /*
            r12 = this;
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat
            if (r0 != 0) goto L_0x000b
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = new o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver
            r0.<init>()
            r12.MediaDescriptionCompat = r0
        L_0x000b:
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat
            java.lang.Exception r0 = r0.MediaBrowserCompat$MediaItem
            r1 = 0
            if (r0 == 0) goto L_0x0016
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat
            r0.MediaBrowserCompat$MediaItem = r1
        L_0x0016:
            r0 = 3
            r2 = 0
            r3 = 1
            android.nfc.tech.IsoDep r4 = r12.IconCompatParcelizer     // Catch:{ Exception -> 0x0287 }
            net.sf.scuba.smartcards.CardService r4 = net.p088sf.scuba.smartcards.CardService.getInstance(r4)     // Catch:{ Exception -> 0x0287 }
            r4.open()     // Catch:{ Exception -> 0x0287 }
            org.jmrtd.PassportService r5 = new org.jmrtd.PassportService     // Catch:{ Exception -> 0x0287 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0287 }
            r5.open()     // Catch:{ Exception -> 0x0287 }
            org.jmrtd.lds.CardAccessFile r4 = new org.jmrtd.lds.CardAccessFile     // Catch:{ CardServiceException -> 0x005e }
            r6 = 284(0x11c, float:3.98E-43)
            net.sf.scuba.smartcards.CardFileInputStream r6 = r5.getInputStream(r6)     // Catch:{ CardServiceException -> 0x005e }
            r4.<init>((java.io.InputStream) r6)     // Catch:{ CardServiceException -> 0x005e }
            java.util.Collection r4 = r4.getPACEInfos()     // Catch:{ CardServiceException -> 0x005e }
            if (r4 == 0) goto L_0x005c
            int r6 = r4.size()     // Catch:{ CardServiceException -> 0x005e }
            if (r6 <= 0) goto L_0x005c
            java.util.Iterator r4 = r4.iterator()     // Catch:{ CardServiceException -> 0x005e }
            java.lang.Object r4 = r4.next()     // Catch:{ CardServiceException -> 0x005e }
            org.jmrtd.lds.PACEInfo r4 = (org.jmrtd.lds.PACEInfo) r4     // Catch:{ CardServiceException -> 0x005e }
            org.jmrtd.BACKeySpec r6 = r12.read     // Catch:{ CardServiceException -> 0x005e }
            java.lang.String r7 = r4.getObjectIdentifier()     // Catch:{ CardServiceException -> 0x005e }
            java.math.BigInteger r4 = r4.getParameterId()     // Catch:{ CardServiceException -> 0x005e }
            java.security.spec.AlgorithmParameterSpec r4 = org.jmrtd.lds.PACEInfo.toParameterSpec((java.math.BigInteger) r4)     // Catch:{ CardServiceException -> 0x005e }
            r5.doPACE(r6, r7, r4)     // Catch:{ CardServiceException -> 0x005e }
        L_0x005c:
            r4 = r3
            goto L_0x00b9
        L_0x005e:
            r4 = move-exception
            java.lang.Class r6 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r7.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = "CardServiceException getSW() = "
            r7.append(r8)     // Catch:{ Exception -> 0x0287 }
            int r8 = r4.getSW()     // Catch:{ Exception -> 0x0287 }
            r7.append(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.e(r6, r7)     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r6 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r7.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = "CardServiceException getMessage() = "
            r7.append(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r4.getMessage()     // Catch:{ Exception -> 0x0287 }
            r7.append(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.e(r6, r7)     // Catch:{ Exception -> 0x0287 }
            int r6 = r4.getSW()     // Catch:{ Exception -> 0x0287 }
            r7 = -1
            if (r6 != r7) goto L_0x00b8
            int r6 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0287 }
            int r6 = r6 + r3
            MediaBrowserCompat$CustomActionResultReceiver = r6     // Catch:{ Exception -> 0x0287 }
            if (r6 >= r0) goto L_0x00ae
            goto L_0x00b8
        L_0x00ae:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ Exception -> 0x0287 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0287 }
            throw r5     // Catch:{ Exception -> 0x0287 }
        L_0x00b8:
            r4 = r2
        L_0x00b9:
            r5.sendSelectApplet(r4)     // Catch:{ Exception -> 0x0287 }
            if (r4 != 0) goto L_0x010a
            r4 = 286(0x11e, float:4.01E-43)
            net.sf.scuba.smartcards.CardFileInputStream r4 = r5.getInputStream(r4)     // Catch:{ Exception -> 0x00c8 }
            r4.read()     // Catch:{ Exception -> 0x00c8 }
            goto L_0x010a
        L_0x00c8:
            org.jmrtd.BACKeySpec r4 = r12.read     // Catch:{ Exception -> 0x00ce }
            r5.doBAC(r4)     // Catch:{ Exception -> 0x00ce }
            goto L_0x010a
        L_0x00ce:
            r4 = move-exception
            java.lang.Class r5 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = "error in 2nd doBAC"
            android.util.Log.e(r5, r6, r4)     // Catch:{ Exception -> 0x0287 }
            int r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0287 }
            int r4 = r4 + r3
            MediaBrowserCompat$ItemReceiver = r4     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r4 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r5.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = "error SW6A86ErrorCount = "
            r5.append(r6)     // Catch:{ Exception -> 0x0287 }
            int r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0287 }
            r5.append(r6)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0287 }
            int r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0287 }
            if (r4 >= r0) goto L_0x0104
            return r1
        L_0x0104:
            io.beid.beidk.c r4 = new io.beid.beidk.c     // Catch:{ Exception -> 0x0287 }
            r4.<init>()     // Catch:{ Exception -> 0x0287 }
            throw r4     // Catch:{ Exception -> 0x0287 }
        L_0x010a:
            o.ChequeSuccessActivity r4 = r12.MediaMetadataCompat     // Catch:{ Exception -> 0x0287 }
            r4.MediaDescriptionCompat()     // Catch:{ Exception -> 0x0287 }
            MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ Exception -> 0x0287 }
            MediaBrowserCompat$ItemReceiver = r2     // Catch:{ Exception -> 0x0287 }
            r4 = 285(0x11d, float:4.0E-43)
            net.sf.scuba.smartcards.CardFileInputStream r4 = r5.getInputStream(r4)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r6 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r4 = IconCompatParcelizer(r4)     // Catch:{ Exception -> 0x0287 }
            r6.write = r4     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r4 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = r4.getCanonicalName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r6.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r7 = "Found sod, length = "
            r6.append(r7)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r7 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r7 = r7.write     // Catch:{ Exception -> 0x0287 }
            int r7 = r7.length     // Catch:{ Exception -> 0x0287 }
            r6.append(r7)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.i(r4, r6)     // Catch:{ Exception -> 0x0287 }
            org.jmrtd.lds.SODFile r4 = new org.jmrtd.lds.SODFile     // Catch:{ Exception -> 0x0287 }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r7 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r7 = r7.write     // Catch:{ Exception -> 0x0287 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0287 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0287 }
            java.util.Map r4 = r4.getDataGroupHashes()     // Catch:{ Exception -> 0x0287 }
            java.util.Set r4 = r4.keySet()     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r6 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0287 }
            r6.MediaBrowserCompat$ItemReceiver = r8     // Catch:{ Exception -> 0x0287 }
            r6 = 13
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0287 }
            boolean r8 = r4.contains(r8)     // Catch:{ Exception -> 0x0287 }
            if (r8 == 0) goto L_0x0176
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r9 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0287 }
            r8.MediaBrowserCompat$ItemReceiver = r9     // Catch:{ Exception -> 0x0287 }
        L_0x0176:
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0287 }
            r8.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] r8 = new p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[r3]     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r9 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r8[r2] = r9     // Catch:{ Exception -> 0x0287 }
            r12.publishProgress(r8)     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0287 }
            boolean r8 = r4.contains(r8)     // Catch:{ Exception -> 0x0287 }
            r9 = 2
            if (r8 == 0) goto L_0x01dc
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r8 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0287 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0287 }
            if (r8 >= r9) goto L_0x01dc
            r8 = 257(0x101, float:3.6E-43)
            net.sf.scuba.smartcards.CardFileInputStream r8 = r5.getInputStream(r8)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r10 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r8 = IconCompatParcelizer(r8)     // Catch:{ Exception -> 0x0287 }
            r10.read = r8     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r8 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r8.getCanonicalName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r10.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r11 = "Found dg1, length = "
            r10.append(r11)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r11 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r11 = r11.read     // Catch:{ Exception -> 0x0287 }
            int r11 = r11.length     // Catch:{ Exception -> 0x0287 }
            r10.append(r11)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.i(r8, r10)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0287 }
            r8.MediaBrowserCompat$CustomActionResultReceiver = r10     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] r8 = new p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[r3]     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r10 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r8[r2] = r10     // Catch:{ Exception -> 0x0287 }
            r12.publishProgress(r8)     // Catch:{ Exception -> 0x0287 }
        L_0x01dc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0287 }
            boolean r8 = r4.contains(r8)     // Catch:{ Exception -> 0x0287 }
            if (r8 == 0) goto L_0x0230
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r8 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0287 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0287 }
            if (r8 >= r0) goto L_0x0230
            r8 = 258(0x102, float:3.62E-43)
            net.sf.scuba.smartcards.CardFileInputStream r8 = r5.getInputStream(r8)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r9 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r8 = IconCompatParcelizer(r8)     // Catch:{ Exception -> 0x0287 }
            r9.IconCompatParcelizer = r8     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r8 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r8.getCanonicalName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r9.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r10 = "Found dg2, length = "
            r9.append(r10)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r10 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r10 = r10.IconCompatParcelizer     // Catch:{ Exception -> 0x0287 }
            int r10 = r10.length     // Catch:{ Exception -> 0x0287 }
            r9.append(r10)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.i(r8, r9)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r8 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0287 }
            r8.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] r8 = new p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[r3]     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r9 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r8[r2] = r9     // Catch:{ Exception -> 0x0287 }
            r12.publishProgress(r8)     // Catch:{ Exception -> 0x0287 }
        L_0x0230:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0287 }
            boolean r4 = r4.contains(r6)     // Catch:{ Exception -> 0x0287 }
            if (r4 == 0) goto L_0x0284
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r4 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r4 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0287 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0287 }
            if (r4 >= r7) goto L_0x0284
            r4 = 269(0x10d, float:3.77E-43)
            net.sf.scuba.smartcards.CardFileInputStream r4 = r5.getInputStream(r4)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r5 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r4 = IconCompatParcelizer(r4)     // Catch:{ Exception -> 0x0287 }
            r5.MediaMetadataCompat = r4     // Catch:{ Exception -> 0x0287 }
            java.lang.Class r4 = r12.getClass()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r4 = r4.getCanonicalName()     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0287 }
            r5.<init>()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = "Found dg13, length = "
            r5.append(r6)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r6 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            byte[] r6 = r6.MediaMetadataCompat     // Catch:{ Exception -> 0x0287 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0287 }
            r5.append(r6)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0287 }
            android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r4 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0287 }
            r4.MediaBrowserCompat$CustomActionResultReceiver = r5     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] r4 = new p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[r3]     // Catch:{ Exception -> 0x0287 }
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r5 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            r4[r2] = r5     // Catch:{ Exception -> 0x0287 }
            r12.publishProgress(r4)     // Catch:{ Exception -> 0x0287 }
        L_0x0284:
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat     // Catch:{ Exception -> 0x0287 }
            return r0
        L_0x0287:
            r4 = move-exception
            java.lang.String r5 = write
            java.lang.String r6 = "error in general"
            android.util.Log.e(r5, r6, r4)
            int r5 = MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 + r3
            MediaBrowserCompat$CustomActionResultReceiver = r5
            if (r5 < r0) goto L_0x02a6
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat
            r0.MediaBrowserCompat$MediaItem = r4
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] r0 = new p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[r3]
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r1 = r12.MediaDescriptionCompat
            r0[r2] = r1
            r12.publishProgress(r0)
            o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver r0 = r12.MediaDescriptionCompat
            return r0
        L_0x02a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CloseAccountEligibilityModule.write():o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver");
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return write();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver = (CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver) obj;
        if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver != null) {
            if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null) {
                try {
                    this.MediaMetadataCompat.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, (PassportDataParcelable) null);
                    return;
                } catch (Exception unused) {
                }
            }
            if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.read != null) {
                try {
                    MRZInfo mRZInfo = new DG1File((InputStream) new ByteArrayInputStream(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.read)).getMRZInfo();
                    Long l = 0L;
                    PassportDataParcelable passportDataParcelable = new PassportDataParcelable();
                    passportDataParcelable.dg1 = AlertController$RecycleListView.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.read);
                    passportDataParcelable.dg2 = AlertController$RecycleListView.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                    if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat != null) {
                        passportDataParcelable.dg13 = AlertController$RecycleListView.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
                    }
                    passportDataParcelable.sod = AlertController$RecycleListView.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.write);
                    passportDataParcelable.passportNumber = this.read.getDocumentNumber();
                    passportDataParcelable.firstNameEng = mRZInfo.getSecondaryIdentifier().replace("<", "");
                    passportDataParcelable.lastNameEng = mRZInfo.getPrimaryIdentifier().replace("<", "");
                    if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat != null) {
                        passportDataParcelable.nameThai = MediaBrowserCompat$ItemReceiver(new ByteArrayInputStream(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat));
                    }
                    passportDataParcelable.gender = mRZInfo.getGender().toString();
                    passportDataParcelable.nationality = mRZInfo.getNationality();
                    passportDataParcelable.placeOfBirth = "";
                    passportDataParcelable.issuingAuthority = mRZInfo.getIssuingState();
                    passportDataParcelable.citizenID = mRZInfo.getOptionalData1().substring(0, 13);
                    passportDataParcelable.dateOfBirth = PassportDataParcelable.parseDate(mRZInfo.getDateOfBirth());
                    passportDataParcelable.dateOfBirth = PassportDataParcelable.parseDate(mRZInfo.getDateOfExpiry());
                    passportDataParcelable.verificationResult = !"0".equals(l);
                    passportDataParcelable.profileId = l.toString();
                    passportDataParcelable.result = "";
                    passportDataParcelable.errorCode = "";
                    passportDataParcelable.error = "";
                    this.MediaMetadataCompat.read(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, passportDataParcelable);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onProgressUpdate(Object[] objArr) {
        CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[] closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiverArr = (CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver[]) objArr;
        if (this.MediaMetadataCompat != null) {
            for (CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver IconCompatParcelizer2 : closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiverArr) {
                this.MediaMetadataCompat.IconCompatParcelizer(IconCompatParcelizer2);
            }
        }
        super.onProgressUpdate(closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiverArr);
    }
}
