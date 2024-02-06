package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashOccupationSearchActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import com.scb.phone.view.fragment.easycash.DurationEmploymentDialog;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C3489xb1380098;
import p040o.C7505tO;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageProcessor;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.animateCamera;
import p040o.forEachClear;
import p040o.getPrepaidCashOutConfirmation;
import p040o.getPrepaidTransactions;
import p040o.getTimeOutParameters;
import p040o.isBuildingsEnabled;
import p040o.notifyKeyReclaimed;
import p040o.notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setListenerCallbackThreadType;
import p040o.setTapText;
import p040o.zzby;

public class EasycashOccupationInfoFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.setCheckable, DurationEmploymentDialog.read {
    private ArrayList<CrashlyticsReport.FilesPayload.File.Builder> IconCompatParcelizer;
    private DurationEmploymentDialog MediaBrowserCompat$CustomActionResultReceiver;
    private IOrientationGuidanceCalculator MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    @BindView
    protected FrameLayout buttonLayout;
    @BindView
    protected Button buttonNext;
    @BindView
    protected CustomPhone contactNumber;
    @HmlPinActivity
    public ImageProcessor.ProcessProgressEvent presenter;
    @BindView
    protected Spinner spinnerSourceOfIncome;
    @BindView
    protected CommonInputViewGroup textCompanyName;
    @BindView
    protected TextView textDuration;
    @BindView
    protected TextView textJob;
    @BindView
    protected TextView textWorkAddress;
    @BindView
    protected TextView textWorkAddressError;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EasycashOccupationInfoFragment IconCompatParcelizer(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = new EasycashOccupationInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST", new ArrayList(list));
        easycashOccupationInfoFragment.setArguments(bundle);
        return easycashOccupationInfoFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86902131493917, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            android.os.Bundle r6 = r5.getArguments()
            if (r6 == 0) goto L_0x0015
            android.os.Bundle r6 = r5.getArguments()
            java.lang.String r7 = "com.scb.phone.EXTRA_EASYCASH_ACCOUNT_LIST"
            java.util.ArrayList r6 = r6.getParcelableArrayList(r7)
            r5.IconCompatParcelizer = r6
        L_0x0015:
            com.scb.phone.view.custom.common.CommonInputViewGroup r6 = r5.textCompanyName
            o.PrepaidCashOutService r7 = new o.PrepaidCashOutService
            r7.<init>(r5)
            r6.setFocusListener(r7)
            android.widget.FrameLayout r6 = r5.buttonLayout
            o.getTravelWalletDisplayRate r7 = new o.getTravelWalletDisplayRate
            r7.<init>(r5)
            r6.setOnFocusChangeListener(r7)
            o.ImageProcessor$ProcessProgressEvent r6 = r5.presenter
            r6.MediaBrowserCompat$ItemReceiver(r5)
            o.ImageProcessor$ProcessProgressEvent r6 = r5.presenter
            o.IOrientationGuidanceCalculator r7 = r5.MediaBrowserCompat$MediaItem
            java.lang.String r7 = r7.MediaBrowserCompat$SearchResultReceiver()
            o.IOrientationGuidanceCalculator r0 = r5.MediaBrowserCompat$MediaItem
            java.lang.String r0 = r0.MediaBrowserCompat$SearchResultReceiver()
            int r1 = r0.hashCode()
            r2 = 277399877(0x1088c945, float:5.3952646E-29)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0056
            r2 = 2090361232(0x7c986190, float:6.3296634E36)
            if (r1 != r2) goto L_0x0060
            java.lang.String r1 = "PURPOSEFUL_LOAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r0 = r3
            goto L_0x0061
        L_0x0056:
            java.lang.String r1 = "HOME_TOP_UP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r0 = r4
            goto L_0x0061
        L_0x0060:
            r0 = -1
        L_0x0061:
            if (r0 == 0) goto L_0x007e
            if (r0 == r4) goto L_0x0071
            java.util.ArrayList<o.CrashlyticsReport$FilesPayload$File$Builder> r0 = r5.IconCompatParcelizer
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008c
            r3 = r4
            goto L_0x008c
        L_0x0071:
            o.IOrientationGuidanceCalculator r0 = r5.MediaBrowserCompat$MediaItem
            o.getTotalRamInBytes r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<o.isDebuggerAttached> r0 = r0.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.isEmpty()
            goto L_0x008a
        L_0x007e:
            o.IOrientationGuidanceCalculator r0 = r5.MediaBrowserCompat$MediaItem
            o.isRooted r0 = r0.MediaBrowserCompat$MediaItem()
            java.util.List<o.isDebuggerAttached> r0 = r0.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.isEmpty()
        L_0x008a:
            r3 = r0 ^ 1
        L_0x008c:
            o.IOrientationGuidanceCalculator r0 = r5.MediaBrowserCompat$MediaItem
            java.lang.String r0 = r0.read()
            r6.f2723x50fd9e4a = r7
            r6.MediaBrowserCompat$MediaItem = r3
            r6.read = r0
            o.ImageProcessor$ProcessProgressEvent r6 = r5.presenter
            r6.MediaBrowserCompat$CustomActionResultReceiver()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void MediaMetadataCompat() {
        CommonInputViewGroup commonInputViewGroup = this.textCompanyName;
        commonInputViewGroup.setText(commonInputViewGroup.mEditText.getText().toString().trim());
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.textCompanyName.mEditText.getText().toString());
    }

