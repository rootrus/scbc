package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.LinearLayoutCompat;
import p040o.ActivityChooserView;
import p040o.AlertController$RecycleListView;
import p040o.ContentFrameLayout;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$ItemReceiver;
import p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem;
import p040o.setBaselineAligned;
import p040o.setIconifiedByDefault;
import p040o.setNavigationContentDescription;
import p040o.setTabContainer;
import p040o.setTextOn;

public class NavigationMenuItemView extends ForegroundLinearLayout implements setTabContainer.read {
    private static final int[] MediaBrowserCompat$SearchResultReceiver = {16842912};
    public ColorStateList IconCompatParcelizer;
    public MenuItemImpl MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    private final setIconifiedByDefault MediaBrowserCompat$MediaItem;
    private Drawable MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    public final CheckedTextView RatingCompat;
    public FrameLayout read;
    boolean write;

    public final boolean read() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$MediaItem = new setIconifiedByDefault() {
            public final void IconCompatParcelizer(View view, setTextOn settexton) {
                super.IconCompatParcelizer(view, settexton);
                settexton.read(NavigationMenuItemView.this.write);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_navigation_menu_item, this, true);
        this.MediaMetadataCompat = context.getResources().getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(nAllocationSetSurface.MediaDescriptionCompat.design_menu_item_text);
        this.RatingCompat = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        SwitchCompat.read((View) this.RatingCompat, this.MediaBrowserCompat$MediaItem);
    }

    public final void read(MenuItemImpl menuItemImpl) {
        StateListDrawable stateListDrawable;
        this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(AlertController$RecycleListView.read.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(MediaBrowserCompat$SearchResultReceiver, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            SwitchCompat.IconCompatParcelizer((View) this, (Drawable) stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        View actionView = menuItemImpl.getActionView();
        if (actionView != null) {
            if (this.read == null) {
                this.read = (FrameLayout) ((ViewStub) findViewById(nAllocationSetSurface.MediaDescriptionCompat.design_menu_item_action_area_stub)).inflate();
            }
            this.read.removeAllViews();
            this.read.addView(actionView);
        }
        setContentDescription(menuItemImpl.getContentDescription());
        ActivityChooserView.MediaBrowserCompat$ItemReceiver(this, menuItemImpl.getTooltipText());
        if (!(this.MediaBrowserCompat$CustomActionResultReceiver.getTitle() == null && this.MediaBrowserCompat$CustomActionResultReceiver.getIcon() == null && this.MediaBrowserCompat$CustomActionResultReceiver.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.RatingCompat.setVisibility(8);
            FrameLayout frameLayout = this.read;
            if (frameLayout != null) {
                LinearLayoutCompat.write write2 = (LinearLayoutCompat.write) frameLayout.getLayoutParams();
                write2.width = -1;
                this.read.setLayoutParams(write2);
                return;
            }
            return;
        }
        this.RatingCompat.setVisibility(0);
        FrameLayout frameLayout2 = this.read;
        if (frameLayout2 != null) {
            LinearLayoutCompat.write write3 = (LinearLayoutCompat.write) frameLayout2.getLayoutParams();
            write3.width = -2;
            this.read.setLayoutParams(write3);
        }
    }

    public final MenuItemImpl IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setTitle(CharSequence charSequence) {
        this.RatingCompat.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.write != z) {
            this.write = z;
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver((View) this.RatingCompat, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.RatingCompat.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = setBaselineAligned.MediaBrowserCompat$MediaItem(drawable).mutate();
                setBaselineAligned.read(drawable, this.IconCompatParcelizer);
            }
            int i = this.MediaMetadataCompat;
            drawable.setBounds(0, 0, i, i);
        } else if (this.MediaSessionCompat$QueueItem) {
            if (this.MediaDescriptionCompat == null) {
                Drawable read2 = ContentFrameLayout.read(getResources(), nAllocationSetSurface$MediaBrowserCompat$ItemReceiver.navigation_empty_icon, getContext().getTheme());
                this.MediaDescriptionCompat = read2;
                if (read2 != null) {
                    int i2 = this.MediaMetadataCompat;
                    read2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.MediaDescriptionCompat;
        }
        setNavigationContentDescription.IconCompatParcelizer(this.RatingCompat, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.MediaBrowserCompat$CustomActionResultReceiver.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, MediaBrowserCompat$SearchResultReceiver);
        }
        return onCreateDrawableState;
    }

    public void setTextAppearance(int i) {
        setNavigationContentDescription.read((TextView) this.RatingCompat, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.RatingCompat.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.MediaSessionCompat$QueueItem = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.RatingCompat.setCompoundDrawablePadding(i);
    }
}
