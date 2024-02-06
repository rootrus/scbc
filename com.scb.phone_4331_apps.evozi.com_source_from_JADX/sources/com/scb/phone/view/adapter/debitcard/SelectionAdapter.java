package com.scb.phone.view.adapter.debitcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.BScanCService;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.getQrToPay;
import p040o.onStart;

public final class SelectionAdapter extends RecyclerView.IconCompatParcelizer<SelectionHolder> {
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment MediaBrowserCompat$ItemReceiver;
    private List<getQrToPay> read;

    public class SelectionHolder_ViewBinding implements Unbinder {
        private SelectionHolder MediaBrowserCompat$CustomActionResultReceiver;

        public SelectionHolder_ViewBinding(SelectionHolder selectionHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = selectionHolder;
            selectionHolder.icon = (AppCompatImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon, "field 'icon'", AppCompatImageView.class);
            selectionHolder.text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text, "field 'text'", TextView.class);
        }

        public final void read() {
            SelectionHolder selectionHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (selectionHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                selectionHolder.icon = null;
                selectionHolder.text = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SelectionHolder selectionHolder = (SelectionHolder) setcontentview;
        getQrToPay getqrtopay = this.read.get(i);
        BScanCService bScanCService = new BScanCService(this, i);
        selectionHolder.icon.setImageResource(getqrtopay.MediaBrowserCompat$CustomActionResultReceiver);
        selectionHolder.text.setText(getqrtopay.write);
        selectionHolder.write.setOnClickListener(bScanCService);
    }

    public SelectionAdapter(List<getQrToPay> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class SelectionHolder extends RecyclerView.setContentView {
        @BindView
        AppCompatImageView icon;
        @BindView
        TextView text;

        SelectionHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SelectionHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83742131493600, viewGroup, false));
    }
}
