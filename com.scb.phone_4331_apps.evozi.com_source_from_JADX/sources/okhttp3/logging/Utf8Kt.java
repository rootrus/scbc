package okhttp3.logging;

public final class Utf8Kt {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[Catch:{ EOFException -> 0x00f6 }, LOOP:0: B:7:0x001e->B:55:0x00e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isProbablyUtf8(p040o.SCBUniversalWebViewActivity r14) {
        /*
            java.lang.String r0 = "$this$isProbablyUtf8"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            r0 = 0
            o.SCBUniversalWebViewActivity r7 = new o.SCBUniversalWebViewActivity     // Catch:{ EOFException -> 0x00f6 }
            r7.<init>()     // Catch:{ EOFException -> 0x00f6 }
            long r1 = r14.read     // Catch:{ EOFException -> 0x00f6 }
            r3 = 64
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0015
            r5 = r3
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            r3 = 0
            r1 = r14
            r2 = r7
            r1.MediaBrowserCompat$ItemReceiver(r2, r3, r5)     // Catch:{ EOFException -> 0x00f6 }
            r14 = r0
        L_0x001e:
            r1 = 16
            r2 = 1
            if (r14 >= r1) goto L_0x00f5
            long r3 = r7.read     // Catch:{ EOFException -> 0x00f6 }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002d
            r1 = r2
            goto L_0x002e
        L_0x002d:
            r1 = r0
        L_0x002e:
            if (r1 == 0) goto L_0x0032
            goto L_0x00f5
        L_0x0032:
            long r3 = r7.read     // Catch:{ EOFException -> 0x00f6 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00ed
            byte r1 = r7.read((long) r5)     // Catch:{ EOFException -> 0x00f6 }
            r3 = r1 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != 0) goto L_0x004a
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r8 = r0
            r6 = r2
            goto L_0x006c
        L_0x004a:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r3 != r6) goto L_0x0055
            r3 = r1 & 31
            r6 = 2
            r8 = r4
            goto L_0x006c
        L_0x0055:
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x0061
            r3 = r1 & 15
            r6 = 3
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x0061:
            r3 = r1 & 248(0xf8, float:3.48E-43)
            r6 = 240(0xf0, float:3.36E-43)
            if (r3 != r6) goto L_0x00d7
            r3 = r1 & 7
            r6 = 4
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x006c:
            long r9 = r7.read     // Catch:{ EOFException -> 0x00f6 }
            long r11 = (long) r6     // Catch:{ EOFException -> 0x00f6 }
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00a3
        L_0x0073:
            if (r2 >= r6) goto L_0x008a
            long r9 = (long) r2     // Catch:{ EOFException -> 0x00f6 }
            byte r1 = r7.read((long) r9)     // Catch:{ EOFException -> 0x00f6 }
            r13 = r1 & 192(0xc0, float:2.69E-43)
            if (r13 != r4) goto L_0x0086
            int r3 = r3 << 6
            r1 = r1 & 63
            r3 = r3 | r1
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0086:
            r7.MediaBrowserCompat$MediaItem((long) r9)     // Catch:{ EOFException -> 0x00f6 }
            goto L_0x00dc
        L_0x008a:
            r7.MediaBrowserCompat$MediaItem((long) r11)     // Catch:{ EOFException -> 0x00f6 }
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r1) goto L_0x0093
            goto L_0x00dc
        L_0x0093:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r3) goto L_0x009e
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r1 < r3) goto L_0x009e
            goto L_0x00dc
        L_0x009e:
            if (r3 >= r8) goto L_0x00a1
            goto L_0x00dc
        L_0x00a1:
            r5 = r3
            goto L_0x00dc
        L_0x00a3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00f6 }
            r14.<init>()     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r2 = "size < "
            r14.append(r2)     // Catch:{ EOFException -> 0x00f6 }
            r14.append(r6)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r2 = ": "
            r14.append(r2)     // Catch:{ EOFException -> 0x00f6 }
            long r2 = r7.read     // Catch:{ EOFException -> 0x00f6 }
            r14.append(r2)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r2 = " (to read code point prefixed 0x"
            r14.append(r2)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ EOFException -> 0x00f6 }
            r14.append(r1)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r1 = ")"
            r14.append(r1)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.String r14 = r14.toString()     // Catch:{ EOFException -> 0x00f6 }
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ EOFException -> 0x00f6 }
            r1.<init>(r14)     // Catch:{ EOFException -> 0x00f6 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ EOFException -> 0x00f6 }
            throw r1     // Catch:{ EOFException -> 0x00f6 }
        L_0x00d7:
            r1 = 1
            r7.MediaBrowserCompat$MediaItem((long) r1)     // Catch:{ EOFException -> 0x00f6 }
        L_0x00dc:
            boolean r1 = java.lang.Character.isISOControl(r5)     // Catch:{ EOFException -> 0x00f6 }
            if (r1 == 0) goto L_0x00e9
            boolean r1 = java.lang.Character.isWhitespace(r5)     // Catch:{ EOFException -> 0x00f6 }
            if (r1 != 0) goto L_0x00e9
            return r0
        L_0x00e9:
            int r14 = r14 + 1
            goto L_0x001e
        L_0x00ed:
            java.io.EOFException r14 = new java.io.EOFException     // Catch:{ EOFException -> 0x00f6 }
            r14.<init>()     // Catch:{ EOFException -> 0x00f6 }
            java.lang.Throwable r14 = (java.lang.Throwable) r14     // Catch:{ EOFException -> 0x00f6 }
            throw r14     // Catch:{ EOFException -> 0x00f6 }
        L_0x00f5:
            return r2
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.Utf8Kt.isProbablyUtf8(o.SCBUniversalWebViewActivity):boolean");
    }
}
