package com.scb.phone.view.fragment.bond;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bond.BondErrorNoAccountsActivity;
import com.scb.phone.view.activity.bond.BondSelectionActivity;
import com.scb.phone.view.activity.bond.BondTermsAndConditionsActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomInfoArrow;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.TintInputViewGroup;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.C1246xea60bf60;
import p040o.C7039x355e6121;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.DefaultHeartBeatInfo;
import p040o.EncodingException;
import p040o.Event;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ObjectEncoderContext;
import p040o.PartnerDiscoverWebViewService;
import p040o.PartnerService;
import p040o.PlaybackStateCompat;
import p040o.RttiJsonCheck;
import p040o.Service;
import p040o.TileOverlay;
import p040o.TransportRegistrar;
import p040o.UnityVersionProvider;
import p040o.acceptTermsAndConditionsVersion;
import p040o.doEncode;
import p040o.getFundData;
import p040o.getHistoricalData;
import p040o.getICheckDeserializerRtti;
import p040o.getInvestFund;
import p040o.getTrimmedStackTrace;
import p040o.getUnityVersion;
import p040o.isTerminated;
import p040o.makeMap;
import p040o.postPartnerConsentWithTransactionId;
import p040o.putPartnerConsent;
import p040o.putPartnerConsentWithTransactionId;
import p040o.registerEncoder;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMapType;
import p040o.setTapText;
import p040o.zzxj;

