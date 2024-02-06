package p040o;

import android.view.View;
import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;

/* renamed from: o.setBarColorWhenSelected */
public final /* synthetic */ class setBarColorWhenSelected implements View.OnClickListener {
    private final /* synthetic */ BaseHorizontalBubbleAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ setBarColorWhenSelected(BaseHorizontalBubbleAdapter baseHorizontalBubbleAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = baseHorizontalBubbleAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$ItemReceiver.write(this.read, view);
    }
}
