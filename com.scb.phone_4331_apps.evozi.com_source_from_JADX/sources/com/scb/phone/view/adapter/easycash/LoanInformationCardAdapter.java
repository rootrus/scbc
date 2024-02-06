package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.C5831xe6dd7682;
import com.scb.phone.view.custom.easycash.CustomEasyCashLoanInformationCard;
import java.util.List;
import p040o.getLevel;
import p040o.onStart;

public final class LoanInformationCardAdapter extends RecyclerView.IconCompatParcelizer<LoanInformationCardViewHolder> {
    /* access modifiers changed from: private */
    public C5746x54d229d0 MediaBrowserCompat$ItemReceiver;
    public List<getLevel> read;

    public class LoanInformationCardViewHolder_ViewBinding implements Unbinder {
        private LoanInformationCardViewHolder IconCompatParcelizer;

        public LoanInformationCardViewHolder_ViewBinding(LoanInformationCardViewHolder loanInformationCardViewHolder, View view) {
            this.IconCompatParcelizer = loanInformationCardViewHolder;
            loanInformationCardViewHolder.card = (CustomEasyCashLoanInformationCard) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_information_card, "field 'card'", CustomEasyCashLoanInformationCard.class);
        }

        public final void read() {
            LoanInformationCardViewHolder loanInformationCardViewHolder = this.IconCompatParcelizer;
            if (loanInformationCardViewHolder != null) {
                this.IconCompatParcelizer = null;
                loanInformationCardViewHolder.card = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LoanInformationCardViewHolder loanInformationCardViewHolder = (LoanInformationCardViewHolder) setcontentview;
        getLevel getlevel = this.read.get(i);
        loanInformationCardViewHolder.card.setLoanImageFromUrl(getlevel.read);
        loanInformationCardViewHolder.card.setLoanName(getlevel.write);
        loanInformationCardViewHolder.card.setSlider(getlevel.MediaDescriptionCompat, new C5831xe6dd7682() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                C5746x54d229d0 unused = LoanInformationCardAdapter.this.MediaBrowserCompat$ItemReceiver;
                LoanInformationCardViewHolder loanInformationCardViewHolder = LoanInformationCardViewHolder.this;
                RecyclerView recyclerView = loanInformationCardViewHolder.MediaMetadataCompat;
                if (recyclerView != null) {
                    recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) loanInformationCardViewHolder);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                int i;
                C5746x54d229d0 read = LoanInformationCardAdapter.this.MediaBrowserCompat$ItemReceiver;
                LoanInformationCardViewHolder loanInformationCardViewHolder = LoanInformationCardViewHolder.this;
                RecyclerView recyclerView = loanInformationCardViewHolder.MediaMetadataCompat;
                if (recyclerView == null) {
                    i = -1;
                } else {
                    i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) loanInformationCardViewHolder);
                }
                read.MediaBrowserCompat$ItemReceiver(i, d);
            }
        });
        loanInformationCardViewHolder.card.setEnableSlider(getlevel.MediaBrowserCompat$ItemReceiver);
        loanInformationCardViewHolder.card.setLoanDetails(getlevel.IconCompatParcelizer);
    }

    public LoanInformationCardAdapter(List<getLevel> list, C5746x54d229d0 loanInformationCardAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = loanInformationCardAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int IconCompatParcelizer() {
        List<getLevel> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class LoanInformationCardViewHolder extends RecyclerView.setContentView {
        @BindView
        CustomEasyCashLoanInformationCard card;

        public LoanInformationCardViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LoanInformationCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f85402131493767, viewGroup, false));
    }
}
