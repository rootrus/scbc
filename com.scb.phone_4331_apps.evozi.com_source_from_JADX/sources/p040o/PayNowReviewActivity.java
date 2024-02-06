package p040o;

import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: o.PayNowReviewActivity */
public final class PayNowReviewActivity implements HowToAddAccountStep2Activity {
    private boolean IconCompatParcelizer;
    private final NsipPartnerPaymentOtpActivity MediaBrowserCompat$ItemReceiver;
    private final Inflater read;
    private int write;

    public PayNowReviewActivity(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, Inflater inflater) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        onGetStartedClick.write((Object) inflater, "inflater");
        this.MediaBrowserCompat$ItemReceiver = nsipPartnerPaymentOtpActivity;
        this.read = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[Catch:{ DataFormatException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long read(p040o.SCBUniversalWebViewActivity r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x00de
            boolean r5 = r8.IconCompatParcelizer
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00d0
            if (r2 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.util.zip.Inflater r0 = r8.read
            boolean r0 = r0.needsInput()
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r0 = r3
            goto L_0x005e
        L_0x0024:
            r8.write()
            java.util.zip.Inflater r0 = r8.read
            int r0 = r0.getRemaining()
            if (r0 != 0) goto L_0x0031
            r0 = r4
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            if (r0 == 0) goto L_0x00c2
            o.NsipPartnerPaymentOtpActivity r0 = r8.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 == 0) goto L_0x003e
            r0 = r4
            goto L_0x005e
        L_0x003e:
            o.NsipPartnerPaymentOtpActivity r0 = r8.MediaBrowserCompat$ItemReceiver
            o.SCBUniversalWebViewActivity r0 = r0.MediaMetadataCompat()
            o.PersonalizeActivity r0 = r0.write
            if (r0 != 0) goto L_0x004b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x004b:
            int r1 = r0.write
            int r2 = r0.read
            int r1 = r1 - r2
            r8.write = r1
            java.util.zip.Inflater r1 = r8.read
            byte[] r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.read
            int r5 = r8.write
            r1.setInput(r2, r0, r5)
            goto L_0x0022
        L_0x005e:
            o.PersonalizeActivity r1 = r9.MediaBrowserCompat$CustomActionResultReceiver((int) r4)     // Catch:{ DataFormatException -> 0x00b7 }
            int r2 = r1.write     // Catch:{ DataFormatException -> 0x00b7 }
            int r2 = 8192 - r2
            long r5 = (long) r2     // Catch:{ DataFormatException -> 0x00b7 }
            long r5 = java.lang.Math.min(r10, r5)     // Catch:{ DataFormatException -> 0x00b7 }
            int r2 = (int) r5     // Catch:{ DataFormatException -> 0x00b7 }
            java.util.zip.Inflater r5 = r8.read     // Catch:{ DataFormatException -> 0x00b7 }
            byte[] r6 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ DataFormatException -> 0x00b7 }
            int r7 = r1.write     // Catch:{ DataFormatException -> 0x00b7 }
            int r2 = r5.inflate(r6, r7, r2)     // Catch:{ DataFormatException -> 0x00b7 }
            if (r2 <= 0) goto L_0x0084
            int r10 = r1.write     // Catch:{ DataFormatException -> 0x00b7 }
            int r10 = r10 + r2
            r1.write = r10     // Catch:{ DataFormatException -> 0x00b7 }
            long r10 = r9.read     // Catch:{ DataFormatException -> 0x00b7 }
            long r0 = (long) r2     // Catch:{ DataFormatException -> 0x00b7 }
            long r10 = r10 + r0
            r9.read = r10     // Catch:{ DataFormatException -> 0x00b7 }
            return r0
        L_0x0084:
            java.util.zip.Inflater r2 = r8.read     // Catch:{ DataFormatException -> 0x00b7 }
            boolean r2 = r2.finished()     // Catch:{ DataFormatException -> 0x00b7 }
            if (r2 != 0) goto L_0x00a2
            java.util.zip.Inflater r2 = r8.read     // Catch:{ DataFormatException -> 0x00b7 }
            boolean r2 = r2.needsDictionary()     // Catch:{ DataFormatException -> 0x00b7 }
            if (r2 == 0) goto L_0x0095
            goto L_0x00a2
        L_0x0095:
            if (r0 != 0) goto L_0x0098
            goto L_0x001a
        L_0x0098:
            java.io.EOFException r9 = new java.io.EOFException     // Catch:{ DataFormatException -> 0x00b7 }
            java.lang.String r10 = "source exhausted prematurely"
            r9.<init>(r10)     // Catch:{ DataFormatException -> 0x00b7 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ DataFormatException -> 0x00b7 }
            throw r9     // Catch:{ DataFormatException -> 0x00b7 }
        L_0x00a2:
            r8.write()     // Catch:{ DataFormatException -> 0x00b7 }
            int r10 = r1.read     // Catch:{ DataFormatException -> 0x00b7 }
            int r11 = r1.write     // Catch:{ DataFormatException -> 0x00b7 }
            if (r10 != r11) goto L_0x00b4
            o.PersonalizeActivity r10 = r1.read()     // Catch:{ DataFormatException -> 0x00b7 }
            r9.write = r10     // Catch:{ DataFormatException -> 0x00b7 }
            p040o.PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ DataFormatException -> 0x00b7 }
        L_0x00b4:
            r9 = -1
            return r9
        L_0x00b7:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r10.<init>(r9)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        L_0x00c2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "?"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00d0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00de:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PayNowReviewActivity.read(o.SCBUniversalWebViewActivity, long):long");
    }

    private final void write() {
        int i = this.write;
        if (i != 0) {
            int remaining = i - this.read.getRemaining();
            this.write -= remaining;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem((long) remaining);
        }
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.MediaBrowserCompat$ItemReceiver.timeout();
    }

    public final void close() throws IOException {
        if (!this.IconCompatParcelizer) {
            this.read.end();
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$ItemReceiver.close();
        }
    }
}
