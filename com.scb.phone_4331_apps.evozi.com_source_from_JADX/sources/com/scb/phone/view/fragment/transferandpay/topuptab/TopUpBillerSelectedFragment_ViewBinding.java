package com.scb.phone.view.fragment.transferandpay.topuptab;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TopUpBillerSelectedFragment_ViewBinding extends BaseTargetSelectedFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private TopUpBillerSelectedFragment MediaBrowserCompat$ItemReceiver;

    public TopUpBillerSelectedFragment_ViewBinding(final TopUpBillerSelectedFragment topUpBillerSelectedFragment, View view) {
        super(topUpBillerSelectedFragment, view);
        this.MediaBrowserCompat$ItemReceiver = topUpBillerSelectedFragment;
        topUpBillerSelectedFragment.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
        topUpBillerSelectedFragment.noteLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_layout, "field 'noteLayout'", LinearLayout.class);
        topUpBillerSelectedFragment.scheduleLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_layout, "field 'scheduleLinearLayout'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onAdditionalInfoButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TopUpBillerSelectedFragment.this.onAdditionalInfoButtonClicked();
            }
        });
    }

    public final void read() {
        TopUpBillerSelectedFragment topUpBillerSelectedFragment = this.MediaBrowserCompat$ItemReceiver;
        if (topUpBillerSelectedFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            topUpBillerSelectedFragment.customScheduleView = null;
            topUpBillerSelectedFragment.noteLayout = null;
            topUpBillerSelectedFragment.scheduleLinearLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
