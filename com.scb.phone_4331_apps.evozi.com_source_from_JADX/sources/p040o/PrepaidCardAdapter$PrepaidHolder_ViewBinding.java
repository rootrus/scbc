package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder_ViewBinding */
public final class PrepaidCardAdapter$PrepaidHolder_ViewBinding {
    private static Object IconCompatParcelizer = "S";
    private static Object MediaBrowserCompat$CustomActionResultReceiver = "H";
    private static Object MediaBrowserCompat$ItemReceiver = "m";
    private static Object MediaDescriptionCompat = "y";
    private static Object MediaMetadataCompat = "s";
    private static Object read = KtaJsonExactionHelper.OBJECT;
    private static Object write = "M";

    private static String IconCompatParcelizer(read[] readArr, long j, long j2, long j3, long j4, long j5, boolean z) {
        int i;
        int i2;
        read[] readArr2 = readArr;
        long j6 = j5;
        StringBuilder sb = new StringBuilder();
        int length = readArr2.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            read read2 = readArr2[i3];
            Object obj = read2.write;
            int i4 = read2.MediaBrowserCompat$CustomActionResultReceiver;
            if (obj instanceof StringBuilder) {
                sb.append(obj.toString());
                long j7 = j;
                long j8 = j2;
                i = length;
                i2 = i3;
            } else {
                if (obj.equals(MediaDescriptionCompat)) {
                    sb.append(read(0, true, i4));
                } else if (obj.equals(write)) {
                    sb.append(read(0, true, i4));
                } else if (obj.equals(read)) {
                    sb.append(read(j, true, i4));
                    long j9 = j2;
                    i2 = i3;
                    long j10 = j3;
                    i = length;
                    z2 = false;
                } else {
                    long j11 = j;
                    if (obj.equals(MediaBrowserCompat$CustomActionResultReceiver)) {
                        sb.append(read(j2, true, i4));
                        i2 = i3;
                        long j102 = j3;
                        i = length;
                        z2 = false;
                    } else {
                        long j12 = j2;
                        if (obj.equals(MediaBrowserCompat$ItemReceiver)) {
                            i2 = i3;
                            sb.append(read(j3, true, i4));
                            i = length;
                            z2 = false;
                        } else {
                            i2 = i3;
                            long j13 = j3;
                            if (obj.equals(MediaMetadataCompat)) {
                                i = length;
                                sb.append(read(j4, true, i4));
                                z2 = true;
                            } else {
                                i = length;
                                long j14 = j4;
                                if (obj.equals(IconCompatParcelizer)) {
                                    if (z2) {
                                        sb.append(read(j6, true, Math.max(3, i4)));
                                    } else {
                                        sb.append(read(j6, true, i4));
                                    }
                                    z2 = false;
                                }
                            }
                            i3 = i2 + 1;
                            length = i;
                        }
                    }
                }
                long j15 = j;
                long j92 = j2;
                i2 = i3;
                long j1022 = j3;
                i = length;
                z2 = false;
            }
            long j16 = j4;
            i3 = i2 + 1;
            length = i;
        }
        return sb.toString();
    }

    private static String read(long j, boolean z, int i) {
        String l = Long.toString(j);
        return z ? ModifyQuickTopUpReviewActivity.read(l, i, '0') : l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.PrepaidCardAdapter$PrepaidHolder_ViewBinding.read[] MediaBrowserCompat$ItemReceiver(java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.length()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
            r6 = r5
        L_0x000f:
            int r7 = r10.length()
            if (r3 >= r7) goto L_0x009f
            char r7 = r10.charAt(r3)
            r8 = 39
            if (r4 == 0) goto L_0x0024
            if (r7 == r8) goto L_0x0024
            r5.append(r7)
            goto L_0x009b
        L_0x0024:
            r9 = 1
            if (r7 == r8) goto L_0x006b
            r8 = 72
            if (r7 == r8) goto L_0x0068
            r8 = 77
            if (r7 == r8) goto L_0x0065
            r8 = 83
            if (r7 == r8) goto L_0x0062
            r8 = 100
            if (r7 == r8) goto L_0x005f
            r8 = 109(0x6d, float:1.53E-43)
            if (r7 == r8) goto L_0x005c
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x0059
            r8 = 121(0x79, float:1.7E-43)
            if (r7 == r8) goto L_0x0056
            if (r5 != 0) goto L_0x0052
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read r8 = new o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read
            r8.<init>(r5)
            r0.add(r8)
        L_0x0052:
            r5.append(r7)
            goto L_0x007e
        L_0x0056:
            java.lang.Object r7 = MediaDescriptionCompat
            goto L_0x007f
        L_0x0059:
            java.lang.Object r7 = MediaMetadataCompat
            goto L_0x007f
        L_0x005c:
            java.lang.Object r7 = MediaBrowserCompat$ItemReceiver
            goto L_0x007f
        L_0x005f:
            java.lang.Object r7 = read
            goto L_0x007f
        L_0x0062:
            java.lang.Object r7 = IconCompatParcelizer
            goto L_0x007f
        L_0x0065:
            java.lang.Object r7 = write
            goto L_0x007f
        L_0x0068:
            java.lang.Object r7 = MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x007f
        L_0x006b:
            if (r4 == 0) goto L_0x0070
            r4 = r1
            r5 = r2
            goto L_0x007e
        L_0x0070:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read r4 = new o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read
            r4.<init>(r5)
            r0.add(r4)
            r4 = r9
        L_0x007e:
            r7 = r2
        L_0x007f:
            if (r7 == 0) goto L_0x009b
            if (r6 == 0) goto L_0x0091
            java.lang.Object r5 = r6.write
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0091
            int r5 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 + r9
            r6.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x009a
        L_0x0091:
            o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read r5 = new o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read
            r5.<init>(r7)
            r0.add(r5)
            r6 = r5
        L_0x009a:
            r5 = r2
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x009f:
            if (r4 != 0) goto L_0x00ae
            int r10 = r0.size()
            o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read[] r10 = new p040o.PrepaidCardAdapter$PrepaidHolder_ViewBinding.read[r10]
            java.lang.Object[] r10 = r0.toArray(r10)
            o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read[] r10 = (p040o.PrepaidCardAdapter$PrepaidHolder_ViewBinding.read[]) r10
            return r10
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unmatched quote in format: "
            r0.append(r1)
            r0.append(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCardAdapter$PrepaidHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(java.lang.String):o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read[]");
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder_ViewBinding$read */
    static class read {
        int MediaBrowserCompat$CustomActionResultReceiver = 1;
        final Object write;

        static boolean MediaBrowserCompat$CustomActionResultReceiver(read[] readArr, Object obj) {
            for (read read : readArr) {
                if (read.write == obj) {
                    return true;
                }
            }
            return false;
        }

        read(Object obj) {
            this.write = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            if (this.write.getClass() != read.write.getClass() || this.MediaBrowserCompat$CustomActionResultReceiver != read.MediaBrowserCompat$CustomActionResultReceiver) {
                return false;
            }
            Object obj2 = this.write;
            if (obj2 instanceof StringBuilder) {
                return obj2.toString().equals(read.write.toString());
            }
            if (obj2 instanceof Number) {
                return obj2.equals(read.write);
            }
            if (obj2 == read.write) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.write.hashCode();
        }

        public final String toString() {
            String obj = this.write.toString();
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (obj == null) {
                return null;
            }
            if (i <= 0) {
                return "";
            }
            int length = obj.length();
            if (i == 1 || length == 0) {
                return obj;
            }
            if (length == 1 && i <= 8192) {
                return ModifyQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(obj.charAt(0), i);
            }
            int i2 = length * i;
            if (length == 1) {
                return ModifyQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(obj.charAt(0), i);
            }
            if (length != 2) {
                StringBuilder sb = new StringBuilder(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    sb.append(obj);
                }
                return sb.toString();
            }
            char charAt = obj.charAt(0);
            char charAt2 = obj.charAt(1);
            char[] cArr = new char[i2];
            for (int i4 = (i << 1) - 2; i4 >= 0; i4 = (i4 - 1) - 1) {
                cArr[i4] = charAt;
                cArr[i4 + 1] = charAt2;
            }
            return new String(cArr);
        }
    }

    public static String write(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = 0;
        if (j < 0 || j > Long.MAX_VALUE) {
            throw new IllegalArgumentException("durationMillis must not be negative");
        }
        read[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver("HH:mm:ss.SSS");
        if (read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, read)) {
            j2 = j / 86400000;
            j3 = j - (86400000 * j2);
        } else {
            j3 = j;
            j2 = 0;
        }
        if (read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$CustomActionResultReceiver)) {
            j4 = j3 / 3600000;
            j3 -= 3600000 * j4;
        } else {
            j4 = 0;
        }
        if (read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver)) {
            long j7 = j3 / 60000;
            j3 -= 60000 * j7;
            j5 = j7;
        } else {
            j5 = 0;
        }
        if (read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, MediaMetadataCompat)) {
            long j8 = j3 / 1000;
            j3 -= 1000 * j8;
            j6 = j8;
        }
        return IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, j2, j4, j5, j6, j3, true);
    }
}
