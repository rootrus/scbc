package com.pdfview.subsamplincscaleimageview;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import p040o.IdWorkflowActivity;

class SubsamplingScaleImageView$MediaBrowserCompat$MediaItem extends AsyncTask<Void, Void, Bitmap> {
    private Exception IconCompatParcelizer;
    private final WeakReference<C1017x7620d44b> MediaBrowserCompat$CustomActionResultReceiver;
    private final WeakReference<IdWorkflowActivity.C69161> read;
    private final WeakReference<SubsamplingScaleImageView> write;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        SubsamplingScaleImageView subsamplingScaleImageView = this.write.get();
        C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (subsamplingScaleImageView != null && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver != null) {
            if (bitmap != null) {
                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = bitmap;
                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = false;
                SubsamplingScaleImageView.MediaSessionCompat$ResultReceiverWrapper(subsamplingScaleImageView);
            } else if (this.IconCompatParcelizer != null && subsamplingScaleImageView.MenuItemImpl != null) {
                SubsamplingScaleImageView.read unused = subsamplingScaleImageView.MenuItemImpl;
            }
        }
    }

    SubsamplingScaleImageView$MediaBrowserCompat$MediaItem(SubsamplingScaleImageView subsamplingScaleImageView, IdWorkflowActivity.C69161 r3, C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver) {
        this.write = new WeakReference<>(subsamplingScaleImageView);
        this.read = new WeakReference<>(r3);
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver);
        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    private Bitmap MediaBrowserCompat$ItemReceiver() {
        SubsamplingScaleImageView subsamplingScaleImageView;
        try {
            subsamplingScaleImageView = this.write.get();
            IdWorkflowActivity.C69161 r1 = this.read.get();
            C1017x7620d44b subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (r1 != null && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver != null && subsamplingScaleImageView != null && r1.IconCompatParcelizer() && subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver) {
                SubsamplingScaleImageView.read(subsamplingScaleImageView, "TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", new Object[]{subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read, Integer.valueOf(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer)});
                subsamplingScaleImageView.PlaybackStateCompat.readLock().lock();
                if (r1.IconCompatParcelizer()) {
                    SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver(subsamplingScaleImageView, subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.read, subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.write);
                    if (SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView) != null) {
                        subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.write.offset(SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).left, SubsamplingScaleImageView.MediaSessionCompat$Token(subsamplingScaleImageView).top);
                    }
                    Bitmap MediaBrowserCompat$CustomActionResultReceiver2 = r1.MediaBrowserCompat$CustomActionResultReceiver(subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.write, subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
                    subsamplingScaleImageView.PlaybackStateCompat.readLock().unlock();
                    return MediaBrowserCompat$CustomActionResultReceiver2;
                }
                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = false;
                subsamplingScaleImageView.PlaybackStateCompat.readLock().unlock();
                return null;
            } else if (subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver == null) {
                return null;
            } else {
                subsamplingScaleImageView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = false;
                return null;
            }
        } catch (Exception e) {
            Log.e(SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver, "Failed to decode tile", e);
            this.IconCompatParcelizer = e;
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e(SubsamplingScaleImageView.MediaBrowserCompat$ItemReceiver, "Failed to decode tile - OutOfMemoryError", e2);
            this.IconCompatParcelizer = new RuntimeException(e2);
            return null;
        } catch (Throwable th) {
            subsamplingScaleImageView.PlaybackStateCompat.readLock().unlock();
            throw th;
        }
    }
}
