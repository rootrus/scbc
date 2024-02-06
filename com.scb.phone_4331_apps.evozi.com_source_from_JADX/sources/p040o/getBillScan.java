package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.CustomCheckboxAdapter;

/* renamed from: o.getBillScan */
public final /* synthetic */ class getBillScan implements View.OnClickListener {
    private final /* synthetic */ CustomCheckboxAdapter.write MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ performUpdateApp write;

    public /* synthetic */ getBillScan(performUpdateApp performupdateapp, CustomCheckboxAdapter.write write2) {
        this.write = performupdateapp;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }

    public final void onClick(View view) {
        CustomCheckboxAdapter.CheckBoxViewHolder.MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
