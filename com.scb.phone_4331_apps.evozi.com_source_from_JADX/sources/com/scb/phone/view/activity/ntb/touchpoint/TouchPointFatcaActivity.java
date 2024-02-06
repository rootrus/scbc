package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointSelectAccountActivity;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaQuestionnaireFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class TouchPointFatcaActivity extends BaseTouchPointBreadcrumbActivity implements FragmentBuilder_BindBulkTransferEmptyFragment, KtaJsonCheck.MediaDescriptionCompat {
    public static final write MediaMetadataCompat = new write((byte) 0);
    private FatcaLandingQuestionFragment MediaBrowserCompat$SearchResultReceiver;

    public final void MediaSessionCompat$QueueItem() {
    }

    public final String read() {
        return "touchpoint";
    }

    public final void read(String str, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.ANSWER_FATCA;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80112131493236);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.fatca_question_title);
        setTabContainer();
        FatcaLandingQuestionFragment MediaBrowserCompat$CustomActionResultReceiver = FatcaLandingQuestionFragment.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "FatcaLandingQuestionFrag…tance(FATCA_OPEN_ACCOUNT)");
        this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$CustomActionResultReceiver;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, (Fragment) MediaBrowserCompat$CustomActionResultReceiver, (int) R.id.container);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.fatca_question_title);
        setTabContainer();
    }

    public final void MediaSessionCompat$Token() {
        TouchPointSelectAccountActivity.write write2 = TouchPointSelectAccountActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, TouchPointSelectAccountActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onBackPressed() {
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fatcaLandingQuestionFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fatcaLandingQuestionFragment");
        }
        if (fatcaLandingQuestionFragment.getChildFragmentManager().findFragmentById(R.id.fatca_containner) instanceof FatcaQuestionnaireFragment) {
            fatcaLandingQuestionFragment.getChildFragmentManager().MediaMetadataCompat();
        } else {
            fatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || 16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fatcaLandingQuestionFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fatcaLandingQuestionFragment");
        }
        if (fatcaLandingQuestionFragment.getChildFragmentManager().findFragmentById(R.id.fatca_containner) instanceof FatcaQuestionnaireFragment) {
            fatcaLandingQuestionFragment.getChildFragmentManager().MediaMetadataCompat();
            return true;
        }
        fatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver();
        return true;
    }
}
