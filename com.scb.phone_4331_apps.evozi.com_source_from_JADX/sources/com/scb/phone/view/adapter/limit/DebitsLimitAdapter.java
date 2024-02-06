package com.scb.phone.view.adapter.limit;

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
import java.util.ArrayList;
import java.util.List;
import p040o.nonNull;
import p040o.onStart;
import p040o.verifyDebitCardActivation;

public final class DebitsLimitAdapter extends RecyclerView.IconCompatParcelizer<LimitCustomViewHolder> {
    public List<nonNull> read = new ArrayList(1);
    public DebitsLimitAdapter$MediaBrowserCompat$CustomActionResultReceiver write;

    public class LimitCustomViewHolder_ViewBinding implements Unbinder {
        private LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;

        public LimitCustomViewHolder_ViewBinding(LimitCustomViewHolder limitCustomViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
            limitCustomViewHolder.rootLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.own_debit_account_layout, "field 'rootLayout'", LinearLayout.class);
            limitCustomViewHolder.cardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_no, "field 'cardNo'", TextView.class);
            limitCustomViewHolder.productName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.product_name, "field 'productName'", TextView.class);
            limitCustomViewHolder.nickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nickname, "field 'nickName'", TextView.class);
        }

        public final void read() {
            LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (limitCustomViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                limitCustomViewHolder.rootLayout = null;
                limitCustomViewHolder.cardNo = null;
                limitCustomViewHolder.productName = null;
                limitCustomViewHolder.nickName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LimitCustomViewHolder limitCustomViewHolder = (LimitCustomViewHolder) setcontentview;
        nonNull nonnull = this.read.get(i);
        limitCustomViewHolder.cardNo.setText(nonnull.MediaBrowserCompat$CustomActionResultReceiver);
        limitCustomViewHolder.productName.setText(nonnull.MediaBrowserCompat$MediaItem);
        String str = nonnull.MediaDescriptionCompat;
        if (str == null || str.isEmpty()) {
            limitCustomViewHolder.nickName.setVisibility(8);
        } else {
            limitCustomViewHolder.nickName.setText(nonnull.MediaDescriptionCompat);
            limitCustomViewHolder.nickName.setVisibility(0);
        }
        limitCustomViewHolder.rootLayout.setOnClickListener(new verifyDebitCardActivation(limitCustomViewHolder, nonnull));
    }

    public final int IconCompatParcelizer() {
        List<nonNull> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class LimitCustomViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView cardNo;
        @BindView
        TextView nickName;
        @BindView
        TextView productName;
        @BindView
        LinearLayout rootLayout;

        LimitCustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LimitCustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82542131493480, (ViewGroup) null));
    }
}
