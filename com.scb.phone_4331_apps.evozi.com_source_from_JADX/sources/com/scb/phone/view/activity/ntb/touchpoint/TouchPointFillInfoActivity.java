package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.NTBActivity;
import java.util.Arrays;
import java.util.List;
import p040o.onGetStartedClick;

public final class TouchPointFillInfoActivity extends NTBActivity {
    public static final TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final String read() {
        return "touchpoint";
    }

    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String[] strArr = {getString(R.string.auto_touchpoints_verify_your_infromation), getString(R.string.auto_touchpoints_answer_fatca), getString(R.string.auto_touchpoints_select_account), getString(R.string.auto_touchpoints_fill_information)};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        this.progressStateBar.setStates(asList);
        ao_();
        am_();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("EXTRA_PROGRESS_STATE")) != null) {
            IconCompatParcelizer(stringExtra);
        }
    }
}
