package com.scb.phone.view.util.plugins.camera.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import p040o.FragmentBuilder_BindECouponReviewFragment;
import p040o.FragmentBuilder_BindETBMarketConductFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CropOverlayView extends View {
    private static final int MediaBrowserCompat$ItemReceiver = Color.argb(204, 41, 48, 63);
    private RectF IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private Path MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f5444x50fd9e4a;
    private int MediaDescriptionCompat;
    private Paint MediaMetadataCompat;
    private int ParcelableVolumeInfo;
    private boolean RatingCompat;
    private Paint read;
    private int write = TitleChanger.DEFAULT_ANIMATION_DELAY;

    public CropOverlayView(Context context) {
        super(context);
        IconCompatParcelizer(context);
    }

    /* JADX INFO: finally extract failed */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CropOverlayView, 0, 0);
        try {
            this.RatingCompat = obtainStyledAttributes.getBoolean(2, true);
            this.f5444x50fd9e4a = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.MediaDescriptionCompat = obtainStyledAttributes.getDimensionPixelSize(3, 50);
            this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getDimensionPixelSize(1, TitleChanger.DEFAULT_ANIMATION_DELAY);
            this.ParcelableVolumeInfo = obtainStyledAttributes.getColor(7, MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            IconCompatParcelizer(context);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setLayerType(1, (Paint) null);
        canvas.save();
        this.IconCompatParcelizer.left = FragmentBuilder_BindETBMarketConductFragment.LEFT.mCoordinate;
        this.IconCompatParcelizer.top = FragmentBuilder_BindETBMarketConductFragment.TOP.mCoordinate;
        this.IconCompatParcelizer.right = FragmentBuilder_BindETBMarketConductFragment.RIGHT.mCoordinate;
        this.IconCompatParcelizer.bottom = FragmentBuilder_BindETBMarketConductFragment.BOTTOM.mCoordinate;
        Path path = this.MediaBrowserCompat$MediaItem;
        RectF rectF = this.IconCompatParcelizer;
        float f = (float) this.MediaBrowserCompat$SearchResultReceiver;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.MediaBrowserCompat$MediaItem, Region.Op.DIFFERENCE);
        canvas.drawColor(this.ParcelableVolumeInfo);
        this.MediaBrowserCompat$MediaItem.reset();
        canvas.restore();
        RectF rectF2 = this.IconCompatParcelizer;
        float f2 = (float) this.MediaBrowserCompat$SearchResultReceiver;
        canvas.drawRoundRect(rectF2, f2, f2, this.read);
        if (this.RatingCompat) {
            float f3 = FragmentBuilder_BindETBMarketConductFragment.LEFT.mCoordinate;
            float f4 = FragmentBuilder_BindETBMarketConductFragment.TOP.mCoordinate;
            float f5 = FragmentBuilder_BindETBMarketConductFragment.RIGHT.mCoordinate;
            float f6 = FragmentBuilder_BindETBMarketConductFragment.BOTTOM.mCoordinate;
            float write2 = FragmentBuilder_BindETBMarketConductFragment.write() / 3.0f;
            float f7 = f3 + write2;
            Canvas canvas2 = canvas;
            float f8 = f4;
            float f9 = f6;
            canvas2.drawLine(f7, f8, f7, f9, this.MediaMetadataCompat);
            float f10 = f5 - write2;
            canvas2.drawLine(f10, f8, f10, f9, this.MediaMetadataCompat);
            float IconCompatParcelizer2 = FragmentBuilder_BindETBMarketConductFragment.IconCompatParcelizer() / 3.0f;
            float f11 = f4 + IconCompatParcelizer2;
            Canvas canvas3 = canvas;
            float f12 = f3;
            float f13 = f5;
            canvas3.drawLine(f12, f11, f13, f11, this.MediaMetadataCompat);
            float f14 = f6 - IconCompatParcelizer2;
            canvas3.drawLine(f12, f14, f13, f14, this.MediaMetadataCompat);
        }
    }

    private void IconCompatParcelizer(Context context) {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.MediaDescriptionCompat;
        int i3 = i - (i2 << 1);
        this.write = i3;
        int i4 = this.f5444x50fd9e4a;
        int i5 = i4 + i3;
        int i6 = i3 + i2;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i7 = displayMetrics.heightPixels;
            int i8 = displayMetrics.widthPixels;
            if (i8 < this.write) {
                this.write = i8;
            }
            int i9 = this.write;
            int i10 = this.MediaDescriptionCompat;
            int i11 = ((i7 - i9) - i10) / 2;
            i5 = i11 + i9;
            i6 = i9 + i10;
            this.MediaBrowserCompat$SearchResultReceiver += i10 << 1;
            int i12 = i10;
            i4 = i11;
            i2 = i12;
        }
        this.read = FragmentBuilder_BindECouponReviewFragment.MediaBrowserCompat$ItemReceiver(context);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(2.0f);
        this.MediaMetadataCompat = paint;
        float f = (float) i4;
        FragmentBuilder_BindETBMarketConductFragment.TOP.mCoordinate = f;
        float f2 = (float) i5;
        FragmentBuilder_BindETBMarketConductFragment.BOTTOM.mCoordinate = f2;
        float f3 = (float) i2;
        FragmentBuilder_BindETBMarketConductFragment.LEFT.mCoordinate = f3;
        float f4 = (float) i6;
        FragmentBuilder_BindETBMarketConductFragment.RIGHT.mCoordinate = f4;
        this.IconCompatParcelizer = new RectF(f3, f, f4, f2);
        this.MediaBrowserCompat$MediaItem = new Path();
    }
}
