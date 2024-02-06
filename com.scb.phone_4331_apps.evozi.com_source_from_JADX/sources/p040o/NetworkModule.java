package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.DebitWithdrawalLimitAdapter;

/* renamed from: o.NetworkModule */
public final /* synthetic */ class NetworkModule implements View.OnClickListener {
    private final /* synthetic */ nonNull MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DebitWithdrawalLimitAdapter.LimitCustomViewHolder write;

    public /* synthetic */ NetworkModule(DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder, nonNull nonnull) {
        this.write = limitCustomViewHolder;
        this.MediaBrowserCompat$ItemReceiver = nonnull;
    }

    public final void onClick(View view) {
        DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.write;
        nonNull nonnull = this.MediaBrowserCompat$ItemReceiver;
        limitCustomViewHolder.limitInput.inputValue.clearFocus();
        limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        if (limitCustomViewHolder.limitInput.IconCompatParcelizer != ((double) nonnull.MediaMetadataCompat.intValue())) {
            DebitWithdrawalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new newEntry(nonnull.read, (int) limitCustomViewHolder.limitInput.IconCompatParcelizer, nonnull.MediaBrowserCompat$SearchResultReceiver), true);
            return;
        }
        limitCustomViewHolder.MediaBrowserCompat$CustomActionResultReceiver(false);
        DebitWithdrawalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
    }
}
