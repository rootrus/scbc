package p040o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.completeSubmission$MediaBrowserCompat$CustomActionResultReceiver */
public final class completeSubmission$MediaBrowserCompat$CustomActionResultReceiver extends setGuidelineBegin {

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private /* synthetic */ completeSubmission f3165x50fd9e4a;
    private /* synthetic */ RecyclerView write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    completeSubmission$MediaBrowserCompat$CustomActionResultReceiver(completeSubmission completesubmission, RecyclerView recyclerView, Context context) {
        super(context);
        this.f3165x50fd9e4a = completesubmission;
        this.write = recyclerView;
    }

    public final void read(View view, RecyclerView.Keep keep, RecyclerView.PlaybackStateCompat.write write2) {
        onGetStartedClick.write((Object) view, "targetView");
        onGetStartedClick.write((Object) keep, "state");
        onGetStartedClick.write((Object) write2, "action");
        super.read(view, keep, write2);
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.write.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            onGetStartedClick.IconCompatParcelizer((Object) recyclerView$MediaBrowserCompat$SearchResultReceiver, "recyclerView.layoutManager ?: return");
            int[] MediaBrowserCompat$CustomActionResultReceiver = this.f3165x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver, view);
            int i = MediaBrowserCompat$CustomActionResultReceiver[0];
            int i2 = MediaBrowserCompat$CustomActionResultReceiver[1];
            int ceil = (int) Math.ceil(((double) MediaBrowserCompat$ItemReceiver(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
            if (ceil > 0) {
                write2.read = i;
                write2.IconCompatParcelizer = i2;
                write2.MediaBrowserCompat$CustomActionResultReceiver = ceil;
                write2.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
                write2.write = true;
            }
        }
    }

    public final float MediaBrowserCompat$CustomActionResultReceiver(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) (displayMetrics != null ? displayMetrics.densityDpi : 1));
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        return Math.min(100, super.MediaBrowserCompat$ItemReceiver(i));
    }
}
