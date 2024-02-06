package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.ExtractorResponse;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;

public class SnackbarContentLayout extends LinearLayout implements ExtractorResponse {
    Button IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private int read;
    TextView write;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout);
        this.read = obtainStyledAttributes.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout_android_maxWidth, -1);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.write = (TextView) findViewById(nAllocationSetSurface.MediaDescriptionCompat.snackbar_text);
        this.IconCompatParcelizer = (Button) findViewById(nAllocationSetSurface.MediaDescriptionCompat.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (write(1, r0, r0 - r1) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (write(0, r0, r0) != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.read
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.read
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p040o.nAllocationSetSurface.IconCompatParcelizer.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p040o.nAllocationSetSurface.IconCompatParcelizer.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.write
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.MediaBrowserCompat$ItemReceiver
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.IconCompatParcelizer
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.MediaBrowserCompat$ItemReceiver
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.write(r4, r0, r1)
            if (r0 == 0) goto L_0x0060
            goto L_0x005f
        L_0x0056:
            if (r2 != 0) goto L_0x0059
            r0 = r1
        L_0x0059:
            boolean r0 = r7.write(r3, r0, r0)
            if (r0 == 0) goto L_0x0060
        L_0x005f:
            r3 = r4
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            super.onMeasure(r8, r9)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    private boolean write(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.write.getPaddingTop() == i2 && this.write.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.write;
        if (SwitchCompat.setPadding(textView)) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver(textView, SwitchCompat.MediaSessionCompat$QueueItem(textView), i2, SwitchCompat.ParcelableVolumeInfo(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public final void IconCompatParcelizer() {
        this.write.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.write.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.IconCompatParcelizer.getVisibility() == 0) {
            this.IconCompatParcelizer.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.IconCompatParcelizer.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void write() {
        this.write.setAlpha(1.0f);
        this.write.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(180).setStartDelay(0).start();
        if (this.IconCompatParcelizer.getVisibility() == 0) {
            this.IconCompatParcelizer.setAlpha(1.0f);
            this.IconCompatParcelizer.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(180).setStartDelay(0).start();
        }
    }
}
