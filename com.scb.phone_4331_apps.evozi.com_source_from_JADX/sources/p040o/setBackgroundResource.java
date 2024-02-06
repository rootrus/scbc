package p040o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p040o.ActionMenuItemView;
import p040o.AlertController$RecycleListView;
import p040o.setQuery;

/* renamed from: o.setBackgroundResource */
public class setBackgroundResource extends Dialog implements PlaybackStateCompat {
    private final setQuery.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new setQuery.IconCompatParcelizer() {
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return setBackgroundResource.this.read(keyEvent);
        }
    };
    private setHasDecor write;

    public void IconCompatParcelizer(ActionMenuItemView actionMenuItemView) {
    }

    public ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView.read read) {
        return null;
    }

    public void write(ActionMenuItemView actionMenuItemView) {
    }

    public setBackgroundResource(Context context, int i) {
        super(context, MediaBrowserCompat$ItemReceiver(context, i));
        read().write((Bundle) null);
        read().write();
    }

    public void onCreate(Bundle bundle) {
        read().IconCompatParcelizer();
        super.onCreate(bundle);
        read().write(bundle);
    }

    public void setContentView(int i) {
        read().IconCompatParcelizer(i);
    }

    public void setContentView(View view) {
        read().MediaBrowserCompat$CustomActionResultReceiver(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        read().IconCompatParcelizer(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return read().MediaBrowserCompat$ItemReceiver(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        read().MediaBrowserCompat$ItemReceiver(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        read().MediaBrowserCompat$ItemReceiver((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        read().MediaBrowserCompat$ItemReceiver(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        read().MediaBrowserCompat$MediaItem();
    }

    public boolean write(int i) {
        return read().write(i);
    }

    public void invalidateOptionsMenu() {
        read().MediaDescriptionCompat();
    }

    public setHasDecor read() {
        if (this.write == null) {
            this.write = setHasDecor.read(this, this);
        }
        return this.write;
    }

    private static int MediaBrowserCompat$ItemReceiver(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AlertController$RecycleListView.read.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: package-private */
    public boolean read(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return setQuery.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, getWindow().getDecorView(), this, keyEvent);
    }
}
