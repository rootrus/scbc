package p040o;

import android.view.View;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;

/* renamed from: o.getRecipients */
public final /* synthetic */ class getRecipients implements View.OnClickListener {
    private final /* synthetic */ HmlOutcomeCounterAdapter.UpsellOfferViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getRecipients(HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = upsellOfferViewHolder;
    }

    public final void onClick(View view) {
        HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        upsellOfferViewHolder.PlaybackStateCompat.removeCallbacks(upsellOfferViewHolder.Keep);
    }
}
