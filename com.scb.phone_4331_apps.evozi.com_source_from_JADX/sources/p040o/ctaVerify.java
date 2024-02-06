package p040o;

import android.view.View;
import com.scb.phone.view.adapter.limit.PersonalLimitAdapter;

/* renamed from: o.ctaVerify */
public final /* synthetic */ class ctaVerify implements View.OnFocusChangeListener {
    private final /* synthetic */ PersonalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ctaVerify(PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
    }

    public final void onFocusChange(View view, boolean z) {
        PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (!z) {
            limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        }
    }
}
