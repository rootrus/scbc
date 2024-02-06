package p040o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p040o.setSubtitleTextAppearance;

/* renamed from: o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver */
class C1546xeda7e7f8 {
    public final int MediaBrowserCompat$ItemReceiver;
    public final byte[] read;
    public final int write;

    C1546xeda7e7f8(int i, int i2, byte[] bArr) {
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.read = bArr;
    }

    public static C1546xeda7e7f8 IconCompatParcelizer(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[setSubtitleTextAppearance.IconCompatParcelizer[3]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            wrap.putShort((short) iArr[0]);
        }
        return new C1546xeda7e7f8(3, 1, wrap.array());
    }

    public static C1546xeda7e7f8 read(int i, ByteOrder byteOrder) {
        return IconCompatParcelizer(new int[]{i}, byteOrder);
    }

    public static C1546xeda7e7f8 read(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[setSubtitleTextAppearance.IconCompatParcelizer[4]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            wrap.putInt((int) jArr[0]);
        }
        return new C1546xeda7e7f8(4, 1, wrap.array());
    }

    public static C1546xeda7e7f8 IconCompatParcelizer(long j, ByteOrder byteOrder) {
        return read(new long[]{j}, byteOrder);
    }

    public static C1546xeda7e7f8 IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(0);
        byte[] bytes = sb.toString().getBytes(setSubtitleTextAppearance.read);
        return new C1546xeda7e7f8(2, bytes.length, bytes);
    }

    public static C1546xeda7e7f8 IconCompatParcelizer(setSubtitleTextAppearance.IconCompatParcelizer[] iconCompatParcelizerArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[setSubtitleTextAppearance.IconCompatParcelizer[5]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            setSubtitleTextAppearance.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[0];
            wrap.putInt((int) iconCompatParcelizer.write);
            wrap.putInt((int) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return new C1546xeda7e7f8(5, 1, wrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(setSubtitleTextAppearance.write[this.write]);
        sb.append(", data length:");
        sb.append(this.read.length);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01b5 A[SYNTHETIC, Splitter:B:163:0x01b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(java.nio.ByteOrder r13) {
        /*
            r12 = this;
            java.lang.String r0 = "IOException occurred while closing InputStream"
            java.lang.String r1 = "ExifInterface"
            r2 = 0
            o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver r3 = new o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            byte[] r4 = r12.read     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x01a1, all -> 0x019f }
            r3.MediaBrowserCompat$CustomActionResultReceiver = r13     // Catch:{ IOException -> 0x019d }
            int r13 = r12.write     // Catch:{ IOException -> 0x019d }
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 1
            r7 = 0
            switch(r13) {
                case 1: goto L_0x0155;
                case 2: goto L_0x0107;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00aa;
                case 6: goto L_0x0155;
                case 7: goto L_0x0107;
                case 8: goto L_0x0090;
                case 9: goto L_0x0076;
                case 10: goto L_0x0051;
                case 11: goto L_0x0036;
                case 12: goto L_0x001c;
                default: goto L_0x001a;
            }     // Catch:{ IOException -> 0x019d }
        L_0x001a:
            goto L_0x0191
        L_0x001c:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            double[] r13 = new double[r13]     // Catch:{ IOException -> 0x019d }
        L_0x0020:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x002d
            double r4 = r3.readDouble()     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x0020
        L_0x002d:
            r3.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0035:
            return r13
        L_0x0036:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            double[] r13 = new double[r13]     // Catch:{ IOException -> 0x019d }
        L_0x003a:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x0048
            float r4 = r3.readFloat()     // Catch:{ IOException -> 0x019d }
            double r4 = (double) r4     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x003a
        L_0x0048:
            r3.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0050:
            return r13
        L_0x0051:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            o.setSubtitleTextAppearance$IconCompatParcelizer[] r13 = new p040o.setSubtitleTextAppearance.IconCompatParcelizer[r13]     // Catch:{ IOException -> 0x019d }
        L_0x0055:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x006d
            int r4 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            long r4 = (long) r4     // Catch:{ IOException -> 0x019d }
            int r6 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            long r8 = (long) r6     // Catch:{ IOException -> 0x019d }
            o.setSubtitleTextAppearance$IconCompatParcelizer r6 = new o.setSubtitleTextAppearance$IconCompatParcelizer     // Catch:{ IOException -> 0x019d }
            r6.<init>(r4, r8)     // Catch:{ IOException -> 0x019d }
            r13[r7] = r6     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x0055
        L_0x006d:
            r3.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0075
        L_0x0071:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0075:
            return r13
        L_0x0076:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            int[] r13 = new int[r13]     // Catch:{ IOException -> 0x019d }
        L_0x007a:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x0087
            int r4 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x007a
        L_0x0087:
            r3.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x008f:
            return r13
        L_0x0090:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            int[] r13 = new int[r13]     // Catch:{ IOException -> 0x019d }
        L_0x0094:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x00a1
            short r4 = r3.readShort()     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x0094
        L_0x00a1:
            r3.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00a9:
            return r13
        L_0x00aa:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            o.setSubtitleTextAppearance$IconCompatParcelizer[] r13 = new p040o.setSubtitleTextAppearance.IconCompatParcelizer[r13]     // Catch:{ IOException -> 0x019d }
        L_0x00ae:
            int r6 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r6) goto L_0x00c8
            int r6 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            long r8 = (long) r6     // Catch:{ IOException -> 0x019d }
            long r8 = r8 & r4
            int r6 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            long r10 = (long) r6     // Catch:{ IOException -> 0x019d }
            long r10 = r10 & r4
            o.setSubtitleTextAppearance$IconCompatParcelizer r6 = new o.setSubtitleTextAppearance$IconCompatParcelizer     // Catch:{ IOException -> 0x019d }
            r6.<init>(r8, r10)     // Catch:{ IOException -> 0x019d }
            r13[r7] = r6     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x00ae
        L_0x00c8:
            r3.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00d0
        L_0x00cc:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00d0:
            return r13
        L_0x00d1:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            long[] r13 = new long[r13]     // Catch:{ IOException -> 0x019d }
        L_0x00d5:
            int r6 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r6) goto L_0x00e4
            int r6 = r3.readInt()     // Catch:{ IOException -> 0x019d }
            long r8 = (long) r6     // Catch:{ IOException -> 0x019d }
            long r8 = r8 & r4
            r13[r7] = r8     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00e4:
            r3.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x00ec:
            return r13
        L_0x00ed:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            int[] r13 = new int[r13]     // Catch:{ IOException -> 0x019d }
        L_0x00f1:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x00fe
            int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            int r7 = r7 + 1
            goto L_0x00f1
        L_0x00fe:
            r3.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0106:
            return r13
        L_0x0107:
            int r13 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            byte[] r4 = p040o.setSubtitleTextAppearance.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x019d }
            int r4 = r4.length     // Catch:{ IOException -> 0x019d }
            if (r13 < r4) goto L_0x0128
            r13 = r7
        L_0x010f:
            byte[] r4 = p040o.setSubtitleTextAppearance.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x019d }
            int r4 = r4.length     // Catch:{ IOException -> 0x019d }
            if (r13 >= r4) goto L_0x0123
            byte[] r4 = r12.read     // Catch:{ IOException -> 0x019d }
            byte r4 = r4[r13]     // Catch:{ IOException -> 0x019d }
            byte[] r5 = p040o.setSubtitleTextAppearance.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x019d }
            byte r5 = r5[r13]     // Catch:{ IOException -> 0x019d }
            if (r4 == r5) goto L_0x0120
            r6 = r7
            goto L_0x0123
        L_0x0120:
            int r13 = r13 + 1
            goto L_0x010f
        L_0x0123:
            if (r6 == 0) goto L_0x0128
            byte[] r13 = p040o.setSubtitleTextAppearance.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x019d }
            int r7 = r13.length     // Catch:{ IOException -> 0x019d }
        L_0x0128:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019d }
            r13.<init>()     // Catch:{ IOException -> 0x019d }
        L_0x012d:
            int r4 = r12.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x019d }
            if (r7 >= r4) goto L_0x0148
            byte[] r4 = r12.read     // Catch:{ IOException -> 0x019d }
            byte r4 = r4[r7]     // Catch:{ IOException -> 0x019d }
            if (r4 == 0) goto L_0x0148
            r5 = 32
            if (r4 < r5) goto L_0x0140
            char r4 = (char) r4     // Catch:{ IOException -> 0x019d }
            r13.append(r4)     // Catch:{ IOException -> 0x019d }
            goto L_0x0145
        L_0x0140:
            r4 = 63
            r13.append(r4)     // Catch:{ IOException -> 0x019d }
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x012d
        L_0x0148:
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x019d }
            r3.close()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0154:
            return r13
        L_0x0155:
            byte[] r13 = r12.read     // Catch:{ IOException -> 0x019d }
            int r13 = r13.length     // Catch:{ IOException -> 0x019d }
            if (r13 != r6) goto L_0x017f
            byte[] r13 = r12.read     // Catch:{ IOException -> 0x019d }
            byte r13 = r13[r7]     // Catch:{ IOException -> 0x019d }
            if (r13 < 0) goto L_0x017f
            byte[] r13 = r12.read     // Catch:{ IOException -> 0x019d }
            byte r13 = r13[r7]     // Catch:{ IOException -> 0x019d }
            if (r13 > r6) goto L_0x017f
            char[] r13 = new char[r6]     // Catch:{ IOException -> 0x019d }
            byte[] r4 = r12.read     // Catch:{ IOException -> 0x019d }
            byte r4 = r4[r7]     // Catch:{ IOException -> 0x019d }
            int r4 = r4 + 48
            char r4 = (char) r4     // Catch:{ IOException -> 0x019d }
            r13[r7] = r4     // Catch:{ IOException -> 0x019d }
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x019d }
            r4.<init>(r13)     // Catch:{ IOException -> 0x019d }
            r3.close()     // Catch:{ IOException -> 0x017a }
            goto L_0x017e
        L_0x017a:
            r13 = move-exception
            android.util.Log.e(r1, r0, r13)
        L_0x017e:
            return r4
        L_0x017f:
            java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x019d }
            byte[] r4 = r12.read     // Catch:{ IOException -> 0x019d }
            java.nio.charset.Charset r5 = p040o.setSubtitleTextAppearance.read     // Catch:{ IOException -> 0x019d }
            r13.<init>(r4, r5)     // Catch:{ IOException -> 0x019d }
            r3.close()     // Catch:{ IOException -> 0x018c }
            goto L_0x0190
        L_0x018c:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x0190:
            return r13
        L_0x0191:
            r3.close()     // Catch:{ IOException -> 0x0195 }
            goto L_0x0199
        L_0x0195:
            r13 = move-exception
            android.util.Log.e(r1, r0, r13)
        L_0x0199:
            return r2
        L_0x019a:
            r13 = move-exception
            r2 = r3
            goto L_0x01b3
        L_0x019d:
            r13 = move-exception
            goto L_0x01a3
        L_0x019f:
            r13 = move-exception
            goto L_0x01b3
        L_0x01a1:
            r13 = move-exception
            r3 = r2
        L_0x01a3:
            java.lang.String r4 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r4, r13)     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x01b2
            r3.close()     // Catch:{ IOException -> 0x01ae }
            goto L_0x01b2
        L_0x01ae:
            r13 = move-exception
            android.util.Log.e(r1, r0, r13)
        L_0x01b2:
            return r2
        L_0x01b3:
            if (r2 == 0) goto L_0x01bd
            r2.close()     // Catch:{ IOException -> 0x01b9 }
            goto L_0x01bd
        L_0x01b9:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x01bd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C1546xeda7e7f8.MediaBrowserCompat$CustomActionResultReceiver(java.nio.ByteOrder):java.lang.Object");
    }

    public final int write(ByteOrder byteOrder) {
        Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(byteOrder);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof String) {
            return Integer.parseInt((String) MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            if (MediaBrowserCompat$CustomActionResultReceiver instanceof long[]) {
                long[] jArr = (long[]) MediaBrowserCompat$CustomActionResultReceiver;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof int[]) {
                int[] iArr = (int[]) MediaBrowserCompat$CustomActionResultReceiver;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String read(ByteOrder byteOrder) {
        Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(byteOrder);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver instanceof String) {
            return (String) MediaBrowserCompat$CustomActionResultReceiver;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (MediaBrowserCompat$CustomActionResultReceiver instanceof long[]) {
            long[] jArr = (long[]) MediaBrowserCompat$CustomActionResultReceiver;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof int[]) {
            int[] iArr = (int[]) MediaBrowserCompat$CustomActionResultReceiver;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof double[]) {
            double[] dArr = (double[]) MediaBrowserCompat$CustomActionResultReceiver;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(MediaBrowserCompat$CustomActionResultReceiver instanceof setSubtitleTextAppearance.IconCompatParcelizer[])) {
            return null;
        } else {
            setSubtitleTextAppearance.IconCompatParcelizer[] iconCompatParcelizerArr = (setSubtitleTextAppearance.IconCompatParcelizer[]) MediaBrowserCompat$CustomActionResultReceiver;
            while (i < iconCompatParcelizerArr.length) {
                sb.append(iconCompatParcelizerArr[i].write);
                sb.append('/');
                sb.append(iconCompatParcelizerArr[i].MediaBrowserCompat$CustomActionResultReceiver);
                i++;
                if (i != iconCompatParcelizerArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }
}
