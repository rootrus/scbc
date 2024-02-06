package com.scb.phone.view.fragment.ndid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity;
import com.scb.phone.view.activity.ndid.NdidSelectIdpActivity;
import com.scb.phone.view.activity.ndid.RpLivenessCheckActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeFastPayTransferReviewActivity;
import p040o.ActivityBuilder_ContributeFundAppFormActivity;
import p040o.ActivityBuilder_ContributeFundOnboardingLandingActivity;
import p040o.AutoValue_CrashlyticsReport;
import p040o.C4124by;
import p040o.C6486xe34110e2;
import p040o.C7040xee086eb3;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.IVideoResourceProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.getExtractFaceImage;
import p040o.getKernelIDAdd;
import p040o.getRect;
import p040o.getVideoFiles;
import p040o.setTapText;

public class NdidInstructionFragment extends BaseFragment implements getExtractFaceImage {
    private C6486xe34110e2 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected Button buttonNext;
    @BindView
    protected ImageView livenessCheckedIcon;
    @BindView
    protected ImageView livenessIcon;
    @BindView
    protected ImageView livenessIndicator;
    @BindView
    protected TextView livenessText;
    @HmlPinActivity
    public C4124by presenter;
    @BindView
    protected ImageView scanIdCheckedIcon;
    @BindView
    protected ImageView scanIdIcon;
    @BindView
    protected ImageView scanIdIndicator;
    @BindView
    protected TextView scanIdText;
    @BindView
    protected ImageView verifyingPartnerCheckedIcon;
    @BindView
    protected ImageView verifyingPartnerIcon;
    @BindView
    protected ImageView verifyingPartnerIndicator;
    @BindView
    protected TextView verifyingPartnerText;

    /* access modifiers changed from: protected */
    public String MediaDescriptionCompat() {
        return "open_account";
    }

    /* access modifiers changed from: protected */
    public int RatingCompat() {
        return R.string.ntb_pop_up_message_exit;
    }

    public static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((NdidInstructionFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C6486xe34110e2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C6486xe34110e2) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88602131494087, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("com.scb.phone.view.fragment.ndid.STAGE_TAG") : null;
        this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C4124by byVar = this.presenter;
        if (string != null && "RP_CID_VERIFIED".equals(string)) {
            byVar.write = C7040xee086eb3.VERIFYING_PARTNER_STATE;
        } else if (string != null && "RP_PENDING".equals(string)) {
            byVar.write = C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE;
        } else if (string != null && "RP_LIVENESS".equals(string)) {
            byVar.write = C7040xee086eb3.LIVENESS_CHECK_STATE;
        }
        getVideoFiles getvideofiles = new getVideoFiles(byVar);
        if (byVar.RatingCompat != null) {
            getvideofiles.IconCompatParcelizer(byVar.RatingCompat);
        }
        IVideoResourceProvider.StorageType storageType = new IVideoResourceProvider.StorageType(byVar);
        if (byVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            storageType.IconCompatParcelizer(byVar.RatingCompat);
        }
        return inflate;
    }

    @OnClick
    public void onNextButtonClick() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.StrongExpirableEvictableEntry.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public Intent MediaSessionCompat$QueueItem() {
        return new Intent(getActivity(), NdidSelectIdpActivity.class);
    }

