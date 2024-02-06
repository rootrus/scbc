package p040o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.Iterables;
import p040o.ZHEMM;
import p040o.loadOrtho;
import p040o.loadProjectionNormalized;
import p040o.nAllocationGetStride;

/* renamed from: o.RttiJsonBill_MembersInjector */
public final class RttiJsonBill_MembersInjector implements nAllocationGetStride.write {
    private final List MediaBrowserCompat$CustomActionResultReceiver;
    private final RenderScript MediaBrowserCompat$ItemReceiver;
    private final nAllocationGetStride read;

    public RttiJsonBill_MembersInjector() {
    }

    /* renamed from: o.RttiJsonBill_MembersInjector$read */
    public static final class read implements nAllocationGetStride.IconCompatParcelizer {
        private static Byte IconCompatParcelizer = (byte) 0;
        public static final ConcurrentHashMap<Class<?>, Object> MediaBrowserCompat$CustomActionResultReceiver;
        private static BigInteger MediaBrowserCompat$ItemReceiver = new BigInteger("0");
        private static Character MediaBrowserCompat$MediaItem = 0;
        private static rsnAllocationGetByteBuffer MediaBrowserCompat$SearchResultReceiver = new rsnAllocationGetByteBuffer(0);

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static Short f3162x50fd9e4a = 0;
        private static Double MediaDescriptionCompat = Double.valueOf(0.0d);
        private static Integer MediaMetadataCompat = 0;
        private static Long MediaSessionCompat$QueueItem = 0L;
        private static String MediaSessionCompat$Token = new String();
        private static Float RatingCompat = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        private static BigDecimal read = new BigDecimal("0");
        private static Boolean write = Boolean.TRUE;
        private final SQLiteDatabase MediaSessionCompat$ResultReceiverWrapper;

        /* renamed from: o.RttiJsonBill_MembersInjector$read$IconCompatParcelizer */
        public enum IconCompatParcelizer {
            OPEN_ACCOUNT,
            APPLY_FOR_LOAN,
            DEMO
        }

        /* renamed from: o.RttiJsonBill_MembersInjector$read$read  reason: collision with other inner class name */
        public enum C10785read {
            COMPLETED,
            REJECTED,
            CANCELLED
        }

        static {
            ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
            MediaBrowserCompat$CustomActionResultReceiver = concurrentHashMap;
            concurrentHashMap.put(Boolean.class, write);
            MediaBrowserCompat$CustomActionResultReceiver.put(String.class, MediaSessionCompat$Token);
            MediaBrowserCompat$CustomActionResultReceiver.put(Character.class, MediaBrowserCompat$MediaItem);
            MediaBrowserCompat$CustomActionResultReceiver.put(Byte.class, IconCompatParcelizer);
            MediaBrowserCompat$CustomActionResultReceiver.put(Short.class, f3162x50fd9e4a);
            MediaBrowserCompat$CustomActionResultReceiver.put(Integer.class, MediaMetadataCompat);
            MediaBrowserCompat$CustomActionResultReceiver.put(Float.class, RatingCompat);
            MediaBrowserCompat$CustomActionResultReceiver.put(Long.class, MediaSessionCompat$QueueItem);
            MediaBrowserCompat$CustomActionResultReceiver.put(Double.class, MediaDescriptionCompat);
            MediaBrowserCompat$CustomActionResultReceiver.put(BigInteger.class, MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$CustomActionResultReceiver.put(BigDecimal.class, read);
            MediaBrowserCompat$CustomActionResultReceiver.put(rsnAllocationGetByteBuffer.class, MediaBrowserCompat$SearchResultReceiver);
        }

        public read() {
        }

        public static <T> T MediaBrowserCompat$CustomActionResultReceiver(T t) {
            T t2;
            if (t == null || IconCompatParcelizer(t.getClass())) {
                return t;
            }
            if (t instanceof rsnAllocationGenerateMipmaps) {
                return ((rsnAllocationGenerateMipmaps) t).clone();
            }
            Class<?> cls = t.getClass();
            if (cls.isArray()) {
                t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
            } else if (t instanceof rsnAllocationCreateFromAssetStream) {
                t2 = ((rsnAllocationCreateFromAssetStream) t).clone();
            } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                MediaBrowserCompat$ItemReceiver(array, array);
                return Arrays.asList(array);
            } else {
                t2 = rsnAllocationRead.read(cls);
            }
            MediaBrowserCompat$ItemReceiver(t, t2);
            return t2;
        }

