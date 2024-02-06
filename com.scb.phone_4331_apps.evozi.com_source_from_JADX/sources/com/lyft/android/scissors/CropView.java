package com.lyft.android.scissors;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.CTRSV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.DGBMV;
import p040o.DGEMM;
import p040o.FragmentBuilder_BindOPRRewardsTabFragment;
import p040o.FragmentBuilder_BindOPRStatusRegisteredUserFragment;

public class CropView extends ImageView {
    public IconCompatParcelizer IconCompatParcelizer;
    private Paint MediaBrowserCompat$CustomActionResultReceiver = new Paint();
    private Matrix MediaBrowserCompat$ItemReceiver = new Matrix();
    private Paint MediaBrowserCompat$SearchResultReceiver = new Paint();
    public DGEMM read;
    public Bitmap write;

    public CropView(Context context) {
        super(context);
        MediaBrowserCompat$CustomActionResultReceiver(context, (AttributeSet) null);
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        FragmentBuilder_BindOPRStatusRegisteredUserFragment MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindOPRStatusRegisteredUserFragment.MediaBrowserCompat$ItemReceiver(context, attributeSet);
        this.read = new DGEMM(MediaBrowserCompat$ItemReceiver2);
        this.MediaBrowserCompat$CustomActionResultReceiver.setFilterBitmap(true);
        this.MediaBrowserCompat$SearchResultReceiver.setColor(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.write != null) {
            IconCompatParcelizer(canvas);
            int i = this.read.MediaDescriptionCompat;
            int i2 = this.read.MediaBrowserCompat$SearchResultReceiver;
            int width = (getWidth() - i) / 2;
            int height = (getHeight() - i2) / 2;
            float f = (float) height;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f, (float) width, (float) (getHeight() - height), this.MediaBrowserCompat$SearchResultReceiver);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), f, this.MediaBrowserCompat$SearchResultReceiver);
            canvas.drawRect((float) (getWidth() - width), f, (float) getWidth(), (float) (getHeight() - height), this.MediaBrowserCompat$SearchResultReceiver);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) (getHeight() - height), (float) getWidth(), (float) getHeight(), this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void IconCompatParcelizer(Canvas canvas) {
        this.MediaBrowserCompat$ItemReceiver.reset();
        DGEMM dgemm = this.read;
        Matrix matrix = this.MediaBrowserCompat$ItemReceiver;
        matrix.postTranslate(((float) (-dgemm.read)) / 2.0f, ((float) (-dgemm.MediaBrowserCompat$ItemReceiver)) / 2.0f);
        float f = dgemm.MediaBrowserCompat$MediaItem;
        matrix.postScale(f, f);
        matrix.postTranslate(dgemm.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver, dgemm.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
        canvas.drawBitmap(this.write, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        write();
    }

    public void setViewportRatio(float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (Float.compare(f, BitmapDescriptorFactory.HUE_RED) == 0) {
            Bitmap bitmap = this.write;
            f = bitmap != null ? ((float) bitmap.getWidth()) / ((float) bitmap.getHeight()) : 0.0f;
        }
        FragmentBuilder_BindOPRStatusRegisteredUserFragment fragmentBuilder_BindOPRStatusRegisteredUserFragment = this.read.IconCompatParcelizer;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f2 = f;
        }
        fragmentBuilder_BindOPRStatusRegisteredUserFragment.MediaBrowserCompat$CustomActionResultReceiver = f2;
        write();
        invalidate();
    }

    public void setImageResource(int i) {
        setImageBitmap(i > 0 ? BitmapFactory.decodeResource(getResources(), i) : null);
    }

    public void setImageDrawable(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmap = drawable != null ? DGBMV.IconCompatParcelizer(drawable, getWidth(), getHeight()) : null;
        }
        setImageBitmap(bitmap);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.write = bitmap;
        write();
        invalidate();
    }

    private void write() {
        int i;
        int i2;
        boolean z = this.write == null;
        if (z) {
            i = 0;
        } else {
            i = this.write.getWidth();
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = this.write.getHeight();
        }
        DGEMM dgemm = this.read;
        int width = getWidth();
        int height = getHeight();
        float f = dgemm.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        dgemm.write = new Rect(0, 0, width / 2, height / 2);
        float f2 = ((float) i) / ((float) i2);
        float f3 = ((float) width) / ((float) height);
        float f4 = dgemm.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, f4) != 0) {
            f2 = f4;
        }
        if (f2 > f3) {
            int i3 = width - (dgemm.IconCompatParcelizer.write << 1);
            dgemm.MediaDescriptionCompat = i3;
            dgemm.MediaBrowserCompat$SearchResultReceiver = (int) (((float) i3) * (1.0f / f2));
        } else {
            int i4 = height - (dgemm.IconCompatParcelizer.write << 1);
            dgemm.MediaBrowserCompat$SearchResultReceiver = i4;
            dgemm.MediaDescriptionCompat = (int) (((float) i4) * f2);
        }
        dgemm.read = i;
        dgemm.MediaBrowserCompat$ItemReceiver = i2;
        if (i > 0 && i2 > 0) {
            float max = Math.max(((float) dgemm.MediaDescriptionCompat) / ((float) dgemm.read), ((float) dgemm.MediaBrowserCompat$SearchResultReceiver) / ((float) dgemm.MediaBrowserCompat$ItemReceiver));
            dgemm.MediaBrowserCompat$CustomActionResultReceiver = max;
            dgemm.MediaBrowserCompat$MediaItem = Math.max(dgemm.MediaBrowserCompat$MediaItem, max);
            dgemm.write();
            FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment = dgemm.MediaMetadataCompat;
            fragmentBuilder_BindOPRRewardsTabFragment.MediaBrowserCompat$ItemReceiver = (float) dgemm.write.right;
            fragmentBuilder_BindOPRRewardsTabFragment.MediaBrowserCompat$CustomActionResultReceiver = (float) dgemm.write.bottom;
            dgemm.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        this.read.onEvent(motionEvent);
        invalidate();
        return true;
    }

    public static class IconCompatParcelizer {
        public final CropView IconCompatParcelizer;

        public IconCompatParcelizer(CropView cropView) {
            this.IconCompatParcelizer = cropView;
        }
    }

    public void setImageURI(Uri uri) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new IconCompatParcelizer(this);
        }
        CTRSV$MediaBrowserCompat$CustomActionResultReceiver cTRSV$MediaBrowserCompat$CustomActionResultReceiver = new CTRSV$MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.IconCompatParcelizer);
        if (cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getWidth() == 0 && cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getHeight() == 0) {
            cTRSV$MediaBrowserCompat$CustomActionResultReceiver.write(uri);
        } else {
            cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(uri);
        }
    }
}
