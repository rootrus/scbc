package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$ItemReceiver;
import androidx.lifecycle.ReportFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.ActionBarOverlayLayout;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatCheckBox;
import p040o.C1390x230a8146;
import p040o.FragmentBuilder_BindNdidSelectIdpSuccessFragment;
import p040o.Iterables;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nClosureSetGlobal;
import p040o.nContextSetPriority;
import p040o.nDeviceDestroy;
import p040o.nIncAllocationCreateTyped;
import p040o.nIncLoadSO;
import p040o.setBaselineAligned;
import p040o.setContentInsetsRelative;
import p040o.setHideOnContentScrollEnabled;
import p040o.setShowText;

@CoordinatorLayout$MediaBrowserCompat$ItemReceiver(write = Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements setShowText, setContentInsetsRelative, ReportFragment.write {
    public nContextSetPriority IconCompatParcelizer;
    private final Rect Keep;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    final Rect MediaBrowserCompat$ItemReceiver;
    private PorterDuff.Mode MediaBrowserCompat$MediaItem;
    private ColorStateList MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private ColorStateList f48x50fd9e4a;
    private int MediaDescriptionCompat;
    private final setHideOnContentScrollEnabled MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private PorterDuff.Mode MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private ColorStateList PlaybackStateCompat;
    int RatingCompat;
    int read;
    public final FragmentBuilder_BindNdidSelectIdpSuccessFragment write;

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nClosureSetGlobal nclosuresetglobal;
        int resourceId;
        int resourceId2;
        this.MediaBrowserCompat$ItemReceiver = new Rect();
        this.Keep = new Rect();
        TypedArray MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton, i, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_FloatingActionButton, new int[0]);
        this.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver2, nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_backgroundTint);
        this.MediaBrowserCompat$MediaItem = Iterables.C35273.read.read(MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_backgroundTintMode, -1));
        this.PlaybackStateCompat = AlertController$RecycleListView.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver2, nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_rippleColor);
        this.RatingCompat = MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_fabSize, -1);
        this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_fabCustomSize, 0);
        this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_borderWidth, 0);
        float dimension = MediaBrowserCompat$ItemReceiver2.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_elevation, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = MediaBrowserCompat$ItemReceiver2.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_hoveredFocusedTranslationZ, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = MediaBrowserCompat$ItemReceiver2.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_pressedTranslationZ, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_useCompatPadding, false);
        this.ParcelableVolumeInfo = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_maxImageSize, 0);
        int i2 = nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_showMotionSpec;
        nClosureSetGlobal nclosuresetglobal2 = null;
        if (!MediaBrowserCompat$ItemReceiver2.hasValue(i2) || (resourceId2 = MediaBrowserCompat$ItemReceiver2.getResourceId(i2, 0)) == 0) {
            nclosuresetglobal = null;
        } else {
            nclosuresetglobal = nClosureSetGlobal.read(context, resourceId2);
        }
        int i3 = nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_hideMotionSpec;
        if (MediaBrowserCompat$ItemReceiver2.hasValue(i3) && (resourceId = MediaBrowserCompat$ItemReceiver2.getResourceId(i3, 0)) != 0) {
            nclosuresetglobal2 = nClosureSetGlobal.read(context, resourceId);
        }
        MediaBrowserCompat$ItemReceiver2.recycle();
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(this);
        this.MediaSessionCompat$QueueItem = sethideoncontentscrollenabled;
        sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver(attributeSet, i);
        this.write = new FragmentBuilder_BindNdidSelectIdpSuccessFragment(this);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.write(this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem, this.PlaybackStateCompat, this.MediaDescriptionCompat);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.MediaSessionCompat$QueueItem != dimension) {
            ncontextsetpriority.MediaSessionCompat$QueueItem = dimension;
            ncontextsetpriority.write(dimension, ncontextsetpriority.setHasDecor, ncontextsetpriority.PlaybackStateCompat);
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority2 = this.IconCompatParcelizer;
        if (ncontextsetpriority2.setHasDecor != dimension2) {
            ncontextsetpriority2.setHasDecor = dimension2;
            ncontextsetpriority2.write(ncontextsetpriority2.MediaSessionCompat$QueueItem, dimension2, ncontextsetpriority2.PlaybackStateCompat);
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority3 = this.IconCompatParcelizer;
        if (ncontextsetpriority3.PlaybackStateCompat != dimension3) {
            ncontextsetpriority3.PlaybackStateCompat = dimension3;
            ncontextsetpriority3.write(ncontextsetpriority3.MediaSessionCompat$QueueItem, ncontextsetpriority3.setHasDecor, dimension3);
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority4 = this.IconCompatParcelizer;
        int i4 = this.ParcelableVolumeInfo;
        if (ncontextsetpriority4.PlaybackStateCompat$CustomAction != i4) {
            ncontextsetpriority4.PlaybackStateCompat$CustomAction = i4;
            float f = ncontextsetpriority4.AlertController$RecycleListView;
            ncontextsetpriority4.AlertController$RecycleListView = f;
            Matrix matrix = ncontextsetpriority4.setExpandedFormat;
            ncontextsetpriority4.write(f, matrix);
            ncontextsetpriority4.ActionMenuItemView.setImageMatrix(matrix);
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.setChecked = nclosuresetglobal;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.f2608x50fd9e4a = nclosuresetglobal2;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.PlaybackStateCompat != colorStateList) {
            this.PlaybackStateCompat = colorStateList;
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = write();
            }
            this.IconCompatParcelizer.IconCompatParcelizer(this.PlaybackStateCompat);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.MediaBrowserCompat$SearchResultReceiver != colorStateList) {
            this.MediaBrowserCompat$SearchResultReceiver = colorStateList;
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = write();
            }
            nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
            Drawable drawable = ncontextsetpriority.setContentView;
            if (drawable != null) {
                setBaselineAligned.read(drawable, colorStateList);
            }
            nIncAllocationCreateTyped nincallocationcreatetyped = ncontextsetpriority.MediaBrowserCompat$MediaItem;
            if (nincallocationcreatetyped != null) {
                nincallocationcreatetyped.MediaBrowserCompat$ItemReceiver(colorStateList);
            }
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.MediaBrowserCompat$MediaItem != mode) {
            this.MediaBrowserCompat$MediaItem = mode;
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = write();
            }
            Drawable drawable = this.IconCompatParcelizer.setContentView;
            if (drawable != null) {
                setBaselineAligned.IconCompatParcelizer(drawable, mode);
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f48x50fd9e4a != colorStateList) {
            this.f48x50fd9e4a = colorStateList;
            read();
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f48x50fd9e4a;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.MediaSessionCompat$Token != mode) {
            this.MediaSessionCompat$Token = mode;
            read();
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.MediaSessionCompat$Token;
    }

    private void read() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f48x50fd9e4a;
            if (colorStateList == null) {
                setBaselineAligned.IconCompatParcelizer(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.MediaSessionCompat$Token;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(colorForState, mode));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int i) {
        this.MediaSessionCompat$QueueItem.IconCompatParcelizer(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        float f = ncontextsetpriority.AlertController$RecycleListView;
        ncontextsetpriority.AlertController$RecycleListView = f;
        Matrix matrix = ncontextsetpriority.setExpandedFormat;
        ncontextsetpriority.write(f, matrix);
        ncontextsetpriority.ActionMenuItemView.setImageMatrix(matrix);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write.write;
    }

    public void setExpandedComponentIdHint(int i) {
        this.write.IconCompatParcelizer = i;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = write();
            }
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void setSize(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = 0;
        if (i != this.RatingCompat) {
            this.RatingCompat = i;
            requestLayout();
        }
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.MediaSessionCompat$ResultReceiverWrapper = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return MediaBrowserCompat$CustomActionResultReceiver(1);
        } else {
            return MediaBrowserCompat$CustomActionResultReceiver(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.MediaBrowserCompat$MediaItem()) {
            if (ncontextsetpriority.Keep == null) {
                ncontextsetpriority.Keep = ncontextsetpriority;
            }
            ncontextsetpriority.ActionMenuItemView.getViewTreeObserver().addOnPreDrawListener(ncontextsetpriority.Keep);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.Keep != null) {
            ncontextsetpriority.ActionMenuItemView.getViewTreeObserver().removeOnPreDrawListener(ncontextsetpriority.Keep);
            ncontextsetpriority.Keep = null;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.IconCompatParcelizer(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.write();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        nIncLoadSO nincloadso = new nIncLoadSO(super.onSaveInstanceState());
        AppCompatCheckBox<String, Bundle> appCompatCheckBox = nincloadso.read;
        FragmentBuilder_BindNdidSelectIdpSuccessFragment fragmentBuilder_BindNdidSelectIdpSuccessFragment = this.write;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", fragmentBuilder_BindNdidSelectIdpSuccessFragment.write);
        bundle.putInt("expandedComponentIdHint", fragmentBuilder_BindNdidSelectIdpSuccessFragment.IconCompatParcelizer);
        appCompatCheckBox.put("expandableWidgetHelper", bundle);
        return nincloadso;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nIncLoadSO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nIncLoadSO nincloadso = (nIncLoadSO) parcelable;
        super.onRestoreInstanceState(nincloadso.write);
        FragmentBuilder_BindNdidSelectIdpSuccessFragment fragmentBuilder_BindNdidSelectIdpSuccessFragment = this.write;
        Bundle bundle = nincloadso.read.get("expandableWidgetHelper");
        fragmentBuilder_BindNdidSelectIdpSuccessFragment.write = bundle.getBoolean("expanded", false);
        fragmentBuilder_BindNdidSelectIdpSuccessFragment.IconCompatParcelizer = bundle.getInt("expandedComponentIdHint", 0);
        if (fragmentBuilder_BindNdidSelectIdpSuccessFragment.write) {
            ViewParent parent = fragmentBuilder_BindNdidSelectIdpSuccessFragment.MediaBrowserCompat$ItemReceiver.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).read(fragmentBuilder_BindNdidSelectIdpSuccessFragment.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final void write(Rect rect) {
        rect.left += this.MediaBrowserCompat$ItemReceiver.left;
        rect.top += this.MediaBrowserCompat$ItemReceiver.top;
        rect.right -= this.MediaBrowserCompat$ItemReceiver.right;
        rect.bottom -= this.MediaBrowserCompat$ItemReceiver.bottom;
    }

    private static int read(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.Keep;
            if (SwitchCompat.setCheckable(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                write(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !this.Keep.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(CoordinatorLayout.read read) {
            super.IconCompatParcelizer(read);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.IconCompatParcelizer(coordinatorLayout, floatingActionButton, i);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.write(coordinatorLayout, floatingActionButton, rect);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.MediaBrowserCompat$ItemReceiver(coordinatorLayout, floatingActionButton, view);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<T> {
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private Rect MediaBrowserCompat$ItemReceiver;

        public BaseBehavior() {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_Behavior_Layout);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public void IconCompatParcelizer(CoordinatorLayout.read read) {
            if (read.read == 0) {
                read.read = 80;
            }
        }

        public boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            boolean z;
            if (view instanceof AppBarLayout) {
                MediaBrowserCompat$ItemReceiver(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.read) {
                    z = ((CoordinatorLayout.read) layoutParams).MediaDescriptionCompat instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    write(view, floatingActionButton);
                }
            }
            return false;
        }

        private boolean IconCompatParcelizer(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.read read = (CoordinatorLayout.read) floatingActionButton.getLayoutParams();
            if (this.MediaBrowserCompat$CustomActionResultReceiver && read.MediaMetadataCompat == view.getId() && floatingActionButton.MediaMetadataCompat == 0) {
                return true;
            }
            return false;
        }

        private boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!IconCompatParcelizer(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$ItemReceiver = new Rect();
            }
            Rect rect = this.MediaBrowserCompat$ItemReceiver;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            Iterables.C35273.write.read((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.IconCompatParcelizer()) {
                floatingActionButton.read((C0165x4634a05b) null);
                return true;
            }
            floatingActionButton.IconCompatParcelizer((C0165x4634a05b) null, false);
            return true;
        }

        private boolean write(View view, FloatingActionButton floatingActionButton) {
            if (!IconCompatParcelizer(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.read) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.read((C0165x4634a05b) null);
                return true;
            }
            if (floatingActionButton.IconCompatParcelizer == null) {
                floatingActionButton.IconCompatParcelizer = floatingActionButton.write();
            }
            floatingActionButton.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, false);
            return true;
        }

        /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            boolean z;
            List<View> write = coordinatorLayout.write((View) floatingActionButton);
            int size = write.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = write.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.read) {
                        z = ((CoordinatorLayout.read) layoutParams).MediaDescriptionCompat instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && write(view, floatingActionButton)) {
                        break;
                    }
                } else if (MediaBrowserCompat$ItemReceiver(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.MediaBrowserCompat$ItemReceiver((View) floatingActionButton, i);
            Rect rect = floatingActionButton.MediaBrowserCompat$ItemReceiver;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.read read = (CoordinatorLayout.read) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - read.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= read.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - read.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= read.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((View) floatingActionButton, i2);
            return true;
        }

        /* renamed from: MediaBrowserCompat$ItemReceiver */
        public boolean write(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.MediaBrowserCompat$ItemReceiver;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(nClosureSetGlobal.read(getContext(), i));
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(nClosureSetGlobal.read(getContext(), i));
    }

    public final nContextSetPriority write() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new nDeviceDestroy(this, new FloatingActionButton$MediaBrowserCompat$ItemReceiver(this));
        }
        return new nContextSetPriority(this, new FloatingActionButton$MediaBrowserCompat$ItemReceiver(this));
    }

    /* access modifiers changed from: package-private */
    public final void read(C0165x4634a05b floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        boolean z = true;
        if (!(ncontextsetpriority.ActionMenuItemView.getVisibility() != 0 ? ncontextsetpriority.MediaBrowserCompat$SearchResultReceiver != 2 : ncontextsetpriority.MediaBrowserCompat$SearchResultReceiver == 1)) {
            Animator animator = ncontextsetpriority.MediaSessionCompat$ResultReceiverWrapper;
            if (animator != null) {
                animator.cancel();
            }
            if (!SwitchCompat.setCheckable(ncontextsetpriority.ActionMenuItemView) || ncontextsetpriority.ActionMenuItemView.isInEditMode()) {
                z = false;
            }
            if (z) {
                nClosureSetGlobal nclosuresetglobal = ncontextsetpriority.f2608x50fd9e4a;
                if (nclosuresetglobal == null) {
                    if (ncontextsetpriority.ParcelableVolumeInfo == null) {
                        ncontextsetpriority.ParcelableVolumeInfo = nClosureSetGlobal.read(ncontextsetpriority.ActionMenuItemView.getContext(), C1390x230a8146.design_fab_hide_motion_spec);
                    }
                    nclosuresetglobal = ncontextsetpriority.ParcelableVolumeInfo;
                }
                AnimatorSet read2 = ncontextsetpriority.read(nclosuresetglobal, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                read2.addListener(new AnimatorListenerAdapter(false, (nContextSetPriority.IconCompatParcelizer) null) {
                    private boolean MediaBrowserCompat$CustomActionResultReceiver;
                    private /* synthetic */ boolean write = false;

                    public final void onAnimationStart(Animator animator) {
                        nContextSetPriority.this.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(0, this.write);
                        nContextSetPriority.this.MediaBrowserCompat$SearchResultReceiver = 1;
                        nContextSetPriority.this.MediaSessionCompat$ResultReceiverWrapper = animator;
                        this.MediaBrowserCompat$CustomActionResultReceiver = false;
                    }

                    public final void onAnimationCancel(Animator animator) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        nContextSetPriority.this.MediaBrowserCompat$SearchResultReceiver = 0;
                        nContextSetPriority.this.MediaSessionCompat$ResultReceiverWrapper = null;
                        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                            nContextSetPriority.this.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(this.write ? 8 : 4, this.write);
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = ncontextsetpriority.MediaSessionCompat$Token;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        read2.addListener(it.next());
                    }
                }
                read2.start();
                return;
            }
            ncontextsetpriority.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(4, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
        this.read = (MediaBrowserCompat$CustomActionResultReceiver2 - this.ParcelableVolumeInfo) / 2;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.RatingCompat();
        int min = Math.min(read(MediaBrowserCompat$CustomActionResultReceiver2, i), read(MediaBrowserCompat$CustomActionResultReceiver2, i2));
        setMeasuredDimension(this.MediaBrowserCompat$ItemReceiver.left + min + this.MediaBrowserCompat$ItemReceiver.right, min + this.MediaBrowserCompat$ItemReceiver.top + this.MediaBrowserCompat$ItemReceiver.bottom);
    }

    public void setCompatElevation(float f) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.MediaSessionCompat$QueueItem != f) {
            ncontextsetpriority.MediaSessionCompat$QueueItem = f;
            ncontextsetpriority.write(f, ncontextsetpriority.setHasDecor, ncontextsetpriority.PlaybackStateCompat);
        }
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.setHasDecor != f) {
            ncontextsetpriority.setHasDecor = f;
            ncontextsetpriority.write(ncontextsetpriority.MediaSessionCompat$QueueItem, f, ncontextsetpriority.PlaybackStateCompat);
        }
    }

    public void setCompatPressedTranslationZ(float f) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        nContextSetPriority ncontextsetpriority = this.IconCompatParcelizer;
        if (ncontextsetpriority.PlaybackStateCompat != f) {
            ncontextsetpriority.PlaybackStateCompat = f;
            ncontextsetpriority.write(ncontextsetpriority.MediaSessionCompat$QueueItem, ncontextsetpriority.setHasDecor, f);
        }
    }

    public void setHideMotionSpec(nClosureSetGlobal nclosuresetglobal) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.f2608x50fd9e4a = nclosuresetglobal;
    }

    public void setShowMotionSpec(nClosureSetGlobal nclosuresetglobal) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.setChecked = nclosuresetglobal;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(C0165x4634a05b floatingActionButton$MediaBrowserCompat$CustomActionResultReceiver, boolean z) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = write();
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((nContextSetPriority.IconCompatParcelizer) null, false);
    }
}
