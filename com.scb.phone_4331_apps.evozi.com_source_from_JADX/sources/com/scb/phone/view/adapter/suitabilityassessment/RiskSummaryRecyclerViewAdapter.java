package com.scb.phone.view.adapter.suitabilityassessment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Arrays;
import p040o.CrashlyticsReportDataCapture;
import p040o.FundOnboardingSuccessActivity;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateEventApplicationData;
import p040o.populateExecutionData;

public final class RiskSummaryRecyclerViewAdapter extends RecyclerView.IconCompatParcelizer<RiskSummaryViewHolder> {
    private final ArrayList<CrashlyticsReportDataCapture> MediaBrowserCompat$ItemReceiver;
    private final populateExecutionData read;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84552131493681, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new RiskSummaryViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RiskSummaryViewHolder riskSummaryViewHolder = (RiskSummaryViewHolder) setcontentview;
        onGetStartedClick.write((Object) riskSummaryViewHolder, "holder");
        populateEventApplicationData populateeventapplicationdata = this.read.MediaBrowserCompat$ItemReceiver.get(i);
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) crashlyticsReportDataCapture, "answer[position]");
        int i2 = populateeventapplicationdata.write;
        String str = populateeventapplicationdata.read;
        String str2 = crashlyticsReportDataCapture.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "question");
        onGetStartedClick.write((Object) str2, "answer");
        TextView textView = riskSummaryViewHolder.tvQuestionTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionTitle");
        }
        String string = textView.getContext().getString(R.string.risk_question_format);
        onGetStartedClick.IconCompatParcelizer((Object) string, "tvQuestionTitle.context.…ing.risk_question_format)");
        TextView textView2 = riskSummaryViewHolder.tvQuestionTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionTitle");
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i2), str}, 2));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView2.setText(format);
        TextView textView3 = riskSummaryViewHolder.tvQuestionAnswer;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionAnswer");
        }
        textView3.setText(str2);
    }

    public final class RiskSummaryViewHolder_ViewBinding implements Unbinder {
        private RiskSummaryViewHolder MediaBrowserCompat$ItemReceiver;

        public RiskSummaryViewHolder_ViewBinding(RiskSummaryViewHolder riskSummaryViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = riskSummaryViewHolder;
            riskSummaryViewHolder.tvQuestionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_title, "field 'tvQuestionTitle'", TextView.class);
            riskSummaryViewHolder.tvQuestionAnswer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_answer, "field 'tvQuestionAnswer'", TextView.class);
        }

        public final void read() {
            RiskSummaryViewHolder riskSummaryViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (riskSummaryViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                riskSummaryViewHolder.tvQuestionTitle = null;
                riskSummaryViewHolder.tvQuestionAnswer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public RiskSummaryRecyclerViewAdapter(populateExecutionData populateexecutiondata, ArrayList<CrashlyticsReportDataCapture> arrayList) {
        onGetStartedClick.write((Object) populateexecutiondata, "questionSummary");
        onGetStartedClick.write((Object) arrayList, "answer");
        this.read = populateexecutiondata;
        this.MediaBrowserCompat$ItemReceiver = arrayList;
    }

    public final int IconCompatParcelizer() {
        return this.read.MediaBrowserCompat$ItemReceiver.size();
    }

    public final class RiskSummaryViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView tvQuestionAnswer;
        @BindView
        public TextView tvQuestionTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RiskSummaryViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
