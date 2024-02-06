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
import p040o.addDependent;
import p040o.onStart;
import p040o.race;

public final class AmountDetailsAdapter extends RecyclerView.IconCompatParcelizer<DetailViewHolder> {
    private List<addDependent> read;

    public class SuccessRow_ViewBinding implements Unbinder {
        private SuccessRow MediaBrowserCompat$ItemReceiver;

        public SuccessRow_ViewBinding(SuccessRow successRow, View view) {
            this.MediaBrowserCompat$ItemReceiver = successRow;
            successRow.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'textTitle'", TextView.class);
            successRow.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'textAmount'", TextView.class);
            successRow.viewLine = onStart.IconCompatParcelizer(view, R.id.line, "field 'viewLine'");
        }

        public final void read() {
            SuccessRow successRow = this.MediaBrowserCompat$ItemReceiver;
            if (successRow != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                successRow.textTitle = null;
                successRow.textAmount = null;
                successRow.viewLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class DetailViewHolder_ViewBinding implements Unbinder {
        private DetailViewHolder write;

        public DetailViewHolder_ViewBinding(DetailViewHolder detailViewHolder, View view) {
            this.write = detailViewHolder;
            detailViewHolder.layoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_details_container, "field 'layoutContainer'", LinearLayout.class);
            detailViewHolder.depositNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_details_container_title, "field 'depositNumber'", TextView.class);
        }

        public final void read() {
            DetailViewHolder detailViewHolder = this.write;
            if (detailViewHolder != null) {
                this.write = null;
                detailViewHolder.layoutContainer = null;
                detailViewHolder.depositNumber = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DetailViewHolder detailViewHolder = (DetailViewHolder) setcontentview;
        addDependent adddependent = this.read.get(i);
        detailViewHolder.depositNumber.setText(detailViewHolder.write.getContext().getString(R.string.close_account_details_container_title, new Object[]{adddependent.read}));
        detailViewHolder.layoutContainer.removeAllViews();
        int i2 = 0;
        while (i2 < adddependent.write.size()) {
            if (adddependent.write.get(i2) instanceof race) {
                View inflate = LayoutInflater.from(detailViewHolder.write.getContext()).inflate(R.layout.f81302131493356, (ViewGroup) null, false);
                race race = (race) adddependent.write.get(i2);
                SuccessRow successRow = new SuccessRow(inflate);
                boolean z = i2 == adddependent.write.size() + -2;
                successRow.textTitle.setText(race.RatingCompat);
                successRow.textAmount.setText(race.MediaBrowserCompat$SearchResultReceiver);
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) successRow.viewLine.getLayoutParams();
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    successRow.viewLine.setLayoutParams(marginLayoutParams);
                }
                detailViewHolder.layoutContainer.addView(successRow.read);
            }
            i2++;
        }
    }

    public AmountDetailsAdapter(List<addDependent> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    protected static class DetailViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView depositNumber;
        @BindView
        LinearLayout layoutContainer;

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
        @BindView
        View viewLine;

        SuccessRow(View view) {
            ButterKnife.IconCompatParcelizer(this, view);
            this.read = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81292131493355, viewGroup, false));
    }
}
