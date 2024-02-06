package p040o;

import com.scb.phone.view.custom.common.MwAmountEditText;
import com.scb.phone.view.custom.common.MwAmountEditText$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getReceivedGifting */
public final /* synthetic */ class getReceivedGifting implements MwAmountEditText$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwAmountEditText write;

    public /* synthetic */ getReceivedGifting(MwAmountEditText mwAmountEditText) {
        this.write = mwAmountEditText;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MwAmountEditText.read read = this.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            read.read();
        }
    }
}
