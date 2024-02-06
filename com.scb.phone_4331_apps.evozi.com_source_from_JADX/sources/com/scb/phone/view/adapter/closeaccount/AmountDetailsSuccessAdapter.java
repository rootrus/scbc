package com.scb.phone.view.adapter.closeaccount;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.ForwardingFuture;
import p040o.addDependent;
import p040o.onStart;
import p040o.race;

public final class AmountDetailsSuccessAdapter extends RecyclerView.IconCompatParcelizer<DetailViewHolder> {
    private List<addDependent> write;

    public class SuccessRow_ViewBinding implements Unbinder {
        private SuccessRow IconCompatParcelizer;

        public SuccessRow_ViewBinding(SuccessRow successRow, View view) {
            this.IconCompatParcelizer = successRow;
            successRow.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'textTitle'", TextView.class);
            successRow.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'textAmount'", TextView.class);
        }

        public final void read() {
            SuccessRow successRow = this.IconCompatParcelizer;
            if (successRow != null) {
                this.IconCompatParcelizer = null;
                successRow.textTitle = null;
                successRow.textAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class DetailViewHolder_ViewBinding implements Unbinder {
        private DetailViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public DetailViewHolder_ViewBinding(DetailViewHolder detailViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = detailViewHolder;
            detailViewHolder.layoutTotalAmount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_total_amount, "field 'layoutTotalAmount'", LinearLayout.class);
            detailViewHolder.textLeft = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_left, "field 'textLeft'", TextView.class);
            detailViewHolder.textRight = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right, "field 'textRight'", TextView.class);
            detailViewHolder.layoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_details_container, "field 'layoutContainer'", LinearLayout.class);
            detailViewHolder.depositNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_details_container_title, "field 'depositNumber'", TextView.class);
            detailViewHolder.dividerView = onStart.IconCompatParcelizer(view, R.id.divider, "field 'dividerView'");
        }

        public final void read() {
            DetailViewHolder detailViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (detailViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                detailViewHolder.layoutTotalAmount = null;
                detailViewHolder.textLeft = null;
                detailViewHolder.textRight = null;
                detailViewHolder.layoutContainer = null;
                detailViewHolder.depositNumber = null;
                detailViewHolder.dividerView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DetailViewHolder detailViewHolder = (DetailViewHolder) setcontentview;
        addDependent adddependent = this.write.get(i);
        int i2 = 0;
        boolean z = i == this.write.size() - 1;
        detailViewHolder.depositNumber.setText(detailViewHolder.write.getContext().getString(R.string.close_account_details_container_title, new Object[]{adddependent.read}));
        for (ForwardingFuture next : adddependent.write) {
            if (next instanceof race) {
                race race = (race) next;
                SuccessRow successRow = new SuccessRow(LayoutInflater.from(detailViewHolder.write.getContext()).inflate(R.layout.f81322131493358, (ViewGroup) null, false));
                successRow.textTitle.setText(race.RatingCompat);
                successRow.textAmount.setText(race.MediaBrowserCompat$SearchResultReceiver);
                detailViewHolder.layoutContainer.addView(successRow.read);
            }
        }
        if (adddependent.IconCompatParcelizer != null) {
            detailViewHolder.layoutTotalAmount.setVisibility(0);
            if (adddependent.IconCompatParcelizer instanceof race) {
                race race2 = (race) adddependent.IconCompatParcelizer;
                detailViewHolder.textLeft.setText(race2.RatingCompat);
                detailViewHolder.textRight.setText(race2.MediaBrowserCompat$SearchResultReceiver);
            }
        } else {
            detailViewHolder.layoutTotalAmount.setVisibility(8);
        }
        View view = detailViewHolder.dividerView;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public AmountDetailsSuccessAdapter(List<addDependent> list) {
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    protected static class DetailViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView depositNumber;
        @BindView
        View dividerView;
        @BindView
        LinearLayout layoutContainer;
        @BindView
        LinearLayout layoutTotalAmount;
        @BindView
        TextView textLeft;
        @BindView
        TextView textRight;

        DetailViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    protected static class SuccessRow {
        View read;
        @BindView
        TextView textAmount;
        @BindView
        TextView textTitle;

        SuccessRow(View view) {
            ButterKnife.IconCompatParcelizer(this, view);
            this.read = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81312131493357, viewGroup, false));
    }
}
