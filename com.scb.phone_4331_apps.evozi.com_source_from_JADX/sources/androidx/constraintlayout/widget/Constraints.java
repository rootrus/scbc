package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.getSupportImageTintList;
import p040o.getSupportImageTintMode;

public class Constraints extends ViewGroup {
    getSupportImageTintMode MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public static class read extends ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver {
        public float ActionMenuPresenter$OverflowMenuButton;
        public float ActionMenuView;
        public float setExpandedActionViewsExclusive;
        public boolean setMenu;
        public float setMenuCallbacks;
        public float setOnMenuItemClickListener;
        public float setOverflowReserved;
        public float setOverlayMode;
        public float setShowingForActionMode;
        public float setUiOptions;
        public float setWindowCallback;
        public float setWindowTitle;

        public read() {
            super(-2, -2);
            this.setOverlayMode = 1.0f;
            this.setMenu = false;
            this.setShowingForActionMode = BitmapDescriptorFactory.HUE_RED;
            this.ActionMenuPresenter$OverflowMenuButton = BitmapDescriptorFactory.HUE_RED;
            this.setWindowTitle = BitmapDescriptorFactory.HUE_RED;
            this.ActionMenuView = BitmapDescriptorFactory.HUE_RED;
            this.setUiOptions = 1.0f;
            this.setWindowCallback = 1.0f;
            this.setMenuCallbacks = BitmapDescriptorFactory.HUE_RED;
            this.setOnMenuItemClickListener = BitmapDescriptorFactory.HUE_RED;
            this.setExpandedActionViewsExclusive = BitmapDescriptorFactory.HUE_RED;
            this.setOverflowReserved = BitmapDescriptorFactory.HUE_RED;
        }

        public read(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setOverlayMode = 1.0f;
            this.setMenu = false;
            this.setShowingForActionMode = BitmapDescriptorFactory.HUE_RED;
            this.ActionMenuPresenter$OverflowMenuButton = BitmapDescriptorFactory.HUE_RED;
            this.setWindowTitle = BitmapDescriptorFactory.HUE_RED;
            this.ActionMenuView = BitmapDescriptorFactory.HUE_RED;
            this.setUiOptions = 1.0f;
            this.setWindowCallback = 1.0f;
            this.setMenuCallbacks = BitmapDescriptorFactory.HUE_RED;
            this.setOnMenuItemClickListener = BitmapDescriptorFactory.HUE_RED;
            this.setExpandedActionViewsExclusive = BitmapDescriptorFactory.HUE_RED;
            this.setOverflowReserved = BitmapDescriptorFactory.HUE_RED;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_alpha) {
                    this.setOverlayMode = obtainStyledAttributes.getFloat(index, this.setOverlayMode);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_elevation) {
                    this.setShowingForActionMode = obtainStyledAttributes.getFloat(index, this.setShowingForActionMode);
                    this.setMenu = true;
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotationX) {
                    this.setWindowTitle = obtainStyledAttributes.getFloat(index, this.setWindowTitle);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotationY) {
                    this.ActionMenuView = obtainStyledAttributes.getFloat(index, this.ActionMenuView);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotation) {
                    this.ActionMenuPresenter$OverflowMenuButton = obtainStyledAttributes.getFloat(index, this.ActionMenuPresenter$OverflowMenuButton);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_scaleX) {
                    this.setUiOptions = obtainStyledAttributes.getFloat(index, this.setUiOptions);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_scaleY) {
                    this.setWindowCallback = obtainStyledAttributes.getFloat(index, this.setWindowCallback);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_transformPivotX) {
                    this.setMenuCallbacks = obtainStyledAttributes.getFloat(index, this.setMenuCallbacks);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_transformPivotY) {
                    this.setOnMenuItemClickListener = obtainStyledAttributes.getFloat(index, this.setOnMenuItemClickListener);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationX) {
                    this.setExpandedActionViewsExclusive = obtainStyledAttributes.getFloat(index, this.setExpandedActionViewsExclusive);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationY) {
                    this.setOverflowReserved = obtainStyledAttributes.getFloat(index, this.setOverflowReserved);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationZ) {
                    this.setExpandedActionViewsExclusive = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new read();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new read(getContext(), attributeSet);
    }
}
