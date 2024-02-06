package com.scb.phone.view.adapter.bankingagent;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.bankingagent.BankingAgentAdapter;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;

/* renamed from: com.scb.phone.view.adapter.bankingagent.BankingAgentAdapter$ItemViewHolder$MediaBrowserCompat$ItemReceiver */
final class C5728x4c7c9dd4 implements View.OnClickListener {
    private /* synthetic */ BankingAgentAdapter.ItemViewHolder IconCompatParcelizer;

    C5728x4c7c9dd4(BankingAgentAdapter.ItemViewHolder itemViewHolder) {
        this.IconCompatParcelizer = itemViewHolder;
    }

    public final void onClick(View view) {
        int i;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment write = this.IconCompatParcelizer.AlertController$RecycleListView.RatingCompat;
        if (write != null) {
            BankingAgentAdapter.ItemViewHolder itemViewHolder = this.IconCompatParcelizer;
            RecyclerView recyclerView = itemViewHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) itemViewHolder);
            }
            write.read(i);
        }
    }
}
