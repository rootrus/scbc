package p040o;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.TypeCastException;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.PassportService;
import p040o.BasePersonalInfoActivity_ViewBinding;

/* renamed from: o.SCBUniversalWebViewActivity */
public final class SCBUniversalWebViewActivity implements NsipPartnerPaymentOtpActivity, NsipPartnerPaymentReviewActivity, Cloneable, ByteChannel {
    private static final byte[] MediaBrowserCompat$ItemReceiver;
    public long read;
    public PersonalizeActivity write;

    public final SCBUniversalWebViewActivity MediaMetadataCompat() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    public final /* synthetic */ NsipPartnerPaymentReviewActivity IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
        sCBUniversalWebViewActivity_ViewBinding.write(this);
        return this;
    }

    public final /* synthetic */ NsipPartnerPaymentReviewActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "string");
        return write(str, 0, str.length());
    }

    public final /* bridge */ /* synthetic */ NsipPartnerPaymentReviewActivity read() {
        return this;
    }

    public final /* bridge */ /* synthetic */ NsipPartnerPaymentReviewActivity write() {
        return this;
    }

    public final /* synthetic */ NsipPartnerPaymentReviewActivity write(byte[] bArr) {
        onGetStartedClick.write((Object) bArr, "source");
        return IconCompatParcelizer(bArr, 0, bArr.length);
    }

    /* renamed from: o.SCBUniversalWebViewActivity$write */
    public static final class write extends OutputStream {
        private /* synthetic */ SCBUniversalWebViewActivity IconCompatParcelizer;

        public final void close() {
        }

        public final void flush() {
        }

        public write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
            this.IconCompatParcelizer = sCBUniversalWebViewActivity;
        }

        public final void write(int i) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
        }

        public final void write(byte[] bArr, int i, int i2) {
            onGetStartedClick.write((Object) bArr, "data");
            this.IconCompatParcelizer.IconCompatParcelizer(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(".outputStream()");
            return sb.toString();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read == 0;
    }

    public final void MediaDescriptionCompat(long j) throws EOFException {
        if (this.read < j) {
            throw new EOFException();
        }
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver(long j) {
        return this.read >= j;
    }

    public final NsipPartnerPaymentOtpActivity MediaBrowserCompat$MediaItem() {
        return onSubmit.read((HowToAddAccountStep2Activity) new onPassportTabClicked(this));
    }

    /* renamed from: o.SCBUniversalWebViewActivity$read */
    public static final class read extends InputStream {
        private /* synthetic */ SCBUniversalWebViewActivity write;

        public final void close() {
        }

        public read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
            this.write = sCBUniversalWebViewActivity;
        }

        public final int read() {
            if (this.write.read > 0) {
                return this.write.MediaBrowserCompat$SearchResultReceiver() & 255;
            }
            return -1;
        }

        public final int read(byte[] bArr, int i, int i2) {
            onGetStartedClick.write((Object) bArr, "sink");
            return this.write.write(bArr, i, i2);
        }

        public final int available() {
            return (int) Math.min(this.write.read, 2147483647L);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.write);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    public final InputStream MediaDescriptionCompat() {
        return new read(this);
    }

    public final SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j, long j2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "out");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.read, j, j2);
        if (j2 == 0) {
            return this;
        }
        sCBUniversalWebViewActivity.read += j2;
        PersonalizeActivity personalizeActivity = this.write;
        while (true) {
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (j < ((long) (personalizeActivity.write - personalizeActivity.read))) {
                break;
            }
            j -= (long) (personalizeActivity.write - personalizeActivity.read);
            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
        }
        while (j2 > 0) {
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            personalizeActivity.MediaDescriptionCompat = true;
            PersonalizeActivity personalizeActivity2 = new PersonalizeActivity(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, personalizeActivity.write, true, false);
            personalizeActivity2.read += (int) j;
            personalizeActivity2.write = Math.min(personalizeActivity2.read + ((int) j2), personalizeActivity2.write);
            PersonalizeActivity personalizeActivity3 = sCBUniversalWebViewActivity.write;
            if (personalizeActivity3 == null) {
                personalizeActivity2.MediaMetadataCompat = personalizeActivity2;
                personalizeActivity2.MediaBrowserCompat$ItemReceiver = personalizeActivity2.MediaMetadataCompat;
                sCBUniversalWebViewActivity.write = personalizeActivity2.MediaBrowserCompat$ItemReceiver;
            } else {
                if (personalizeActivity3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                PersonalizeActivity personalizeActivity4 = personalizeActivity3.MediaMetadataCompat;
                if (personalizeActivity4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                personalizeActivity4.IconCompatParcelizer(personalizeActivity2);
            }
            j2 -= (long) (personalizeActivity2.write - personalizeActivity2.read);
            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            j = 0;
        }
        return this;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        long j = this.read;
        if (j == 0) {
            return 0;
        }
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        PersonalizeActivity personalizeActivity2 = personalizeActivity.MediaMetadataCompat;
        if (personalizeActivity2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return (personalizeActivity2.write >= 8192 || !personalizeActivity2.IconCompatParcelizer) ? j : j - ((long) (personalizeActivity2.write - personalizeActivity2.read));
    }

    public final byte MediaBrowserCompat$SearchResultReceiver() throws EOFException {
        if (this.read != 0) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int i = personalizeActivity.read;
            int i2 = personalizeActivity.write;
            int i3 = i + 1;
            byte b = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver[i];
            this.read--;
            if (i3 == i2) {
                this.write = personalizeActivity.read();
                PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
            } else {
                personalizeActivity.read = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final byte read(long j) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.read, j, 1);
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity != null) {
            long j2 = this.read;
            if (j2 - j < j) {
                while (j2 > j) {
                    personalizeActivity = personalizeActivity.MediaMetadataCompat;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    j2 -= (long) (personalizeActivity.write - personalizeActivity.read);
                }
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                return personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver[(int) ((((long) personalizeActivity.read) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                long j4 = ((long) (personalizeActivity.write - personalizeActivity.read)) + j3;
                if (j4 > j) {
                    break;
                }
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                j3 = j4;
            }
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver[(int) ((((long) personalizeActivity.read) + j) - j3)];
        }
        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        return null.MediaBrowserCompat$CustomActionResultReceiver[(int) (((long) null.read) + j + 1)];
    }

    public final short setHasDecor() throws EOFException {
        int i;
        byte b;
        if (this.read >= 2) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int i2 = personalizeActivity.read;
            int i3 = personalizeActivity.write;
            if (i3 - i2 < 2) {
                i = (MediaBrowserCompat$SearchResultReceiver() & 255) << 8;
                b = MediaBrowserCompat$SearchResultReceiver() & 255;
            } else {
                byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                int i5 = i4 + 1;
                byte b3 = bArr[i4];
                this.read -= 2;
                if (i5 == i3) {
                    this.write = personalizeActivity.read();
                    PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
                } else {
                    personalizeActivity.read = i5;
                }
                i = (b2 & 255) << 8;
                b = b3 & 255;
            }
            return (short) (i | b);
        }
        throw new EOFException();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo42948x50fd9e4a() throws EOFException {
        byte b;
        byte b2;
        if (this.read >= 4) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int i = personalizeActivity.read;
            int i2 = personalizeActivity.write;
            if (((long) (i2 - i)) < 4) {
                b = ((MediaBrowserCompat$SearchResultReceiver() & 255) << Ascii.CAN) | ((MediaBrowserCompat$SearchResultReceiver() & 255) << 16) | ((MediaBrowserCompat$SearchResultReceiver() & 255) << 8);
                b2 = MediaBrowserCompat$SearchResultReceiver() & 255;
            } else {
                byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int i3 = i + 1;
                byte b3 = bArr[i];
                int i4 = i3 + 1;
                byte b4 = bArr[i3];
                int i5 = i4 + 1;
                byte b5 = bArr[i4];
                int i6 = i5 + 1;
                byte b6 = bArr[i5];
                this.read -= 4;
                if (i6 == i2) {
                    this.write = personalizeActivity.read();
                    PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
                } else {
                    personalizeActivity.read = i6;
                }
                b = ((b3 & 255) << Ascii.CAN) | ((b4 & 255) << 16) | ((b5 & 255) << 8);
                b2 = b6 & 255;
            }
            return b | b2;
        }
        throw new EOFException();
    }

    public final long AlertController$RecycleListView() throws EOFException {
        if (this.read >= 8) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int i = personalizeActivity.read;
            int i2 = personalizeActivity.write;
            if (((long) (i2 - i)) < 8) {
                return ((((long) mo42948x50fd9e4a()) & 4294967295L) << 32) | (4294967295L & ((long) mo42948x50fd9e4a()));
            }
            byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = i + 1;
            long j = (long) bArr[i];
            int i4 = i3 + 1;
            long j2 = (long) bArr[i3];
            int i5 = i4 + 1;
            long j3 = (long) bArr[i4];
            int i6 = i5 + 1;
            long j4 = (long) bArr[i5];
            int i7 = i6 + 1;
            long j5 = (long) bArr[i6];
            int i8 = i7 + 1;
            long j6 = j5;
            int i9 = i8 + 1;
            long j7 = (long) bArr[i7];
            int i10 = i9 + 1;
            byte b = bArr[i9];
            long j8 = (long) bArr[i8];
            long j9 = (long) b;
            this.read -= 8;
            if (i10 == i2) {
                this.write = personalizeActivity.read();
                PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
            } else {
                personalizeActivity.read = i10;
            }
            return (j9 & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | ((j8 & 255) << 8);
        }
        throw new EOFException();
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() throws EOFException {
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo42948x50fd9e4a();
        return ((MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) << 8) | ((-16777216 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) >>> 24) | ((16711680 & MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) >>> 8) | ((MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r1 = new p040o.SCBUniversalWebViewActivity().MediaMetadataCompat(r3).write((int) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r1.MediaBrowserCompat$SearchResultReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Number too large: ");
        r2.append(r1.IconCompatParcelizer(r1.read, p040o.GroupFavoriteActivity.IconCompatParcelizer));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long MediaSessionCompat$Token() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.read
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00cf
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x000f:
            o.PersonalizeActivity r8 = r0.write
            if (r8 != 0) goto L_0x0016
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0016:
            byte[] r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r8.read
            int r11 = r8.write
        L_0x001c:
            r12 = 1
            if (r10 >= r11) goto L_0x00ac
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x0076
            r15 = 57
            if (r13 > r15) goto L_0x0076
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0043
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x003d
            long r7 = (long) r14
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0043
        L_0x003d:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0083
        L_0x0043:
            o.SCBUniversalWebViewActivity r1 = new o.SCBUniversalWebViewActivity
            r1.<init>()
            o.SCBUniversalWebViewActivity r1 = r1.RatingCompat(r3)
            o.SCBUniversalWebViewActivity r1 = r1.MediaBrowserCompat$ItemReceiver((int) r13)
            if (r5 != 0) goto L_0x0055
            r1.MediaBrowserCompat$SearchResultReceiver()
        L_0x0055:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            long r3 = r1.read
            java.nio.charset.Charset r5 = p040o.GroupFavoriteActivity.IconCompatParcelizer
            java.lang.String r1 = r1.IconCompatParcelizer(r3, r5)
            r2.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0076:
            r15 = r7
            r16 = r8
            r7 = 45
            if (r13 != r7) goto L_0x008b
            if (r6 != 0) goto L_0x008b
            r7 = 1
            long r1 = r1 - r7
            r5 = r12
        L_0x0083:
            int r10 = r10 + 1
            int r6 = r6 + 1
            r7 = r15
            r8 = r16
            goto L_0x001c
        L_0x008b:
            if (r6 == 0) goto L_0x008f
            r7 = r12
            goto L_0x00af
        L_0x008f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x00ac:
            r15 = r7
            r16 = r8
        L_0x00af:
            if (r10 != r11) goto L_0x00bb
            o.PersonalizeActivity r8 = r16.read()
            r0.write = r8
            p040o.PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(r16)
            goto L_0x00bf
        L_0x00bb:
            r8 = r16
            r8.read = r10
        L_0x00bf:
            if (r7 != 0) goto L_0x00c5
            o.PersonalizeActivity r8 = r0.write
            if (r8 != 0) goto L_0x000f
        L_0x00c5:
            long r1 = r0.read
            long r6 = (long) r6
            long r1 = r1 - r6
            r0.read = r1
            if (r5 != 0) goto L_0x00ce
            long r3 = -r3
        L_0x00ce:
            return r3
        L_0x00cf:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SCBUniversalWebViewActivity.MediaSessionCompat$Token():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[EDGE_INSN: B:47:0x009c->B:31:0x009c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long MediaSessionCompat$QueueItem() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.read
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b7
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            o.PersonalizeActivity r6 = r14.write
            if (r6 != 0) goto L_0x0012
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0012:
            byte[] r7 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r6.read
            int r9 = r6.write
        L_0x0018:
            if (r8 >= r9) goto L_0x009c
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x003d
        L_0x0027:
            r11 = 65
            r12 = 97
            if (r10 < r12) goto L_0x0033
            r13 = 102(0x66, float:1.43E-43)
            if (r10 > r13) goto L_0x0033
            r11 = r12
            goto L_0x0039
        L_0x0033:
            if (r10 < r11) goto L_0x007b
            r12 = 70
            if (r10 > r12) goto L_0x007b
        L_0x0039:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x003d:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004d
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x004d:
            o.SCBUniversalWebViewActivity r0 = new o.SCBUniversalWebViewActivity
            r0.<init>()
            o.SCBUniversalWebViewActivity r0 = r0.MediaSessionCompat$ResultReceiverWrapper(r4)
            o.SCBUniversalWebViewActivity r0 = r0.MediaBrowserCompat$ItemReceiver((int) r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            long r2 = r0.read
            java.nio.charset.Charset r4 = p040o.GroupFavoriteActivity.IconCompatParcelizer
            java.lang.String r0 = r0.IconCompatParcelizer(r2, r4)
            r1.append(r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009c
        L_0x007f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x009c:
            if (r8 != r9) goto L_0x00a8
            o.PersonalizeActivity r7 = r6.read()
            r14.write = r7
            p040o.PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            goto L_0x00aa
        L_0x00a8:
            r6.read = r8
        L_0x00aa:
            if (r1 != 0) goto L_0x00b0
            o.PersonalizeActivity r6 = r14.write
            if (r6 != 0) goto L_0x000b
        L_0x00b0:
            long r1 = r14.read
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.read = r1
            return r4
        L_0x00b7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SCBUniversalWebViewActivity.MediaSessionCompat$QueueItem():long");
    }

    public final SCBUniversalWebViewActivity_ViewBinding ParcelableVolumeInfo() {
        return new SCBUniversalWebViewActivity_ViewBinding(RatingCompat());
    }

    public final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver(long j) throws EOFException {
        return new SCBUniversalWebViewActivity_ViewBinding(MediaBrowserCompat$CustomActionResultReceiver(j));
    }

    public final int MediaBrowserCompat$ItemReceiver(onAlienCardTabClicked onaliencardtabclicked, boolean z) {
        int i;
        onAlienCardTabClicked onaliencardtabclicked2 = onaliencardtabclicked;
        onGetStartedClick.write((Object) onaliencardtabclicked2, "options");
        PersonalizeActivity personalizeActivity = this.write;
        int i2 = -1;
        if (personalizeActivity != null) {
            byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = personalizeActivity.read;
            int i4 = personalizeActivity.write;
            int[] iArr = onaliencardtabclicked2.MediaBrowserCompat$CustomActionResultReceiver;
            PersonalizeActivity personalizeActivity2 = personalizeActivity;
            int i5 = -1;
            int i6 = 0;
            loop0:
            while (true) {
                int i7 = i6 + 1;
                int i8 = iArr[i6];
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                if (i10 != i2) {
                    i5 = i10;
                }
                if (personalizeActivity2 == null) {
                    break;
                }
                if (i8 < 0) {
                    int i11 = i9;
                    while (true) {
                        int i12 = i3 + 1;
                        int i13 = i11 + 1;
                        if ((bArr[i3] & 255) != iArr[i11]) {
                            return i5;
                        }
                        boolean z2 = i13 == i9 - i8;
                        if (i12 == i4) {
                            if (personalizeActivity2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            PersonalizeActivity personalizeActivity3 = personalizeActivity2.MediaBrowserCompat$ItemReceiver;
                            if (personalizeActivity3 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            int i14 = personalizeActivity3.read;
                            byte[] bArr2 = personalizeActivity3.MediaBrowserCompat$CustomActionResultReceiver;
                            int i15 = personalizeActivity3.write;
                            if (personalizeActivity3 == personalizeActivity) {
                                if (!z2) {
                                    break loop0;
                                }
                                personalizeActivity3 = null;
                            }
                            i12 = i14;
                            i4 = i15;
                            byte[] bArr3 = bArr2;
                            personalizeActivity2 = personalizeActivity3;
                            bArr = bArr3;
                        }
                        if (z2) {
                            i = iArr[i13];
                            i3 = i12;
                            break;
                        }
                        i11 = i13;
                        i3 = i12;
                    }
                } else {
                    int i16 = i3 + 1;
                    byte b = bArr[i3];
                    int i17 = i9;
                    while (i17 != i9 + i8) {
                        if ((b & 255) == iArr[i17]) {
                            int i18 = iArr[i17 + i8];
                            if (i16 == i4) {
                                personalizeActivity2 = personalizeActivity2.MediaBrowserCompat$ItemReceiver;
                                if (personalizeActivity2 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                i16 = personalizeActivity2.read;
                                bArr = personalizeActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                                i4 = personalizeActivity2.write;
                                if (personalizeActivity2 == personalizeActivity) {
                                    personalizeActivity2 = null;
                                }
                            }
                            int i19 = i18;
                            i3 = i16;
                            i = i19;
                        } else {
                            i17++;
                        }
                    }
                    return i5;
                }
                if (i >= 0) {
                    return i;
                }
                i6 = -i;
                i2 = -1;
            }
            if (z) {
                return -2;
            }
            return i5;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws EOFException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        long j2 = this.read;
        if (j2 >= j) {
            sCBUniversalWebViewActivity.write(this, j);
        } else {
            sCBUniversalWebViewActivity.write(this, j2);
            throw new EOFException();
        }
    }

    public final long IconCompatParcelizer(PinChangeActivity pinChangeActivity) throws IOException {
        onGetStartedClick.write((Object) pinChangeActivity, "sink");
        long j = this.read;
        if (j > 0) {
            pinChangeActivity.write(this, j);
        }
        return j;
    }

    public final String write(Charset charset) {
        onGetStartedClick.write((Object) charset, "charset");
        return IconCompatParcelizer(this.read, charset);
    }

    public final String IconCompatParcelizer(long j, Charset charset) throws EOFException {
        onGetStartedClick.write((Object) charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= 2147483647L)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.read < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (((long) personalizeActivity.read) + j > ((long) personalizeActivity.write)) {
                return new String(MediaBrowserCompat$CustomActionResultReceiver(j), charset);
            }
            int i2 = (int) j;
            String str = new String(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, i2, charset);
            personalizeActivity.read += i2;
            this.read -= j;
            if (personalizeActivity.read == personalizeActivity.write) {
                this.write = personalizeActivity.read();
                PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
            }
            return str;
        }
    }

    public final String Keep() throws EOFException {
        return IconCompatParcelizer(Long.MAX_VALUE);
    }

    public final String IconCompatParcelizer(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long write2 = write((byte) 10, 0, j2);
            if (write2 != -1) {
                return write(write2);
            }
            if (j2 < this.read && read(j2 - 1) == 13 && read(j2) == 10) {
                return write(j2);
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity, 0, Math.min(32, this.read));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.read, j));
            sb.append(" content=");
            sb.append(sCBUniversalWebViewActivity.ParcelableVolumeInfo().read());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final String write(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (read(j2) == 13) {
                String IconCompatParcelizer2 = IconCompatParcelizer(j2, GroupFavoriteActivity.IconCompatParcelizer);
                MediaBrowserCompat$MediaItem(2);
                return IconCompatParcelizer2;
            }
        }
        String IconCompatParcelizer3 = IconCompatParcelizer(j, GroupFavoriteActivity.IconCompatParcelizer);
        MediaBrowserCompat$MediaItem(1);
        return IconCompatParcelizer3;
    }

    public final byte[] RatingCompat() {
        return MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.read >= j) {
            byte[] bArr = new byte[((int) j)];
            read(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final void read(byte[] bArr) throws EOFException {
        onGetStartedClick.write((Object) bArr, "sink");
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
        onGetStartedClick.write((Object) bArr, "sink");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((long) bArr.length, (long) i, (long) i2);
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            return -1;
        }
        int min = Math.min(i2, personalizeActivity.write - personalizeActivity.read);
        System.arraycopy(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, bArr, i, min);
        personalizeActivity.read += min;
        this.read -= (long) min;
        if (personalizeActivity.read == personalizeActivity.write) {
            this.write = personalizeActivity.read();
            PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
        }
        return min;
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        onGetStartedClick.write((Object) byteBuffer, "sink");
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), personalizeActivity.write - personalizeActivity.read);
        byteBuffer.put(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, min);
        personalizeActivity.read += min;
        this.read -= (long) min;
        if (personalizeActivity.read == personalizeActivity.write) {
            this.write = personalizeActivity.read();
            PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
        }
        return min;
    }

    public final void MediaBrowserCompat$MediaItem(long j) throws EOFException {
        while (j > 0) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity != null) {
                int min = (int) Math.min(j, (long) (personalizeActivity.write - personalizeActivity.read));
                long j2 = (long) min;
                this.read -= j2;
                j -= j2;
                personalizeActivity.read += min;
                if (personalizeActivity.read == personalizeActivity.write) {
                    this.write = personalizeActivity.read();
                    PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: IconCompatParcelizer */
    public final SCBUniversalWebViewActivity write(String str, int i, int i2) {
        char c;
        onGetStartedClick.write((Object) str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(1);
                            byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                            int i3 = MediaBrowserCompat$CustomActionResultReceiver.write - i;
                            int min = Math.min(i2, 8192 - i3);
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
                            int i4 = (i3 + i) - MediaBrowserCompat$CustomActionResultReceiver.write;
                            MediaBrowserCompat$CustomActionResultReceiver.write += i4;
                            this.read += (long) i4;
                        } else {
                            if (charAt < 2048) {
                                PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(2);
                                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver2.write] = (byte) ((charAt >> 6) | 192);
                                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver2.write + 1] = (byte) ((charAt & '?') | 128);
                                MediaBrowserCompat$CustomActionResultReceiver2.write += 2;
                                this.read += 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(3);
                                MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write] = (byte) ((charAt >> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE);
                                MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write + 2] = (byte) ((charAt & '?') | 128);
                                MediaBrowserCompat$CustomActionResultReceiver3.write += 3;
                                this.read += 3;
                            } else {
                                int i5 = i + 1;
                                if (i5 < i2) {
                                    c = str.charAt(i5);
                                } else {
                                    c = 0;
                                }
                                if (charAt > 56319 || 56320 > c || 57343 < c) {
                                    MediaBrowserCompat$ItemReceiver(63);
                                    i = i5;
                                } else {
                                    int i6 = (((charAt & 1023) << 10) | (c & 1023)) + 0;
                                    PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver(4);
                                    MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver4.write] = (byte) ((i6 >> 18) | 240);
                                    MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver4.write + 1] = (byte) (((i6 >> 12) & 63) | 128);
                                    MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver4.write + 2] = (byte) (((i6 >> 6) & 63) | 128);
                                    MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver4.write + 3] = (byte) ((i6 & 63) | 128);
                                    MediaBrowserCompat$CustomActionResultReceiver4.write += 4;
                                    this.read += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > string.length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("beginIndex < 0: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public final SCBUniversalWebViewActivity MediaDescriptionCompat(int i) {
        if (i < 128) {
            MediaBrowserCompat$ItemReceiver(i);
        } else if (i < 2048) {
            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(2);
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver.write] = (byte) ((i >> 6) | 192);
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver.write + 1] = (byte) ((i & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver.write += 2;
            this.read += 2;
        } else if (55296 <= i && 57343 >= i) {
            MediaBrowserCompat$ItemReceiver(63);
        } else if (i < 65536) {
            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(3);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver2.write] = (byte) ((i >> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver2.write + 1] = (byte) (((i >> 6) & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver2.write + 2] = (byte) ((i & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver2.write += 3;
            this.read += 3;
        } else if (i <= 1114111) {
            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(4);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write] = (byte) ((i >> 18) | 240);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write + 1] = (byte) (((i >> 12) & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write + 2] = (byte) (((i >> 6) & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$CustomActionResultReceiver3.write + 3] = (byte) ((i & 63) | 128);
            MediaBrowserCompat$CustomActionResultReceiver3.write += 4;
            this.read += 4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    public final SCBUniversalWebViewActivity IconCompatParcelizer(String str, int i, int i2, Charset charset) {
        onGetStartedClick.write((Object) str, "string");
        onGetStartedClick.write((Object) charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("endIndex > string.length: ");
                    sb.append(i2);
                    sb.append(" > ");
                    sb.append(str.length());
                    throw new IllegalArgumentException(sb.toString().toString());
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) charset, (Object) GroupFavoriteActivity.IconCompatParcelizer)) {
                    return write(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        return IconCompatParcelizer(bytes, 0, bytes.length);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("endIndex < beginIndex: ");
                sb2.append(i2);
                sb2.append(" < ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex < 0: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    /* renamed from: read */
    public final SCBUniversalWebViewActivity IconCompatParcelizer(byte[] bArr, int i, int i2) {
        onGetStartedClick.write((Object) bArr, "source");
        long j = (long) i2;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(1);
            int min = Math.min(i3 - i, 8192 - MediaBrowserCompat$CustomActionResultReceiver.write);
            System.arraycopy(bArr, i, MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver.write, min);
            i += min;
            MediaBrowserCompat$CustomActionResultReceiver.write += min;
        }
        this.read += j;
        return this;
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        onGetStartedClick.write((Object) byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(1);
            int min = Math.min(i, 8192 - MediaBrowserCompat$CustomActionResultReceiver.write);
            byteBuffer.get(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver.write, min);
            i -= min;
            MediaBrowserCompat$CustomActionResultReceiver.write += min;
        }
        this.read += (long) remaining;
        return remaining;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(HowToAddAccountStep2Activity howToAddAccountStep2Activity) throws IOException {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        long j = 0;
        while (true) {
            long read2 = howToAddAccountStep2Activity.read(this, 8192);
            if (read2 == -1) {
                return j;
            }
            j += read2;
        }
    }

    /* renamed from: write */
    public final SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver(int i) {
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(1);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = MediaBrowserCompat$CustomActionResultReceiver.write;
        MediaBrowserCompat$CustomActionResultReceiver.write = i2 + 1;
        bArr[i2] = (byte) i;
        this.read++;
        return this;
    }

    /* renamed from: RatingCompat */
    public final SCBUniversalWebViewActivity MediaBrowserCompat$MediaItem(int i) {
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(2);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = MediaBrowserCompat$CustomActionResultReceiver.write;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        MediaBrowserCompat$CustomActionResultReceiver.write = i3 + 1;
        this.read += 2;
        return this;
    }

    /* renamed from: read */
    public final SCBUniversalWebViewActivity IconCompatParcelizer(int i) {
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(4);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = MediaBrowserCompat$CustomActionResultReceiver.write;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        MediaBrowserCompat$CustomActionResultReceiver.write = i5 + 1;
        this.read += 4;
        return this;
    }

    public final SCBUniversalWebViewActivity MediaSessionCompat$QueueItem(long j) {
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(8);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i = MediaBrowserCompat$CustomActionResultReceiver.write;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        MediaBrowserCompat$CustomActionResultReceiver.write = i8 + 1;
        this.read += 8;
        return this;
    }

    /* renamed from: MediaMetadataCompat */
    public final SCBUniversalWebViewActivity RatingCompat(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return MediaBrowserCompat$ItemReceiver(48);
        }
        boolean z = false;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                onGetStartedClick.write((Object) "-9223372036854775808", "string");
                return write("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        int i2 = j < 100000000 ? j < 10000 ? j < 100 ? j >= 10 ? 2 : 1 : j < 1000 ? 3 : 4 : j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8 : j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        if (z) {
            i2++;
        }
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i2);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = MediaBrowserCompat$CustomActionResultReceiver.write + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = MediaBrowserCompat$ItemReceiver[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        MediaBrowserCompat$CustomActionResultReceiver.write += i2;
        this.read += (long) i2;
        return this;
    }

    /* renamed from: ParcelableVolumeInfo */
    public final SCBUniversalWebViewActivity MediaSessionCompat$ResultReceiverWrapper(long j) {
        if (j == 0) {
            return MediaBrowserCompat$ItemReceiver(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(numberOfTrailingZeros);
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int i = MediaBrowserCompat$CustomActionResultReceiver.write;
        for (int i2 = (MediaBrowserCompat$CustomActionResultReceiver.write + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = MediaBrowserCompat$ItemReceiver[(int) (15 & j)];
            j >>>= 4;
        }
        MediaBrowserCompat$CustomActionResultReceiver.write += numberOfTrailingZeros;
        this.read += (long) numberOfTrailingZeros;
        return this;
    }

    public final PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i > 0 && i <= 8192) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                PersonalizeActivity read2 = PersonalLimitActivity.read();
                this.write = read2;
                read2.MediaMetadataCompat = read2;
                read2.MediaBrowserCompat$ItemReceiver = read2;
                return read2;
            }
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            PersonalizeActivity personalizeActivity2 = personalizeActivity.MediaMetadataCompat;
            if (personalizeActivity2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return (personalizeActivity2.write + i > 8192 || !personalizeActivity2.IconCompatParcelizer) ? personalizeActivity2.IconCompatParcelizer(PersonalLimitActivity.read()) : personalizeActivity2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        int i;
        PersonalizeActivity personalizeActivity;
        PersonalizeActivity personalizeActivity2;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        if (sCBUniversalWebViewActivity != this) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity.read, 0, j);
            while (j > 0) {
                PersonalizeActivity personalizeActivity3 = sCBUniversalWebViewActivity.write;
                if (personalizeActivity3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                int i2 = personalizeActivity3.write;
                PersonalizeActivity personalizeActivity4 = sCBUniversalWebViewActivity.write;
                if (personalizeActivity4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (j < ((long) (i2 - personalizeActivity4.read))) {
                    PersonalizeActivity personalizeActivity5 = this.write;
                    if (personalizeActivity5 != null) {
                        if (personalizeActivity5 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        personalizeActivity = personalizeActivity5.MediaMetadataCompat;
                    } else {
                        personalizeActivity = null;
                    }
                    if (personalizeActivity != null && personalizeActivity.IconCompatParcelizer) {
                        if ((((long) personalizeActivity.write) + j) - ((long) (personalizeActivity.MediaDescriptionCompat ? 0 : personalizeActivity.read)) <= 8192) {
                            PersonalizeActivity personalizeActivity6 = sCBUniversalWebViewActivity.write;
                            if (personalizeActivity6 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            personalizeActivity6.IconCompatParcelizer(personalizeActivity, (int) j);
                            sCBUniversalWebViewActivity.read -= j;
                            this.read += j;
                            return;
                        }
                    }
                    PersonalizeActivity personalizeActivity7 = sCBUniversalWebViewActivity.write;
                    if (personalizeActivity7 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= personalizeActivity7.write - personalizeActivity7.read) {
                        if (i3 >= 1024) {
                            personalizeActivity7.MediaDescriptionCompat = true;
                            personalizeActivity2 = new PersonalizeActivity(personalizeActivity7.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity7.read, personalizeActivity7.write, true, false);
                        } else {
                            personalizeActivity2 = PersonalLimitActivity.read();
                            byte[] bArr = personalizeActivity7.MediaBrowserCompat$CustomActionResultReceiver;
                            int i4 = personalizeActivity7.read;
                            byte[] bArr2 = personalizeActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                            onGetStartedClick.write((Object) bArr, "src");
                            onGetStartedClick.write((Object) bArr2, "dest");
                            System.arraycopy(bArr, i4, bArr2, 0, i3);
                        }
                        personalizeActivity2.write = personalizeActivity2.read + i3;
                        personalizeActivity7.read += i3;
                        PersonalizeActivity personalizeActivity8 = personalizeActivity7.MediaMetadataCompat;
                        if (personalizeActivity8 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        personalizeActivity8.IconCompatParcelizer(personalizeActivity2);
                        sCBUniversalWebViewActivity.write = personalizeActivity2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                PersonalizeActivity personalizeActivity9 = sCBUniversalWebViewActivity.write;
                if (personalizeActivity9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                long j2 = (long) (personalizeActivity9.write - personalizeActivity9.read);
                sCBUniversalWebViewActivity.write = personalizeActivity9.read();
                PersonalizeActivity personalizeActivity10 = this.write;
                if (personalizeActivity10 == null) {
                    this.write = personalizeActivity9;
                    personalizeActivity9.MediaMetadataCompat = personalizeActivity9;
                    personalizeActivity9.MediaBrowserCompat$ItemReceiver = personalizeActivity9.MediaMetadataCompat;
                } else {
                    if (personalizeActivity10 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    PersonalizeActivity personalizeActivity11 = personalizeActivity10.MediaMetadataCompat;
                    if (personalizeActivity11 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    PersonalizeActivity IconCompatParcelizer2 = personalizeActivity11.IconCompatParcelizer(personalizeActivity9);
                    if (IconCompatParcelizer2.MediaMetadataCompat != IconCompatParcelizer2) {
                        PersonalizeActivity personalizeActivity12 = IconCompatParcelizer2.MediaMetadataCompat;
                        if (personalizeActivity12 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        if (personalizeActivity12.IconCompatParcelizer) {
                            int i5 = IconCompatParcelizer2.write - IconCompatParcelizer2.read;
                            PersonalizeActivity personalizeActivity13 = IconCompatParcelizer2.MediaMetadataCompat;
                            if (personalizeActivity13 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            int i6 = personalizeActivity13.write;
                            PersonalizeActivity personalizeActivity14 = IconCompatParcelizer2.MediaMetadataCompat;
                            if (personalizeActivity14 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            if (personalizeActivity14.MediaDescriptionCompat) {
                                i = 0;
                            } else {
                                PersonalizeActivity personalizeActivity15 = IconCompatParcelizer2.MediaMetadataCompat;
                                if (personalizeActivity15 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                i = personalizeActivity15.read;
                            }
                            if (i5 <= (8192 - i6) + i) {
                                PersonalizeActivity personalizeActivity16 = IconCompatParcelizer2.MediaMetadataCompat;
                                if (personalizeActivity16 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                }
                                IconCompatParcelizer2.IconCompatParcelizer(personalizeActivity16, i5);
                                IconCompatParcelizer2.read();
                                PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                sCBUniversalWebViewActivity.read -= j2;
                this.read += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        if (j >= 0) {
            long j2 = this.read;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            sCBUniversalWebViewActivity.write(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final long write(byte b, long j, long j2) {
        long j3;
        int i;
        byte b2 = b;
        long j4 = j;
        long j5 = j2;
        long j6 = 0;
        if (0 <= j4 && j5 >= j4) {
            long j7 = this.read;
            if (j5 > j7) {
                j5 = j7;
            }
            long j8 = -1;
            if (j4 == j5) {
                return -1;
            }
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                return -1;
            }
            long j9 = this.read;
            if (j9 - j4 < j4) {
                while (j9 > j4) {
                    personalizeActivity = personalizeActivity.MediaMetadataCompat;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    j9 -= (long) (personalizeActivity.write - personalizeActivity.read);
                }
                if (personalizeActivity != null) {
                    while (j3 < j5) {
                        byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        int min = (int) Math.min((long) personalizeActivity.write, (((long) personalizeActivity.read) + j5) - j3);
                        i = (int) ((((long) personalizeActivity.read) + j4) - j3);
                        while (i < min) {
                            if (bArr[i] != b2) {
                                i++;
                            }
                        }
                        j9 = j3 + ((long) (personalizeActivity.write - personalizeActivity.read));
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        j4 = j9;
                        j8 = -1;
                    }
                }
                return j8;
            }
            while (true) {
                long j10 = ((long) (personalizeActivity.write - personalizeActivity.read)) + j6;
                if (j10 > j4) {
                    break;
                }
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                j6 = j10;
            }
            if (personalizeActivity == null) {
                return -1;
            }
            j3 = j6;
            while (j3 < j5) {
                byte[] bArr2 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int min2 = (int) Math.min((long) personalizeActivity.write, (((long) personalizeActivity.read) + j5) - j3);
                int i2 = (int) ((((long) personalizeActivity.read) + j4) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i2 = i + 1;
                    }
                }
                j3 += (long) (personalizeActivity.write - personalizeActivity.read);
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                j4 = j3;
            }
            return -1;
            return ((long) (i - personalizeActivity.read)) + j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(this.read);
        sb.append(" fromIndex=");
        sb.append(j4);
        sb.append(" toIndex=");
        sb.append(j5);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final long write(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        return MediaBrowserCompat$CustomActionResultReceiver(sCBUniversalWebViewActivity_ViewBinding, 0);
    }

    public final long read(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
        return MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity_ViewBinding, 0);
    }

    private static boolean write(PersonalizeActivity personalizeActivity, int i, byte[] bArr, int i2, int i3) {
        int i4 = personalizeActivity.write;
        byte[] bArr2 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
        while (i2 < i3) {
            if (i == i4) {
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                byte[] bArr3 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                int i5 = personalizeActivity.read;
                bArr2 = bArr3;
                i = i5;
                i4 = personalizeActivity.write;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return PinChangeActivity_ViewBinding.NONE;
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SCBUniversalWebViewActivity)) {
            return false;
        }
        long j = this.read;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = (SCBUniversalWebViewActivity) obj2;
        if (j != sCBUniversalWebViewActivity.read) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        PersonalizeActivity personalizeActivity2 = sCBUniversalWebViewActivity.write;
        if (personalizeActivity2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        int i = personalizeActivity.read;
        int i2 = personalizeActivity2.read;
        long j3 = 0;
        while (j3 < this.read) {
            long min = (long) Math.min(personalizeActivity.write - i, personalizeActivity2.write - i2);
            long j4 = j2;
            while (j4 < min) {
                if (personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver[i] != personalizeActivity2.MediaBrowserCompat$CustomActionResultReceiver[i2]) {
                    return false;
                }
                j4++;
                i++;
                i2++;
            }
            if (i == personalizeActivity.write) {
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                i = personalizeActivity.read;
            }
            if (i2 == personalizeActivity2.write) {
                personalizeActivity2 = personalizeActivity2.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                i2 = personalizeActivity2.read;
            }
            j3 += min;
            j2 = 0;
        }
        return true;
    }

    public final int hashCode() {
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = personalizeActivity.write;
            for (int i3 = personalizeActivity.read; i3 < i2; i3++) {
                i = (i * 31) + personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver[i3];
            }
            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
        } while (personalizeActivity != this.write);
        return i;
    }

    /* renamed from: IconCompatParcelizer */
    public final SCBUniversalWebViewActivity clone() {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        if (this.read == 0) {
            return sCBUniversalWebViewActivity;
        }
        PersonalizeActivity personalizeActivity = this.write;
        if (personalizeActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        personalizeActivity.MediaDescriptionCompat = true;
        PersonalizeActivity personalizeActivity2 = new PersonalizeActivity(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, personalizeActivity.write, true, false);
        sCBUniversalWebViewActivity.write = personalizeActivity2;
        personalizeActivity2.MediaMetadataCompat = personalizeActivity2;
        PersonalizeActivity personalizeActivity3 = sCBUniversalWebViewActivity.write;
        if (personalizeActivity3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        PersonalizeActivity personalizeActivity4 = sCBUniversalWebViewActivity.write;
        if (personalizeActivity4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        personalizeActivity3.MediaBrowserCompat$ItemReceiver = personalizeActivity4.MediaMetadataCompat;
        PersonalizeActivity personalizeActivity5 = this.write;
        if (personalizeActivity5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        while (true) {
            personalizeActivity5 = personalizeActivity5.MediaBrowserCompat$ItemReceiver;
            if (personalizeActivity5 != this.write) {
                PersonalizeActivity personalizeActivity6 = sCBUniversalWebViewActivity.write;
                if (personalizeActivity6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                PersonalizeActivity personalizeActivity7 = personalizeActivity6.MediaMetadataCompat;
                if (personalizeActivity7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (personalizeActivity5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                personalizeActivity5.MediaDescriptionCompat = true;
                personalizeActivity7.IconCompatParcelizer(new PersonalizeActivity(personalizeActivity5.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity5.read, personalizeActivity5.write, true, false));
            } else {
                sCBUniversalWebViewActivity.read = this.read;
                return sCBUniversalWebViewActivity;
            }
        }
    }

    public final IconCompatParcelizer read(IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "unsafeCursor");
        if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver == null) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = this;
            iconCompatParcelizer.write = true;
            return iconCompatParcelizer;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: o.SCBUniversalWebViewActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Closeable {
        public long IconCompatParcelizer = -1;
        public byte[] MediaBrowserCompat$CustomActionResultReceiver;
        public SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$SearchResultReceiver = -1;
        private PersonalizeActivity RatingCompat;
        public int read = -1;
        public boolean write;

        public final int IconCompatParcelizer(long j) {
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
            if (sCBUniversalWebViewActivity != null) {
                int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
                if (i < 0 || j > sCBUniversalWebViewActivity.read) {
                    FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                    String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(sCBUniversalWebViewActivity.read)}, 2));
                    onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                    throw new ArrayIndexOutOfBoundsException(format);
                } else if (i == 0 || j == sCBUniversalWebViewActivity.read) {
                    this.RatingCompat = null;
                    this.IconCompatParcelizer = j;
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    this.MediaBrowserCompat$SearchResultReceiver = -1;
                    this.read = -1;
                    return -1;
                } else {
                    long j2 = sCBUniversalWebViewActivity.read;
                    PersonalizeActivity personalizeActivity = sCBUniversalWebViewActivity.write;
                    PersonalizeActivity personalizeActivity2 = sCBUniversalWebViewActivity.write;
                    PersonalizeActivity personalizeActivity3 = this.RatingCompat;
                    long j3 = 0;
                    if (personalizeActivity3 != null) {
                        long j4 = this.IconCompatParcelizer;
                        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
                        if (personalizeActivity3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        long j5 = j4 - ((long) (i2 - personalizeActivity3.read));
                        if (j5 > j) {
                            personalizeActivity2 = this.RatingCompat;
                            j2 = j5;
                        } else {
                            personalizeActivity = this.RatingCompat;
                            j3 = j5;
                        }
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            if (personalizeActivity == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            if (j < ((long) (personalizeActivity.write - personalizeActivity.read)) + j3) {
                                break;
                            }
                            j3 += (long) (personalizeActivity.write - personalizeActivity.read);
                            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        }
                    } else {
                        while (j2 > j) {
                            if (personalizeActivity2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            personalizeActivity2 = personalizeActivity2.MediaMetadataCompat;
                            if (personalizeActivity2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            j2 -= (long) (personalizeActivity2.write - personalizeActivity2.read);
                        }
                        j3 = j2;
                        personalizeActivity = personalizeActivity2;
                    }
                    if (this.write) {
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        if (personalizeActivity.MediaDescriptionCompat) {
                            PersonalizeActivity IconCompatParcelizer2 = personalizeActivity.IconCompatParcelizer();
                            if (sCBUniversalWebViewActivity.write == personalizeActivity) {
                                sCBUniversalWebViewActivity.write = IconCompatParcelizer2;
                            }
                            personalizeActivity = personalizeActivity.IconCompatParcelizer(IconCompatParcelizer2);
                            PersonalizeActivity personalizeActivity4 = personalizeActivity.MediaMetadataCompat;
                            if (personalizeActivity4 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            personalizeActivity4.read();
                        }
                    }
                    this.RatingCompat = personalizeActivity;
                    this.IconCompatParcelizer = j;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    this.MediaBrowserCompat$SearchResultReceiver = personalizeActivity.read + ((int) (j - j3));
                    int i3 = personalizeActivity.write;
                    this.read = i3;
                    return i3 - this.MediaBrowserCompat$SearchResultReceiver;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
        }

        public final void close() {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.RatingCompat = null;
                this.IconCompatParcelizer = -1;
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.MediaBrowserCompat$SearchResultReceiver = -1;
                this.read = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(GroupFavoriteActivity.IconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        MediaBrowserCompat$ItemReceiver = bytes;
    }

    public final long MediaBrowserCompat$ItemReceiver(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j) {
        int i;
        int i2;
        long j2;
        long j3;
        int i3;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "targetBytes");
        long j4 = 0;
        if (j >= 0) {
            PersonalizeActivity personalizeActivity = this.write;
            if (personalizeActivity == null) {
                return -1;
            }
            long j5 = this.read;
            if (j5 - j < j) {
                while (j5 > j) {
                    personalizeActivity = personalizeActivity.MediaMetadataCompat;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    j5 -= (long) (personalizeActivity.write - personalizeActivity.read);
                }
                if (personalizeActivity != null) {
                    if (sCBUniversalWebViewActivity_ViewBinding.write() == 2) {
                        byte IconCompatParcelizer2 = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(0);
                        byte IconCompatParcelizer3 = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(1);
                        while (j2 < this.read) {
                            byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                            i = (int) ((((long) personalizeActivity.read) + j) - j2);
                            int i4 = personalizeActivity.write;
                            while (i < i4) {
                                byte b = bArr[i];
                                if (!(b == IconCompatParcelizer2 || b == IconCompatParcelizer3)) {
                                    i++;
                                }
                            }
                            j5 = j2 + ((long) (personalizeActivity.write - personalizeActivity.read));
                            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                            if (personalizeActivity == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            j = j5;
                        }
                    } else {
                        byte[] MediaBrowserCompat$CustomActionResultReceiver = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                        while (j3 < this.read) {
                            byte[] bArr2 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                            i3 = (int) ((((long) personalizeActivity.read) + j) - j3);
                            int i5 = personalizeActivity.write;
                            while (i3 < i5) {
                                byte b2 = bArr2[i3];
                                for (byte b3 : MediaBrowserCompat$CustomActionResultReceiver) {
                                    if (b2 == b3) {
                                        i2 = personalizeActivity.read;
                                        return ((long) (i - i2)) + j2;
                                    }
                                }
                                i3++;
                            }
                            j5 = j3 + ((long) (personalizeActivity.write - personalizeActivity.read));
                            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                            if (personalizeActivity == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            j = j5;
                        }
                    }
                }
                return -1;
            }
            while (true) {
                long j6 = ((long) (personalizeActivity.write - personalizeActivity.read)) + j4;
                if (j6 > j) {
                    break;
                }
                personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                if (personalizeActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                j4 = j6;
            }
            if (personalizeActivity != null) {
                if (sCBUniversalWebViewActivity_ViewBinding.write() == 2) {
                    byte IconCompatParcelizer4 = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(0);
                    byte IconCompatParcelizer5 = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(1);
                    j2 = j4;
                    while (j2 < this.read) {
                        byte[] bArr3 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        int i6 = (int) ((((long) personalizeActivity.read) + j) - j2);
                        int i7 = personalizeActivity.write;
                        while (i < i7) {
                            byte b4 = bArr3[i];
                            if (!(b4 == IconCompatParcelizer4 || b4 == IconCompatParcelizer5)) {
                                i6 = i + 1;
                            }
                        }
                        j2 += (long) (personalizeActivity.write - personalizeActivity.read);
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        j = j2;
                    }
                } else {
                    byte[] MediaBrowserCompat$CustomActionResultReceiver2 = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                    j3 = j4;
                    while (j3 < this.read) {
                        byte[] bArr4 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        int i8 = (int) ((((long) personalizeActivity.read) + j) - j3);
                        int i9 = personalizeActivity.write;
                        while (i3 < i9) {
                            byte b5 = bArr4[i3];
                            int length = MediaBrowserCompat$CustomActionResultReceiver2.length;
                            int i10 = 0;
                            while (i10 < length) {
                                if (b5 != MediaBrowserCompat$CustomActionResultReceiver2[i10]) {
                                    i10++;
                                } else {
                                    i2 = personalizeActivity.read;
                                    return ((long) (i - i2)) + j2;
                                }
                            }
                            i8 = i3 + 1;
                        }
                        j3 += (long) (personalizeActivity.write - personalizeActivity.read);
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        j = j3;
                    }
                }
            }
            return -1;
            i2 = personalizeActivity.read;
            return ((long) (i - i2)) + j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, long j) throws IOException {
        byte[] bArr;
        long j2 = j;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        if (sCBUniversalWebViewActivity_ViewBinding.write() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                PersonalizeActivity personalizeActivity = this.write;
                if (personalizeActivity == null) {
                    return -1;
                }
                long j4 = this.read;
                if (j4 - j2 < j2) {
                    while (j4 > j2) {
                        personalizeActivity = personalizeActivity.MediaMetadataCompat;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        j4 -= (long) (personalizeActivity.write - personalizeActivity.read);
                    }
                    if (personalizeActivity == null) {
                        return -1;
                    }
                    byte[] MediaBrowserCompat$CustomActionResultReceiver = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                    byte b = MediaBrowserCompat$CustomActionResultReceiver[0];
                    int write2 = sCBUniversalWebViewActivity_ViewBinding.write();
                    byte[] bArr2 = MediaBrowserCompat$CustomActionResultReceiver;
                    long j5 = (this.read - ((long) write2)) + 1;
                    while (j4 < j5) {
                        byte[] bArr3 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        byte[] bArr4 = bArr2;
                        int min = (int) Math.min((long) personalizeActivity.write, (((long) personalizeActivity.read) + j5) - j4);
                        int i = (int) ((((long) personalizeActivity.read) + j2) - j4);
                        while (i < min) {
                            if (bArr3[i] == b) {
                                bArr = bArr4;
                                if (write(personalizeActivity, i + 1, bArr, 1, write2)) {
                                    return ((long) (i - personalizeActivity.read)) + j4;
                                }
                            } else {
                                bArr = bArr4;
                            }
                            i++;
                            bArr4 = bArr;
                        }
                        bArr2 = bArr4;
                        j4 += (long) (personalizeActivity.write - personalizeActivity.read);
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        j2 = j4;
                    }
                    return -1;
                }
                while (true) {
                    long j6 = ((long) (personalizeActivity.write - personalizeActivity.read)) + j3;
                    if (j6 > j2) {
                        break;
                    }
                    personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    j3 = j6;
                }
                if (personalizeActivity == null) {
                    return -1;
                }
                byte[] MediaBrowserCompat$CustomActionResultReceiver2 = sCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                byte b2 = MediaBrowserCompat$CustomActionResultReceiver2[0];
                int write3 = sCBUniversalWebViewActivity_ViewBinding.write();
                long j7 = (this.read - ((long) write3)) + 1;
                while (j3 < j7) {
                    byte[] bArr5 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                    int min2 = (int) Math.min((long) personalizeActivity.write, (((long) personalizeActivity.read) + j7) - j3);
                    for (int i2 = (int) ((((long) personalizeActivity.read) + j2) - j3); i2 < min2; i2++) {
                        if (bArr5[i2] == b2) {
                            if (write(personalizeActivity, i2 + 1, MediaBrowserCompat$CustomActionResultReceiver2, 1, write3)) {
                                return ((long) (i2 - personalizeActivity.read)) + j3;
                            }
                        }
                    }
                    j3 += (long) (personalizeActivity.write - personalizeActivity.read);
                    personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    j2 = j3;
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex < 0: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final boolean write(long j, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        int write2 = sCBUniversalWebViewActivity_ViewBinding.write();
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        if (j >= 0 && write2 >= 0 && this.read - j >= ((long) write2) && sCBUniversalWebViewActivity_ViewBinding.write() >= write2) {
            int i = 0;
            while (i < write2) {
                if (read(((long) i) + j) == sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final int read(onAlienCardTabClicked onaliencardtabclicked) {
        onGetStartedClick.write((Object) onaliencardtabclicked, "options");
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(onaliencardtabclicked, false);
        if (MediaBrowserCompat$ItemReceiver2 == -1) {
            return -1;
        }
        MediaBrowserCompat$MediaItem((long) onaliencardtabclicked.IconCompatParcelizer[MediaBrowserCompat$ItemReceiver2].write());
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final String toString() {
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding;
        if (this.read <= 2147483647L) {
            int i = (int) this.read;
            if (i == 0) {
                sCBUniversalWebViewActivity_ViewBinding = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                BasePersonalInfoActivity_ViewBinding.read read2 = BasePersonalInfoActivity_ViewBinding.MediaBrowserCompat$MediaItem;
                onGetStartedClick.write((Object) this, "buffer");
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.read, 0, (long) i);
                PersonalizeActivity personalizeActivity = this.write;
                int i2 = 0;
                int i3 = 0;
                while (i2 < i) {
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    if (personalizeActivity.write != personalizeActivity.read) {
                        i2 += personalizeActivity.write - personalizeActivity.read;
                        i3++;
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                    } else {
                        throw new AssertionError("s.limit == s.pos");
                    }
                }
                byte[][] bArr = new byte[i3][];
                int[] iArr = new int[(i3 << 1)];
                PersonalizeActivity personalizeActivity2 = this.write;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i) {
                    if (personalizeActivity2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    bArr[i5] = personalizeActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                    i4 += personalizeActivity2.write - personalizeActivity2.read;
                    iArr[i5] = Math.min(i4, i);
                    iArr[((Object[]) bArr).length + i5] = personalizeActivity2.read;
                    personalizeActivity2.MediaDescriptionCompat = true;
                    i5++;
                    personalizeActivity2 = personalizeActivity2.MediaBrowserCompat$ItemReceiver;
                }
                sCBUniversalWebViewActivity_ViewBinding = new BasePersonalInfoActivity_ViewBinding(bArr, iArr, (byte) 0);
            }
            return sCBUniversalWebViewActivity_ViewBinding.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.read);
        throw new IllegalStateException(sb.toString().toString());
    }
}
