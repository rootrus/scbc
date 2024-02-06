package com.scb.phone.view.activity.ntb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaQuestionnaireFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.ContactInfoFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.FillInformationFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationInfoFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment;
import com.scb.phone.view.fragment.ntb.fillinformation.ReviewInfoFragment;
import com.scb.phone.view.fragment.ntb.selectaccount.SelectAccountFragment;
import java.util.Arrays;
import p040o.ActivityBuilder_ContributeHmlETBSummaryActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4145cD;
import p040o.C4162cY;
import p040o.C4192cj;
import p040o.C6316x70e440ff;
import p040o.C6487x1afa2331;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.KtaJsonCheck;
import p040o.cj$MediaBrowserCompat$ItemReceiver;
import p040o.getGuideLineRenderer;
import p040o.getProjection;

public abstract class BaseNtbInstructionActivity extends BaseActivity implements KtaJsonCheck.MediaDescriptionCompat, FragmentBuilder_BindBulkTransferEmptyFragment, FragmentBuilder_BindChangeChannelStatementReviewFragment.read, FragmentBuilder_BindChangeChannelStatementReviewFragment.write, C6487x1afa2331 {
    private String MediaBrowserCompat$MediaItem;
    @BindView
    public ProgressStateBar progressStateBar;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_CustomAttribute.Builder builder);

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79052131493130);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.progressStateBar.setStates(Arrays.asList(getResources().getStringArray(R.array.f64852130903065)));
    }

    public final void ap_() {
        this.progressStateBar.setVisibility(8);
    }

    public final void ao_() {
        this.progressStateBar.setVisibility(0);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public final void MediaSessionCompat$QueueItem() {
        this.progressStateBar.setCurrentState(1);
        this.progressStateBar.requestLayout();
        setTitle(R.string.fatca_question_title);
    }

    public final void an_() {
        this.progressStateBar.setCurrentState(2);
        this.progressStateBar.requestLayout();
    }

    public final void am_() {
        this.progressStateBar.setCurrentState(3);
        this.progressStateBar.requestLayout();
    }

    public final void MediaSessionCompat$Token() {
        SelectAccountFragment selectAccountFragment = new SelectAccountFragment();
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, selectAccountFragment, selectAccountFragment.getClass().getName()).write();
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaBrowserCompat$MediaItem = str;
        mo33978x50fd9e4a();
    }

    /* renamed from: m_ */
    public final void mo34015m_(String str) {
        MediaSessionCompat$QueueItem(str);
    }

    public final void write(String str) {
        MediaSessionCompat$QueueItem(str);
    }

    public final void setItemInvoker() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof FillInformationFragment) {
            MediaSessionCompat$QueueItem(getString(R.string.ntb_fillinformation_personal_info_page));
        } else if (findFragmentById instanceof ContactInfoFragment) {
            MediaSessionCompat$QueueItem(getString(R.string.ntb_fillinformation_contact_info_page));
        } else if (findFragmentById instanceof OccupationInfoFragment) {
            MediaSessionCompat$QueueItem(getString(R.string.ntb_fillinformation_occupation_info_page));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        MediaSessionCompat$ResultReceiverWrapper();
        return true;
    }

    public void onBackPressed() {
        MediaSessionCompat$ResultReceiverWrapper();
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        String str;
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof FatcaLandingQuestionFragment) {
            FatcaLandingQuestionFragment fatcaLandingQuestionFragment = (FatcaLandingQuestionFragment) findFragmentById;
            if (fatcaLandingQuestionFragment.getChildFragmentManager().findFragmentById(R.id.fatca_containner) instanceof FatcaQuestionnaireFragment) {
                fatcaLandingQuestionFragment.getChildFragmentManager().MediaMetadataCompat();
            } else {
                fatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver();
            }
        } else if (findFragmentById instanceof SelectAccountFragment) {
            SelectAccountFragment selectAccountFragment = (SelectAccountFragment) findFragmentById;
            if (selectAccountFragment.getChildFragmentManager().write() == 0) {
                selectAccountFragment.MediaBrowserCompat$ItemReceiver();
            } else {
                selectAccountFragment.getChildFragmentManager().RatingCompat();
                selectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.ao_();
            }
            MediaSessionCompat$QueueItem(getString(R.string.select_account_title));
        } else {
            boolean z = true;
            if (findFragmentById instanceof FillInformationFragment) {
                FillInformationFragment fillInformationFragment = (FillInformationFragment) findFragmentById;
                if (fillInformationFragment.getFragmentManager().write() == 0) {
                    CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(fillInformationFragment.getContext());
                    String string = IconCompatParcelizer.read.getString(R.string.ntb_pop_up_title_exit);
                    if (!(string == null || string.length() == 0)) {
                        IconCompatParcelizer.mTitleTextView.setVisibility(0);
                        IconCompatParcelizer.mTitleTextView.setText(string);
                    }
                    String string2 = IconCompatParcelizer.read.getString(R.string.ntb_pop_up_message_exit);
                    if (true ^ (string2 == null || string2.length() == 0)) {
                        IconCompatParcelizer.mTextTextView.setVisibility(0);
                        IconCompatParcelizer.mTextTextView.setText(string2);
                    }
                    CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), ActivityBuilder_ContributeHmlETBSummaryActivity.IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new C6316x70e440ff(fillInformationFragment)).show();
                    return;
                }
                fillInformationFragment.getFragmentManager().RatingCompat();
                FragmentBuilder_BindChangeChannelStatementReviewFragment.write write = fillInformationFragment.IconCompatParcelizer;
                if (write != null) {
                    write.write(fillInformationFragment.getString(R.string.ntb_fillinformation_personal_info_page));
                }
            } else if ((findFragmentById instanceof ContactInfoFragment) || (findFragmentById instanceof OccupationInfoFragment) || (findFragmentById instanceof BaseAddressFragment) || (findFragmentById instanceof OccupationSearchFragment) || (findFragmentById instanceof ReviewInfoFragment)) {
                if (findFragmentById instanceof BaseAddressFragment) {
                    String str2 = "";
                    if (findFragmentById.getTargetFragment() instanceof ContactInfoFragment) {
                        ContactInfoFragment contactInfoFragment = (ContactInfoFragment) findFragmentById.getTargetFragment();
                        findFragmentById.getTargetRequestCode();
                        C4162cY cYVar = contactInfoFragment.contactInformationPresenter;
                        String obj = contactInfoFragment.customEmail.mEditText.getText().toString();
                        String obj2 = contactInfoFragment.customMobile.mEditText.getText().toString();
                        boolean isChecked = contactInfoFragment.checkBoxSameAddress.isChecked();
                        getProjection write2 = cYVar.write.read.write();
                        cYVar.MediaBrowserCompat$ItemReceiver = write2;
                        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver = cYVar.read.MediaBrowserCompat$CustomActionResultReceiver(write2, cYVar.write.MediaBrowserCompat$CustomActionResultReceiver.setCheckable());
                        cYVar.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver;
                        cYVar.MediaDescriptionCompat = obj;
                        cYVar.MediaBrowserCompat$SearchResultReceiver = obj2;
                        if (MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat != null) {
                            str = cYVar.MediaMetadataCompat.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
                        } else {
                            str = str2;
                        }
                        if (cYVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver != null) {
                            str2 = cYVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
                        }
                        getGuideLineRenderer getguidelinerenderer = new getGuideLineRenderer(cYVar, str, str2, isChecked);
                        if (cYVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            getguidelinerenderer.IconCompatParcelizer(cYVar.RatingCompat);
                        }
                        cYVar.MediaBrowserCompat$ItemReceiver();
                        MediaSessionCompat$QueueItem(getString(R.string.ntb_fillinformation_contact_info_page));
                    } else if (findFragmentById.getTargetFragment() instanceof OccupationInfoFragment) {
                        OccupationInfoFragment occupationInfoFragment = (OccupationInfoFragment) findFragmentById.getTargetFragment();
                        findFragmentById.getTargetRequestCode();
                        C4192cj cjVar = occupationInfoFragment.occupationInformationPresenter;
                        String obj3 = occupationInfoFragment.textCompanyName.mEditText.getText().toString();
                        int selectedItemPosition = occupationInfoFragment.spinnerSourceOfIncome.getSelectedItemPosition();
                        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver2 = cjVar.write.MediaBrowserCompat$CustomActionResultReceiver(cjVar.read.read.write(), cjVar.read.MediaBrowserCompat$CustomActionResultReceiver.setCheckable());
                        cjVar.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver2;
                        if (MediaBrowserCompat$CustomActionResultReceiver2.Keep != null) {
                            str2 = cjVar.MediaBrowserCompat$MediaItem.Keep.MediaBrowserCompat$SearchResultReceiver;
                        }
                        cjVar.MediaBrowserCompat$ItemReceiver = obj3;
                        C4145cD cDVar = new C4145cD(cjVar, str2);
                        if (cjVar.RatingCompat != null) {
                            cDVar.IconCompatParcelizer(cjVar.RatingCompat);
                        }
                        cjVar.MediaSessionCompat$QueueItem = selectedItemPosition;
                        if (cjVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            cjVar.RatingCompat.AlertController$RecycleListView();
                        }
                        cjVar.read.write();
                        cjVar.read.IconCompatParcelizer(new cj$MediaBrowserCompat$ItemReceiver(cjVar, (byte) 0));
                        cjVar.MediaBrowserCompat$CustomActionResultReceiver();
                        MediaSessionCompat$QueueItem(getString(R.string.ntb_fillinformation_occupation_info_page));
                    }
                }
                getSupportFragmentManager().RatingCompat();
            } else if (findFragmentById instanceof EkycFragment) {
                ((EkycFragment) findFragmentById).MediaMetadataCompat();
            } else if (findFragmentById instanceof NdidInstructionFragment) {
                ((NdidInstructionFragment) findFragmentById).MediaSessionCompat$ResultReceiverWrapper();
            } else {
                super.onBackPressed();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 27) {
            mo33978x50fd9e4a();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void mo33978x50fd9e4a() {
        FillInformationFragment fillInformationFragment = new FillInformationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_STAGE", this.MediaBrowserCompat$MediaItem);
        fillInformationFragment.setArguments(bundle);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, fillInformationFragment, fillInformationFragment.getClass().getName()).write();
    }

    public final void write(Fragment fragment) {
        getSupportFragmentManager().read().write(R.id.container, fragment, fragment.getClass().getName()).MediaBrowserCompat$CustomActionResultReceiver(fragment.getClass().getName()).write();
    }
}
