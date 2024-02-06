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
import p040o.getBillerByCompCode;
import p040o.getLegacySharedPrefs;
import p040o.getMappingFileId;
import p040o.onStart;

public final class EasycashLoanTrackingAdapter extends RecyclerView.IconCompatParcelizer<LoanViewHolder> {
    private final read read;
    private final List<getLegacySharedPrefs> write;

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(getMappingFileId getmappingfileid);
    }

    public class LoanViewHolder_ViewBinding implements Unbinder {
        private LoanViewHolder write;

        public LoanViewHolder_ViewBinding(LoanViewHolder loanViewHolder, View view) {
            this.write = loanViewHolder;
            loanViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_tracking, "field 'title'", TextView.class);
        }

        public final void read() {
            LoanViewHolder loanViewHolder = this.write;
            if (loanViewHolder != null) {
                this.write = null;
                loanViewHolder.title = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LoanViewHolder loanViewHolder = (LoanViewHolder) setcontentview;
        getLegacySharedPrefs getlegacysharedprefs = this.write.get(i);
        read read2 = this.read;
        loanViewHolder.title.setText(getlegacysharedprefs.MediaBrowserCompat$MediaItem);
        loanViewHolder.write.setOnClickListener(new getBillerByCompCode(read2, getlegacysharedprefs));
    }

    public EasycashLoanTrackingAdapter(List<getLegacySharedPrefs> list, read read2) {
        this.write = list;
        this.read = read2;
    }

    public final int IconCompatParcelizer() {
        if (this.write.isEmpty()) {
            return 0;
        }
        return this.write.size();
    }

    public static class LoanViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView title;

        LoanViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LoanViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82682131493494, viewGroup, false));
    }
}