    /* access modifiers changed from: protected */
    public Intent MediaBrowserCompat$ItemReceiver(List<String> list) {
        return NdidSelectIdpActivity.write(getContext(), list);
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaSessionCompat$QueueItem = setTapText.write(activity, MediaSessionCompat$QueueItem).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaSessionCompat$QueueItem.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaSessionCompat$QueueItem, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("com.scb.phone.view.fragment.ndid.EXTRA_REMARK");
        }
        Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(arrayList);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ActivityBuilder_ContributeFundOnboardingLandingActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaSessionCompat$Token() {
        Intent MediaMetadataCompat = MediaMetadataCompat();
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaMetadataCompat = setTapText.write(activity, MediaMetadataCompat).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaMetadataCompat.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaMetadataCompat, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Intent MediaMetadataCompat() {
        return new Intent(getActivity(), NdidNationalIdInputActivity.class);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C7040xee086eb3 rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver) {
        float f = 1.0f;
        this.scanIdText.setAlpha(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.SCANNING_ID_STATE ? 1.0f : 0.4f);
        this.verifyingPartnerText.setAlpha((rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE) ? 1.0f : 0.4f);
        this.livenessText.setAlpha(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.LIVENESS_CHECK_STATE ? 1.0f : 0.4f);
        this.scanIdIcon.setAlpha(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.SCANNING_ID_STATE ? 1.0f : 0.4f);
        this.verifyingPartnerIcon.setAlpha((rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.SCANNING_ID_STATE) ? 1.0f : 0.4f);
        ImageView imageView = this.livenessIcon;
        if (rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.FINISHED_FLOW_STATE) {
            f = 0.4f;
        }
        imageView.setAlpha(f);
        ImageView imageView2 = this.scanIdIndicator;
        C7040xee086eb3 rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver2 = C7040xee086eb3.SCANNING_ID_STATE;
        int i = R.drawable.circle_indicator_purple;
        imageView2.setImageResource(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver2 ? R.drawable.circle_indicator_purple : R.drawable.shape_circle_white_purple_border);
        this.verifyingPartnerIndicator.setImageResource((rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE) ? R.drawable.circle_indicator_purple : R.drawable.shape_circle_white_purple_border);
        ImageView imageView3 = this.livenessIndicator;
        if (rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver != C7040xee086eb3.LIVENESS_CHECK_STATE) {
            i = R.drawable.shape_circle_white_purple_border;
        }
        imageView3.setImageResource(i);
        int i2 = 0;
        this.scanIdCheckedIcon.setVisibility(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver != C7040xee086eb3.SCANNING_ID_STATE ? 0 : 8);
        this.verifyingPartnerCheckedIcon.setVisibility((rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE || rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.SCANNING_ID_STATE) ? 8 : 0);
        ImageView imageView4 = this.livenessCheckedIcon;
        if (rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver != C7040xee086eb3.FINISHED_FLOW_STATE) {
            i2 = 8;
        }
        imageView4.setVisibility(i2);
        this.buttonNext.setText(getString(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$CustomActionResultReceiver == C7040xee086eb3.FINISHED_FLOW_STATE ? R.string.ekyc_submit_button_text : R.string.next_button));
    }

    public final void read(String str) {
        getKernelIDAdd getkernelidadd = new getKernelIDAdd();
        getkernelidadd.IconCompatParcelizer(str);
        getkernelidadd.read("feature", MediaDescriptionCompat());
        if (getActivity() != null) {
            getkernelidadd.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ndid_rp_instructions");
        }
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$ItemReceiver = RpLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 1003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void read() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_pop_up_title_exit).IconCompatParcelizer(RatingCompat());
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), ActivityBuilder_ContributeFundAppFormActivity.write);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeFastPayTransferReviewActivity(this)).show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i2 == -1 && i == 1001 && intent.hasExtra("com.scb.phone.presentation.views.ndid.NdidNationalIdInputView.idDisplay")) {
            C4124by byVar = this.presenter;
            if (((AutoValue_CrashlyticsReport.Builder) intent.getParcelableExtra("com.scb.phone.presentation.views.ndid.NdidNationalIdInputView.idDisplay")) != null) {
                byVar.write = C7040xee086eb3.VERIFYING_PARTNER_STATE;
                getVideoFiles getvideofiles = new getVideoFiles(byVar);
                if (byVar.RatingCompat != null) {
                    getvideofiles.IconCompatParcelizer(byVar.RatingCompat);
                }
                IVideoResourceProvider.StorageType storageType = new IVideoResourceProvider.StorageType(byVar);
                if (byVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    storageType.IconCompatParcelizer(byVar.RatingCompat);
                }
            }
        } else if (i2 == -1 && i == 1002) {
            C4124by byVar2 = this.presenter;
            byVar2.write = C7040xee086eb3.LIVENESS_CHECK_STATE;
            getVideoFiles getvideofiles2 = new getVideoFiles(byVar2);
            if (byVar2.RatingCompat != null) {
                getvideofiles2.IconCompatParcelizer(byVar2.RatingCompat);
            }
            IVideoResourceProvider.StorageType storageType2 = new IVideoResourceProvider.StorageType(byVar2);
            if (byVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                storageType2.IconCompatParcelizer(byVar2.RatingCompat);
            }
        } else if (i2 == -1 && i == 1003) {
            C4124by byVar3 = this.presenter;
            byVar3.write = C7040xee086eb3.FINISHED_FLOW_STATE;
            getVideoFiles getvideofiles3 = new getVideoFiles(byVar3);
            if (byVar3.RatingCompat != null) {
                getvideofiles3.IconCompatParcelizer(byVar3.RatingCompat);
            }
            IVideoResourceProvider.StorageType storageType3 = new IVideoResourceProvider.StorageType(byVar3);
            if (byVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                storageType3.IconCompatParcelizer(byVar3.RatingCompat);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributeFundOnboardingLandingActivity.read(this, i, iArr);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        C4124by byVar = this.presenter;
        getRect getrect = new getRect(byVar);
        if (byVar.RatingCompat != null) {
            getrect.IconCompatParcelizer(byVar.RatingCompat);
        }
    }

    public void onResume() {
        super.onResume();
        this.presenter.IconCompatParcelizer = Boolean.TRUE;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        blend blend = new blend();
        blend.read("ndid");
        blend.read("feature", MediaDescriptionCompat());
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_verifysuccess");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView();
    }
}
