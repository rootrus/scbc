package p040o;

import android.view.View;
import com.scb.phone.view.adapter.demontb.BankingServiceAdapter;

/* renamed from: o.getAppConfig */
public final /* synthetic */ class getAppConfig implements View.OnClickListener {
    private final /* synthetic */ BankingServiceAdapter.CustomViewHolder IconCompatParcelizer;

    public /* synthetic */ getAppConfig(BankingServiceAdapter.CustomViewHolder customViewHolder) {
        this.IconCompatParcelizer = customViewHolder;
    }

    public final void onClick(View view) {
        BankingServiceAdapter.CustomViewHolder customViewHolder = this.IconCompatParcelizer;
        if (BankingServiceAdapter.this.write != null) {
            BankingServiceAdapter.this.write.IconCompatParcelizer(customViewHolder.setHasDecor);
        }
    }
}
