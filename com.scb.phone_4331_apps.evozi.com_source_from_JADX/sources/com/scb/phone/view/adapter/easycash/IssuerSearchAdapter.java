package com.scb.phone.view.adapter.easycash;

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
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.convertMemInfoToBytes;
import p040o.getPerformPayment;
import p040o.onStart;

public final class IssuerSearchAdapter extends RecyclerView.IconCompatParcelizer<CustomViewHolder> {
    public final FragmentBuilder_BindCardlessWithdrawAmountFragment MediaBrowserCompat$ItemReceiver;
    public final List<convertMemInfoToBytes> read;
    private final String write;

    public class CustomViewHolder_ViewBinding implements Unbinder {
        private CustomViewHolder IconCompatParcelizer;

        public CustomViewHolder_ViewBinding(CustomViewHolder customViewHolder, View view) {
            this.IconCompatParcelizer = customViewHolder;
            customViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.occupation_description, "field 'description'", TextView.class);
        }

        public final void read() {
            CustomViewHolder customViewHolder = this.IconCompatParcelizer;
            if (customViewHolder != null) {
                this.IconCompatParcelizer = null;
                customViewHolder.description = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CustomViewHolder customViewHolder = (CustomViewHolder) setcontentview;
        if (this.write.equals("th")) {
            customViewHolder.description.setText(this.read.get(i).IconCompatParcelizer);
        } else {
            customViewHolder.description.setText(this.read.get(i).MediaBrowserCompat$ItemReceiver);
        }
        customViewHolder.write.setOnClickListener(new getPerformPayment(this, i));
    }

    public IssuerSearchAdapter(List<convertMemInfoToBytes> list, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment, String str) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCardlessWithdrawAmountFragment;
        this.write = str;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class CustomViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView description;

        CustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83482131493574, viewGroup, false));
    }
}
