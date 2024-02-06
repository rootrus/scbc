package com.scb.phone.view.adapter.investment.discover;

import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindBulkTransferReviewFragment;

/* renamed from: com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter$CheckListHolder$MediaBrowserCompat$ItemReceiver */
final class C5759x2c9a8f53 implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ DiscoverFundFilterAdapter.CheckListHolder write;

    C5759x2c9a8f53(DiscoverFundFilterAdapter.CheckListHolder checkListHolder) {
        this.write = checkListHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (!this.write.AlertController$RecycleListView) {
            DiscoverFundFilterAdapter discoverFundFilterAdapter = this.write.Keep;
            DiscoverFundFilterAdapter.CheckListHolder checkListHolder = this.write;
            RecyclerView recyclerView = checkListHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) checkListHolder);
            }
            Object MediaBrowserCompat$CustomActionResultReceiver = DiscoverFundFilterAdapter.MediaBrowserCompat$CustomActionResultReceiver(discoverFundFilterAdapter, i);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                String str = ((DiscoverFundFilterAdapter.read) MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                FragmentBuilder_BindBulkTransferReviewFragment MediaBrowserCompat$ItemReceiver = this.write.Keep.RatingCompat;
                if (MediaBrowserCompat$ItemReceiver != null) {
                    MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str, z);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter.CheckboxListObject");
        }
    }
}
