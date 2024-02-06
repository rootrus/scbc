package p040o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.getDialog */
public class getDialog {
    private static boolean MediaBrowserCompat$ItemReceiver(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator MediaBrowserCompat$ItemReceiver(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return MediaBrowserCompat$CustomActionResultReceiver(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator MediaBrowserCompat$CustomActionResultReceiver(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return MediaBrowserCompat$ItemReceiver(context, resources, theme, i, 1.0f);
    }

    public static Animator MediaBrowserCompat$ItemReceiver(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return MediaBrowserCompat$CustomActionResultReceiver;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder MediaBrowserCompat$ItemReceiver(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = MediaBrowserCompat$ItemReceiver(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = MediaBrowserCompat$ItemReceiver(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = r7
            goto L_0x0037
        L_0x0036:
            r12 = r2
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = r1
            goto L_0x003c
        L_0x003b:
            r6 = r2
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            o.ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] r13 = p040o.ButtonBarLayout.write(r12)
            o.ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] r14 = p040o.ButtonBarLayout.write(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0169
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            o.getDialog$MediaBrowserCompat$ItemReceiver r0 = new o.getDialog$MediaBrowserCompat$ItemReceiver
            r0.<init>()
            if (r14 == 0) goto L_0x008e
            boolean r3 = p040o.ButtonBarLayout.MediaBrowserCompat$CustomActionResultReceiver(r13, r14)
            if (r3 == 0) goto L_0x006f
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0169
        L_0x006f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = " Can't morph from "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = " to "
            r13.append(r12)
            r13.append(r11)
            android.view.InflateException r11 = new android.view.InflateException
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x008e:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0169
        L_0x0098:
            if (r14 == 0) goto L_0x0169
            o.getDialog$MediaBrowserCompat$ItemReceiver r11 = new o.getDialog$MediaBrowserCompat$ItemReceiver
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0169
        L_0x00a9:
            if (r12 != r7) goto L_0x00b0
            o.dismissAllowingStateLoss r12 = p040o.dismissAllowingStateLoss.IconCompatParcelizer()
            goto L_0x00b1
        L_0x00b0:
            r12 = r8
        L_0x00b1:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00fa
            if (r3 == 0) goto L_0x00e5
            if (r0 != r7) goto L_0x00be
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c2
        L_0x00be:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c2:
            if (r5 == 0) goto L_0x00db
            if (r4 != r7) goto L_0x00cb
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cf
        L_0x00cb:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cf:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x0161
        L_0x00db:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x0161
        L_0x00e5:
            if (r4 != r7) goto L_0x00ec
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00f0
        L_0x00ec:
            float r11 = r11.getFloat(r14, r10)
        L_0x00f0:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x0161
        L_0x00fa:
            if (r3 == 0) goto L_0x0140
            if (r0 != r7) goto L_0x0104
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0113
        L_0x0104:
            boolean r0 = MediaBrowserCompat$ItemReceiver(r0)
            if (r0 == 0) goto L_0x010f
            int r13 = r11.getColor(r13, r2)
            goto L_0x0113
        L_0x010f:
            int r13 = r11.getInt(r13, r2)
        L_0x0113:
            if (r5 == 0) goto L_0x0137
            if (r4 != r7) goto L_0x011d
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012c
        L_0x011d:
            boolean r0 = MediaBrowserCompat$ItemReceiver(r4)
            if (r0 == 0) goto L_0x0128
            int r11 = r11.getColor(r14, r2)
            goto L_0x012c
        L_0x0128:
            int r11 = r11.getInt(r14, r2)
        L_0x012c:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x0161
        L_0x0137:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0161
        L_0x0140:
            if (r5 == 0) goto L_0x0162
            if (r4 != r7) goto L_0x014a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0159
        L_0x014a:
            boolean r13 = MediaBrowserCompat$ItemReceiver(r4)
            if (r13 == 0) goto L_0x0155
            int r11 = r11.getColor(r14, r2)
            goto L_0x0159
        L_0x0155:
            int r11 = r11.getInt(r14, r2)
        L_0x0159:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x0161:
            r8 = r11
        L_0x0162:
            if (r8 == 0) goto L_0x0169
            if (r12 == 0) goto L_0x0169
            r8.setEvaluator(r12)
        L_0x0169:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getDialog.MediaBrowserCompat$ItemReceiver(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long read = (long) AlertController$RecycleListView.read(typedArray, xmlPullParser, "duration", 1, 300);
        long read2 = (long) AlertController$RecycleListView.read(typedArray, xmlPullParser, "startOffset", 2, 0);
        int read3 = AlertController$RecycleListView.read(typedArray, xmlPullParser, "valueType", 7, 4);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
                if (read3 == 4) {
                    read3 = MediaBrowserCompat$ItemReceiver(typedArray, 5, 6);
                }
                PropertyValuesHolder MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(typedArray, read3, 5, 6, "");
                if (MediaBrowserCompat$ItemReceiver != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[]{MediaBrowserCompat$ItemReceiver});
                }
            }
        }
        valueAnimator.setDuration(read);
        valueAnimator.setStartDelay(read2);
        valueAnimator.setRepeatCount(AlertController$RecycleListView.read(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(AlertController$RecycleListView.read(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            IconCompatParcelizer(valueAnimator, typedArray2, read3, f, xmlPullParser);
        }
    }

    private static void IconCompatParcelizer(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String MediaBrowserCompat$ItemReceiver = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, "pathData", 1);
        if (MediaBrowserCompat$ItemReceiver != null) {
            String MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, "propertyXName", 2);
            String MediaBrowserCompat$ItemReceiver3 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, "propertyYName", 3);
            if (MediaBrowserCompat$ItemReceiver2 == null && MediaBrowserCompat$ItemReceiver3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            IconCompatParcelizer(ButtonBarLayout.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver), objectAnimator, f * 0.5f, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3);
            return;
        }
        objectAnimator.setPropertyName(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void IconCompatParcelizer(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        arrayList.add(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    private static Animator MediaBrowserCompat$CustomActionResultReceiver(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return MediaBrowserCompat$CustomActionResultReceiver(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator MediaBrowserCompat$CustomActionResultReceiver(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.p042v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            int r13 = r21.getDepth()
            r0 = 0
            r14 = r0
        L_0x0010:
            int r1 = r21.next()
            r2 = 3
            r3 = 1
            r15 = 0
            if (r1 != r2) goto L_0x001f
            int r2 = r21.getDepth()
            if (r2 <= r13) goto L_0x00ee
        L_0x001f:
            if (r1 == r3) goto L_0x00ee
            r2 = 2
            if (r1 != r2) goto L_0x00ea
            java.lang.String r1 = r21.getName()
            java.lang.String r2 = "objectAnimator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0045
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r2, r3, r4, r5)
        L_0x0040:
            r2 = r18
            r3 = r15
            goto L_0x00be
        L_0x0045:
            java.lang.String r2 = "animator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x005f
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = write(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0040
        L_0x005f:
            java.lang.String r2 = "set"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x009e
            android.animation.AnimatorSet r16 = new android.animation.AnimatorSet
            r16.<init>()
            int[] r0 = p040o.DialogFragment.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 != 0) goto L_0x0075
            android.content.res.TypedArray r0 = r8.obtainAttributes(r11, r0)
            goto L_0x0079
        L_0x0075:
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r11, r0, r15, r15)
        L_0x0079:
            r7 = r0
            java.lang.String r0 = "ordering"
            int r6 = p040o.AlertController$RecycleListView.read((android.content.res.TypedArray) r7, (org.xmlpull.p042v1.XmlPullParser) r10, (java.lang.String) r0, (int) r15, (int) r15)
            r5 = r16
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r7
            r7 = r25
            MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r2 = r18
            r3 = r15
            r0 = r16
            goto L_0x00be
        L_0x009e:
            java.lang.String r2 = "propertyValuesHolder"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00cf
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r2 = r18
            android.animation.PropertyValuesHolder[] r1 = MediaBrowserCompat$ItemReceiver((android.content.Context) r2, (android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (org.xmlpull.p042v1.XmlPullParser) r10, (android.util.AttributeSet) r1)
            if (r1 == 0) goto L_0x00be
            if (r0 == 0) goto L_0x00be
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00be
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00be:
            if (r12 == 0) goto L_0x0010
            if (r3 != 0) goto L_0x0010
            if (r14 != 0) goto L_0x00ca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r14 = r1
        L_0x00ca:
            r14.add(r0)
            goto L_0x0010
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animator name: "
            r0.append(r1)
            java.lang.String r1 = r21.getName()
            r0.append(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00ea:
            r2 = r18
            goto L_0x0010
        L_0x00ee:
            if (r12 == 0) goto L_0x0115
            if (r14 == 0) goto L_0x0115
            int r1 = r14.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r14.iterator()
        L_0x00fc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x010c
            java.lang.Object r4 = r2.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            r1[r15] = r4
            int r15 = r15 + r3
            goto L_0x00fc
        L_0x010c:
            if (r24 != 0) goto L_0x0112
            r12.playTogether(r1)
            goto L_0x0115
        L_0x0112:
            r12.playSequentially(r1)
        L_0x0115:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getDialog.MediaBrowserCompat$CustomActionResultReceiver(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] MediaBrowserCompat$ItemReceiver(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.p042v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = 0
            r10 = r9
        L_0x0008:
            int r0 = r20.getEventType()
            r1 = 3
            r11 = 0
            if (r0 == r1) goto L_0x0074
            r12 = 1
            if (r0 == r12) goto L_0x0074
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r20.next()
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006e
            int[] r0 = p040o.DialogFragment.MediaBrowserCompat$SearchResultReceiver
            if (r6 != 0) goto L_0x0031
            r13 = r18
            android.content.res.TypedArray r0 = r13.obtainAttributes(r8, r0)
            goto L_0x0037
        L_0x0031:
            r13 = r18
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r8, r0, r11, r11)
        L_0x0037:
            r14 = r0
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.content.res.TypedArray) r14, (org.xmlpull.p042v1.XmlPullParser) r7, (java.lang.String) r0, (int) r1)
            r0 = 4
            java.lang.String r1 = "valueType"
            int r5 = p040o.AlertController$RecycleListView.read((android.content.res.TypedArray) r14, (org.xmlpull.p042v1.XmlPullParser) r7, (java.lang.String) r1, (int) r2, (int) r0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = write(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x005d
            r1 = r16
            android.animation.PropertyValuesHolder r0 = MediaBrowserCompat$ItemReceiver((android.content.res.TypedArray) r14, (int) r1, (int) r11, (int) r12, (java.lang.String) r15)
        L_0x005d:
            if (r0 == 0) goto L_0x006a
            if (r10 != 0) goto L_0x0067
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10 = r1
        L_0x0067:
            r10.add(r0)
        L_0x006a:
            r14.recycle()
            goto L_0x0070
        L_0x006e:
            r13 = r18
        L_0x0070:
            r20.next()
            goto L_0x0008
        L_0x0074:
            if (r10 == 0) goto L_0x0089
            int r0 = r10.size()
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r0]
        L_0x007c:
            if (r11 >= r0) goto L_0x0089
            java.lang.Object r1 = r10.get(r11)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r9[r11] = r1
            int r11 = r11 + 1
            goto L_0x007c
        L_0x0089:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getDialog.MediaBrowserCompat$ItemReceiver(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    private static int MediaBrowserCompat$ItemReceiver(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        int[] iArr = DialogFragment.read;
        int i = 0;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        TypedValue write = AlertController$RecycleListView.write(typedArray, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if ((write != null) && MediaBrowserCompat$ItemReceiver(write.type)) {
            i = 3;
        }
        typedArray.recycle();
        return i;
    }

    private static int MediaBrowserCompat$ItemReceiver(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !MediaBrowserCompat$ItemReceiver(i3)) && (!z || !MediaBrowserCompat$ItemReceiver(i4))) {
            return 0;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder write(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.p042v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r4 = 1
            if (r2 == r4) goto L_0x0040
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0002
            r2 = 4
            if (r14 != r2) goto L_0x0023
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = MediaBrowserCompat$ItemReceiver(r10, r11, r14, r12)
        L_0x0023:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = IconCompatParcelizer(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0039:
            r1.add(r2)
        L_0x003c:
            r12.next()
            goto L_0x0002
        L_0x0040:
            if (r1 == 0) goto L_0x00e8
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00e8
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x0077
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r12.setFraction(r2)
            goto L_0x0077
        L_0x006a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = MediaBrowserCompat$ItemReceiver((android.animation.Keyframe) r12, (float) r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L_0x0077:
            float r12 = r11.getFraction()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r11.setFraction(r5)
            goto L_0x0090
        L_0x0087:
            android.animation.Keyframe r11 = MediaBrowserCompat$ItemReceiver((android.animation.Keyframe) r11, (float) r5)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L_0x0090:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L_0x0095:
            if (r10 >= r9) goto L_0x00db
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            if (r10 != 0) goto L_0x00a7
            r12.setFraction(r5)
            goto L_0x00d8
        L_0x00a7:
            int r0 = r9 + -1
            if (r10 != r0) goto L_0x00af
            r12.setFraction(r2)
            goto L_0x00d8
        L_0x00af:
            int r12 = r10 + 1
            r1 = r10
        L_0x00b2:
            if (r12 >= r0) goto L_0x00c4
            r4 = r11[r12]
            float r4 = r4.getFraction()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c4
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto L_0x00b2
        L_0x00c4:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + -1
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            MediaBrowserCompat$CustomActionResultReceiver((android.animation.Keyframe[]) r11, (float) r12, (int) r10, (int) r1)
        L_0x00d8:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00db:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto L_0x00e8
            o.dismissAllowingStateLoss r9 = p040o.dismissAllowingStateLoss.IconCompatParcelizer()
            r0.setEvaluator(r9)
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getDialog.write(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    private static Keyframe MediaBrowserCompat$ItemReceiver(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static Keyframe IconCompatParcelizer(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        Keyframe keyframe;
        int[] iArr = DialogFragment.read;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        float MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue write = AlertController$RecycleListView.write(typedArray, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        boolean z = write != null;
        if (i == 4) {
            i = (!z || !MediaBrowserCompat$ItemReceiver(write.type)) ? 0 : 3;
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(MediaBrowserCompat$CustomActionResultReceiver, AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, (float) BitmapDescriptorFactory.HUE_RED));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(MediaBrowserCompat$CustomActionResultReceiver, AlertController$RecycleListView.read(typedArray, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            keyframe = Keyframe.ofInt(MediaBrowserCompat$CustomActionResultReceiver);
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "interpolator", 1);
        if (MediaBrowserCompat$CustomActionResultReceiver2 > 0) {
            keyframe.setInterpolator(setScrimColor.MediaBrowserCompat$CustomActionResultReceiver(context, MediaBrowserCompat$CustomActionResultReceiver2));
        }
        typedArray.recycle();
        return keyframe;
    }

    private static ObjectAnimator MediaBrowserCompat$CustomActionResultReceiver(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        write(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator write(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArray;
        TypedArray typedArray2;
        int[] iArr = DialogFragment.MediaBrowserCompat$ItemReceiver;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int[] iArr2 = DialogFragment.RatingCompat;
        if (theme == null) {
            typedArray2 = resources.obtainAttributes(attributeSet, iArr2);
        } else {
            typedArray2 = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        }
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        MediaBrowserCompat$CustomActionResultReceiver(valueAnimator, typedArray, typedArray2, f, xmlPullParser);
        int MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "interpolator", 0);
        if (MediaBrowserCompat$CustomActionResultReceiver > 0) {
            valueAnimator.setInterpolator(setScrimColor.MediaBrowserCompat$CustomActionResultReceiver(context, MediaBrowserCompat$CustomActionResultReceiver));
        }
        typedArray.recycle();
        if (typedArray2 != null) {
            typedArray2.recycle();
        }
        return valueAnimator;
    }
}
