package p040o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.setGroupDividerEnabled */
public final class setGroupDividerEnabled implements setGravity {
    private CharSequence AlertController$RecycleListView;
    private int IconCompatParcelizer = 16;
    private char Keep;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private Drawable MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private char f2631x50fd9e4a;
    private ColorStateList MediaDescriptionCompat = null;
    private boolean MediaMetadataCompat = false;
    private final int MediaSessionCompat$QueueItem;
    private Intent MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token = 4096;
    private final int ParcelableVolumeInfo;
    private CharSequence PlaybackStateCompat;
    private CharSequence PlaybackStateCompat$CustomAction;
    private PorterDuff.Mode RatingCompat = null;
    private CharSequence read;
    private int setHasDecor = 4096;
    private final int write;

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final setMaxWidth write() {
        return null;
    }

    public setGroupDividerEnabled(Context context, CharSequence charSequence) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaSessionCompat$QueueItem = 16908332;
        this.write = 0;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.ParcelableVolumeInfo = 0;
        this.PlaybackStateCompat$CustomAction = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.f2631x50fd9e4a;
    }

    public final int getAlphabeticModifiers() {
        return this.MediaSessionCompat$Token;
    }

    public final int getGroupId() {
        return this.write;
    }

    public final Drawable getIcon() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final Intent getIntent() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final int getItemId() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final char getNumericShortcut() {
        return this.Keep;
    }

    public final int getNumericModifiers() {
        return this.setHasDecor;
    }

    public final int getOrder() {
        return this.ParcelableVolumeInfo;
    }

    public final CharSequence getTitle() {
        return this.PlaybackStateCompat$CustomAction;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.AlertController$RecycleListView;
        return charSequence == null ? this.PlaybackStateCompat$CustomAction : charSequence;
    }

    public final boolean isCheckable() {
        return (this.IconCompatParcelizer & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.IconCompatParcelizer & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.IconCompatParcelizer & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.IconCompatParcelizer & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f2631x50fd9e4a = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2631x50fd9e4a = Character.toLowerCase(c);
        this.MediaSessionCompat$Token = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.IconCompatParcelizer = z | (this.IconCompatParcelizer & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.IconCompatParcelizer = (z ? 2 : 0) | (this.IconCompatParcelizer & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.IconCompatParcelizer = (z ? 16 : 0) | (this.IconCompatParcelizer & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.MediaBrowserCompat$SearchResultReceiver = drawable;
        MediaBrowserCompat$ItemReceiver();
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        MediaBrowserCompat$ItemReceiver();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.MediaSessionCompat$ResultReceiverWrapper = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.Keep = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.Keep = c;
        this.setHasDecor = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.Keep = c;
        this.f2631x50fd9e4a = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.Keep = c;
        this.setHasDecor = KeyEvent.normalizeMetaState(i);
        this.f2631x50fd9e4a = Character.toLowerCase(c2);
        this.MediaSessionCompat$Token = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.PlaybackStateCompat$CustomAction = charSequence;
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.PlaybackStateCompat$CustomAction = this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.AlertController$RecycleListView = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        this.IconCompatParcelizer = (z ? 0 : 8) | (this.IconCompatParcelizer & 8);
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final setGravity MediaBrowserCompat$CustomActionResultReceiver(setMaxWidth setmaxwidth) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final setGravity MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        this.read = charSequence;
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.read;
    }

    public final setGravity IconCompatParcelizer(CharSequence charSequence) {
        this.PlaybackStateCompat = charSequence;
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.PlaybackStateCompat;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.MediaDescriptionCompat = colorStateList;
        this.MediaBrowserCompat$MediaItem = true;
        MediaBrowserCompat$ItemReceiver();
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.MediaDescriptionCompat;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.RatingCompat = mode;
        this.MediaMetadataCompat = true;
        MediaBrowserCompat$ItemReceiver();
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.RatingCompat;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            return;
        }
        if (this.MediaBrowserCompat$MediaItem || this.MediaMetadataCompat) {
            Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$SearchResultReceiver);
            this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$MediaItem2;
            Drawable mutate = MediaBrowserCompat$MediaItem2.mutate();
            this.MediaBrowserCompat$SearchResultReceiver = mutate;
            if (this.MediaBrowserCompat$MediaItem) {
                setBaselineAligned.read(mutate, this.MediaDescriptionCompat);
            }
            if (this.MediaMetadataCompat) {
                setBaselineAligned.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.RatingCompat);
            }
        }
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.read = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.PlaybackStateCompat = charSequence;
        return this;
    }
}
