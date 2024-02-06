package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.p042v1.XmlPullParser;

/* renamed from: o.dismissInternal */
public class dismissInternal implements Interpolator {
    private float[] MediaBrowserCompat$ItemReceiver;
    private float[] write;

    public dismissInternal(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public dismissInternal(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        int[] iArr = DialogFragment.MediaMetadataCompat;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        IconCompatParcelizer(typedArray, xmlPullParser);
        typedArray.recycle();
    }

    private void write(float f, float f2) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.quadTo(f, f2, 1.0f, 1.0f);
        read(path);
    }

    private void write(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        read(path);
    }

    private void read(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.MediaBrowserCompat$ItemReceiver = new float[min];
            this.write = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.MediaBrowserCompat$ItemReceiver[i2] = fArr[0];
                this.write[i2] = fArr[1];
            }
            if (((double) Math.abs(this.MediaBrowserCompat$ItemReceiver[0])) <= 1.0E-5d && ((double) Math.abs(this.write[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.MediaBrowserCompat$ItemReceiver[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.write[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = BitmapDescriptorFactory.HUE_RED;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.MediaBrowserCompat$ItemReceiver;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            i4++;
                            f = f2;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.MediaBrowserCompat$ItemReceiver[0]);
            sb2.append(",");
            sb2.append(this.write[0]);
            sb2.append(" end:");
            int i5 = min - 1;
            sb2.append(this.MediaBrowserCompat$ItemReceiver[i5]);
            sb2.append(",");
            sb2.append(this.write[i5]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }

    public float getInterpolation(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.MediaBrowserCompat$ItemReceiver.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.MediaBrowserCompat$ItemReceiver[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.MediaBrowserCompat$ItemReceiver;
        float f2 = fArr[length] - fArr[i];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return this.write[i];
        }
        float[] fArr2 = this.write;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    private void IconCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser) {
        boolean z = true;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(typedArray, xmlPullParser, "pathData", 4);
            Path IconCompatParcelizer = ButtonBarLayout.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
            if (IconCompatParcelizer != null) {
                read(IconCompatParcelizer);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The path is null, which is created from ");
            sb.append(MediaBrowserCompat$ItemReceiver2);
            throw new InflateException(sb.toString());
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX1") != null) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY1") != null) {
                float MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "controlX1", 0, (float) BitmapDescriptorFactory.HUE_RED);
                float MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "controlY1", 1, (float) BitmapDescriptorFactory.HUE_RED);
                boolean z2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX2") != null;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY2") == null) {
                    z = false;
                }
                if (z2 != z) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                } else if (!z2) {
                    write(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2);
                } else {
                    write(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "controlX2", 2, (float) BitmapDescriptorFactory.HUE_RED), AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(typedArray, xmlPullParser, "controlY2", 3, (float) BitmapDescriptorFactory.HUE_RED));
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }
}
