package p040o;

import android.view.View;
import com.scb.phone.view.adapter.limit.DebitsLimitAdapter;

/* renamed from: o.verifyDebitCardActivation */
public final /* synthetic */ class verifyDebitCardActivation implements View.OnClickListener {
    private final /* synthetic */ nonNull MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DebitsLimitAdapter.LimitCustomViewHolder read;

    public /* synthetic */ verifyDebitCardActivation(DebitsLimitAdapter.LimitCustomViewHolder limitCustomViewHolder, nonNull nonnull) {
        this.read = limitCustomViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = nonnull;
    }

    public final void onClick(View view) {
        DebitsLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.read;
        nonNull nonnull = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (DebitsLimitAdapter.this.write != null) {
            DebitsLimitAdapter.this.write.IconCompatParcelizer(nonnull);
        }
    }
}
