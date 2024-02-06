package p040o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: o.rsnAllocationData1D */
public abstract class rsnAllocationData1D implements Closeable, Flushable {
    public abstract void flush() throws IOException;

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(boolean r9, java.lang.Object r10) throws java.io.IOException {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Class r0 = r10.getClass()
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x0019
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Object> r3 = p040o.RttiJsonBill_MembersInjector.read.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Class r4 = r10.getClass()
            java.lang.Object r3 = r3.get(r4)
            if (r10 != r3) goto L_0x0019
            r3 = r1
            goto L_0x001a
        L_0x0019:
            r3 = r2
        L_0x001a:
            if (r3 != 0) goto L_0x0132
            boolean r3 = r10 instanceof java.lang.String
            if (r3 != 0) goto L_0x0132
            boolean r3 = r10 instanceof java.lang.Number
            if (r3 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0132
            boolean r9 = r10 instanceof java.math.BigDecimal
            if (r9 != 0) goto L_0x0132
            boolean r9 = r10 instanceof java.math.BigInteger
            if (r9 != 0) goto L_0x0132
            boolean r9 = r10 instanceof java.lang.Long
            if (r9 != 0) goto L_0x0132
            boolean r9 = r10 instanceof java.lang.Float
            if (r9 == 0) goto L_0x004e
            java.lang.Number r10 = (java.lang.Number) r10
            float r9 = r10.floatValue()
            boolean r10 = java.lang.Float.isInfinite(r9)
            if (r10 != 0) goto L_0x0049
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            com.google.common.base.Preconditions.checkArgument(r1)
            return
        L_0x004e:
            boolean r9 = r10 instanceof java.lang.Integer
            if (r9 != 0) goto L_0x0071
            boolean r9 = r10 instanceof java.lang.Short
            if (r9 != 0) goto L_0x0071
            boolean r9 = r10 instanceof java.lang.Byte
            if (r9 != 0) goto L_0x0071
            java.lang.Number r10 = (java.lang.Number) r10
            double r9 = r10.doubleValue()
            boolean r0 = java.lang.Double.isInfinite(r9)
            if (r0 != 0) goto L_0x006d
            boolean r9 = java.lang.Double.isNaN(r9)
            if (r9 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            com.google.common.base.Preconditions.checkArgument(r1)
        L_0x0071:
            return
        L_0x0072:
            boolean r3 = r10 instanceof java.lang.Boolean
            if (r3 != 0) goto L_0x0132
            boolean r3 = r10 instanceof p040o.rsnAllocationGetByteBuffer
            if (r3 == 0) goto L_0x0080
            o.rsnAllocationGetByteBuffer r10 = (p040o.rsnAllocationGetByteBuffer) r10
            r10.read()
            return
        L_0x0080:
            boolean r3 = r10 instanceof java.lang.Iterable
            if (r3 != 0) goto L_0x008a
            boolean r3 = r0.isArray()
            if (r3 == 0) goto L_0x00a9
        L_0x008a:
            boolean r3 = r10 instanceof java.util.Map
            if (r3 != 0) goto L_0x00a9
            boolean r3 = r10 instanceof p040o.rsnAllocationGenerateMipmaps
            if (r3 != 0) goto L_0x00a9
            java.lang.Iterable r10 = p040o.rsnAllocationRead.read((java.lang.Object) r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x009a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r10.next()
            r8.IconCompatParcelizer(r9, r0)
            goto L_0x009a
        L_0x00a8:
            return
        L_0x00a9:
            boolean r3 = r0.isEnum()
            if (r3 == 0) goto L_0x00ba
            java.lang.Enum r10 = (java.lang.Enum) r10
            o.rsnAllocationData2D r9 = p040o.rsnAllocationData2D.write(r10)
            java.lang.String r9 = r9.read
            if (r9 == 0) goto L_0x0132
            return
        L_0x00ba:
            boolean r3 = r10 instanceof java.util.Map
            if (r3 == 0) goto L_0x00c4
            boolean r4 = r10 instanceof p040o.rsnAllocationGenerateMipmaps
            if (r4 != 0) goto L_0x00c4
            r4 = r1
            goto L_0x00c5
        L_0x00c4:
            r4 = r2
        L_0x00c5:
            r5 = 0
            if (r4 == 0) goto L_0x00ca
            r0 = r5
            goto L_0x00ce
        L_0x00ca:
            o.rsnAllocationData3D r0 = p040o.rsnAllocationData3D.MediaBrowserCompat$ItemReceiver(r0)
        L_0x00ce:
            if (r10 == 0) goto L_0x00ef
            if (r10 == 0) goto L_0x00e0
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Object> r6 = p040o.RttiJsonBill_MembersInjector.read.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Class r7 = r10.getClass()
            java.lang.Object r6 = r6.get(r7)
            if (r10 != r6) goto L_0x00e0
            r6 = r1
            goto L_0x00e1
        L_0x00e0:
            r6 = r2
        L_0x00e1:
            if (r6 != 0) goto L_0x00ef
            if (r3 == 0) goto L_0x00e8
            java.util.Map r10 = (java.util.Map) r10
            goto L_0x00f3
        L_0x00e8:
            o.rsnAllocationElementData1D r3 = new o.rsnAllocationElementData1D
            r3.<init>(r10, r2)
            r10 = r3
            goto L_0x00f3
        L_0x00ef:
            java.util.Map r10 = java.util.Collections.emptyMap()
        L_0x00f3:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00fb:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getValue()
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            if (r4 == 0) goto L_0x0117
            r3 = r9
            goto L_0x012e
        L_0x0117:
            o.rsnAllocationData2D r3 = r0.read(r3)
            if (r3 != 0) goto L_0x011f
            r3 = r5
            goto L_0x0121
        L_0x011f:
            java.lang.reflect.Field r3 = r3.MediaBrowserCompat$ItemReceiver
        L_0x0121:
            if (r3 == 0) goto L_0x012d
            java.lang.Class<o.rsnAllocationCreateFromBitmap> r7 = p040o.rsnAllocationCreateFromBitmap.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r7)
            if (r3 == 0) goto L_0x012d
            r3 = r1
            goto L_0x012e
        L_0x012d:
            r3 = r2
        L_0x012e:
            r8.IconCompatParcelizer(r3, r6)
            goto L_0x00fb
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnAllocationData1D.IconCompatParcelizer(boolean, java.lang.Object):void");
    }
}
