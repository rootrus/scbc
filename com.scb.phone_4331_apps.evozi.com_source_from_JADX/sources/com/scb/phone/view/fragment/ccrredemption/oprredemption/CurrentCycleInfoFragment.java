package com.scb.phone.view.fragment.ccrredemption.oprredemption;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ComponentDiscovery;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.Gson;
import p040o.HmlPinActivity;
import p040o.alwaysEager;
import p040o.getIdNumber;
import p040o.setDateFormat;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;
import p040o.zaz;

public class CurrentCycleInfoFragment extends BaseFragment implements getIdNumber {
    @BindView
    TextView currentSpendingValue;
    @BindView
    ImageView leftTierImage;
    @BindView
    TextView leftTierLabel;
    @BindView
    TextView leftTierValue;
    @HmlPinActivity
    public zaz picassoFactory;
    @HmlPinActivity
    public setDateFormat presenter;
    @BindView
    ImageView rightTierImage;
    @BindView
    TextView rightTierLabel;
    @BindView
    TextView rightTierValue;
    @BindView
    ProgressBar spendingProgressBar;

    public static CurrentCycleInfoFragment MediaBrowserCompat$CustomActionResultReceiver(alwaysEager alwayseager) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CurrentCycleInfoFragment.CURRENT_CYCLE_MODEL_EXTRA", alwayseager);
        CurrentCycleInfoFragment currentCycleInfoFragment = new CurrentCycleInfoFragment();
        currentCycleInfoFragment.setArguments(bundle);
        return currentCycleInfoFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86402131493867, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setDateFormat setdateformat = this.presenter;
        Gson.C34284 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.Gson.4.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.Gson.4.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (setdateformat.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.IconCompatParcelizer(setdateformat.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(alwaysEager alwayseager) {
        String str;
        String str2;
        this.leftTierLabel.setText(alwayseager.RatingCompat);
        this.leftTierValue.setText(alwayseager.MediaBrowserCompat$MediaItem);
        this.rightTierLabel.setText(alwayseager.MediaDescriptionCompat);
        this.rightTierValue.setText(alwayseager.ParcelableVolumeInfo);
        this.currentSpendingValue.setText(alwayseager.MediaBrowserCompat$ItemReceiver);
        this.spendingProgressBar.setMax(alwayseager.MediaSessionCompat$ResultReceiverWrapper - alwayseager.MediaBrowserCompat$SearchResultReceiver);
        this.spendingProgressBar.setProgress(alwayseager.write - alwayseager.MediaBrowserCompat$SearchResultReceiver);
        if (alwayseager.MediaSessionCompat$QueueItem == ComponentDiscovery.NONE) {
            str = alwayseager.IconCompatParcelizer;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(alwayseager.IconCompatParcelizer);
            str = sb.toString();
        }
        if (alwayseager.MediaSessionCompat$QueueItem == ComponentDiscovery.NONE) {
            str2 = alwayseager.MediaMetadataCompat;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb2.append(alwayseager.MediaMetadataCompat);
            str2 = sb2.toString();
        }
        this.picassoFactory.read.write(str).IconCompatParcelizer((int) R.drawable.placeholder_tier_grey).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.placeholder_tier_grey).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(this.leftTierImage, (FragmentBuilder_BindEkycFragment) null);
        this.picassoFactory.read.write(str2).IconCompatParcelizer((int) R.drawable.placeholder_tier_grey).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.placeholder_tier_grey).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(this.rightTierImage, (FragmentBuilder_BindEkycFragment) null);
        ComponentDiscovery componentDiscovery = alwayseager.MediaSessionCompat$QueueItem;
        if (componentDiscovery == ComponentDiscovery.LEFT) {
            this.leftTierImage.setColorFilter(setLastBaselineToBottomHeight.read(getActivity(), R.color.f65622131099715), PorterDuff.Mode.SRC_IN);
        } else if (componentDiscovery == ComponentDiscovery.RIGHT) {
            this.rightTierImage.setColorFilter(setLastBaselineToBottomHeight.read(getActivity(), R.color.f65622131099715), PorterDuff.Mode.SRC_IN);
        }
    }
}
