package com.pdfview.subsamplincscaleimageview;

import android.graphics.PointF;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;

public final class SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver {
    boolean IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    long MediaBrowserCompat$ItemReceiver;
    private final PointF MediaBrowserCompat$SearchResultReceiver;
    private /* synthetic */ SubsamplingScaleImageView MediaDescriptionCompat;
    private final PointF MediaMetadataCompat;
    private final float RatingCompat;
    int read;
    boolean write;

    /* synthetic */ SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, byte b) {
        this(subsamplingScaleImageView, f, pointF);
    }

    /* synthetic */ SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2, byte b) {
        this(subsamplingScaleImageView, f, pointF, pointF2);
    }

    /* synthetic */ SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF, byte b) {
        this(subsamplingScaleImageView, pointF);
    }

    private SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        this.MediaDescriptionCompat = subsamplingScaleImageView;
        this.MediaBrowserCompat$ItemReceiver = 500;
        this.MediaBrowserCompat$CustomActionResultReceiver = 2;
        this.read = 1;
        this.IconCompatParcelizer = true;
        this.write = true;
        this.RatingCompat = subsamplingScaleImageView.setWindowCallback;
        this.MediaMetadataCompat = pointF;
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    private SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF) {
        this.MediaDescriptionCompat = subsamplingScaleImageView;
        this.MediaBrowserCompat$ItemReceiver = 500;
        this.MediaBrowserCompat$CustomActionResultReceiver = 2;
        this.read = 1;
        this.IconCompatParcelizer = true;
        this.write = true;
        this.RatingCompat = f;
        this.MediaMetadataCompat = pointF;
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    private SubsamplingScaleImageView$MediaBrowserCompat$ItemReceiver(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2) {
        this.MediaDescriptionCompat = subsamplingScaleImageView;
        this.MediaBrowserCompat$ItemReceiver = 500;
        this.MediaBrowserCompat$CustomActionResultReceiver = 2;
        this.read = 1;
        this.IconCompatParcelizer = true;
        this.write = true;
        this.RatingCompat = f;
        this.MediaMetadataCompat = pointF;
        this.MediaBrowserCompat$SearchResultReceiver = pointF2;
    }

    public final void read() {
        if (this.MediaDescriptionCompat.MediaDescriptionCompat != null) {
            SubsamplingScaleImageView.write unused = this.MediaDescriptionCompat.MediaDescriptionCompat;
        }
        int paddingLeft = this.MediaDescriptionCompat.getPaddingLeft();
        int width = ((this.MediaDescriptionCompat.getWidth() - this.MediaDescriptionCompat.getPaddingRight()) - this.MediaDescriptionCompat.getPaddingLeft()) / 2;
        int paddingTop = this.MediaDescriptionCompat.getPaddingTop();
        int height = ((this.MediaDescriptionCompat.getHeight() - this.MediaDescriptionCompat.getPaddingBottom()) - this.MediaDescriptionCompat.getPaddingTop()) / 2;
        float write2 = Math.min(this.MediaDescriptionCompat.setShortcut, Math.max(this.MediaDescriptionCompat.RatingCompat(), this.RatingCompat));
        PointF MediaBrowserCompat$CustomActionResultReceiver2 = this.write ? SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, this.MediaMetadataCompat.x, this.MediaMetadataCompat.y, write2, new PointF()) : this.MediaMetadataCompat;
        SubsamplingScaleImageView.write unused2 = this.MediaDescriptionCompat.MediaDescriptionCompat = new SubsamplingScaleImageView.write((byte) 0);
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaMetadataCompat = this.MediaDescriptionCompat.setWindowCallback;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$MediaItem = write2;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaSessionCompat$Token = System.currentTimeMillis();
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver2;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver = this.MediaDescriptionCompat.write();
        this.MediaDescriptionCompat.MediaDescriptionCompat.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver2;
        this.MediaDescriptionCompat.MediaDescriptionCompat.ParcelableVolumeInfo = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2.x, MediaBrowserCompat$CustomActionResultReceiver2.y, new PointF());
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaSessionCompat$QueueItem = new PointF((float) (paddingLeft + width), (float) (paddingTop + height));
        this.MediaDescriptionCompat.MediaDescriptionCompat.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        this.MediaDescriptionCompat.MediaDescriptionCompat.read = this.IconCompatParcelizer;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = this.read;
        this.MediaDescriptionCompat.MediaDescriptionCompat.MediaSessionCompat$Token = System.currentTimeMillis();
        this.MediaDescriptionCompat.MediaDescriptionCompat.write = null;
        PointF pointF = this.MediaBrowserCompat$SearchResultReceiver;
        if (pointF != null) {
            float f = pointF.x - (this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver.x * write2);
            float f2 = this.MediaBrowserCompat$SearchResultReceiver.y - (this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver.y * write2);
            SubsamplingScaleImageView.RatingCompat ratingCompat = new SubsamplingScaleImageView.RatingCompat(write2, new PointF(f, f2), (byte) 0);
            this.MediaDescriptionCompat.IconCompatParcelizer(true, ratingCompat);
            this.MediaDescriptionCompat.MediaDescriptionCompat.MediaSessionCompat$QueueItem = new PointF(this.MediaBrowserCompat$SearchResultReceiver.x + (ratingCompat.read.x - f), this.MediaBrowserCompat$SearchResultReceiver.y + (ratingCompat.read.y - f2));
        }
        this.MediaDescriptionCompat.invalidate();
    }
}
