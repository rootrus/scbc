package com.scb.phone.view.fragment.hml.submission;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlDocumentListActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.hml.HmlDocumentSubmissionAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p040o.ActivityRecognition;
import p040o.C3455xb7811570;
import p040o.CrashlyticsController;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LinkedHashMultiset;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetOnDevicePassportDeserializerFactory;
import p040o.ZSYR2K;
import p040o.immediateFailedFuture;
import p040o.isShowNotificationDialog;
import p040o.onGetStartedClick;
import p040o.setBackendType;
import p040o.setBackendType$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setBackendType$MediaBrowserCompat$ItemReceiver;
import p040o.setBackendType$MediaBrowserCompat$SearchResultReceiver;
import p040o.setPersonalShortCuts;
import p040o.setShowMotionSpec$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzfe;
import p040o.zzwe;

public class HmlDocumentSubmissionFragment extends BaseFragment implements PassportCaptureModule_GetOnDevicePassportDeserializerFactory, HmlDocumentSubmissionAdapter.write {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private HmlDocumentSubmissionAdapter IconCompatParcelizer;
    private Unbinder MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public TextView dateRemarkText;
    @BindView
    public RecyclerView documentRecyclerView;
    @HmlPinActivity
    public setBackendType presenter;
    @BindView
    public ImageView resubmissionIcon;
    @BindView
    public Button submissionButton;
    @BindView
    public TextView uploadedFiles;

    public String IconCompatParcelizer() {
        return "etb";
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static HmlDocumentSubmissionFragment read(setPersonalShortCuts setpersonalshortcuts) {
            onGetStartedClick.write((Object) setpersonalshortcuts, "flowType");
            HmlDocumentSubmissionFragment hmlDocumentSubmissionFragment = new HmlDocumentSubmissionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("HML_SUBMISSTION_TYPE", setpersonalshortcuts);
            hmlDocumentSubmissionFragment.setArguments(bundle);
            return hmlDocumentSubmissionFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setPersonalShortCuts setpersonalshortcuts;
        setPersonalShortCuts setpersonalshortcuts2;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87832131494010, viewGroup, false);
        Unbinder IconCompatParcelizer2 = ButterKnife.IconCompatParcelizer(this, inflate);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "ButterKnife.bind(this, view)");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
        setBackendType setbackendtype = this.presenter;
        if (setbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setbackendtype.MediaBrowserCompat$ItemReceiver(this);
        setBackendType setbackendtype2 = this.presenter;
        if (setbackendtype2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        if (arguments == null || (setpersonalshortcuts = (setPersonalShortCuts) arguments.getParcelable("HML_SUBMISSTION_TYPE")) == null) {
            setpersonalshortcuts = setPersonalShortCuts.SUBMISSION;
        }
        if (setpersonalshortcuts != null) {
            setbackendtype2.read = setpersonalshortcuts;
        }
        MediaBrowserCompat$MediaItem();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (setpersonalshortcuts2 = (setPersonalShortCuts) arguments2.getParcelable("HML_SUBMISSTION_TYPE")) == null) {
            setpersonalshortcuts2 = setPersonalShortCuts.SUBMISSION;
        }
        MediaBrowserCompat$CustomActionResultReceiver(setpersonalshortcuts2);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(setPersonalShortCuts setpersonalshortcuts) {
        onGetStartedClick.write((Object) setpersonalshortcuts, "flow");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[3];
        zsyr2kArr[0] = new ZSYR2K("user_type", IconCompatParcelizer());
        zsyr2kArr[1] = new ZSYR2K("feature", "your_loan");
        zsyr2kArr[2] = new ZSYR2K("document_status", setpersonalshortcuts == setPersonalShortCuts.SUBMISSION ? "INITIAL" : "RESUBMIT");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("document_submission", zsyr2kArr);
        }
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlDocumentSubmissionFragment read;

        read(HmlDocumentSubmissionFragment hmlDocumentSubmissionFragment) {
            this.read = hmlDocumentSubmissionFragment;
        }

        public final void onClick(View view) {
            setBackendType setbackendtype = this.read.presenter;
            if (setbackendtype == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = Build.MODEL;
            onGetStartedClick.IconCompatParcelizer((Object) str, "Build.MODEL");
            onGetStartedClick.write((Object) str, "modelId");
            setPersonalShortCuts setpersonalshortcuts = setbackendtype.read;
            if (setpersonalshortcuts == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
            }
            int i = isShowNotificationDialog.read[setpersonalshortcuts.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    LinkedHashMultiset linkedHashMultiset = setbackendtype.write;
                    FundActionsSuccessActivity setbackendtype_mediabrowsercompat_customactionresultreceiver = new setBackendType$MediaBrowserCompat$CustomActionResultReceiver(setbackendtype);
                    FundFactSheetActivity write = new setBackendType.write(setbackendtype);
                    onGetStartedClick.write((Object) setbackendtype_mediabrowsercompat_customactionresultreceiver, "onComplete");
                    onGetStartedClick.write((Object) write, "onError");
                    onGetStartedClick.write((Object) str, "modelId");
                    linkedHashMultiset.read.MediaBrowserCompat$ItemReceiver(setbackendtype_mediabrowsercompat_customactionresultreceiver, write, new setShowMotionSpec$MediaBrowserCompat$ItemReceiver(str), linkedHashMultiset.MediaBrowserCompat$ItemReceiver);
                }
            } else if (setbackendtype.MediaBrowserCompat$SearchResultReceiver) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setBackendType.RatingCompat.write;
                if (setbackendtype.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setbackendtype.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setBackendType$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (setbackendtype.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(setbackendtype.RatingCompat);
                }
            }
        }
    }

