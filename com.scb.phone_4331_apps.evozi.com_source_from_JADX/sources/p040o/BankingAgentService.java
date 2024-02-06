package p040o;

import android.view.View;
import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;

/* renamed from: o.BankingAgentService */
public final /* synthetic */ class BankingAgentService implements View.OnClickListener {
    private final /* synthetic */ DepositTransactionAdapter.ChildViewHolder IconCompatParcelizer;
    private final /* synthetic */ int write;

    public /* synthetic */ BankingAgentService(DepositTransactionAdapter.ChildViewHolder childViewHolder, int i) {
        this.IconCompatParcelizer = childViewHolder;
        this.write = i;
    }

    public final void onClick(View view) {
        DepositTransactionAdapter.ChildViewHolder childViewHolder = this.IconCompatParcelizer;
        int i = this.write;
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
