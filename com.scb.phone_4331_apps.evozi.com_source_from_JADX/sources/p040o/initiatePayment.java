package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bulktransfer.SelectRecipientFromFavouriteAdapter;

/* renamed from: o.initiatePayment */
public final /* synthetic */ class initiatePayment implements View.OnClickListener {
    private final /* synthetic */ SelectRecipientFromFavouriteAdapter.RecipientViewHolder IconCompatParcelizer;
    private final /* synthetic */ setNameFormat MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ initiatePayment(SelectRecipientFromFavouriteAdapter.RecipientViewHolder recipientViewHolder, setNameFormat setnameformat, int i) {
        this.IconCompatParcelizer = recipientViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = setnameformat;
        this.write = i;
    }

    public final void onClick(View view) {
        SelectRecipientFromFavouriteAdapter.RecipientViewHolder recipientViewHolder = this.IconCompatParcelizer;
        setNameFormat setnameformat = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.write;
        setnameformat.MediaMetadataCompat = !setnameformat.MediaMetadataCompat;
        recipientViewHolder.Keep.read(i);
    }
}
