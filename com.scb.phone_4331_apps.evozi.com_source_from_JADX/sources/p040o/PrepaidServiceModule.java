package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.PurchaseWithdrawalLimitAdapter;

/* renamed from: o.PrepaidServiceModule */
public final /* synthetic */ class PrepaidServiceModule implements View.OnClickListener {
    private final /* synthetic */ nonNull IconCompatParcelizer;
    private final /* synthetic */ PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ PrepaidServiceModule(PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder, nonNull nonnull) {
        this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
        this.IconCompatParcelizer = nonnull;
    }

    public final void onClick(View view) {
        PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
        nonNull nonnull = this.IconCompatParcelizer;
        limitCustomViewHolder.limitInput.inputValue.clearFocus();
        limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        if (limitCustomViewHolder.limitInput.IconCompatParcelizer != ((double) nonnull.MediaBrowserCompat$SearchResultReceiver.intValue())) {
            PurchaseWithdrawalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new newEntry(nonnull.read, nonnull.MediaMetadataCompat.intValue(), Integer.valueOf((int) limitCustomViewHolder.limitInput.IconCompatParcelizer)), false);
            return;
        }
        limitCustomViewHolder.MediaBrowserCompat$ItemReceiver(false);
        PurchaseWithdrawalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
    }
}
