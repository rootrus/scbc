package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bulktransfer.RecipientsAdapter;

/* renamed from: o.verifyUser */
public final /* synthetic */ class verifyUser implements View.OnFocusChangeListener {
    private final /* synthetic */ RecipientsAdapter.RecipientsHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ verifyUser(RecipientsAdapter.RecipientsHolder recipientsHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = recipientsHolder;
    }

    public final void onFocusChange(View view, boolean z) {
        RecipientsAdapter.RecipientsHolder recipientsHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (recipientsHolder.Keep != null && !z) {
            String obj = recipientsHolder.amountEditText.getText().toString();
            recipientsHolder.write(obj);
            recipientsHolder.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj).doubleValue());
            recipientsHolder.Keep.write();
        }
    }
}
