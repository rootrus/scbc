package com.scb.phone.view.adapter.bond;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.RealmString;
import p040o.SequentialSearchRepositoryModule;
import p040o.ZHPR2;
import p040o.isTerminated;
import p040o.onStart;

public final class BondSelectionListAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public List<isTerminated> MediaBrowserCompat$ItemReceiver = new ArrayList();
    public BondSelectionListAdapter$MediaBrowserCompat$ItemReceiver write;

    public class HeaderViewHolder_ViewBinding implements Unbinder {
        private HeaderViewHolder MediaBrowserCompat$ItemReceiver;

        public HeaderViewHolder_ViewBinding(HeaderViewHolder headerViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = headerViewHolder;
            headerViewHolder.webSite = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_bond_list_header, "field 'webSite'", TextView.class);
        }

        public final void read() {
            HeaderViewHolder headerViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (headerViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                headerViewHolder.webSite = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class BondViewHolder_ViewBinding implements Unbinder {
        private BondViewHolder write;

        public BondViewHolder_ViewBinding(BondViewHolder bondViewHolder, View view) {
            this.write = bondViewHolder;
            bondViewHolder.bondArea = (CardView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_card_view, "field 'bondArea'", CardView.class);
            bondViewHolder.bondTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_title, "field 'bondTitle'", TextView.class);
            bondViewHolder.bondDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_details, "field 'bondDetails'", TextView.class);
            bondViewHolder.bondAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_account, "field 'bondAccount'", TextView.class);
            bondViewHolder.bondMinAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_min_amount, "field 'bondMinAmount'", TextView.class);
            bondViewHolder.bondValuePerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bond_value_per_unit, "field 'bondValuePerUnit'", TextView.class);
        }

        public final void read() {
            BondViewHolder bondViewHolder = this.write;
            if (bondViewHolder != null) {
                this.write = null;
                bondViewHolder.bondArea = null;
                bondViewHolder.bondTitle = null;
                bondViewHolder.bondDetails = null;
                bondViewHolder.bondAccount = null;
                bondViewHolder.bondMinAmount = null;
                bondViewHolder.bondValuePerUnit = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BondSelectionListAdapter(List<isTerminated> list, BondSelectionListAdapter$MediaBrowserCompat$ItemReceiver bondSelectionListAdapter$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = bondSelectionListAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        isTerminated isterminated = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (setcontentview.MediaBrowserCompat$CustomActionResultReceiver == 1) {
            BondViewHolder bondViewHolder = (BondViewHolder) setcontentview;
            bondViewHolder.bondTitle.setText(isterminated.MediaBrowserCompat$ItemReceiver);
            bondViewHolder.bondAccount.setText(isterminated.MediaBrowserCompat$SearchResultReceiver);
            bondViewHolder.bondDetails.setText(isterminated.MediaBrowserCompat$CustomActionResultReceiver);
            bondViewHolder.bondMinAmount.setText(isterminated.MediaDescriptionCompat);
            bondViewHolder.bondValuePerUnit.setText(isterminated.MediaSessionCompat$ResultReceiverWrapper);
            bondViewHolder.bondArea.setOnClickListener(new SequentialSearchRepositoryModule(this, isterminated));
            if (isterminated.RatingCompat) {
                bondViewHolder.bondArea.setBackgroundResource(R.drawable.shape_purple_border_rounded_bigger_rectangle);
            } else {
                bondViewHolder.bondArea.setBackgroundResource(R.drawable.card_selector_state_normal);
            }
        } else {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) setcontentview;
            Context context = headerViewHolder.webSite.getContext();
            headerViewHolder.webSite.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(context.getString(R.string.bond_msg_no_bonds_description_not_clickable), context.getString(R.string.bond_msg_no_bonds_description_clickable), context.getResources(), new RealmString(this, isterminated), false, 0));
            headerViewHolder.webSite.setMovementMethod(LinkMovementMethod.getInstance());
            headerViewHolder.webSite.setHighlightColor(0);
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new HeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82362131493462, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new BondViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82352131493461, viewGroup, false));
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i).MediaBrowserCompat$MediaItem;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public class BondViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView bondAccount;
        @BindView
        CardView bondArea;
        @BindView
        TextView bondDetails;
        @BindView
        TextView bondMinAmount;
        @BindView
        TextView bondTitle;
        @BindView
        TextView bondValuePerUnit;

        public BondViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class HeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView webSite;

        public HeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
