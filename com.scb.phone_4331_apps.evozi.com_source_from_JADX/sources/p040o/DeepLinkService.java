package p040o;

import android.view.View;
import com.scb.phone.view.adapter.limit.PersonalLimitAdapter;

/* renamed from: o.DeepLinkService */
public final /* synthetic */ class DeepLinkService implements View.OnClickListener {
    private final /* synthetic */ PersonalLimitAdapter.LimitCustomViewHolder write;

    public /* synthetic */ DeepLinkService(PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.write = limitCustomViewHolder;
    }

    public final void onClick(View view) {
        PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.write;
        limitCustomViewHolder.IconCompatParcelizer(!limitCustomViewHolder.Keep);
    }
}
