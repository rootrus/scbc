package p040o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import p040o.AppCompatMultiAutoCompleteTextView;

/* renamed from: o.setFillViewport */
final class setFillViewport {
    private static final AppCompatMultiAutoCompleteTextView.read IconCompatParcelizer;
    private static boolean MediaBrowserCompat$CustomActionResultReceiver;
    private static Field read;
    static final Property<View, Float> write = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(setFillViewport.read((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver((View) obj, ((Float) obj2).floatValue());
        }
    };

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            IconCompatParcelizer = new setDrawerListener();
        } else if (Build.VERSION.SDK_INT >= 21) {
            IconCompatParcelizer = new setChildInsets();
        } else if (Build.VERSION.SDK_INT >= 19) {
            IconCompatParcelizer = new DrawerLayout();
        } else {
            IconCompatParcelizer = new AppCompatMultiAutoCompleteTextView.read();
        }
        new Property<View, Rect>(Rect.class, "clipBounds") {
            public final /* synthetic */ Object get(Object obj) {
                return SwitchCompat.IconCompatParcelizer((View) obj);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) obj, (Rect) obj2);
            }
        };
    }

    static CheckExtractActivity_MembersInjector MediaBrowserCompat$ItemReceiver(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new setDrawerShadow(view);
        }
        return new setDrawerLockMode(view.getWindowToken());
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(View view, float f) {
        IconCompatParcelizer.write(view, f);
    }

    static float read(View view) {
        return IconCompatParcelizer.IconCompatParcelizer(view);
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        IconCompatParcelizer.write(view);
    }

    static void write(View view) {
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view);
    }

    static void write(View view, Matrix matrix) {
        IconCompatParcelizer.read(view, matrix);
    }

    static void MediaBrowserCompat$ItemReceiver(View view, Matrix matrix) {
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view, matrix);
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2, int i3, int i4) {
        IconCompatParcelizer.IconCompatParcelizer(view, i, i2, i3, i4);
    }

    static void write(View view, int i) {
        if (!MediaBrowserCompat$CustomActionResultReceiver) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                read = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        Field field = read;
        if (field != null) {
            try {
                read.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
