package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p040o.ExtractorResponse;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem;
import p040o.nIncElementCreate;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] MediaBrowserCompat$MediaItem = {nAllocationSetSurface.read.snackbarButtonStyle};
    private final AccessibilityManager MediaMetadataCompat;
    private boolean RatingCompat;

    private Snackbar(ViewGroup viewGroup, View view, ExtractorResponse extractorResponse) {
        super(viewGroup, view, extractorResponse);
        this.MediaMetadataCompat = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final void RatingCompat() {
        super.RatingCompat();
    }

    public final void read() {
        super.read();
    }

    public static Snackbar IconCompatParcelizer(View view, CharSequence charSequence, int i) {
        ViewGroup IconCompatParcelizer = IconCompatParcelizer(view);
        if (IconCompatParcelizer != null) {
            LayoutInflater from = LayoutInflater.from(IconCompatParcelizer.getContext());
            TypedArray obtainStyledAttributes = IconCompatParcelizer.getContext().obtainStyledAttributes(MediaBrowserCompat$MediaItem);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(resourceId != -1 ? nAllocationSetSurface$MediaBrowserCompat$MediaItem.mtrl_layout_snackbar_include : nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_layout_snackbar_include, IconCompatParcelizer, false);
            Snackbar snackbar = new Snackbar(IconCompatParcelizer, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.MediaBrowserCompat$SearchResultReceiver.getChildAt(0)).write.setText(charSequence);
            snackbar.read(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public static Snackbar MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        return IconCompatParcelizer(view, view.getResources().getText(i), -2);
    }

    private static ViewGroup IconCompatParcelizer(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public final Snackbar IconCompatParcelizer(int i, final View.OnClickListener onClickListener) {
        CharSequence text = MediaBrowserCompat$CustomActionResultReceiver().getText(i);
        Button button = ((SnackbarContentLayout) this.MediaBrowserCompat$SearchResultReceiver.getChildAt(0)).IconCompatParcelizer;
        if (!TextUtils.isEmpty(text)) {
            this.RatingCompat = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    Snackbar snackbar = Snackbar.this;
                    if (nIncElementCreate.read == null) {
                        nIncElementCreate.read = new nIncElementCreate();
                    }
                    nIncElementCreate.read.MediaBrowserCompat$ItemReceiver(snackbar.write, 1);
                }
            });
        } else {
            button.setVisibility(8);
            button.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = false;
        }
        return this;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        if (!this.RatingCompat || !this.MediaMetadataCompat.isTouchExplorationEnabled()) {
            return super.MediaBrowserCompat$ItemReceiver();
        }
        return -2;
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
}
