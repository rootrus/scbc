package com.scb.phone.view.activity.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScbsOnboardingLaserIdActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ScbsOnboardingLaserIdActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public ScbsOnboardingLaserIdActivity_ViewBinding(final ScbsOnboardingLaserIdActivity scbsOnboardingLaserIdActivity, View view) {
        super(scbsOnboardingLaserIdActivity, view);
        this.IconCompatParcelizer = scbsOnboardingLaserIdActivity;
        scbsOnboardingLaserIdActivity.digitTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_digits, "field 'digitTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'clickNext'");
        scbsOnboardingLaserIdActivity.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScbsOnboardingLaserIdActivity.this.clickNext();
            }
        });
        scbsOnboardingLaserIdActivity.digitEditTexts = onStart.write((CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_first, "field 'digitEditTexts'", CustomEditText.class), (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_second, "field 'digitEditTexts'", CustomEditText.class), (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_third, "field 'digitEditTexts'", CustomEditText.class));
    }

    public final void read() {
        ScbsOnboardingLaserIdActivity scbsOnboardingLaserIdActivity = this.IconCompatParcelizer;
        if (scbsOnboardingLaserIdActivity != null) {
            this.IconCompatParcelizer = null;
            scbsOnboardingLaserIdActivity.digitTextView = null;
            scbsOnboardingLaserIdActivity.nextButton = null;
            scbsOnboardingLaserIdActivity.digitEditTexts = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
