package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RegalQuestionnaireFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private RegalQuestionnaireFragment write;

    public RegalQuestionnaireFragment_ViewBinding(final RegalQuestionnaireFragment regalQuestionnaireFragment, View view) {
        super(regalQuestionnaireFragment, view);
        this.write = regalQuestionnaireFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'btContinue' and method 'continueButtonClicked'");
        regalQuestionnaireFragment.btContinue = (Button) onStart.write(IconCompatParcelizer, R.id.bt_next, "field 'btContinue'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegalQuestionnaireFragment.this.continueButtonClicked();
            }
        });
        regalQuestionnaireFragment.tvRiskTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_risk_title, "field 'tvRiskTitle'", TextView.class);
        regalQuestionnaireFragment.tvRiskSubTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_risk_sub_title, "field 'tvRiskSubTitle'", TextView.class);
        regalQuestionnaireFragment.rvQuestions = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_questions, "field 'rvQuestions'", RecyclerView.class);
    }

    public final void read() {
        RegalQuestionnaireFragment regalQuestionnaireFragment = this.write;
        if (regalQuestionnaireFragment != null) {
            this.write = null;
            regalQuestionnaireFragment.btContinue = null;
            regalQuestionnaireFragment.tvRiskTitle = null;
            regalQuestionnaireFragment.tvRiskSubTitle = null;
            regalQuestionnaireFragment.rvQuestions = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
