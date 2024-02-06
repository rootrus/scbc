package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RiskQuestionnaireFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private RiskQuestionnaireFragment write;

    public RiskQuestionnaireFragment_ViewBinding(final RiskQuestionnaireFragment riskQuestionnaireFragment, View view) {
        super(riskQuestionnaireFragment, view);
        this.write = riskQuestionnaireFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'btContinue' and method 'continueButtonClicked'");
        riskQuestionnaireFragment.btContinue = (Button) onStart.write(IconCompatParcelizer, R.id.bt_next, "field 'btContinue'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskQuestionnaireFragment.this.continueButtonClicked();
            }
        });
        riskQuestionnaireFragment.rvQuestions = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_questions, "field 'rvQuestions'", RecyclerView.class);
    }

    public final void read() {
        RiskQuestionnaireFragment riskQuestionnaireFragment = this.write;
        if (riskQuestionnaireFragment != null) {
            this.write = null;
            riskQuestionnaireFragment.btContinue = null;
            riskQuestionnaireFragment.rvQuestions = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
