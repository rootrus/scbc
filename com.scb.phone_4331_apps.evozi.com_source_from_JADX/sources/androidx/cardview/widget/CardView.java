package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.CheckCaptureModule_GetICheckDetectorFactory;
import p040o.MapConstraints;
import p040o.proxyGetICheckDetector;
import p040o.setBackgroundDrawable;
import p040o.setBackgroundDrawable$MediaBrowserCompat$ItemReceiver;
import p040o.setCustomSelectionActionModeCallback;
import p040o.setSupportBackgroundTintList;

public class CardView extends FrameLayout {
    private static final int[] MediaMetadataCompat = {16842801};
    private static final proxyGetICheckDetector RatingCompat;
    boolean IconCompatParcelizer;
    final Rect MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    private final CheckCaptureModule_GetICheckDetectorFactory MediaBrowserCompat$MediaItem;
    int MediaBrowserCompat$SearchResultReceiver;
    final Rect read;
    boolean write;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            RatingCompat = new setCustomSelectionActionModeCallback();
        } else if (Build.VERSION.SDK_INT >= 17) {
            RatingCompat = new setSupportBackgroundTintList();
        } else {
            RatingCompat = new MapConstraints.ConstrainedSetMultimap.write();
        }
        RatingCompat.write();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setBackgroundDrawable.write.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        this.read = new Rect();
        this.MediaBrowserCompat$CustomActionResultReceiver = new Rect();
        this.MediaBrowserCompat$MediaItem = new CheckCaptureModule_GetICheckDetectorFactory() {
            private Drawable MediaBrowserCompat$ItemReceiver;

            public final void IconCompatParcelizer(Drawable drawable) {
                this.MediaBrowserCompat$ItemReceiver = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
                return CardView.this.write;
            }

            public final boolean read() {
                return CardView.this.IconCompatParcelizer;
            }

            public final void read(int i, int i2, int i3, int i4) {
                CardView.this.MediaBrowserCompat$CustomActionResultReceiver.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.read.left, i2 + CardView.this.read.top, i3 + CardView.this.read.right, i4 + CardView.this.read.bottom);
            }

            public final void write(int i, int i2) {
                if (i > CardView.this.MediaBrowserCompat$SearchResultReceiver) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.MediaBrowserCompat$ItemReceiver) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            public final Drawable IconCompatParcelizer() {
                return this.MediaBrowserCompat$ItemReceiver;
            }

            public final View MediaBrowserCompat$ItemReceiver() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setBackgroundDrawable.IconCompatParcelizer.CardView, i, setBackgroundDrawable$MediaBrowserCompat$ItemReceiver.CardView);
        if (obtainStyledAttributes.hasValue(setBackgroundDrawable.IconCompatParcelizer.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(setBackgroundDrawable.IconCompatParcelizer.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(MediaMetadataCompat);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(setBackgroundDrawable.read.cardview_light_background);
            } else {
                i2 = getResources().getColor(setBackgroundDrawable.read.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(setBackgroundDrawable.IconCompatParcelizer.CardView_cardCornerRadius, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = obtainStyledAttributes.getDimension(setBackgroundDrawable.IconCompatParcelizer.CardView_cardElevation, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = obtainStyledAttributes.getDimension(setBackgroundDrawable.IconCompatParcelizer.CardView_cardMaxElevation, BitmapDescriptorFactory.HUE_RED);
        this.write = obtainStyledAttributes.getBoolean(setBackgroundDrawable.IconCompatParcelizer.CardView_cardUseCompatPadding, false);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(setBackgroundDrawable.IconCompatParcelizer.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_contentPadding, 0);
        this.read.left = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_contentPaddingLeft, dimensionPixelSize);
        this.read.top = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_contentPaddingTop, dimensionPixelSize);
        this.read.right = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_contentPaddingRight, dimensionPixelSize);
        this.read.bottom = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_android_minWidth, 0);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(setBackgroundDrawable.IconCompatParcelizer.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, context, colorStateList, dimension, dimension2, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.write != z) {
            this.write = z;
            RatingCompat.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.read.set(i, i2, i3, i4);
        RatingCompat.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$MediaItem);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(RatingCompat instanceof setCustomSelectionActionModeCallback)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) RatingCompat.read(this.MediaBrowserCompat$MediaItem)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, colorStateList);
    }

    public void setRadius(float f) {
        RatingCompat.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, f);
    }

    public void setCardElevation(float f) {
        RatingCompat.read(this.MediaBrowserCompat$MediaItem, f);
    }

    public void setMaxCardElevation(float f) {
        RatingCompat.write(this.MediaBrowserCompat$MediaItem, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.IconCompatParcelizer) {
            this.IconCompatParcelizer = z;
            RatingCompat.MediaDescriptionCompat(this.MediaBrowserCompat$MediaItem);
        }
    }
}
