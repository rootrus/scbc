package com.scb.phone.view.adapter.etb;

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
import p040o.FragmentBuilder_BindBondPurchaseSuccessFragment;
import p040o.confirmPurchaseBondV2;
import p040o.doOpenSession;
import p040o.onStart;

public final class ETBSaleSheetAccountTypeAdapter extends RecyclerView.IconCompatParcelizer<ETBSaleSheetHolder> {
    public FragmentBuilder_BindBondPurchaseSuccessFragment MediaBrowserCompat$ItemReceiver;
    public List<doOpenSession> write;

    public class ETBSaleSheetHolder_ViewBinding implements Unbinder {
        private ETBSaleSheetHolder write;

        public ETBSaleSheetHolder_ViewBinding(ETBSaleSheetHolder eTBSaleSheetHolder, View view) {
            this.write = eTBSaleSheetHolder;
            eTBSaleSheetHolder.container = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.view_container, "field 'container'", LinearLayout.class);
            eTBSaleSheetHolder.titleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_name, "field 'titleName'", TextView.class);
            eTBSaleSheetHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'divider'");
        }

        public final void read() {
            ETBSaleSheetHolder eTBSaleSheetHolder = this.write;
            if (eTBSaleSheetHolder != null) {
                this.write = null;
                eTBSaleSheetHolder.container = null;
                eTBSaleSheetHolder.titleName = null;
                eTBSaleSheetHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ETBSaleSheetHolder eTBSaleSheetHolder = (ETBSaleSheetHolder) setcontentview;
        if (i == this.write.size() - 1) {
            eTBSaleSheetHolder.divider.setVisibility(4);
        } else {
            eTBSaleSheetHolder.divider.setVisibility(0);
        }
        eTBSaleSheetHolder.titleName.setText(this.write.get(i).IconCompatParcelizer);
        if (eTBSaleSheetHolder.container != null) {
            eTBSaleSheetHolder.container.setOnClickListener(new confirmPurchaseBondV2(this, i));
        }
    }

    public ETBSaleSheetAccountTypeAdapter(List<doOpenSession> list, FragmentBuilder_BindBondPurchaseSuccessFragment fragmentBuilder_BindBondPurchaseSuccessFragment) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBondPurchaseSuccessFragment;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    class ETBSaleSheetHolder extends RecyclerView.setContentView {
        @BindView
        LinearLayout container;
        @BindView
        View divider;
        @BindView
        TextView titleName;

        ETBSaleSheetHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ETBSaleSheetHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82722131493498, viewGroup, false));
    }
}
