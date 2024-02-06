package p040o;

import android.view.View;
import com.scb.phone.view.adapter.promptpay.PromptPayMobileListAdapter;

/* renamed from: o.getDonationList */
public final /* synthetic */ class getDonationList implements View.OnClickListener {
    private final /* synthetic */ PromptPayMobileListAdapter.PromptPayListView IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PromptPayMobileListAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getOverflowCount read;

    public /* synthetic */ getDonationList(PromptPayMobileListAdapter promptPayMobileListAdapter, PromptPayMobileListAdapter.PromptPayListView promptPayListView, getOverflowCount getoverflowcount, int i) {
        this.MediaBrowserCompat$ItemReceiver = promptPayMobileListAdapter;
        this.IconCompatParcelizer = promptPayListView;
        this.read = getoverflowcount;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        PromptPayMobileListAdapter promptPayMobileListAdapter = this.MediaBrowserCompat$ItemReceiver;
        PromptPayMobileListAdapter.PromptPayListView promptPayListView = this.IconCompatParcelizer;
        getOverflowCount getoverflowcount = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!promptPayListView.Keep) {
            promptPayListView.AlertController$RecycleListView = true;
            promptPayListView.mobileCheckbox.callOnClick();
        }
        promptPayListView.AlertController$RecycleListView = false;
        PromptPayMobileListAdapter.write write = promptPayMobileListAdapter.write;
        if (write != null) {
            write.MediaBrowserCompat$ItemReceiver(getoverflowcount, false);
            promptPayMobileListAdapter.write(i);
        }
    }
}
