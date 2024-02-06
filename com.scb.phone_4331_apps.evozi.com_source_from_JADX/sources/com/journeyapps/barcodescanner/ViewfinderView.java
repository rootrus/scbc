package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p040o.rsnScriptForEach;
import p040o.rsnScriptInvokeV;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$MediaItem;

public class ViewfinderView extends View {
    private static int[] MediaBrowserCompat$ItemReceiver = {0, 64, 128, 192, 255, 192, 128, 64};
    private CameraPreview IconCompatParcelizer;
    private Rect MediaBrowserCompat$CustomActionResultReceiver;
    private Rect MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private Paint MediaDescriptionCompat = new Paint(1);
    private int MediaMetadataCompat;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private List<rsnScriptForEach> RatingCompat;
    private int read;
    List<rsnScriptForEach> write;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_finder);
        this.MediaMetadataCompat = obtainStyledAttributes.getColor(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_finder_zxing_viewfinder_mask, resources.getColor(rsnScriptInvokeV.IconCompatParcelizer.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_finder_zxing_result_view, resources.getColor(rsnScriptInvokeV.IconCompatParcelizer.zxing_result_view));
        this.read = obtainStyledAttributes.getColor(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_finder_zxing_viewfinder_laser, resources.getColor(rsnScriptInvokeV.IconCompatParcelizer.zxing_viewfinder_laser));
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getColor(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_finder_zxing_possible_result_points, resources.getColor(rsnScriptInvokeV.IconCompatParcelizer.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.MediaSessionCompat$ResultReceiverWrapper = 0;
        this.write = new ArrayList(20);
        this.RatingCompat = new ArrayList(20);
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.IconCompatParcelizer = cameraPreview;
        cameraPreview.MediaBrowserCompat$MediaItem.add(new CameraPreview$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void IconCompatParcelizer() {
            }

            public final void IconCompatParcelizer(Exception exc) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
            }

            public final void write() {
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                ViewfinderView.this.MediaBrowserCompat$ItemReceiver();
                ViewfinderView.this.invalidate();
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver() {
        CameraPreview cameraPreview = this.IconCompatParcelizer;
        if (cameraPreview != null) {
            Rect rect = cameraPreview.read;
            Rect rect2 = this.IconCompatParcelizer.RatingCompat;
            if (rect != null && rect2 != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = rect;
                this.MediaBrowserCompat$MediaItem = rect2;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Rect rect;
        MediaBrowserCompat$ItemReceiver();
        Rect rect2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (rect2 != null && (rect = this.MediaBrowserCompat$MediaItem) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.MediaDescriptionCompat.setColor(this.MediaMetadataCompat);
            float f = (float) width;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) rect2.top, this.MediaDescriptionCompat);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) rect2.top, (float) rect2.left, (float) (rect2.bottom + 1), this.MediaDescriptionCompat);
            float f2 = f;
            canvas.drawRect((float) (rect2.right + 1), (float) rect2.top, f2, (float) (rect2.bottom + 1), this.MediaDescriptionCompat);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) (rect2.bottom + 1), f2, (float) height, this.MediaDescriptionCompat);
            this.MediaDescriptionCompat.setColor(this.read);
            this.MediaDescriptionCompat.setAlpha(MediaBrowserCompat$ItemReceiver[this.MediaSessionCompat$ResultReceiverWrapper]);
            this.MediaSessionCompat$ResultReceiverWrapper = (this.MediaSessionCompat$ResultReceiverWrapper + 1) % MediaBrowserCompat$ItemReceiver.length;
            int height2 = (rect2.height() / 2) + rect2.top;
            canvas.drawRect((float) (rect2.left + 2), (float) (height2 - 1), (float) (rect2.right - 1), (float) (height2 + 2), this.MediaDescriptionCompat);
            float width2 = ((float) rect2.width()) / ((float) rect.width());
            float height3 = ((float) rect2.height()) / ((float) rect.height());
            int i = rect2.left;
            int i2 = rect2.top;
            if (!this.RatingCompat.isEmpty()) {
                this.MediaDescriptionCompat.setAlpha(80);
                this.MediaDescriptionCompat.setColor(this.MediaBrowserCompat$SearchResultReceiver);
                for (rsnScriptForEach next : this.RatingCompat) {
                    canvas.drawCircle((float) (((int) (next.MediaBrowserCompat$CustomActionResultReceiver * width2)) + i), (float) (((int) (next.read * height3)) + i2), 3.0f, this.MediaDescriptionCompat);
                }
                this.RatingCompat.clear();
            }
            if (!this.write.isEmpty()) {
                this.MediaDescriptionCompat.setAlpha(160);
                this.MediaDescriptionCompat.setColor(this.MediaBrowserCompat$SearchResultReceiver);
                for (rsnScriptForEach next2 : this.write) {
                    canvas.drawCircle((float) (((int) (next2.MediaBrowserCompat$CustomActionResultReceiver * width2)) + i), (float) (((int) (next2.read * height3)) + i2), 6.0f, this.MediaDescriptionCompat);
                }
                List<rsnScriptForEach> list = this.write;
                List<rsnScriptForEach> list2 = this.RatingCompat;
                this.write = list2;
                this.RatingCompat = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }
}
