package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_NtbHmlApiBasedDocumentInstructionsActivity;
import p040o.ActivityBuilder_OffshoreCurrencyActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C5179qY;
import p040o.C7431sF;
import p040o.C7528ts;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.StreetViewPanoramaFragment;
import p040o.ZSYR2K;
import p040o.ensureAnimationInfo;
import p040o.getArguments;
import p040o.getICheckDeserializerRtti;
import p040o.getLendingIssuer;
import p040o.getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper;
import p040o.parseReport;
import p040o.sF$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.setupDialog;
import p040o.show;

public class EBillSelectedFragment extends BaseFragment implements FragmentBuilder_BindBillPaymentTabFragment, getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper {
    public String IconCompatParcelizer;
    private ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private String MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public getLendingIssuer MediaMetadataCompat;
    private BulkTransferDeepLinkActivity RatingCompat;
    @HmlPinActivity
    public C7431sF eBillPaymentSelectedPresenter;
    @BindView
    AmountEditText mAmountEditText;
    @BindView
    DefaultButton mButton;
    @BindView
    LinearLayout mContainerLayout;
    @BindView
    CustomTransferAndPayBiller mCustomTransferAndPayBiller;
    @BindView
    ViewGroup mLimitProgress;
    @BindView
    TextView mRemainingLimit;
    @BindView
    TabLayout mTabLayout;
    @BindView
    FragmentWrapContentViewPager mTabPager;
    @BindView
    TextInputLayout mTextInputLayout;
    @BindView
    NoteEditText noteEditText;

