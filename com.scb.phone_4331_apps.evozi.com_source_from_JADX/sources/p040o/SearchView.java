package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Writer;
import java.lang.reflect.Method;

/* renamed from: o.SearchView */
public final class SearchView extends Writer {
    private final String IconCompatParcelizer;
    private StringBuilder MediaBrowserCompat$ItemReceiver = new StringBuilder(128);

    /* renamed from: o.SearchView$SearchAutoComplete */
    public final class SearchAutoComplete {
        private static Method MediaBrowserCompat$ItemReceiver;

        static {
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    MediaBrowserCompat$ItemReceiver = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
                } catch (Exception unused) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }

        public static float MediaBrowserCompat$CustomActionResultReceiver(ViewConfiguration viewConfiguration, Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                return viewConfiguration.getScaledHorizontalScrollFactor();
            }
            return IconCompatParcelizer(viewConfiguration, context);
        }

        public static float read(ViewConfiguration viewConfiguration, Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                return viewConfiguration.getScaledVerticalScrollFactor();
            }
            return IconCompatParcelizer(viewConfiguration, context);
        }

        private static float IconCompatParcelizer(ViewConfiguration viewConfiguration, Context context) {
            Method method;
            if (Build.VERSION.SDK_INT >= 25 && (method = MediaBrowserCompat$ItemReceiver) != null) {
                try {
                    return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                } catch (Exception unused) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
            TypedValue typedValue = new TypedValue();
            return context.getTheme().resolveAttribute(16842829, typedValue, true) ? typedValue.getDimension(context.getResources().getDisplayMetrics()) : BitmapDescriptorFactory.HUE_RED;
        }

        public static int write(ViewConfiguration viewConfiguration) {
            if (Build.VERSION.SDK_INT >= 28) {
                return viewConfiguration.getScaledHoverSlop();
            }
            return viewConfiguration.getScaledTouchSlop() / 2;
        }

        public static boolean write(ViewConfiguration viewConfiguration, Context context) {
            if (Build.VERSION.SDK_INT >= 28) {
                return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
            return identifier != 0 && resources.getBoolean(identifier);
        }
    }

    public SearchView(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void close() {
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void flush() {
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                this.MediaBrowserCompat$ItemReceiver.append(c);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver.length() > 0) {
            Log.d(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.toString());
            StringBuilder sb = this.MediaBrowserCompat$ItemReceiver;
            sb.delete(0, sb.length());
        }
    }
}
