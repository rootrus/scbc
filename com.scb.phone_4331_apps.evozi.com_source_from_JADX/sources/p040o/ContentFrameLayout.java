package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: o.ContentFrameLayout */
public final class ContentFrameLayout {
    public static Drawable read(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int write(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: o.ContentFrameLayout$read */
    public static abstract class read {
        public abstract void MediaBrowserCompat$CustomActionResultReceiver(int i);

        public abstract void MediaBrowserCompat$ItemReceiver(Typeface typeface);

        public final void IconCompatParcelizer(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    read.this.MediaBrowserCompat$ItemReceiver(typeface);
                }
            });
        }

        public final void write(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    read.this.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
            });
        }
    }

    public static Typeface MediaBrowserCompat$ItemReceiver(Context context, int i, TypedValue typedValue, int i2, read read2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return IconCompatParcelizer(context, i, typedValue, i2, read2, (Handler) null, true);
    }

    private static Typeface IconCompatParcelizer(Context context, int i, TypedValue typedValue, int i2, read read2, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, resources, typedValue, i, i2, read2, handler, z);
        if (MediaBrowserCompat$ItemReceiver != null || read2 != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface MediaBrowserCompat$ItemReceiver(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p040o.ContentFrameLayout.read r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a9
            java.lang.CharSequence r1 = r1.string
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0028
            if (r9 == 0) goto L_0x0027
            r9.write(r14, r10)
        L_0x0027:
            return r13
        L_0x0028:
            android.graphics.Typeface r1 = p040o.setTextMetricsParamsCompat.read(r0, r4, r5)
            if (r1 == 0) goto L_0x0034
            if (r9 == 0) goto L_0x0033
            r9.IconCompatParcelizer(r1, r10)
        L_0x0033:
            return r1
        L_0x0034:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x0067
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            o.setFirstBaselineToTopHeight$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.setFirstBaselineToTopHeight.read((org.xmlpull.p042v1.XmlPullParser) r1, (android.content.res.Resources) r0)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            if (r2 != 0) goto L_0x0055
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            if (r9 == 0) goto L_0x0054
            r9.write(r14, r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        L_0x0054:
            return r13
        L_0x0055:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p040o.setTextMetricsParamsCompat.write(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            return r0
        L_0x0067:
            r1 = r15
            android.graphics.Typeface r0 = p040o.setTextMetricsParamsCompat.IconCompatParcelizer(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            if (r9 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0074
            r9.IconCompatParcelizer(r0, r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
            goto L_0x0077
        L_0x0074:
            r9.write(r14, r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        L_0x0077:
            return r0
        L_0x0078:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a3
        L_0x008e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a3:
            if (r9 == 0) goto L_0x00a8
            r9.write(r14, r10)
        L_0x00a8:
            return r13
        L_0x00a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Resource \""
            r2.append(r3)
            java.lang.String r0 = r0.getResourceName(r4)
            r2.append(r0)
            java.lang.String r0 = "\" ("
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r2.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r2.append(r0)
            r2.append(r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ContentFrameLayout.MediaBrowserCompat$ItemReceiver(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, o.ContentFrameLayout$read, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
