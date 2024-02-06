package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.setBaselineAligned;
import p040o.setCustomView;
import p040o.setGravity;
import p040o.setMaxWidth;

public final class MenuItemImpl implements setGravity {
    private Drawable AlertController$RecycleListView;
    private MenuItem.OnActionExpandListener AppCompatActivity;
    private Intent AppCompatDelegateImpl$ListMenuDecorView;
    private ColorStateList AppCompatDialogFragment = null;
    private CharSequence AppCompatViewInflater;
    public setMaxWidth IconCompatParcelizer;
    private boolean Keep = false;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver = 16;
    int MediaBrowserCompat$MediaItem = 4096;
    int MediaBrowserCompat$SearchResultReceiver = 4096;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private CharSequence f5x50fd9e4a;
    char MediaDescriptionCompat;
    public int MediaMetadataCompat = 0;
    private final int MediaSessionCompat$QueueItem;
    public setCustomView MediaSessionCompat$ResultReceiverWrapper;
    private View MediaSessionCompat$Token;
    private MenuItem.OnMenuItemClickListener ParcelableVolumeInfo;
    private int PlaybackStateCompat = 0;
    private boolean PlaybackStateCompat$CustomAction = false;
    char RatingCompat;
    public final int mId;
    public boolean read = false;
    private boolean setBackgroundResource = false;
    private CharSequence setCheckable;
    private CharSequence setChecked;
    private PorterDuff.Mode setContentView = null;
    private final int setHasDecor;
    public p040o.MenuItemImpl write;

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public MenuItemImpl(p040o.MenuItemImpl menuItemImpl, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.write = menuItemImpl;
        this.mId = i2;
        this.setHasDecor = i;
        this.MediaSessionCompat$QueueItem = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = i4;
        this.AppCompatViewInflater = charSequence;
        this.MediaMetadataCompat = i5;
    }

