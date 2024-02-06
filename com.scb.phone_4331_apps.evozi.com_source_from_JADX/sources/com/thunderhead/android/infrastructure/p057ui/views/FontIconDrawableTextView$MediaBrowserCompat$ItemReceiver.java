package com.thunderhead.android.infrastructure.p057ui.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextPaint;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver */
final class FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver extends Drawable {
    private float MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ FontIconDrawableTextView read;
    TextPaint write;

    public final int getOpacity() {
        return -1;
    }

    FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver(FontIconDrawableTextView fontIconDrawableTextView, String str, Typeface typeface, float f) {
        this.read = fontIconDrawableTextView;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setUnderlineText(false);
        textPaint.setColor(-16776961);
        textPaint.setAntiAlias(true);
        this.write = textPaint;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int height = bounds.height();
        if (height == 0) {
            int measuredHeight = this.read.MediaDescriptionCompat.get().getMeasuredHeight();
            float f = this.MediaBrowserCompat$CustomActionResultReceiver;
            setBounds(0, 0, StrictMath.round(((float) ((getIntrinsicWidth() * measuredHeight) / getIntrinsicHeight())) * f), StrictMath.round(((float) measuredHeight) * f));
            this.read.MediaDescriptionCompat.get().setCompoundDrawables(this.read.write, (Drawable) null, this.read.MediaMetadataCompat, (Drawable) null);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    if (FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.this.read.MediaDescriptionCompat.get() != null) {
                        FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.this.read.MediaDescriptionCompat.get().getViewTreeObserver().addOnGlobalLayoutListener(FontIconDrawableTextView$MediaBrowserCompat$ItemReceiver.this.read.RatingCompat);
                    }
                }
            }, 100);
            bounds = getBounds();
            height = bounds.height();
        }
        this.write.setTextSize((float) height);
        Rect rect = new Rect();
        String str = this.MediaBrowserCompat$ItemReceiver;
        this.write.getTextBounds(str, 0, 1, rect);
        int height2 = rect.height();
        canvas.drawText(str, bounds.exactCenterX(), ((((float) bounds.top) + (((float) (height - height2)) / 2.0f)) + ((float) height2)) - ((float) rect.bottom), this.write);
    }

    public final void setAlpha(int i) {
        this.write.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.write.setColorFilter(colorFilter);
    }
}
