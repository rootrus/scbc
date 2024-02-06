package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOutcomeRejectFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlOutcomeRejectFragment MediaBrowserCompat$ItemReceiver;

    public HmlOutcomeRejectFragment_ViewBinding(final HmlOutcomeRejectFragment hmlOutcomeRejectFragment, View view) {
        super(hmlOutcomeRejectFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlOutcomeRejectFragment;
        hmlOutcomeRejectFragment.background = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_background, "field 'background'", ImageView.class);
        hmlOutcomeRejectFragment.healthSection = (CardView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_hml_outcome_rejected_health_section, "field 'healthSection'", CardView.class);
        hmlOutcomeRejectFragment.financialHealthTitleTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_financial_health_title, "field 'financialHealthTitleTv'", TextView.class);
        hmlOutcomeRejectFragment.financialHealthDescriptionTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_financial_health_description, "field 'financialHealthDescriptionTv'", TextView.class);
        hmlOutcomeRejectFragment.rejectRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_outcome_reject_remark, "field 'rejectRemark'", TextView.class);
        hmlOutcomeRejectFragment.reapplyDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_reapply_date_time, "field 'reapplyDateTime'", TextView.class);
        hmlOutcomeRejectFragment.rejectedBackground = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_hml_outcome_rejected_background_health, "field 'rejectedBackground'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_hml_outcome_rejected_learn_more, "method 'onLearnMoreButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeRejectFragment.this.onLearnMoreButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeRejectFragment.this.onButtonReturnHomeClicked(view);
            }
        });
    }

    public final void read() {
        HmlOutcomeRejectFragment hmlOutcomeRejectFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlOutcomeRejectFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlOutcomeRejectFragment.background = null;
            hmlOutcomeRejectFragment.healthSection = null;
            hmlOutcomeRejectFragment.financialHealthTitleTv = null;
            hmlOutcomeRejectFragment.financialHealthDescriptionTv = null;
            hmlOutcomeRejectFragment.rejectRemark = null;
            hmlOutcomeRejectFragment.reapplyDateTime = null;
            hmlOutcomeRejectFragment.rejectedBackground = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
