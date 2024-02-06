package p040o;

import com.scb.phone.view.adapter.BaseHorizontalBubbleAdapter;
import java.util.List;

/* renamed from: o.getEasycashIntroductions */
public final class getEasycashIntroductions extends BaseHorizontalBubbleAdapter {
    private boolean RatingCompat = false;
    private Double read;

    public getEasycashIntroductions(List<Integer> list, Double d) {
        super(list, (BaseHorizontalBubbleAdapter.IconCompatParcelizer) null);
        this.read = d;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == this.MediaBrowserCompat$ItemReceiver) {
            return 0;
        }
        return (this.RatingCompat || ((double) this.write.get(i).intValue()) <= this.read.doubleValue()) ? 1 : 2;
    }

    public final void IconCompatParcelizer(Double d, boolean z) {
        this.read = d;
        this.RatingCompat = z;
        if (!z && this.MediaBrowserCompat$ItemReceiver != -1 && ((double) this.write.get(this.MediaBrowserCompat$ItemReceiver).intValue()) > d.doubleValue()) {
            this.MediaBrowserCompat$ItemReceiver = -1;
        }
        this.IconCompatParcelizer.write();
    }
}
