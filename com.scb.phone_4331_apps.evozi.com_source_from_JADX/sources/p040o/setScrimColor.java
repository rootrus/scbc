package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setScrimColor */
public class setScrimColor {
    public static Interpolator MediaBrowserCompat$CustomActionResultReceiver(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new setMinimumWidth();
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
        } else if (i == 17563661) {
            return new setMinimumHeight();
        } else {
            if (i == 17563662) {
                return new setPreventCornerOverlap();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            Interpolator read = read(context, context.getResources(), context.getTheme(), animation);
            if (animation != null) {
                animation.close();
            }
            return read;
        }
    }

    private static Interpolator read(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator dismissinternal;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            dismissinternal = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            dismissinternal = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            dismissinternal = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            dismissinternal = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            dismissinternal = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            dismissinternal = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            dismissinternal = new dismissInternal(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown interpolator name: ");
                            sb.append(xmlPullParser.getName());
                            throw new RuntimeException(sb.toString());
                        }
                        interpolator = dismissinternal;
                    }
                }
            }
        }
        return interpolator;
    }
}
