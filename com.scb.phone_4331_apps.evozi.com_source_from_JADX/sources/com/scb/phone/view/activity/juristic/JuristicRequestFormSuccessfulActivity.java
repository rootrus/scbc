package com.scb.phone.view.activity.juristic;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.juristic.JuristicRequestFormSuccessfulFragment;
import p040o.CardView;
import p040o.Utils;
import p040o.onGetStartedClick;

public final class JuristicRequestFormSuccessfulActivity extends BaseActivity {
    public static final C5655xbbff311b MediaBrowserCompat$MediaItem = new C5655xbbff311b((byte) 0);

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        Utils.C39312 r6;
        super.onCreate(bundle);
        setContentView(R.layout.f78492131493074);
        Intent intent = getIntent();
        if (intent != null && (r6 = (Utils.C39312) intent.getParcelableExtra("DISPLAY")) != null) {
            CardView read = getSupportFragmentManager().read();
            JuristicRequestFormSuccessfulFragment.IconCompatParcelizer iconCompatParcelizer = JuristicRequestFormSuccessfulFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) r6, "juristicRequestFormResponseDisplay");
            JuristicRequestFormSuccessfulFragment juristicRequestFormSuccessfulFragment = new JuristicRequestFormSuccessfulFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DISPLAY", r6);
            juristicRequestFormSuccessfulFragment.setArguments(bundle2);
            read.write(R.id.container, juristicRequestFormSuccessfulFragment, (String) null).write();
        }
    }

    public final void RatingCompat(boolean z) {
        super.RatingCompat(z);
    }
}
