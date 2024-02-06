package com.scb.phone.view.custom.profilemanagement;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getSignal;

public class ReviewAccountItemCustomView extends ReviewAccountCustomView {
    @BindView
    TextView accountText;
    @BindView
    TextView branchText;
    @BindView
    TextView numberAccountListText;
    @BindView
    View separator;
    @BindView
    TextView typeText;

    public ReviewAccountItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReviewAccountItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReviewAccountItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84642131493691, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        getSignal getsignal = (getSignal) builder;
        this.numberAccountListText.setText(getsignal.RatingCompat);
        this.accountText.setText(getsignal.MediaBrowserCompat$SearchResultReceiver);
        int i = 0;
        if (TextUtils.isEmpty(getsignal.read)) {
            this.typeText.setVisibility(8);
        } else {
            this.typeText.setText(getsignal.read);
            this.typeText.setVisibility(0);
        }
        String str = getsignal.write;
        if (str == null || str.equalsIgnoreCase("")) {
            str = getsignal.MediaBrowserCompat$ItemReceiver;
        }
        if (TextUtils.isEmpty(str)) {
            this.branchText.setVisibility(8);
        } else {
            this.branchText.setText(str);
            this.branchText.setVisibility(0);
        }
        View view = this.separator;
        if (getsignal.MediaDescriptionCompat()) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