    public void onStart() {
        ActivityRecognition activityRecognition;
        super.onStart();
        setBackendType setbackendtype = this.presenter;
        if (setbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setbackendtype.MediaBrowserCompat$ItemReceiver(this);
        setBackendType setbackendtype2 = this.presenter;
        if (setbackendtype2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        setPersonalShortCuts setpersonalshortcuts = arguments != null ? (setPersonalShortCuts) arguments.getParcelable("HML_SUBMISSTION_TYPE") : null;
        if (setpersonalshortcuts != null) {
            setbackendtype2.read = setpersonalshortcuts;
        }
        MediaBrowserCompat$MediaItem();
        setBackendType setbackendtype3 = this.presenter;
        if (setbackendtype3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setbackendtype3.RatingCompat != null) {
            setbackendtype3.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultiset linkedHashMultiset = setbackendtype3.write;
        FundFactSheetActivity read2 = new setBackendType.read(setbackendtype3);
        FundFactSheetActivity iconCompatParcelizer = new setBackendType.IconCompatParcelizer(setbackendtype3);
        setPersonalShortCuts setpersonalshortcuts2 = setbackendtype3.read;
        if (setpersonalshortcuts2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        int i = isShowNotificationDialog.IconCompatParcelizer[setpersonalshortcuts2.ordinal()];
        if (i == 1) {
            activityRecognition = ActivityRecognition.SUBMISSION;
        } else if (i == 2) {
            activityRecognition = ActivityRecognition.RESUBMISSION;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        linkedHashMultiset.MediaBrowserCompat$ItemReceiver(read2, iconCompatParcelizer, new C3455xb7811570(activityRecognition));
        setbackendtype3.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        setbackendtype3.IconCompatParcelizer.IconCompatParcelizer(new setBackendType.MediaDescriptionCompat(setbackendtype3));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "maxSize");
        onGetStartedClick.write((Object) str2, "maxAmount");
        TextView textView = this.uploadedFiles;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("uploadedFiles");
        }
        textView.setText(getString(R.string.hml_document_submission_uploaded_to, str, str2));
        Integer.parseInt(str2);
    }

    public void IconCompatParcelizer(CrashlyticsController.FileNameContainsFilter fileNameContainsFilter, zzwe.read read2) {
        onGetStartedClick.write((Object) fileNameContainsFilter, "documentInfo");
        onGetStartedClick.write((Object) read2, "limit");
        HmlDocumentListActivity.write write = HmlDocumentListActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) fileNameContainsFilter, "documentInfo");
        onGetStartedClick.write((Object) read2, "limit");
        Intent putExtra = new Intent(requireContext, HmlDocumentListActivity.class).putExtra("HML_DOC_INFO", fileNameContainsFilter).putExtra("HML_DOC_FILE_VALIDATION_LIMIT", read2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlDocum…_VALIDATION_LIMIT, limit)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.FileNameContainsFilter fileNameContainsFilter) {
        onGetStartedClick.write((Object) fileNameContainsFilter, "document");
        setBackendType setbackendtype = this.presenter;
        if (setbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) fileNameContainsFilter, "document");
        writeUInt64NoTag.IconCompatParcelizer setbackendtype_mediabrowsercompat_itemreceiver = new setBackendType$MediaBrowserCompat$ItemReceiver(setbackendtype, fileNameContainsFilter);
        if (setbackendtype.RatingCompat != null) {
            setbackendtype_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setbackendtype.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(List<? extends CrashlyticsController.C32378> list) {
        onGetStartedClick.write((Object) list, "documents");
        HmlDocumentSubmissionAdapter hmlDocumentSubmissionAdapter = this.IconCompatParcelizer;
        if (hmlDocumentSubmissionAdapter != null) {
            onGetStartedClick.write((Object) list, "data");
            hmlDocumentSubmissionAdapter.MediaBrowserCompat$ItemReceiver = list;
            hmlDocumentSubmissionAdapter.IconCompatParcelizer.write();
        }
    }

    public void read() {
        HmlConsentActivity.read read2 = HmlConsentActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent write = HmlConsentActivity.read.write(requireContext, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(context, false);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.submissionButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("submissionButton");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ImageView imageView = this.resubmissionIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("resubmissionIcon");
        }
        imageView.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        onGetStartedClick.write((Object) str, "dateRemark");
        if (z) {
            TextView textView = this.dateRemarkText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateRemarkText");
            }
            textView.setText(getString(R.string.hml_document_re_submission_upload_message, str));
            return;
        }
        TextView textView2 = this.dateRemarkText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateRemarkText");
        }
        textView2.setText(getString(R.string.hml_document_submission_upload_message, str));
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver hmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver = HmlIssuerLandingActivity.MediaDescriptionCompat;
            Intent intent = new Intent(context, HmlIssuerLandingActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onDestroyView() {
        Unbinder unbinder = this.MediaBrowserCompat$SearchResultReceiver;
        if (unbinder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unBinder");
        }
        unbinder.read();
        this.IconCompatParcelizer = null;
        super.onDestroyView();
    }

    public void onStop() {
        setBackendType setbackendtype = this.presenter;
        if (setbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setbackendtype.onDestroy();
        super.onStop();
    }

    private final void MediaBrowserCompat$MediaItem() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        HmlDocumentSubmissionAdapter hmlDocumentSubmissionAdapter = new HmlDocumentSubmissionAdapter(this);
        gridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = new HmlDocumentSubmissionFragment$MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter);
        this.IconCompatParcelizer = hmlDocumentSubmissionAdapter;
        RecyclerView recyclerView = this.documentRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentRecyclerView");
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.IconCompatParcelizer);
        Button button = this.submissionButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("submissionButton");
        }
        button.setOnClickListener(new read(this));
    }
}
