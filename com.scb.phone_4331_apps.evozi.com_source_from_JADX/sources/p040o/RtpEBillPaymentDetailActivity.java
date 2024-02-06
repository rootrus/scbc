package p040o;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.apache.http.impl.auth.NTLMEngineException;

/* renamed from: o.RtpEBillPaymentDetailActivity */
final class RtpEBillPaymentDetailActivity implements BillPaymentSearchActivity {
    /* access modifiers changed from: private */
    public static final byte[] IconCompatParcelizer;
    private static final String MediaBrowserCompat$CustomActionResultReceiver = new read().MediaBrowserCompat$ItemReceiver();
    private static final byte[] MediaBrowserCompat$ItemReceiver = "tls-server-end-point:".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
    private static final Charset RatingCompat = Charset.forName("UnicodeLittleUnmarked");
    /* access modifiers changed from: private */
    public static final Charset read = PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public static final SecureRandom write;

    static int IconCompatParcelizer(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    static int IconCompatParcelizer(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    static int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    static int read(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    static /* synthetic */ byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[(bArr3.length + 8 + 8 + 4 + bArr2.length + 4)];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length + 8;
        System.arraycopy(bArr, 0, bArr4, length, 8);
        int i = length + 8;
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i, 4);
        int i2 = i + 4;
        System.arraycopy(bArr2, 0, bArr4, i2, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i2 + bArr2.length, 4);
        return bArr4;
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        write = secureRandom;
        byte[] bytes = "NTLMSSP".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr = new byte[(bytes.length + 1)];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        IconCompatParcelizer = bArr;
        byte[] bytes2 = "session key to server-to-client signing key magic constant".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr2 = new byte[(bytes2.length + 1)];
        System.arraycopy(bytes2, 0, bArr2, 0, bytes2.length);
        bArr2[bytes2.length] = 0;
        byte[] bytes3 = "session key to client-to-server signing key magic constant".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr3 = new byte[(bytes3.length + 1)];
        System.arraycopy(bytes3, 0, bArr3, 0, bytes3.length);
        bArr3[bytes3.length] = 0;
        byte[] bytes4 = "session key to server-to-client sealing key magic constant".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr4 = new byte[(bytes4.length + 1)];
        System.arraycopy(bytes4, 0, bArr4, 0, bytes4.length);
        bArr4[bytes4.length] = 0;
        byte[] bytes5 = "session key to client-to-server sealing key magic constant".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr5 = new byte[(bytes5.length + 1)];
        System.arraycopy(bytes5, 0, bArr5, 0, bytes5.length);
        bArr5[bytes5.length] = 0;
    }

    RtpEBillPaymentDetailActivity() {
    }

    /* access modifiers changed from: private */
    public static int MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* access modifiers changed from: private */
    public static byte[] IconCompatParcelizer(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public static byte[] read(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver = new RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(bArr2);
        rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(bArr);
        byte[] digest = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest();
        rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        return rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest(digest);
    }

    static byte[] write(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            Cipher instance = Cipher.getInstance("RC4");
            instance.init(1, new SecretKeySpec(bArr2, "RC4"));
            return instance.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    static byte[] read(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest read2 = read();
            read2.update(bArr2);
            read2.update(bArr3);
            byte[] digest = read2.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(digest, 0, bArr4, 0, 8);
            return MediaBrowserCompat$CustomActionResultReceiver(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] write(String str) throws NTLMEngineException {
        try {
            byte[] bytes = str.toUpperCase(Locale.ROOT).getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(bArr, 0);
            Key MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, MediaBrowserCompat$ItemReceiver2);
            byte[] doFinal = instance.doFinal(bytes2);
            instance.init(1, MediaBrowserCompat$ItemReceiver3);
            byte[] doFinal2 = instance.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(bArr3, 0);
            Key MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(bArr3, 7);
            Key MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver(bArr3, 14);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, MediaBrowserCompat$ItemReceiver2);
            byte[] doFinal = instance.doFinal(bArr2);
            instance.init(1, MediaBrowserCompat$ItemReceiver3);
            byte[] doFinal2 = instance.doFinal(bArr2);
            instance.init(1, MediaBrowserCompat$ItemReceiver4);
            byte[] doFinal3 = instance.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: private */
    public static Key MediaBrowserCompat$ItemReceiver(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & 255) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & 255) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & 255) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & 255) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & 255) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & 255) >>> 6)), (byte) (bArr2[6] << 1)};
        write(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    private static void write(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte b = bArr[i];
            if (((((b >>> 2) ^ (((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3))) ^ (b >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }

    /* renamed from: o.RtpEBillPaymentDetailActivity$IconCompatParcelizer */
    static class IconCompatParcelizer {
        protected byte[] IconCompatParcelizer;
        protected int MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer() {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver = 0;
        }

        IconCompatParcelizer(byte[] bArr) throws NTLMEngineException {
            this.IconCompatParcelizer = null;
            int i = 0;
            this.MediaBrowserCompat$ItemReceiver = 0;
            this.IconCompatParcelizer = bArr;
            if (bArr.length >= RtpEBillPaymentDetailActivity.IconCompatParcelizer.length) {
                while (i < RtpEBillPaymentDetailActivity.IconCompatParcelizer.length) {
                    if (this.IconCompatParcelizer[i] == RtpEBillPaymentDetailActivity.IconCompatParcelizer[i]) {
                        i++;
                    } else {
                        throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int IconCompatParcelizer2 = RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, RtpEBillPaymentDetailActivity.IconCompatParcelizer.length);
                if (IconCompatParcelizer2 == 2) {
                    this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.length;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("NTLM type ");
                sb.append(Integer.toString(2));
                sb.append(" message expected - instead got type ");
                sb.append(Integer.toString(IconCompatParcelizer2));
                throw new NTLMEngineException(sb.toString());
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }

        /* access modifiers changed from: protected */
        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) throws NTLMEngineException {
            byte[] bArr2 = this.IconCompatParcelizer;
            if (bArr2.length >= 32) {
                System.arraycopy(bArr2, 24, bArr, 0, 8);
                return;
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        /* access modifiers changed from: protected */
        public final int IconCompatParcelizer(int i) throws NTLMEngineException {
            return RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, 20);
        }

        /* access modifiers changed from: protected */
        public final byte[] read(int i) throws NTLMEngineException {
            return RtpEBillPaymentDetailActivity.write(this.IconCompatParcelizer, i);
        }

        /* access modifiers changed from: protected */
        public final void read(int i, int i2) {
            this.IconCompatParcelizer = new byte[i];
            this.MediaBrowserCompat$ItemReceiver = 0;
            read(RtpEBillPaymentDetailActivity.IconCompatParcelizer);
            MediaBrowserCompat$ItemReceiver(i2);
        }

        /* access modifiers changed from: protected */
        public final void read(byte[] bArr) {
            if (bArr != null) {
                for (byte b : bArr) {
                    byte[] bArr2 = this.IconCompatParcelizer;
                    int i = this.MediaBrowserCompat$ItemReceiver;
                    bArr2[i] = b;
                    this.MediaBrowserCompat$ItemReceiver = i + 1;
                }
            }
        }

        public final String MediaBrowserCompat$ItemReceiver() {
            return new String(SetupQuickTopUpActivity.read(read()), PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        }

        private byte[] read() {
            if (this.IconCompatParcelizer == null) {
                write();
            }
            byte[] bArr = this.IconCompatParcelizer;
            int length = bArr.length;
            int i = this.MediaBrowserCompat$ItemReceiver;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.IconCompatParcelizer = bArr2;
            }
            return this.IconCompatParcelizer;
        }

        /* access modifiers changed from: protected */
        public void write() {
            StringBuilder sb = new StringBuilder();
            sb.append("Message builder not implemented for ");
            sb.append(getClass().getName());
            throw new RuntimeException(sb.toString());
        }

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            byte[] bArr = this.IconCompatParcelizer;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.MediaBrowserCompat$ItemReceiver = i3;
            bArr[i3] = (byte) (i >> 8);
            int i4 = i3 + 1;
            this.MediaBrowserCompat$ItemReceiver = i4;
            bArr[i4] = (byte) (i >> 16);
            int i5 = i4 + 1;
            this.MediaBrowserCompat$ItemReceiver = i5;
            bArr[i5] = (byte) (i >>> 24);
            this.MediaBrowserCompat$ItemReceiver = i5 + 1;
        }

        /* access modifiers changed from: protected */
        public final void write(int i) {
            byte[] bArr = this.IconCompatParcelizer;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.MediaBrowserCompat$ItemReceiver = i3;
            bArr[i3] = (byte) (i >> 8);
            this.MediaBrowserCompat$ItemReceiver = i3 + 1;
        }
    }

    /* renamed from: o.RtpEBillPaymentDetailActivity$read */
    static class read extends IconCompatParcelizer {
        private final int write = -1576500735;

        read() {
        }

        /* access modifiers changed from: protected */
        public final void write() {
            read(40, 1);
            MediaBrowserCompat$ItemReceiver(-1576500735);
            write(0);
            write(0);
            MediaBrowserCompat$ItemReceiver(40);
            write(0);
            write(0);
            MediaBrowserCompat$ItemReceiver(40);
            write(261);
            MediaBrowserCompat$ItemReceiver(2600);
            write(3840);
        }
    }

    /* renamed from: o.RtpEBillPaymentDetailActivity$MediaDescriptionCompat */
    static class MediaDescriptionCompat extends IconCompatParcelizer {
        private byte[] MediaBrowserCompat$CustomActionResultReceiver;
        private byte[] MediaBrowserCompat$MediaItem;
        private byte[] MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private byte[] f5528x50fd9e4a;
        private byte[] MediaDescriptionCompat;
        private byte[] MediaMetadataCompat;
        private int MediaSessionCompat$ResultReceiverWrapper;
        private byte[] MediaSessionCompat$Token;
        private byte[] RatingCompat;
        private boolean read;
        private byte[] write;

        MediaDescriptionCompat(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, (byte) 0);
        }

        private MediaDescriptionCompat(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, byte b) throws NTLMEngineException {
            this(RtpEBillPaymentDetailActivity.write, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, (Certificate) null, (byte[]) null, (byte[]) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01ba  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private MediaDescriptionCompat(java.util.Random r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, byte[] r24, int r25, java.lang.String r26, byte[] r27, java.security.cert.Certificate r28, byte[] r29, byte[] r30) throws org.apache.http.impl.auth.NTLMEngineException {
            /*
                r16 = this;
                r0 = r16
                r1 = r25
                r16.<init>()
                if (r17 == 0) goto L_0x01d7
                r0.MediaSessionCompat$ResultReceiverWrapper = r1
                r12 = 0
                r0.RatingCompat = r12
                r0.MediaSessionCompat$Token = r12
                java.lang.String r13 = p040o.RtpEBillPaymentDetailActivity.IconCompatParcelizer((java.lang.String) r21)
                java.lang.String r14 = p040o.RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver((java.lang.String) r20)
                r15 = 0
                r0.read = r15
                o.RtpEBillPaymentDetailActivity$MediaBrowserCompat$CustomActionResultReceiver r11 = new o.RtpEBillPaymentDetailActivity$MediaBrowserCompat$CustomActionResultReceiver
                r2 = r11
                r3 = r17
                r4 = r18
                r6 = r14
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r26
                r17 = r11
                r11 = r27
                r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11)
                r2 = 8388608(0x800000, float:1.17549435E-38)
                r2 = r2 & r1
                r3 = 16
                if (r2 == 0) goto L_0x00aa
                if (r27 == 0) goto L_0x00aa
                if (r26 == 0) goto L_0x00aa
                byte[] r2 = r17.MediaDescriptionCompat()     // Catch:{ NTLMEngineException -> 0x00a6 }
                r0.MediaBrowserCompat$MediaItem = r2     // Catch:{ NTLMEngineException -> 0x00a6 }
                r2 = r17
                byte[] r4 = r2.MediaBrowserCompat$SearchResultReceiver     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x007d
                byte[] r4 = r2.MediaBrowserCompat$MediaItem     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x0065
                java.lang.String r4 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NTLMEngineException -> 0x0146 }
                java.lang.String r5 = r2.Keep     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r6 != 0) goto L_0x005d
                java.lang.String r6 = r2.MediaSessionCompat$QueueItem     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = p040o.RtpEBillPaymentDetailActivity.read((java.lang.String) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.RatingCompat = r6     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x005d:
                byte[] r6 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.write((java.lang.String) r4, (java.lang.String) r5, (byte[]) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.MediaBrowserCompat$MediaItem = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x0065:
                byte[] r4 = r2.MediaBrowserCompat$MediaItem     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = r2.IconCompatParcelizer     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = r2.write     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r6 != 0) goto L_0x0075
                java.util.Random r6 = r2.MediaSessionCompat$Token     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = p040o.RtpEBillPaymentDetailActivity.IconCompatParcelizer((java.util.Random) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.write = r6     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x0075:
                byte[] r6 = r2.write     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.write((byte[]) r4, (byte[]) r5, (byte[]) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.MediaBrowserCompat$SearchResultReceiver = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x007d:
                byte[] r4 = r2.MediaBrowserCompat$SearchResultReceiver     // Catch:{ NTLMEngineException -> 0x0146 }
                r0.MediaMetadataCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
                r4 = r1 & 128(0x80, float:1.794E-43)
                if (r4 == 0) goto L_0x008b
                byte[] r3 = r2.IconCompatParcelizer()     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x008b:
                byte[] r4 = r2.f5529x50fd9e4a     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x00a2
                byte[] r4 = r2.read()     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = new byte[r3]     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = r2.MediaDescriptionCompat()     // Catch:{ NTLMEngineException -> 0x0146 }
                java.lang.System.arraycopy(r6, r15, r5, r15, r3)     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver((byte[]) r5, (byte[]) r4)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.f5529x50fd9e4a = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x00a2:
                byte[] r3 = r2.f5529x50fd9e4a     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x00a6:
                r2 = r17
                goto L_0x0146
            L_0x00aa:
                r2 = r17
                r4 = 524288(0x80000, float:7.34684E-40)
                r4 = r4 & r1
                if (r4 == 0) goto L_0x0114
                byte[] r4 = r2.MediaDescriptionCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x00d9
                byte[] r4 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x00c1
                java.lang.String r4 = r2.MediaSessionCompat$QueueItem     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.read((java.lang.String) r4)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.RatingCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x00c1:
                byte[] r4 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = r2.IconCompatParcelizer     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = r2.write     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r6 != 0) goto L_0x00d1
                java.util.Random r6 = r2.MediaSessionCompat$Token     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r6 = p040o.RtpEBillPaymentDetailActivity.IconCompatParcelizer((java.util.Random) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.write = r6     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x00d1:
                byte[] r6 = r2.write     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.read((byte[]) r4, (byte[]) r5, (byte[]) r6)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.MediaDescriptionCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x00d9:
                byte[] r4 = r2.MediaDescriptionCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                r0.MediaBrowserCompat$MediaItem = r4     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = r2.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ NTLMEngineException -> 0x0146 }
                r0.MediaMetadataCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
                r4 = r1 & 128(0x80, float:1.794E-43)
                if (r4 == 0) goto L_0x00ed
                byte[] r3 = r2.IconCompatParcelizer()     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x00ed:
                byte[] r4 = r2.MediaMetadataCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x0111
                byte[] r4 = r2.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = r2.IconCompatParcelizer     // Catch:{ NTLMEngineException -> 0x0146 }
                int r6 = r5.length     // Catch:{ NTLMEngineException -> 0x0146 }
                int r7 = r4.length     // Catch:{ NTLMEngineException -> 0x0146 }
                int r6 = r6 + r7
                byte[] r6 = new byte[r6]     // Catch:{ NTLMEngineException -> 0x0146 }
                int r7 = r5.length     // Catch:{ NTLMEngineException -> 0x0146 }
                java.lang.System.arraycopy(r5, r15, r6, r15, r7)     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = r2.IconCompatParcelizer     // Catch:{ NTLMEngineException -> 0x0146 }
                int r5 = r5.length     // Catch:{ NTLMEngineException -> 0x0146 }
                int r7 = r4.length     // Catch:{ NTLMEngineException -> 0x0146 }
                java.lang.System.arraycopy(r4, r15, r6, r5, r7)     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = r2.write()     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver((byte[]) r6, (byte[]) r4)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.MediaMetadataCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x0111:
                byte[] r3 = r2.MediaMetadataCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x0114:
                byte[] r4 = r2.ParcelableVolumeInfo     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x012e
                byte[] r4 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                if (r4 != 0) goto L_0x0124
                java.lang.String r4 = r2.MediaSessionCompat$QueueItem     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.read((java.lang.String) r4)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.RatingCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x0124:
                byte[] r4 = r2.RatingCompat     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r5 = r2.IconCompatParcelizer     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver((byte[]) r4, (byte[]) r5)     // Catch:{ NTLMEngineException -> 0x0146 }
                r2.ParcelableVolumeInfo = r4     // Catch:{ NTLMEngineException -> 0x0146 }
            L_0x012e:
                byte[] r4 = r2.ParcelableVolumeInfo     // Catch:{ NTLMEngineException -> 0x0146 }
                r0.MediaBrowserCompat$MediaItem = r4     // Catch:{ NTLMEngineException -> 0x0146 }
                byte[] r4 = r2.MediaBrowserCompat$ItemReceiver()     // Catch:{ NTLMEngineException -> 0x0146 }
                r0.MediaMetadataCompat = r4     // Catch:{ NTLMEngineException -> 0x0146 }
                r4 = r1 & 128(0x80, float:1.794E-43)
                if (r4 == 0) goto L_0x0141
                byte[] r3 = r2.IconCompatParcelizer()     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x0141:
                byte[] r3 = r2.write()     // Catch:{ NTLMEngineException -> 0x0146 }
                goto L_0x017d
            L_0x0146:
                byte[] r4 = new byte[r15]
                r0.MediaBrowserCompat$MediaItem = r4
                byte[] r4 = r2.MediaBrowserCompat$ItemReceiver()
                r0.MediaMetadataCompat = r4
                r4 = r1 & 128(0x80, float:1.794E-43)
                if (r4 == 0) goto L_0x0159
                byte[] r3 = r2.IconCompatParcelizer()
                goto L_0x017d
            L_0x0159:
                byte[] r4 = r2.read
                if (r4 != 0) goto L_0x017b
                byte[] r4 = new byte[r3]
                r2.read = r4
                byte[] r4 = r2.MediaBrowserCompat$ItemReceiver
                if (r4 != 0) goto L_0x016d
                java.lang.String r4 = r2.MediaSessionCompat$QueueItem
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.write((java.lang.String) r4)
                r2.MediaBrowserCompat$ItemReceiver = r4
            L_0x016d:
                byte[] r4 = r2.MediaBrowserCompat$ItemReceiver
                byte[] r5 = r2.read
                r6 = 8
                java.lang.System.arraycopy(r4, r15, r5, r15, r6)
                byte[] r4 = r2.read
                java.util.Arrays.fill(r4, r6, r3, r15)
            L_0x017b:
                byte[] r3 = r2.read
            L_0x017d:
                r4 = r1 & 16
                if (r4 == 0) goto L_0x01a2
                r4 = 1073741824(0x40000000, float:2.0)
                r4 = r4 & r1
                if (r4 == 0) goto L_0x019d
                byte[] r4 = r2.MediaSessionCompat$ResultReceiverWrapper
                if (r4 != 0) goto L_0x0192
                java.util.Random r4 = r2.MediaSessionCompat$Token
                byte[] r4 = p040o.RtpEBillPaymentDetailActivity.read((java.util.Random) r4)
                r2.MediaSessionCompat$ResultReceiverWrapper = r4
            L_0x0192:
                byte[] r2 = r2.MediaSessionCompat$ResultReceiverWrapper
                r0.write = r2
                byte[] r2 = p040o.RtpEBillPaymentDetailActivity.write((byte[]) r2, (byte[]) r3)
                r0.MediaBrowserCompat$SearchResultReceiver = r2
                goto L_0x01aa
            L_0x019d:
                r0.MediaBrowserCompat$SearchResultReceiver = r3
                r0.write = r3
                goto L_0x01aa
            L_0x01a2:
                boolean r2 = r0.read
                if (r2 != 0) goto L_0x01cf
                r0.MediaBrowserCompat$SearchResultReceiver = r12
                r0.write = r12
            L_0x01aa:
                java.nio.charset.Charset r1 = p040o.RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver((int) r25)
                if (r13 == 0) goto L_0x01b5
                byte[] r2 = r13.getBytes(r1)
                goto L_0x01b6
            L_0x01b5:
                r2 = r12
            L_0x01b6:
                r0.MediaDescriptionCompat = r2
                if (r14 == 0) goto L_0x01c4
                java.util.Locale r2 = java.util.Locale.ROOT
                java.lang.String r2 = r14.toUpperCase(r2)
                byte[] r12 = r2.getBytes(r1)
            L_0x01c4:
                r0.MediaBrowserCompat$CustomActionResultReceiver = r12
                r2 = r22
                byte[] r1 = r2.getBytes(r1)
                r0.f5528x50fd9e4a = r1
                return
            L_0x01cf:
                org.apache.http.impl.auth.NTLMEngineException r1 = new org.apache.http.impl.auth.NTLMEngineException
                java.lang.String r2 = "Cannot sign/seal: no exported session key"
                r1.<init>(r2)
                throw r1
            L_0x01d7:
                org.apache.http.impl.auth.NTLMEngineException r1 = new org.apache.http.impl.auth.NTLMEngineException
                java.lang.String r2 = "Random generator not available"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RtpEBillPaymentDetailActivity.MediaDescriptionCompat.<init>(java.util.Random, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], int, java.lang.String, byte[], java.security.cert.Certificate, byte[], byte[]):void");
        }

        /* access modifiers changed from: protected */
        public final void write() {
            int length = this.MediaBrowserCompat$MediaItem.length;
            int length2 = this.MediaMetadataCompat.length;
            byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            int length3 = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.MediaDescriptionCompat;
            int length4 = bArr2 != null ? bArr2.length : 0;
            int length5 = this.f5528x50fd9e4a.length;
            byte[] bArr3 = this.MediaBrowserCompat$SearchResultReceiver;
            int length6 = bArr3 != null ? bArr3.length : 0;
            int i = (this.read ? 16 : 0) + 72;
            int i2 = i + length2;
            int i3 = i2 + length;
            int i4 = i3 + length3;
            int i5 = i4 + length5;
            int i6 = i5 + length4;
            read(i6 + length6, 3);
            write(length2);
            write(length2);
            MediaBrowserCompat$ItemReceiver(i);
            write(length);
            write(length);
            MediaBrowserCompat$ItemReceiver(i2);
            write(length3);
            write(length3);
            MediaBrowserCompat$ItemReceiver(i3);
            write(length5);
            write(length5);
            MediaBrowserCompat$ItemReceiver(i4);
            write(length4);
            write(length4);
            MediaBrowserCompat$ItemReceiver(i5);
            write(length6);
            write(length6);
            MediaBrowserCompat$ItemReceiver(i6);
            MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
            write(261);
            MediaBrowserCompat$ItemReceiver(2600);
            write(3840);
            int i7 = -1;
            if (this.read) {
                i7 = this.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver += 16;
            }
            read(this.MediaMetadataCompat);
            read(this.MediaBrowserCompat$MediaItem);
            read(this.MediaBrowserCompat$CustomActionResultReceiver);
            read(this.f5528x50fd9e4a);
            read(this.MediaDescriptionCompat);
            byte[] bArr4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (bArr4 != null) {
                read(bArr4);
            }
            if (this.read) {
                RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver = new RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(this.write);
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(this.RatingCompat);
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(this.MediaSessionCompat$Token);
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(this.IconCompatParcelizer);
                byte[] digest = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest();
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                byte[] digest2 = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest(digest);
                System.arraycopy(digest2, 0, this.IconCompatParcelizer, i7, digest2.length);
            }
        }
    }

    static void read(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    static MessageDigest read() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("MD5 message digest doesn't seem to exist - fatal error: ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: o.RtpEBillPaymentDetailActivity$write */
    static class write {
        private int IconCompatParcelizer = 271733878;
        private int MediaBrowserCompat$CustomActionResultReceiver = 1732584193;
        private int MediaBrowserCompat$ItemReceiver = -271733879;
        private byte[] MediaBrowserCompat$SearchResultReceiver = new byte[64];
        private long read = 0;
        private int write = -1732584194;

        write() {
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.read & 63);
            int i2 = 0;
            while (true) {
                int length = bArr.length;
                bArr2 = this.MediaBrowserCompat$SearchResultReceiver;
                if ((length - i2) + i < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.read += (long) length2;
                i2 += length2;
                IconCompatParcelizer();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.read += (long) length3;
            }
        }

        /* access modifiers changed from: package-private */
        public final byte[] write() {
            int i = (int) (this.read & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[(i2 + 8)];
            bArr[0] = ISOFileInfo.DATA_BYTES1;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((int) ((this.read << 3) >>> (i3 << 3)));
            }
            IconCompatParcelizer(bArr);
            byte[] bArr2 = new byte[16];
            RtpEBillPaymentDetailActivity.read(bArr2, this.MediaBrowserCompat$CustomActionResultReceiver, 0);
            RtpEBillPaymentDetailActivity.read(bArr2, this.MediaBrowserCompat$ItemReceiver, 4);
            RtpEBillPaymentDetailActivity.read(bArr2, this.write, 8);
            RtpEBillPaymentDetailActivity.read(bArr2, this.IconCompatParcelizer, 12);
            return bArr2;
        }

        private void IconCompatParcelizer() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.MediaBrowserCompat$SearchResultReceiver;
                int i2 = i << 2;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << Ascii.CAN);
            }
            int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i4 = this.MediaBrowserCompat$ItemReceiver;
            int i5 = this.write;
            int i6 = this.IconCompatParcelizer;
            int IconCompatParcelizer2 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(i4, i5, i6) + i3 + iArr[0], 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
            int IconCompatParcelizer3 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[1], 7);
            this.IconCompatParcelizer = IconCompatParcelizer3;
            int IconCompatParcelizer4 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[2], 11);
            this.write = IconCompatParcelizer4;
            int IconCompatParcelizer5 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer4, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[3], 19);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer5;
            int IconCompatParcelizer6 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer5, this.write, this.IconCompatParcelizer) + iArr[4], 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer6;
            int IconCompatParcelizer7 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer6, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[5], 7);
            this.IconCompatParcelizer = IconCompatParcelizer7;
            int IconCompatParcelizer8 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer7, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[6], 11);
            this.write = IconCompatParcelizer8;
            int IconCompatParcelizer9 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer8, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[7], 19);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer9;
            int IconCompatParcelizer10 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer9, this.write, this.IconCompatParcelizer) + iArr[8], 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer10;
            int IconCompatParcelizer11 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer10, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[9], 7);
            this.IconCompatParcelizer = IconCompatParcelizer11;
            int IconCompatParcelizer12 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer11, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[10], 11);
            this.write = IconCompatParcelizer12;
            int IconCompatParcelizer13 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer12, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[11], 19);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer13;
            int IconCompatParcelizer14 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer13, this.write, this.IconCompatParcelizer) + iArr[12], 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer14;
            int IconCompatParcelizer15 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer14, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[13], 7);
            this.IconCompatParcelizer = IconCompatParcelizer15;
            int IconCompatParcelizer16 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer15, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[14], 11);
            this.write = IconCompatParcelizer16;
            int IconCompatParcelizer17 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer16, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[15], 19);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer17;
            int IconCompatParcelizer18 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer17, this.write, this.IconCompatParcelizer) + iArr[0] + 1518500249, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer18;
            int IconCompatParcelizer19 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer18, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[4] + 1518500249, 5);
            this.IconCompatParcelizer = IconCompatParcelizer19;
            int IconCompatParcelizer20 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer19, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[8] + 1518500249, 9);
            this.write = IconCompatParcelizer20;
            int IconCompatParcelizer21 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer20, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[12] + 1518500249, 13);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer21;
            int IconCompatParcelizer22 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer21, this.write, this.IconCompatParcelizer) + iArr[1] + 1518500249, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer22;
            int IconCompatParcelizer23 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer22, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[5] + 1518500249, 5);
            this.IconCompatParcelizer = IconCompatParcelizer23;
            int IconCompatParcelizer24 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer23, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[9] + 1518500249, 9);
            this.write = IconCompatParcelizer24;
            int IconCompatParcelizer25 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer24, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[13] + 1518500249, 13);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer25;
            int IconCompatParcelizer26 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer25, this.write, this.IconCompatParcelizer) + iArr[2] + 1518500249, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer26;
            int IconCompatParcelizer27 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer26, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[6] + 1518500249, 5);
            this.IconCompatParcelizer = IconCompatParcelizer27;
            int IconCompatParcelizer28 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer27, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[10] + 1518500249, 9);
            this.write = IconCompatParcelizer28;
            int IconCompatParcelizer29 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer28, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[14] + 1518500249, 13);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer29;
            int IconCompatParcelizer30 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer29, this.write, this.IconCompatParcelizer) + iArr[3] + 1518500249, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer30;
            int IconCompatParcelizer31 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer30, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[7] + 1518500249, 5);
            this.IconCompatParcelizer = IconCompatParcelizer31;
            int IconCompatParcelizer32 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer31, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[11] + 1518500249, 9);
            this.write = IconCompatParcelizer32;
            int IconCompatParcelizer33 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.read(IconCompatParcelizer32, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[15] + 1518500249, 13);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer33;
            int IconCompatParcelizer34 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer33, this.write, this.IconCompatParcelizer) + iArr[0] + 1859775393, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer34;
            int IconCompatParcelizer35 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer34, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[8] + 1859775393, 9);
            this.IconCompatParcelizer = IconCompatParcelizer35;
            int IconCompatParcelizer36 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer35, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[4] + 1859775393, 11);
            this.write = IconCompatParcelizer36;
            int IconCompatParcelizer37 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer36, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[12] + 1859775393, 15);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer37;
            int IconCompatParcelizer38 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer37, this.write, this.IconCompatParcelizer) + iArr[2] + 1859775393, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer38;
            int IconCompatParcelizer39 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer38, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[10] + 1859775393, 9);
            this.IconCompatParcelizer = IconCompatParcelizer39;
            int IconCompatParcelizer40 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer39, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[6] + 1859775393, 11);
            this.write = IconCompatParcelizer40;
            int IconCompatParcelizer41 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer40, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[14] + 1859775393, 15);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer41;
            int IconCompatParcelizer42 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer41, this.write, this.IconCompatParcelizer) + iArr[1] + 1859775393, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer42;
            int IconCompatParcelizer43 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer42, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[9] + 1859775393, 9);
            this.IconCompatParcelizer = IconCompatParcelizer43;
            int IconCompatParcelizer44 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer43, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[5] + 1859775393, 11);
            this.write = IconCompatParcelizer44;
            int IconCompatParcelizer45 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer44, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[13] + 1859775393, 15);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer45;
            int IconCompatParcelizer46 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer45, this.write, this.IconCompatParcelizer) + iArr[3] + 1859775393, 3);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer46;
            int IconCompatParcelizer47 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.IconCompatParcelizer + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer46, this.MediaBrowserCompat$ItemReceiver, this.write) + iArr[11] + 1859775393, 9);
            this.IconCompatParcelizer = IconCompatParcelizer47;
            int IconCompatParcelizer48 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.write + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer47, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver) + iArr[7] + 1859775393, 11);
            this.write = IconCompatParcelizer48;
            int IconCompatParcelizer49 = RtpEBillPaymentDetailActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver + RtpEBillPaymentDetailActivity.IconCompatParcelizer(IconCompatParcelizer48, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) + iArr[15] + 1859775393, 15);
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer49;
            this.MediaBrowserCompat$CustomActionResultReceiver += i3;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer49 + i4;
            this.write += i5;
            this.IconCompatParcelizer += i6;
        }
    }

    public final String MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5) throws NTLMEngineException {
        C9817x44565b56 rtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver = new C9817x44565b56(str5);
        return new MediaDescriptionCompat((String) null, (String) null, (String) null, (String) null, rtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, rtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver.write, rtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver.read, rtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ byte[] write(byte[] bArr, int i) {
        int i2;
        if (bArr.length < i + 2) {
            i2 = 0;
        } else {
            i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(bArr, i + 4);
        if (bArr.length < MediaBrowserCompat$CustomActionResultReceiver2 + i2) {
            return new byte[i2];
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, MediaBrowserCompat$CustomActionResultReceiver2, bArr2, 0, i2);
        return bArr2;
    }

    static /* synthetic */ String IconCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(46);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    static /* synthetic */ String MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(46);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    static /* synthetic */ Charset MediaBrowserCompat$ItemReceiver(int i) throws NTLMEngineException {
        if ((i & 1) == 0) {
            return read;
        }
        Charset charset = RatingCompat;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    static /* synthetic */ byte[] read(String str) throws NTLMEngineException {
        Charset charset = RatingCompat;
        if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            write write2 = new write();
            write2.IconCompatParcelizer(bytes);
            return write2.write();
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    static /* synthetic */ byte[] write(String str, String str2, byte[] bArr) throws NTLMEngineException {
        if (RatingCompat != null) {
            RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver = new RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(bArr);
            rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(str2.toUpperCase(Locale.ROOT).getBytes(RatingCompat));
            if (str != null) {
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(str.toUpperCase(Locale.ROOT).getBytes(RatingCompat));
            }
            byte[] digest = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest();
            rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            return rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest(digest);
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    static /* synthetic */ byte[] MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, byte[] bArr) throws NTLMEngineException {
        if (RatingCompat != null) {
            RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver = new RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(bArr);
            rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(str2.toUpperCase(Locale.ROOT).getBytes(RatingCompat));
            if (str != null) {
                rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(str.getBytes(RatingCompat));
            }
            byte[] digest = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest();
            rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            return rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest(digest);
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    static /* synthetic */ byte[] write(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver = new RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(bArr);
        rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(bArr2);
        rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(bArr3);
        byte[] digest = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest();
        rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.update(rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        byte[] digest2 = rtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver.read.digest(digest);
        byte[] bArr4 = new byte[(digest2.length + bArr3.length)];
        System.arraycopy(digest2, 0, bArr4, 0, digest2.length);
        System.arraycopy(bArr3, 0, bArr4, digest2.length, bArr3.length);
        return bArr4;
    }

    public final String write() throws NTLMEngineException {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