    public final boolean IconCompatParcelizer() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.ParcelableVolumeInfo;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        p040o.MenuItemImpl menuItemImpl = this.write;
        if (menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, (MenuItem) this)) {
            return true;
        }
        if (this.AppCompatDelegateImpl$ListMenuDecorView != null) {
            try {
                this.write.write.startActivity(this.AppCompatDelegateImpl$ListMenuDecorView);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        setMaxWidth setmaxwidth = this.IconCompatParcelizer;
        if (setmaxwidth == null || !setmaxwidth.write()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.MediaBrowserCompat$ItemReceiver & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.MediaBrowserCompat$ItemReceiver |= 16;
        } else {
            this.MediaBrowserCompat$ItemReceiver &= -17;
        }
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final int getGroupId() {
        return this.setHasDecor;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.mId;
    }

    public final int getOrder() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final Intent getIntent() {
        return this.AppCompatDelegateImpl$ListMenuDecorView;
    }

    public final MenuItem setIntent(Intent intent) {
        this.AppCompatDelegateImpl$ListMenuDecorView = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.MediaDescriptionCompat;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.MediaDescriptionCompat == c) {
            return this;
        }
        this.MediaDescriptionCompat = Character.toLowerCase(c);
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.MediaDescriptionCompat == c && this.MediaBrowserCompat$MediaItem == i) {
            return this;
        }
        this.MediaDescriptionCompat = Character.toLowerCase(c);
        this.MediaBrowserCompat$MediaItem = KeyEvent.normalizeMetaState(i);
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final char getNumericShortcut() {
        return this.RatingCompat;
    }

    public final int getNumericModifiers() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.RatingCompat == c) {
            return this;
        }
        this.RatingCompat = c;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.RatingCompat == c && this.MediaBrowserCompat$SearchResultReceiver == i) {
            return this;
        }
        this.RatingCompat = c;
        this.MediaBrowserCompat$SearchResultReceiver = KeyEvent.normalizeMetaState(i);
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.RatingCompat = c;
        this.MediaDescriptionCompat = Character.toLowerCase(c2);
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.RatingCompat = c;
        this.MediaBrowserCompat$SearchResultReceiver = KeyEvent.normalizeMetaState(i);
        this.MediaDescriptionCompat = Character.toLowerCase(c2);
        this.MediaBrowserCompat$MediaItem = KeyEvent.normalizeMetaState(i2);
        this.write.IconCompatParcelizer(false);
        return this;
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final SubMenu getSubMenu() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final boolean hasSubMenu() {
        return this.MediaSessionCompat$ResultReceiverWrapper != null;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.AppCompatViewInflater;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.AppCompatViewInflater = charSequence;
        this.write.IconCompatParcelizer(false);
        setCustomView setcustomview = this.MediaSessionCompat$ResultReceiverWrapper;
        if (setcustomview != null) {
            setcustomview.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.write.write.getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.setChecked;
        if (charSequence == null) {
            charSequence = this.AppCompatViewInflater;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.setChecked = charSequence;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.AlertController$RecycleListView;
        if (drawable != null) {
            return IconCompatParcelizer(drawable);
        }
        if (this.PlaybackStateCompat == 0) {
            return null;
        }
        Drawable MediaBrowserCompat$ItemReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.write.write, this.PlaybackStateCompat);
        this.PlaybackStateCompat = 0;
        this.AlertController$RecycleListView = MediaBrowserCompat$ItemReceiver2;
        return IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.PlaybackStateCompat = 0;
        this.AlertController$RecycleListView = drawable;
        this.setBackgroundResource = true;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.AlertController$RecycleListView = null;
        this.PlaybackStateCompat = i;
        this.setBackgroundResource = true;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.AppCompatDialogFragment = colorStateList;
        this.Keep = true;
        this.setBackgroundResource = true;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.AppCompatDialogFragment;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.setContentView = mode;
        this.PlaybackStateCompat$CustomAction = true;
        this.setBackgroundResource = true;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.setContentView;
    }

    private Drawable IconCompatParcelizer(Drawable drawable) {
        if (drawable != null && this.setBackgroundResource && (this.Keep || this.PlaybackStateCompat$CustomAction)) {
            drawable = setBaselineAligned.MediaBrowserCompat$MediaItem(drawable).mutate();
            if (this.Keep) {
                setBaselineAligned.read(drawable, this.AppCompatDialogFragment);
            }
            if (this.PlaybackStateCompat$CustomAction) {
                setBaselineAligned.IconCompatParcelizer(drawable, this.setContentView);
            }
            this.setBackgroundResource = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.MediaBrowserCompat$ItemReceiver & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = z | (i & true);
        this.MediaBrowserCompat$ItemReceiver = z2 ? 1 : 0;
        if (i != z2) {
            this.write.IconCompatParcelizer(false);
        }
        return this;
    }

    public final boolean isChecked() {
        return (this.MediaBrowserCompat$ItemReceiver & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.MediaBrowserCompat$ItemReceiver & 4) != 0) {
            p040o.MenuItemImpl menuItemImpl = this.write;
            int groupId = getGroupId();
            int size = menuItemImpl.MediaSessionCompat$QueueItem.size();
            if (!menuItemImpl.PlaybackStateCompat$CustomAction) {
                menuItemImpl.PlaybackStateCompat$CustomAction = true;
                menuItemImpl.MediaSessionCompat$Token = false;
                menuItemImpl.Keep = false;
            }
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl2 = menuItemImpl.MediaSessionCompat$QueueItem.get(i);
                if (menuItemImpl2.getGroupId() == groupId) {
                    if (((menuItemImpl2.MediaBrowserCompat$ItemReceiver & 4) != 0) && menuItemImpl2.isCheckable()) {
                        menuItemImpl2.MediaBrowserCompat$ItemReceiver(menuItemImpl2 == this);
                    }
                }
            }
            menuItemImpl.PlaybackStateCompat$CustomAction = false;
            if (menuItemImpl.MediaSessionCompat$Token) {
                menuItemImpl.MediaSessionCompat$Token = false;
                menuItemImpl.IconCompatParcelizer(menuItemImpl.Keep);
            }
        } else {
            MediaBrowserCompat$ItemReceiver(z);
        }
        return this;
    }

    private void MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.MediaBrowserCompat$ItemReceiver = i2;
        if (i != i2) {
            this.write.IconCompatParcelizer(false);
        }
    }

    public final boolean isVisible() {
        setMaxWidth setmaxwidth = this.IconCompatParcelizer;
        if (setmaxwidth == null || !setmaxwidth.IconCompatParcelizer()) {
            if ((this.MediaBrowserCompat$ItemReceiver & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.MediaBrowserCompat$ItemReceiver & 8) != 0 || !this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.MediaBrowserCompat$ItemReceiver = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (MediaBrowserCompat$CustomActionResultReceiver(z)) {
            p040o.MenuItemImpl menuItemImpl = this.write;
            menuItemImpl.RatingCompat = true;
            menuItemImpl.IconCompatParcelizer(true);
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.ParcelableVolumeInfo = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.AppCompatViewInflater;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.MediaMetadataCompat = i;
            p040o.MenuItemImpl menuItemImpl = this.write;
            menuItemImpl.MediaDescriptionCompat = true;
            menuItemImpl.IconCompatParcelizer(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public setGravity setActionView(View view) {
        int i;
        this.MediaSessionCompat$Token = view;
        this.IconCompatParcelizer = null;
        if (view != null && view.getId() == -1 && (i = this.mId) > 0) {
            view.setId(i);
        }
        p040o.MenuItemImpl menuItemImpl = this.write;
        menuItemImpl.MediaDescriptionCompat = true;
        menuItemImpl.IconCompatParcelizer(true);
        return this;
    }

    public final View getActionView() {
        View view = this.MediaSessionCompat$Token;
        if (view != null) {
            return view;
        }
        setMaxWidth setmaxwidth = this.IconCompatParcelizer;
        if (setmaxwidth == null) {
            return null;
        }
        View MediaBrowserCompat$CustomActionResultReceiver2 = setmaxwidth.MediaBrowserCompat$CustomActionResultReceiver((MenuItem) this);
        this.MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver2;
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final setMaxWidth write() {
        return this.IconCompatParcelizer;
    }

    public final setGravity MediaBrowserCompat$CustomActionResultReceiver(setMaxWidth setmaxwidth) {
        setMaxWidth setmaxwidth2 = this.IconCompatParcelizer;
        if (setmaxwidth2 != null) {
            setmaxwidth2.MediaDescriptionCompat();
        }
        this.MediaSessionCompat$Token = null;
        this.IconCompatParcelizer = setmaxwidth;
        this.write.IconCompatParcelizer(true);
        setMaxWidth setmaxwidth3 = this.IconCompatParcelizer;
        if (setmaxwidth3 != null) {
            setmaxwidth3.MediaBrowserCompat$CustomActionResultReceiver((setMaxWidth.write) new setMaxWidth.write() {
                public final void MediaBrowserCompat$ItemReceiver() {
                    p040o.MenuItemImpl menuItemImpl = MenuItemImpl.this.write;
                    menuItemImpl.RatingCompat = true;
                    menuItemImpl.IconCompatParcelizer(true);
                }
            });
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!MediaBrowserCompat$ItemReceiver()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.AppCompatActivity;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.write.read(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.MediaMetadataCompat & 8) == 0) {
            return false;
        }
        if (this.MediaSessionCompat$Token == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.AppCompatActivity;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.write.MediaBrowserCompat$ItemReceiver(this);
        }
        return false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        setMaxWidth setmaxwidth;
        if ((this.MediaMetadataCompat & 8) == 0) {
            return false;
        }
        if (this.MediaSessionCompat$Token == null && (setmaxwidth = this.IconCompatParcelizer) != null) {
            this.MediaSessionCompat$Token = setmaxwidth.MediaBrowserCompat$CustomActionResultReceiver((MenuItem) this);
        }
        if (this.MediaSessionCompat$Token != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.read;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.AppCompatActivity = onActionExpandListener;
        return this;
    }

    public final setGravity MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        this.f5x50fd9e4a = charSequence;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f5x50fd9e4a;
    }

    public final setGravity IconCompatParcelizer(CharSequence charSequence) {
        this.setCheckable = charSequence;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.setCheckable;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.write.write;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f5x50fd9e4a = charSequence;
        this.write.IconCompatParcelizer(false);
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.setCheckable = charSequence;
        this.write.IconCompatParcelizer(false);
        return this;
    }
}
