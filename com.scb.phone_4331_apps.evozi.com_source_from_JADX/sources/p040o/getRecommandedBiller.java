package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p040o.getRepeat;

/* renamed from: o.getRecommandedBiller */
public final /* synthetic */ class getRecommandedBiller implements View.OnClickListener {
    private final /* synthetic */ getRepeat.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getRepeat.write write;

    public /* synthetic */ getRecommandedBiller(getRepeat.read read, getRepeat.write write2) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.write = write2;
    }

    public final void onClick(View view) {
        int i;
        getRepeat.read read = this.MediaBrowserCompat$ItemReceiver;
        getRepeat.write write2 = this.write;
        RecyclerView recyclerView = read.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) read);
        }
        write2.read(i);
    }
}
