package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setNavigationContentDescription$MediaBrowserCompat$CustomActionResultReceiver */
class C1518xe7d29946 implements ActionMode.Callback {
    private Method IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private Class MediaBrowserCompat$ItemReceiver;
    private final TextView MediaBrowserCompat$MediaItem;
    private boolean read;
    private final ActionMode.Callback write;

    C1518xe7d29946(ActionMode.Callback callback, TextView textView) {
        this.write = callback;
        this.MediaBrowserCompat$MediaItem = textView;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.write.onCreateActionMode(actionMode, menu);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MediaBrowserCompat$CustomActionResultReceiver(menu);
        return this.write.onPrepareActionMode(actionMode, menu);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.write.onActionItemClicked(actionMode, menuItem);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.write.onDestroyActionMode(actionMode);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Menu menu) {
        Method method;
        Context context = this.MediaBrowserCompat$MediaItem.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.MediaBrowserCompat$ItemReceiver = cls;
                this.IconCompatParcelizer = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.read = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.IconCompatParcelizer = null;
                this.read = false;
            }
        }
        try {
            if (!this.read || !this.MediaBrowserCompat$ItemReceiver.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            } else {
                method = this.IconCompatParcelizer;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, new Object[]{Integer.valueOf(size)});
                }
            }
            List<ResolveInfo> read2 = read(context, packageManager);
            for (int i = 0; i < read2.size(); i++) {
                ResolveInfo resolveInfo = read2.get(i);
                menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(read(resolveInfo, this.MediaBrowserCompat$MediaItem)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }

    private List<ResolveInfo> read(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        if (!(context instanceof Activity)) {
            return arrayList;
        }
        for (ResolveInfo next : packageManager.queryIntentActivities(read(), 0)) {
            if (write(next, context)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean write(ResolveInfo resolveInfo, Context context) {
        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
            return true;
        }
        if (!resolveInfo.activityInfo.exported) {
            return false;
        }
        if (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
            return true;
        }
        return false;
    }

    private Intent read(ResolveInfo resolveInfo, TextView textView) {
        return read().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !write(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
    }

    private boolean write(TextView textView) {
        return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
    }

    private Intent read() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
}
