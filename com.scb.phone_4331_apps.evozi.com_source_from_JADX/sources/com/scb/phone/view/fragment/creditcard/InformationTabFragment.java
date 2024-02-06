package com.scb.phone.view.fragment.creditcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.SelectPurchasesActivity;
import com.scb.phone.view.activity.transferandpay.CardPaySelectedActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.custom.common.CustomInstallmentBillsToPay;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.FragmentBuilder_BindCardlessATMTutorialFragment;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TypeAdapters;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.confirmFixedAccount;
import p040o.getBanks;
import p040o.getTransferHistory;
import p040o.indexOfNonDigit;
import p040o.onGetStartedClick;
import p040o.repeatTransfer;
import p040o.retry;
import p040o.setLastBaselineToBottomHeight;
import p040o.setResultDeserializer;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class InformationTabFragment extends BaseFragment implements CheckCaptureModule_GetIJsonExactionHelperRttiFactory.write, FragmentBuilder_BindCardlessATMTutorialFragment {
    String IconCompatParcelizer;
    chain MediaBrowserCompat$CustomActionResultReceiver;
    private retry MediaMetadataCompat;
    @HmlPinActivity
    public indexOfNonDigit creditCardDetailTabPresenter;
    @BindView
    ImageView ivErrorIcon;
    @BindView
    LinearLayout llContentViewLayout;
    @BindView
    LinearLayout llErrorLayout;
    @BindView
    CustomInstallmentBillsToPay mCustomBillsToPay;
    @BindView
    CustomHorizontalProgressBar mCustomHorizontalProgressBar;
    @BindView
    TabLayout mTabLayout;
    @BindView
    FragmentWrapContentViewPager mTabPager;
    @BindView
    TextView tvDisclaimerText;
    @BindView
    TextView tvErrorDesc;
    @BindView
    TextView tvErrorTitle;

    public static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((InformationTabFragment) fragment).startActivityForResult(intent, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static InformationTabFragment IconCompatParcelizer(chain chain, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CREDIT_CARD_DISPLAY", chain);
        bundle.putString("CREDIT_CARD_DISCLAIMER", str);
        InformationTabFragment informationTabFragment = new InformationTabFragment();
        informationTabFragment.setArguments(bundle);
        return informationTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86352131493862, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = (chain) getArguments().getParcelable("CREDIT_CARD_DISPLAY");
        this.IconCompatParcelizer = getArguments().getString("CREDIT_CARD_DISCLAIMER");
        this.creditCardDetailTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        indexOfNonDigit indexofnondigit = this.creditCardDetailTabPresenter;
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        TypeAdapters.C389324 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.TypeAdapters.24.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TypeAdapters.24.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (indexofnondigit.RatingCompat != null) {
            r1.IconCompatParcelizer(indexofnondigit.RatingCompat);
        }
        TypeAdapters.C389120 r12 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.TypeAdapters.20.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TypeAdapters.20.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (indexofnondigit.RatingCompat != null) {
            r12.IconCompatParcelizer(indexofnondigit.RatingCompat);
        }
        indexOfNonDigit indexofnondigit2 = this.creditCardDetailTabPresenter;
        TypeAdapters.C389222 r13 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.TypeAdapters.22.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TypeAdapters.22.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (indexofnondigit2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r13.IconCompatParcelizer(indexofnondigit2.RatingCompat);
        }
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.credit_card_detail_title));
        setHasOptionsMenu(true);
        setActionBarVisibilityCallback();
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.credit_card_detail_title));
        setHasOptionsMenu(true);
        setActionBarVisibilityCallback();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.ivErrorIcon.setImageResource(R.drawable.box_empty);
        this.tvErrorTitle.setText(R.string.auto_cc_detail_no_result_title);
        this.tvErrorDesc.setText(R.string.auto_cc_detail_no_result_desc);
        this.llErrorLayout.setVisibility(0);
        this.llContentViewLayout.setVisibility(8);
    }

    public final void read() {
        this.llErrorLayout.setVisibility(8);
        this.llContentViewLayout.setVisibility(0);
    }

    public final void write(chain chain) {
        this.mCustomHorizontalProgressBar.setUsedValue(chain.setHasDecor);
        this.mCustomHorizontalProgressBar.setAvailableValue(chain.MediaBrowserCompat$CustomActionResultReceiver);
        this.mCustomHorizontalProgressBar.setTotalValue(chain.Keep);
        this.mCustomHorizontalProgressBar.setProgressBar(chain.PlaybackStateCompat$CustomAction);
        this.mCustomBillsToPay.setDueDateValue(String.format(chain.MenuItemImpl, new Object[0]));
        this.mCustomBillsToPay.setAmountValue(chain.PlaybackStateCompat);
        this.mCustomBillsToPay.setOnBillClickListener(this);
        this.mCustomBillsToPay.setAmountTitle(chain.setChecked);
        this.mCustomBillsToPay.setMinimumPaymentValue(chain.setTabContainer);
        this.mCustomBillsToPay.setStatementDateValue(chain.AbsActionBarView);
        String str = this.IconCompatParcelizer;
        if (str != null && !str.isEmpty()) {
            this.tvDisclaimerText.setVisibility(0);
            this.tvDisclaimerText.setText(this.IconCompatParcelizer);
        }
        if (chain.setExpandedFormat) {
            this.mCustomBillsToPay.setIconDrawable(setLastBaselineToBottomHeight.write(getContext(), chain.AppCompatDelegateImpl$ListMenuDecorView), setLastBaselineToBottomHeight.read(getContext(), R.color.f66422131099798));
        } else {
            this.mCustomBillsToPay.setIconDrawable(setLastBaselineToBottomHeight.write(getContext(), chain.AppCompatDelegateImpl$ListMenuDecorView));
        }
        this.mCustomBillsToPay.setInstallmentVisibility(chain.setForceShowIcon);
        this.mCustomBillsToPay.setInstallmentEnability(!chain.setContentView);
    }

    public final void IconCompatParcelizer(String str) {
        if (this.MediaMetadataCompat != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_UPDATE_LIST");
            intent.putExtra("CREDIT_CARD_NUMBER", str);
            getContext().sendBroadcast(intent);
            return;
        }
        retry retry = new retry(getFragmentManager(), getContext(), str);
        this.MediaMetadataCompat = retry;
        this.mTabPager.setAdapter(retry);
        this.mTabLayout.setupWithViewPager(this.mTabPager);
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(getContext(), CardPaySelectedActivity.class);
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

    public final void RatingCompat() {
        Intent read = SelectPurchasesActivity.read(getActivity(), this.MediaBrowserCompat$CustomActionResultReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 112);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setResultDeserializer.write write) {
        FragmentActivity activity;
        repeatTransfer repeattransfer = new repeatTransfer(write);
        if (isAdded() && (activity = getActivity()) != null) {
            repeattransfer.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public static /* synthetic */ void read(setResultDeserializer.write write, Context context) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.ccr_email_verification_title).IconCompatParcelizer((int) R.string.ccr_email_verification_body);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ccr_email_verification_cancel_btn), new getTransferHistory(write));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_email_verification_ok_btn), new confirmFixedAccount(write)).show();
    }

    public final void write() {
        FragmentActivity activity;
        getBanks getbanks = new getBanks(this);
        if (isAdded() && (activity = getActivity()) != null) {
            getbanks.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        indexOfNonDigit indexofnondigit = this.creditCardDetailTabPresenter;
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        indexofnondigit.write.read.write(chain.MediaDescriptionCompat);
        TypeAdapters.C391523 r1 = TypeAdapters.C391523.IconCompatParcelizer;
        if (indexofnondigit.RatingCompat != null) {
            r1.IconCompatParcelizer(indexofnondigit.RatingCompat);
        }
    }

    public final void MediaDescriptionCompat() {
        String str;
        indexOfNonDigit indexofnondigit = this.creditCardDetailTabPresenter;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = indexofnondigit.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        boolean z = true;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
            TypeAdapters.C391634 r1 = TypeAdapters.C391634.write;
            if (indexofnondigit.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r1.IconCompatParcelizer(indexofnondigit.RatingCompat);
                return;
            }
            return;
        }
        TypeAdapters.C391421 r12 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.TypeAdapters.21.IconCompatParcelizer(java.lang.Object):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.TypeAdapters.21.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (indexofnondigit.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r12.IconCompatParcelizer(indexofnondigit.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("deejung_installment_popup_notnow", zsyr2kArr);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("deejung_installment_popup_verify", zsyr2kArr);
        }
    }
}
