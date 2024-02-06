package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.calculateUsedDiskSpaceInBytes;
import p040o.getEBills;
import p040o.onStart;

public final class LendingIssuerAdapter extends RecyclerView.IconCompatParcelizer<IssuerViewHolder> {
    private List<calculateUsedDiskSpaceInBytes> MediaBrowserCompat$ItemReceiver;
    public IconCompatParcelizer write;

    @FunctionalInterface
    public interface IconCompatParcelizer {
        void read(String str);
    }

    public class IssuerViewHolder_ViewBinding implements Unbinder {
        private IssuerViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public IssuerViewHolder_ViewBinding(IssuerViewHolder issuerViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = issuerViewHolder;
            issuerViewHolder.issuerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.issuer_name, "field 'issuerName'", TextView.class);
            issuerViewHolder.loanType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_type, "field 'loanType'", TextView.class);
            issuerViewHolder.deleteButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delete_image_view, "field 'deleteButton'", ImageView.class);
            issuerViewHolder.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_amount, "field 'amount'", TextView.class);
        }

        public final void read() {
            IssuerViewHolder issuerViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (issuerViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                issuerViewHolder.issuerName = null;
                issuerViewHolder.loanType = null;
                issuerViewHolder.deleteButton = null;
                issuerViewHolder.amount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        IssuerViewHolder issuerViewHolder = (IssuerViewHolder) setcontentview;
        calculateUsedDiskSpaceInBytes calculateuseddiskspaceinbytes = this.MediaBrowserCompat$ItemReceiver.get(i);
        issuerViewHolder.issuerName.setText(calculateuseddiskspaceinbytes.read);
        issuerViewHolder.loanType.setText(calculateuseddiskspaceinbytes.MediaBrowserCompat$ItemReceiver);
        issuerViewHolder.amount.setText(calculateuseddiskspaceinbytes.write);
        issuerViewHolder.deleteButton.setOnClickListener(new getEBills(this, calculateuseddiskspaceinbytes));
    }

    public LendingIssuerAdapter(List<calculateUsedDiskSpaceInBytes> list, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = iconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        List<calculateUsedDiskSpaceInBytes> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class IssuerViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView amount;
        @BindView
        ImageView deleteButton;
        @BindView
        TextView issuerName;
        @BindView
        TextView loanType;

        public IssuerViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new IssuerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83082131493534, viewGroup, false));
    }
}