    public final void read() {
        this.textCompanyName.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.textCompanyName.setErrorText(getString(R.string.company_name_inline_error));
        this.textCompanyName.MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.textJob.setText(str);
    }

    @OnClick
    public void onOccupationClick() {
        Intent intent = new Intent(getContext(), EasycashOccupationSearchActivity.class);
        intent.putExtra("OCCUPATION_LIST_SOURCE", C7505tO.DEFAULT.ordinal());
        intent.putExtra("SEARCH_TITLE", getString(R.string.occupation_info_title));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_CODE");
            String stringExtra2 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION");
            String stringExtra3 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE");
            ImageProcessor.ProcessProgressEvent processProgressEvent = this.presenter;
            String trim = this.textCompanyName.mEditText.getText().toString().trim();
            CustomPhone customPhone = this.contactNumber;
            String str = TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver;
            processProgressEvent.MediaSessionCompat$QueueItem = new zzby.zzb.zza(stringExtra, stringExtra2, stringExtra3);
            notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifyKeyReclaimed.read().IconCompatParcelizer(processProgressEvent.read)).RatingCompat(processProgressEvent.f2723x50fd9e4a)).MediaBrowserCompat$MediaItem("N")).write(processProgressEvent.MediaSessionCompat$QueueItem);
            isBuildingsEnabled isbuildingsenabled = processProgressEvent.IconCompatParcelizer;
            if (isbuildingsenabled == null) {
                isbuildingsenabled = processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat;
            }
            notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver2 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(isbuildingsenabled);
            boolean z = false;
            if (trim == null || trim.length() == 0) {
                trim = null;
            }
            notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver3 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver2.write(trim)).write(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat);
            if (str.isEmpty()) {
                str = null;
            }
            notifyKeyReclaimed notifykeyreclaimed = new notifyKeyReclaimed((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver3.read(str)).MediaBrowserCompat$CustomActionResultReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$ItemReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)).MediaDescriptionCompat(processProgressEvent.AlertController$RecycleListView)).MediaBrowserCompat$SearchResultReceiver(processProgressEvent.MediaSessionCompat$ResultReceiverWrapper)).MediaMetadataCompat(processProgressEvent.ParcelableVolumeInfo));
            if (processProgressEvent.RatingCompat != null) {
                z = true;
            }
            if (z) {
                processProgressEvent.RatingCompat.AlertController$RecycleListView();
            }
            processProgressEvent.MediaDescriptionCompat.read(notifykeyreclaimed);
            processProgressEvent.MediaDescriptionCompat.IconCompatParcelizer(new C3489xb1380098(processProgressEvent, true));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<MoreExecutors> list, int i) {
        this.spinnerSourceOfIncome.setAdapter(new ArrayAdapter(getContext(), R.layout.f84862131493713, list));
        this.spinnerSourceOfIncome.setSelection(i);
        this.spinnerSourceOfIncome.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ImageProcessor.ProcessProgressEvent processProgressEvent = EasycashOccupationInfoFragment.this.presenter;
                if (processProgressEvent.MediaSessionCompat$Token.size() > i) {
                    String str = processProgressEvent.MediaSessionCompat$Token.get(i).MediaBrowserCompat$ItemReceiver;
                    isBuildingsEnabled isbuildingsenabled = new isBuildingsEnabled();
                    isbuildingsenabled.MediaBrowserCompat$ItemReceiver = str;
                    processProgressEvent.IconCompatParcelizer = isbuildingsenabled;
                }
            }
        });
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.textCompanyName.setTitle(getString(R.string.commercial_loan_company_title));
    }

    public final void write(String str) {
        this.textCompanyName.setText(str.trim());
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.textCompanyName.mEditText.getText().toString());
    }

    public final void read(String str) {
        this.textWorkAddress.setText(str);
    }

    public final void RatingCompat() {
        this.textWorkAddressError.setVisibility(0);
        this.textWorkAddressError.setText(getString(R.string.address_required_field));
    }

    public final void write() {
        this.textWorkAddressError.setVisibility(8);
    }

    @OnClick
    public void onWorkAddressClick() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashWorkAddressFragment.MediaBrowserCompat$ItemReceiver(this.presenter.MediaBrowserCompat$ItemReceiver));
    }

    public final void IconCompatParcelizer(animateCamera animatecamera) {
        ImageProcessor.ProcessProgressEvent processProgressEvent = this.presenter;
        String trim = this.textCompanyName.mEditText.getText().toString().trim();
        CustomPhone customPhone = this.contactNumber;
        String str = TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver;
        notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifyKeyReclaimed.read().IconCompatParcelizer(processProgressEvent.read)).RatingCompat(processProgressEvent.f2723x50fd9e4a)).MediaBrowserCompat$MediaItem("N");
        zzby.zzb.zza zza = processProgressEvent.MediaSessionCompat$QueueItem;
        if (zza == null) {
            zza = processProgressEvent.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
        }
        notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver2 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver.write(zza);
        isBuildingsEnabled isbuildingsenabled = processProgressEvent.IconCompatParcelizer;
        if (isbuildingsenabled == null) {
            isbuildingsenabled = processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat;
        }
        notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver3 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver(isbuildingsenabled);
        boolean z = false;
        if (trim == null || trim.length() == 0) {
            trim = null;
        }
        notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver4 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver3.write(trim)).write(animatecamera);
        if (str.isEmpty()) {
            str = null;
        }
        notifyKeyReclaimed notifykeyreclaimed = new notifyKeyReclaimed((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver4.read(str)).MediaBrowserCompat$CustomActionResultReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$ItemReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)).MediaDescriptionCompat(processProgressEvent.AlertController$RecycleListView)).MediaBrowserCompat$SearchResultReceiver(processProgressEvent.MediaSessionCompat$ResultReceiverWrapper)).MediaMetadataCompat(processProgressEvent.ParcelableVolumeInfo));
        if (processProgressEvent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            processProgressEvent.RatingCompat.AlertController$RecycleListView();
        }
        processProgressEvent.MediaDescriptionCompat.read(notifykeyreclaimed);
        processProgressEvent.MediaDescriptionCompat.IconCompatParcelizer(new C3489xb1380098(processProgressEvent, true));
    }

    public final void IconCompatParcelizer(String str) {
        this.contactNumber.MediaBrowserCompat$ItemReceiver();
        this.contactNumber.setNecessaryInfo(str, getString(R.string.easycash_invalid_format), new getPrepaidTransactions(this.presenter));
    }

    public final void write(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    @OnClick
    public void onNextButtonClicked() {
        MediaMetadataCompat();
        if (this.presenter.read()) {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            if (str != null && !str.isEmpty()) {
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$MediaItem.write()));
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("job_title", this.MediaBrowserCompat$SearchResultReceiver));
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("source_of_income", this.presenter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver));
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("company_name", this.textCompanyName.mEditText.getText().toString()));
                forEachClear foreachclear = this.tracker;
                if (getActivity() != null) {
                    foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_occupation");
                }
            }
            ImageProcessor.ProcessProgressEvent processProgressEvent = this.presenter;
            CustomPhone customPhone = this.contactNumber;
            String str2 = TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver;
            notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifyKeyReclaimed.read().IconCompatParcelizer(processProgressEvent.read)).RatingCompat(processProgressEvent.f2723x50fd9e4a)).MediaBrowserCompat$MediaItem("Y");
            zzby.zzb.zza zza = processProgressEvent.MediaSessionCompat$QueueItem;
            if (zza == null) {
                zza = processProgressEvent.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
            }
            notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver notifykeyreclaimed_mediabrowsercompat_itemreceiver2 = (notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver.write(zza)).MediaBrowserCompat$ItemReceiver(processProgressEvent.IconCompatParcelizer)).write(processProgressEvent.write)).write(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat);
            boolean z = true;
            if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            notifyKeyReclaimed notifykeyreclaimed = new notifyKeyReclaimed((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) ((notifyKeyReclaimed$MediaBrowserCompat$ItemReceiver) notifykeyreclaimed_mediabrowsercompat_itemreceiver2.read(str2)).MediaBrowserCompat$CustomActionResultReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$ItemReceiver(processProgressEvent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)).MediaDescriptionCompat(processProgressEvent.AlertController$RecycleListView)).MediaBrowserCompat$SearchResultReceiver(processProgressEvent.MediaSessionCompat$ResultReceiverWrapper)).MediaMetadataCompat(processProgressEvent.ParcelableVolumeInfo));
            if (processProgressEvent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                processProgressEvent.RatingCompat.AlertController$RecycleListView();
            }
            processProgressEvent.MediaDescriptionCompat.read(notifykeyreclaimed);
            processProgressEvent.MediaDescriptionCompat.IconCompatParcelizer(new C3489xb1380098(processProgressEvent, false));
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDurationClick() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            DurationEmploymentDialog durationEmploymentDialog = new DurationEmploymentDialog(getContext());
            this.MediaBrowserCompat$CustomActionResultReceiver = durationEmploymentDialog;
            onGetStartedClick.write((Object) this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            durationEmploymentDialog.IconCompatParcelizer = this;
        }
        DurationEmploymentDialog durationEmploymentDialog2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.presenter.AlertController$RecycleListView;
        String str2 = this.presenter.MediaSessionCompat$ResultReceiverWrapper;
        durationEmploymentDialog2.write = str;
        durationEmploymentDialog2.MediaBrowserCompat$ItemReceiver = str2;
        durationEmploymentDialog2.show();
    }

    public final void IconCompatParcelizer(boolean z, boolean z2) {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashBusinessAndMaritalInfoFragment.read(z, z2, this.IconCompatParcelizer));
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaMetadataCompat.IconCompatParcelizer(this, AdditionDocumentScbAccountFragment.IconCompatParcelizer(z, this.IconCompatParcelizer));
    }

    public final void read(boolean z) {
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", z);
        DocumentUploadFragment documentUploadFragment = new DocumentUploadFragment();
        documentUploadFragment.setArguments(bundle);
        gettimeoutparameters.IconCompatParcelizer(this, documentUploadFragment);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashIssuerLandingFragment());
    }

    public final void IconCompatParcelizer() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashContactInformationFragment.write());
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer((Context) getActivity()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new getPrepaidCashOutConfirmation(this));
        IconCompatParcelizer2.setCancelable(false);
        IconCompatParcelizer2.setOnDismissListener(this);
        IconCompatParcelizer2.show();
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.occupation_info_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$MediaItem = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.tracker = null;
        this.MediaBrowserCompat$MediaItem = null;
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        ImageProcessor.ProcessProgressEvent processProgressEvent = this.presenter;
        processProgressEvent.AlertController$RecycleListView = str;
        processProgressEvent.MediaSessionCompat$ResultReceiverWrapper = str2;
        setListenerCallbackThreadType setlistenercallbackthreadtype = new setListenerCallbackThreadType(processProgressEvent);
        if (processProgressEvent.RatingCompat != null) {
            setlistenercallbackthreadtype.IconCompatParcelizer(processProgressEvent.RatingCompat);
        }
        if (str == null || str2 == null) {
            this.textDuration.setText("");
            this.textDuration.setHint(getString(R.string.auto_scbone_occupation_year_and_month_placeholder));
        } else if (str.equals("0")) {
            this.textDuration.setText(getString(R.string.auto_scbone_occupation_display_month, str2));
        } else if (str2.equals("0")) {
            this.textDuration.setText(getString(R.string.auto_scbone_occupation_display_year, DurationEmploymentDialog.MediaBrowserCompat$CustomActionResultReceiver(str)));
        } else {
            this.textDuration.setText(getString(R.string.auto_scbone_occupation_year_and_month_value, DurationEmploymentDialog.MediaBrowserCompat$CustomActionResultReceiver(str), str2));
        }
    }
}
