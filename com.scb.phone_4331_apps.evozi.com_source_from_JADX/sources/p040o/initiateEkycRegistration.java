package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.BubbleSelector;

/* renamed from: o.initiateEkycRegistration */
public final /* synthetic */ class initiateEkycRegistration implements View.OnClickListener {
    private final /* synthetic */ BubbleSelector read;

    public /* synthetic */ initiateEkycRegistration(BubbleSelector bubbleSelector) {
        this.read = bubbleSelector;
    }

    public final void onClick(View view) {
        BubbleSelector bubbleSelector = this.read;
        bubbleSelector.setSelected(!bubbleSelector.read);
        BubbleSelector.read read2 = bubbleSelector.MediaBrowserCompat$ItemReceiver;
        if (read2 != null) {
            read2.write(bubbleSelector.write, bubbleSelector.read);
        }
    }
}
