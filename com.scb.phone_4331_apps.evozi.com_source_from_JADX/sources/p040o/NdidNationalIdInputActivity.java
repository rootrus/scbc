package p040o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.NdidNationalIdInputActivity */
public final class NdidNationalIdInputActivity<E> {
    private static final AtomicLongFieldUpdater IconCompatParcelizer;
    public static final EkycOtpActivity MediaBrowserCompat$CustomActionResultReceiver = new EkycOtpActivity("REMOVE_FROZEN");
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$ItemReceiver;
    private static IconCompatParcelizer read = new IconCompatParcelizer((byte) 0);
    private final boolean MediaBrowserCompat$MediaItem;
    private final int MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private volatile Object _next = null;
    public volatile long _state = 0;
    private AtomicReferenceArray write = new AtomicReferenceArray(this.MediaMetadataCompat);

    public NdidNationalIdInputActivity(int i, boolean z) {
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompat$MediaItem = z;
        boolean z2 = true;
        this.MediaDescriptionCompat = i - 1;
        if (this.MediaDescriptionCompat <= 1073741823) {
            if (!((this.MediaMetadataCompat & this.MediaDescriptionCompat) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final NdidNationalIdInputActivity<E> MediaBrowserCompat$ItemReceiver(int i, E e) {
        Object obj = this.write.get(this.MediaDescriptionCompat & i);
        if (!(obj instanceof C6964xf6023c28) || ((C6964xf6023c28) obj).read != i) {
            return null;
        }
        this.write.set(i & this.MediaDescriptionCompat, e);
        return this;
    }

    /* renamed from: o.NdidNationalIdInputActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        Class<NdidNationalIdInputActivity> cls = NdidNationalIdInputActivity.class;
        MediaBrowserCompat$ItemReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        IconCompatParcelizer = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!IconCompatParcelizer.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072 A[LOOP:1: B:21:0x0072->B:24:0x0087, LOOP_START, PHI: r0 
      PHI: (r0v11 o.NdidNationalIdInputActivity) = (r0v10 o.NdidNationalIdInputActivity), (r0v13 o.NdidNationalIdInputActivity) binds: [B:20:0x0068, B:24:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int MediaBrowserCompat$CustomActionResultReceiver(E r14) {
        /*
            r13 = this;
            java.lang.String r0 = "element"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
        L_0x0005:
            long r3 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x001b
            r5 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r3 & r5
            int r14 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x001a
            r1 = 2
        L_0x001a:
            return r1
        L_0x001b:
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r13.MediaDescriptionCompat
            int r5 = r9 + 2
            r5 = r5 & r10
            r6 = r0 & r10
            if (r5 != r6) goto L_0x0034
            return r1
        L_0x0034:
            boolean r5 = r13.MediaBrowserCompat$MediaItem
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r13.write
            r11 = r9 & r10
            java.lang.Object r5 = r5.get(r11)
            if (r5 == 0) goto L_0x0053
            int r2 = r13.MediaMetadataCompat
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0052
            int r9 = r9 - r0
            r0 = r9 & r6
            int r2 = r2 >> 1
            if (r0 <= r2) goto L_0x0005
        L_0x0052:
            return r1
        L_0x0053:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = IconCompatParcelizer
            int r0 = r9 + 1
            r0 = r0 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r11 = (long) r0
            long r11 = r11 << r2
            long r5 = r5 | r11
            r2 = r13
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L_0x0005
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.write
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
            o.NdidNationalIdInputActivity r0 = (p040o.NdidNationalIdInputActivity) r0
        L_0x0072:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0089
            long r1 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.NdidNationalIdInputActivity r0 = r0.read(r1)
            o.NdidNationalIdInputActivity r0 = r0.MediaBrowserCompat$ItemReceiver((int) r9, r14)
            if (r0 != 0) goto L_0x0072
        L_0x0089:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NdidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object):int");
    }

    public final Object write() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return MediaBrowserCompat$CustomActionResultReceiver;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.MediaDescriptionCompat;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.write.get(i4);
            if (obj == null) {
                if (this.MediaBrowserCompat$MediaItem) {
                    return null;
                }
            } else if (obj instanceof C6964xf6023c28) {
                return null;
            } else {
                int i5 = (i + 1) & 1073741823;
                if (IconCompatParcelizer.compareAndSet(this, j, (-1073741824 & j) | ((long) i5))) {
                    this.write.set(this.MediaDescriptionCompat & i, (Object) null);
                    return obj;
                } else if (this.MediaBrowserCompat$MediaItem) {
                    NdidNationalIdInputActivity ndidNationalIdInputActivity = this;
                    do {
                        ndidNationalIdInputActivity = ndidNationalIdInputActivity.MediaBrowserCompat$ItemReceiver(i, i5);
                    } while (ndidNationalIdInputActivity != null);
                    return obj;
                }
            }
        }
    }

    private final NdidNationalIdInputActivity<E> MediaBrowserCompat$ItemReceiver(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            boolean z = false;
            i3 = (int) (1073741823 & j);
            if (MwChangeCasaSuccessActivity.write()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return read(MediaBrowserCompat$CustomActionResultReceiver());
            }
        } while (!IconCompatParcelizer.compareAndSet(this, j, (-1073741824 & j) | ((long) i2)));
        this.write.set(this.MediaDescriptionCompat & i3, (Object) null);
        return null;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!IconCompatParcelizer.compareAndSet(this, j, j2));
        return j2;
    }

    public final NdidNationalIdInputActivity<E> read(long j) {
        while (true) {
            NdidNationalIdInputActivity<E> ndidNationalIdInputActivity = (NdidNationalIdInputActivity) this._next;
            if (ndidNationalIdInputActivity != null) {
                return ndidNationalIdInputActivity;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaBrowserCompat$ItemReceiver;
            NdidNationalIdInputActivity ndidNationalIdInputActivity2 = new NdidNationalIdInputActivity(this.MediaMetadataCompat << 1, this.MediaBrowserCompat$MediaItem);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.MediaDescriptionCompat;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.write.get(i4);
                if (obj == null) {
                    obj = new C6964xf6023c28(i);
                }
                ndidNationalIdInputActivity2.write.set(ndidNationalIdInputActivity2.MediaDescriptionCompat & i, obj);
                i++;
            }
            ndidNationalIdInputActivity2._state = -1152921504606846977L & j;
            atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, ndidNationalIdInputActivity2);
        }
    }
}
