package p040o;

import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;
import com.scb.phone.view.custom.common.NoteEditTextWithButton;

/* renamed from: o.putQrToPay */
public final /* synthetic */ class putQrToPay implements NoteEditTextWithButton.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DepositTransactionAdapter.ChildViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ putQrToPay(DepositTransactionAdapter.ChildViewHolder childViewHolder, int i) {
        this.MediaBrowserCompat$ItemReceiver = childViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer() {
        DepositTransactionAdapter.ChildViewHolder childViewHolder = this.MediaBrowserCompat$ItemReceiver;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!DepositTransactionAdapter.ChildViewHolder.MediaBrowserCompat$ItemReceiver(childViewHolder.noteEditText.mNoteEditText.getText().toString().trim())) {
            childViewHolder.noteEditText.write();
        } else if (DepositTransactionAdapter.this.MediaSessionCompat$ResultReceiverWrapper != null) {
            DepositTransactionAdapter depositTransactionAdapter = DepositTransactionAdapter.this;
            String trim = childViewHolder.noteEditText.mNoteEditText.getText().toString().trim();
            depositTransactionAdapter.MediaBrowserCompat$ItemReceiver = i;
            depositTransactionAdapter.read = trim;
            DepositTransactionAdapter.this.MediaSessionCompat$ResultReceiverWrapper.write(i, childViewHolder.noteEditText.mNoteEditText.getText().toString().trim());
        }
    }
}
