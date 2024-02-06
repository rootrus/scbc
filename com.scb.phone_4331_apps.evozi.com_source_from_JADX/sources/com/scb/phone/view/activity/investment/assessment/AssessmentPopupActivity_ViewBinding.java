package com.scb.phone.view.activity.investment.assessment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AssessmentPopupActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private AssessmentPopupActivity MediaBrowserCompat$CustomActionResultReceiver;

    public AssessmentPopupActivity_ViewBinding(final AssessmentPopupActivity assessmentPopupActivity, View view) {
        super(assessmentPopupActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = assessmentPopupActivity;
        assessmentPopupActivity.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_dialog_text_view, "field 'titleText'", TextView.class);
        assessmentPopupActivity.firstTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_first, "field 'firstTitle'", TextView.class);
        assessmentPopupActivity.firstText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_first, "field 'firstText'", TextView.class);
        assessmentPopupActivity.secondTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_second, "field 'secondTitle'", TextView.class);
        assessmentPopupActivity.secondText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_second, "field 'secondText'", TextView.class);
        assessmentPopupActivity.buttonPositive = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_positive, "field 'buttonPositive'", Button.class);
        assessmentPopupActivity.buttonNegative = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_negative, "field 'buttonNegative'", Button.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.item_back_icon_relative_layout, "method 'onCloseClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AssessmentPopupActivity.this.onCloseClicked();
            }
        });
    }

    public final void read() {
        AssessmentPopupActivity assessmentPopupActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (assessmentPopupActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            assessmentPopupActivity.titleText = null;
            assessmentPopupActivity.firstTitle = null;
            assessmentPopupActivity.firstText = null;
            assessmentPopupActivity.secondTitle = null;
            assessmentPopupActivity.secondText = null;
            assessmentPopupActivity.buttonPositive = null;
            assessmentPopupActivity.buttonNegative = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
