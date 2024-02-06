package com.pdfview.subsamplincscaleimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import p040o.DSPMV;
import p040o.IdWorkflowActivity;

/* renamed from: com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView$MediaBrowserCompat$CustomActionResultReceiver */
class C1016xd5f05c2a extends AsyncTask<Void, Void, Integer> {
    private final WeakReference<Context> IconCompatParcelizer;
    private final WeakReference<DSPMV<? extends IdWorkflowActivity>> MediaBrowserCompat$CustomActionResultReceiver;
    private Bitmap MediaBrowserCompat$ItemReceiver;
    private final WeakReference<SubsamplingScaleImageView> MediaBrowserCompat$MediaItem;
    private final Uri RatingCompat;
    private final boolean read = false;
    private Exception write;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        SubsamplingScaleImageView subsamplingScaleImageView = this.MediaBrowserCompat$MediaItem.get();
        if (subsamplingScaleImageView != null) {
            Bitmap bitmap = this.MediaBrowserCompat$ItemReceiver;
            if (bitmap == null || num == null) {
                if (this.write != null && subsamplingScaleImageView.MenuItemImpl != null) {
                    if (this.read) {
                        SubsamplingScaleImageView.read unused = subsamplingScaleImageView.MenuItemImpl;
                    } else {
                        SubsamplingScaleImageView.read unused2 = subsamplingScaleImageView.MenuItemImpl;
                    }
                }
            } else if (this.read) {
                SubsamplingScaleImageView.IconCompatParcelizer(subsamplingScaleImageView, bitmap);
            } else {
                SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(subsamplingScaleImageView, bitmap, num.intValue());
            }
        }
    }

    C1016xd5f05c2a(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DSPMV<? extends IdWorkflowActivity> dspmv, Uri uri, boolean z) {
        this.MediaBrowserCompat$MediaItem = new WeakReference<>(subsamplingScaleImageView);
        this.IconCompatParcelizer = new WeakReference<>(context);
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(dspmv);
        this.RatingCompat = uri;
    }

    private Integer MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            String obj = this.RatingCompat.toString();
            Context context = this.IconCompatParcelizer.get();
            DSPMV dspmv = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            SubsamplingScaleImageView subsamplingScaleImageView = this.MediaBrowserCompat$MediaItem.get();
            if (context == null || dspmv == null || subsamplingScaleImageView == null) {
                return null;
            }
            SubsamplingScaleImageView.read(subsamplingScaleImageView, "BitmapLoadTask.doInBackground", new Object[0]);
            this.MediaBrowserCompat$ItemReceiver = ((IdWorkflowActivity) dspmv.MediaBrowserCompat$CustomActionResultReceiver()).IconCompatParcelizer(context, this.RatingCompat);
            return Integer.valueOf(SubsamplingScaleImageView.MediaBrowserCompat$CustomActionResultReceiver(context, obj));
        } catch (Exception e) {
            Log.e(SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver, "Failed to load bitmap", e);
            this.write = e;
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e(SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver, "Failed to load bitmap - OutOfMemoryError", e2);
            this.write = new RuntimeException(e2);
            return null;
        }
    }
}
