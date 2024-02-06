package com.scb.phone.view.activity.investment.assessment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.investment.assessment.RiskQuestionnaireFragment;
import com.scb.phone.view.fragment.investment.assessment.RiskReviewFragment;
import com.scb.phone.view.fragment.investment.assessment.RiskSelectionFragment;
import com.scb.phone.view.fragment.investment.assessment.RiskSummaryFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.C1182x42c5e53d;
import p040o.C1183x31fe2cc;
import p040o.CrashlyticsReportDataCapture;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SendImage;
import p040o.SendImage$MediaBrowserCompat$ItemReceiver;
import p040o.getDocumentSkewAngle;
import p040o.getSoapAction;
import p040o.populateEventDeviceData;
import p040o.populateExecutionData;
import p040o.setProfileRequest;
import p040o.setTapText;

public class RiskLevelAssessmentActivity extends BaseActivity implements getDocumentSkewAngle, FragmentBuilder_BindCloseAccountSelectionOwnFragment.write, C1183x31fe2cc, FragmentBuilder_BindCloseAccountSelectionOwnFragment.read, C1182x42c5e53d {
    @HmlPinActivity
    public SendImage presenter;
    @BindView
    protected View toolbar;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        Intent intent = new Intent(context, RiskLevelAssessmentActivity.class);
        intent.putExtra("userName", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79752131493200);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        SendImage sendImage = this.presenter;
        sendImage.MediaBrowserCompat$SearchResultReceiver = getIntent().getStringExtra("userName");
        sendImage.MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.RISK_SELECTION);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public final void write() {
        MediaSessionCompat$QueueItem(getString(R.string.assessment_dialog_title));
        RiskSelectionFragment riskSelectionFragment = new RiskSelectionFragment();
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, riskSelectionFragment, riskSelectionFragment.getClass().getName()).write();
        mo13676d_("mfsuit_select_risklevel");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, populateExecutionData populateexecutiondata) {
        MediaSessionCompat$QueueItem(getString(R.string.assessment_dialog_title));
        RiskQuestionnaireFragment MediaBrowserCompat$CustomActionResultReceiver = RiskQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver(str, populateexecutiondata);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver.getClass().getName()).write();
        mo13676d_("mfsuit_questionnaire");
    }

    public final void write(String str, populateExecutionData populateexecutiondata, List<CrashlyticsReportDataCapture> list) {
        MediaSessionCompat$QueueItem(getString(R.string.auto_mf_onboarding_suitability_summary_title));
        RiskSummaryFragment write = RiskSummaryFragment.write(str, populateexecutiondata, new ArrayList(list));
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, write, write.getClass().getName()).write();
    }

    public final void IconCompatParcelizer(String str, populateEventDeviceData populateeventdevicedata) {
        MediaSessionCompat$QueueItem(getString(R.string.auto_mf_onboarding_suitability_summary_title));
        RiskReviewFragment read = RiskReviewFragment.read(str, populateeventdevicedata);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, read, read.getClass().getName()).write();
        mo13676d_("mfsuit_review_risk_level");
    }

    public final void MediaBrowserCompat$ItemReceiver(populateEventDeviceData populateeventdevicedata) {
        Intent MediaBrowserCompat$ItemReceiver = RiskAssessmentSuccessActivity.MediaBrowserCompat$ItemReceiver(this, populateeventdevicedata);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 12);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        setResult(-1, new Intent());
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent();
        intent.putExtra("showPopup", true);
        setResult(0, intent);
        finish();
    }

    public void onBackPressed() {
        SendImage sendImage = this.presenter;
        int i = SendImage.C37642.MediaBrowserCompat$CustomActionResultReceiver[sendImage.MediaDescriptionCompat.ordinal()];
        boolean z = true;
        if (i == 2) {
            sendImage.MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.RISK_SELECTION);
        } else if (i == 3) {
            sendImage.MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_QUESTIONNAIRE);
        } else if (i != 4) {
            z = false;
        } else {
            sendImage.MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_SUMMARY);
        }
        if (!z) {
            setResult(0, new Intent());
            super.onBackPressed();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(populateExecutionData populateexecutiondata) {
        SendImage sendImage = this.presenter;
        sendImage.read = populateexecutiondata;
        sendImage.MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14631x50fd9e4a() {
        SendImage sendImage = this.presenter;
        getSoapAction getsoapaction = getSoapAction.MediaBrowserCompat$ItemReceiver;
        if (sendImage.RatingCompat != null) {
            getsoapaction.IconCompatParcelizer(sendImage.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReportDataCapture> list) {
        SendImage sendImage = this.presenter;
        sendImage.MediaBrowserCompat$ItemReceiver = list;
        sendImage.MediaBrowserCompat$ItemReceiver();
    }

    public final void read(String str, populateEventDeviceData populateeventdevicedata) {
        SendImage sendImage = this.presenter;
        sendImage.MediaMetadataCompat = str;
        sendImage.write = populateeventdevicedata;
        sendImage.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$QueueItem() {
        SendImage sendImage = this.presenter;
        sendImage.write.MediaBrowserCompat$ItemReceiver = sendImage.IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.now());
        sendImage.MediaBrowserCompat$ItemReceiver();
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 12) {
            SendImage sendImage = this.presenter;
            setProfileRequest setprofilerequest = setProfileRequest.IconCompatParcelizer;
            if (sendImage.RatingCompat != null) {
                setprofilerequest.IconCompatParcelizer(sendImage.RatingCompat);
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
