package com.scb.phone.view.adapter.mwpartner;

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
import p040o.AutoCrashlyticsReportEncoder;
import p040o.getLoanPayment;
import p040o.onStart;

public final class MwMarketMallSearchAdapter extends RecyclerView.IconCompatParcelizer<MwSearchMarketMallViewHolder> {
    public List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> read;
    public read write;

    public interface read {
        void MediaBrowserCompat$ItemReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder);
    }

    public class MwSearchMarketMallViewHolder_ViewBinding implements Unbinder {
        private MwSearchMarketMallViewHolder write;

        public MwSearchMarketMallViewHolder_ViewBinding(MwSearchMarketMallViewHolder mwSearchMarketMallViewHolder, View view) {
            this.write = mwSearchMarketMallViewHolder;
            mwSearchMarketMallViewHolder.subDistrictText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_text, "field 'subDistrictText'", TextView.class);
        }

        public final void read() {
            MwSearchMarketMallViewHolder mwSearchMarketMallViewHolder = this.write;
            if (mwSearchMarketMallViewHolder != null) {
                this.write = null;
                mwSearchMarketMallViewHolder.subDistrictText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MwSearchMarketMallViewHolder mwSearchMarketMallViewHolder = (MwSearchMarketMallViewHolder) setcontentview;
        mwSearchMarketMallViewHolder.subDistrictText.setText(this.read.get(i).IconCompatParcelizer);
        mwSearchMarketMallViewHolder.write.setOnClickListener(new getLoanPayment(this, i));
    }

    public MwMarketMallSearchAdapter(List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class MwSearchMarketMallViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView subDistrictText;

        public MwSearchMarketMallViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new MwSearchMarketMallViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84902131493717, viewGroup, false));
    }
}
