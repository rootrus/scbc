package p040o;

import android.view.View;
import com.scb.phone.view.adapter.profilemanagement.ManagePromptpayProxyAdapter;

/* renamed from: o.DirectDebitService */
public final /* synthetic */ class DirectDebitService implements View.OnClickListener {
    private final /* synthetic */ setExecution MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ManagePromptpayProxyAdapter.ManagePromptpayViewHolder write;

    public /* synthetic */ DirectDebitService(ManagePromptpayProxyAdapter.ManagePromptpayViewHolder managePromptpayViewHolder, setExecution setexecution) {
        this.write = managePromptpayViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = setexecution;
    }

    public final void onClick(View view) {
        ManagePromptpayProxyAdapter.ManagePromptpayViewHolder managePromptpayViewHolder = this.write;
        setExecution setexecution = this.MediaBrowserCompat$CustomActionResultReceiver;
        ManagePromptpayProxyAdapter.write write2 = managePromptpayViewHolder.Keep;
        if (write2 != null) {
            write2.MediaBrowserCompat$ItemReceiver(setexecution);
        }
    }
}
