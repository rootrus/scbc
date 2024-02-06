package com.scb.phone.view.adapter.investment.discover;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter;
import kotlin.TypeCastException;

/* renamed from: com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter$SelectListHolder$MediaBrowserCompat$ItemReceiver */
final class C5761xa64de9d implements View.OnClickListener {
    private /* synthetic */ DiscoverFundFilterAdapter.SelectListHolder MediaBrowserCompat$ItemReceiver;

    C5761xa64de9d(DiscoverFundFilterAdapter.SelectListHolder selectListHolder) {
        this.MediaBrowserCompat$ItemReceiver = selectListHolder;
    }

    public final void onClick(View view) {
        int i;
        if (this.MediaBrowserCompat$ItemReceiver.setHasDecor.RatingCompat != null) {
            DiscoverFundFilterAdapter discoverFundFilterAdapter = this.MediaBrowserCompat$ItemReceiver.setHasDecor;
            DiscoverFundFilterAdapter.SelectListHolder selectListHolder = this.MediaBrowserCompat$ItemReceiver;
            RecyclerView recyclerView = selectListHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) selectListHolder);
            }
            Object MediaBrowserCompat$CustomActionResultReceiver = DiscoverFundFilterAdapter.MediaBrowserCompat$CustomActionResultReceiver(discoverFundFilterAdapter, i);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                DiscoverFundFilterAdapter.write write = ((C5760x53b8e5b6) MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
                if (write == DiscoverFundFilterAdapter.write.TYPE_OF_FUNDS) {
                    this.MediaBrowserCompat$ItemReceiver.setHasDecor.RatingCompat.write();
                } else if (write == DiscoverFundFilterAdapter.write.BROKERS) {
                    this.MediaBrowserCompat$ItemReceiver.setHasDecor.RatingCompat.IconCompatParcelizer();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter.SelectListObject");
            }
        }
    }
}
