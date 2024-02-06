package com.scb.phone.view.activity.ntb.touchpoint;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class TouchPointInstructionActivity_ViewBinding extends BaseTouchPointBreadcrumbActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private TouchPointInstructionActivity write;

    public TouchPointInstructionActivity_ViewBinding(final TouchPointInstructionActivity touchPointInstructionActivity, View view) {
        super(touchPointInstructionActivity, view);
        this.write = touchPointInstructionActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_proceed, "method 'onProceedClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TouchPointInstructionActivity.this.onProceedClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_find_us, "method 'onFindTouchPointsClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TouchPointInstructionActivity.this.onFindTouchPointsClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
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
