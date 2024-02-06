package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.ClearableEditText;

/* renamed from: o.getTitleList */
public final /* synthetic */ class getTitleList implements View.OnClickListener {
    private final /* synthetic */ ClearableEditText MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTitleList(ClearableEditText clearableEditText) {
        this.MediaBrowserCompat$CustomActionResultReceiver = clearableEditText;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.inputEditText.setText("");
    }
}
