package com.scb.phone.view.adapter.suitabilityassessment;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.Arrays;
import p040o.CrashlyticsReportDataCapture;
import p040o.FragmentBuilder_BindChequeStatusFragment;
import p040o.FundOnboardingSuccessActivity;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateBinaryImagesList;
import p040o.populateExecutionData;

public final class QuestionnaireRecyclerViewAdapter extends RecyclerView.IconCompatParcelizer<QuestionnaireViewHolder> {
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindChequeStatusFragment MediaBrowserCompat$ItemReceiver;
    private final read read = new read(this);
    /* access modifiers changed from: private */
    public final populateExecutionData write;

    public final class QuestionnaireViewHolder_ViewBinding implements Unbinder {
        private QuestionnaireViewHolder write;

        public QuestionnaireViewHolder_ViewBinding(QuestionnaireViewHolder questionnaireViewHolder, View view) {
            this.write = questionnaireViewHolder;
            questionnaireViewHolder.tvQuestionNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_number, "field 'tvQuestionNumber'", TextView.class);
            questionnaireViewHolder.tvQuestionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_question_title, "field 'tvQuestionTitle'", TextView.class);
            questionnaireViewHolder.rgAnswers = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rg_answers, "field 'rgAnswers'", RadioGroup.class);
        }

        public final void read() {
            QuestionnaireViewHolder questionnaireViewHolder = this.write;
            if (questionnaireViewHolder != null) {
                this.write = null;
                questionnaireViewHolder.tvQuestionNumber = null;
                questionnaireViewHolder.tvQuestionTitle = null;
                questionnaireViewHolder.rgAnswers = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84542131493680, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new QuestionnaireViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        QuestionnaireViewHolder questionnaireViewHolder = (QuestionnaireViewHolder) setcontentview;
        onGetStartedClick.write((Object) questionnaireViewHolder, "holder");
        populateBinaryImagesList populatebinaryimageslist = this.write.read.get(i);
        C5785xb7dc0f35 questionnaireRecyclerViewAdapter$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        onGetStartedClick.write((Object) populatebinaryimageslist, "question");
        onGetStartedClick.write((Object) questionnaireRecyclerViewAdapter$MediaBrowserCompat$CustomActionResultReceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        TextView textView = questionnaireViewHolder.tvQuestionNumber;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionNumber");
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        View view = questionnaireViewHolder.write;
        onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
        String string = view.getContext().getString(R.string.full_stop);
        onGetStartedClick.IconCompatParcelizer((Object) string, "itemView.context.getString(R.string.full_stop)");
        int i2 = 0;
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(populatebinaryimageslist.MediaBrowserCompat$ItemReceiver)}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView.setText(format);
        TextView textView2 = questionnaireViewHolder.tvQuestionTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQuestionTitle");
        }
        textView2.setText(populatebinaryimageslist.MediaBrowserCompat$CustomActionResultReceiver);
        RadioGroup radioGroup = questionnaireViewHolder.rgAnswers;
        if (radioGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rgAnswers");
        }
        radioGroup.removeAllViews();
        int i3 = -1;
        for (Object next : populatebinaryimageslist.IconCompatParcelizer) {
            if (i2 >= 0) {
                CrashlyticsReportDataCapture crashlyticsReportDataCapture = (CrashlyticsReportDataCapture) next;
                View view2 = questionnaireViewHolder.write;
                onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(view2.getContext(), (AttributeSet) null, R.attr.questionnaireRadioButtonStyle);
                appCompatRadioButton.setId(i2);
                appCompatRadioButton.setText(crashlyticsReportDataCapture.IconCompatParcelizer);
                View view3 = questionnaireViewHolder.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                Context context = view3.getContext();
                onGetStartedClick.IconCompatParcelizer((Object) context, "itemView.context");
                appCompatRadioButton.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/PSL001Pro.ttf"));
                if (crashlyticsReportDataCapture.MediaBrowserCompat$ItemReceiver) {
                    i3 = appCompatRadioButton.getId();
                }
                RadioGroup radioGroup2 = questionnaireViewHolder.rgAnswers;
                if (radioGroup2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("rgAnswers");
                }
                radioGroup2.addView(appCompatRadioButton);
                i2++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        if (i3 != -1) {
            RadioGroup radioGroup3 = questionnaireViewHolder.rgAnswers;
            if (radioGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rgAnswers");
            }
            radioGroup3.check(i3);
        }
        RadioGroup radioGroup4 = questionnaireViewHolder.rgAnswers;
        if (radioGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rgAnswers");
        }
        radioGroup4.setOnCheckedChangeListener(new C5786x9f26c125(questionnaireRecyclerViewAdapter$MediaBrowserCompat$CustomActionResultReceiver, i));
    }

    public QuestionnaireRecyclerViewAdapter(populateExecutionData populateexecutiondata, FragmentBuilder_BindChequeStatusFragment fragmentBuilder_BindChequeStatusFragment) {
        onGetStartedClick.write((Object) populateexecutiondata, "investmentRiskAssessmentDisplay");
        onGetStartedClick.write((Object) fragmentBuilder_BindChequeStatusFragment, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.write = populateexecutiondata;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindChequeStatusFragment;
        MediaBrowserCompat$ItemReceiver(true);
    }

    public static final class read implements C5785xb7dc0f35 {
        private /* synthetic */ QuestionnaireRecyclerViewAdapter MediaBrowserCompat$ItemReceiver;

        read(QuestionnaireRecyclerViewAdapter questionnaireRecyclerViewAdapter) {
            this.MediaBrowserCompat$ItemReceiver = questionnaireRecyclerViewAdapter;
        }

        public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
            int i3 = 0;
            for (Object next : this.MediaBrowserCompat$ItemReceiver.write.read.get(i).IconCompatParcelizer) {
                if (i3 >= 0) {
                    ((CrashlyticsReportDataCapture) next).MediaBrowserCompat$ItemReceiver = i3 == i2;
                    i3++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.write);
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.read.size();
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) this.write.read.get(i).MediaBrowserCompat$ItemReceiver;
    }

    public final class QuestionnaireViewHolder extends RecyclerView.setContentView {
        @BindView
        public RadioGroup rgAnswers;
        @BindView
        public TextView tvQuestionNumber;
        @BindView
        public TextView tvQuestionTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public QuestionnaireViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
