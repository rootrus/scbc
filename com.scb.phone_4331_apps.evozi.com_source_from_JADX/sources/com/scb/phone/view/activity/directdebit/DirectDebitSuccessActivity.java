package com.scb.phone.view.activity.directdebit;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.directdebit.DirectDebitSuccessFragment;
import p040o.AlertController$RecycleListView;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class DirectDebitSuccessActivity extends ReviewSuccessfulActivity {
    public static final C5595x840cad9c MediaBrowserCompat$MediaItem = new C5595x840cad9c((byte) 0);

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        standardStartAndWait standardstartandwait = intent != null ? (standardStartAndWait) intent.getParcelableExtra("EXTRA_DIRECT_DEBIT_SUCCESS_DISPLAY") : null;
        if (standardstartandwait != null) {
            DirectDebitSuccessFragment.IconCompatParcelizer iconCompatParcelizer = DirectDebitSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) standardstartandwait, "display");
            DirectDebitSuccessFragment directDebitSuccessFragment = new DirectDebitSuccessFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_DIRECT_DEBIT_SUCCESS_DISPLAY", standardstartandwait);
            directDebitSuccessFragment.setArguments(bundle);
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, (Fragment) directDebitSuccessFragment, (int) R.id.frame_container);
        }
    }
}
