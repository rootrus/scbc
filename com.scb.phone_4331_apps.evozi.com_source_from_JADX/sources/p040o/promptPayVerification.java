package p040o;

import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;
import java.util.List;

/* renamed from: o.promptPayVerification */
public final class promptPayVerification extends BaseHorizontalBubbleAdapter {
    public promptPayVerification(List<Integer> list) {
        super(list, (BaseHorizontalBubbleAdapter.IconCompatParcelizer) null);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == this.MediaBrowserCompat$ItemReceiver ? 0 : 1;
    }
}
