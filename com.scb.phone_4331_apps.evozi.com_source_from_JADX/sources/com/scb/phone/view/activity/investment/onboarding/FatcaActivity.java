package com.scb.phone.view.activity.investment.onboarding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaQuestionnaireFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FatcaActivity extends BaseActivity implements FragmentBuilder_BindBulkTransferEmptyFragment {
    /* access modifiers changed from: protected */
    public int MediaSessionCompat$ResultReceiverWrapper() {
        return 1;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78012131493026);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        FatcaLandingQuestionFragment MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo14669x50fd9e4a();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("BUNDLE_FATCA_TYPE", MediaSessionCompat$ResultReceiverWrapper());
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.setArguments(bundle2);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.layout_fatca, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.getClass().getName()).write();
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public FatcaLandingQuestionFragment mo14669x50fd9e4a() {
        return new FatcaLandingQuestionFragment();
    }

    public void onBackPressed() {
        AppCompatActivity();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        AppCompatActivity();
        return true;
    }

    private void AppCompatActivity() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.layout_fatca);
        if (findFragmentById instanceof FatcaLandingQuestionFragment) {
            FatcaLandingQuestionFragment fatcaLandingQuestionFragment = (FatcaLandingQuestionFragment) findFragmentById;
            if (fatcaLandingQuestionFragment.getChildFragmentManager().findFragmentById(R.id.fatca_containner) instanceof FatcaQuestionnaireFragment) {
                fatcaLandingQuestionFragment.getChildFragmentManager().MediaMetadataCompat();
            } else {
                fatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver();
            }
        } else {
            super.onBackPressed();
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        MediaSessionCompat$QueueItem(getString(R.string.fatca_question_title));
    }

    public void MediaSessionCompat$Token() {
        Intent intent = new Intent(this, FundAppFormActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
