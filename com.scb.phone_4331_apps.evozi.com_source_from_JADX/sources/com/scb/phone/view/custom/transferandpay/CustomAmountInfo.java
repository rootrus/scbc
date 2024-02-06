package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.CrashlyticsReport;
import p040o.parseReport;

public class CustomAmountInfo extends RelativeLayout {
    @BindView
    LinearLayout itemList;

    public CustomAmountInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81062131493332, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setValues(CrashlyticsReport.Session.Application application) {
        MediaBrowserCompat$CustomActionResultReceiver(application, false, false);
    }

    public void setValuesAligned(CrashlyticsReport.Session.Application application, boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver(application, true, z);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Application application, boolean z, boolean z2) {
        this.itemList.removeAllViews();
        if (application.read != null && application.read.size() > 0) {
            int size = application.read.size();
            int i = 0;
            for (parseReport next : application.read) {
                if (!TextUtils.isEmpty(next.IconCompatParcelizer) && !TextUtils.isEmpty(next.MediaBrowserCompat$ItemReceiver)) {
                    LinearLayout linearLayout = this.itemList;
                    Context context = getContext();
                    boolean z3 = true;
                    if (!z && size - 1 == i) {
                        z3 = false;
                    }
                    linearLayout.addView(new CustomAmountInfoItem(context, next, z3, z2));
                }
                i++;
            }
        }
    }
}