public class BondInputFragment extends BaseFragment implements RttiJsonCheck.C7042b, AccountSourceSelectFragment.write {
    @BindView
    AmountEditText amountEditText;
    @BindView
    TextInputLayout amountInputLayout;
    @BindView
    CustomTransferAndPayItem amountPayable;
    @BindView
    TextView bondAccountDisclaimer;
    @BindView
    CustomAccountSelector bondAccounts;
    @BindView
    TextView bondCalculationDisclaimer;
    @BindView
    CustomInfoArrow bondSelection;
    @BindView
    public TintInputViewGroup mobileNumberInput;
    @HmlPinActivity
    public DefaultHeartBeatInfo presenter;
    @BindView
    CustomTransferAndPayItem pricePerUnit;
    @BindView
    DefaultButton reviewButton;
    @BindView
    ViewGroup root;
    @BindView
    TextView tvBondMobileLabel;
    @BindView
    TextView tvSelectBondLabel;
    @BindView
    CustomTransferAndPayItem unit;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static BondInputFragment MediaBrowserCompat$CustomActionResultReceiver(Service service, C7039x355e6121.read read) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_DISPLAY", service);
        bundle.putSerializable("PURCHASE_BOND_FLOW", read);
        BondInputFragment bondInputFragment = new BondInputFragment();
        bondInputFragment.setArguments(bundle);
        return bondInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CrashlyticsReport.FilesPayload.File.Builder builder;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85862131493813, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("bond_purchase_input");
        }
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY") == null || getArguments().getSerializable("PURCHASE_BOND_FLOW") == null)) {
            DefaultHeartBeatInfo defaultHeartBeatInfo = this.presenter;
            Service service = (Service) getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY");
            C7039x355e6121.read read = (C7039x355e6121.read) getArguments().getSerializable("PURCHASE_BOND_FLOW");
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver = service;
            defaultHeartBeatInfo.MediaBrowserCompat$MediaItem = read;
            getUnityVersion getunityversion = new getUnityVersion(service);
            if (defaultHeartBeatInfo.RatingCompat != null) {
                getunityversion.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
            }
            Service service2 = defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver;
            if (!service2.MediaBrowserCompat$MediaItem.isEmpty()) {
                builder = defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.get(0);
            } else {
                builder = null;
            }
            service2.MediaBrowserCompat$ItemReceiver = builder;
            if (read == C7039x355e6121.read.DLT) {
                if (defaultHeartBeatInfo.RatingCompat != null) {
                    defaultHeartBeatInfo.RatingCompat.AlertController$RecycleListView();
                }
                doEncode doencode = doEncode.read;
                if (defaultHeartBeatInfo.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    doencode.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                }
                TileOverlay tileOverlay = defaultHeartBeatInfo.IconCompatParcelizer;
                makeMap makemap = new makeMap();
                makemap.IconCompatParcelizer = "all";
                tileOverlay.IconCompatParcelizer(makemap);
                defaultHeartBeatInfo.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMapType>() {
                    public final /* synthetic */ void onNext(
/*
Method generation error in method: o.DefaultHeartBeatInfo.2.onNext(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.2.onNext(java.lang.Object):void, class status: UNLOADED
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

                    static /* synthetic */ void read(
/*
Method generation error in method: o.DefaultHeartBeatInfo.2.read(o.RttiJsonCheck$b):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.2.read(o.RttiJsonCheck$b):void, class status: UNLOADED
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
Method generation error in method: o.DefaultHeartBeatInfo.2.onError(java.lang.Throwable):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.2.onError(java.lang.Throwable):void, class status: UNLOADED
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

                    static /* synthetic */ void IconCompatParcelizer(
/*
Method generation error in method: o.DefaultHeartBeatInfo.2.IconCompatParcelizer(o.RttiJsonCheck$b):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.2.IconCompatParcelizer(o.RttiJsonCheck$b):void, class status: UNLOADED
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
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        this.bondAccounts.IconCompatParcelizer(list, new PartnerService(this));
    }

    public final void read(CrashlyticsReport.FilesPayload.File file) {
        CardView read = getChildFragmentManager().read();
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(file));
        read.write();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void onBondSelectionClick() {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.presenter;
        if (defaultHeartBeatInfo.RatingCompat != null) {
            defaultHeartBeatInfo.RatingCompat.AlertController$RecycleListView();
        }
        defaultHeartBeatInfo.read.MediaBrowserCompat$ItemReceiver(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token);
        defaultHeartBeatInfo.read.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxj>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.DefaultHeartBeatInfo.1.onNext(java.lang.Object):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.1.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.DefaultHeartBeatInfo.1.onError(java.lang.Throwable):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DefaultHeartBeatInfo.1.onError(java.lang.Throwable):void, class status: UNLOADED
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
    }

    public final void write(List<isTerminated> list) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), list);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(List<isTerminated> list, isTerminated isterminated) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), list, isterminated);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == -1) {
            DefaultHeartBeatInfo defaultHeartBeatInfo = this.presenter;
            isTerminated isterminated = (isTerminated) intent.getParcelableExtra("BOND_SELECTED_DISPLAY_EXTRA");
            boolean z = true;
            if (!isterminated.RatingCompat) {
                Event event = Event.write;
                if (defaultHeartBeatInfo.RatingCompat != null) {
                    event.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                }
            }
            double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(isterminated.MediaDescriptionCompat).doubleValue();
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.f2779x50fd9e4a = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(isterminated.MediaSessionCompat$ResultReceiverWrapper).doubleValue();
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = doubleValue;
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = isterminated;
            UnityVersionProvider unityVersionProvider = new UnityVersionProvider(defaultHeartBeatInfo, isterminated, doubleValue);
            if (defaultHeartBeatInfo.RatingCompat == null) {
                z = false;
            }
            if (z) {
                unityVersionProvider.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isTerminated isterminated) {
        this.bondSelection.setSubtitle(isterminated.IconCompatParcelizer);
        this.bondSelection.setDescription(isterminated.MediaBrowserCompat$SearchResultReceiver);
        this.bondSelection.divider.setVisibility(0);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.pricePerUnit.setVisibility(0);
        this.pricePerUnit.setValue(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.presenter;
        defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = builder;
        ObjectEncoderContext objectEncoderContext = new ObjectEncoderContext(defaultHeartBeatInfo, builder);
        if (defaultHeartBeatInfo.RatingCompat != null) {
            objectEncoderContext.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d, double d2) {
        AmountEditText amountEditText2 = this.amountEditText;
        amountEditText2.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText2, this.amountInputLayout, Double.MAX_VALUE, d, d2, getResources().getString(R.string.min_error_amount), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.invalid_amount_transfer_input)));
        this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                DefaultHeartBeatInfo defaultHeartBeatInfo = BondInputFragment.this.presenter;
                defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = d;
                defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = (long) (defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer / defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.f2779x50fd9e4a);
                defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = ((double) defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token) * defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.f2779x50fd9e4a;
                registerEncoder registerencoder = new registerEncoder(defaultHeartBeatInfo);
                if (defaultHeartBeatInfo.RatingCompat != null) {
                    registerencoder.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                DefaultHeartBeatInfo defaultHeartBeatInfo = BondInputFragment.this.presenter;
                getTrimmedStackTrace gettrimmedstacktrace = getTrimmedStackTrace.MediaBrowserCompat$CustomActionResultReceiver;
                if (defaultHeartBeatInfo.RatingCompat != null) {
                    gettrimmedstacktrace.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                }
            }
        });
        this.amountEditText.setHandleDismissKeyboard(new getInvestFund(this));
    }

    public final void read(double d) {
        this.amountEditText.setAvailableBalanceCurrencyFormattingTextWatcher(d);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.amountEditText.setEnabled(z);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo36012x50fd9e4a(String str) {
        this.unit.setValue(str);
    }

    public final void write(String str) {
        this.amountPayable.setValue(str);
    }

    public final void MediaDescriptionCompat(String str) {
        this.bondCalculationDisclaimer.setText(str);
    }

    public final void read(String str) {
        this.bondAccountDisclaimer.setText(str);
    }

    @OnClick
    public void onReviewButtomClick() {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.presenter;
        if (defaultHeartBeatInfo.MediaBrowserCompat$MediaItem == C7039x355e6121.read.DLT) {
            boolean z = true;
            if (defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver) {
                TransportRegistrar transportRegistrar = new TransportRegistrar(defaultHeartBeatInfo);
                if (defaultHeartBeatInfo.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    transportRegistrar.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                    return;
                }
                return;
            }
            EncodingException encodingException = new EncodingException(defaultHeartBeatInfo);
            if (defaultHeartBeatInfo.RatingCompat == null) {
                z = false;
            }
            if (z) {
                encodingException.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                return;
            }
            return;
        }
        defaultHeartBeatInfo.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(Service service, C7039x355e6121.read read) {
        Intent IconCompatParcelizer = BondTermsAndConditionsActivity.IconCompatParcelizer(getContext(), service, read);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        Context context = getContext();
        ForwardingCheckedFuture.read MediaBrowserCompat$CustomActionResultReceiver = ForwardingCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = R.drawable.ic_bond_empty_state;
        MediaBrowserCompat$CustomActionResultReceiver.write = getString(R.string.bond_msg_no_bonds_title);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = getString(R.string.bond_msg_no_bonds_description_not_clickable);
        MediaBrowserCompat$CustomActionResultReceiver.read = getString(R.string.bond_msg_no_bonds_description_clickable);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = getString(R.string.bond_selection_title);
        BondErrorNoAccountsActivity.MediaBrowserCompat$CustomActionResultReceiver(context, new ForwardingCheckedFuture(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0), str);
    }

    /* renamed from: b_ */
    public final void mo36017b_(boolean z) {
        this.reviewButton.setButtonEnabled(z);
    }

    public final void read() {
        this.amountEditText.clearFocus();
        this.amountEditText.setHint(getString(R.string.transfer_to_account_amount_hint));
        this.amountEditText.getText().clear();
        this.root.requestFocus();
        this.amountInputLayout.setError((CharSequence) null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mobileNumberInput.setTitle(getString(R.string.auto_purchase_bond_dlt_mobile_number_title));
        this.mobileNumberInput.setHint(getString(R.string.auto_purchase_bond_dlt_mobile_number_placeholder));
        this.mobileNumberInput.setOnBackListener(new postPartnerConsentWithTransactionId(this));
        this.mobileNumberInput.mEditText.setOnFocusChangeListener(new acceptTermsAndConditionsVersion(this));
        this.mobileNumberInput.setOnEditorActionListener(new getHistoricalData(this));
    }

    public final void IconCompatParcelizer(String str) {
        this.mobileNumberInput.setText(str);
        TintInputViewGroup tintInputViewGroup = this.mobileNumberInput;
        tintInputViewGroup.write = true;
        tintInputViewGroup.mEditClearImageButton.setVisibility(0);
        this.mobileNumberInput.setClearTextIconColorFilter(R.color.f66402131099796);
        this.mobileNumberInput.setClearTextIconListener(new putPartnerConsent(this));
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.mobileNumberInput.setErrorText(getString(R.string.error_prompt_pay_mobile_validation));
        TintInputViewGroup tintInputViewGroup = this.mobileNumberInput;
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_red_reounded_reactangle_border));
        tintInputViewGroup.mErrorTextView.setVisibility(0);
    }

    public final void write() {
        this.mobileNumberInput.setErrorText(getString(R.string.incomplete_information));
        TintInputViewGroup tintInputViewGroup = this.mobileNumberInput;
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_red_reounded_reactangle_border));
        tintInputViewGroup.mErrorTextView.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        TintInputViewGroup tintInputViewGroup = this.mobileNumberInput;
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
        tintInputViewGroup.mErrorTextView.setVisibility(8);
    }

    public final void read(String[] strArr, int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.f84312131493657, this.root, false);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.mobile_number_picker);
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60((Context) Objects.requireNonNull(getContext()));
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        ((TextView) inflate.findViewById(R.id.tv_mobile_number_picker_title)).setText(R.string.auto_purchase_bond_dlt_mobile_number_title);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(strArr.length - 1);
        numberPicker.setValue(i);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setWrapSelectorWheel(false);
        PlaybackStateCompat.CustomAction write = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        write.setCancelable(false);
        write.requestWindowFeature(1);
        write.show();
        ((Button) inflate.findViewById(R.id.bt_done)).setOnClickListener(new putPartnerConsentWithTransactionId(this, numberPicker, write));
    }

    public final void RatingCompat(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext());
        SpannableString IconCompatParcelizer2 = DefaultHeartBeatInfo.IconCompatParcelizer(getString(R.string.auto_purchase_bond_dlt_popup_message), str);
        if (!(IconCompatParcelizer2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(IconCompatParcelizer2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.confirm), new getFundData(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), PartnerDiscoverWebViewService.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void MediaDescriptionCompat() {
        this.tvSelectBondLabel.setText(R.string.auto_purchase_bond_dlt_input_bond_order);
        this.tvBondMobileLabel.setVisibility(0);
        this.mobileNumberInput.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TintInputViewGroup tintInputViewGroup = this.mobileNumberInput;
        tintInputViewGroup.write = false;
        tintInputViewGroup.mEditClearImageButton.setVisibility(8);
    }

    public final void read(int i, String str) {
        this.mobileNumberInput.mEditText.setFilters(DefaultHeartBeatInfo.MediaBrowserCompat$CustomActionResultReceiver(i));
        this.mobileNumberInput.mEditText.setText(str);
    }

    public final void MediaMetadataCompat(String str) {
        this.mobileNumberInput.setFocusable(true);
        this.mobileNumberInput.setFocusableInTouchMode(true);
        this.mobileNumberInput.requestFocus();
        this.mobileNumberInput.setText(str);
    }
}
