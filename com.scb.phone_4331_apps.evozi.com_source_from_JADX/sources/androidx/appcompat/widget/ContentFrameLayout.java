package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p040o.SwitchCompat;

public class ContentFrameLayout extends FrameLayout {
    private TypedValue IconCompatParcelizer;
    private TypedValue MediaBrowserCompat$CustomActionResultReceiver;
    private final Rect MediaBrowserCompat$ItemReceiver;
    private TypedValue MediaBrowserCompat$MediaItem;
    private TypedValue MediaBrowserCompat$SearchResultReceiver;
    private TypedValue MediaMetadataCompat;
    private TypedValue read;
    private ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver write;

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = new Rect();
    }

    public void MediaBrowserCompat$ItemReceiver(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.MediaBrowserCompat$ItemReceiver.set(i, i2, i3, i4);
        if (SwitchCompat.setCheckable(this)) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r4
        L_0x0017:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L_0x0068
            if (r1 == 0) goto L_0x002c
            android.util.TypedValue r10 = r13.MediaMetadataCompat
            goto L_0x002e
        L_0x002c:
            android.util.TypedValue r10 = r13.read
        L_0x002e:
            if (r10 == 0) goto L_0x0068
            int r11 = r10.type
            if (r11 == 0) goto L_0x0068
            int r11 = r10.type
            if (r11 != r7) goto L_0x003d
            float r10 = r10.getDimension(r0)
            goto L_0x004b
        L_0x003d:
            int r11 = r10.type
            if (r11 != r6) goto L_0x004d
            int r11 = r0.widthPixels
            float r11 = (float) r11
            int r12 = r0.widthPixels
            float r12 = (float) r12
            float r10 = r10.getFraction(r11, r12)
        L_0x004b:
            int r10 = (int) r10
            goto L_0x004e
        L_0x004d:
            r10 = r4
        L_0x004e:
            if (r10 <= 0) goto L_0x0068
            android.graphics.Rect r11 = r13.MediaBrowserCompat$ItemReceiver
            int r11 = r11.left
            android.graphics.Rect r12 = r13.MediaBrowserCompat$ItemReceiver
            int r12 = r12.right
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r11 = r11 + r12
            int r10 = r10 - r11
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = r3
            goto L_0x0069
        L_0x0068:
            r10 = r4
        L_0x0069:
            if (r5 != r8) goto L_0x00aa
            if (r1 == 0) goto L_0x0070
            android.util.TypedValue r5 = r13.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0072
        L_0x0070:
            android.util.TypedValue r5 = r13.IconCompatParcelizer
        L_0x0072:
            if (r5 == 0) goto L_0x00aa
            int r11 = r5.type
            if (r11 == 0) goto L_0x00aa
            int r11 = r5.type
            if (r11 != r7) goto L_0x0081
            float r5 = r5.getDimension(r0)
            goto L_0x008f
        L_0x0081:
            int r11 = r5.type
            if (r11 != r6) goto L_0x0091
            int r11 = r0.heightPixels
            float r11 = (float) r11
            int r12 = r0.heightPixels
            float r12 = (float) r12
            float r5 = r5.getFraction(r11, r12)
        L_0x008f:
            int r5 = (int) r5
            goto L_0x0092
        L_0x0091:
            r5 = r4
        L_0x0092:
            if (r5 <= 0) goto L_0x00aa
            android.graphics.Rect r11 = r13.MediaBrowserCompat$ItemReceiver
            int r11 = r11.top
            android.graphics.Rect r12 = r13.MediaBrowserCompat$ItemReceiver
            int r12 = r12.bottom
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r11 = r11 + r12
            int r5 = r5 - r11
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L_0x00aa:
            super.onMeasure(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            if (r10 != 0) goto L_0x00f3
            if (r2 != r8) goto L_0x00f3
            if (r1 == 0) goto L_0x00be
            android.util.TypedValue r1 = r13.MediaBrowserCompat$SearchResultReceiver
            goto L_0x00c0
        L_0x00be:
            android.util.TypedValue r1 = r13.MediaBrowserCompat$MediaItem
        L_0x00c0:
            if (r1 == 0) goto L_0x00f3
            int r2 = r1.type
            if (r2 == 0) goto L_0x00f3
            int r2 = r1.type
            if (r2 != r7) goto L_0x00cf
            float r0 = r1.getDimension(r0)
            goto L_0x00dd
        L_0x00cf:
            int r2 = r1.type
            if (r2 != r6) goto L_0x00df
            int r2 = r0.widthPixels
            float r2 = (float) r2
            int r0 = r0.widthPixels
            float r0 = (float) r0
            float r0 = r1.getFraction(r2, r0)
        L_0x00dd:
            int r0 = (int) r0
            goto L_0x00e0
        L_0x00df:
            r0 = r4
        L_0x00e0:
            if (r0 <= 0) goto L_0x00ec
            android.graphics.Rect r1 = r13.MediaBrowserCompat$ItemReceiver
            int r1 = r1.left
            android.graphics.Rect r2 = r13.MediaBrowserCompat$ItemReceiver
            int r2 = r2.right
            int r1 = r1 + r2
            int r0 = r0 - r1
        L_0x00ec:
            if (r14 >= r0) goto L_0x00f3
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto L_0x00f4
        L_0x00f3:
            r3 = r4
        L_0x00f4:
            if (r3 == 0) goto L_0x00f9
            super.onMeasure(r5, r15)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new TypedValue();
        }
        return this.MediaBrowserCompat$MediaItem;
    }

    public TypedValue MediaDescriptionCompat() {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new TypedValue();
        }
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public TypedValue read() {
        if (this.read == null) {
            this.read = new TypedValue();
        }
        return this.read;
    }

    public TypedValue IconCompatParcelizer() {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new TypedValue();
        }
        return this.MediaMetadataCompat;
    }

    public TypedValue write() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new TypedValue();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public TypedValue MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new TypedValue();
        }
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        if (contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
            contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ContentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        if (contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
            contentFrameLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
    }
}
