package com.scb.phone.view.activity.ndid;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.ndid.OverlayWithCircleFocus;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseLivenessCheckActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BaseLivenessCheckActivity write;

    public BaseLivenessCheckActivity_ViewBinding(final BaseLivenessCheckActivity baseLivenessCheckActivity, View view) {
        super(baseLivenessCheckActivity, view);
        this.write = baseLivenessCheckActivity;
        baseLivenessCheckActivity.framePreview = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_preview, "field 'framePreview'", FrameLayout.class);
        baseLivenessCheckActivity.tvFeedback = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_feedback, "field 'tvFeedback'", TextView.class);
        baseLivenessCheckActivity.tvInstruction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_instruction, "field 'tvInstruction'", TextView.class);
        baseLivenessCheckActivity.tvMotionCount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_motion_count, "field 'tvMotionCount'", TextView.class);
        baseLivenessCheckActivity.layoutBlink = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_blink, "field 'layoutBlink'", LinearLayout.class);
        baseLivenessCheckActivity.owcfFocus = (OverlayWithCircleFocus) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.owcf_camera, "field 'owcfFocus'", OverlayWithCircleFocus.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_start, "field 'buttonStart' and method 'onButtonStartClick'");
        baseLivenessCheckActivity.buttonStart = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_start, "field 'buttonStart'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseLivenessCheckActivity.this.onButtonStartClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.arrow_back, "method 'onNavigateBack'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseLivenessCheckActivity.this.onNavigateBack();
            }
        });
    }

    public final void read() {
        BaseLivenessCheckActivity baseLivenessCheckActivity = this.write;
        if (baseLivenessCheckActivity != null) {
            this.write = null;
            baseLivenessCheckActivity.framePreview = null;
            baseLivenessCheckActivity.tvFeedback = null;
            baseLivenessCheckActivity.tvInstruction = null;
            baseLivenessCheckActivity.tvMotionCount = null;
            baseLivenessCheckActivity.layoutBlink = null;
            baseLivenessCheckActivity.owcfFocus = null;
            baseLivenessCheckActivity.buttonStart = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
