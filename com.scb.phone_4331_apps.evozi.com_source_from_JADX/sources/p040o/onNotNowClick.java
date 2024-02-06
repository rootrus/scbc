package p040o;

import java.io.Serializable;

/* renamed from: o.onNotNowClick */
public final class onNotNowClick {

    /* renamed from: o.onNotNowClick$read */
    public static final class read<T> implements Serializable {
        public T MediaBrowserCompat$ItemReceiver;

        public final String toString() {
            return String.valueOf(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.onNotNowClick$write */
    public static final class write implements Serializable {
        public int MediaBrowserCompat$CustomActionResultReceiver;

        public final String toString() {
            return String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.onNotNowClick$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Serializable {
        public boolean IconCompatParcelizer;

        public final String toString() {
            return String.valueOf(this.IconCompatParcelizer);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.MediaSessionCompat$ResultReceiverWrapper;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.getPrimaryText MediaBrowserCompat$ItemReceiver(p040o.SolidLayer r18) {
        /*
            r0 = r18
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000d
            java.lang.String r2 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r4 = r2
            goto L_0x000e
        L_0x000d:
            r4 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.MediaSessionCompat$QueueItem
            if (r2 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r5 = r2
            goto L_0x0018
        L_0x0017:
            r5 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = r0.MediaMetadataCompat
            if (r2 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r6 = r2
            goto L_0x0022
        L_0x0021:
            r6 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x002b
            java.lang.String r2 = r0.ParcelableVolumeInfo
            if (r2 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r7 = r2
            goto L_0x002c
        L_0x002b:
            r7 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = r0.read
            if (r2 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r8 = r2
            goto L_0x0036
        L_0x0035:
            r8 = r1
        L_0x0036:
            if (r0 == 0) goto L_0x003f
            java.lang.String r2 = r0.RatingCompat
            if (r2 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r9 = r2
            goto L_0x0040
        L_0x003f:
            r9 = r1
        L_0x0040:
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r0.MediaBrowserCompat$MediaItem
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r10 = r2
            goto L_0x004a
        L_0x0049:
            r10 = r1
        L_0x004a:
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = r0.MediaDescriptionCompat
            if (r2 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r11 = r2
            goto L_0x0054
        L_0x0053:
            r11 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x005d
            java.lang.String r2 = r0.IconCompatParcelizer
            if (r2 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r12 = r2
            goto L_0x005e
        L_0x005d:
            r12 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r0.write
            if (r2 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r13 = r2
            goto L_0x0068
        L_0x0067:
            r13 = r1
        L_0x0068:
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r2 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r14 = r2
            goto L_0x0072
        L_0x0071:
            r14 = r1
        L_0x0072:
            if (r0 == 0) goto L_0x007b
            java.lang.String r2 = r0.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r15 = r2
            goto L_0x007c
        L_0x007b:
            r15 = r1
        L_0x007c:
            if (r0 == 0) goto L_0x0086
            java.lang.String r2 = r0.f2787x50fd9e4a
            if (r2 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r16 = r2
            goto L_0x0088
        L_0x0086:
            r16 = r1
        L_0x0088:
            if (r0 == 0) goto L_0x008e
            java.util.List<java.lang.String> r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x0092
        L_0x008e:
            o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r0 = (java.util.List) r0
        L_0x0092:
            r17 = r0
            o.getPrimaryText r0 = new o.getPrimaryText
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onNotNowClick.MediaBrowserCompat$ItemReceiver(o.SolidLayer):o.getPrimaryText");
    }
}
