package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOutcomePendingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlOutcomePendingFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlOutcomePendingFragment_ViewBinding(final HmlOutcomePendingFragment hmlOutcomePendingFragment, View view) {
        super(hmlOutcomePendingFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlOutcomePendingFragment;
        hmlOutcomePendingFragment.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_pending_title, "field 'title'", TextView.class);
        hmlOutcomePendingFragment.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_pending_subtitle, "field 'subtitle'", TextView.class);
        hmlOutcomePendingFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_pending_date, "field 'dateText'", TextView.class);
        hmlOutcomePendingFragment.statusHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.passport_info_title, "field 'statusHeader'", TextView.class);
        hmlOutcomePendingFragment.statusFirst = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_scan_id, "field 'statusFirst'", TextView.class);
        hmlOutcomePendingFragment.statusSecond = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_scan_passport, "field 'statusSecond'", TextView.class);
        hmlOutcomePendingFragment.statusThird = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_liveness_check, "field 'statusThird'", TextView.class);
        hmlOutcomePendingFragment.notificationHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_notification_header, "field 'notificationHeader'", TextView.class);
        hmlOutcomePendingFragment.notificationText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_notification_text, "field 'notificationText'", TextView.class);
        hmlOutcomePendingFragment.contactInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_contact, "field 'contactInfo'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomePendingFragment.this.onButtonReturnHomeClicked(view);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomePendingFragment.this.onContactCallCenter(view);
            }
        });
    }

    public final void read() {
        HmlOutcomePendingFragment hmlOutcomePendingFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlOutcomePendingFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlOutcomePendingFragment.title = null;
            hmlOutcomePendingFragment.subtitle = null;
            hmlOutcomePendingFragment.dateText = null;
            hmlOutcomePendingFragment.statusHeader = null;
            hmlOutcomePendingFragment.statusFirst = null;
            hmlOutcomePendingFragment.statusSecond = null;
            hmlOutcomePendingFragment.statusThird = null;
            hmlOutcomePendingFragment.notificationHeader = null;
            hmlOutcomePendingFragment.notificationText = null;
            hmlOutcomePendingFragment.contactInfo = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
