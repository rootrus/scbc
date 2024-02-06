package com.scb.phone.view.activity.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.cardmanagement.EStatementsSuccessfulFragment;
import java.util.ArrayList;
import p040o.chain;

public final class EStatementsSuccessfulActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);

    public final void onBackPressed() {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77492131492974);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("EMAIL_KEY");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("LIST_BILLED_CYCLE_KEY");
        EStatementsSuccessfulFragment.write write = EStatementsSuccessfulFragment.IconCompatParcelizer;
        EStatementsSuccessfulFragment eStatementsSuccessfulFragment = new EStatementsSuccessfulFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("EMAIL_KEY", stringExtra);
        bundle2.putParcelable("CREDIT_CARD_DISPLAY_KEY", (chain) intent.getParcelableExtra("CREDIT_CARD_DISPLAY_KEY"));
        bundle2.putStringArrayList("LIST_BILLED_CYCLE_KEY", stringArrayListExtra);
        eStatementsSuccessfulFragment.setArguments(bundle2);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, eStatementsSuccessfulFragment).write();
    }
}
