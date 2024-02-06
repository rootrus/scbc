package p040o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: o.setItemInvoker */
public final class setItemInvoker extends ActionMode {
    final Context IconCompatParcelizer;
    final ActionMenuItemView write;

    public setItemInvoker(Context context, ActionMenuItemView actionMenuItemView) {
        this.IconCompatParcelizer = context;
        this.write = actionMenuItemView;
    }

    public final Object getTag() {
        return this.write.write;
    }

    public final void setTag(Object obj) {
        this.write.write = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.write.read(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.write.IconCompatParcelizer(charSequence);
    }

    public final void invalidate() {
        this.write.RatingCompat();
    }

    public final void finish() {
        this.write.read();
    }

    public final Menu getMenu() {
        return new ActionBarContainer(this.IconCompatParcelizer, (setHorizontalGravity) this.write.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final CharSequence getTitle() {
        return this.write.MediaBrowserCompat$SearchResultReceiver();
    }

    public final void setTitle(int i) {
        this.write.read(i);
    }

    public final CharSequence getSubtitle() {
        return this.write.MediaMetadataCompat();
    }

    public final void setSubtitle(int i) {
        this.write.IconCompatParcelizer(i);
    }

    public final View getCustomView() {
        return this.write.IconCompatParcelizer();
    }

    public final void setCustomView(View view) {
        this.write.MediaBrowserCompat$ItemReceiver(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.write.write();
    }

    public final boolean getTitleOptionalHint() {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.write.MediaBrowserCompat$ItemReceiver(z);
    }

    public final boolean isTitleOptional() {
        return this.write.MediaBrowserCompat$MediaItem();
    }
}
