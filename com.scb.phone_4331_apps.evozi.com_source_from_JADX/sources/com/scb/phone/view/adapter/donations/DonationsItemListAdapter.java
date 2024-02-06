package com.scb.phone.view.adapter.donations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindBillPaymentBillerSelectedFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getAutoInquiryAmount;
import p040o.getBinaryImagesFile;
import p040o.onGetLayoutInflater;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class DonationsItemListAdapter extends RecyclerView.IconCompatParcelizer<DonationsCardViewHolder> {
    public FragmentBuilder_BindBillPaymentBillerSelectedFragment MediaBrowserCompat$ItemReceiver;
    private Context MediaBrowserCompat$SearchResultReceiver;
    public List<getBinaryImagesFile> read;
    private String write = onGetLayoutInflater.IconCompatParcelizer();

    public class DonationsCardViewHolder_ViewBinding implements Unbinder {
        private DonationsCardViewHolder IconCompatParcelizer;

        public DonationsCardViewHolder_ViewBinding(DonationsCardViewHolder donationsCardViewHolder, View view) {
            this.IconCompatParcelizer = donationsCardViewHolder;
            donationsCardViewHolder.cardView = (CardView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view, "field 'cardView'", CardView.class);
            donationsCardViewHolder.logoImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.logo_image, "field 'logoImageView'", ImageView.class);
            donationsCardViewHolder.foundationNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.foundation_name, "field 'foundationNameTextView'", TextView.class);
        }

        public final void read() {
            DonationsCardViewHolder donationsCardViewHolder = this.IconCompatParcelizer;
            if (donationsCardViewHolder != null) {
                this.IconCompatParcelizer = null;
                donationsCardViewHolder.cardView = null;
                donationsCardViewHolder.logoImageView = null;
                donationsCardViewHolder.foundationNameTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DonationsCardViewHolder donationsCardViewHolder = (DonationsCardViewHolder) setcontentview;
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$SearchResultReceiver, R.drawable.donations_place_holder_logo), donationsCardViewHolder.logoImageView, this.read.get(i).IconCompatParcelizer);
        if (this.write.equals("th")) {
            donationsCardViewHolder.foundationNameTextView.setText(this.read.get(i).MediaMetadataCompat.write);
        } else {
            donationsCardViewHolder.foundationNameTextView.setText(this.read.get(i).MediaMetadataCompat.read);
        }
        donationsCardViewHolder.cardView.setOnClickListener(new getAutoInquiryAmount(this, i));
    }

    static class DonationsCardViewHolder extends RecyclerView.setContentView {
        @BindView
        CardView cardView;
        @BindView
        TextView foundationNameTextView;
        @BindView
        ImageView logoImageView;

        DonationsCardViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public DonationsItemListAdapter(Context context, List<getBinaryImagesFile> list, FragmentBuilder_BindBillPaymentBillerSelectedFragment fragmentBuilder_BindBillPaymentBillerSelectedFragment) {
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBillPaymentBillerSelectedFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DonationsCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81172131493343, viewGroup, false));
    }
}
