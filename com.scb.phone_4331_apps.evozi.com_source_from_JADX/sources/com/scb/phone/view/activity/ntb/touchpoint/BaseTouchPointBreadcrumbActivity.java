package com.scb.phone.view.activity.ntb.touchpoint;

import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import java.util.Arrays;
import java.util.List;
import p040o.onGetStartedClick;

public abstract class BaseTouchPointBreadcrumbActivity extends BaseActivity {
    @BindView
    public ProgressStateBar breadcrumb;

    /* access modifiers changed from: protected */
    public abstract C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper();

    public void onStart() {
        int i;
        super.onStart();
        String[] strArr = {getString(R.string.auto_touchpoints_verify_your_infromation), getString(R.string.auto_touchpoints_answer_fatca), getString(R.string.auto_touchpoints_select_account), getString(R.string.auto_touchpoints_fill_information)};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        ProgressStateBar progressStateBar = this.breadcrumb;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumb");
        }
        progressStateBar.setStates(asList);
        C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        if (MediaSessionCompat$ResultReceiverWrapper.state >= asList.size()) {
            i = C5677x8060c4c1.INPUT_YOUR_INFORMATION.state;
        } else {
            i = MediaSessionCompat$ResultReceiverWrapper.state;
        }
        ProgressStateBar progressStateBar2 = this.breadcrumb;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumb");
        }
        progressStateBar2.setCurrentState(i);
    }
}
