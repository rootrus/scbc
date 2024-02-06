package p040o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.AppCompatSeekBar;

/* renamed from: o.setTextFuture */
final class setTextFuture {
    static Shader MediaBrowserCompat$CustomActionResultReceiver(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        TypedArray typedArray;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            int[] iArr = AppCompatSeekBar.read.GradientColor;
            if (theme2 == null) {
                typedArray = resources.obtainAttributes(attributeSet2, iArr);
            } else {
                Resources resources2 = resources;
                typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
            }
            float MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "startX", AppCompatSeekBar.read.GradientColor_android_startX, (float) BitmapDescriptorFactory.HUE_RED);
            float MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "startY", AppCompatSeekBar.read.GradientColor_android_startY, (float) BitmapDescriptorFactory.HUE_RED);
            float MediaBrowserCompat$CustomActionResultReceiver3 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "endX", AppCompatSeekBar.read.GradientColor_android_endX, (float) BitmapDescriptorFactory.HUE_RED);
            float MediaBrowserCompat$CustomActionResultReceiver4 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "endY", AppCompatSeekBar.read.GradientColor_android_endY, (float) BitmapDescriptorFactory.HUE_RED);
            float MediaBrowserCompat$CustomActionResultReceiver5 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "centerX", AppCompatSeekBar.read.GradientColor_android_centerX, (float) BitmapDescriptorFactory.HUE_RED);
            float MediaBrowserCompat$CustomActionResultReceiver6 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "centerY", AppCompatSeekBar.read.GradientColor_android_centerY, (float) BitmapDescriptorFactory.HUE_RED);
            int read = AlertController$RecycleListView.read(typedArray, xmlPullParser2, "type", AppCompatSeekBar.read.GradientColor_android_type, 0);
            int write2 = AlertController$RecycleListView.write(typedArray, xmlPullParser2, "startColor", AppCompatSeekBar.read.GradientColor_android_startColor);
            boolean z = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
            int write3 = AlertController$RecycleListView.write(typedArray, xmlPullParser2, "centerColor", AppCompatSeekBar.read.GradientColor_android_centerColor);
            int write4 = AlertController$RecycleListView.write(typedArray, xmlPullParser2, "endColor", AppCompatSeekBar.read.GradientColor_android_endColor);
            int read2 = AlertController$RecycleListView.read(typedArray, xmlPullParser2, "tileMode", AppCompatSeekBar.read.GradientColor_android_tileMode, 0);
            float f = MediaBrowserCompat$CustomActionResultReceiver6;
            float MediaBrowserCompat$CustomActionResultReceiver7 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser2, "gradientRadius", AppCompatSeekBar.read.GradientColor_android_gradientRadius, (float) BitmapDescriptorFactory.HUE_RED);
            typedArray.recycle();
            write write5 = write(write(resources, xmlPullParser, attributeSet, theme), write2, write4, z, write3);
            if (read == 1) {
                float f2 = f;
                if (MediaBrowserCompat$CustomActionResultReceiver7 > BitmapDescriptorFactory.HUE_RED) {
                    return new RadialGradient(MediaBrowserCompat$CustomActionResultReceiver5, f2, MediaBrowserCompat$CustomActionResultReceiver7, write5.MediaBrowserCompat$ItemReceiver, write5.IconCompatParcelizer, write(read2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (read != 2) {
                return new LinearGradient(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3, MediaBrowserCompat$CustomActionResultReceiver4, write5.MediaBrowserCompat$ItemReceiver, write5.IconCompatParcelizer, write(read2));
            } else {
                return new SweepGradient(MediaBrowserCompat$CustomActionResultReceiver5, f, write5.MediaBrowserCompat$ItemReceiver, write5.IconCompatParcelizer);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        throw new org.xmlpull.p042v1.XmlPullParserException(r8.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.setTextFuture.write write(android.content.res.Resources r8, org.xmlpull.p042v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008f
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008f
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = p040o.AppCompatSeekBar.read.GradientColorItem
            r5 = 0
            if (r11 != 0) goto L_0x003c
            android.content.res.TypedArray r3 = r8.obtainAttributes(r10, r3)
            goto L_0x0040
        L_0x003c:
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r10, r3, r5, r5)
        L_0x0040:
            int r6 = p040o.AppCompatSeekBar.read.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r6)
            int r7 = p040o.AppCompatSeekBar.read.GradientColorItem_android_offset
            boolean r7 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x006f
            if (r7 == 0) goto L_0x006f
            int r6 = p040o.AppCompatSeekBar.read.GradientColorItem_android_color
            int r5 = r3.getColor(r6, r5)
            int r6 = p040o.AppCompatSeekBar.read.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r8.append(r9)
            java.lang.String r9 = "attribute!"
            r8.append(r9)
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x008f:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x009b
            o.setTextFuture$write r8 = new o.setTextFuture$write
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x009b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTextFuture.write(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.setTextFuture$write");
    }

    private static write write(write write2, int i, int i2, boolean z, int i3) {
        if (write2 != null) {
            return write2;
        }
        if (z) {
            return new write(i, i3, i2);
        }
        return new write(i, i2);
    }

    private static Shader.TileMode write(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: o.setTextFuture$write */
    static final class write {
        final float[] IconCompatParcelizer;
        final int[] MediaBrowserCompat$ItemReceiver;

        write(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.MediaBrowserCompat$ItemReceiver = new int[size];
            this.IconCompatParcelizer = new float[size];
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompat$ItemReceiver[i] = list.get(i).intValue();
                this.IconCompatParcelizer[i] = list2.get(i).floatValue();
            }
        }

        write(int i, int i2) {
            this.MediaBrowserCompat$ItemReceiver = new int[]{i, i2};
            this.IconCompatParcelizer = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        write(int i, int i2, int i3) {
            this.MediaBrowserCompat$ItemReceiver = new int[]{i, i2, i3};
            this.IconCompatParcelizer = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }
}
