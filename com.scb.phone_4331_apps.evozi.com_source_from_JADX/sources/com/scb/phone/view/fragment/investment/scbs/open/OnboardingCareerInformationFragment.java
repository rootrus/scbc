package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_BindTempLimitConfirmationActivity;
import p040o.C7505tO;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.LicenseFoundListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportWorkflowActivity;
import p040o.inferValueType;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMessageIcons;
import p040o.setPitchThresholdEnabled;
import p040o.setShowNoDocumentFoundMessage;
import p040o.setTapText;

public class OnboardingCareerInformationFragment extends BaseFragment implements PassportWorkflowActivity.C69841 {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public List<String> MediaDescriptionCompat;
    private FragmentBuilder_BindCalendarDialogFragment MediaMetadataCompat;
    @BindView
    Button btNextCareerInfo;
    @BindView
    ImageView ivBusinessArrow;
    @BindView
    CommonInputViewGroup ivgTextPosition;
    @BindView
    CommonInputViewGroup ivgTextWorkplace;
    @HmlPinActivity
    public setMessageIcons presenter;
    @BindView
    RelativeLayout rlBusinessLayout;
    @BindView
    CustomSpinnerWithTitle swtMonthlyIncome;
    @BindView
    TextView tvBusiness;
    @BindView
    TextView tvOccupation;

