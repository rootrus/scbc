package p040o;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.PassportService;

/* renamed from: o.onMenuPromptPayClick */
public final class onMenuPromptPayClick implements Cloneable, onLoginButtonClick, PinLoginActivity {
    private static final byte[] write = {ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};
    public long IconCompatParcelizer;
    BaseQuickTopUpReviewActivity read;

    public final /* bridge */ /* synthetic */ onLoginButtonClick IconCompatParcelizer() throws IOException {
        return this;
    }

    public final onMenuPromptPayClick MediaBrowserCompat$ItemReceiver() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final onLoginButtonClick write() {
        return this;
    }

    public final OutputStream RatingCompat() {
        return new OutputStream() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void write(int i) {
                onMenuPromptPayClick.this.MediaBrowserCompat$ItemReceiver((int) (byte) i);
            }

            public final void write(byte[] bArr, int i, int i2) {
                onMenuPromptPayClick.this.MediaBrowserCompat$CustomActionResultReceiver(bArr, i, i2);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        };
    }

    public final boolean read() {
        return this.IconCompatParcelizer == 0;
    }

    public final void MediaDescriptionCompat(long j) throws EOFException {
        if (this.IconCompatParcelizer < j) {
            throw new EOFException();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j) {
        return this.IconCompatParcelizer >= j;
    }

    public final InputStream MediaBrowserCompat$SearchResultReceiver() {
        return new InputStream() {
            public final void close() {
            }

            public final int read() {
                if (onMenuPromptPayClick.this.IconCompatParcelizer > 0) {
                    return onMenuPromptPayClick.this.MediaMetadataCompat() & 255;
                }
                return -1;
            }

            public final int read(byte[] bArr, int i, int i2) {
                return onMenuPromptPayClick.this.write(bArr, i, i2);
            }

            public final int available() {
                return (int) Math.min(onMenuPromptPayClick.this.IconCompatParcelizer, 2147483647L);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(onMenuPromptPayClick.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final onMenuPromptPayClick MediaBrowserCompat$ItemReceiver(onMenuPromptPayClick onmenupromptpayclick, long j, long j2) {
        if (onmenupromptpayclick != null) {
            ModifyQuickTopUpActivity.IconCompatParcelizer(this.IconCompatParcelizer, j, j2);
            if (j2 == 0) {
                return this;
            }
            onmenupromptpayclick.IconCompatParcelizer += j2;
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            while (j >= ((long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat))) {
                j -= (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
                baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
            }
            while (j2 > 0) {
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = new BaseQuickTopUpReviewActivity(baseQuickTopUpReviewActivity);
                baseQuickTopUpReviewActivity2.MediaMetadataCompat = (int) (((long) baseQuickTopUpReviewActivity2.MediaMetadataCompat) + j);
                baseQuickTopUpReviewActivity2.IconCompatParcelizer = Math.min(baseQuickTopUpReviewActivity2.MediaMetadataCompat + ((int) j2), baseQuickTopUpReviewActivity2.IconCompatParcelizer);
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity3 = onmenupromptpayclick.read;
                if (baseQuickTopUpReviewActivity3 == null) {
                    baseQuickTopUpReviewActivity2.write = baseQuickTopUpReviewActivity2;
                    baseQuickTopUpReviewActivity2.read = baseQuickTopUpReviewActivity2;
                    onmenupromptpayclick.read = baseQuickTopUpReviewActivity2;
                } else {
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity4 = baseQuickTopUpReviewActivity3.write;
                    baseQuickTopUpReviewActivity2.write = baseQuickTopUpReviewActivity4;
                    baseQuickTopUpReviewActivity2.read = baseQuickTopUpReviewActivity4.read;
                    baseQuickTopUpReviewActivity4.read.write = baseQuickTopUpReviewActivity2;
                    baseQuickTopUpReviewActivity4.read = baseQuickTopUpReviewActivity2;
                }
                j2 -= (long) (baseQuickTopUpReviewActivity2.IconCompatParcelizer - baseQuickTopUpReviewActivity2.MediaMetadataCompat);
                baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final byte MediaMetadataCompat() {
        if (this.IconCompatParcelizer != 0) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            int i = baseQuickTopUpReviewActivity.MediaMetadataCompat;
            int i2 = baseQuickTopUpReviewActivity.IconCompatParcelizer;
            int i3 = i + 1;
            byte b = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver[i];
            this.IconCompatParcelizer--;
            if (i3 == i2) {
                this.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
            } else {
                baseQuickTopUpReviewActivity.MediaMetadataCompat = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte write(long j) {
        ModifyQuickTopUpActivity.IconCompatParcelizer(this.IconCompatParcelizer, j, 1);
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        while (true) {
            long j2 = (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
            if (j < j2) {
                return baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver[baseQuickTopUpReviewActivity.MediaMetadataCompat + ((int) j)];
            }
            j -= j2;
            baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
        }
    }

    public final short MediaSessionCompat$Token() {
        int i;
        byte b;
        if (this.IconCompatParcelizer >= 2) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            int i2 = baseQuickTopUpReviewActivity.MediaMetadataCompat;
            int i3 = baseQuickTopUpReviewActivity.IconCompatParcelizer;
            if (i3 - i2 < 2) {
                i = (MediaMetadataCompat() & 255) << 8;
                b = MediaMetadataCompat() & 255;
            } else {
                byte[] bArr = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                int i5 = i4 + 1;
                byte b3 = bArr[i4];
                this.IconCompatParcelizer -= 2;
                if (i5 == i3) {
                    this.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
                } else {
                    baseQuickTopUpReviewActivity.MediaMetadataCompat = i5;
                }
                i = (b2 & 255) << 8;
                b = b3 & 255;
            }
            return (short) (i | b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.IconCompatParcelizer);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo56993x50fd9e4a() {
        byte b;
        byte b2;
        if (this.IconCompatParcelizer >= 4) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            int i = baseQuickTopUpReviewActivity.MediaMetadataCompat;
            int i2 = baseQuickTopUpReviewActivity.IconCompatParcelizer;
            if (i2 - i < 4) {
                b = ((MediaMetadataCompat() & 255) << Ascii.CAN) | ((MediaMetadataCompat() & 255) << 16) | ((MediaMetadataCompat() & 255) << 8);
                b2 = MediaMetadataCompat() & 255;
            } else {
                byte[] bArr = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int i3 = i + 1;
                byte b3 = bArr[i];
                int i4 = i3 + 1;
                byte b4 = bArr[i3];
                int i5 = i4 + 1;
                byte b5 = bArr[i4];
                int i6 = i5 + 1;
                byte b6 = bArr[i5];
                this.IconCompatParcelizer -= 4;
                if (i6 == i2) {
                    this.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
                } else {
                    baseQuickTopUpReviewActivity.MediaMetadataCompat = i6;
                }
                b = ((b3 & 255) << Ascii.CAN) | ((b4 & 255) << 16) | ((b5 & 255) << 8);
                b2 = b6 & 255;
            }
            return b | b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.IconCompatParcelizer);
        throw new IllegalStateException(sb.toString());
    }

    public final short ParcelableVolumeInfo() {
        return ModifyQuickTopUpActivity.write(MediaSessionCompat$Token());
    }

    public final int MediaSessionCompat$QueueItem() {
        return ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver(mo56993x50fd9e4a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r1 = new p040o.onMenuPromptPayClick().MediaBrowserCompat$MediaItem(r3).read((int) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r1.MediaMetadataCompat();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Number too large: ");
        r2.append(r1.Keep());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long MediaBrowserCompat$MediaItem() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.IconCompatParcelizer
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00c2
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x000f:
            o.BaseQuickTopUpReviewActivity r8 = r0.read
            byte[] r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r8.MediaMetadataCompat
            int r11 = r8.IconCompatParcelizer
        L_0x0017:
            r12 = 1
            if (r10 >= r11) goto L_0x009f
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x006b
            r15 = 57
            if (r13 > r15) goto L_0x006b
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x003e
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0038
            long r7 = (long) r14
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x003e
        L_0x0038:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0078
        L_0x003e:
            o.onMenuPromptPayClick r1 = new o.onMenuPromptPayClick
            r1.<init>()
            o.onMenuPromptPayClick r1 = r1.RatingCompat((long) r3)
            o.onMenuPromptPayClick r1 = r1.MediaBrowserCompat$ItemReceiver((int) r13)
            if (r5 != 0) goto L_0x0050
            r1.MediaMetadataCompat()
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r1 = r1.Keep()
            r2.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006b:
            r15 = r7
            r16 = r8
            r7 = 45
            if (r13 != r7) goto L_0x0080
            if (r6 != 0) goto L_0x0080
            r7 = 1
            long r1 = r1 - r7
            r5 = r12
        L_0x0078:
            int r10 = r10 + 1
            int r6 = r6 + 1
            r7 = r15
            r8 = r16
            goto L_0x0017
        L_0x0080:
            if (r6 == 0) goto L_0x0084
            r7 = r12
            goto L_0x00a2
        L_0x0084:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r13)
            r1.append(r2)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x009f:
            r15 = r7
            r16 = r8
        L_0x00a2:
            if (r10 != r11) goto L_0x00ae
            o.BaseQuickTopUpReviewActivity r8 = r16.MediaBrowserCompat$CustomActionResultReceiver()
            r0.read = r8
            p040o.HowToAddFavouriteTopUpActivity.IconCompatParcelizer(r16)
            goto L_0x00b2
        L_0x00ae:
            r8 = r16
            r8.MediaMetadataCompat = r10
        L_0x00b2:
            if (r7 != 0) goto L_0x00b8
            o.BaseQuickTopUpReviewActivity r8 = r0.read
            if (r8 != 0) goto L_0x000f
        L_0x00b8:
            long r1 = r0.IconCompatParcelizer
            long r6 = (long) r6
            long r1 = r1 - r6
            r0.IconCompatParcelizer = r1
            if (r5 != 0) goto L_0x00c1
            long r3 = -r3
        L_0x00c1:
            return r3
        L_0x00c2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onMenuPromptPayClick.MediaBrowserCompat$MediaItem():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r8 != r9) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r14.read = r6.MediaBrowserCompat$CustomActionResultReceiver();
        p040o.HowToAddFavouriteTopUpActivity.IconCompatParcelizer(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r6.MediaMetadataCompat = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r1 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r14 = this;
            long r0 = r14.IconCompatParcelizer
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            o.BaseQuickTopUpReviewActivity r6 = r14.read
            byte[] r7 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r6.MediaMetadataCompat
            int r9 = r6.IconCompatParcelizer
        L_0x0013:
            if (r8 >= r9) goto L_0x0090
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x0071
            r11 = 70
            if (r10 > r11) goto L_0x0071
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            o.onMenuPromptPayClick r0 = new o.onMenuPromptPayClick
            r0.<init>()
            o.onMenuPromptPayClick r0 = r0.ParcelableVolumeInfo((long) r4)
            o.onMenuPromptPayClick r0 = r0.MediaBrowserCompat$ItemReceiver((int) r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r0 = r0.Keep()
            r1.append(r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0071:
            if (r0 == 0) goto L_0x0075
            r1 = 1
            goto L_0x0090
        L_0x0075:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
            r0.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0090:
            if (r8 != r9) goto L_0x009c
            o.BaseQuickTopUpReviewActivity r7 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            r14.read = r7
            p040o.HowToAddFavouriteTopUpActivity.IconCompatParcelizer(r6)
            goto L_0x009e
        L_0x009c:
            r6.MediaMetadataCompat = r8
        L_0x009e:
            if (r1 != 0) goto L_0x00a4
            o.BaseQuickTopUpReviewActivity r6 = r14.read
            if (r6 != 0) goto L_0x000b
        L_0x00a4:
            long r1 = r14.IconCompatParcelizer
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.IconCompatParcelizer = r1
            return r4
        L_0x00ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onMenuPromptPayClick.MediaSessionCompat$ResultReceiverWrapper():long");
    }

    public final PinLoginActivity_ViewBinding IconCompatParcelizer(long j) throws EOFException {
        return new PinLoginActivity_ViewBinding(read(j));
    }

    public final String Keep() {
        try {
            return write(this.IconCompatParcelizer, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String write(long j, Charset charset) throws EOFException {
        ModifyQuickTopUpActivity.IconCompatParcelizer(this.IconCompatParcelizer, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            if (((long) baseQuickTopUpReviewActivity.MediaMetadataCompat) + j > ((long) baseQuickTopUpReviewActivity.IconCompatParcelizer)) {
                return new String(read(j), charset);
            }
            String str = new String(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, (int) j, charset);
            baseQuickTopUpReviewActivity.MediaMetadataCompat = (int) (((long) baseQuickTopUpReviewActivity.MediaMetadataCompat) + j);
            this.IconCompatParcelizer -= j;
            if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                this.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
                HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
            }
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    public final String MediaBrowserCompat$ItemReceiver(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (write(j2) == 13) {
                String write2 = write(j2, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                MediaMetadataCompat(2);
                return write2;
            }
        }
        String write3 = write(j, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
        MediaMetadataCompat(1);
        return write3;
    }

    public final byte[] MediaDescriptionCompat() {
        try {
            return read(this.IconCompatParcelizer);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] read(long j) throws EOFException {
        ModifyQuickTopUpActivity.IconCompatParcelizer(this.IconCompatParcelizer, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            read(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    private void read(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int write2 = write(bArr, i, bArr.length - i);
            if (write2 != -1) {
                i += write2;
            } else {
                throw new EOFException();
            }
        }
    }

    public final int write(byte[] bArr, int i, int i2) {
        ModifyQuickTopUpActivity.IconCompatParcelizer((long) bArr.length, (long) i, (long) i2);
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        if (baseQuickTopUpReviewActivity == null) {
            return -1;
        }
        int min = Math.min(i2, baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
        System.arraycopy(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, bArr, i, min);
        baseQuickTopUpReviewActivity.MediaMetadataCompat += min;
        this.IconCompatParcelizer -= (long) min;
        if (baseQuickTopUpReviewActivity.MediaMetadataCompat == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
            this.read = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity);
        }
        return min;
    }

    public final void MediaMetadataCompat(long j) throws EOFException {
        while (j > 0) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            if (baseQuickTopUpReviewActivity != null) {
                int min = (int) Math.min(j, (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - this.read.MediaMetadataCompat));
                long j2 = (long) min;
                this.IconCompatParcelizer -= j2;
                j -= j2;
                this.read.MediaMetadataCompat += min;
                if (this.read.MediaMetadataCompat == this.read.IconCompatParcelizer) {
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = this.read;
                    this.read = baseQuickTopUpReviewActivity2.MediaBrowserCompat$CustomActionResultReceiver();
                    HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final onMenuPromptPayClick read(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    BaseQuickTopUpReviewActivity write2 = write(1);
                    byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
                    int i3 = write2.IconCompatParcelizer - i;
                    int min = Math.min(i2, 2048 - i3);
                    bArr[i + i3] = (byte) charAt;
                    i++;
                    while (i < min) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i + i3] = (byte) charAt2;
                        i++;
                    }
                    int i4 = (i3 + i) - write2.IconCompatParcelizer;
                    write2.IconCompatParcelizer += i4;
                    this.IconCompatParcelizer += (long) i4;
                } else {
                    if (charAt < 2048) {
                        MediaBrowserCompat$ItemReceiver((charAt >> 6) | 192);
                        MediaBrowserCompat$ItemReceiver((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        MediaBrowserCompat$ItemReceiver((charAt >> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE);
                        MediaBrowserCompat$ItemReceiver(((charAt >> 6) & 63) | 128);
                        MediaBrowserCompat$ItemReceiver((int) (charAt & '?') | 128);
                    } else {
                        int i5 = i + 1;
                        if (i5 < i2) {
                            c = str.charAt(i5);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            MediaBrowserCompat$ItemReceiver(63);
                            i = i5;
                        } else {
                            int i6 = (((charAt & 10239) << 10) | (9215 & c)) + 0;
                            MediaBrowserCompat$ItemReceiver((i6 >> 18) | 240);
                            MediaBrowserCompat$ItemReceiver(((i6 >> 12) & 63) | 128);
                            MediaBrowserCompat$ItemReceiver(((i6 >> 6) & 63) | 128);
                            MediaBrowserCompat$ItemReceiver((i6 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final onMenuPromptPayClick MediaBrowserCompat$SearchResultReceiver(int i) {
        if (i < 128) {
            MediaBrowserCompat$ItemReceiver(i);
        } else if (i < 2048) {
            MediaBrowserCompat$ItemReceiver((i >> 6) | 192);
            MediaBrowserCompat$ItemReceiver((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                MediaBrowserCompat$ItemReceiver((i >> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE);
                MediaBrowserCompat$ItemReceiver(((i >> 6) & 63) | 128);
                MediaBrowserCompat$ItemReceiver((i & 63) | 128);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected code point: ");
                sb.append(Integer.toHexString(i));
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (i <= 1114111) {
            MediaBrowserCompat$ItemReceiver((i >> 18) | 240);
            MediaBrowserCompat$ItemReceiver(((i >> 12) & 63) | 128);
            MediaBrowserCompat$ItemReceiver(((i >> 6) & 63) | 128);
            MediaBrowserCompat$ItemReceiver((i & 63) | 128);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected code point: ");
            sb2.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb2.toString());
        }
        return this;
    }

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public final onMenuPromptPayClick MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            ModifyQuickTopUpActivity.IconCompatParcelizer((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                BaseQuickTopUpReviewActivity write2 = write(1);
                int min = Math.min(i3 - i, 2048 - write2.IconCompatParcelizer);
                System.arraycopy(bArr, i, write2.MediaBrowserCompat$CustomActionResultReceiver, write2.IconCompatParcelizer, min);
                i += min;
                write2.IconCompatParcelizer += min;
            }
            this.IconCompatParcelizer += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long MediaBrowserCompat$ItemReceiver(HowToAddAccountActivity howToAddAccountActivity) throws IOException {
        if (howToAddAccountActivity != null) {
            long j = 0;
            while (true) {
                long read2 = howToAddAccountActivity.read(this, 2048);
                if (read2 == -1) {
                    return j;
                }
                j += read2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: read */
    public final onMenuPromptPayClick MediaBrowserCompat$ItemReceiver(int i) {
        BaseQuickTopUpReviewActivity write2 = write(1);
        byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = write2.IconCompatParcelizer;
        write2.IconCompatParcelizer = i2 + 1;
        bArr[i2] = (byte) i;
        this.IconCompatParcelizer++;
        return this;
    }

    /* renamed from: MediaDescriptionCompat */
    public final onMenuPromptPayClick MediaBrowserCompat$MediaItem(int i) {
        BaseQuickTopUpReviewActivity write2 = write(2);
        byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = write2.IconCompatParcelizer;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        write2.IconCompatParcelizer = i3 + 1;
        this.IconCompatParcelizer += 2;
        return this;
    }

    /* renamed from: IconCompatParcelizer */
    public final onMenuPromptPayClick MediaBrowserCompat$CustomActionResultReceiver(int i) {
        BaseQuickTopUpReviewActivity write2 = write(4);
        byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = write2.IconCompatParcelizer;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        write2.IconCompatParcelizer = i5 + 1;
        this.IconCompatParcelizer += 4;
        return this;
    }

    /* renamed from: MediaBrowserCompat$MediaItem */
    public final onMenuPromptPayClick RatingCompat(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return MediaBrowserCompat$ItemReceiver(48);
        }
        boolean z = false;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return read("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        int i2 = j < 100000000 ? j < 10000 ? j < 100 ? j >= 10 ? 2 : 1 : j < 1000 ? 3 : 4 : j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8 : j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        if (z) {
            i2++;
        }
        BaseQuickTopUpReviewActivity write2 = write(i2);
        byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = write2.IconCompatParcelizer + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = write[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        write2.IconCompatParcelizer += i2;
        this.IconCompatParcelizer += (long) i2;
        return this;
    }

    /* renamed from: MediaBrowserCompat$SearchResultReceiver */
    public final onMenuPromptPayClick ParcelableVolumeInfo(long j) {
        if (j == 0) {
            return MediaBrowserCompat$ItemReceiver(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        BaseQuickTopUpReviewActivity write2 = write(numberOfTrailingZeros);
        byte[] bArr = write2.MediaBrowserCompat$CustomActionResultReceiver;
        int i = write2.IconCompatParcelizer;
        for (int i2 = (write2.IconCompatParcelizer + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = write[(int) (15 & j)];
            j >>>= 4;
        }
        write2.IconCompatParcelizer += numberOfTrailingZeros;
        this.IconCompatParcelizer += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final BaseQuickTopUpReviewActivity write(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        if (baseQuickTopUpReviewActivity == null) {
            BaseQuickTopUpReviewActivity MediaBrowserCompat$ItemReceiver = HowToAddFavouriteTopUpActivity.MediaBrowserCompat$ItemReceiver();
            this.read = MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver.write = MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver.read = MediaBrowserCompat$ItemReceiver;
            return MediaBrowserCompat$ItemReceiver;
        }
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = baseQuickTopUpReviewActivity.write;
        if (baseQuickTopUpReviewActivity2.IconCompatParcelizer + i <= 2048 && baseQuickTopUpReviewActivity2.MediaBrowserCompat$ItemReceiver) {
            return baseQuickTopUpReviewActivity2;
        }
        BaseQuickTopUpReviewActivity MediaBrowserCompat$ItemReceiver2 = HowToAddFavouriteTopUpActivity.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.write = baseQuickTopUpReviewActivity2;
        MediaBrowserCompat$ItemReceiver2.read = baseQuickTopUpReviewActivity2.read;
        baseQuickTopUpReviewActivity2.read.write = MediaBrowserCompat$ItemReceiver2;
        baseQuickTopUpReviewActivity2.read = MediaBrowserCompat$ItemReceiver2;
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) {
        if (onmenupromptpayclick == null) {
            throw new IllegalArgumentException("source == null");
        } else if (onmenupromptpayclick != this) {
            ModifyQuickTopUpActivity.IconCompatParcelizer(onmenupromptpayclick.IconCompatParcelizer, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (onmenupromptpayclick.read.IconCompatParcelizer - onmenupromptpayclick.read.MediaMetadataCompat))) {
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = baseQuickTopUpReviewActivity != null ? baseQuickTopUpReviewActivity.write : null;
                    if (baseQuickTopUpReviewActivity2 != null && baseQuickTopUpReviewActivity2.MediaBrowserCompat$ItemReceiver) {
                        if ((((long) baseQuickTopUpReviewActivity2.IconCompatParcelizer) + j) - ((long) (baseQuickTopUpReviewActivity2.MediaDescriptionCompat ? 0 : baseQuickTopUpReviewActivity2.MediaMetadataCompat)) <= 2048) {
                            onmenupromptpayclick.read.read(baseQuickTopUpReviewActivity2, (int) j);
                            onmenupromptpayclick.IconCompatParcelizer -= j;
                            this.IconCompatParcelizer += j;
                            return;
                        }
                    }
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity3 = onmenupromptpayclick.read;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > baseQuickTopUpReviewActivity3.IconCompatParcelizer - baseQuickTopUpReviewActivity3.MediaMetadataCompat) {
                        throw new IllegalArgumentException();
                    }
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity4 = new BaseQuickTopUpReviewActivity(baseQuickTopUpReviewActivity3);
                    baseQuickTopUpReviewActivity4.IconCompatParcelizer = baseQuickTopUpReviewActivity4.MediaMetadataCompat + i2;
                    baseQuickTopUpReviewActivity3.MediaMetadataCompat += i2;
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity5 = baseQuickTopUpReviewActivity3.write;
                    baseQuickTopUpReviewActivity4.write = baseQuickTopUpReviewActivity5;
                    baseQuickTopUpReviewActivity4.read = baseQuickTopUpReviewActivity5.read;
                    baseQuickTopUpReviewActivity5.read.write = baseQuickTopUpReviewActivity4;
                    baseQuickTopUpReviewActivity5.read = baseQuickTopUpReviewActivity4;
                    onmenupromptpayclick.read = baseQuickTopUpReviewActivity4;
                }
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity6 = onmenupromptpayclick.read;
                long j2 = (long) (baseQuickTopUpReviewActivity6.IconCompatParcelizer - baseQuickTopUpReviewActivity6.MediaMetadataCompat);
                onmenupromptpayclick.read = baseQuickTopUpReviewActivity6.MediaBrowserCompat$CustomActionResultReceiver();
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity7 = this.read;
                if (baseQuickTopUpReviewActivity7 == null) {
                    this.read = baseQuickTopUpReviewActivity6;
                    baseQuickTopUpReviewActivity6.write = baseQuickTopUpReviewActivity6;
                    baseQuickTopUpReviewActivity6.read = baseQuickTopUpReviewActivity6;
                } else {
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity8 = baseQuickTopUpReviewActivity7.write;
                    baseQuickTopUpReviewActivity6.write = baseQuickTopUpReviewActivity8;
                    baseQuickTopUpReviewActivity6.read = baseQuickTopUpReviewActivity8.read;
                    baseQuickTopUpReviewActivity8.read.write = baseQuickTopUpReviewActivity6;
                    baseQuickTopUpReviewActivity8.read = baseQuickTopUpReviewActivity6;
                    BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity9 = baseQuickTopUpReviewActivity6.write;
                    if (baseQuickTopUpReviewActivity9 == baseQuickTopUpReviewActivity6) {
                        throw new IllegalStateException();
                    } else if (baseQuickTopUpReviewActivity9.MediaBrowserCompat$ItemReceiver) {
                        int i3 = baseQuickTopUpReviewActivity6.IconCompatParcelizer - baseQuickTopUpReviewActivity6.MediaMetadataCompat;
                        int i4 = baseQuickTopUpReviewActivity9.IconCompatParcelizer;
                        if (!baseQuickTopUpReviewActivity9.MediaDescriptionCompat) {
                            i = baseQuickTopUpReviewActivity9.MediaMetadataCompat;
                        }
                        if (i3 <= (2048 - i4) + i) {
                            baseQuickTopUpReviewActivity6.read(baseQuickTopUpReviewActivity6.write, i3);
                            baseQuickTopUpReviewActivity6.MediaBrowserCompat$CustomActionResultReceiver();
                            HowToAddFavouriteTopUpActivity.IconCompatParcelizer(baseQuickTopUpReviewActivity6);
                        }
                    }
                }
                onmenupromptpayclick.IconCompatParcelizer -= j2;
                this.IconCompatParcelizer += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) {
        if (onmenupromptpayclick == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.IconCompatParcelizer;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            onmenupromptpayclick.write(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        return IconCompatParcelizer(b, 0);
    }

    public final long IconCompatParcelizer(byte b, long j) {
        if (j >= 0) {
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            if (baseQuickTopUpReviewActivity == null) {
                return -1;
            }
            long j2 = 0;
            do {
                long j3 = (long) (baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
                if (j >= j3) {
                    j -= j3;
                } else {
                    byte[] bArr = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    int i = baseQuickTopUpReviewActivity.IconCompatParcelizer;
                    for (int i2 = (int) (((long) baseQuickTopUpReviewActivity.MediaMetadataCompat) + j); i2 < i; i2++) {
                        if (bArr[i2] == b) {
                            return (j2 + ((long) i2)) - ((long) baseQuickTopUpReviewActivity.MediaMetadataCompat);
                        }
                    }
                    j = 0;
                }
                j2 += j3;
                baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
            } while (baseQuickTopUpReviewActivity != this.read);
            return -1;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return ModifyQuickPromptPayActivity.NONE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMenuPromptPayClick)) {
            return false;
        }
        onMenuPromptPayClick onmenupromptpayclick = (onMenuPromptPayClick) obj;
        long j = this.IconCompatParcelizer;
        if (j != onmenupromptpayclick.IconCompatParcelizer) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = onmenupromptpayclick.read;
        int i = baseQuickTopUpReviewActivity.MediaMetadataCompat;
        int i2 = baseQuickTopUpReviewActivity2.MediaMetadataCompat;
        while (j2 < this.IconCompatParcelizer) {
            long min = (long) Math.min(baseQuickTopUpReviewActivity.IconCompatParcelizer - i, baseQuickTopUpReviewActivity2.IconCompatParcelizer - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                if (baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver[i] != baseQuickTopUpReviewActivity2.MediaBrowserCompat$CustomActionResultReceiver[i2]) {
                    return false;
                }
                i3++;
                i++;
                i2++;
            }
            if (i == baseQuickTopUpReviewActivity.IconCompatParcelizer) {
                baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
                i = baseQuickTopUpReviewActivity.MediaMetadataCompat;
            }
            if (i2 == baseQuickTopUpReviewActivity2.IconCompatParcelizer) {
                baseQuickTopUpReviewActivity2 = baseQuickTopUpReviewActivity2.read;
                i2 = baseQuickTopUpReviewActivity2.MediaMetadataCompat;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        if (baseQuickTopUpReviewActivity == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = baseQuickTopUpReviewActivity.IconCompatParcelizer;
            for (int i3 = baseQuickTopUpReviewActivity.MediaMetadataCompat; i3 < i2; i3++) {
                i = (i * 31) + baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver[i3];
            }
            baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
        } while (baseQuickTopUpReviewActivity != this.read);
        return i;
    }

    public final String toString() {
        long j = this.IconCompatParcelizer;
        if (j == 0) {
            return "Buffer[size=0]";
        }
        if (j <= 16) {
            return String.format("Buffer[size=%s data=%s]", new Object[]{Long.valueOf(this.IconCompatParcelizer), new PinLoginActivity_ViewBinding(clone().MediaDescriptionCompat()).MediaBrowserCompat$CustomActionResultReceiver()});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(this.read.MediaBrowserCompat$CustomActionResultReceiver, this.read.MediaMetadataCompat, this.read.IconCompatParcelizer - this.read.MediaMetadataCompat);
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
            while (true) {
                baseQuickTopUpReviewActivity = baseQuickTopUpReviewActivity.read;
                if (baseQuickTopUpReviewActivity != this.read) {
                    instance.update(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, baseQuickTopUpReviewActivity.IconCompatParcelizer - baseQuickTopUpReviewActivity.MediaMetadataCompat);
                } else {
                    return String.format("Buffer[size=%s md5=%s]", new Object[]{Long.valueOf(this.IconCompatParcelizer), PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(instance.digest()).MediaBrowserCompat$CustomActionResultReceiver()});
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final onMenuPromptPayClick clone() {
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        if (this.IconCompatParcelizer == 0) {
            return onmenupromptpayclick;
        }
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = new BaseQuickTopUpReviewActivity(this.read);
        onmenupromptpayclick.read = baseQuickTopUpReviewActivity;
        baseQuickTopUpReviewActivity.write = baseQuickTopUpReviewActivity;
        baseQuickTopUpReviewActivity.read = baseQuickTopUpReviewActivity;
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = this.read;
        while (true) {
            baseQuickTopUpReviewActivity2 = baseQuickTopUpReviewActivity2.read;
            if (baseQuickTopUpReviewActivity2 != this.read) {
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity3 = onmenupromptpayclick.read.write;
                BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity4 = new BaseQuickTopUpReviewActivity(baseQuickTopUpReviewActivity2);
                baseQuickTopUpReviewActivity4.write = baseQuickTopUpReviewActivity3;
                baseQuickTopUpReviewActivity4.read = baseQuickTopUpReviewActivity3.read;
                baseQuickTopUpReviewActivity3.read.write = baseQuickTopUpReviewActivity4;
                baseQuickTopUpReviewActivity3.read = baseQuickTopUpReviewActivity4;
            } else {
                onmenupromptpayclick.IconCompatParcelizer = this.IconCompatParcelizer;
                return onmenupromptpayclick;
            }
        }
    }

    public final String PlaybackStateCompat$CustomAction() throws EOFException {
        long IconCompatParcelizer2 = IconCompatParcelizer((byte) 10, 0);
        if (IconCompatParcelizer2 != -1) {
            return MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
        }
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        MediaBrowserCompat$ItemReceiver(onmenupromptpayclick, 0, Math.min(32, this.IconCompatParcelizer));
        StringBuilder sb = new StringBuilder();
        sb.append("\\n not found: size=");
        sb.append(this.IconCompatParcelizer);
        sb.append(" content=");
        sb.append(new PinLoginActivity_ViewBinding(onmenupromptpayclick.MediaDescriptionCompat()).MediaBrowserCompat$CustomActionResultReceiver());
        sb.append("...");
        throw new EOFException(sb.toString());
    }

    /* renamed from: write */
    public final onMenuPromptPayClick IconCompatParcelizer(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) {
        if (pinLoginActivity_ViewBinding != null) {
            byte[] bArr = pinLoginActivity_ViewBinding.write;
            MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final /* synthetic */ onLoginButtonClick write(byte[] bArr) throws IOException {
        if (bArr != null) {
            return MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final /* synthetic */ onLoginButtonClick IconCompatParcelizer(String str) throws IOException {
        return read(str, 0, str.length());
    }
}
