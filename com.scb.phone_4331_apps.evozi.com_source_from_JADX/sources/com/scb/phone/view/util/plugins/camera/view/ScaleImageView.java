package com.scb.phone.view.util.plugins.camera.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class ScaleImageView extends AppCompatImageView implements View.OnTouchListener {
    float IconCompatParcelizer;
    final float[] MediaBrowserCompat$CustomActionResultReceiver = new float[9];
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private float MediaDescriptionCompat;
    private GestureDetector MediaMetadataCompat;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int RatingCompat;
    Matrix read;
    private Context write;

    public ScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = context;
        read();
    }

    public ScaleImageView(Context context) {
        super(context);
        this.write = context;
        read();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        read();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        read();
    }

    private void read() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.read = new Matrix();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.MediaBrowserCompat$SearchResultReceiver = drawable.getIntrinsicWidth();
            this.MediaBrowserCompat$MediaItem = drawable.getIntrinsicHeight();
            setOnTouchListener(this);
        }
        this.MediaMetadataCompat = new GestureDetector(this.write, new GestureDetector.SimpleOnGestureListener() {
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                ScaleImageView scaleImageView = ScaleImageView.this;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                float f = scaleImageView.IconCompatParcelizer;
                scaleImageView.read.getValues(scaleImageView.MediaBrowserCompat$CustomActionResultReceiver);
                if (f != scaleImageView.MediaBrowserCompat$CustomActionResultReceiver[0]) {
                    scaleImageView.read.getValues(scaleImageView.MediaBrowserCompat$CustomActionResultReceiver);
                    float f2 = scaleImageView.MediaBrowserCompat$CustomActionResultReceiver[0];
                    float f3 = scaleImageView.IconCompatParcelizer;
                    if (f2 - f3 > 0.1f) {
                        scaleImageView.read.getValues(scaleImageView.MediaBrowserCompat$CustomActionResultReceiver);
                        scaleImageView.MediaBrowserCompat$ItemReceiver(f3 / scaleImageView.MediaBrowserCompat$CustomActionResultReceiver[0], x, y);
                        ScaleImageView.this.MediaBrowserCompat$ItemReceiver();
                        return super.onDoubleTap(motionEvent);
                    }
                }
                scaleImageView.read.getValues(scaleImageView.MediaBrowserCompat$CustomActionResultReceiver);
                scaleImageView.MediaBrowserCompat$ItemReceiver(2.0f / scaleImageView.MediaBrowserCompat$CustomActionResultReceiver[0], x, y);
                ScaleImageView.this.MediaBrowserCompat$ItemReceiver();
                return super.onDoubleTap(motionEvent);
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        this.MediaSessionCompat$Token = i6;
        this.RatingCompat = i4 - i2;
        this.read.reset();
        float f = ((float) i6) / ((float) this.MediaBrowserCompat$SearchResultReceiver);
        float f2 = (float) this.MediaBrowserCompat$MediaItem;
        float f3 = (float) this.RatingCompat;
        int i7 = 0;
        if (f2 * f > f3) {
            f = f3 / f2;
            this.read.postScale(f, f);
            i7 = (i3 - this.MediaSessionCompat$Token) / 2;
            i5 = 0;
        } else {
            this.read.postScale(f, f);
            i5 = (i4 - this.RatingCompat) / 2;
        }
        this.read.postTranslate((float) i7, (float) i5);
        setImageMatrix(this.read);
        this.IconCompatParcelizer = f;
        MediaBrowserCompat$ItemReceiver(f, this.MediaSessionCompat$Token / 2, this.RatingCompat / 2);
        MediaBrowserCompat$ItemReceiver();
        return super.setFrame(i, i2, i3, i4);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.read.getValues(this.MediaBrowserCompat$CustomActionResultReceiver);
        float[] fArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = (int) (((float) this.MediaBrowserCompat$SearchResultReceiver) * fArr[0]);
        this.read.getValues(fArr);
        float[] fArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = (int) (((float) this.MediaBrowserCompat$MediaItem) * fArr2[0]);
        this.read.getValues(fArr2);
        float[] fArr3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr3[2] < ((float) (-(i - this.MediaSessionCompat$Token)))) {
            Matrix matrix = this.read;
            matrix.getValues(fArr3);
            matrix.postTranslate(-((this.MediaBrowserCompat$CustomActionResultReceiver[2] + ((float) i)) - ((float) this.MediaSessionCompat$Token)), BitmapDescriptorFactory.HUE_RED);
        }
        this.read.getValues(this.MediaBrowserCompat$CustomActionResultReceiver);
        float[] fArr4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr4[2] > BitmapDescriptorFactory.HUE_RED) {
            Matrix matrix2 = this.read;
            matrix2.getValues(fArr4);
            matrix2.postTranslate(-this.MediaBrowserCompat$CustomActionResultReceiver[2], BitmapDescriptorFactory.HUE_RED);
        }
        this.read.getValues(this.MediaBrowserCompat$CustomActionResultReceiver);
        float[] fArr5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr5[5] < ((float) (-(i2 - this.RatingCompat)))) {
            Matrix matrix3 = this.read;
            matrix3.getValues(fArr5);
            matrix3.postTranslate(BitmapDescriptorFactory.HUE_RED, -((this.MediaBrowserCompat$CustomActionResultReceiver[5] + ((float) i2)) - ((float) this.RatingCompat)));
        }
        this.read.getValues(this.MediaBrowserCompat$CustomActionResultReceiver);
        float[] fArr6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr6[5] > BitmapDescriptorFactory.HUE_RED) {
            Matrix matrix4 = this.read;
            matrix4.getValues(fArr6);
            matrix4.postTranslate(BitmapDescriptorFactory.HUE_RED, -this.MediaBrowserCompat$CustomActionResultReceiver[5]);
        }
        int i3 = this.MediaSessionCompat$Token;
        if (i < i3) {
            this.read.postTranslate(((float) (i3 - i)) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        }
        int i4 = this.RatingCompat;
        if (i2 < i4) {
            this.read.postTranslate(BitmapDescriptorFactory.HUE_RED, ((float) (i4 - i2)) / 2.0f);
        }
        setImageMatrix(this.read);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.MediaMetadataCompat.onTouchEvent(motionEvent)) {
            return true;
        }
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (pointerCount >= 2 && this.MediaBrowserCompat$ItemReceiver) {
                        float x = motionEvent.getX(0) - motionEvent.getX(1);
                        float y = motionEvent.getY(0) - motionEvent.getY(1);
                        float sqrt = (float) Math.sqrt((double) ((x * x) + (y * y)));
                        int i = this.MediaSessionCompat$Token;
                        double d = (double) (i * i);
                        int i2 = this.RatingCompat;
                        this.MediaDescriptionCompat = sqrt;
                        float sqrt2 = ((sqrt - this.MediaDescriptionCompat) / ((float) Math.sqrt(d + ((double) (i2 * i2))))) + 1.0f;
                        MediaBrowserCompat$ItemReceiver(sqrt2 * sqrt2, this.MediaSessionCompat$Token / 2, this.RatingCompat / 2);
                        MediaBrowserCompat$ItemReceiver();
                    } else if (!this.MediaBrowserCompat$ItemReceiver) {
                        this.MediaSessionCompat$ResultReceiverWrapper = (int) motionEvent.getX();
                        this.ParcelableVolumeInfo = (int) motionEvent.getY();
                        this.read.postTranslate((float) (-(this.MediaSessionCompat$ResultReceiverWrapper - ((int) motionEvent.getX()))), (float) (-(this.ParcelableVolumeInfo - ((int) motionEvent.getY()))));
                        MediaBrowserCompat$ItemReceiver();
                    }
                    return true;
                } else if (action != 5) {
                    if (action != 6) {
                        if (action != 261) {
                            if (action != 262) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (motionEvent.getPointerCount() <= 1) {
                this.MediaBrowserCompat$ItemReceiver = false;
            }
            return true;
        }
        if (pointerCount >= 2) {
            float x2 = motionEvent.getX(0) - motionEvent.getX(1);
            float y2 = motionEvent.getY(0) - motionEvent.getY(1);
            this.MediaDescriptionCompat = (float) Math.sqrt((double) ((x2 * x2) + (y2 * y2)));
            this.MediaBrowserCompat$ItemReceiver = true;
        } else {
            this.MediaSessionCompat$ResultReceiverWrapper = (int) motionEvent.getX();
            this.ParcelableVolumeInfo = (int) motionEvent.getY();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(float f, int i, int i2) {
        this.read.getValues(this.MediaBrowserCompat$CustomActionResultReceiver);
        float[] fArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fArr[0] * f >= this.IconCompatParcelizer) {
            if (f >= 1.0f) {
                this.read.getValues(fArr);
                if (this.MediaBrowserCompat$CustomActionResultReceiver[0] * f > 2.0f) {
                    return;
                }
            }
            this.read.postScale(f, f);
            Matrix matrix = this.read;
            float f2 = (float) this.MediaSessionCompat$Token;
            float f3 = (float) this.RatingCompat;
            matrix.postTranslate((-((f2 * f) - f2)) / 2.0f, (-((f3 * f) - f3)) / 2.0f);
            this.read.postTranslate((-(((float) i) - (((float) this.MediaSessionCompat$Token) / 2.0f))) * f, BitmapDescriptorFactory.HUE_RED);
            this.read.postTranslate(BitmapDescriptorFactory.HUE_RED, (-(((float) i2) - (((float) this.RatingCompat) / 2.0f))) * f);
            setImageMatrix(this.read);
        }
    }
}
