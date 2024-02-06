package com.scb.phone.view.activity.etb;

import android.app.Activity;
import android.content.Context;
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
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.scb.phone.view.fragment.etb.ETBProductDetailFragment;
import com.scb.phone.view.fragment.etb.EtbPersonalInformationFragment;
import com.scb.phone.view.fragment.etb.EtbReviewInformationFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaQuestionnaireFragment;
import java.util.Arrays;
import p040o.AlertController$RecycleListView;
import p040o.C1346xf91fc122;
import p040o.C1425qp;
import p040o.C7400ql;
import p040o.DeepLinkModule_ContributeJuristicStartingPinDeepLinkActivity;
import p040o.DeepLinkModule_ContributeJustForYouDeepLinkActivity;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.access$1900;
import p040o.deleteSessionPartFilesFor;
import p040o.getTimeOutParameters;

public class EtbActivity extends BaseActivity implements FragmentBuilder_BindBulkTransferEmptyFragment, C1425qp, getTimeOutParameters {
    private deleteSessionPartFilesFor MediaBrowserCompat$SearchResultReceiver;
    private access$1900 MediaDescriptionCompat;
    @BindView
    ProgressStateBar progressStateBar;

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void IconCompatParcelizer(Fragment fragment, F f) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((getTimeOutParameters) this, fragment, (BaseFragment) f, (String) null);
    }

    public final void MediaSessionCompat$QueueItem() {
    }

    public final /* synthetic */ void write(C1346xf91fc122 gettimeoutparameters_mediabrowsercompat_customactionresultreceiver) {
        AlertController$RecycleListView.read((getTimeOutParameters) this, gettimeoutparameters_mediabrowsercompat_customactionresultreceiver);
    }

    public static Intent IconCompatParcelizer(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, EtbActivity.class);
        intent.putExtra("EXTRA_ACCOUNT_TYPE", str);
        intent.putExtra("EXTRA_PRODUCT_CODDE", str2);
        intent.putExtra("EXTRA_OPEN_FLAG", str3);
        return intent;
    }

    public final void MediaSessionCompat$Token() {
        EtbPersonalInformationFragment MediaBrowserCompat$ItemReceiver = EtbPersonalInformationFragment.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    public final void write(access$1900 access_1900, deleteSessionPartFilesFor deletesessionpartfilesfor) {
        this.MediaDescriptionCompat = access_1900;
        this.MediaBrowserCompat$SearchResultReceiver = deletesessionpartfilesfor;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        setContentView(R.layout.f76832131492908);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.progressStateBar.setStates(Arrays.asList(getResources().getStringArray(R.array.f64682130903047)));
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, ETBProductDetailFragment.write(getIntent().getStringExtra("EXTRA_ACCOUNT_TYPE"), getIntent().getStringExtra("EXTRA_PRODUCT_CODDE"), getIntent().getStringExtra("EXTRA_OPEN_FLAG")), ETBProductDetailFragment.class.getSimpleName()).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof EtbPersonalInformationFragment) {
            EtbPersonalInformationFragment etbPersonalInformationFragment = (EtbPersonalInformationFragment) findFragmentById;
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(etbPersonalInformationFragment.getContext());
            String string = IconCompatParcelizer.read.getString(R.string.mf_personal_info_exit_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer.read.getString(R.string.mf_personal_info_exit_message);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(string2);
            }
            CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mf_personal_info_not_now), DeepLinkModule_ContributeJustForYouDeepLinkActivity.read);
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mf_personal_info_exit), new DeepLinkModule_ContributeJuristicStartingPinDeepLinkActivity(etbPersonalInformationFragment)).show();
        } else if (findFragmentById instanceof FatcaLandingQuestionFragment) {
            FatcaLandingQuestionFragment fatcaLandingQuestionFragment = (FatcaLandingQuestionFragment) findFragmentById;
            if (fatcaLandingQuestionFragment.getChildFragmentManager().findFragmentById(R.id.fatca_containner) instanceof FatcaQuestionnaireFragment) {
                fatcaLandingQuestionFragment.getChildFragmentManager().MediaMetadataCompat();
            } else {
                fatcaLandingQuestionFragment.MediaBrowserCompat$ItemReceiver();
            }
        } else {
            super.onBackPressed();
        }
        Fragment findFragmentById2 = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById2 instanceof BreadcrumbFragment) {
            ((BreadcrumbFragment) findFragmentById2).setPadding();
        }
    }

    public final ProgressStateBar ParcelableVolumeInfo() {
        return this.progressStateBar;
    }

    public final getTimeOutParameters.write MediaSessionCompat$ResultReceiverWrapper() {
        return new C7400ql(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof EtbReviewInformationFragment) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void MediaBrowserCompat$ItemReceiver(F f) {
        getSupportFragmentManager().read().write(R.id.container, f, f.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    public final /* synthetic */ <F extends BaseFragment & C1346xf91fc122> void write(F f) {
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, f, f.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }
}
