package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Locale;
import p040o.C6555xdccae8ee;
import p040o.C9747xb09413ad;
import p040o.CropDocumentActivity_ViewBinding;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.FontIconDrawableTextView */
public class FontIconDrawableTextView implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {
    float IconCompatParcelizer;
    float MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private ColorStateList MediaBrowserCompat$MediaItem;
    private ColorStateList MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Typeface f3120x50fd9e4a;
    public WeakReference<TextView> MediaDescriptionCompat;
    public Drawable MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper = true;
    private int MediaSessionCompat$Token;
    private String ParcelableVolumeInfo;
    ViewTreeObserver.OnGlobalLayoutListener RatingCompat = this;
    public String read;
    public Drawable write;

    FontIconDrawableTextView(TextView textView) {
        this.MediaDescriptionCompat = new WeakReference<>(textView);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final FontIconDrawableTextView MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9747xb09413ad.thFontIconDrawableTextView, 0, 0);
        try {
            this.MediaSessionCompat$ResultReceiverWrapper = obtainStyledAttributes.getBoolean(C9747xb09413ad.thFontIconDrawableTextView_thEditTextTypeface, true);
            this.ParcelableVolumeInfo = obtainStyledAttributes.getString(C9747xb09413ad.thFontIconDrawableTextView_thTTFFontFamily);
            this.read = obtainStyledAttributes.getString(C9747xb09413ad.thFontIconDrawableTextView_thDrawableLeftFontIcon);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getString(C9747xb09413ad.thFontIconDrawableTextView_thDrawableRightFontIcon);
            this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getColor(C9747xb09413ad.thFontIconDrawableTextView_thDrawableLeftFontIconColor, -16777216);
            this.MediaSessionCompat$Token = obtainStyledAttributes.getColor(C9747xb09413ad.thFontIconDrawableTextView_thDrawableRightFontIconColor, -16777216);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getFloat(C9747xb09413ad.thFontIconDrawableTextView_thDrawableLeftScaleFactor, 1.0f);
            this.IconCompatParcelizer = obtainStyledAttributes.getFloat(C9747xb09413ad.thFontIconDrawableTextView_thDrawableRightScaleFactor, 1.0f);
            this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getColorStateList(C9747xb09413ad.thFontIconDrawableTextView_thDrawableLeftFontIconColor);
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getColorStateList(C9747xb09413ad.thFontIconDrawableTextView_thDrawableRightFontIconColor);
            obtainStyledAttributes.recycle();
            float f = this.IconCompatParcelizer;
            if (f <= BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
                throw new ScaleFactorOutOfRangeException(this.IconCompatParcelizer);
            }
            float f2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (f2 <= BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
                throw new ScaleFactorOutOfRangeException(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            ColorStateList colorStateList = this.MediaBrowserCompat$SearchResultReceiver;
            if (colorStateList != null) {
                this.MediaSessionCompat$QueueItem = colorStateList.getDefaultColor();
            }
            ColorStateList colorStateList2 = this.MediaBrowserCompat$MediaItem;
            if (colorStateList2 != null) {
                this.MediaSessionCompat$Token = colorStateList2.getDefaultColor();
            }
            return this;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(Context context) {
        if (this.ParcelableVolumeInfo == null) {
            this.ParcelableVolumeInfo = context.getApplicationContext().getResources().getString(C6555xdccae8ee.th_fontello_ttf_file);
        }
        this.f3120x50fd9e4a = Typeface.createFromAsset(context.getAssets(), this.ParcelableVolumeInfo);
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaDescriptionCompat.get().setTypeface(this.f3120x50fd9e4a);
        }
        if (this.MediaBrowserCompat$ItemReceiver != null || this.read != null) {
            String str = this.read;
            if (str != null) {
                this.write = MediaBrowserCompat$CustomActionResultReceiver(str, this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$QueueItem, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                this.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver(str2, this.MediaBrowserCompat$MediaItem, this.MediaSessionCompat$Token, this.IconCompatParcelizer);
            }
            this.MediaDescriptionCompat.get().setCompoundDrawables(this.write, (Drawable) null, this.MediaMetadataCompat, (Drawable) null);
            this.MediaDescriptionCompat.get().getViewTreeObserver().addOnGlobalLayoutListener(this.RatingCompat);
        }
    }

    private Drawable MediaBrowserCompat$CustomActionResultReceiver(String str, ColorStateList colorStateList, int i, float f) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver = new FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver(this, str, this.f3120x50fd9e4a, f);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.write.setColor(i);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.invalidateSelf();
            return fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        for (int[] iArr : MediaBrowserCompat$CustomActionResultReceiver(colorStateList)) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2 = new FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver(this, str, this.f3120x50fd9e4a, f);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.write.setColor(colorForState);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.invalidateSelf();
            stateListDrawable.addState(iArr, fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2);
        }
        return stateListDrawable;
    }

    private static int[][] MediaBrowserCompat$CustomActionResultReceiver(ColorStateList colorStateList) {
        int[][] iArr = {new int[0]};
        try {
            Field declaredField = Class.forName("android.content.res.ColorStateList").getDeclaredField("mStateSpecs");
            if (declaredField == null) {
                return iArr;
            }
            declaredField.setAccessible(true);
            return (int[][]) declaredField.get(colorStateList);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            MyECouponActivity_ViewBinding.write("Disaster, mStateSpecs not Found!");
            return iArr;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, String str, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            f = cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT ? this.MediaBrowserCompat$CustomActionResultReceiver : this.IconCompatParcelizer;
        }
        if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT) {
            this.read = str;
            Drawable drawable = this.write;
            if (drawable == null || (drawable instanceof StateListDrawable) || this.MediaBrowserCompat$CustomActionResultReceiver != f) {
                this.MediaBrowserCompat$CustomActionResultReceiver = f;
                this.write = MediaBrowserCompat$CustomActionResultReceiver(this.read, this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$QueueItem, f);
                this.MediaDescriptionCompat.get().setCompoundDrawables(this.write, (Drawable) null, this.MediaMetadataCompat, (Drawable) null);
                return;
            }
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) drawable;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = str;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.invalidateSelf();
        } else if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.RIGHT) {
            this.MediaBrowserCompat$ItemReceiver = str;
            Drawable drawable2 = this.MediaMetadataCompat;
            if (drawable2 == null || (drawable2 instanceof StateListDrawable) || this.IconCompatParcelizer != f) {
                this.IconCompatParcelizer = f;
                this.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem, this.MediaSessionCompat$Token, f);
                this.MediaDescriptionCompat.get().setCompoundDrawables(this.write, (Drawable) null, this.MediaMetadataCompat, (Drawable) null);
                return;
            }
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2 = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) drawable2;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = str;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.invalidateSelf();
        }
    }

    public final void read(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT) {
            this.MediaSessionCompat$QueueItem = i;
            Drawable drawable = this.write;
            if (drawable == null) {
                return;
            }
            if (drawable instanceof StateListDrawable) {
                IconCompatParcelizer((StateListDrawable) drawable, i);
                return;
            }
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) drawable;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.write.setColor(i);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.invalidateSelf();
        } else if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.RIGHT) {
            this.MediaSessionCompat$Token = i;
            Drawable drawable2 = this.MediaMetadataCompat;
            if (drawable2 == null) {
                return;
            }
            if (drawable2 instanceof StateListDrawable) {
                IconCompatParcelizer((StateListDrawable) drawable2, i);
                return;
            }
            FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2 = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) drawable2;
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.write.setColor(i);
            fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.invalidateSelf();
        }
    }

    private static void IconCompatParcelizer(StateListDrawable stateListDrawable, int i) {
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) stateListDrawable.getConstantState();
        if (drawableContainerState == null) {
            Drawable current = stateListDrawable.getCurrent();
            if (current instanceof FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) {
                FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) current;
                fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.write.setColor(i);
                fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.invalidateSelf();
                return;
            }
            return;
        }
        Drawable[] children = drawableContainerState.getChildren();
        for (int i2 = 0; i2 < drawableContainerState.getChildCount(); i2++) {
            if (children[i2] instanceof FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) {
                FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2 = (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver) children[i2];
                fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.write.setColor(i);
                fontIconDrawableTextView$MediaBrowserCompat$ItemReceiver2.invalidateSelf();
            }
        }
    }

    public final int read(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding) {
        if (this.MediaDescriptionCompat.get().getMeasuredHeight() <= 0 && (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.RIGHT || cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT)) {
            return StrictMath.round(((float) this.MediaDescriptionCompat.get().getLineHeight()) / 0.5f);
        }
        if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT && this.write != null) {
            return this.MediaDescriptionCompat.get().getCompoundPaddingStart();
        }
        if (cropDocumentActivity_ViewBinding != CropDocumentActivity_ViewBinding.RIGHT || this.MediaMetadataCompat == null) {
            return this.MediaDescriptionCompat.get().getLineHeight();
        }
        return this.MediaDescriptionCompat.get().getCompoundPaddingEnd();
    }

    /* renamed from: com.thunderhead.android.infrastructure.ui.views.FontIconDrawableTextView$ScaleFactorOutOfRangeException */
    public static class ScaleFactorOutOfRangeException extends RuntimeException {
        public ScaleFactorOutOfRangeException(float f) {
            super(String.format(Locale.getDefault(), "Scale factor out of range [0, 1.0), minimum value > 0.0, maximum value 1.0, found: %.2f", new Object[]{Float.valueOf(f)}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0093, code lost:
        if (java.lang.StrictMath.round(r0) != 0) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<android.widget.TextView> r0 = r8.MediaDescriptionCompat
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.widget.TextView> r0 = r8.MediaDescriptionCompat
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r8)
            java.lang.ref.WeakReference<android.widget.TextView> r0 = r8.MediaDescriptionCompat
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getMeasuredHeight()
            java.lang.String r1 = r8.read
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r1 = r8.write
            int r1 = r1.getIntrinsicWidth()
            int r1 = r1 * r0
            android.graphics.drawable.Drawable r4 = r8.write
            int r4 = r4.getIntrinsicHeight()
            int r1 = r1 / r4
            float r1 = (float) r1
            float r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r1 = r1 * r4
            float r5 = (float) r0
            android.graphics.drawable.Drawable r6 = r8.write
            int r7 = java.lang.StrictMath.round(r1)
            float r4 = r4 * r5
            int r4 = java.lang.StrictMath.round(r4)
            r6.setBounds(r3, r3, r7, r4)
            android.graphics.drawable.Drawable r4 = r8.write
            r4.invalidateSelf()
            int r1 = java.lang.StrictMath.round(r1)
            if (r1 == 0) goto L_0x005c
            int r1 = java.lang.StrictMath.round(r5)
            if (r1 != 0) goto L_0x005e
        L_0x005c:
            r1 = r2
            goto L_0x005f
        L_0x005e:
            r1 = r3
        L_0x005f:
            java.lang.String r4 = r8.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x0096
            android.graphics.drawable.Drawable r4 = r8.MediaMetadataCompat
            int r4 = r4.getIntrinsicWidth()
            int r4 = r4 * r0
            android.graphics.drawable.Drawable r5 = r8.MediaMetadataCompat
            int r5 = r5.getIntrinsicHeight()
            int r4 = r4 / r5
            float r4 = (float) r4
            float r5 = r8.IconCompatParcelizer
            float r4 = r4 * r5
            float r0 = (float) r0
            android.graphics.drawable.Drawable r6 = r8.MediaMetadataCompat
            int r7 = java.lang.StrictMath.round(r4)
            float r5 = r5 * r0
            int r5 = java.lang.StrictMath.round(r5)
            r6.setBounds(r3, r3, r7, r5)
            android.graphics.drawable.Drawable r3 = r8.MediaMetadataCompat
            r3.invalidateSelf()
            int r3 = java.lang.StrictMath.round(r4)
            if (r3 == 0) goto L_0x0097
            int r0 = java.lang.StrictMath.round(r0)
            if (r0 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r2 = r1
        L_0x0097:
            java.lang.ref.WeakReference<android.widget.TextView> r0 = r8.MediaDescriptionCompat
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.graphics.drawable.Drawable r1 = r8.write
            android.graphics.drawable.Drawable r3 = r8.MediaMetadataCompat
            r4 = 0
            r0.setCompoundDrawables(r1, r4, r3, r4)
            if (r2 == 0) goto L_0x00b3
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1 = 100
            r0.postDelayed(r8, r1)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.android.infrastructure.p057ui.views.FontIconDrawableTextView.onGlobalLayout():void");
    }

    public void run() {
        if (this.MediaDescriptionCompat.get() != null) {
            this.MediaDescriptionCompat.get().getViewTreeObserver().addOnGlobalLayoutListener(this.RatingCompat);
        }
    }
}
