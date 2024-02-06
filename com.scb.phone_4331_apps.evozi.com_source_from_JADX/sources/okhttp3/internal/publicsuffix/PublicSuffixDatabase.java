package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import net.p088sf.scuba.smartcards.ISO7816;
import okhttp3.internal.Util;
import p040o.BaseJuristicPinActivity_ViewBinding;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.JuristicRequestFormActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SourceOfFundsActivity;
import p040o.onGetStartedClick;

public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = {ISO7816.INS_PSO};
    /* access modifiers changed from: private */
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    /* access modifiers changed from: private */
    public byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("publicSuffixListBytes");
        }
        return bArr;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int i;
        int i2;
        onGetStartedClick.write((Object) str, "domain");
        String unicode = IDN.toUnicode(str);
        onGetStartedClick.IconCompatParcelizer((Object) unicode, "unicodeDomain");
        boolean z = true;
        List<String> read = GoodToKnowActivity.read((CharSequence) unicode, new char[]{'.'}, false, 0);
        List<String> findMatchingRule = findMatchingRule(read);
        if (read.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            i2 = read.size();
            i = findMatchingRule.size();
        } else {
            i2 = read.size();
            i = findMatchingRule.size() + 1;
        }
        Iterable read2 = GoodToKnowActivity.read((CharSequence) str, new char[]{'.'}, false, 0);
        onGetStartedClick.write((Object) read2, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(read2);
        int i3 = i2 - i;
        onGetStartedClick.write((Object) iconCompatParcelizer, "$this$drop");
        if (i3 < 0) {
            z = false;
        }
        if (z) {
            if (i3 != 0) {
                iconCompatParcelizer = new SourceOfFundsActivity(iconCompatParcelizer, i3);
            }
            return JuristicRequestFormActivity.read(iconCompatParcelizer, (CharSequence) ".");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i3);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0016
            r11.readTheListUninterruptibly()
            goto L_0x0023
        L_0x0016:
            java.util.concurrent.CountDownLatch r0 = r11.readCompleteLatch     // Catch:{ InterruptedException -> 0x001c }
            r0.await()     // Catch:{ InterruptedException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0023:
            r0 = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = (okhttp3.internal.publicsuffix.PublicSuffixDatabase) r0
            byte[] r0 = r0.publicSuffixListBytes
            if (r0 == 0) goto L_0x002c
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x0117
            int r0 = r12.size()
            byte[][] r3 = new byte[r0][]
            r4 = r1
        L_0x0036:
            if (r4 >= r0) goto L_0x005d
            java.lang.Object r5 = r12.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r7 = "UTF_8"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r7)
            if (r5 == 0) goto L_0x0055
            byte[] r5 = r5.getBytes(r6)
            java.lang.String r6 = "(this as java.lang.String).getBytes(charset)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0055:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r0)
            throw r12
        L_0x005d:
            byte[][] r3 = (byte[][]) r3
            r12 = r1
        L_0x0060:
            java.lang.String r4 = "publicSuffixListBytes"
            r5 = 0
            if (r12 >= r0) goto L_0x0077
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r6 = Companion
            byte[] r7 = r11.publicSuffixListBytes
            if (r7 != 0) goto L_0x006e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x006e:
            java.lang.String r6 = r6.binarySearch(r7, r3, r12)
            if (r6 != 0) goto L_0x0078
            int r12 = r12 + 1
            goto L_0x0060
        L_0x0077:
            r6 = r5
        L_0x0078:
            r12 = r3
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            if (r0 <= r2) goto L_0x00a2
            java.lang.Object r0 = r12.clone()
            byte[][] r0 = (byte[][]) r0
            r7 = r0
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r7 = r7.length
            r8 = r1
        L_0x0088:
            int r9 = r7 + -1
            if (r8 >= r9) goto L_0x00a2
            byte[] r9 = WILDCARD_LABEL
            r0[r8] = r9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = Companion
            byte[] r10 = r11.publicSuffixListBytes
            if (r10 != 0) goto L_0x0099
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0099:
            java.lang.String r9 = r9.binarySearch(r10, r0, r8)
            if (r9 != 0) goto L_0x00a3
            int r8 = r8 + 1
            goto L_0x0088
        L_0x00a2:
            r9 = r5
        L_0x00a3:
            if (r9 == 0) goto L_0x00c0
            int r12 = r12.length
            r0 = r1
        L_0x00a7:
            int r4 = r12 + -1
            if (r0 >= r4) goto L_0x00c0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r4 = Companion
            byte[] r7 = r11.publicSuffixExceptionListBytes
            if (r7 != 0) goto L_0x00b6
            java.lang.String r8 = "publicSuffixExceptionListBytes"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00b6:
            java.lang.String r4 = r4.binarySearch(r7, r3, r0)
            if (r4 != 0) goto L_0x00bf
            int r0 = r0 + 1
            goto L_0x00a7
        L_0x00bf:
            r5 = r4
        L_0x00c0:
            r12 = 46
            if (r5 == 0) goto L_0x00e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 33
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char[] r2 = new char[r2]
            r2[r1] = r12
            java.util.List r12 = p040o.GoodToKnowActivity.read((java.lang.CharSequence) r0, (char[]) r2, false, 0)
            return r12
        L_0x00e0:
            if (r6 != 0) goto L_0x00e7
            if (r9 != 0) goto L_0x00e7
            java.util.List<java.lang.String> r12 = PREVAILING_RULE
            return r12
        L_0x00e7:
            if (r6 == 0) goto L_0x00f5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            char[] r0 = new char[r2]
            r0[r1] = r12
            java.util.List r0 = p040o.GoodToKnowActivity.read((java.lang.CharSequence) r6, (char[]) r0, false, 0)
            if (r0 != 0) goto L_0x00f9
        L_0x00f5:
            o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r0 = (java.util.List) r0
        L_0x00f9:
            if (r9 == 0) goto L_0x0107
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            char[] r2 = new char[r2]
            r2[r1] = r12
            java.util.List r12 = p040o.GoodToKnowActivity.read((java.lang.CharSequence) r9, (char[]) r2, false, 0)
            if (r12 != 0) goto L_0x010b
        L_0x0107:
            o.HmlNationalIdActivity r12 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r12 = (java.util.List) r12
        L_0x010b:
            int r1 = r0.size()
            int r2 = r12.size()
            if (r1 > r2) goto L_0x0116
            r0 = r12
        L_0x0116:
            return r0
        L_0x0117:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.findMatchingRule(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheListUninterruptibly() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{  }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x0029, IOException -> 0x0010 }
            r1.interrupt()     // Catch:{ InterruptedIOException -> 0x0029, IOException -> 0x0010 }
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002e
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x000e }
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0028
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0028:
            return
        L_0x0029:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002e:
            if (r0 == 0) goto L_0x0037
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheList() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0058
            o.NsipPaymentLandingActivity r1 = new o.NsipPaymentLandingActivity
            o.HowToAddAccountStep2Activity r0 = p040o.onSubmit.IconCompatParcelizer((java.io.InputStream) r0)
            r1.<init>(r0)
            o.HowToAddAccountStep2Activity r1 = (p040o.HowToAddAccountStep2Activity) r1
            o.NsipPartnerPaymentOtpActivity r0 = p040o.onSubmit.read((p040o.HowToAddAccountStep2Activity) r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            o.NsipPartnerPaymentOtpActivity r1 = (p040o.NsipPartnerPaymentOtpActivity) r1     // Catch:{ all -> 0x0051 }
            int r2 = r1.mo42948x50fd9e4a()     // Catch:{ all -> 0x0051 }
            long r2 = (long) r2     // Catch:{ all -> 0x0051 }
            byte[] r2 = r1.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ all -> 0x0051 }
            int r3 = r1.mo42948x50fd9e4a()     // Catch:{ all -> 0x0051 }
            long r3 = (long) r3     // Catch:{ all -> 0x0051 }
            byte[] r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ all -> 0x0051 }
            o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0051 }
            r3 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r3)
            monitor-enter(r5)
            if (r2 != 0) goto L_0x003c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x004e }
        L_0x003c:
            r5.publicSuffixListBytes = r2     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0043
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x004e }
        L_0x0043:
            r5.publicSuffixExceptionListBytes = r1     // Catch:{ all -> 0x004e }
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.readCompleteLatch
            r0.countDown()
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r2 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            throw r2
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        onGetStartedClick.write((Object) bArr, "publicSuffixListBytes");
        onGetStartedClick.write((Object) bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        /* access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int and;
            byte[] bArr3 = bArr;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 >= 0 && bArr3[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = Util.and(bArr2[i9][i10], 255);
                    }
                    and = i3 - Util.and(bArr3[i6 + i11], 255);
                    if (and != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == ((Object[]) bArr2).length - 1) {
                        break;
                    } else {
                        i9++;
                        i10 = -1;
                        z2 = true;
                    }
                }
                if (and >= 0) {
                    if (and <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = ((Object[]) bArr2).length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                onGetStartedClick.IconCompatParcelizer((Object) charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    static {
        List<String> singletonList = Collections.singletonList("*");
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        PREVAILING_RULE = singletonList;
    }
}
