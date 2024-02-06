package com.scb.phone.view.adapter.investment.offshorecurrency;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.onStart;
import p040o.userDataToJson;

public final class CurrencyAdapter extends RecyclerView.IconCompatParcelizer<CurrencyHolder> {
    private List<userDataToJson> write;

    public class CurrencyHolder_ViewBinding implements Unbinder {
        private CurrencyHolder write;

        public CurrencyHolder_ViewBinding(CurrencyHolder currencyHolder, View view) {
            this.write = currencyHolder;
            currencyHolder.currencyTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_currency_label, "field 'currencyTv'", TextView.class);
            currencyHolder.amountTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_currency_amount, "field 'amountTv'", TextView.class);
            currencyHolder.amountTH = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.currency_amount_TH, "field 'amountTH'", TextView.class);
        }

        public final void read() {
            CurrencyHolder currencyHolder = this.write;
            if (currencyHolder != null) {
                this.write = null;
                currencyHolder.currencyTv = null;
                currencyHolder.amountTv = null;
                currencyHolder.amountTH = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CurrencyHolder currencyHolder = (CurrencyHolder) setcontentview;
        userDataToJson userdatatojson = this.write.get(i);
        currencyHolder.currencyTv.setText(userdatatojson.MediaBrowserCompat$ItemReceiver);
        currencyHolder.amountTv.setText(userdatatojson.MediaBrowserCompat$CustomActionResultReceiver);
        currencyHolder.amountTH.setText(userdatatojson.IconCompatParcelizer);
    }

    public CurrencyAdapter(List<userDataToJson> list) {
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    static class CurrencyHolder extends RecyclerView.setContentView {
        @BindView
        TextView amountTH;
        @BindView
        TextView amountTv;
        @BindView
        TextView currencyTv;

        CurrencyHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CurrencyHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82422131493468, viewGroup, false));
    }
}
