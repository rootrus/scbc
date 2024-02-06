package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setBaselineAligned */
public final class setBaselineAligned {
    private static boolean IconCompatParcelizer;
    private static Method MediaBrowserCompat$CustomActionResultReceiver;
    private static Method MediaBrowserCompat$ItemReceiver;
    private static boolean read;

    @Deprecated
    public static void MediaMetadataCompat(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void read(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean MediaDescriptionCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void IconCompatParcelizer(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof setOnFitSystemWindowsListener) {
            ((setOnFitSystemWindowsListener) drawable).setTint(i);
        }
    }

    public static void read(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof setOnFitSystemWindowsListener) {
            ((setOnFitSystemWindowsListener) drawable).setTintList(colorStateList);
        }
    }

    public static void IconCompatParcelizer(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof setOnFitSystemWindowsListener) {
            ((setOnFitSystemWindowsListener) drawable).setTintMode(mode);
        }
    }

    public static int MediaBrowserCompat$ItemReceiver(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void read(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean write(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static ColorFilter read(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static void IconCompatParcelizer(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof LinearLayoutCompat) {
                drawable = ((LinearLayoutCompat) drawable).MediaBrowserCompat$ItemReceiver();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        IconCompatParcelizer(child);
                    }
                }
                return;
            } else {
                return;
            }
        }
        drawable.clearColorFilter();
    }

    public static void write(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static Drawable MediaBrowserCompat$MediaItem(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        return Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof setOnFitSystemWindowsListener) ? new FitWindowsLinearLayout(drawable) : drawable : !(drawable instanceof setOnFitSystemWindowsListener) ? new FitWindowsFrameLayout(drawable) : drawable;
    }

    public static <T extends Drawable> T MediaBrowserCompat$SearchResultReceiver(Drawable drawable) {
        return drawable instanceof LinearLayoutCompat ? ((LinearLayoutCompat) drawable).MediaBrowserCompat$ItemReceiver() : drawable;
    }

    public static boolean read(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!IconCompatParcelizer) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    MediaBrowserCompat$CustomActionResultReceiver = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                IconCompatParcelizer = true;
            }
            Method method = MediaBrowserCompat$CustomActionResultReceiver;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            }
        }
        return false;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!read) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    MediaBrowserCompat$ItemReceiver = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                read = true;
            }
            Method method = MediaBrowserCompat$ItemReceiver;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    MediaBrowserCompat$ItemReceiver = null;
                }
            }
        }
        return 0;
    }
}
