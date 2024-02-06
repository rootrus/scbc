package com.scb.phone.view.adapter.easycash;

import android.content.Context;
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
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getBillPaymentHistory;
import p040o.getLegacySharedPrefs;
import p040o.getMappingFileId;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class EasycashHeaderAdapter extends RecyclerView.IconCompatParcelizer<LoanHeaderViewHolder> {
    private final List<getLegacySharedPrefs> read;
    private final write write;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(getMappingFileId getmappingfileid);
    }

    public class LoanHeaderViewHolder_ViewBinding implements Unbinder {
        private LoanHeaderViewHolder write;

        public LoanHeaderViewHolder_ViewBinding(LoanHeaderViewHolder loanHeaderViewHolder, View view) {
            this.write = loanHeaderViewHolder;
            loanHeaderViewHolder.image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_header_image, "field 'image'", ImageView.class);
            loanHeaderViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_header_title, "field 'title'", TextView.class);
        }

        public final void read() {
            LoanHeaderViewHolder loanHeaderViewHolder = this.write;
            if (loanHeaderViewHolder != null) {
                this.write = null;
                loanHeaderViewHolder.image = null;
                loanHeaderViewHolder.title = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LoanHeaderViewHolder loanHeaderViewHolder = (LoanHeaderViewHolder) setcontentview;
        getLegacySharedPrefs getlegacysharedprefs = this.read.get(i);
        write write2 = this.write;
        Context context = loanHeaderViewHolder.write.getContext();
        loanHeaderViewHolder.title.setText(getlegacysharedprefs.MediaBrowserCompat$MediaItem);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(context, R.color.f66402131099796), loanHeaderViewHolder.image, getlegacysharedprefs.MediaBrowserCompat$SearchResultReceiver);
        if (getlegacysharedprefs.RatingCompat) {
            loanHeaderViewHolder.write.setAlpha(1.0f);
            loanHeaderViewHolder.write.setOnClickListener(new getBillPaymentHistory(write2, getlegacysharedprefs));
            return;
        }
        loanHeaderViewHolder.write.setAlpha(0.5f);
        loanHeaderViewHolder.write.setOnClickListener((View.OnClickListener) null);
    }

    public EasycashHeaderAdapter(List<getLegacySharedPrefs> list, write write2) {
        this.read = list;
        this.write = write2;
    }

    public final int IconCompatParcelizer() {
        List<getLegacySharedPrefs> list = this.read;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class LoanHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView image;
        @BindView
        TextView title;

        public LoanHeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LoanHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82652131493491, viewGroup, false));
    }
}
