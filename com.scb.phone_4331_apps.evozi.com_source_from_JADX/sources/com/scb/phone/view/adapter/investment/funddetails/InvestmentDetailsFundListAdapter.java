package com.scb.phone.view.adapter.investment.funddetails;

import android.util.Log;
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
import p040o.doBackgroundInitializationAsync;
import p040o.getICheckDeserializerRtti;
import p040o.logException;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class InvestmentDetailsFundListAdapter extends onActivityCreated {
    private List<logException> MediaBrowserCompat$ItemReceiver;
    private doBackgroundInitializationAsync read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder write;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.write = itemViewHolder;
            itemViewHolder.fundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_code_text_view, "field 'fundCode'", TextView.class);
            itemViewHolder.clientNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_client_no_text_view, "field 'clientNo'", TextView.class);
            itemViewHolder.totalBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_current_value_text_view, "field 'totalBalance'", TextView.class);
            itemViewHolder.netGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_net_gain_text_view, "field 'netGain'", TextView.class);
            itemViewHolder.totalUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_units_text_view, "field 'totalUnit'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.write;
            if (itemViewHolder != null) {
                this.write = null;
                itemViewHolder.fundCode = null;
                itemViewHolder.clientNo = null;
                itemViewHolder.totalBalance = null;
                itemViewHolder.netGain = null;
                itemViewHolder.totalUnit = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public InvestmentDetailsFundListAdapter(doBackgroundInitializationAsync dobackgroundinitializationasync) {
        this.MediaBrowserCompat$ItemReceiver = dobackgroundinitializationasync.MediaBrowserCompat$MediaItem;
        this.read = dobackgroundinitializationasync;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Log.i("instantiateItem", "position");
        logException logexception = this.MediaBrowserCompat$ItemReceiver.get(i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83072131493533, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        itemViewHolder.fundCode.setText(logexception.MediaBrowserCompat$SearchResultReceiver);
        itemViewHolder.clientNo.setText(getICheckDeserializerRtti.MediaDescriptionCompat(this.read.IconCompatParcelizer));
        itemViewHolder.totalBalance.setText(logexception.AppCompatDialogFragment);
        itemViewHolder.totalUnit.setText(logexception.setContentView);
        itemViewHolder.netGain.setText(logexception.Keep);
        itemViewHolder.netGain.setTextColor(setLastBaselineToBottomHeight.read(inflate.getContext(), logexception.MediaSessionCompat$ResultReceiverWrapper));
        viewGroup.addView(inflate);
        return itemViewHolder.PlaybackStateCompat;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        TextView clientNo;
        @BindView
        TextView fundCode;
        @BindView
        TextView netGain;
        @BindView
        TextView totalBalance;
        @BindView
        TextView totalUnit;

        ItemViewHolder(View view) {
            super(view);
            this.PlaybackStateCompat = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