    public static OnboardingCareerInformationFragment IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        OnboardingCareerInformationFragment onboardingCareerInformationFragment = new OnboardingCareerInformationFragment();
        onboardingCareerInformationFragment.setArguments(bundle);
        return onboardingCareerInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89632131494190, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        CommonInputViewGroup commonInputViewGroup = this.ivgTextWorkplace;
        C60511 r0 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                OnboardingCareerInformationFragment.this.ivgTextWorkplace.MediaBrowserCompat$CustomActionResultReceiver();
                setMessageIcons setmessageicons = OnboardingCareerInformationFragment.this.presenter;
                String obj = editable.toString();
                if (!setMessageIcons.write(obj)) {
                    setShowNoDocumentFoundMessage setshownodocumentfoundmessage = setShowNoDocumentFoundMessage.read;
                    if (setmessageicons.RatingCompat != null) {
                        setshownodocumentfoundmessage.IconCompatParcelizer(setmessageicons.RatingCompat);
                    }
                }
                setmessageicons.f2949x50fd9e4a = obj;
                setmessageicons.read();
            }
        };
        commonInputViewGroup.mEditText.addTextChangedListener(r0);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(r0);
        CommonInputViewGroup commonInputViewGroup2 = this.ivgTextPosition;
        C60533 r02 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                OnboardingCareerInformationFragment.this.ivgTextPosition.MediaBrowserCompat$CustomActionResultReceiver();
                setMessageIcons setmessageicons = OnboardingCareerInformationFragment.this.presenter;
                String obj = editable.toString();
                if (!setMessageIcons.write(obj)) {
                    LicenseFoundListener licenseFoundListener = LicenseFoundListener.IconCompatParcelizer;
                    if (setmessageicons.RatingCompat != null) {
                        licenseFoundListener.IconCompatParcelizer(setmessageicons.RatingCompat);
                    }
                }
                setmessageicons.MediaSessionCompat$Token = obj;
                setmessageicons.read();
            }
        };
        commonInputViewGroup2.mEditText.addTextChangedListener(r02);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(r02);
        this.swtMonthlyIncome.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
                OnboardingCareerInformationFragment.this.presenter.MediaBrowserCompat$ItemReceiver();
            }

            public final void IconCompatParcelizer() {
                if (OnboardingCareerInformationFragment.this.swtMonthlyIncome.spinner.getSelectedItemPosition() > 0) {
                    setMessageIcons setmessageicons = OnboardingCareerInformationFragment.this.presenter;
                    setmessageicons.MediaBrowserCompat$MediaItem = OnboardingCareerInformationFragment.this.swtMonthlyIncome.MediaBrowserCompat$ItemReceiver();
                    setmessageicons.MediaDescriptionCompat = (String) OnboardingCareerInformationFragment.this.MediaDescriptionCompat.get(OnboardingCareerInformationFragment.this.swtMonthlyIncome.spinner.getSelectedItemPosition() - 1);
                    setmessageicons.read();
                }
            }
        }, new ActivityBuilder_BindTempLimitConfirmationActivity(this));
        this.btNextCareerInfo.setEnabled(false);
        this.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.occupation_search_action_bar);
        this.IconCompatParcelizer = getString(R.string.business_type_search_action_bar);
        MediaBrowserCompat$CustomActionResultReceiver(false);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void startOccupationSearch() {
        Intent intent = new Intent(getContext(), OccupationSearchActivity.class);
        intent.putExtra("OCCUPATION_LIST_SOURCE", C7505tO.ONBOARDING.ordinal());
        intent.putExtra("SEARCH_TITLE", this.MediaBrowserCompat$CustomActionResultReceiver);
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
            startActivityForResult(intent, 1900);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void startBusinessSearch() {
        setMessageIcons setmessageicons = this.presenter;
        setPitchThresholdEnabled setpitchthresholdenabled = new setPitchThresholdEnabled(setmessageicons);
        if (setmessageicons.RatingCompat != null) {
            setpitchthresholdenabled.IconCompatParcelizer(setmessageicons.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void sendCareerInfo() {
        setMessageIcons setmessageicons = this.presenter;
        String obj = this.ivgTextWorkplace.mEditText.getText().toString();
        String obj2 = this.ivgTextPosition.mEditText.getText().toString();
        if (setmessageicons.RatingCompat != null) {
            setmessageicons.RatingCompat.AlertController$RecycleListView();
        }
        inferValueType MediaBrowserCompat$ItemReceiver = inferValueType.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = setmessageicons.MediaMetadataCompat;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = setmessageicons.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$ItemReceiver.read = setmessageicons.IconCompatParcelizer;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = setmessageicons.read;
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = obj;
        MediaBrowserCompat$ItemReceiver.write = obj2;
        MediaBrowserCompat$ItemReceiver.RatingCompat = setmessageicons.MediaDescriptionCompat;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = setmessageicons.MediaBrowserCompat$MediaItem;
        setmessageicons.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver);
        setmessageicons.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setMessageIcons.write());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1900 && i2 == -1) {
            setMessageIcons setmessageicons = this.presenter;
            String stringExtra = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_CODE");
            String stringExtra2 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION");
            setmessageicons.MediaMetadataCompat = stringExtra;
            setmessageicons.MediaBrowserCompat$SearchResultReceiver = stringExtra2;
            setmessageicons.read();
            this.tvOccupation.setText(intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION"));
            this.tvOccupation.setTextColor(-16777216);
            setMessageIcons setmessageicons2 = this.presenter;
            if (setmessageicons2.RatingCompat != null) {
                setmessageicons2.RatingCompat.AlertController$RecycleListView();
            }
            setmessageicons2.write.write(setmessageicons2.MediaMetadataCompat);
            setmessageicons2.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<PrepaidResetOtpActivity.write>>() {
                public final /* synthetic */ void onNext(
/*
Method generation error in method: o.setMessageIcons.5.onNext(java.lang.Object):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setMessageIcons.5.onNext(java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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

                public final void onError(
/*
Method generation error in method: o.setMessageIcons.5.onError(java.lang.Throwable):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setMessageIcons.5.onError(java.lang.Throwable):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
            });
        } else if (i == 1901 && i2 == -1) {
            setMessageIcons setmessageicons3 = this.presenter;
            String stringExtra3 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_CODE");
            setmessageicons3.read = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION");
            setmessageicons3.IconCompatParcelizer = stringExtra3;
            setmessageicons3.read();
            this.tvBusiness.setText(intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION"));
            this.tvBusiness.setTextColor(-16777216);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<String> list) {
        this.swtMonthlyIncome.setItemsWithPlaceholder(list, true);
    }

    public final void write(List<String> list) {
        this.MediaDescriptionCompat = list;
    }

    public final void write() {
        this.ivgTextWorkplace.MediaBrowserCompat$ItemReceiver();
        this.ivgTextWorkplace.setErrorText(getString(R.string.career_info_company_name_error));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.ivgTextPosition.MediaBrowserCompat$ItemReceiver();
        this.ivgTextPosition.setErrorText(getString(R.string.career_info_position_error));
    }

    public final void read(boolean z) {
        this.btNextCareerInfo.setEnabled(z);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.MediaMetadataCompat = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public final void read() {
        this.MediaMetadataCompat.setOverlayMode();
    }

    public final void write(String str) {
        Intent intent = new Intent(getContext(), OccupationSearchActivity.class);
        intent.putExtra("OCCUPATION_LIST_SOURCE", C7505tO.BUSINESS.ordinal());
        intent.putExtra("OCCUPATION_CODE", str);
        intent.putExtra("SEARCH_TITLE", this.IconCompatParcelizer);
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
            startActivityForResult(intent, 1901);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver(z);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Context context;
        int i;
        this.rlBusinessLayout.setEnabled(z);
        this.tvBusiness.setEnabled(z);
        if (getContext() != null) {
            Drawable drawable = this.ivBusinessArrow.getDrawable();
            if (z) {
                context = getContext();
                i = R.color.f65322131099683;
            } else {
                context = getContext();
                i = R.color.f66182131099773;
            }
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(drawable, setLastBaselineToBottomHeight.read(context, i));
        }
        this.tvBusiness.setText((CharSequence) null);
    }
}