        public static void MediaBrowserCompat$ItemReceiver(Object obj, Object obj2) {
            rsnAllocationData3D rsnallocationdata3d;
            Object write2;
            Class<?> cls = obj.getClass();
            int i = 0;
            Preconditions.checkArgument(cls == obj2.getClass());
            if (cls.isArray()) {
                Preconditions.checkArgument(Array.getLength(obj) == Array.getLength(obj2));
                for (Object MediaBrowserCompat$CustomActionResultReceiver2 : rsnAllocationRead.read(obj)) {
                    Array.set(obj2, i, MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
                    i++;
                }
            } else if (Collection.class.isAssignableFrom(cls)) {
                Collection<Object> collection = (Collection) obj;
                if (ArrayList.class.isAssignableFrom(cls)) {
                    ((ArrayList) obj2).ensureCapacity(collection.size());
                }
                Collection collection2 = (Collection) obj2;
                for (Object MediaBrowserCompat$CustomActionResultReceiver3 : collection) {
                    collection2.add(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3));
                }
            } else {
                boolean isAssignableFrom = rsnAllocationGenerateMipmaps.class.isAssignableFrom(cls);
                if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                    if (isAssignableFrom) {
                        rsnallocationdata3d = ((rsnAllocationGenerateMipmaps) obj).classInfo;
                    } else {
                        rsnallocationdata3d = rsnAllocationData3D.MediaBrowserCompat$ItemReceiver(cls);
                    }
                    for (String read2 : rsnallocationdata3d.MediaBrowserCompat$CustomActionResultReceiver) {
                        rsnAllocationData2D read3 = rsnallocationdata3d.read(read2);
                        if (!Modifier.isFinal(read3.MediaBrowserCompat$ItemReceiver.getModifiers()) && ((!isAssignableFrom || !read3.IconCompatParcelizer) && (write2 = rsnAllocationData2D.write(read3.MediaBrowserCompat$ItemReceiver, obj)) != null)) {
                            read3.MediaBrowserCompat$ItemReceiver(obj2, MediaBrowserCompat$CustomActionResultReceiver(write2));
                        }
                    }
                } else if (rsnAllocationCreateFromAssetStream.class.isAssignableFrom(cls)) {
                    rsnAllocationCreateFromAssetStream rsnallocationcreatefromassetstream = (rsnAllocationCreateFromAssetStream) obj2;
                    rsnAllocationCreateFromAssetStream rsnallocationcreatefromassetstream2 = (rsnAllocationCreateFromAssetStream) obj;
                    int size = rsnallocationcreatefromassetstream2.size();
                    while (i < size) {
                        rsnallocationcreatefromassetstream.MediaBrowserCompat$ItemReceiver(i, MediaBrowserCompat$CustomActionResultReceiver(rsnallocationcreatefromassetstream2.IconCompatParcelizer(i)));
                        i++;
                    }
                } else {
                    Map map = (Map) obj2;
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        map.put(entry.getKey(), MediaBrowserCompat$CustomActionResultReceiver(entry.getValue()));
                    }
                }
            }
        }

        public static boolean IconCompatParcelizer(Type type) {
            if (!(type instanceof Class)) {
                return false;
            }
            Class<Boolean> cls = (Class) type;
            if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == rsnAllocationGetByteBuffer.class || cls == Boolean.class) {
                return true;
            }
            return false;
        }

        public read(SQLiteDatabase sQLiteDatabase) {
            this.MediaSessionCompat$ResultReceiverWrapper = sQLiteDatabase;
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            this.MediaSessionCompat$ResultReceiverWrapper.beginTransaction();
            return null;
        }
    }

    /* renamed from: o.RttiJsonBill_MembersInjector$write */
    public static final class write implements getIIdDeserializerKta {
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, FormatException {
            return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0064 A[LOOP:0: B:32:0x0062->B:33:0x0064, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(p040o.setFontAssetDelegate$MediaBrowserCompat$ItemReceiver r9, java.util.Map<p040o.rsnIncContextCreate, ?> r10) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
            /*
                r8 = this;
                o.rsnScriptCCreate r0 = new o.rsnScriptCCreate
                o.rsnScriptSetVarI r1 = r9.read
                if (r1 != 0) goto L_0x000e
                o.rsnElementCreate2 r1 = r9.MediaBrowserCompat$ItemReceiver
                o.rsnScriptSetVarI r1 = r1.read()
                r9.read = r1
            L_0x000e:
                o.rsnScriptSetVarI r9 = r9.read
                r0.<init>(r9)
                r9 = 0
                r1 = 0
                o.rsnScriptForEachClipped r2 = r0.write(r9)     // Catch:{ NotFoundException -> 0x0032, FormatException -> 0x002d }
                o.rsnScriptForEach[] r3 = r2.IconCompatParcelizer     // Catch:{ NotFoundException -> 0x0032, FormatException -> 0x002d }
                o.rsnScriptGroup2Create r4 = new o.rsnScriptGroup2Create     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0029 }
                r4.<init>()     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0029 }
                o.getMaskAnimations$read r2 = r4.MediaBrowserCompat$CustomActionResultReceiver((p040o.rsnScriptForEachClipped) r2)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0029 }
                r4 = r3
                r3 = r1
                r1 = r2
                r2 = r3
                goto L_0x0037
            L_0x0029:
                r2 = move-exception
                goto L_0x002f
            L_0x002b:
                r2 = move-exception
                goto L_0x0034
            L_0x002d:
                r2 = move-exception
                r3 = r1
            L_0x002f:
                r4 = r3
                r3 = r1
                goto L_0x0037
            L_0x0032:
                r2 = move-exception
                r3 = r1
            L_0x0034:
                r4 = r3
                r3 = r2
                r2 = r1
            L_0x0037:
                if (r1 != 0) goto L_0x0054
                r1 = 1
                o.rsnScriptForEachClipped r0 = r0.write(r1)     // Catch:{ NotFoundException -> 0x004c, FormatException -> 0x004a }
                o.rsnScriptForEach[] r4 = r0.IconCompatParcelizer     // Catch:{ NotFoundException -> 0x004c, FormatException -> 0x004a }
                o.rsnScriptGroup2Create r1 = new o.rsnScriptGroup2Create     // Catch:{ NotFoundException -> 0x004c, FormatException -> 0x004a }
                r1.<init>()     // Catch:{ NotFoundException -> 0x004c, FormatException -> 0x004a }
                o.getMaskAnimations$read r1 = r1.MediaBrowserCompat$CustomActionResultReceiver((p040o.rsnScriptForEachClipped) r0)     // Catch:{ NotFoundException -> 0x004c, FormatException -> 0x004a }
                goto L_0x0054
            L_0x004a:
                r9 = move-exception
                goto L_0x004d
            L_0x004c:
                r9 = move-exception
            L_0x004d:
                if (r3 != 0) goto L_0x0053
                if (r2 == 0) goto L_0x0052
                throw r2
            L_0x0052:
                throw r9
            L_0x0053:
                throw r3
            L_0x0054:
                r5 = r4
                if (r10 == 0) goto L_0x006c
                o.rsnIncContextCreate r0 = p040o.rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK
                java.lang.Object r10 = r10.get(r0)
                o.rsnScriptFieldIDCreate r10 = (p040o.rsnScriptFieldIDCreate) r10
                if (r10 == 0) goto L_0x006c
                int r0 = r5.length
            L_0x0062:
                if (r9 >= r0) goto L_0x006c
                r2 = r5[r9]
                r10.MediaBrowserCompat$CustomActionResultReceiver(r2)
                int r9 = r9 + 1
                goto L_0x0062
            L_0x006c:
                java.lang.String r3 = r1.RatingCompat
                byte[] r4 = r1.read
                int r9 = r1.MediaBrowserCompat$CustomActionResultReceiver
                o.rsnIncAllocationCreateTyped r6 = p040o.rsnIncAllocationCreateTyped.AZTEC
                o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r9 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver
                r7 = 0
                r2 = r9
                r2.<init>((java.lang.String) r3, (byte[]) r4, (p040o.rsnScriptForEach[]) r5, (p040o.rsnIncAllocationCreateTyped) r6, (byte) r7)
                java.util.List<byte[]> r10 = r1.IconCompatParcelizer
                if (r10 == 0) goto L_0x0084
                o.rsnInvokeClosureCreate r0 = p040o.rsnInvokeClosureCreate.BYTE_SEGMENTS
                r9.read(r0, r10)
            L_0x0084:
                java.lang.String r10 = r1.MediaBrowserCompat$ItemReceiver
                if (r10 == 0) goto L_0x008d
                o.rsnInvokeClosureCreate r0 = p040o.rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL
                r9.read(r0, r10)
            L_0x008d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RttiJsonBill_MembersInjector.write.IconCompatParcelizer(o.setFontAssetDelegate$MediaBrowserCompat$ItemReceiver, java.util.Map):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
        }
    }

    /* renamed from: o.RttiJsonBill_MembersInjector$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private static final List<String> IconCompatParcelizer = Arrays.asList(new String[]{"3006", "3007"});
        private static final List<String> MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(new String[]{"1899", "1999"});
        private static final List<String> MediaBrowserCompat$ItemReceiver = Collections.singletonList("3003");
        private static final List<String> read = Collections.singletonList("3005");
        private static final List<String> write = Arrays.asList(new String[]{"1035", "1037", "1038"});

        static {
            Collections.singletonList("3004");
        }

        public static List<String> read() {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public static List<String> IconCompatParcelizer() {
            return IconCompatParcelizer;
        }

        public static List<String> MediaBrowserCompat$ItemReceiver() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public static List<String> write() {
            return read;
        }

        public static List<String> MediaBrowserCompat$CustomActionResultReceiver() {
            return write;
        }
    }

    public static String read(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public RttiJsonBill_MembersInjector(nAllocationGetStride nallocationgetstride, List list, RenderScript renderScript) {
        this.read = nallocationgetstride;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = renderScript;
    }

    public final Object read(Object obj) {
        Float4 float4;
        Float4 float42;
        nAllocationGetStride nallocationgetstride = this.read;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        RenderScript renderScript = this.MediaBrowserCompat$ItemReceiver;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            loadOrtho.write write2 = new loadOrtho.write();
            write2.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
            loadProjectionNormalized.IconCompatParcelizer write3 = write2.write(cursor.getString(1)).MediaBrowserCompat$CustomActionResultReceiver(cursor.getLong(2)).write(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    float42 = nAllocationGetStride.write;
                } else {
                    float42 = new Float4(string);
                }
                write3.MediaBrowserCompat$CustomActionResultReceiver(new RSIllegalArgumentException(float42, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    float4 = nAllocationGetStride.write;
                } else {
                    float4 = new Float4(string2);
                }
                write3.MediaBrowserCompat$CustomActionResultReceiver(new RSIllegalArgumentException(float4, (byte[]) nAllocationGetStride.MediaBrowserCompat$ItemReceiver(((SQLiteDatabase) nallocationgetstride.MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(nallocationgetstride.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), CTRSM.MediaBrowserCompat$ItemReceiver)));
            }
            if (!cursor.isNull(6)) {
                write3.write(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(new nAllocationIoReceive(j, renderScript, write3.IconCompatParcelizer()));
        }
        return null;
    }
}
