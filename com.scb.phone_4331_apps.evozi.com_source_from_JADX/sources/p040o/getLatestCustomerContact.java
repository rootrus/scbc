package p040o;

import android.view.View;
import com.scb.phone.view.adapter.moneyaction.MoneyActionAdapter;

/* renamed from: o.getLatestCustomerContact */
public final /* synthetic */ class getLatestCustomerContact implements View.OnClickListener {
    private final /* synthetic */ MoneyActionAdapter.CustomViewHolder read;

    public /* synthetic */ getLatestCustomerContact(MoneyActionAdapter.CustomViewHolder customViewHolder) {
        this.read = customViewHolder;
    }

    public final void onClick(View view) {
        MoneyActionAdapter.CustomViewHolder customViewHolder = this.read;
        if (MoneyActionAdapter.this.read != null) {
            MoneyActionAdapter.this.read.IconCompatParcelizer(customViewHolder.Keep);
        }
    }
}
