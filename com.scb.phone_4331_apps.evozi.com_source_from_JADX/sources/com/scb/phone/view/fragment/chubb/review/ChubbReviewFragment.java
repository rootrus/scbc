package com.scb.phone.view.fragment.chubb.review;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.chubb.ChubbPaySuccessActivity;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;
import p040o.CustomConcurrentHashMap;
import p040o.CycleDetector;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedSet;
import p040o.LinkedTreeMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getIIdExtractionServerRtti;
import p040o.jsonFromMapEntryString;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class ChubbReviewFragment extends BaseReviewFragment implements getIIdExtractionServerRtti, FragmentBuilder_BindBaseFragment {
    private CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder IconCompatParcelizer;
    private View MediaMetadataCompat;
    @HmlPinActivity
    public LinkedTreeMap.LinkedTreeMapIterator chubbReviewPresenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    View unexpectedDivider;
    @BindView
    View viewBottomDivider;

    public final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static ChubbReviewFragment write(CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder, jsonFromMapEntryString jsonfrommapentrystring) {
        ChubbReviewFragment chubbReviewFragment = new ChubbReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_GET_BILL_PAYMENT_PARTNER", builder);
        bundle.putSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
        chubbReviewFragment.setArguments(bundle);
        return chubbReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86202131493847, viewGroup, false);
        this.MediaMetadataCompat = inflate;
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.IconCompatParcelizer = (CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder) getArguments().getParcelable("KEY_GET_BILL_PAYMENT_PARTNER");
        jsonFromMapEntryString jsonfrommapentrystring = jsonFromMapEntryString.NORMAL;
        if (!(getArguments() == null || getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE") == null)) {
            jsonfrommapentrystring = (jsonFromMapEntryString) getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE");
        }
        this.chubbReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.chubbReviewPresenter.MediaBrowserCompat$SearchResultReceiver = jsonfrommapentrystring;
        LinkedTreeMap.LinkedTreeMapIterator linkedTreeMapIterator = this.chubbReviewPresenter;
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = this.IconCompatParcelizer;
        linkedTreeMapIterator.read = builder;
        LinkedTreeMap.KeySet keySet = new LinkedTreeMap.KeySet(builder);
        if (linkedTreeMapIterator.RatingCompat != null) {
            z = true;
        }
        if (z) {
            keySet.IconCompatParcelizer(linkedTreeMapIterator.RatingCompat);
        }
        this.unexpectedDivider.setVisibility(8);
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder) {
        MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat, getContext());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CycleDetector.C33061 r5) {
        Intent IconCompatParcelizer2 = ChubbPaySuccessActivity.IconCompatParcelizer(getContext(), r5, getActivity().getIntent().getStringExtra("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE"));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsReport.Session.OperatingSystem.Builder> list) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(getContext(), this.recyclerView, list, (FragmentBuilder_BindBaseFragment) this, false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.viewBottomDivider.setVisibility(8);
    }

    @OnClick
    public void onClickConfirm() {
        LinkedTreeMap.LinkedTreeMapIterator linkedTreeMapIterator = this.chubbReviewPresenter;
        boolean z = true;
        if (linkedTreeMapIterator.MediaBrowserCompat$SearchResultReceiver == jsonFromMapEntryString.INSURANCE_PORT) {
            if (linkedTreeMapIterator.RatingCompat == null) {
                z = false;
            }
            if (z) {
                linkedTreeMapIterator.RatingCompat.AlertController$RecycleListView();
            }
            setUuidFromUtf8Bytes setuuidfromutf8bytes = linkedTreeMapIterator.read.MediaBrowserCompat$SearchResultReceiver;
            if (setuuidfromutf8bytes == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
            }
            linkedTreeMapIterator.write.MediaBrowserCompat$CustomActionResultReceiver(new CustomConcurrentHashMap.Values(setuuidfromutf8bytes.MediaBrowserCompat$MediaItem(), linkedTreeMapIterator.read.MediaBrowserCompat$CustomActionResultReceiver, linkedTreeMapIterator.read.read, linkedTreeMapIterator.read.MediaBrowserCompat$MediaItem), new LinkedTreeMap.Node(linkedTreeMapIterator), new FundFactSheetActivity() {
                public final java.lang.Object invoke(
/*
Method generation error in method: o.LinkedTreeMap.KeySet.1.invoke(java.lang.Object):java.lang.Object, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LinkedTreeMap.KeySet.1.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            return;
        }
        if (linkedTreeMapIterator.RatingCompat == null) {
            z = false;
        }
        if (z) {
            linkedTreeMapIterator.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableSortedSet.Builder MediaBrowserCompat$ItemReceiver = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
        setUuidFromUtf8Bytes setuuidfromutf8bytes2 = linkedTreeMapIterator.read.MediaBrowserCompat$SearchResultReceiver;
        if (setuuidfromutf8bytes2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = setuuidfromutf8bytes2.MediaBrowserCompat$MediaItem();
        linkedTreeMapIterator.MediaBrowserCompat$ItemReceiver.read(MediaBrowserCompat$ItemReceiver);
        linkedTreeMapIterator.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new LinkedTreeMap.LinkedTreeMapIterator.read(linkedTreeMapIterator, (byte) 0));
    }
}
