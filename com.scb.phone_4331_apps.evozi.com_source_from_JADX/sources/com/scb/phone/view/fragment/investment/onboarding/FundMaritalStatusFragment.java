package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Arrays;
import java.util.List;
import p040o.ActivityBuilder_BindNtbDiscoverFundFilterActivity;
import p040o.ActivityBuilder_BindOrderChequeReviewActivity;
import p040o.ActivityBuilder_BindPartnerWebViewActivity;
import p040o.C5340x8b529e22;
import p040o.CharMatcher;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MoreExecutors;
import p040o.getAppIdentifier;
import p040o.injectRttiCheckDeserializer;
import p040o.setLuminanceThreshold;
import p040o.setSelect;
import p040o.zzwg;

public class FundMaritalStatusFragment extends BaseFragment implements injectRttiCheckDeserializer.RatingCompat {
    private List<ViewGroup> IconCompatParcelizer;
    private List<ViewGroup> MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindCalendarDialogFragment MediaBrowserCompat$MediaItem;
    private String[] MediaBrowserCompat$SearchResultReceiver;
    private SelectableChoiceAdapter MediaDescriptionCompat;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public setLuminanceThreshold fundMaritalPresenter;
    @BindView
    CommonInputViewGroup inputFirstName;
    @BindView
    CommonInputViewGroup inputLastName;
    @BindView
    CommonInputViewGroup inputMiddleName;
    @BindView
    CommonInputViewGroup inputPassportId;
    @BindView
    CommonInputViewGroup inputSpouseId;
    @BindView
    public LinearLayout layoutContainer;
    @BindView
    public LinearLayout layoutDisclosed;
    @BindView
    LinearLayout layoutForeignerSpouse;
    @BindView
    public LinearLayout layoutNotMarried;
    @BindView
    RadioButton radioDisclosed;
    @BindView
    RadioButton radioFore;
    @BindView
    RadioGroup radioGroupDisclosed;
    @BindView
    RadioGroup radioGroupSpouse;
    @BindView
    RadioButton radioTh;
    @BindView
    RadioButton radioUndisclosed;
    @BindView
    RecyclerView recyclerViewMaritalStatus;
    @BindView
    CustomSpinnerWithTitle spinnerCountry;
    @BindView
    CustomSpinnerWithTitle spinnerTitle;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.MediaBrowserCompat$MediaItem = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88412131494068, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fundMaritalPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$SearchResultReceiver = getResources().getStringArray(R.array.f64812130903060);
        setLuminanceThreshold setluminancethreshold = this.fundMaritalPresenter;
        setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.NONE;
        setluminancethreshold.MediaBrowserCompat$ItemReceiver();
        this.buttonNext.setEnabled(false);
        this.layoutNotMarried.setVisibility(8);
        SelectableChoiceAdapter selectableChoiceAdapter = new SelectableChoiceAdapter(new ActivityBuilder_BindNtbDiscoverFundFilterActivity(this));
        this.MediaDescriptionCompat = selectableChoiceAdapter;
        List asList = Arrays.asList(this.MediaBrowserCompat$SearchResultReceiver);
        selectableChoiceAdapter.MediaBrowserCompat$ItemReceiver.clear();
        selectableChoiceAdapter.MediaBrowserCompat$ItemReceiver.addAll(asList);
        selectableChoiceAdapter.IconCompatParcelizer.write();
        this.recyclerViewMaritalStatus.setAdapter(this.MediaDescriptionCompat);
        this.spinnerTitle.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
                getAppIdentifier getappidentifier = FundMaritalStatusFragment.this.fundMaritalPresenter.write;
                boolean z = true;
                if (!(getappidentifier != null && !getappidentifier.MediaBrowserCompat$ItemReceiver.isEmpty())) {
                    setLuminanceThreshold setluminancethreshold = FundMaritalStatusFragment.this.fundMaritalPresenter;
                    String write = FundMaritalStatusFragment.this.setStackedBackground();
                    if (setluminancethreshold.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setluminancethreshold.RatingCompat.AlertController$RecycleListView();
                    }
                    CharMatcher.C31623 r1 = setluminancethreshold.IconCompatParcelizer;
                    r1.write(r1.MediaBrowserCompat$CustomActionResultReceiver(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setSelect>>(write) {
                        private /* synthetic */ String IconCompatParcelizer;

                        static /* synthetic */ int MediaBrowserCompat$ItemReceiver(
/*
Method generation error in method: o.setLuminanceThreshold.3.MediaBrowserCompat$ItemReceiver(o.getAppIdentifier, o.getAppIdentifier):int, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.3.MediaBrowserCompat$ItemReceiver(o.getAppIdentifier, o.getAppIdentifier):int, class status: UNLOADED
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

                        public final /* synthetic */ void onNext(
/*
Method generation error in method: o.setLuminanceThreshold.3.onNext(java.lang.Object):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.3.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.setLuminanceThreshold.3.onError(java.lang.Throwable):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.3.onError(java.lang.Throwable):void, class status: UNLOADED
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
            }

            public final void IconCompatParcelizer() {
                setLuminanceThreshold setluminancethreshold = FundMaritalStatusFragment.this.fundMaritalPresenter;
                setluminancethreshold.f2948x50fd9e4a.set(0, Boolean.TRUE);
                setluminancethreshold.MediaDescriptionCompat.set(0, Boolean.TRUE);
                setluminancethreshold.MediaBrowserCompat$ItemReceiver();
            }
        });
        this.spinnerCountry.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
                setLuminanceThreshold setluminancethreshold = FundMaritalStatusFragment.this.fundMaritalPresenter;
                if (setluminancethreshold.RatingCompat != null) {
                    setluminancethreshold.RatingCompat.AlertController$RecycleListView();
                }
                setluminancethreshold.MediaBrowserCompat$ItemReceiver.write();
                setluminancethreshold.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzwg>() {
                    public final /* synthetic */ void onNext(
/*
Method generation error in method: o.setLuminanceThreshold.1.onNext(java.lang.Object):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.1.onNext(java.lang.Object):void, class status: UNLOADED
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

                    public final void onComplete(
/*
Method generation error in method: o.setLuminanceThreshold.1.onComplete():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.1.onComplete():void, class status: UNLOADED
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
Method generation error in method: o.setLuminanceThreshold.1.onError(java.lang.Throwable):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setLuminanceThreshold.1.onError(java.lang.Throwable):void, class status: UNLOADED
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

            public final void IconCompatParcelizer() {
                setLuminanceThreshold setluminancethreshold = FundMaritalStatusFragment.this.fundMaritalPresenter;
                setluminancethreshold.MediaDescriptionCompat.set(4, Boolean.TRUE);
                setluminancethreshold.MediaBrowserCompat$ItemReceiver();
            }
        });
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(new ViewGroup[]{this.spinnerTitle, this.inputFirstName, this.inputMiddleName, this.inputLastName, this.inputSpouseId});
            for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver.size(); i++) {
                ViewGroup viewGroup2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
                if (viewGroup2 instanceof CommonInputViewGroup) {
                    CommonInputViewGroup commonInputViewGroup = (CommonInputViewGroup) viewGroup2;
                    C6037x5fd71b5e fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6037x5fd71b5e(new ActivityBuilder_BindPartnerWebViewActivity(this), i);
                    commonInputViewGroup.mEditText.addTextChangedListener(fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver);
                    commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver);
                    commonInputViewGroup.setOnFocusChangeListener(new FundMaritalStatusFragment$MediaBrowserCompat$ItemReceiver(this, i, true));
                }
            }
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Arrays.asList(new ViewGroup[]{this.spinnerTitle, this.inputFirstName, this.inputMiddleName, this.inputLastName, this.spinnerCountry, this.inputPassportId});
            for (int i2 = 0; i2 < this.IconCompatParcelizer.size(); i2++) {
                ViewGroup viewGroup3 = this.IconCompatParcelizer.get(i2);
                if (viewGroup3 instanceof CommonInputViewGroup) {
                    CommonInputViewGroup commonInputViewGroup2 = (CommonInputViewGroup) viewGroup3;
                    C6037x5fd71b5e fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver2 = new C6037x5fd71b5e(new ActivityBuilder_BindOrderChequeReviewActivity(this), i2);
                    commonInputViewGroup2.mEditText.addTextChangedListener(fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                    commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(fundMaritalStatusFragment$MediaBrowserCompat$CustomActionResultReceiver2);
                    commonInputViewGroup2.setOnFocusChangeListener(new FundMaritalStatusFragment$MediaBrowserCompat$ItemReceiver(this, i2, false));
                }
            }
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_maritalinfo");
        }
        return inflate;
    }

    @OnClick
    public void onClickRadioButtonDisclosed() {
        setLuminanceThreshold setluminancethreshold = this.fundMaritalPresenter;
        setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.MARRIED_DISCLOSED_DESELECTED;
        setluminancethreshold.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) this.layoutContainer);
        this.layoutDisclosed.setVisibility(0);
        this.layoutForeignerSpouse.setVisibility(8);
        this.inputSpouseId.setVisibility(8);
    }

    @OnClick
    public void onClickRadioButtonUndisclosed() {
        setLuminanceThreshold setluminancethreshold = this.fundMaritalPresenter;
        setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.MARRIED_UNDISCLOSED;
        setluminancethreshold.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) this.layoutContainer);
        this.layoutDisclosed.setVisibility(8);
    }

    @OnClick
    public void onClickRadioButtonThaiSpouse() {
        MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) this.layoutContainer);
        setLuminanceThreshold setluminancethreshold = this.fundMaritalPresenter;
        setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.MARRIED_DISCLOSED_TH;
        setluminancethreshold.MediaBrowserCompat$ItemReceiver();
        this.layoutForeignerSpouse.setVisibility(8);
        this.inputSpouseId.setVisibility(0);
    }

    @OnClick
    public void onClickRadioButtonForeignerSpouse() {
        MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) this.layoutContainer);
        setLuminanceThreshold setluminancethreshold = this.fundMaritalPresenter;
        setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.MARRIED_DISCLOSED_FOREIGNER;
        setluminancethreshold.MediaBrowserCompat$ItemReceiver();
        this.layoutForeignerSpouse.setVisibility(0);
        this.inputSpouseId.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0195  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClickNext() {
        /*
            r15 = this;
            o.setLuminanceThreshold r0 = r15.fundMaritalPresenter
            java.lang.String r1 = r15.setStackedBackground()
            com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter r2 = r15.MediaDescriptionCompat
            com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter$ChoiceHolder r2 = r2.read
            androidx.recyclerview.widget.RecyclerView r3 = r2.MediaMetadataCompat
            r4 = -1
            if (r3 != 0) goto L_0x0011
            r2 = r4
            goto L_0x0015
        L_0x0011:
            int r2 = r3.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r2)
        L_0x0015:
            android.widget.RadioGroup r3 = r15.radioGroupDisclosed
            int r3 = r3.getCheckedRadioButtonId()
            if (r3 == r4) goto L_0x0028
            android.widget.RadioButton r3 = r15.radioDisclosed
            boolean r3 = r3.isChecked()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            android.widget.RadioGroup r5 = r15.radioGroupSpouse
            int r5 = r5.getCheckedRadioButtonId()
            r6 = 0
            if (r5 == r4) goto L_0x0039
            android.widget.RadioButton r4 = r15.radioTh
            boolean r4 = r4.isChecked()
            goto L_0x003a
        L_0x0039:
            r4 = r6
        L_0x003a:
            com.scb.phone.view.custom.common.CommonInputViewGroup r5 = r15.inputSpouseId
            com.scb.phone.view.custom.common.CustomEditText r5 = r5.mEditText
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            com.scb.phone.view.custom.common.CommonInputViewGroup r7 = r15.inputPassportId
            com.scb.phone.view.custom.common.CustomEditText r7 = r7.mEditText
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r8 = r15.spinnerCountry
            java.lang.String r8 = r8.MediaBrowserCompat$ItemReceiver()
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r9 = r15.spinnerTitle
            java.lang.String r9 = r9.MediaBrowserCompat$ItemReceiver()
            com.scb.phone.view.custom.common.CommonInputViewGroup r10 = r15.inputFirstName
            com.scb.phone.view.custom.common.CustomEditText r10 = r10.mEditText
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            com.scb.phone.view.custom.common.CommonInputViewGroup r11 = r15.inputMiddleName
            com.scb.phone.view.custom.common.CustomEditText r11 = r11.mEditText
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            com.scb.phone.view.custom.common.CommonInputViewGroup r12 = r15.inputLastName
            com.scb.phone.view.custom.common.CustomEditText r12 = r12.mEditText
            android.text.Editable r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            T r13 = r0.RatingCompat
            if (r13 == 0) goto L_0x008b
            r6 = 1
        L_0x008b:
            if (r6 == 0) goto L_0x0092
            T r6 = r0.RatingCompat
            r6.AlertController$RecycleListView()
        L_0x0092:
            o.CustomConcurrentHashMap$WeakExpirableEntry r6 = new o.CustomConcurrentHashMap$WeakExpirableEntry
            r6.<init>()
            java.lang.String[] r13 = r0.MediaBrowserCompat$MediaItem
            r2 = r13[r2]
            r6.write = r2
            java.lang.String r2 = "1"
            if (r3 == 0) goto L_0x00ad
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00a9
            r3 = r2
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r3 = "0"
        L_0x00ab:
            r6.MediaBrowserCompat$ItemReceiver = r3
        L_0x00ad:
            java.lang.String r3 = r6.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x01a1
            java.lang.String r3 = r6.MediaBrowserCompat$ItemReceiver
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01a1
            o.CustomConcurrentHashMap$WeakEvictableEntry r2 = new o.CustomConcurrentHashMap$WeakEvictableEntry
            r2.<init>()
            o.CustomConcurrentHashMap$ValueReference r3 = new o.CustomConcurrentHashMap$ValueReference
            r3.<init>()
            boolean r13 = r4.booleanValue()
            if (r13 == 0) goto L_0x00cc
            java.lang.String r13 = "P1"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r13 = "P8"
        L_0x00ce:
            r3.IconCompatParcelizer = r13
            boolean r13 = r4.booleanValue()
            if (r13 != 0) goto L_0x00d7
            r5 = r7
        L_0x00d7:
            r3.MediaBrowserCompat$ItemReceiver = r5
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "th"
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x012a
            boolean r4 = r5.equals(r1)
            if (r4 == 0) goto L_0x0108
            o.MoreExecutors r4 = r0.read
            java.util.List<o.zzwj> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Iterator r4 = r4.iterator()
        L_0x00f1:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0127
            java.lang.Object r13 = r4.next()
            o.zzwj r13 = (p040o.zzwj) r13
            java.lang.String r14 = r13.MediaBrowserCompat$ItemReceiver
            boolean r14 = r14.equals(r8)
            if (r14 == 0) goto L_0x00f1
            java.lang.String r4 = r13.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0128
        L_0x0108:
            o.MoreExecutors r4 = r0.read
            java.util.List<o.zzwj> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Iterator r4 = r4.iterator()
        L_0x0110:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0127
            java.lang.Object r13 = r4.next()
            o.zzwj r13 = (p040o.zzwj) r13
            java.lang.String r14 = r13.read
            boolean r14 = r14.equals(r8)
            if (r14 == 0) goto L_0x0110
            java.lang.String r4 = r13.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0128
        L_0x0127:
            r4 = r7
        L_0x0128:
            r3.write = r4
        L_0x012a:
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0155
            o.getAppIdentifier r1 = r0.write
            java.util.List<o.setSelect> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Iterator r1 = r1.iterator()
        L_0x013a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0178
            java.lang.Object r3 = r1.next()
            o.setSelect r3 = (p040o.setSelect) r3
            java.lang.String r4 = r3.MediaBrowserCompat$ItemReceiver
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x013a
            java.lang.String r1 = r3.read
            java.lang.String r1 = r1.toUpperCase()
            goto L_0x0179
        L_0x0155:
            o.getAppIdentifier r1 = r0.write
            java.util.List<o.setSelect> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Iterator r1 = r1.iterator()
        L_0x015d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0178
            java.lang.Object r3 = r1.next()
            o.setSelect r3 = (p040o.setSelect) r3
            java.lang.String r4 = r3.IconCompatParcelizer
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x015d
            java.lang.String r1 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.toUpperCase()
            goto L_0x0179
        L_0x0178:
            r1 = r7
        L_0x0179:
            r2.write = r1
            java.lang.String r1 = r10.trim()
            java.lang.String r1 = r1.toUpperCase()
            r2.MediaBrowserCompat$ItemReceiver = r1
            java.lang.String r1 = r12.trim()
            java.lang.String r1 = r1.toUpperCase()
            r2.read = r1
            boolean r1 = r11.equals(r7)
            if (r1 != 0) goto L_0x019f
            java.lang.String r1 = r11.trim()
            java.lang.String r1 = r1.toUpperCase()
            r2.IconCompatParcelizer = r1
        L_0x019f:
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2
        L_0x01a1:
            o.CharMatcher$6 r1 = r0.MediaMetadataCompat
            o.DebitCardResetOtpActivity r2 = r1.MediaBrowserCompat$CustomActionResultReceiver(r6)
            o.setLuminanceThreshold$5 r3 = new o.setLuminanceThreshold$5
            r3.<init>()
            r1.write(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.onboarding.FundMaritalStatusFragment.onClickNext():void");
    }

    public final void write(getAppIdentifier getappidentifier) {
        if (getappidentifier != null) {
            this.spinnerTitle.setItemsWithPlaceholder(getappidentifier.MediaBrowserCompat$ItemReceiver, true);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MoreExecutors moreExecutors) {
        this.spinnerCountry.setItemsWithPlaceholder(moreExecutors.read, true);
    }

    public final void read(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.MediaBrowserCompat$MediaItem;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        MediaBrowserCompat$ItemReceiver(i).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
        if (this.fundMaritalPresenter.MediaBrowserCompat$SearchResultReceiver.step <= 1) {
            this.radioGroupDisclosed.clearCheck();
        }
        if (this.fundMaritalPresenter.MediaBrowserCompat$SearchResultReceiver.step <= 2) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof CustomSpinnerWithTitle) {
                    CustomSpinnerWithTitle customSpinnerWithTitle = (CustomSpinnerWithTitle) childAt;
                    customSpinnerWithTitle.IconCompatParcelizer = false;
                    if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                        customSpinnerWithTitle.spinner.setSelection(0);
                    }
                } else if (childAt instanceof CommonInputViewGroup) {
                    ((CommonInputViewGroup) childAt).mEditText.setText("");
                } else if (childAt instanceof ViewGroup) {
                    MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) childAt);
                }
            }
            this.radioGroupSpouse.clearCheck();
        }
        if (this.fundMaritalPresenter.MediaBrowserCompat$SearchResultReceiver.step <= 3) {
            this.inputPassportId.mEditText.setText("");
            this.inputSpouseId.mEditText.setText("");
            CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerCountry;
            customSpinnerWithTitle2.IconCompatParcelizer = false;
            if (!customSpinnerWithTitle2.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                customSpinnerWithTitle2.spinner.setSelection(0);
            }
        }
    }

    private CommonInputViewGroup MediaBrowserCompat$ItemReceiver(int i) {
        if (this.radioGroupSpouse.getCheckedRadioButtonId() != -1 ? this.radioFore.isChecked() : false) {
            return (CommonInputViewGroup) this.IconCompatParcelizer.get(i);
        }
        return (CommonInputViewGroup) this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        CommonInputViewGroup MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(i);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.setErrorText(getString(i2));
    }
}