    public static EBillSelectedFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder, StreetViewPanoramaFragment.zzb zzb, CrashlyticsReport.FilesPayload.File.Builder builder2, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY", builder);
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putParcelable("com.scb.phone.EXTRA_ACCOUNT_NUMBER", builder2);
        bundle.putString("source", str);
        EBillSelectedFragment eBillSelectedFragment = new EBillSelectedFragment();
        eBillSelectedFragment.setArguments(bundle);
        return eBillSelectedFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87162131493943, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        String AbsActionBarView = AbsActionBarView();
        this.MediaDescriptionCompat = AbsActionBarView;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView), new ZSYR2K("subtype", "ebill")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpay_input", zsyr2kArr);
        }
        this.eBillPaymentSelectedPresenter.MediaBrowserCompat$ItemReceiver(this);
        C7431sF sFVar = this.eBillPaymentSelectedPresenter;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder) getArguments().getParcelable("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY");
        sFVar.MediaBrowserCompat$ItemReceiver = builder;
        if (builder.MediaSessionCompat$QueueItem) {
            C7528ts tsVar = C7528ts.MediaBrowserCompat$CustomActionResultReceiver;
            if (sFVar.RatingCompat != null) {
                tsVar.IconCompatParcelizer(sFVar.RatingCompat);
            }
        }
        C7431sF sFVar2 = this.eBillPaymentSelectedPresenter;
        if (sFVar2.RatingCompat != null) {
            sFVar2.RatingCompat.Keep();
        }
        sFVar2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(sFVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, (String) null);
        sFVar2.IconCompatParcelizer.IconCompatParcelizer(new sF$MediaBrowserCompat$CustomActionResultReceiver(sFVar2, (byte) 0));
        C7431sF sFVar3 = this.eBillPaymentSelectedPresenter;
        C5179qY qYVar = C5179qY.write;
        if (sFVar3.RatingCompat != null) {
            qYVar.IconCompatParcelizer(sFVar3.RatingCompat);
        }
        sFVar3.IconCompatParcelizer.IconCompatParcelizer("BILLPAYMENT", "ALL");
        sFVar3.IconCompatParcelizer.IconCompatParcelizer(new C7431sF.read(sFVar3, (byte) 0));
        CrashlyticsReport.FilesPayload.File.Builder builder2 = (CrashlyticsReport.FilesPayload.File.Builder) getArguments().getParcelable("com.scb.phone.EXTRA_ACCOUNT_NUMBER");
        if (builder2 != null) {
            this.IconCompatParcelizer = builder2.MediaSessionCompat$Token;
            this.eBillPaymentSelectedPresenter.read = MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.RatingCompat = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_NtbHmlApiBasedDocumentInstructionsActivity(this), ActivityBuilder_OffshoreCurrencyActivity.IconCompatParcelizer);
        show.IconCompatParcelizer((T[]) new String[]{getString(R.string.top_up_tab), getString(R.string.bill_payment_tab)}).write(new setupDialog.IconCompatParcelizer(new getArguments<Set<T>>() {
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.10.read():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
            /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.10.read():java.lang.Object, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.10.read():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
            public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.10.read():java.lang.Object, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.10.read():java.lang.Object, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
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
        }, new ensureAnimationInfo<Set<T>, T>() {
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.9.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
            /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.9.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.9.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.9.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.9.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
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
        }));
        return inflate;
    }

    private void write(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        this.mContainerLayout.setVisibility(0);
        this.mCustomTransferAndPayBiller.setTitle(builder.MediaDescriptionCompat);
        this.mCustomTransferAndPayBiller.setDescription(builder.setExpandedFormat);
        if (!TextUtils.isEmpty(builder.setChecked)) {
            this.mCustomTransferAndPayBiller.setDescription2(builder.ActionMenuItemView);
        }
        if (!TextUtils.isEmpty(builder.setPadding)) {
            this.mCustomTransferAndPayBiller.setDescription3(builder.setPopupCallback);
        }
        this.mCustomTransferAndPayBiller.setAvatar(builder.MediaBrowserCompat$SearchResultReceiver);
        this.mCustomTransferAndPayBiller.setOnCustomTransferAndPayItemListener(this);
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        write(builder);
        this.MediaBrowserCompat$SearchResultReceiver = true;
        getLendingIssuer getlendingissuer = new getLendingIssuer(getChildFragmentManager(), getContext(), builder);
        this.MediaMetadataCompat = getlendingissuer;
        this.mTabPager.setAdapter(getlendingissuer);
        this.mTabPager.setOffscreenPageLimit(3);
        this.mTabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                EBillSelectedFragment.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver = i;
            }
        });
        this.mTabLayout.setupWithViewPager(this.mTabPager);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        write(builder);
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.mTabPager.setVisibility(8);
        this.mTabLayout.setVisibility(8);
        this.mTextInputLayout.setVisibility(0);
        this.mAmountEditText.setCustomHint("", this.mTextInputLayout);
        AmountEditText amountEditText = this.mAmountEditText;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.mTextInputLayout, 9.9999999999E8d, 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input)));
        String replace = builder.AlertController$RecycleListView.replace(".", "").replace(",", "");
        if (!TextUtils.isEmpty(replace) && Double.parseDouble(replace) != 0.0d) {
            this.mAmountEditText.setText(builder.AlertController$RecycleListView);
        }
        this.mAmountEditText.setEnabled(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        parseReport.IconCompatParcelizer iconCompatParcelizer = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = signal.IconCompatParcelizer;
        iconCompatParcelizer.read = signal.MediaBrowserCompat$SearchResultReceiver;
        arrayList.add(new parseReport(iconCompatParcelizer, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer2 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = signal.write;
        iconCompatParcelizer2.read = signal.MediaBrowserCompat$MediaItem;
        arrayList.add(new parseReport(iconCompatParcelizer2, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer3 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver = signal.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer3.read = signal.MediaMetadataCompat;
        arrayList.add(new parseReport(iconCompatParcelizer3, (byte) 0));
        parseReport.IconCompatParcelizer iconCompatParcelizer4 = new parseReport.IconCompatParcelizer();
        iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = signal.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer4.read = signal.setMenuCallbacks;
        arrayList.add(new parseReport(iconCompatParcelizer4, (byte) 0));
        Double RatingCompat2 = RatingCompat();
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = this.eBillPaymentSelectedPresenter.MediaBrowserCompat$ItemReceiver;
        setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver = new setUuidFromUtf8Bytes().write(signal.MediaBrowserCompat$ItemReceiver()).MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, z));
        MediaBrowserCompat$ItemReceiver.ListMenuItemView = this.IconCompatParcelizer;
        setUuidFromUtf8Bytes MediaMetadataCompat2 = MediaBrowserCompat$ItemReceiver.MediaMetadataCompat("BILLPAYMENT");
        MediaMetadataCompat2.RatingCompat = str;
        MediaMetadataCompat2.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver2 = MediaMetadataCompat2.MediaBrowserCompat$CustomActionResultReceiver(signal.IconCompatParcelizer());
        MediaBrowserCompat$CustomActionResultReceiver2.AlertController$RecycleListView = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str, signal.setPopupTheme, signal.ActionMenuView$OnMenuItemClickListener, signal.ActivityChooserView);
        MediaBrowserCompat$CustomActionResultReceiver2.setContentView = signal.setContentView;
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(RatingCompat2);
        read.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
        MediaBrowserCompat$CustomActionResultReceiver2.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        MediaBrowserCompat$CustomActionResultReceiver2.setSubtitle = builder.AppCompatViewInflater;
        MediaBrowserCompat$CustomActionResultReceiver2.ActionBarContextView = builder.setChecked;
        MediaBrowserCompat$CustomActionResultReceiver2.setHideOnContentScrollEnabled = builder.setPadding;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(signal.onMenuItemClick)));
        MediaBrowserCompat$MediaItem.setTitle = signal.setTitle;
        setUuidFromUtf8Bytes MediaMetadataCompat3 = MediaBrowserCompat$MediaItem.MediaMetadataCompat("BILLPAYMENT");
        MediaMetadataCompat3.ExpandedMenuView = signal.ExpandedMenuView;
        MediaMetadataCompat3.setOnMenuItemClickListener = this.noteEditText.mNoteEditText.getText().toString();
        Intent intent = new Intent(getActivity(), BillPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", MediaMetadataCompat3);
        intent.putExtra("subtype", "ebill");
        intent.putExtra("source", this.MediaDescriptionCompat);
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
        aj_();
    }

    private Double RatingCompat() {
        Double IconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver ? this.MediaMetadataCompat.IconCompatParcelizer() : getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.mAmountEditText.getText().toString());
        return ((IconCompatParcelizer2 == null || !String.valueOf(IconCompatParcelizer2).isEmpty()) && this.IconCompatParcelizer != null) ? IconCompatParcelizer2 : Double.valueOf(0.0d);
    }

    public final void IconCompatParcelizer(String str) {
        ViewGroup viewGroup = this.mLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(str);
    }

    public final void write() {
        ViewGroup viewGroup = this.mLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ViewGroup viewGroup = this.mLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(R.string.limit_not_available);
    }

    public final void read() {
        this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
    }

    public final void write(String str) {
        this.mAmountEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.mAmountEditText.setText(str);
    }

    public final void read(boolean z) {
        this.mAmountEditText.setEnabled(z);
    }

    public final void IconCompatParcelizer() {
        this.noteEditText.write();
    }

    public void onDestroy() {
        this.eBillPaymentSelectedPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.RatingCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.RatingCompat.dispose();
        }
        super.onDestroy();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver) parentFragment;
        }
    }

    public final void aD_() {
        ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver serverProjectProvider$5$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (serverProjectProvider$5$MediaBrowserCompat$ItemReceiver != null) {
            serverProjectProvider$5$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdditionalInfoButtonClicked() {
        /*
            r10 = this;
            o.sF r0 = r10.eBillPaymentSelectedPresenter
            com.scb.phone.view.custom.common.NoteEditText r1 = r10.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            T r2 = r0.RatingCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            if (r2 == 0) goto L_0x0042
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0040
            o.sZ r1 = p040o.C10142sZ.MediaBrowserCompat$CustomActionResultReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0037
            r2 = r3
            goto L_0x0038
        L_0x0037:
            r2 = r4
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x0042
        L_0x0040:
            r0 = r3
            goto L_0x0043
        L_0x0042:
            r0 = r4
        L_0x0043:
            if (r0 == 0) goto L_0x00d4
            java.lang.Double r0 = r10.RatingCompat()
            double r1 = r0.doubleValue()
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00d4
            o.StreetViewPanoramaFragment$zzb r1 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            o.sF r2 = r10.eBillPaymentSelectedPresenter
            java.lang.String r5 = r10.IconCompatParcelizer
            double r6 = r0.doubleValue()
            com.scb.phone.view.custom.common.NoteEditText r0 = r10.noteEditText
            android.widget.EditText r0 = r0.mNoteEditText
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            T r8 = r2.RatingCompat
            if (r8 == 0) goto L_0x0071
            r8 = r3
            goto L_0x0072
        L_0x0071:
            r8 = r4
        L_0x0072:
            if (r8 == 0) goto L_0x00d4
            o.tv r8 = p040o.C7530tv.IconCompatParcelizer
            T r9 = r2.RatingCompat
            if (r9 == 0) goto L_0x007c
            r9 = r3
            goto L_0x007d
        L_0x007c:
            r9 = r4
        L_0x007d:
            if (r9 == 0) goto L_0x0084
            T r9 = r2.RatingCompat
            r8.IconCompatParcelizer(r9)
        L_0x0084:
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r8 = r2.MediaBrowserCompat$ItemReceiver
            o.putInstance r9 = p040o.putInstance.IconCompatParcelizer()
            r9.MediaBrowserCompat$ItemReceiver = r5
            java.lang.String r5 = r8.IconCompatParcelizer
            r9.MediaBrowserCompat$CustomActionResultReceiver = r5
            java.lang.String r5 = p040o.removeIfFromRandomAccessList.read((double) r6)
            r9.IconCompatParcelizer = r5
            java.lang.String r1 = p040o.putInstance.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r9.MediaSessionCompat$ResultReceiverWrapper = r1
            java.lang.String r1 = r8.ParcelableVolumeInfo
            r9.MediaBrowserCompat$SearchResultReceiver = r1
            java.lang.String r1 = r8.AppCompatViewInflater
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x00a7
            r1 = r5
        L_0x00a7:
            r9.MediaSessionCompat$Token = r1
            java.lang.String r1 = r8.setChecked
            if (r1 != 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r5 = r1
        L_0x00af:
            r9.f2924x50fd9e4a = r5
            java.lang.String r1 = r8.setPadding
            r9.AlertController$RecycleListView = r1
            if (r0 == 0) goto L_0x00be
            int r1 = r0.length()
            if (r1 == 0) goto L_0x00be
            r3 = r4
        L_0x00be:
            if (r3 == 0) goto L_0x00c1
            r0 = 0
        L_0x00c1:
            o.paddedPartition<java.lang.String> r1 = r9.write
            r1.MediaBrowserCompat$ItemReceiver = r0
            o.include r0 = r2.IconCompatParcelizer
            r0.MediaBrowserCompat$ItemReceiver((p040o.putInstance) r9)
            o.include r0 = r2.IconCompatParcelizer
            o.sF$MediaBrowserCompat$ItemReceiver r1 = new o.sF$MediaBrowserCompat$ItemReceiver
            r1.<init>(r2, r4)
            r0.IconCompatParcelizer(r1)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment.onAdditionalInfoButtonClicked():void");
    }

    public StreetViewPanoramaFragment.zzb MediaBrowserCompat$CustomActionResultReceiver() {
        StreetViewPanoramaFragment.zzb zzb = StreetViewPanoramaFragment.zzb.PROFILE;
        Serializable serializable = getArguments().getSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD");
        return (serializable == null || !(serializable instanceof StreetViewPanoramaFragment.zzb)) ? zzb : (StreetViewPanoramaFragment.zzb) serializable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r7.IconCompatParcelizer != null) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void write(com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment r7) {
        /*
            boolean r0 = r7.MediaBrowserCompat$SearchResultReceiver
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            o.getLendingIssuer r0 = r7.MediaMetadataCompat
            java.lang.Double r0 = r0.IconCompatParcelizer()
            double r3 = r0.doubleValue()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            goto L_0x0027
        L_0x0017:
            com.scb.phone.view.custom.common.AmountEditText r0 = r7.mAmountEditText
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r7.IconCompatParcelizer
            if (r0 == 0) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            com.scb.phone.view.custom.common.DefaultButton r0 = r7.mButton
            boolean r0 = r0.isEnabled()
            if (r0 == r1) goto L_0x0044
            com.scb.phone.view.custom.common.DefaultButton r7 = r7.mButton
            r7.setButtonEnabled(r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment.write(com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment):void");
    }
}
