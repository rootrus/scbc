package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setPrecomputedText */
public final class setPrecomputedText {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList MediaBrowserCompat$CustomActionResultReceiver(android.content.res.Resources r4, org.xmlpull.p042v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000e
            r3 = 1
            if (r1 != r3) goto L_0x0004
        L_0x000e:
            if (r1 != r2) goto L_0x0015
            android.content.res.ColorStateList r4 = MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r0, r6)
            return r4
        L_0x0015:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPrecomputedText.MediaBrowserCompat$CustomActionResultReceiver(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static ColorStateList MediaBrowserCompat$CustomActionResultReceiver(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return read(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList read(android.content.res.Resources r16, org.xmlpull.p042v1.XmlPullParser r17, android.util.AttributeSet r18, android.content.res.Resources.Theme r19) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r18
            int r1 = r17.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = r5
        L_0x0010:
            int r7 = r17.next()
            if (r7 == r2) goto L_0x00d6
            int r8 = r17.getDepth()
            if (r8 >= r1) goto L_0x001f
            r9 = 3
            if (r7 == r9) goto L_0x00d6
        L_0x001f:
            r9 = 2
            if (r7 != r9) goto L_0x00cf
            if (r8 > r1) goto L_0x00cf
            java.lang.String r7 = r17.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00cf
            int[] r7 = p040o.AppCompatSeekBar.read.ColorStateListItem
            r8 = r16
            r9 = r19
            android.content.res.TypedArray r7 = MediaBrowserCompat$ItemReceiver(r8, r9, r0, r7)
            int r10 = p040o.AppCompatSeekBar.read.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            int r11 = p040o.AppCompatSeekBar.read.ColorStateListItem_android_alpha
            boolean r11 = r7.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0054
            int r11 = p040o.AppCompatSeekBar.read.ColorStateListItem_android_alpha
            float r12 = r7.getFloat(r11, r12)
            goto L_0x0062
        L_0x0054:
            int r11 = p040o.AppCompatSeekBar.read.ColorStateListItem_alpha
            boolean r11 = r7.hasValue(r11)
            if (r11 == 0) goto L_0x0062
            int r11 = p040o.AppCompatSeekBar.read.ColorStateListItem_alpha
            float r12 = r7.getFloat(r11, r12)
        L_0x0062:
            r7.recycle()
            int r7 = r18.getAttributeCount()
            int[] r11 = new int[r7]
            r13 = r5
            r14 = r13
        L_0x006d:
            if (r13 >= r7) goto L_0x0091
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x008d
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x008d
            int r2 = p040o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver.alpha
            if (r15 == r2) goto L_0x008d
            boolean r2 = r0.getAttributeBooleanValue(r13, r5)
            if (r2 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            int r15 = -r15
        L_0x0089:
            r11[r14] = r15
            int r14 = r14 + 1
        L_0x008d:
            int r13 = r13 + 1
            r2 = 1
            goto L_0x006d
        L_0x0091:
            int[] r2 = android.util.StateSet.trimStateSet(r11, r14)
            int r7 = write(r10, r12)
            int r10 = r6 + 1
            int r11 = r3.length
            r12 = 8
            r13 = 4
            if (r10 <= r11) goto L_0x00ad
            if (r6 > r13) goto L_0x00a5
            r11 = r12
            goto L_0x00a7
        L_0x00a5:
            int r11 = r6 << 1
        L_0x00a7:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r3, r5, r11, r5, r6)
            r3 = r11
        L_0x00ad:
            r3[r6] = r7
            int r7 = r4.length
            if (r10 <= r7) goto L_0x00c9
            java.lang.Class r7 = r4.getClass()
            java.lang.Class r7 = r7.getComponentType()
            if (r6 > r13) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            int r12 = r6 << 1
        L_0x00bf:
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r12)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.System.arraycopy(r4, r5, r7, r5, r6)
            r4 = r7
        L_0x00c9:
            r4[r6] = r2
            int[][] r4 = (int[][]) r4
            r6 = r10
            goto L_0x00d3
        L_0x00cf:
            r8 = r16
            r9 = r19
        L_0x00d3:
            r2 = 1
            goto L_0x0010
        L_0x00d6:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPrecomputedText.read(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static TypedArray MediaBrowserCompat$ItemReceiver(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int write(int i, float f) {
        return (Math.round(((float) Color.alpha(i)) * f) << 24) | (16777215 & i);
    }
}
