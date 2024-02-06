package com.scb.phone.view.fragment.transferandpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.adapter.transferandpay.FixedTransferDepositSuccessTransactionAdapter;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_ContributeTouchPointAccountDetailActivity;
import p040o.ActivityBuilder_ContributeTouchPointFillInfoActivity;
import p040o.ActivityBuilder_ContributeTouchPointLivenessCheckActivity;
import p040o.ActivityBuilder_ContributesHmlETBAccountSetupActivity;
import p040o.ActivityBuilder_ContributesHmlLaserIdAboutActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C5174qT;
import p040o.C5253sa;
import p040o.C5255sc;
import p040o.C5463x;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FragmentBuilder_BindEBillSubscriptionSuccessFragment;
import p040o.GoogleSigninService;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.SwitchCompat;
import p040o.access$2200;
import p040o.getKernelIDSrcIn;
import p040o.getOversizeImage;
import p040o.getRegistrationsAddresses;
import p040o.onStart;
import p040o.setFaceRectThickness;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class FixedTransferSuccessFragment extends BaseFragment implements ServerProjectProvider.C70706, FragmentBuilder_BindEBillSubscriptionSuccessFragment {
    public CrashlyticsReport.Session.Event.Application IconCompatParcelizer;
    public CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private getKernelIDSrcIn MediaBrowserCompat$SearchResultReceiver = new getKernelIDSrcIn();
    @BindView
    protected Button buttonSaveSlip;
    @BindView
    protected Button buttonShareSlip;
    @BindView
    protected CustomTransferAndPayItem customFee;
    @BindView
    protected CustomTransferAndPayItem customInterest;
    @BindView
    protected CustomTransferAndPayItem customNetAmount;
    @BindView
    protected CustomTransferAndPaySource customSource;
    @BindView
    protected CustomTransferAndPayTarget customTarget;
    @BindView
    protected CustomTransferAndPayItem customWithholdingTax;
    @BindView
    protected View dividerButtons;
    @HmlPinActivity
    public C5174qT presenter;
    @BindView
    protected RecyclerView recyclerView;
    @BindView
    protected TextView textViewNoteTitle;
    @BindView
    protected TextView textViewNoteValue;
    @BindView
    protected TextView textViewRefId;
    @BindView
    protected TextView textViewRemainingBalance;
    @BindView
    protected TextView textViewSuccessfulTransfer;
    @BindView
    protected TextView textViewTransactionDate;
    @BindView
    protected TextView textViewUnsuccessfulTransfer;

    public class SlipScreenshot_ViewBinding implements Unbinder {
        private SlipScreenshot write;

        public SlipScreenshot_ViewBinding(SlipScreenshot slipScreenshot, View view) {
            this.write = slipScreenshot;
            slipScreenshot.slipTextViewSuccessfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_transfer, "field 'slipTextViewSuccessfulTransfer'", TextView.class);
            slipScreenshot.slipTextViewUnsuccessfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_unsuccessful_transfer, "field 'slipTextViewUnsuccessfulTransfer'", TextView.class);
            slipScreenshot.slipTextViewTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'slipTextViewTransactionDate'", TextView.class);
            slipScreenshot.slipTextViewRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'slipTextViewRefId'", TextView.class);
            slipScreenshot.slipCustomSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_source, "field 'slipCustomSource'", CustomTransferAndPaySource.class);
            slipScreenshot.slipCustomTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_target, "field 'slipCustomTarget'", CustomTransferAndPayTarget.class);
            slipScreenshot.slipTextViewNoteTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_title, "field 'slipTextViewNoteTitle'", TextView.class);
            slipScreenshot.slipTextViewNoteValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_value, "field 'slipTextViewNoteValue'", TextView.class);
            slipScreenshot.slipCustomNetAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_net_amount, "field 'slipCustomNetAmount'", CustomTransferAndPayItem.class);
            slipScreenshot.slipCustomInterest = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_interest, "field 'slipCustomInterest'", CustomTransferAndPayItem.class);
            slipScreenshot.slipCustomWithholdingTax = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_withholding_tax, "field 'slipCustomWithholdingTax'", CustomTransferAndPayItem.class);
            slipScreenshot.slipCustomFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_fee, "field 'slipCustomFee'", CustomTransferAndPayItem.class);
            slipScreenshot.slipRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'slipRecyclerView'", RecyclerView.class);
        }

        public final void read() {
            SlipScreenshot slipScreenshot = this.write;
            if (slipScreenshot != null) {
                this.write = null;
                slipScreenshot.slipTextViewSuccessfulTransfer = null;
                slipScreenshot.slipTextViewUnsuccessfulTransfer = null;
                slipScreenshot.slipTextViewTransactionDate = null;
                slipScreenshot.slipTextViewRefId = null;
                slipScreenshot.slipCustomSource = null;
                slipScreenshot.slipCustomTarget = null;
                slipScreenshot.slipTextViewNoteTitle = null;
                slipScreenshot.slipTextViewNoteValue = null;
                slipScreenshot.slipCustomNetAmount = null;
                slipScreenshot.slipCustomInterest = null;
                slipScreenshot.slipCustomWithholdingTax = null;
                slipScreenshot.slipCustomFee = null;
                slipScreenshot.slipRecyclerView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ Activity write() {
        return super.getActivity();
    }

    public static FixedTransferSuccessFragment write(CrashlyticsReport.Session.Event.Application application) {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = new FixedTransferSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS_DISPLAY", application);
        fixedTransferSuccessFragment.setArguments(bundle);
        return fixedTransferSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87502131493977, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public void onActivityCreated(Bundle bundle) {
        C5174qT qTVar;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("com.scb.phone.EXTRA_SUCCESS_DISPLAY")) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) arguments.getParcelable("com.scb.phone.EXTRA_SUCCESS_DISPLAY");
            this.IconCompatParcelizer = application;
            if (application != null && (qTVar = this.presenter) != null) {
                qTVar.read = application;
                setFaceRectThickness setfacerectthickness = new setFaceRectThickness(application);
                boolean z = true;
                if (qTVar.RatingCompat != null) {
                    setfacerectthickness.IconCompatParcelizer(qTVar.RatingCompat);
                }
                boolean shortcut = qTVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
                C5255sc scVar = new C5255sc(shortcut);
                if (qTVar.RatingCompat != null) {
                    scVar.IconCompatParcelizer(qTVar.RatingCompat);
                }
                if (shortcut) {
                    C5253sa saVar = new C5253sa(qTVar);
                    if (qTVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        saVar.IconCompatParcelizer(qTVar.RatingCompat);
                    }
                }
            }
        }
    }

    public final void read(boolean z) {
        int i = 8;
        this.buttonSaveSlip.setVisibility(z ? 8 : 0);
        View view = this.dividerButtons;
        if (!z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void read(access$2200 access_2200) {
        String str;
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInputDialog != null) {
            if (access_2200.IconCompatParcelizer.length() > 0) {
                str = access_2200.IconCompatParcelizer;
            } else {
                str = access_2200.MediaBrowserCompat$ItemReceiver;
            }
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(str);
        }
    }

    public final void read(String str) {
        getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
        Activity write = write();
        if (write != null) {
            write(write, R.id.root_view, write.getString(R.string.favourite_added_successfully), getoversizeimage);
        }
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        this.customTarget.setFavoriteName(str);
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    public final void write(CrashlyticsReport.Session.Event.Application application, boolean z) {
        ActivityBuilder_ContributesHmlLaserIdAboutActivity.MediaBrowserCompat$ItemReceiver(this, application, z);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    @OnClick
    public void onShareSlipButtonClick() {
        ActivityBuilder_ContributesHmlLaserIdAboutActivity.IconCompatParcelizer(this);
    }

    @OnClick
    public void onSaveSlipButtonClick() {
        ActivityBuilder_ContributesHmlLaserIdAboutActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void IconCompatParcelizer() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            C5174qT qTVar = this.presenter;
            C5463x.C54641 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(
/*
Method generation error in method: o.x.1.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.x.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            if (qTVar.RatingCompat != null) {
                r1.IconCompatParcelizer(qTVar.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            C5174qT qTVar = this.presenter;
            C5253sa saVar = new C5253sa(qTVar);
            if (qTVar.RatingCompat != null) {
                saVar.IconCompatParcelizer(qTVar.RatingCompat);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributesHmlLaserIdAboutActivity.IconCompatParcelizer(this, i, iArr);
    }

    public final void read(CrashlyticsReport.Session.Event.Application application, boolean z) {
        this.MediaBrowserCompat$MediaItem = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new SlipScreenshot(), new FixedTransferSuccessFragment$MediaBrowserCompat$ItemReceiver(String.format(getString(R.string.fixed_transfer_success_slip_file_name), new Object[]{String.valueOf(Calendar.getInstance().getTimeInMillis())}), z, application), getActivity())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new ActivityBuilder_ContributeTouchPointFillInfoActivity(this, z), new ActivityBuilder_ContributesHmlETBAccountSetupActivity(this));
    }

    public final void IconCompatParcelizer(String str) {
        FragmentActivity activity = getActivity();
        if (!(str == null || str.length() == 0) && getUserVisibleHint() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            Activity write = write();
            if (write != null) {
                write(write, R.id.root_view, write.getString(R.string.saved_slip), getoversizeimage);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onAddFavoriteClick() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.favourite_name);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                FixedTransferSuccessFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mErrorTextView.setVisibility(8);
            }
        });
        CustomInputDialog customInputDialog2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog2.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.MediaBrowserCompat$CustomActionResultReceiver.setCanceledOnTouchOutside(false);
        this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.setVisibility(0);
        CustomInputDialog customInputDialog3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributeTouchPointAccountDetailActivity.MediaBrowserCompat$CustomActionResultReceiver);
        CustomInputDialog customInputDialog4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string2 = getString(R.string.add_favourite);
        ActivityBuilder_ContributeTouchPointLivenessCheckActivity activityBuilder_ContributeTouchPointLivenessCheckActivity = new ActivityBuilder_ContributeTouchPointLivenessCheckActivity(this);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributeTouchPointLivenessCheckActivity, false));
        }
        if (isAdded() && getContext() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.show();
        }
    }

    @OnClick
    public void onReturnToTransferClick() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getKernelIDSrcIn getkernelidsrcin = this.MediaBrowserCompat$SearchResultReceiver;
            if (getActivity() != null) {
                getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "continue_to_transfer");
            }
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS");
            activity.sendBroadcast(intent);
            if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
                getActivity().finishAffinity();
            }
            Intent intent2 = new Intent(activity, TransferActivity.class);
            intent2.addFlags(603979776);
            intent2.putExtra("com.scb.phone.EXTRA_CONTINUE_TO_TRANSFER", true);
            intent2.putExtra("com.scb.phone.EXTRA_ACCOUNT_NUMBER", this.IconCompatParcelizer.RatingCompat);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent2 = setTapText.write(activity2, intent2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent2.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void onReturnToHomeClick() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
                getActivity().finishAffinity();
            }
            Intent intent = new Intent(activity, HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    protected class SlipScreenshot extends FragmentBuilder_BindEBillSelectedFragment<FixedTransferSuccessFragment$MediaBrowserCompat$ItemReceiver> {
        @BindView
        CustomTransferAndPayItem slipCustomFee;
        @BindView
        CustomTransferAndPayItem slipCustomInterest;
        @BindView
        CustomTransferAndPayItem slipCustomNetAmount;
        @BindView
        CustomTransferAndPaySource slipCustomSource;
        @BindView
        CustomTransferAndPayTarget slipCustomTarget;
        @BindView
        CustomTransferAndPayItem slipCustomWithholdingTax;
        @BindView
        RecyclerView slipRecyclerView;
        @BindView
        TextView slipTextViewNoteTitle;
        @BindView
        TextView slipTextViewNoteValue;
        @BindView
        TextView slipTextViewRefId;
        @BindView
        TextView slipTextViewSuccessfulTransfer;
        @BindView
        TextView slipTextViewTransactionDate;
        @BindView
        TextView slipTextViewUnsuccessfulTransfer;

        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            ButterKnife.IconCompatParcelizer(this, view);
            CrashlyticsReport.Session.Event.Application application = ((FixedTransferSuccessFragment$MediaBrowserCompat$ItemReceiver) simpleForwardingListenableFuture).IconCompatParcelizer;
            if (TextUtils.isEmpty(application.MediaSessionCompat$Token)) {
                this.slipTextViewSuccessfulTransfer.setVisibility(8);
            } else {
                this.slipTextViewSuccessfulTransfer.setText(application.MediaSessionCompat$Token);
            }
            if (TextUtils.isEmpty(application.AppCompatDialogFragment)) {
                this.slipTextViewUnsuccessfulTransfer.setVisibility(8);
            } else {
                this.slipTextViewUnsuccessfulTransfer.setText(application.AppCompatDialogFragment);
            }
            this.slipTextViewTransactionDate.setText(application.AppCompatActivity);
            this.slipTextViewRefId.setText(application.f2696x50fd9e4a);
            this.slipCustomSource.setSourceName(application.write);
            this.slipCustomSource.setAccountNumber(application.read);
            this.slipCustomSource.setAvatar(application.MediaBrowserCompat$ItemReceiver);
            this.slipCustomTarget.setTargetName(application.PlaybackStateCompat$CustomAction);
            this.slipCustomTarget.setReferenceNumbers(application.setHasDecor);
            this.slipCustomTarget.setAvatar(application.PlaybackStateCompat);
            if (application.MediaBrowserCompat$MediaItem) {
                this.slipCustomTarget.setFavoriteName(application.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                this.slipCustomTarget.setAddFavoriteButtonVisible(true);
            }
            if (TextUtils.isEmpty(application.MediaDescriptionCompat)) {
                this.slipTextViewNoteTitle.setVisibility(8);
                this.slipTextViewNoteValue.setVisibility(8);
                this.slipCustomTarget.setDividerVisibility(false);
            } else {
                this.slipTextViewNoteValue.setText(application.MediaDescriptionCompat);
                this.slipCustomTarget.setDividerVisibility(true);
            }
            this.slipCustomTarget.setAddFavoriteButtonVisible(false);
            this.slipCustomNetAmount.setValue(application.MediaSessionCompat$QueueItem);
            this.slipCustomInterest.setValue(application.AlertController$RecycleListView);
            this.slipCustomWithholdingTax.setValue(application.AppCompatDelegateImpl$ListMenuDecorView);
            this.slipCustomFee.setValue(application.Keep);
            FixedTransferDepositSuccessTransactionAdapter fixedTransferDepositSuccessTransactionAdapter = new FixedTransferDepositSuccessTransactionAdapter(application.IconCompatParcelizer);
            FixedTransferSuccessFragment.this.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            this.slipRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
            this.slipRecyclerView.setLayoutManager(linearLayoutManager);
            SwitchCompat.IconCompatParcelizer((View) this.slipRecyclerView, false);
            this.slipRecyclerView.setAdapter(fixedTransferDepositSuccessTransactionAdapter);
        }

        SlipScreenshot() {
        }
    }

    public final void write(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application application) {
        String str;
        if (TextUtils.isEmpty(application.MediaSessionCompat$Token)) {
            this.textViewSuccessfulTransfer.setVisibility(8);
        } else {
            this.textViewSuccessfulTransfer.setText(application.MediaSessionCompat$Token);
        }
        if (TextUtils.isEmpty(application.AppCompatDialogFragment)) {
            this.textViewUnsuccessfulTransfer.setVisibility(8);
        } else {
            this.textViewUnsuccessfulTransfer.setText(application.AppCompatDialogFragment);
        }
        this.textViewTransactionDate.setText(application.AppCompatActivity);
        this.textViewRefId.setText(application.f2696x50fd9e4a);
        this.customSource.setSourceName(application.write);
        this.customSource.setAccountNumber(application.read);
        this.customSource.setAvatar(application.MediaBrowserCompat$ItemReceiver);
        this.customTarget.setTargetName(application.PlaybackStateCompat$CustomAction);
        this.customTarget.setReferenceNumbers(application.setHasDecor);
        this.customTarget.setAvatar(application.PlaybackStateCompat);
        if (application.MediaBrowserCompat$MediaItem) {
            if (application.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str = application.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str = "";
            }
            this.customTarget.setFavoriteName(str);
        } else {
            this.customTarget.setAddFavoriteButtonVisible(true);
        }
        String str2 = application.MediaDescriptionCompat;
        if (TextUtils.isEmpty(str2)) {
            this.textViewNoteTitle.setVisibility(8);
            this.textViewNoteValue.setVisibility(8);
            this.customTarget.setDividerVisibility(false);
        } else {
            this.customTarget.setDividerVisibility(true);
            this.textViewNoteValue.setText(str2);
        }
        this.customNetAmount.setValue(application.MediaSessionCompat$QueueItem);
        this.customInterest.setValue(application.AlertController$RecycleListView);
        this.customWithholdingTax.setValue(application.AppCompatDelegateImpl$ListMenuDecorView);
        this.customFee.setValue(application.Keep);
        FixedTransferDepositSuccessTransactionAdapter fixedTransferDepositSuccessTransactionAdapter = new FixedTransferDepositSuccessTransactionAdapter(application.IconCompatParcelizer);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        SwitchCompat.IconCompatParcelizer((View) this.recyclerView, false);
        this.recyclerView.setAdapter(fixedTransferDepositSuccessTransactionAdapter);
        if (TextUtils.isEmpty(application.MediaSessionCompat$ResultReceiverWrapper)) {
            this.textViewRemainingBalance.setVisibility(8);
            return;
        }
        this.textViewRemainingBalance.setText(getString(R.string.remaining_balance, getString(R.string.transfer_tab).toLowerCase(), application.MediaSessionCompat$ResultReceiverWrapper));
    }
}
