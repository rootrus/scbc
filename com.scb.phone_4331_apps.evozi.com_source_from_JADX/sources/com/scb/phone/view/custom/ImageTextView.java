package com.scb.phone.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateReferralEligibility;

public class ImageTextView extends AppCompatTextView {
    public int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    public Drawable MediaBrowserCompat$ItemReceiver;
    private CharSequence MediaMetadataCompat;
    public int read;

    public ImageTextView(Context context) {
        super(context);
    }

    public ImageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        IconCompatParcelizer(context, attributeSet);
        read();
    }

    public ImageTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        IconCompatParcelizer(context, attributeSet);
        read();
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ImageTextView, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        if (!obtainStyledAttributes.hasValue(2) || !obtainStyledAttributes.hasValue(5)) {
            this.IconCompatParcelizer = dimensionPixelSize;
            this.read = dimensionPixelSize;
        } else {
            this.IconCompatParcelizer = obtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
            this.read = obtainStyledAttributes.getDimensionPixelSize(5, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDrawable(1);
        this.MediaMetadataCompat = obtainStyledAttributes.getText(6);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            IconCompatParcelizer();
        }
        obtainStyledAttributes.recycle();
    }

    private void read() {
        Drawable drawable = this.MediaBrowserCompat$ItemReceiver;
        if (drawable != null) {
            setDrawable(drawable);
        }
        if (!TextUtils.isEmpty(this.MediaMetadataCompat)) {
            setText(this.MediaMetadataCompat);
        }
    }

    public void setDrawableBitmap(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap != null) {
                if (bitmap.getWidth() > this.read) {
                    bitmap = MediaBrowserCompat$ItemReceiver(bitmap, this.read, this.IconCompatParcelizer);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
                bitmapDrawable.setBounds(0, 0, this.read, this.IconCompatParcelizer);
                read(bitmapDrawable);
            }
        }
    }

    public void setDrawable(int i) {
        synchronized (this) {
            Drawable write = setLastBaselineToBottomHeight.write(getContext(), i);
            if (write != null) {
                write.setBounds(0, 0, this.read, this.IconCompatParcelizer);
            }
            read(write);
        }
    }

    public void setDrawable(Drawable drawable) {
        synchronized (this) {
            if (drawable != null) {
                if (((BitmapDrawable) drawable).getIntrinsicWidth() > this.read) {
                    drawable = new BitmapDrawable(getResources(), MediaBrowserCompat$ItemReceiver(((BitmapDrawable) drawable).getBitmap(), this.read, this.IconCompatParcelizer));
                }
                drawable.setBounds(0, 0, this.read, this.IconCompatParcelizer);
                read(drawable);
            }
        }
    }

    private void read(Drawable drawable) {
        synchronized (this) {
            this.MediaBrowserCompat$ItemReceiver = drawable;
            SpannableString spannableString = new SpannableString("[scbImage]");
            spannableString.setSpan(new validateReferralEligibility(drawable, this.MediaBrowserCompat$CustomActionResultReceiver), 0, 10, 33);
            setText(new SpannableStringBuilder().append(spannableString).append(getText().toString().trim().replace("[scbImage]", "")));
        }
    }

    private static Bitmap MediaBrowserCompat$ItemReceiver(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float width = ((float) i) / ((float) bitmap.getWidth());
        float height = ((float) i2) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(2));
        return createBitmap;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (((this.MediaBrowserCompat$ItemReceiver == null || charSequence == null || charSequence.toString().contains("[scbImage]")) ? false : true) || TextUtils.isEmpty(charSequence)) {
            read(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public CharSequence getText() {
        CharSequence text = super.getText();
        return (text == null || !text.toString().startsWith("[scbImage]")) ? text : text.toString().substring(10);
    }

    public void onMeasure(int i, int i2) {
        int measuredHeight = getMeasuredHeight();
        if (!(this.MediaBrowserCompat$ItemReceiver == null || measuredHeight == 0)) {
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            int abs = Math.abs(fontMetricsInt.top) + Math.abs(fontMetricsInt.bottom);
            Rect bounds = this.MediaBrowserCompat$ItemReceiver.getBounds();
            int abs2 = Math.abs(bounds.top) - Math.abs(bounds.bottom);
            if (abs < abs2) {
                int i3 = (abs2 - abs) / 2;
                int i4 = measuredHeight + i3 + fontMetricsInt.bottom;
                setPadding(getPaddingLeft(), getPaddingTop() + i3, getPaddingRight(), getPaddingBottom());
                if (i4 >= abs2) {
                    abs2 = i4;
                }
                setMeasuredDimension(getMeasuredWidth(), abs2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    private void IconCompatParcelizer() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int abs = Math.abs(fontMetricsInt.top) + Math.abs(fontMetricsInt.bottom);
        int i = this.IconCompatParcelizer;
        if (i > abs) {
            this.IconCompatParcelizer = abs;
            this.read = (int) (((float) this.read) * (((float) abs) / ((float) i)));
        }
    }

    public void setImageSize(int i) {
        this.IconCompatParcelizer = i;
        this.read = i;
    }

    public void setImageHeight(int i) {
        this.IconCompatParcelizer = i;
    }

    public void setImageWidth(int i) {
        this.read = i;
    }
}
