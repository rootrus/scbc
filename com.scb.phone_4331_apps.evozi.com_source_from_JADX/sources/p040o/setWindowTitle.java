package p040o;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import java.lang.reflect.Field;

/* renamed from: o.setWindowTitle */
public final class setWindowTitle {
    private static Class<?> IconCompatParcelizer;
    public static final Rect write = new Rect();

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                IconCompatParcelizer = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static Rect read(Drawable drawable) {
        if (IconCompatParcelizer != null) {
            try {
                Drawable MediaBrowserCompat$SearchResultReceiver = setBaselineAligned.MediaBrowserCompat$SearchResultReceiver(drawable);
                Object invoke = MediaBrowserCompat$SearchResultReceiver.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(MediaBrowserCompat$SearchResultReceiver, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : IconCompatParcelizer.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals(RttiJsonExactionHelper.TOP)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(RttiJsonExactionHelper.LEFT)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return write;
    }

    static void write(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(setExpandedActionViewsExclusive.write);
            } else {
                drawable.setState(setExpandedActionViewsExclusive.read);
            }
            drawable.setState(state);
        }
    }

    public static boolean IconCompatParcelizer(Drawable drawable) {
        while (true) {
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
                return false;
            }
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                for (Drawable IconCompatParcelizer2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!IconCompatParcelizer(IconCompatParcelizer2)) {
                        return false;
                    }
                }
                return true;
            } else if (drawable instanceof LinearLayoutCompat) {
                drawable = ((LinearLayoutCompat) drawable).MediaBrowserCompat$ItemReceiver();
            } else if (drawable instanceof setChecked) {
                drawable = ((setChecked) drawable).MediaBrowserCompat$CustomActionResultReceiver;
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable = ((ScaleDrawable) drawable).getDrawable();
            }
        }
    }

    public static PorterDuff.Mode write(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
