package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.investment.onboarding.CustomFundAddressDetail;
import com.scb.phone.view.custom.investment.onboarding.CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindNtbDiscoverActivity;
import p040o.ActivityBuilder_BindNtbDiscoverFundFilterListActivity;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C7172x585a5cc0;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.LatLng;
import p040o.injectMembers;
import p040o.inject_imageDataToBitmap;
import p040o.removeForwardSlashesIn;
import p040o.setFocusAreas;
import p040o.zzuk;

public class FundAddressMainFragment extends BaseFragment implements C7172x585a5cc0 {
    private FragmentBuilder_BindCalendarDialogFragment IconCompatParcelizer;
    private FragmentBuilder_BindCalendarDialogFragment.write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public setFocusAreas fundAddressPresenter;
    @BindView
    TextView labelAddressDesc;
    @BindView
    TextView labelAddressTitle;
    @BindView
    CustomFundAddressDetail viewAddressDetailHome;
    @BindView
    CustomFundAddressDetail viewAddressDetailMail;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCalendarDialogFragment.write) context;
        }
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88392131494066, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fundAddressPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.buttonNext.setEnabled(false);
        this.labelAddressTitle.setText(getText(R.string.mf_onboarding_address_main_registered));
        this.viewAddressDetailHome.setOnCustomFundAddressDetailCompletion(new CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver() {
            public final void write() {
                AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
                setFocusAreas setfocusareas = FundAddressMainFragment.this.fundAddressPresenter;
                removeForwardSlashesIn removeforwardslashesin = setfocusareas.MediaBrowserCompat$ItemReceiver;
                if (removeforwardslashesin != null) {
                    autoValue_CrashlyticsReport_CustomAttribute = removeforwardslashesin.IconCompatParcelizer;
                } else {
                    autoValue_CrashlyticsReport_CustomAttribute = null;
                }
                injectMembers injectmembers = new injectMembers(autoValue_CrashlyticsReport_CustomAttribute);
                if (setfocusareas.RatingCompat != null) {
                    injectmembers.IconCompatParcelizer(setfocusareas.RatingCompat);
                }
            }

            public final void write(int i, boolean z) {
                if (i == 1) {
                    setFocusAreas setfocusareas = FundAddressMainFragment.this.fundAddressPresenter;
                    setfocusareas.IconCompatParcelizer = z;
                    setfocusareas.write(false);
                }
            }
        });
        this.viewAddressDetailMail.setOnCustomFundAddressDetailCompletion(new CustomFundAddressDetail$MediaBrowserCompat$ItemReceiver() {
            public final void write() {
                AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
                setFocusAreas setfocusareas = FundAddressMainFragment.this.fundAddressPresenter;
                removeForwardSlashesIn removeforwardslashesin = setfocusareas.MediaBrowserCompat$ItemReceiver;
                if (removeforwardslashesin != null) {
                    autoValue_CrashlyticsReport_CustomAttribute = removeforwardslashesin.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    autoValue_CrashlyticsReport_CustomAttribute = null;
                }
                inject_imageDataToBitmap inject_imagedatatobitmap = new inject_imageDataToBitmap(autoValue_CrashlyticsReport_CustomAttribute);
                if (setfocusareas.RatingCompat != null) {
                    inject_imagedatatobitmap.IconCompatParcelizer(setfocusareas.RatingCompat);
                }
            }

            public final void write(int i, boolean z) {
                if (i == 1) {
                    setFocusAreas setfocusareas = FundAddressMainFragment.this.fundAddressPresenter;
                    setfocusareas.MediaMetadataCompat = z;
                    setfocusareas.write(false);
                } else if (i == 2) {
                    setFocusAreas setfocusareas2 = FundAddressMainFragment.this.fundAddressPresenter;
                    setfocusareas2.read = z;
                    setfocusareas2.write(false);
                }
            }
        });
        this.fundAddressPresenter.read();
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_addressinfo");
        }
        return inflate;
    }

    public final void write(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        FundAddressDetailFragment read = FundAddressDetailFragment.read(autoValue_CrashlyticsReport_CustomAttribute, 0, this.viewAddressDetailHome.checkbox1.isChecked(), this.viewAddressDetailMail.checkbox1.isChecked(), this.viewAddressDetailMail.checkbox2.isChecked());
        read.MediaBrowserCompat$CustomActionResultReceiver = new ActivityBuilder_BindNtbDiscoverFundFilterListActivity(this);
        read.MediaBrowserCompat$SearchResultReceiver = getString(R.string.mf_onboarding_address_detail_home);
        this.MediaBrowserCompat$CustomActionResultReceiver.write(read);
    }

    public final void read(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        FundAddressDetailFragment read = FundAddressDetailFragment.read(autoValue_CrashlyticsReport_CustomAttribute, 3, this.viewAddressDetailHome.checkbox1.isChecked(), this.viewAddressDetailMail.checkbox1.isChecked(), this.viewAddressDetailMail.checkbox2.isChecked());
        read.MediaBrowserCompat$CustomActionResultReceiver = new ActivityBuilder_BindNtbDiscoverActivity(this);
        read.MediaBrowserCompat$SearchResultReceiver = getString(R.string.mf_onboarding_address_detail_mail);
        this.MediaBrowserCompat$CustomActionResultReceiver.write(read);
    }

    @OnClick
    public void onClickNext() {
        setFocusAreas setfocusareas = this.fundAddressPresenter;
        boolean isChecked = this.viewAddressDetailHome.checkbox1.isChecked();
        boolean isChecked2 = this.viewAddressDetailMail.checkbox1.isChecked();
        boolean isChecked3 = this.viewAddressDetailMail.checkbox2.isChecked();
        if (setfocusareas.RatingCompat != null) {
            setfocusareas.RatingCompat.AlertController$RecycleListView();
        }
        CustomConcurrentHashMap.WeakExpirableEvictableEntry MediaBrowserCompat$ItemReceiver = CustomConcurrentHashMap.WeakExpirableEvictableEntry.MediaBrowserCompat$ItemReceiver();
        String str = "0";
        MediaBrowserCompat$ItemReceiver.read = isChecked ? DiskLruCache.VERSION_1 : str;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = isChecked3 ? DiskLruCache.VERSION_1 : str;
        if (isChecked2) {
            str = DiskLruCache.VERSION_1;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        LatLng latLng = setfocusareas.write;
        latLng.write(latLng.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.setFocusAreas.4.onNext(java.lang.Object):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setFocusAreas.4.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.setFocusAreas.4.onError(java.lang.Throwable):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setFocusAreas.4.onError(java.lang.Throwable):void, class status: UNLOADED
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

            public final void onComplete(
/*
Method generation error in method: o.setFocusAreas.4.onComplete():void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setFocusAreas.4.onComplete():void, class status: UNLOADED
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

    public final void write(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.labelAddressDesc.setText(str);
        this.viewAddressDetailHome.setDescriptionText(str2);
        this.viewAddressDetailMail.setDescriptionText(str3);
        if (TextUtils.isEmpty(str2)) {
            this.viewAddressDetailMail.setCheckbox2Visibility(8);
        } else {
            this.viewAddressDetailMail.setCheckbox2Visibility(0);
        }
        this.viewAddressDetailHome.setCheckbox1Checked(z, z4);
        this.viewAddressDetailMail.setCheckbox1Checked(z2, z4);
        this.viewAddressDetailMail.setCheckbox2Checked(z3, z4);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.viewAddressDetailMail.setCheckbox2Visibility(z ? 0 : 8);
    }
}
