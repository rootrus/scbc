package com.scb.phone.view.adapter.bulktransfer;

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
import p040o.Service;
import p040o.getCreditCardCategory;
import p040o.onStart;

public final class BulkTransferGroupAdapter extends RecyclerView.IconCompatParcelizer<GroupViewHolder> {
    private List<Service.State> MediaBrowserCompat$ItemReceiver;
    public BulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver write;

    public class GroupViewHolder_ViewBinding implements Unbinder {
        private GroupViewHolder IconCompatParcelizer;

        public GroupViewHolder_ViewBinding(GroupViewHolder groupViewHolder, View view) {
            this.IconCompatParcelizer = groupViewHolder;
            groupViewHolder.dividerView = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'dividerView'");
            groupViewHolder.footerDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDividerView'");
            groupViewHolder.groupName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_name, "field 'groupName'", TextView.class);
            groupViewHolder.recipientsNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipients_number, "field 'recipientsNumber'", TextView.class);
            groupViewHolder.totalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'totalAmount'", TextView.class);
        }

        public final void read() {
            GroupViewHolder groupViewHolder = this.IconCompatParcelizer;
            if (groupViewHolder != null) {
                this.IconCompatParcelizer = null;
                groupViewHolder.dividerView = null;
                groupViewHolder.footerDividerView = null;
                groupViewHolder.groupName = null;
                groupViewHolder.recipientsNumber = null;
                groupViewHolder.totalAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        GroupViewHolder groupViewHolder = (GroupViewHolder) setcontentview;
        Service.State state = this.MediaBrowserCompat$ItemReceiver.get(i);
        List<Service.State> list = this.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if ((list == null ? 0 : list.size()) - 1 != i) {
            z = false;
        }
        groupViewHolder.groupName.setText(state.MediaBrowserCompat$CustomActionResultReceiver);
        groupViewHolder.recipientsNumber.setText(state.read);
        groupViewHolder.totalAmount.setText(state.MediaBrowserCompat$SearchResultReceiver);
        if (z) {
            groupViewHolder.dividerView.setVisibility(8);
            groupViewHolder.footerDividerView.setVisibility(0);
        } else {
            groupViewHolder.dividerView.setVisibility(0);
            groupViewHolder.footerDividerView.setVisibility(8);
        }
        groupViewHolder.write.setOnClickListener(new getCreditCardCategory(this, state));
    }

    public BulkTransferGroupAdapter(List<Service.State> list, BulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver bulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = bulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final int IconCompatParcelizer() {
        List<Service.State> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class GroupViewHolder extends RecyclerView.setContentView {
        @BindView
        View dividerView;
        @BindView
        View footerDividerView;
        @BindView
        TextView groupName;
        @BindView
        TextView recipientsNumber;
        @BindView
        TextView totalAmount;

        public GroupViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new GroupViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81132131493339, viewGroup, false));
    }
}
