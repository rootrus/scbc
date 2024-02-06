package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nElementCreate2;
import p040o.nElementGetNativeData;
import p040o.setIcon;
import p040o.setLastBaselineToBottomHeight;
import p040o.setStackedBackground;
import p040o.setTextOff;
import p040o.setTitleMarginBottom;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] read = {16842912};
    private static final int[] write = {-16842910};
    write MediaBrowserCompat$ItemReceiver;
    private final nElementGetNativeData MediaBrowserCompat$SearchResultReceiver;
    private final int MediaDescriptionCompat;
    private MenuInflater MediaMetadataCompat;
    private final nElementCreate2 RatingCompat;

    public interface write {
        boolean write(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        boolean z;
        int i2;
        this.MediaBrowserCompat$SearchResultReceiver = new nElementGetNativeData();
        this.RatingCompat = new nElementCreate2(context);
        AlertController$RecycleListView.MediaDescriptionCompat IconCompatParcelizer2 = AlertController$RecycleListView.read.IconCompatParcelizer(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.NavigationView, i, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_NavigationView, new int[0]);
        SwitchCompat.IconCompatParcelizer((View) this, IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_android_background));
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_elevation)) {
            SwitchCompat.IconCompatParcelizer((View) this, (float) IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_elevation, 0));
        }
        SwitchCompat.read((View) this, IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_android_fitsSystemWindows, false));
        this.MediaDescriptionCompat = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_android_maxWidth, 0);
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemIconTint)) {
            colorStateList = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemIconTint);
        } else {
            colorStateList = MediaBrowserCompat$ItemReceiver(16842808);
        }
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemTextAppearance)) {
            i2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemTextColor) ? IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemTextColor) : null;
        if (!z && MediaBrowserCompat$CustomActionResultReceiver == null) {
            MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver(16842806);
        }
        Drawable MediaBrowserCompat$ItemReceiver2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemBackground);
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemHorizontalPadding)) {
            int dimensionPixelSize = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemHorizontalPadding, 0);
            nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
            nelementgetnativedata.MediaBrowserCompat$MediaItem = dimensionPixelSize;
            nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                iconCompatParcelizer.IconCompatParcelizer.write();
            }
        }
        int dimensionPixelSize2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_itemIconPadding, 0);
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) new MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
            }

            public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
                return NavigationView.this.MediaBrowserCompat$ItemReceiver != null && NavigationView.this.MediaBrowserCompat$ItemReceiver.write(menuItem);
            }
        });
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = 1;
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(context, this.RatingCompat);
        nElementGetNativeData nelementgetnativedata2 = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata2.IconCompatParcelizer = colorStateList;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer2 = nelementgetnativedata2.read;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer2.IconCompatParcelizer.write();
        }
        if (z) {
            this.MediaBrowserCompat$SearchResultReceiver.read(i2);
        }
        nElementGetNativeData nelementgetnativedata3 = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata3.setHasDecor = MediaBrowserCompat$CustomActionResultReceiver;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer3 = nelementgetnativedata3.read;
        if (iconCompatParcelizer3 != null) {
            iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer3.IconCompatParcelizer.write();
        }
        nElementGetNativeData nelementgetnativedata4 = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata4.write = MediaBrowserCompat$ItemReceiver2;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer4 = nelementgetnativedata4.read;
        if (iconCompatParcelizer4 != null) {
            iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer4.IconCompatParcelizer.write();
        }
        nElementGetNativeData nelementgetnativedata5 = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata5.RatingCompat = dimensionPixelSize2;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer5 = nelementgetnativedata5.read;
        if (iconCompatParcelizer5 != null) {
            iconCompatParcelizer5.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer5.IconCompatParcelizer.write();
        }
        nElementCreate2 nelementcreate2 = this.RatingCompat;
        nElementGetNativeData nelementgetnativedata6 = this.MediaBrowserCompat$SearchResultReceiver;
        Context context2 = nelementcreate2.write;
        nelementcreate2.f2552x50fd9e4a.add(new WeakReference(nelementgetnativedata6));
        nelementgetnativedata6.IconCompatParcelizer(context2, nelementcreate2);
        nelementcreate2.MediaDescriptionCompat = true;
        nElementGetNativeData nelementgetnativedata7 = this.MediaBrowserCompat$SearchResultReceiver;
        if (nelementgetnativedata7.MediaMetadataCompat == null) {
            nelementgetnativedata7.MediaMetadataCompat = (NavigationMenuView) nelementgetnativedata7.MediaBrowserCompat$SearchResultReceiver.inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_navigation_menu, this, false);
            if (nelementgetnativedata7.read == null) {
                nelementgetnativedata7.read = new nElementGetNativeData.IconCompatParcelizer();
            }
            nelementgetnativedata7.MediaBrowserCompat$ItemReceiver = (LinearLayout) nelementgetnativedata7.MediaBrowserCompat$SearchResultReceiver.inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_navigation_item_header, nelementgetnativedata7.MediaMetadataCompat, false);
            nelementgetnativedata7.MediaMetadataCompat.setAdapter(nelementgetnativedata7.read);
        }
        addView(nelementgetnativedata7.MediaMetadataCompat);
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_menu)) {
            int resourceId = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_menu, 0);
            nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer6 = this.MediaBrowserCompat$SearchResultReceiver.read;
            if (iconCompatParcelizer6 != null) {
                iconCompatParcelizer6.read = true;
            }
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new setIcon(getContext());
            }
            this.MediaMetadataCompat.inflate(resourceId, this.RatingCompat);
            nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer7 = this.MediaBrowserCompat$SearchResultReceiver.read;
            if (iconCompatParcelizer7 != null) {
                iconCompatParcelizer7.read = false;
            }
            this.MediaBrowserCompat$SearchResultReceiver.write(false);
        }
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_headerLayout)) {
            int resourceId2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.NavigationView_headerLayout, 0);
            nElementGetNativeData nelementgetnativedata8 = this.MediaBrowserCompat$SearchResultReceiver;
            nelementgetnativedata8.MediaBrowserCompat$ItemReceiver.addView(nelementgetnativedata8.MediaBrowserCompat$SearchResultReceiver.inflate(resourceId2, nelementgetnativedata8.MediaBrowserCompat$ItemReceiver, false));
            NavigationMenuView navigationMenuView = nelementgetnativedata8.MediaMetadataCompat;
            navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        }
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.recycle();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(super.onSaveInstanceState());
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = new Bundle();
        this.RatingCompat.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        return iconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof IconCompatParcelizer)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) parcelable;
        super.onRestoreInstanceState(iconCompatParcelizer.write);
        nElementCreate2 nelementcreate2 = this.RatingCompat;
        SparseArray sparseParcelableArray = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !nelementcreate2.f2552x50fd9e4a.isEmpty()) {
            Iterator<WeakReference<setStackedBackground>> it = nelementcreate2.f2552x50fd9e4a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                setStackedBackground setstackedbackground = (setStackedBackground) next.get();
                if (setstackedbackground == null) {
                    nelementcreate2.f2552x50fd9e4a.remove(next);
                } else {
                    int i_ = setstackedbackground.mo795i_();
                    if (i_ > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(i_)) != null) {
                        setstackedbackground.MediaBrowserCompat$CustomActionResultReceiver(parcelable2);
                    }
                }
            }
        }
    }

    public void setNavigationItemSelectedListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.MediaDescriptionCompat), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.MediaDescriptionCompat, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setTextOff settextoff) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        int read2 = settextoff.read();
        if (nelementgetnativedata.f5545x50fd9e4a != read2) {
            nelementgetnativedata.f5545x50fd9e4a = read2;
            if (nelementgetnativedata.MediaBrowserCompat$ItemReceiver.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = nelementgetnativedata.MediaMetadataCompat;
                navigationMenuView.setPadding(0, nelementgetnativedata.f5545x50fd9e4a, 0, navigationMenuView.getPaddingBottom());
            }
        }
        SwitchCompat.IconCompatParcelizer((View) nelementgetnativedata.MediaBrowserCompat$ItemReceiver, settextoff);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.IconCompatParcelizer = colorStateList;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.setHasDecor = colorStateList;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(setLastBaselineToBottomHeight.write(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.write = drawable;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemHorizontalPadding(int i) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.MediaBrowserCompat$MediaItem = i;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemHorizontalPaddingResource(int i) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.MediaBrowserCompat$MediaItem = getResources().getDimensionPixelSize(i);
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemIconPadding(int i) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.RatingCompat = i;
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setItemIconPaddingResource(int i) {
        nElementGetNativeData nelementgetnativedata = this.MediaBrowserCompat$SearchResultReceiver;
        nelementgetnativedata.RatingCompat = getResources().getDimensionPixelSize(i);
        nElementGetNativeData.IconCompatParcelizer iconCompatParcelizer = nelementgetnativedata.read;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            iconCompatParcelizer.IconCompatParcelizer.write();
        }
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.RatingCompat.findItem(i);
        if (findItem != null) {
            this.MediaBrowserCompat$SearchResultReceiver.read.MediaBrowserCompat$ItemReceiver((androidx.appcompat.view.menu.MenuItemImpl) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.RatingCompat.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.MediaBrowserCompat$SearchResultReceiver.read.MediaBrowserCompat$ItemReceiver((androidx.appcompat.view.menu.MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setItemTextAppearance(int i) {
        this.MediaBrowserCompat$SearchResultReceiver.read(i);
    }

    private ColorStateList MediaBrowserCompat$ItemReceiver(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AlertController$RecycleListView.read.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = MediaBrowserCompat$CustomActionResultReceiver.getDefaultColor();
        return new ColorStateList(new int[][]{write, read, EMPTY_STATE_SET}, new int[]{MediaBrowserCompat$CustomActionResultReceiver.getColorForState(write, defaultColor), i2, defaultColor});
    }

    public static class IconCompatParcelizer extends setTitleMarginBottom {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<IconCompatParcelizer>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IconCompatParcelizer(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        public Bundle MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MediaBrowserCompat$ItemReceiver = parcel.readBundle(classLoader);
        }

        public IconCompatParcelizer(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
