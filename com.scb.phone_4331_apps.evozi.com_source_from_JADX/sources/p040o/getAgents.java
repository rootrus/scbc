package p040o;

import android.view.View;
import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;

/* renamed from: o.getAgents */
public final /* synthetic */ class getAgents implements View.OnClickListener {
    private final /* synthetic */ DepositTransactionAdapter.ChildViewHolder IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAgents(DepositTransactionAdapter.ChildViewHolder childViewHolder, int i) {
        this.IconCompatParcelizer = childViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        DepositTransactionAdapter.ChildViewHolder childViewHolder = this.IconCompatParcelizer;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (DepositTransactionAdapter.this.MediaSessionCompat$ResultReceiverWrapper != null) {
            childViewHolder.noteEditText.requestFocus();
            childViewHolder.read();
            DepositTransactionAdapter.this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(i, childViewHolder.write.getHeight());
        }
        childViewHolder.layoutNoteEdit.setVisibility(0);
        childViewHolder.textAddNote.setVisibility(8);
        childViewHolder.layoutNoteView.setVisibility(8);
    }
}
