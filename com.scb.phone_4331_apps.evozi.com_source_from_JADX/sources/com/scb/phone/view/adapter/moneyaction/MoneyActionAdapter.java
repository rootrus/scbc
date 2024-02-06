package com.scb.phone.view.adapter.moneyaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.getLatestCustomerContact;
import p040o.onStart;

public final class MoneyActionAdapter extends RecyclerView.IconCompatParcelizer<CustomViewHolder> {
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBaseRequestToPayFragment read;
    private List<Integer> write;

    public class CustomViewHolder_ViewBinding implements Unbinder {
        private CustomViewHolder write;

        public CustomViewHolder_ViewBinding(CustomViewHolder customViewHolder, View view) {
            this.write = customViewHolder;
            customViewHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_action_icon, "field 'icon'", ImageView.class);
            customViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_action_description, "field 'description'", TextView.class);
        }

        public final void read() {
            CustomViewHolder customViewHolder = this.write;
            if (customViewHolder != null) {
                this.write = null;
                customViewHolder.icon = null;
                customViewHolder.description = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CustomViewHolder customViewHolder = (CustomViewHolder) setcontentview;
        Integer num = this.write.get(i);
        customViewHolder.Keep = num.intValue();
        int intValue = num.intValue();
        if (intValue == 0) {
            customViewHolder.icon.setImageResource(R.drawable.ic_request_money);
            customViewHolder.description.setText(R.string.money_action_request_money_new);
        } else if (intValue == 1) {
            customViewHolder.icon.setImageResource(R.drawable.ic_cardless_atm);
            customViewHolder.description.setText(R.string.money_action_cardless_atm);
        } else if (intValue == 2) {
            customViewHolder.icon.setImageResource(R.drawable.ic_scan);
            customViewHolder.description.setText(R.string.money_action_scan);
        } else if (intValue == 3) {
            customViewHolder.icon.setImageResource(R.drawable.ic_top_up);
            customViewHolder.description.setText(R.string.money_action_top_up);
        } else if (intValue == 4) {
            customViewHolder.icon.setImageResource(R.drawable.ic_transfer);
            customViewHolder.description.setText(R.string.money_action_transfer);
        } else if (intValue == 5) {
            customViewHolder.icon.setImageResource(R.drawable.ic_bill_payment);
            customViewHolder.description.setText(R.string.money_action_bill_payment);
        }
    }

    public MoneyActionAdapter(FragmentBuilder_BindBaseRequestToPayFragment fragmentBuilder_BindBaseRequestToPayFragment, List<Integer> list) {
        this.read = fragmentBuilder_BindBaseRequestToPayFragment;
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        List<Integer> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public class CustomViewHolder extends RecyclerView.setContentView {
        public int Keep;
        @BindView
        TextView description;
        @BindView
        ImageView icon;

        CustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            view.setOnClickListener(new getLatestCustomerContact(this));
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83362131493562, (ViewGroup) null));
    }
}
