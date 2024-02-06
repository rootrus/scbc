package p040o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.setQuery */
public final class setQuery {

    /* renamed from: $SwitchMap$org$threeten$bp$zone$ZoneOffsetTransitionRule$TimeDefinition */
    public static final /* synthetic */ int[] f2640x9c587b4d;
    private static boolean MediaBrowserCompat$ItemReceiver = false;
    private static Field MediaBrowserCompat$MediaItem = null;
    private static boolean read = false;
    private static Method write;
    public final Map<isStateSaved, performConfigurationChanged<?>> IconCompatParcelizer = new HashMap();
    public final Map<isStateSaved, performConfigurationChanged<?>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();

    /* renamed from: o.setQuery$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (iconCompatParcelizer == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return iconCompatParcelizer.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return MediaBrowserCompat$CustomActionResultReceiver((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return MediaBrowserCompat$ItemReceiver((Dialog) callback, keyEvent);
        }
        if ((view == null || !SwitchCompat.MediaBrowserCompat$ItemReceiver(view, keyEvent)) && !iconCompatParcelizer.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(ActionBar actionBar, KeyEvent keyEvent) {
        if (!MediaBrowserCompat$ItemReceiver) {
            try {
                write = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            MediaBrowserCompat$ItemReceiver = true;
        }
        Method method = write;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && MediaBrowserCompat$CustomActionResultReceiver(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (SwitchCompat.MediaBrowserCompat$ItemReceiver(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static DialogInterface.OnKeyListener write(Dialog dialog) {
        if (!read) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                MediaBrowserCompat$MediaItem = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            read = true;
        }
        Field field = MediaBrowserCompat$MediaItem;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean MediaBrowserCompat$ItemReceiver(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener write2 = write(dialog);
        if (write2 != null && write2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (SwitchCompat.MediaBrowserCompat$ItemReceiver(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public final void write(isStateSaved isstatesaved, performConfigurationChanged<?> performconfigurationchanged) {
        Map<isStateSaved, performConfigurationChanged<?>> map;
        if (performconfigurationchanged.RatingCompat) {
            map = this.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            map = this.IconCompatParcelizer;
        }
        if (performconfigurationchanged.equals(map.get(isstatesaved))) {
            map.remove(isstatesaved);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    static {
        /*
            o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding$IconCompatParcelizer[] r0 = p040o.C6484x9e7f23a1.IconCompatParcelizer.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f2640x9c587b4d = r0
            o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding$IconCompatParcelizer r1 = p040o.C6484x9e7f23a1.IconCompatParcelizer.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = f2640x9c587b4d     // Catch:{ NoSuchFieldError -> 0x001d }
            o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding$IconCompatParcelizer r1 = p040o.C6484x9e7f23a1.IconCompatParcelizer.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setQuery.<clinit>():void");
    }
}
