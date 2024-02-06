package com.scb.phone.view.activity.prepaid;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class PointTabHolder_ViewBinding implements Unbinder {
    private PointTabHolder IconCompatParcelizer;

    public PointTabHolder_ViewBinding(PointTabHolder pointTabHolder, View view) {
        this.IconCompatParcelizer = pointTabHolder;
        pointTabHolder.tvYouHave = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_you_have, "field 'tvYouHave'", TextView.class);
        pointTabHolder.tvPointValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point_value, "field 'tvPointValue'", TextView.class);
        pointTabHolder.tvPointLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point_label, "field 'tvPointLabel'", TextView.class);
        pointTabHolder.tvUnable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_unable, "field 'tvUnable'", TextView.class);
        pointTabHolder.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        pointTabHolder.layoutPointValue = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_point_value, "field 'layoutPointValue'", LinearLayout.class);
    }

    public final void read() {
        PointTabHolder pointTabHolder = this.IconCompatParcelizer;
        if (pointTabHolder != null) {
            this.IconCompatParcelizer = null;
            pointTabHolder.tvYouHave = null;
            pointTabHolder.tvPointValue = null;
            pointTabHolder.tvPointLabel = null;
            pointTabHolder.tvUnable = null;
            pointTabHolder.tvRemark = null;
            pointTabHolder.layoutPointValue = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
