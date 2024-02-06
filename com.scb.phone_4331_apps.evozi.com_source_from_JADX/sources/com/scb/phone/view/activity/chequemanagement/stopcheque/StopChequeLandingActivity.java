package com.scb.phone.view.activity.chequemanagement.stopcheque;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeFragment;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeInputFragment;
import p040o.C3556x820b46d9;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.HmlPinActivity;
import p040o.JsonReaderInternalAccess;

public class StopChequeLandingActivity extends BaseActivity implements CheckCaptureModule_GetIJsonExactionHelperKtaFactory.IconCompatParcelizer {
    private StopChequeFragment MediaMetadataCompat;
    @HmlPinActivity
    public JsonReaderInternalAccess presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80002131493225);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.stop_cheque_title);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        JsonReaderInternalAccess jsonReaderInternalAccess = this.presenter;
        jsonReaderInternalAccess.MediaBrowserCompat$ItemReceiver.write("DISPLAY_STOP_CHEQUE");
        jsonReaderInternalAccess.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3556x820b46d9(jsonReaderInternalAccess, (byte) 0));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        JsonReaderInternalAccess jsonReaderInternalAccess = this.presenter;
        jsonReaderInternalAccess.MediaBrowserCompat$ItemReceiver.write("DISPLAY_STOP_CHEQUE");
        jsonReaderInternalAccess.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3556x820b46d9(jsonReaderInternalAccess, (byte) 0));
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof StopChequeFragment) {
            this.MediaMetadataCompat = (StopChequeFragment) fragment;
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.stop_cheque_title);
        setTabContainer();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        StopChequeFragment stopChequeFragment = this.MediaMetadataCompat;
        if (stopChequeFragment == null || !(stopChequeFragment.getChildFragmentManager().findFragmentById(R.id.container_stop_cheque_history) instanceof StopChequeInputFragment)) {
            super.onBackPressed();
        } else {
            this.MediaMetadataCompat.aD_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_stop_cheque, StopChequeFragment.IconCompatParcelizer(i)).write();
    }
}
