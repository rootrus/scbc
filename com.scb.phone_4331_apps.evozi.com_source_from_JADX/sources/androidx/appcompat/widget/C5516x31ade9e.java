package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;

/* renamed from: androidx.appcompat.widget.ActivityChooserView$MediaBrowserCompat$CustomActionResultReceiver */
class C5516x31ade9e implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    final /* synthetic */ ActivityChooserView MediaBrowserCompat$CustomActionResultReceiver;

    C5516x31ade9e(ActivityChooserView activityChooserView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activityChooserView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int itemViewType = ((ActivityChooserView.IconCompatParcelizer) adapterView.getAdapter()).getItemViewType(i);
        if (itemViewType == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver) {
                synchronized (this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                }
            } else if (i > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.write(i);
            }
        } else if (itemViewType == 1) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void onClick(View view) {
        if (view == this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
            this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.write());
            synchronized (this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            }
        } else if (view == this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = false;
            ActivityChooserView activityChooserView = this.MediaBrowserCompat$CustomActionResultReceiver;
            activityChooserView.MediaBrowserCompat$CustomActionResultReceiver(activityChooserView.MediaDescriptionCompat);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.write.getCount() > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = true;
                ActivityChooserView activityChooserView = this.MediaBrowserCompat$CustomActionResultReceiver;
                activityChooserView.MediaBrowserCompat$CustomActionResultReceiver(activityChooserView.MediaDescriptionCompat);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public final void onDismiss() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token.onDismiss();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem.write(false);
        }
    }
}
