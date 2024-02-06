package p040o;

import android.animation.TimeInterpolator;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import com.eracom.OBM2.EncryptedMessageException;
import com.eracom.OBM2.NoSuchAlgorithmException;
import com.eracom.OBM2.OAEPEncodedMsgException;
import com.eracom.OBM2.PINBlockException;
import com.eracom.OBM2.PINMessageException;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import java.util.zip.Adler32;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.PassportService;
import p040o.finish;
import p040o.nAllocationRead2D;
import p040o.nClosureCreate;
import p040o.translate;

/* renamed from: o.isComplex */
public final class isComplex {
    public static final read IconCompatParcelizer = new read() {
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * -0.5f;
        }
    };
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read() {
        public final float getInterpolation(float f) {
            return 1.0f - isComplex.read.getInterpolation(1.0f - f);
        }
    };
    public static final read read = new read() {
        public final float getInterpolation(float f) {
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            } else if (f < 0.90909094f) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            } else {
                float f4 = f - 0.95454544f;
                return (7.5625f * f4 * f4) + 0.984375f;
            }
        }
    };

    /* renamed from: o.isComplex$read */
    public interface read extends TimeInterpolator {
        float getInterpolation(float f);
    }

    /* renamed from: o.isComplex$1 */
    public static final class C13581 implements read, getDocumentFramingError {
        private final getSubElementOffsetBytes MediaBrowserCompat$ItemReceiver;

        public final float getInterpolation(float f) {
            return f;
        }

        C13581() {
        }

        public C13581(getSubElementOffsetBytes getsubelementoffsetbytes) {
            this.MediaBrowserCompat$ItemReceiver = getsubelementoffsetbytes;
        }

        public final void MediaBrowserCompat$ItemReceiver(String str, byte[] bArr) {
            if (str.equals("EXIF")) {
                new nClosureCreate.IconCompatParcelizer();
                nClosureCreate.IconCompatParcelizer.IconCompatParcelizer(new StaggeredGridLayoutManager(bArr), this.MediaBrowserCompat$ItemReceiver, 0, (createFromBitmapResource) null);
            } else if (str.equals("ICCP")) {
                new nAllocationSetSurface();
                nAllocationSetSurface.MediaBrowserCompat$CustomActionResultReceiver((C10820Allocation) new StaggeredGridLayoutManager(bArr), this.MediaBrowserCompat$ItemReceiver);
            } else if (str.equals("XMP ")) {
                new nScriptIntrinsicCreate();
                nScriptIntrinsicCreate.write(bArr, this.MediaBrowserCompat$ItemReceiver, (createFromBitmapResource) null);
            } else if (str.equals("VP8X") && bArr.length == 10) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(bArr);
                staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = false;
                try {
                    boolean MediaBrowserCompat$CustomActionResultReceiver = staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver(1);
                    boolean MediaBrowserCompat$CustomActionResultReceiver2 = staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver(4);
                    int MediaBrowserCompat$SearchResultReceiver = staggeredGridLayoutManager.MediaBrowserCompat$SearchResultReceiver(4);
                    int MediaBrowserCompat$SearchResultReceiver2 = staggeredGridLayoutManager.MediaBrowserCompat$SearchResultReceiver(7);
                    isCompatible iscompatible = new isCompatible();
                    iscompatible.IconCompatParcelizer(2, Integer.valueOf(MediaBrowserCompat$SearchResultReceiver + 1));
                    iscompatible.IconCompatParcelizer(1, Integer.valueOf(MediaBrowserCompat$SearchResultReceiver2 + 1));
                    iscompatible.IconCompatParcelizer(3, Boolean.valueOf(MediaBrowserCompat$CustomActionResultReceiver2));
                    iscompatible.IconCompatParcelizer(4, Boolean.valueOf(MediaBrowserCompat$CustomActionResultReceiver));
                    this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.add(iscompatible);
                } catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            } else if (str.equals("VP8L") && bArr.length > 4) {
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(bArr);
                staggeredGridLayoutManager2.MediaBrowserCompat$CustomActionResultReceiver = false;
                try {
                    if (staggeredGridLayoutManager2.RatingCompat(0) == 47) {
                        short MediaSessionCompat$QueueItem = staggeredGridLayoutManager2.MediaSessionCompat$QueueItem(1);
                        short MediaSessionCompat$QueueItem2 = staggeredGridLayoutManager2.MediaSessionCompat$QueueItem(2);
                        short MediaSessionCompat$QueueItem3 = staggeredGridLayoutManager2.MediaSessionCompat$QueueItem(3);
                        short MediaSessionCompat$QueueItem4 = staggeredGridLayoutManager2.MediaSessionCompat$QueueItem(4);
                        isCompatible iscompatible2 = new isCompatible();
                        iscompatible2.IconCompatParcelizer(2, Integer.valueOf((MediaSessionCompat$QueueItem | ((MediaSessionCompat$QueueItem2 & 63) << 8)) + 1));
                        iscompatible2.IconCompatParcelizer(1, Integer.valueOf((((MediaSessionCompat$QueueItem4 & 15) << 10) | (MediaSessionCompat$QueueItem3 << 2) | ((MediaSessionCompat$QueueItem2 & 192) >> 6)) + 1));
                        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.add(iscompatible2);
                    }
                } catch (IOException e2) {
                    e2.printStackTrace(System.err);
                }
            } else if (str.equals("VP8 ") && bArr.length > 9) {
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = new StaggeredGridLayoutManager(bArr);
                staggeredGridLayoutManager3.MediaBrowserCompat$CustomActionResultReceiver = false;
                try {
                    if (staggeredGridLayoutManager3.MediaSessionCompat$QueueItem(3) == 157 && staggeredGridLayoutManager3.MediaSessionCompat$QueueItem(4) == 1 && staggeredGridLayoutManager3.MediaSessionCompat$QueueItem(5) == 42) {
                        int MediaSessionCompat$ResultReceiverWrapper = staggeredGridLayoutManager3.MediaSessionCompat$ResultReceiverWrapper(6);
                        int MediaSessionCompat$ResultReceiverWrapper2 = staggeredGridLayoutManager3.MediaSessionCompat$ResultReceiverWrapper(8);
                        isCompatible iscompatible3 = new isCompatible();
                        iscompatible3.IconCompatParcelizer(2, Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper));
                        iscompatible3.IconCompatParcelizer(1, Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper2));
                        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.add(iscompatible3);
                    }
                } catch (IOException e3) {
                    e3.printStackTrace(System.err);
                }
            }
        }

        public final boolean IconCompatParcelizer(String str) {
            return str.equals("VP8X") || str.equals("VP8L") || str.equals("VP8 ") || str.equals("EXIF") || str.equals("ICCP") || str.equals("XMP ");
        }

        public final boolean write(String str) {
            return str.equals("WEBP");
        }
    }

    /* renamed from: o.isComplex$15 */
    public static final class C137515 implements read, Matrix2f {
        private final RenderScript IconCompatParcelizer;
        private final Set<Float4> read;
        private final getPercentBlackPixels write;

        public final float getInterpolation(float f) {
            return f * f;
        }

        C137515() {
        }

        public C137515(Set<Float4> set, RenderScript renderScript, getPercentBlackPixels getpercentblackpixels) {
            this.read = set;
            this.IconCompatParcelizer = renderScript;
            this.write = getpercentblackpixels;
        }

        public final <T> getArray<T> getTransport(String str, Class<T> cls, Float4 float4, Int3<T, byte[]> int3) {
            if (this.read.contains(float4)) {
                return new internalCreate(this.IconCompatParcelizer, str, float4, int3, this.write);
            }
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{float4, this.read}));
        }
    }

    /* renamed from: o.isComplex$24 */
    public static final class C138124 implements read {
        final getTopLeftCornerWidth IconCompatParcelizer;
        final Context MediaBrowserCompat$CustomActionResultReceiver;
        final C7507tQ MediaBrowserCompat$ItemReceiver;
        final nAllocationRead2D MediaMetadataCompat;
        final CreditCardCaptureModule RatingCompat;
        final CreditCardCaptureModule_GetIParametersFactory read;
        public final Executor write;

        public final float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }

        C138124() {
        }

        @HmlPinActivity
        public C138124(Context context, getTopLeftCornerWidth gettopleftcornerwidth, C7507tQ tQVar, CreditCardCaptureModule creditCardCaptureModule, Executor executor, nAllocationRead2D nallocationread2d, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory) {
            this.MediaBrowserCompat$CustomActionResultReceiver = context;
            this.IconCompatParcelizer = gettopleftcornerwidth;
            this.MediaBrowserCompat$ItemReceiver = tQVar;
            this.RatingCompat = creditCardCaptureModule;
            this.write = executor;
            this.MediaMetadataCompat = nallocationread2d;
            this.read = creditCardCaptureModule_GetIParametersFactory;
        }
    }

    /* renamed from: o.isComplex$21 */
    public static final class C137921 implements read, Runnable {
        private final C138124 MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        private final Runnable read;
        private final RenderScript write;

        C137921() {
        }

        public final float getInterpolation(float f) {
            return (float) Math.pow((double) f, 3.0d);
        }

        public C137921(C138124 r1, RenderScript renderScript, int i, Runnable runnable) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            this.write = renderScript;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = runnable;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r6.RatingCompat.IconCompatParcelizer(r7, r8 + 1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
            r9.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b8 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                o.isComplex$24 r6 = r13.MediaBrowserCompat$CustomActionResultReceiver
                o.RenderScript r7 = r13.write
                int r8 = r13.MediaBrowserCompat$ItemReceiver
                java.lang.Runnable r9 = r13.read
                r10 = 1
                o.nAllocationRead2D r0 = r6.MediaMetadataCompat     // Catch:{ SynchronizationException -> 0x00b8 }
                o.tQ r1 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ SynchronizationException -> 0x00b8 }
                o.isComplex$28 r2 = new o.isComplex$28     // Catch:{ SynchronizationException -> 0x00b8 }
                r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                r0.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ SynchronizationException -> 0x00b8 }
                android.content.Context r0 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ SynchronizationException -> 0x00b8 }
                java.lang.String r1 = "connectivity"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ SynchronizationException -> 0x00b8 }
                android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x00b8 }
                if (r0 == 0) goto L_0x002d
                boolean r0 = r0.isConnected()     // Catch:{ SynchronizationException -> 0x00b8 }
                if (r0 == 0) goto L_0x002d
                r0 = r10
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 != 0) goto L_0x003c
                o.nAllocationRead2D r0 = r6.MediaMetadataCompat     // Catch:{ SynchronizationException -> 0x00b8 }
                o.isComplex$27 r1 = new o.isComplex$27     // Catch:{ SynchronizationException -> 0x00b8 }
                r1.<init>(r6, r7, r8)     // Catch:{ SynchronizationException -> 0x00b8 }
                r0.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                goto L_0x00be
            L_0x003c:
                o.getTopLeftCornerWidth r0 = r6.IconCompatParcelizer     // Catch:{ SynchronizationException -> 0x00b8 }
                java.lang.String r1 = r7.write()     // Catch:{ SynchronizationException -> 0x00b8 }
                o.nAllocationCopyToBitmap r0 = r0.read(r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                o.nAllocationRead2D r1 = r6.MediaMetadataCompat     // Catch:{ SynchronizationException -> 0x00b8 }
                o.isComplex$25 r2 = new o.isComplex$25     // Catch:{ SynchronizationException -> 0x00b8 }
                r2.<init>(r6, r7)     // Catch:{ SynchronizationException -> 0x00b8 }
                java.lang.Object r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ SynchronizationException -> 0x00b8 }
                r3 = r1
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ SynchronizationException -> 0x00b8 }
                java.util.Iterator r1 = r3.iterator()     // Catch:{ SynchronizationException -> 0x00b8 }
                boolean r1 = r1.hasNext()     // Catch:{ SynchronizationException -> 0x00b8 }
                if (r1 == 0) goto L_0x00be
                if (r0 != 0) goto L_0x0072
                java.lang.String r0 = "Uploader"
                java.lang.String r1 = "Unknown backend for %s, deleting event batch for it..."
                p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((java.lang.String) r0, (java.lang.String) r1, (java.lang.Object) r7)     // Catch:{ SynchronizationException -> 0x00b8 }
                o.finish r0 = new o.finish     // Catch:{ SynchronizationException -> 0x00b8 }
                o.finish$IconCompatParcelizer r1 = p040o.finish.IconCompatParcelizer.FATAL_ERROR     // Catch:{ SynchronizationException -> 0x00b8 }
                r4 = -1
                r0.<init>(r1, r4)     // Catch:{ SynchronizationException -> 0x00b8 }
            L_0x0070:
                r2 = r0
                goto L_0x00a7
            L_0x0072:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SynchronizationException -> 0x00b8 }
                r1.<init>()     // Catch:{ SynchronizationException -> 0x00b8 }
                java.util.Iterator r2 = r3.iterator()     // Catch:{ SynchronizationException -> 0x00b8 }
            L_0x007b:
                boolean r4 = r2.hasNext()     // Catch:{ SynchronizationException -> 0x00b8 }
                if (r4 == 0) goto L_0x008d
                java.lang.Object r4 = r2.next()     // Catch:{ SynchronizationException -> 0x00b8 }
                o.nAllocationIoReceive r4 = (p040o.nAllocationIoReceive) r4     // Catch:{ SynchronizationException -> 0x00b8 }
                o.loadProjectionNormalized r4 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ SynchronizationException -> 0x00b8 }
                r1.add(r4)     // Catch:{ SynchronizationException -> 0x00b8 }
                goto L_0x007b
            L_0x008d:
                o.setupDiskCache$read r2 = new o.setupDiskCache$read     // Catch:{ SynchronizationException -> 0x00b8 }
                r2.<init>()     // Catch:{ SynchronizationException -> 0x00b8 }
                o.rsnSystemGetPointerSize$write r1 = r2.read(r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                byte[] r2 = r7.MediaBrowserCompat$ItemReceiver()     // Catch:{ SynchronizationException -> 0x00b8 }
                o.rsnSystemGetPointerSize$write r1 = r1.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ SynchronizationException -> 0x00b8 }
                o.rsnSystemGetPointerSize r1 = r1.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ SynchronizationException -> 0x00b8 }
                o.finish r0 = r0.IconCompatParcelizer((p040o.rsnSystemGetPointerSize) r1)     // Catch:{ SynchronizationException -> 0x00b8 }
                goto L_0x0070
            L_0x00a7:
                o.nAllocationRead2D r11 = r6.MediaMetadataCompat     // Catch:{ SynchronizationException -> 0x00b8 }
                o.isComplex$29 r12 = new o.isComplex$29     // Catch:{ SynchronizationException -> 0x00b8 }
                r0 = r12
                r1 = r6
                r4 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ SynchronizationException -> 0x00b8 }
                r11.MediaBrowserCompat$CustomActionResultReceiver(r12)     // Catch:{ SynchronizationException -> 0x00b8 }
                goto L_0x00be
            L_0x00b6:
                r0 = move-exception
                goto L_0x00c2
            L_0x00b8:
                o.CreditCardCaptureModule r0 = r6.RatingCompat     // Catch:{ all -> 0x00b6 }
                int r8 = r8 + r10
                r0.IconCompatParcelizer(r7, r8)     // Catch:{ all -> 0x00b6 }
            L_0x00be:
                r9.run()
                return
            L_0x00c2:
                r9.run()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.isComplex.C137921.run():void");
        }
    }

    /* renamed from: o.isComplex$25 */
    static final class C138225 implements read, nAllocationRead2D.write {
        private final C138124 MediaBrowserCompat$CustomActionResultReceiver;
        private final RenderScript write;

        C138225() {
        }

        public final float getInterpolation(float f) {
            return ((float) Math.pow((double) (f - 1.0f), 3.0d)) + 1.0f;
        }

        C138225(C138124 r1, RenderScript renderScript) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            this.write = renderScript;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            C138124 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
            return r0.MediaBrowserCompat$ItemReceiver.read(this.write);
        }
    }

    /* renamed from: o.isComplex$29 */
    static final class C138529 implements read, nAllocationRead2D.write {
        private final finish IconCompatParcelizer;
        private final C138124 MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        private final Iterable read;
        private final RenderScript write;

        C138529() {
        }

        public final float getInterpolation(float f) {
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                f2 = (float) Math.pow((double) f3, 3.0d);
            } else {
                f2 = ((float) Math.pow((double) (f3 - 2.0f), 3.0d)) + 2.0f;
            }
            return f2 * 0.5f;
        }

        C138529(C138124 r1, finish finish, Iterable iterable, RenderScript renderScript, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            this.IconCompatParcelizer = finish;
            this.read = iterable;
            this.write = renderScript;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            C138124 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
            finish finish = this.IconCompatParcelizer;
            Iterable iterable = this.read;
            RenderScript renderScript = this.write;
            int i = this.MediaBrowserCompat$ItemReceiver;
            if (finish.MediaBrowserCompat$ItemReceiver == finish.IconCompatParcelizer.TRANSIENT_ERROR) {
                r0.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(iterable);
                r0.RatingCompat.IconCompatParcelizer(renderScript, i + 1);
                return null;
            }
            r0.MediaBrowserCompat$ItemReceiver.write(iterable);
            if (finish.MediaBrowserCompat$ItemReceiver == finish.IconCompatParcelizer.OK) {
                r0.MediaBrowserCompat$ItemReceiver.write(renderScript, r0.read.MediaBrowserCompat$ItemReceiver() + finish.write);
            }
            if (!r0.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(renderScript)) {
                return null;
            }
            r0.RatingCompat.IconCompatParcelizer(renderScript, 1);
            return null;
        }
    }

    /* renamed from: o.isComplex$28 */
    static final class C138428 implements read, nAllocationRead2D.write {
        private final C7507tQ write;

        C138428() {
        }

        public final float getInterpolation(float f) {
            return (float) Math.pow((double) f, 4.0d);
        }

        C138428(C7507tQ tQVar) {
            this.write = tQVar;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            return Integer.valueOf(this.write.read());
        }
    }

    /* renamed from: o.isComplex$27 */
    static final class C138327 implements read, nAllocationRead2D.write {
        private final RenderScript MediaBrowserCompat$CustomActionResultReceiver;
        private final C138124 read;
        private final int write;

        C138327() {
        }

        public final float getInterpolation(float f) {
            return -(((float) Math.pow((double) (f - 1.0f), 4.0d)) - 1.0f);
        }

        C138327(C138124 r1, RenderScript renderScript, int i) {
            this.read = r1;
            this.MediaBrowserCompat$CustomActionResultReceiver = renderScript;
            this.write = i;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            C138124 r0 = this.read;
            r0.RatingCompat.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write + 1);
            return null;
        }
    }

    /* renamed from: o.isComplex$4 */
    public static final class C13654 implements read {
        private int IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private BigInteger MediaBrowserCompat$ItemReceiver;
        private BigInteger MediaMetadataCompat;
        private String RatingCompat;
        private String read;
        byte[] write;

        C13654() {
        }

        public final float getInterpolation(float f) {
            float pow;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                pow = (float) Math.pow((double) f3, 4.0d);
                f2 = 0.5f;
            } else {
                pow = ((float) Math.pow((double) (f3 - 2.0f), 4.0d)) - 2.0f;
                f2 = -0.5f;
            }
            return pow * f2;
        }

        public C13654(C13622 r4, int i, String str, String str2) throws EncryptedMessageException {
            byte[] bArr;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.RatingCompat = str;
            this.read = str2;
            if (i == 0 || str2 == null || str == null) {
                throw new EncryptedMessageException("Error no : 42 Invalid RSA key");
            }
            try {
                this.MediaBrowserCompat$ItemReceiver = new BigInteger(str2, 16);
                this.MediaMetadataCompat = new BigInteger(str, 16);
                int length = (this.read.length() + 1) / 2;
                int length2 = (this.RatingCompat.length() + 1) / 2;
                int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (length == i2 && length2 == i2) {
                    int i3 = ((length << 3) + 7) / 8;
                    this.IconCompatParcelizer = i3;
                    if ((i3 - 1) + 1 >= 0) {
                        byte[] byteArray = new BigInteger(1, r4.write).modPow(this.MediaMetadataCompat, this.MediaBrowserCompat$ItemReceiver).toByteArray();
                        int length3 = byteArray.length;
                        if (byteArray[0] != 0 || length3 <= this.IconCompatParcelizer) {
                            int i4 = this.IconCompatParcelizer;
                            if (length3 < i4) {
                                bArr = new byte[i4];
                                System.arraycopy(byteArray, 0, bArr, i4 - length3, length3);
                            }
                            this.write = byteArray;
                            return;
                        }
                        int i5 = length3 - 1;
                        bArr = new byte[i5];
                        System.arraycopy(byteArray, 1, bArr, 0, i5);
                        byteArray = bArr;
                        this.write = byteArray;
                        return;
                    }
                    throw new EncryptedMessageException("Error no : 40 input data too large for RSA encryption");
                }
                StringBuilder sb = new StringBuilder("Error no : 41 Invalid RSA key length mod=");
                sb.append(length);
                sb.append("<>");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(" exp=");
                sb.append(length2);
                sb.append("<>");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                throw new EncryptedMessageException(sb.toString());
            } catch (NumberFormatException unused) {
                throw new EncryptedMessageException("Error no : 42 Invalid RSA key");
            }
        }
    }

    /* renamed from: o.isComplex$2 */
    public static final class C13622 implements read {
        String MediaBrowserCompat$CustomActionResultReceiver;
        private byte[] read;
        byte[] write;

        C13622() {
        }

        public final float getInterpolation(float f) {
            return (-((float) Math.cos(((double) f) * 1.5707963267948966d))) + 1.0f;
        }

        public C13622(C13687 r19, int i) throws OAEPEncodedMsgException {
            C13687 r1 = r19;
            int i2 = i;
            this.read = new byte[16];
            int i3 = i2 - 1;
            this.write = new byte[i3];
            int i4 = i2 - ((r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver + 1) << 1);
            int i5 = i3 - r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            Byte[] bArr = new Byte[i4];
            byte[] bArr2 = new byte[i4];
            int i6 = r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            byte[] bArr3 = new byte[i5];
            byte[] bArr4 = new byte[i5];
            byte[] bArr5 = new byte[i5];
            byte[] bArr6 = new byte[r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver];
            byte[] bArr7 = new byte[r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver];
            byte[] bArr8 = new byte[r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver];
            if (r1 != null) {
                int i7 = r1.MediaBrowserCompat$CustomActionResultReceiver;
                if (i7 < 17 || i7 > i4) {
                    throw new OAEPEncodedMsgException("Error no : 31 Invalid PIN message length");
                }
                r1.MediaBrowserCompat$CustomActionResultReceiver(bArr);
                Random random = new Random();
                random.nextBytes(this.read);
                byte[] read2 = r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read(this.read, 16);
                C13665.write(bArr3, 0);
                System.arraycopy(read2, 0, bArr3, 0, r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                int i8 = r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver + (((i5 - r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) - i7) - 1);
                bArr3[i8] = 1;
                read(bArr, bArr2, i7);
                System.arraycopy(bArr2, 0, bArr3, i8 + 1, i7);
                random.nextBytes(bArr6);
                read(r1, bArr6, bArr4, i5, i2);
                IconCompatParcelizer(bArr3, bArr4, bArr5);
                read(r1, bArr5, bArr7, r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, i2);
                byte[] bArr9 = bArr8;
                IconCompatParcelizer(bArr6, bArr7, bArr9);
                System.arraycopy(bArr9, 0, this.write, 0, r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                System.arraycopy(bArr5, 0, this.write, r1.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, i5);
                this.MediaBrowserCompat$CustomActionResultReceiver = C13665.read(this.read);
                return;
            }
            throw new OAEPEncodedMsgException("Error no : 30 - Invalid PIN Message");
        }

        private static void read(C13687 r11, byte[] bArr, byte[] bArr2, int i, int i2) {
            int i3 = r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            byte[] bArr3 = new byte[4];
            byte[] bArr4 = new byte[(i2 - 1)];
            int i4 = r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int length = bArr.length;
            int i5 = i / r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int i6 = i - (r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver * i5);
            if (i6 > 0) {
                i5++;
            }
            int i7 = r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            for (int i8 = 0; i8 < i5; i8++) {
                bArr3[0] = (byte) (i8 >>> 24);
                bArr3[1] = (byte) (i8 >>> 16);
                bArr3[2] = (byte) (i8 >>> 8);
                bArr3[3] = (byte) i8;
                System.arraycopy(bArr, 0, bArr4, 0, length);
                System.arraycopy(bArr3, 0, bArr4, length, 4);
                byte[] read2 = r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read(bArr4, length + 4);
                int i9 = r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (i8 == i5 - 1 && i6 > 0) {
                    i7 = i6;
                }
                System.arraycopy(read2, 0, bArr2, i9 * i8, i7);
            }
        }

        private static void read(Byte[] bArr, byte[] bArr2, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                bArr2[i2] = bArr[i2].byteValue();
            }
        }

        private static void IconCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
        }
    }

    /* renamed from: o.isComplex$5 */
    public static final class C13665 implements read {
        public String IconCompatParcelizer;
        private String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        private String read;
        private int write;

        C13665() {
        }

        public final float getInterpolation(float f) {
            return (float) Math.sin(((double) f) * 1.5707963267948966d);
        }

        public C13665(String str, String str2) {
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = (str2.length() + 1) / 2;
        }

        public static String read(byte[] bArr) {
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(Character.toUpperCase(Character.forDigit((bArr[i] & 240) >> 4, 16)));
                stringBuffer.append(Character.toUpperCase(Character.forDigit(bArr[i] & 15, 16)));
            }
            return new String(stringBuffer);
        }

        public static int MediaBrowserCompat$ItemReceiver(String str, byte[] bArr, int i) {
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int digit = Character.digit(str.charAt(i2), 16);
                if (digit == -1) {
                    return 1;
                }
                int i4 = digit << 4;
                int i5 = i2 + 1;
                if (i5 < length) {
                    int digit2 = Character.digit(str.charAt(i5), 16);
                    if (digit2 == -1) {
                        return 1;
                    }
                    bArr[i3 + i] = (byte) (i4 | digit2);
                } else {
                    bArr[i3 + i] = (byte) (i4 | 15);
                }
                i2 = i5 + 1;
                i3++;
            }
            return 0;
        }

        public static void write(byte[] bArr, int i) {
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = 0;
            }
        }

        public final int write(String str, String str2, String str3, Properties properties) {
            if (!((this.write == 0 || this.read == null || this.MediaBrowserCompat$CustomActionResultReceiver == null) ? false : true)) {
                return 42;
            }
            try {
                C13622 r4 = new C13622(new C13687(new C13643(str, properties), new C13643(str2, properties), str3, this.write), this.write);
                this.IconCompatParcelizer = r4.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$ItemReceiver = read(new C13654(r4, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver).write);
                return 0;
            } catch (PINBlockException e) {
                String message = e.getMessage();
                int indexOf = message.indexOf("Error no : ") + 11;
                int parseInt = Integer.parseInt(message.substring(indexOf, indexOf + 2));
                System.out.println(message);
                return parseInt;
            } catch (PINMessageException e2) {
                String message2 = e2.getMessage();
                int indexOf2 = message2.indexOf("Error no : ") + 11;
                int parseInt2 = Integer.parseInt(message2.substring(indexOf2, indexOf2 + 2));
                System.out.println(message2);
                return parseInt2;
            } catch (EncryptedMessageException e3) {
                String message3 = e3.getMessage();
                int indexOf3 = message3.indexOf("Error no : ") + 11;
                int parseInt3 = Integer.parseInt(message3.substring(indexOf3, indexOf3 + 2));
                System.out.println(message3);
                return parseInt3;
            } catch (OAEPEncodedMsgException e4) {
                String message4 = e4.getMessage();
                int indexOf4 = message4.indexOf("Error no : ") + 11;
                int parseInt4 = Integer.parseInt(message4.substring(indexOf4, indexOf4 + 2));
                System.out.println(message4);
                return parseInt4;
            }
        }

        public final int read(String str, String str2, Properties properties) {
            if (!((this.write == 0 || this.read == null || this.MediaBrowserCompat$CustomActionResultReceiver == null) ? false : true)) {
                return 42;
            }
            try {
                C13622 r6 = new C13622(new C13687(new C13643(str, properties), str2, this.write), this.write);
                this.IconCompatParcelizer = r6.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$ItemReceiver = read(new C13654(r6, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver).write);
                return 0;
            } catch (PINBlockException e) {
                String message = e.getMessage();
                int indexOf = message.indexOf("Error no : ") + 11;
                int parseInt = Integer.parseInt(message.substring(indexOf, indexOf + 2));
                System.out.println(message);
                return parseInt;
            } catch (PINMessageException e2) {
                String message2 = e2.getMessage();
                int indexOf2 = message2.indexOf("Error no : ") + 11;
                int parseInt2 = Integer.parseInt(message2.substring(indexOf2, indexOf2 + 2));
                System.out.println(message2);
                return parseInt2;
            } catch (EncryptedMessageException e3) {
                String message3 = e3.getMessage();
                int indexOf3 = message3.indexOf("Error no : ") + 11;
                int parseInt3 = Integer.parseInt(message3.substring(indexOf3, indexOf3 + 2));
                System.out.println(message3);
                return parseInt3;
            } catch (OAEPEncodedMsgException e4) {
                String message4 = e4.getMessage();
                int indexOf4 = message4.indexOf("Error no : ") + 11;
                int parseInt4 = Integer.parseInt(message4.substring(indexOf4, indexOf4 + 2));
                System.out.println(message4);
                return parseInt4;
            }
        }
    }

    /* renamed from: o.isComplex$3 */
    public static final class C13643 implements read {
        private int IconCompatParcelizer;
        byte[] MediaBrowserCompat$CustomActionResultReceiver;
        C13698 MediaBrowserCompat$ItemReceiver;
        int read;
        private int write;

        C13643() {
        }

        public final float getInterpolation(float f) {
            return (((float) Math.cos(((double) f) * 3.141592653589793d)) - 1.0f) * -0.5f;
        }

        public C13643(String str, Properties properties) throws PINBlockException {
            MediaBrowserCompat$ItemReceiver(str, properties);
        }

        private void MediaBrowserCompat$ItemReceiver(String str, Properties properties) throws PINBlockException {
            if (str == null || str.length() == 0) {
                throw new PINBlockException("Error no : 11 - Invalid PIN String");
            }
            try {
                this.write = str.getBytes("UTF-8").length;
                int parseInt = (properties == null || !properties.containsKey("param_pinMinLen")) ? 1 : Integer.parseInt(properties.getProperty("param_pinMinLen"));
                int i = 30;
                if (properties != null && properties.containsKey("param_pinMaxLen")) {
                    i = Integer.parseInt(properties.getProperty("param_pinMaxLen"));
                }
                int i2 = this.write;
                if (i2 > i || i2 < parseInt) {
                    throw new PINBlockException("Error no : 10 - Invalid PIN length");
                }
                for (int i3 = 0; i3 < str.length(); i3++) {
                }
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    int i4 = this.write;
                    if (i4 <= 6) {
                        this.IconCompatParcelizer = 1;
                    } else {
                        this.IconCompatParcelizer = ((i4 - 7) / 8) + 2;
                    }
                    int i5 = this.IconCompatParcelizer;
                    int i6 = i5 << 3;
                    this.read = i6;
                    if (i5 == 1) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[8];
                    } else if (i5 == 2) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[16];
                    } else if (i5 != 3) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[i6];
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[24];
                    }
                    byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int length = bArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        bArr[i7] = -1;
                    }
                    byte[] bArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    bArr2[0] = -63;
                    int i8 = this.write;
                    bArr2[1] = (byte) i8;
                    System.arraycopy(bytes, 0, bArr2, 2, i8);
                    byte b = Ascii.DC2;
                    if (properties != null) {
                        b = (byte) Integer.parseInt(properties.getProperty("AlgorithmID", "12"), 16);
                    }
                    try {
                        this.MediaBrowserCompat$ItemReceiver = new C13698(b);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(e.getClass());
                        sb.append(": ");
                        sb.append(e.getMessage());
                        throw new PINBlockException(sb.toString());
                    }
                } catch (UnsupportedEncodingException e2) {
                    StringBuilder sb2 = new StringBuilder("Error no : 11 - Invalid PIN String - ");
                    sb2.append(e2.getMessage());
                    throw new PINBlockException(sb2.toString());
                }
            } catch (UnsupportedEncodingException e3) {
                StringBuilder sb3 = new StringBuilder("Error no : 11 - Invalid PIN String - ");
                sb3.append(e3.getMessage());
                throw new PINBlockException(sb3.toString());
            }
        }
    }

    /* renamed from: o.isComplex$7 */
    public static final class C13687 implements read {
        private Vector IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        C13643 MediaBrowserCompat$ItemReceiver;
        private byte[] read;

        C13687() {
        }

        public final float getInterpolation(float f) {
            return f == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : (float) Math.pow(2.0d, (double) ((f - 1.0f) * 10.0f));
        }

        public C13687(C13643 r5, C13643 r6, String str, int i) throws PINMessageException {
            byte[] bArr = new byte[(i - ((r6.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver + 1) << 1))];
            this.read = bArr;
            bArr[0] = 2;
            this.MediaBrowserCompat$CustomActionResultReceiver = 1;
            this.MediaBrowserCompat$ItemReceiver = r6;
            write(r5);
            write(r6);
            read(str, i);
            Vector vector = new Vector(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer = vector;
            MediaBrowserCompat$CustomActionResultReceiver(this.read, vector, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public C13687(C13643 r4, String str, int i) throws PINMessageException {
            byte[] bArr = new byte[(i - ((r4.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver + 1) << 1))];
            this.read = bArr;
            bArr[0] = 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = 1;
            this.MediaBrowserCompat$ItemReceiver = r4;
            write(r4);
            read(str, i);
            Vector vector = new Vector(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer = vector;
            MediaBrowserCompat$CustomActionResultReceiver(this.read, vector, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        private void write(C13643 r5) throws PINMessageException {
            if (r5 != null) {
                int i = r5.read;
                System.arraycopy(r5.MediaBrowserCompat$CustomActionResultReceiver, 0, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, i);
                this.MediaBrowserCompat$CustomActionResultReceiver += i;
                return;
            }
            throw new PINMessageException("Error no : 20 - Invalid PIN Block");
        }

        private void read(String str, int i) throws PINMessageException {
            if (str != null) {
                int length = str.length();
                int i2 = (length + 1) / 2;
                int i3 = (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver + 1) << 1;
                int i4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (length < 16 || length > (((i - i3) - i4) << 1) || length != (i2 << 1)) {
                    throw new PINMessageException("Error no : 21 - Invalid Random Number String length");
                } else if (C13665.MediaBrowserCompat$ItemReceiver(str, this.read, i4) == 0) {
                    this.MediaBrowserCompat$CustomActionResultReceiver += i2;
                } else {
                    throw new PINMessageException("Error no : 22 - Invalid Random Number String");
                }
            } else {
                throw new PINMessageException("Error no : 22 - Invalid Random Number String");
            }
        }

        private static void MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, Vector vector, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                vector.addElement(new Byte(bArr[i2]));
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Byte[] bArr) {
            int size = this.IconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                bArr[i] = (Byte) this.IconCompatParcelizer.elementAt(i);
            }
        }
    }

    /* renamed from: o.isComplex$10 */
    public static final class C135910 implements read {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String write;

        C135910() {
        }

        public final float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (double) ((f + 1.0f) * -10.0f)));
        }

        public C135910(String str) throws EncryptedMessageException {
            if (str == null || "".equals(str)) {
                throw new EncryptedMessageException("Error no : 43 Public key is not found");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            if (!stringTokenizer.hasMoreTokens()) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                this.write = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                this.write = stringTokenizer.nextToken();
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write = null;
        }
    }

    /* renamed from: o.isComplex$6 */
    public static final class C13676 implements read {
        int MediaBrowserCompat$ItemReceiver;
        private String read;

        C13676() {
        }

        public final float getInterpolation(float f) {
            float f2;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                f2 = (float) Math.pow(2.0d, (double) ((f3 - 1.0f) * 10.0f));
            } else {
                f2 = (-((float) Math.pow(2.0d, (double) ((f3 - 1.0f) * -10.0f)))) + 2.0f;
            }
            return f2 * 0.5f;
        }

        public C13676(String str) throws NoSuchAlgorithmException {
            if (str.toUpperCase() == McElieceCCA2KeyGenParameterSpec.SHA224) {
                this.read = str;
                this.MediaBrowserCompat$ItemReceiver = PassportService.DEFAULT_MAX_BLOCKSIZE;
            } else if (str.toUpperCase() == McElieceCCA2KeyGenParameterSpec.SHA256) {
                this.read = str;
                this.MediaBrowserCompat$ItemReceiver = 256;
            } else if (str.toUpperCase() == McElieceCCA2KeyGenParameterSpec.SHA384) {
                this.read = str;
                this.MediaBrowserCompat$ItemReceiver = 384;
            } else if (str.toUpperCase() == McElieceCCA2KeyGenParameterSpec.SHA512) {
                this.read = str;
                this.MediaBrowserCompat$ItemReceiver = 512;
            } else {
                throw new NoSuchAlgorithmException("algorithm must be one of SHA-256, SHA-384, or SHA-512");
            }
        }

        private static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr) {
            int length = bArr.length;
            int i = length % 64;
            int i2 = 64 - i;
            if (i2 < 9) {
                i2 = 128 - i;
            }
            byte[] bArr2 = new byte[i2];
            bArr2[0] = ISOFileInfo.DATA_BYTES1;
            long j = (long) (length << 3);
            for (int i3 = 0; i3 < 8; i3++) {
                bArr2[(i2 - 1) - i3] = (byte) ((int) ((j >>> (i3 << 3)) & 255));
            }
            byte[] bArr3 = new byte[(length + i2)];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            System.arraycopy(bArr2, 0, bArr3, length, i2);
            return bArr3;
        }

        private static byte[] read(byte[] bArr) {
            int length = bArr.length;
            int i = 128 - (length % 128);
            byte[] bArr2 = new byte[i];
            bArr2[0] = ISOFileInfo.DATA_BYTES1;
            long j = (long) (length << 3);
            for (int i2 = 0; i2 < 8; i2++) {
                bArr2[(i - 1) - i2] = (byte) ((int) ((j >> (i2 << 3)) & 255));
            }
            byte[] bArr3 = new byte[(length + i)];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            System.arraycopy(bArr2, 0, bArr3, length, i);
            return bArr3;
        }

        public final byte[] IconCompatParcelizer(byte[] bArr) {
            int i;
            int i2;
            String str = this.read;
            char c = 5;
            int i3 = 8;
            int i4 = 64;
            int i5 = 4;
            char c2 = 3;
            int i6 = 2;
            int i7 = 7;
            char c3 = 1;
            int i8 = 0;
            if (str == McElieceCCA2KeyGenParameterSpec.SHA224) {
                byte[] bArr2 = new byte[28];
                byte[] bArr3 = new byte[64];
                byte[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(bArr);
                int[] iArr = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
                int[] iArr2 = {-1056596264, 914150663, 812702999, -150054599, -4191439, 1750603025, 1694076839, -1090891868};
                int i9 = 0;
                while (i9 < MediaBrowserCompat$ItemReceiver2.length / i4) {
                    int[] iArr3 = new int[i4];
                    int i10 = iArr2[i8];
                    int i11 = iArr2[c3];
                    int i12 = iArr2[i6];
                    int i13 = iArr2[c2];
                    int i14 = iArr2[i5];
                    int i15 = iArr2[c];
                    int i16 = iArr2[6];
                    int i17 = iArr2[i7];
                    System.arraycopy(MediaBrowserCompat$ItemReceiver2, i9 << 6, bArr3, i8, i4);
                    int i18 = i8;
                    int i19 = 16;
                    while (i18 < i19) {
                        iArr3[i18] = i8;
                        for (int i20 = 0; i20 < 4; i20++) {
                            iArr3[i18] = iArr3[i18] | ((bArr3[(i18 << 2) + i20] & 255) << (24 - (i20 << 3)));
                        }
                        i18++;
                        i8 = 0;
                        i19 = 16;
                        i4 = 64;
                        c2 = 3;
                        i6 = 2;
                        c3 = 1;
                    }
                    int i21 = 16;
                    while (i21 < i4) {
                        int i22 = i21 - 15;
                        int rotateRight = Integer.rotateRight(iArr3[i22], 7);
                        int rotateRight2 = Integer.rotateRight(iArr3[i22], 18);
                        int i23 = i21 - 2;
                        iArr3[i21] = iArr3[i21 - 16] + ((iArr3[i22] >>> 3) ^ (rotateRight ^ rotateRight2)) + iArr3[i21 - 7] + ((iArr3[i23] >>> 10) ^ (Integer.rotateRight(iArr3[i23], 17) ^ Integer.rotateRight(iArr3[i23], 19)));
                        i21++;
                        i8 = 0;
                        i4 = 64;
                        c2 = 3;
                        i6 = 2;
                        c3 = 1;
                    }
                    int i24 = i8;
                    while (true) {
                        i = i10;
                        i2 = i14;
                        if (i24 >= i4) {
                            break;
                        }
                        int rotateRight3 = Integer.rotateRight(i, i6);
                        int rotateRight4 = Integer.rotateRight(i, 13);
                        int rotateRight5 = Integer.rotateRight(i, 22);
                        int rotateRight6 = i17 + (Integer.rotateRight(i2, 25) ^ (Integer.rotateRight(i2, 6) ^ Integer.rotateRight(i2, 11))) + (((~i2) & i16) ^ (i2 & i15)) + iArr[i24] + iArr3[i24];
                        i24++;
                        i14 = i13 + rotateRight6;
                        i10 = rotateRight6 + ((rotateRight3 ^ rotateRight4) ^ rotateRight5) + (((i & i11) ^ (i & i12)) ^ (i11 & i12));
                        i13 = i12;
                        i17 = i16;
                        i8 = 0;
                        i4 = 64;
                        i6 = 2;
                        c3 = 1;
                        i12 = i11;
                        i16 = i15;
                        i11 = i;
                        i15 = i2;
                    }
                    iArr2[i8] = iArr2[i8] + i;
                    iArr2[c3] = iArr2[c3] + i11;
                    iArr2[i6] = iArr2[i6] + i12;
                    iArr2[c2] = iArr2[c2] + i13;
                    iArr2[4] = iArr2[4] + i2;
                    iArr2[5] = iArr2[5] + i15;
                    iArr2[6] = iArr2[6] + i16;
                    iArr2[7] = iArr2[7] + i17;
                    i9++;
                    c = 5;
                    i5 = 4;
                    i7 = 7;
                }
                for (int i25 = i8; i25 < i7; i25++) {
                    System.arraycopy(rsnAllocationRead1D.IconCompatParcelizer(iArr2[i25]), i8, bArr2, i25 << 2, i5);
                }
                return bArr2;
            } else if (str == McElieceCCA2KeyGenParameterSpec.SHA256) {
                byte[] bArr4 = new byte[32];
                int i26 = 64;
                byte[] bArr5 = new byte[64];
                byte[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(bArr);
                int[] iArr4 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
                int[] iArr5 = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
                int i27 = 0;
                while (i27 < MediaBrowserCompat$ItemReceiver3.length / i26) {
                    int i28 = 64;
                    int i29 = 0;
                    int[] iArr6 = new int[64];
                    int i30 = iArr5[0];
                    int i31 = iArr5[1];
                    int i32 = iArr5[2];
                    int i33 = iArr5[3];
                    int i34 = iArr5[4];
                    int i35 = iArr5[5];
                    int i36 = iArr5[6];
                    int i37 = iArr5[7];
                    System.arraycopy(MediaBrowserCompat$ItemReceiver3, i27 << 6, bArr5, 0, 64);
                    int i38 = 0;
                    int i39 = 16;
                    while (i38 < i39) {
                        byte[] bArr6 = bArr4;
                        byte[] bArr7 = MediaBrowserCompat$ItemReceiver3;
                        int[] iArr7 = iArr4;
                        iArr6[i38] = i29;
                        for (int i40 = 0; i40 < 4; i40++) {
                            iArr6[i38] = iArr6[i38] | ((bArr5[(i38 << 2) + i40] & 255) << (24 - (i40 << 3)));
                        }
                        i38++;
                        bArr4 = bArr6;
                        MediaBrowserCompat$ItemReceiver3 = bArr7;
                        iArr4 = iArr7;
                        i28 = 64;
                        i39 = 16;
                        i29 = 0;
                    }
                    int i41 = 16;
                    while (i41 < i28) {
                        byte[] bArr8 = bArr4;
                        byte[] bArr9 = MediaBrowserCompat$ItemReceiver3;
                        int i42 = i41 - 15;
                        int rotateRight7 = Integer.rotateRight(iArr6[i42], 7);
                        int rotateRight8 = Integer.rotateRight(iArr6[i42], 18);
                        int i43 = iArr6[i42];
                        int i44 = i41 - 2;
                        int rotateRight9 = Integer.rotateRight(iArr6[i44], 17);
                        iArr6[i41] = iArr6[i41 - 16] + ((i43 >>> 3) ^ (rotateRight7 ^ rotateRight8)) + iArr6[i41 - 7] + ((iArr6[i44] >>> 10) ^ (Integer.rotateRight(iArr6[i44], 19) ^ rotateRight9));
                        i41++;
                        i28 = 64;
                        i29 = 0;
                        bArr4 = bArr8;
                        MediaBrowserCompat$ItemReceiver3 = bArr9;
                        iArr4 = iArr4;
                    }
                    int i45 = i29;
                    int i46 = i34;
                    while (i45 < i28) {
                        int rotateRight10 = Integer.rotateRight(i30, 2);
                        int rotateRight11 = Integer.rotateRight(i30, 13);
                        int rotateRight12 = Integer.rotateRight(i30, 22);
                        int rotateRight13 = i37 + ((Integer.rotateRight(i46, 6) ^ Integer.rotateRight(i46, 11)) ^ Integer.rotateRight(i46, 25)) + (((~i46) & i36) ^ (i46 & i35)) + iArr4[i45] + iArr6[i45];
                        i45++;
                        int i47 = i33 + rotateRight13;
                        int i48 = rotateRight13 + (rotateRight12 ^ (rotateRight11 ^ rotateRight10)) + (((i30 & i31) ^ (i30 & i32)) ^ (i31 & i32));
                        i28 = 64;
                        i29 = 0;
                        i33 = i32;
                        i37 = i36;
                        bArr4 = bArr4;
                        MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver3;
                        i36 = i35;
                        i32 = i31;
                        i35 = i46;
                        i31 = i30;
                        i46 = i47;
                        i30 = i48;
                    }
                    iArr5[i29] = iArr5[i29] + i30;
                    iArr5[1] = iArr5[1] + i31;
                    iArr5[2] = iArr5[2] + i32;
                    iArr5[3] = iArr5[3] + i33;
                    iArr5[4] = iArr5[4] + i46;
                    iArr5[5] = iArr5[5] + i35;
                    iArr5[6] = iArr5[6] + i36;
                    iArr5[7] = iArr5[7] + i37;
                    i27++;
                    i26 = 64;
                    i3 = 8;
                }
                for (int i49 = 0; i49 < i3; i49++) {
                    System.arraycopy(rsnAllocationRead1D.IconCompatParcelizer(iArr5[i49]), 0, bArr4, i49 << 2, 4);
                }
                return bArr4;
            } else {
                int i50 = 80;
                if (str == McElieceCCA2KeyGenParameterSpec.SHA384) {
                    byte[] bArr10 = new byte[48];
                    byte[] bArr11 = new byte[128];
                    byte[] read2 = read(bArr);
                    long[] jArr = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
                    long[] jArr2 = {-3766243637369397544L, 7105036623409894663L, -7973340178411365097L, 1526699215303891257L, 7436329637833083697L, -8163818279084223215L, -2662702644619276377L, 5167115440072839076L};
                    int i51 = 0;
                    for (int i52 = 128; i51 < read2.length / i52; i52 = 128) {
                        int i53 = 0;
                        long[] jArr3 = new long[i50];
                        long j = jArr2[0];
                        long j2 = jArr2[1];
                        long j3 = jArr2[2];
                        long j4 = jArr2[3];
                        long j5 = jArr2[4];
                        long j6 = jArr2[5];
                        long j7 = jArr2[6];
                        long j8 = jArr2[7];
                        System.arraycopy(read2, i51 << 7, bArr11, 0, i52);
                        int i54 = 0;
                        int i55 = 16;
                        while (i54 < i55) {
                            jArr3[i54] = 0;
                            int i56 = 0;
                            for (int i57 = 8; i56 < i57; i57 = 8) {
                                long[] jArr4 = jArr3;
                                jArr4[i54] = jArr3[i54] | ((((long) bArr11[(i54 << 3) + i56]) & 255) << (56 - (i56 << 3)));
                                i56++;
                                jArr3 = jArr4;
                            }
                            i54++;
                            i55 = 16;
                            i50 = 80;
                            i53 = 0;
                        }
                        int i58 = 16;
                        while (i58 < i50) {
                            long j9 = jArr3[i58 - 2];
                            long rotateRight14 = ((j9 >>> 6) ^ (Long.rotateRight(j9, 19) ^ Long.rotateRight(j9, 61))) + jArr3[i58 - 7];
                            long j10 = jArr3[i58 - 15];
                            jArr3[i58] = rotateRight14 + ((j10 >>> 7) ^ (Long.rotateRight(j10, 1) ^ Long.rotateRight(j10, 8))) + jArr3[i58 - 16];
                            i58++;
                            i50 = 80;
                            i53 = 0;
                        }
                        int i59 = i53;
                        long j11 = j5;
                        while (i59 < i50) {
                            long rotateRight15 = j8 + (((~j11) & j7) ^ (j6 & j11)) + (Long.rotateRight(j11, 41) ^ (Long.rotateRight(j11, 14) ^ Long.rotateRight(j11, 18))) + jArr3[i59] + jArr[i59];
                            i59++;
                            long rotateRight16 = rotateRight15 + (Long.rotateRight(j, 39) ^ (Long.rotateRight(j, 28) ^ Long.rotateRight(j, 34))) + (((j & j3) ^ (j & j2)) ^ (j2 & j3));
                            long j12 = j4 + rotateRight15;
                            j4 = j3;
                            j8 = j7;
                            i53 = 0;
                            j3 = j2;
                            j7 = j6;
                            j6 = j11;
                            j2 = j;
                            j11 = j12;
                            j = rotateRight16;
                            i50 = 80;
                        }
                        jArr2[i53] = jArr2[i53] + j;
                        jArr2[1] = jArr2[1] + j2;
                        jArr2[2] = jArr2[2] + j3;
                        jArr2[3] = jArr2[3] + j4;
                        jArr2[4] = jArr2[4] + j11;
                        jArr2[5] = jArr2[5] + j6;
                        jArr2[6] = jArr2[6] + j7;
                        jArr2[7] = jArr2[7] + j8;
                        i51++;
                    }
                    for (int i60 = 0; i60 < 6; i60++) {
                        System.arraycopy(rsnAllocationRead1D.MediaBrowserCompat$CustomActionResultReceiver(jArr2[i60]), 0, bArr10, i60 << 3, 8);
                    }
                    return bArr10;
                }
                byte[] bArr12 = new byte[64];
                int i61 = 128;
                byte[] bArr13 = new byte[128];
                byte[] read3 = read(bArr);
                long[] jArr5 = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
                int i62 = 8;
                long[] jArr6 = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
                int i63 = 0;
                while (i63 < read3.length / i61) {
                    int i64 = 0;
                    long[] jArr7 = new long[80];
                    long j13 = jArr6[0];
                    long j14 = jArr6[1];
                    long j15 = jArr6[2];
                    long j16 = jArr6[3];
                    long j17 = jArr6[4];
                    long j18 = jArr6[5];
                    long j19 = jArr6[6];
                    long j20 = jArr6[7];
                    System.arraycopy(read3, i63 << 7, bArr13, 0, 128);
                    int i65 = 0;
                    while (i65 < 16) {
                        byte[] bArr14 = bArr13;
                        byte[] bArr15 = read3;
                        long[] jArr8 = jArr5;
                        long[] jArr9 = jArr6;
                        jArr7[i65] = 0;
                        for (int i66 = 0; i66 < 8; i66++) {
                            jArr7[i65] = jArr7[i65] | ((((long) bArr14[(i65 << 3) + i66]) & 255) << (56 - (i66 << 3)));
                        }
                        i65++;
                        read3 = bArr15;
                        bArr13 = bArr14;
                        jArr6 = jArr9;
                        jArr5 = jArr8;
                        i64 = 0;
                    }
                    int i67 = 16;
                    while (i67 < 80) {
                        byte[] bArr16 = bArr13;
                        long j21 = jArr7[i67 - 2];
                        long rotateRight17 = ((j21 >>> 6) ^ (Long.rotateRight(j21, 19) ^ Long.rotateRight(j21, 61))) + jArr7[i67 - 7];
                        long[] jArr10 = jArr5;
                        long j22 = jArr7[i67 - 15];
                        jArr7[i67] = rotateRight17 + ((j22 >>> 7) ^ (Long.rotateRight(j22, 1) ^ Long.rotateRight(j22, 8))) + jArr7[i67 - 16];
                        i67++;
                        read3 = read3;
                        bArr13 = bArr16;
                        jArr6 = jArr6;
                        jArr5 = jArr10;
                        i64 = 0;
                    }
                    byte[] bArr17 = bArr13;
                    byte[] bArr18 = read3;
                    int i68 = i64;
                    long j23 = j17;
                    while (i68 < 80) {
                        long rotateRight18 = j20 + (((~j23) & j19) ^ (j18 & j23)) + (Long.rotateRight(j23, 41) ^ (Long.rotateRight(j23, 14) ^ Long.rotateRight(j23, 18))) + jArr7[i68] + jArr5[i68];
                        long j24 = j13;
                        i68++;
                        long rotateRight19 = rotateRight18 + (Long.rotateRight(j24, 39) ^ (Long.rotateRight(j24, 28) ^ Long.rotateRight(j24, 34))) + (((j24 & j15) ^ (j24 & j14)) ^ (j14 & j15));
                        long j25 = j16 + rotateRight18;
                        j20 = j19;
                        i64 = 0;
                        j19 = j18;
                        j18 = j23;
                        j23 = j25;
                        j16 = j15;
                        j15 = j14;
                        j14 = j24;
                        j13 = rotateRight19;
                    }
                    jArr6[i64] = jArr6[i64] + j13;
                    jArr6[1] = jArr6[1] + j14;
                    jArr6[2] = jArr6[2] + j15;
                    jArr6[3] = jArr6[3] + j16;
                    jArr6[4] = jArr6[4] + j23;
                    jArr6[5] = jArr6[5] + j18;
                    jArr6[6] = jArr6[6] + j19;
                    jArr6[7] = jArr6[7] + j20;
                    i63++;
                    read3 = bArr18;
                    bArr13 = bArr17;
                    i61 = 128;
                    i62 = 8;
                }
                int i69 = 0;
                while (i69 < i62) {
                    System.arraycopy(rsnAllocationRead1D.MediaBrowserCompat$CustomActionResultReceiver(jArr6[i69]), 0, bArr12, i69 << 3, i62);
                    i69++;
                    i62 = 8;
                }
                return bArr12;
            }
        }
    }

    /* renamed from: o.isComplex$8 */
    static final class C13698 implements read {
        private C13676 IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        private C1432x6bf5cdc3 MediaBrowserCompat$ItemReceiver;

        C13698() {
        }

        public final float getInterpolation(float f) {
            return -(((float) Math.sqrt((double) (1.0f - (f * f)))) - 1.0f);
        }

        C13698(byte b) throws NoSuchAlgorithmException {
            switch (b) {
                case 18:
                    this.MediaBrowserCompat$ItemReceiver = new C1432x6bf5cdc3();
                    this.MediaBrowserCompat$CustomActionResultReceiver = 20;
                    return;
                case 19:
                    C13676 r3 = new C13676(McElieceCCA2KeyGenParameterSpec.SHA224);
                    this.IconCompatParcelizer = r3;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r3.MediaBrowserCompat$ItemReceiver / 8;
                    return;
                case 20:
                    C13676 r32 = new C13676(McElieceCCA2KeyGenParameterSpec.SHA256);
                    this.IconCompatParcelizer = r32;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r32.MediaBrowserCompat$ItemReceiver / 8;
                    return;
                case 21:
                    C13676 r33 = new C13676(McElieceCCA2KeyGenParameterSpec.SHA384);
                    this.IconCompatParcelizer = r33;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r33.MediaBrowserCompat$ItemReceiver / 8;
                    return;
                case 22:
                    C13676 r34 = new C13676(McElieceCCA2KeyGenParameterSpec.SHA512);
                    this.IconCompatParcelizer = r34;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r34.MediaBrowserCompat$ItemReceiver / 8;
                    return;
                default:
                    StringBuilder sb = new StringBuilder("AlgoID=0x");
                    sb.append(Integer.toHexString(b));
                    throw new NoSuchAlgorithmException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public final byte[] read(byte[] bArr, int i) {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                return new C1432x6bf5cdc3().IconCompatParcelizer(bArr, i);
            }
            if (this.IconCompatParcelizer == null) {
                return null;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return this.IconCompatParcelizer.IconCompatParcelizer(bArr2);
        }
    }

    /* renamed from: o.isComplex$9 */
    public static final class C13709 implements read {
        public addToPack$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public float MediaBrowserCompat$ItemReceiver;
        public float MediaBrowserCompat$MediaItem;
        public float MediaBrowserCompat$SearchResultReceiver;
        public float MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public float RatingCompat;
        public float read;
        public int write;

        C13709() {
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        }

        public C13709(float f, float f2, float f3, float f4, int i, addToPack$MediaBrowserCompat$ItemReceiver addtopack_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = Float.NaN;
            this.MediaDescriptionCompat = Float.NaN;
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            this.MediaMetadataCompat = -1;
            this.MediaBrowserCompat$SearchResultReceiver = f;
            this.MediaDescriptionCompat = f2;
            this.RatingCompat = f3;
            this.MediaBrowserCompat$MediaItem = f4;
            this.write = i;
            this.IconCompatParcelizer = addtopack_mediabrowsercompat_itemreceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Highlight, x: ");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", y: ");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", dataSetIndex: ");
            sb.append(this.write);
            sb.append(", stackIndex (only stacked barentry): ");
            sb.append(this.MediaMetadataCompat);
            return sb.toString();
        }
    }

    /* renamed from: o.isComplex$14 */
    public static final class C137414 implements read, nAllocationCopyFromBitmap {
        private final translate read;

        C137414() {
        }

        public final float getInterpolation(float f) {
            float sqrt;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                sqrt = ((float) Math.sqrt((double) (1.0f - (f3 * f3)))) - 1.0f;
                f2 = -0.5f;
            } else {
                float f4 = f3 - 2.0f;
                sqrt = ((float) Math.sqrt((double) (1.0f - (f4 * f4)))) + 1.0f;
                f2 = 0.5f;
            }
            return sqrt * f2;
        }

        public C137414(translate translate) {
            this.read = translate;
        }

        public final Object write(Object obj) {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver((translate.read) obj);
        }
    }

    /* renamed from: o.isComplex$12 */
    public static final class C137212 implements read {
        public final Context MediaBrowserCompat$CustomActionResultReceiver;
        public final CreditCardCaptureModule_GetIParametersFactory MediaBrowserCompat$ItemReceiver;
        public final CreditCardCaptureModule_GetIParametersFactory write;

        C137212() {
        }

        public final float getInterpolation(float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) Math.pow(2.0d, (double) (10.0f * f2))) * ((float) Math.sin((double) (((f2 - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f))));
        }

        @HmlPinActivity
        public C137212(Context context, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = context;
            this.MediaBrowserCompat$ItemReceiver = creditCardCaptureModule_GetIParametersFactory;
            this.write = creditCardCaptureModule_GetIParametersFactory2;
        }
    }

    /* renamed from: o.isComplex$11 */
    public static final class C137111 implements read, C10881getCAR {
        static final Logger MediaBrowserCompat$CustomActionResultReceiver = Logger.getLogger(getPointerSize.class.getName());
        final nAllocationRead2D IconCompatParcelizer;
        final getTopLeftCornerWidth MediaBrowserCompat$ItemReceiver;
        private final Executor MediaMetadataCompat;
        final C7507tQ read;
        final CreditCardCaptureModule write;

        C137111() {
        }

        public final float getInterpolation(float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (double) (-10.0f * f))) * ((float) Math.sin((double) (((f - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f)))) + 1.0f;
        }

        @HmlPinActivity
        public C137111(Executor executor, getTopLeftCornerWidth gettopleftcornerwidth, CreditCardCaptureModule creditCardCaptureModule, C7507tQ tQVar, nAllocationRead2D nallocationread2d) {
            this.MediaMetadataCompat = executor;
            this.MediaBrowserCompat$ItemReceiver = gettopleftcornerwidth;
            this.write = creditCardCaptureModule;
            this.read = tQVar;
            this.IconCompatParcelizer = nallocationread2d;
        }

        public final void write(RenderScript renderScript, loadProjectionNormalized loadprojectionnormalized, Long3 long3) {
            this.MediaMetadataCompat.execute(new C137313(this, renderScript, long3, loadprojectionnormalized));
        }
    }

    /* renamed from: o.isComplex$13 */
    static final class C137313 implements read, Runnable {
        private final C137111 IconCompatParcelizer;
        private final loadProjectionNormalized MediaBrowserCompat$ItemReceiver;
        private final Long3 read;
        private final RenderScript write;

        C137313() {
        }

        public final float getInterpolation(float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) Math.pow(2.0d, (double) (10.0f * f3))) * ((float) Math.sin((double) ((f3 - asin) * 6.2831855f * 2.2222223f))) * -0.5f;
            }
            float f4 = f2 - 1.0f;
            return (((float) Math.pow(2.0d, (double) (-10.0f * f4))) * 0.5f * ((float) Math.sin((double) ((f4 - asin) * 6.2831855f * 2.2222223f)))) + 1.0f;
        }

        C137313(C137111 r1, RenderScript renderScript, Long3 long3, loadProjectionNormalized loadprojectionnormalized) {
            this.IconCompatParcelizer = r1;
            this.write = renderScript;
            this.read = long3;
            this.MediaBrowserCompat$ItemReceiver = loadprojectionnormalized;
        }

        public final void run() {
            C137111 r0 = this.IconCompatParcelizer;
            RenderScript renderScript = this.write;
            Long3 long3 = this.read;
            loadProjectionNormalized loadprojectionnormalized = this.MediaBrowserCompat$ItemReceiver;
            try {
                nAllocationCopyToBitmap read2 = r0.MediaBrowserCompat$ItemReceiver.read(renderScript.write());
                if (read2 == null) {
                    String format = String.format("Transport backend '%s' is not registered", new Object[]{renderScript.write()});
                    C137111.MediaBrowserCompat$CustomActionResultReceiver.warning(format);
                    long3.onSchedule(new IllegalArgumentException(format));
                    return;
                }
                r0.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new C137717(r0, renderScript, read2.IconCompatParcelizer(loadprojectionnormalized)));
                long3.onSchedule((Exception) null);
            } catch (Exception e) {
                Logger logger = C137111.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Error scheduling event ");
                sb.append(e.getMessage());
                logger.warning(sb.toString());
                long3.onSchedule(e);
            }
        }
    }

    /* renamed from: o.isComplex$17 */
    static final class C137717 implements read, nAllocationRead2D.write {
        private final loadProjectionNormalized IconCompatParcelizer;
        private final C137111 MediaBrowserCompat$ItemReceiver;
        private final RenderScript write;

        public final float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }

        C137717() {
        }

        C137717(C137111 r1, RenderScript renderScript, loadProjectionNormalized loadprojectionnormalized) {
            this.MediaBrowserCompat$ItemReceiver = r1;
            this.write = renderScript;
            this.IconCompatParcelizer = loadprojectionnormalized;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            C137111 r0 = this.MediaBrowserCompat$ItemReceiver;
            RenderScript renderScript = this.write;
            r0.read.write(renderScript, this.IconCompatParcelizer);
            r0.write.IconCompatParcelizer(renderScript, 1);
            return null;
        }
    }

    /* renamed from: o.isComplex$20 */
    public static final class C137820 implements read, CreditCardCaptureModule {
        private final CreditCardCaptureModule_GetIParametersFactory IconCompatParcelizer;
        private AlarmManager MediaBrowserCompat$CustomActionResultReceiver;
        private final C7507tQ MediaBrowserCompat$ItemReceiver;
        private final Context read;
        private final nAllocationCreateFromBitmap write;

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }

        C137820() {
        }

        private C137820(Context context, C7507tQ tQVar, AlarmManager alarmManager, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, nAllocationCreateFromBitmap nallocationcreatefrombitmap) {
            this.read = context;
            this.MediaBrowserCompat$ItemReceiver = tQVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = alarmManager;
            this.IconCompatParcelizer = creditCardCaptureModule_GetIParametersFactory;
            this.write = nallocationcreatefrombitmap;
        }

        public C137820(Context context, C7507tQ tQVar, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, nAllocationCreateFromBitmap nallocationcreatefrombitmap) {
            this(context, tQVar, (AlarmManager) context.getSystemService("alarm"), creditCardCaptureModule_GetIParametersFactory, nallocationcreatefrombitmap);
        }

        public final void IconCompatParcelizer(RenderScript renderScript, int i) {
            Uri.Builder builder = new Uri.Builder();
            builder.appendQueryParameter("backendName", renderScript.write());
            builder.appendQueryParameter("priority", String.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read())));
            if (renderScript.MediaBrowserCompat$ItemReceiver() != null) {
                builder.appendQueryParameter("extras", Base64.encodeToString(renderScript.MediaBrowserCompat$ItemReceiver(), 0));
            }
            Intent intent = new Intent(this.read, nAllocationCreateTyped.class);
            intent.setData(builder.build());
            intent.putExtra("attemptNumber", i);
            if (PendingIntent.getBroadcast(this.read, 0, intent, PKIFailureInfo.duplicateCertReq) != null) {
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", (Object) renderScript);
                return;
            }
            long MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(renderScript);
            long write2 = this.write.write(renderScript.read(), MediaBrowserCompat$ItemReceiver2, i);
            AlertController$RecycleListView.IconCompatParcelizer("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", renderScript, Long.valueOf(write2), Long.valueOf(MediaBrowserCompat$ItemReceiver2), Integer.valueOf(i));
            this.MediaBrowserCompat$CustomActionResultReceiver.set(3, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() + write2, PendingIntent.getBroadcast(this.read, 0, intent, 0));
        }
    }

    /* renamed from: o.isComplex$16 */
    public static final class C137616 implements read, CreditCardCaptureModule {
        private final C7507tQ IconCompatParcelizer;
        private final nAllocationCreateFromBitmap MediaBrowserCompat$ItemReceiver;
        private final Context write;

        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((f2 * 3.5949094f) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((f3 * 3.5949094f) + 2.5949094f)) + 2.0f) * 0.5f;
        }

        C137616() {
        }

        public C137616(Context context, C7507tQ tQVar, nAllocationCreateFromBitmap nallocationcreatefrombitmap) {
            this.write = context;
            this.IconCompatParcelizer = tQVar;
            this.MediaBrowserCompat$ItemReceiver = nallocationcreatefrombitmap;
        }

        private static boolean write(JobScheduler jobScheduler, int i, int i2) {
            for (JobInfo next : jobScheduler.getAllPendingJobs()) {
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == i) {
                    if (i3 >= i2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public final void IconCompatParcelizer(RenderScript renderScript, int i) {
            ComponentName componentName = new ComponentName(this.write, JobInfoSchedulerService.class);
            JobScheduler jobScheduler = (JobScheduler) this.write.getSystemService("jobscheduler");
            Adler32 adler32 = new Adler32();
            adler32.update(this.write.getPackageName().getBytes(Charset.forName("UTF-8")));
            adler32.update(renderScript.write().getBytes(Charset.forName("UTF-8")));
            adler32.update(ByteBuffer.allocate(4).putInt(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read())).array());
            if (renderScript.MediaBrowserCompat$ItemReceiver() != null) {
                adler32.update(renderScript.MediaBrowserCompat$ItemReceiver());
            }
            int value = (int) adler32.getValue();
            if (write(jobScheduler, value, i)) {
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", (Object) renderScript);
                return;
            }
            long MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(renderScript);
            nAllocationCreateFromBitmap nallocationcreatefrombitmap = this.MediaBrowserCompat$ItemReceiver;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            Int4 read = renderScript.read();
            builder.setMinimumLatency(nallocationcreatefrombitmap.write(read, MediaBrowserCompat$ItemReceiver2, i));
            Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> read2 = nallocationcreatefrombitmap.read().get(read).read();
            if (read2.contains(nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (read2.contains(nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (read2.contains(nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", renderScript.write());
            persistableBundle.putInt("priority", ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read()));
            if (renderScript.MediaBrowserCompat$ItemReceiver() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(renderScript.MediaBrowserCompat$ItemReceiver(), 0));
            }
            builder.setExtras(persistableBundle);
            AlertController$RecycleListView.IconCompatParcelizer("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", renderScript, Integer.valueOf(value), Long.valueOf(this.MediaBrowserCompat$ItemReceiver.write(renderScript.read(), MediaBrowserCompat$ItemReceiver2, i)), Long.valueOf(MediaBrowserCompat$ItemReceiver2), Integer.valueOf(i));
            jobScheduler.schedule(builder.build());
        }
    }

    /* renamed from: o.isComplex$23 */
    public static final class C138023 implements read, Runnable {
        private final JobInfoSchedulerService read;
        private final JobParameters write;

        C138023() {
        }

        public final float getInterpolation(float f) {
            if (f < 0.5f) {
                return isComplex.MediaBrowserCompat$CustomActionResultReceiver.getInterpolation(f * 2.0f) * 0.5f;
            }
            return (isComplex.read.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }

        public C138023(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
            this.read = jobInfoSchedulerService;
            this.write = jobParameters;
        }

        public final void run() {
            this.read.jobFinished(this.write, false);
        }
    }
}
