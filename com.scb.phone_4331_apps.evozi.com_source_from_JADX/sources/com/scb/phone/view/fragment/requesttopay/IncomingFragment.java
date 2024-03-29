package com.scb.phone.view.fragment.requesttopay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.requesttopay.SummaryDetailActivity;
import com.scb.phone.view.adapter.requesttopay.IncomingAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributePrepaidTravelGettingStartedActivity;
import p040o.C3092xce3d994b;
import p040o.C4957mT;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedMap;
import p040o.LocationSource;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.getDocumentFramingError;
import p040o.setOverflowReserved;
import p040o.setSymbol;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class IncomingFragment extends BaseRequestToPayFragment implements getDocumentFramingError.write, IncomingAdapter.read {
    /* access modifiers changed from: private */
    public IncomingAdapter MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    TextView emptyIncomingTextView;
    @HmlPinActivity
    public C4957mT incomingPresenter;
    @BindView
    RecyclerView incomingRecyclerView;

    public static IncomingFragment IconCompatParcelizer(String str) {
        IncomingFragment incomingFragment = new IncomingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        incomingFragment.setArguments(bundle);
        return incomingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89472131494174, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$SearchResultReceiver = AbsActionBarView();
        this.MediaBrowserCompat$MediaItem = new IncomingAdapter(this);
        this.incomingPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4957mT mTVar = this.incomingPresenter;
        mTVar.MediaBrowserCompat$ItemReceiver.write();
        mTVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4957mT.write(mTVar, (byte) 0));
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.IconCompatParcelizer() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.scb.phone.view.fragment.BaseFragment.4.write(androidx.core.widget.NestedScrollView, int, int):void, class status: UNLOADED
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
                /*  JADX ERROR: Method generation error: Method args not loaded: com.scb.phone.view.fragment.BaseFragment.4.write(androidx.core.widget.NestedScrollView, int, int):void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.scb.phone.view.fragment.BaseFragment.4.write(androidx.core.widget.NestedScrollView, int, int):void, class status: UNLOADED
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
                public final void write(
/*
Method generation error in method: com.scb.phone.view.fragment.BaseFragment.4.write(androidx.core.widget.NestedScrollView, int, int):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.scb.phone.view.fragment.BaseFragment.4.write(androidx.core.widget.NestedScrollView, int, int):void, class status: UNLOADED
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
        }
        this.toolbarProxy.IconCompatParcelizer(R.menu.f93032131558407);
        this.IconCompatParcelizer = this.toolbarProxy.MediaBrowserCompat$CustomActionResultReceiver().findItem(R.id.menu_proxy_filter);
        return inflate;
    }

    public void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (z && this.incomingPresenter != null) {
            this.customSpinner.setSelection(0);
        }
    }

    public void onDestroyView() {
        this.incomingPresenter.onDestroy();
        RecyclerView recyclerView = this.incomingRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.incomingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.incomingRecyclerView = null;
        }
        super.onDestroyView();
    }

    public final void write(List<setSymbol> list) {
        if (!list.isEmpty()) {
            this.toolbarProxy.setVisibility(8);
            this.newAliasLayout.setVisibility(0);
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            arrayList.add(new ImmutableSortedMap.Builder(getString(R.string.request_money_all_alias), "ALL"));
            arrayList.addAll(MediaBrowserCompat$ItemReceiver(list));
            arrayList2.addAll(IconCompatParcelizer(list));
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new ArrayAdapter<ImmutableSortedMap.Builder>(getActivity(), arrayList) {
                    public final View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        ((TextView) view2).setGravity(5);
                        return view2;
                    }
                };
                this.customSpinner.setAdapter(this.MediaDescriptionCompat);
                try {
                    this.customSpinner.setSelection(1);
                } catch (Exception unused) {
                }
                this.customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public final void onNothingSelected(AdapterView<?> adapterView) {
                    }

                    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                        if (TextUtils.equals(((ImmutableSortedMap.Builder) arrayList.get(i)).IconCompatParcelizer, "ALL")) {
                            IncomingFragment.this.MediaBrowserCompat$CustomActionResultReceiver = arrayList2;
                        } else {
                            IncomingFragment.this.MediaBrowserCompat$CustomActionResultReceiver = IncomingFragment.read((ImmutableSortedMap.Builder) arrayList2.get(i - 1));
                        }
                        IncomingFragment.this.incomingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
                        IncomingAdapter MediaBrowserCompat$ItemReceiver2 = IncomingFragment.this.MediaBrowserCompat$MediaItem;
                        if (MediaBrowserCompat$ItemReceiver2.write) {
                            MediaBrowserCompat$ItemReceiver2.write = false;
                        }
                        C4957mT mTVar = IncomingFragment.this.incomingPresenter;
                        mTVar.IconCompatParcelizer = 1;
                        mTVar.MediaDescriptionCompat = 1;
                        IncomingFragment incomingFragment = IncomingFragment.this;
                        incomingFragment.read(incomingFragment.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                });
            }
        } else {
            new setOverflowReserved(getContext(), this.toolbarProxy.findViewById(R.id.menu_proxy_filter)).MediaBrowserCompat$CustomActionResultReceiver.clear();
        }
        this.IconCompatParcelizer.setTitle(getString(R.string.request_money_selecting_proxy_title));
        this.proxyIdTextView.setTag((Object) null);
        this.container.setVisibility(8);
    }

    public final void read(boolean z, List<C3092xce3d994b.C30931> list, int i) {
        if (list == null) {
            IncomingAdapter incomingAdapter = this.MediaBrowserCompat$MediaItem;
            if (incomingAdapter.write) {
                incomingAdapter.write = false;
            }
        } else if (list.isEmpty() || i == 0) {
            this.emptyIncomingTextView.setVisibility(0);
            this.container.setVisibility(8);
        } else {
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            if (z) {
                IncomingAdapter incomingAdapter2 = this.MediaBrowserCompat$MediaItem;
                incomingAdapter2.read = list;
                incomingAdapter2.IconCompatParcelizer.write();
            } else {
                IncomingAdapter incomingAdapter3 = this.MediaBrowserCompat$MediaItem;
                incomingAdapter3.read.addAll(list);
                incomingAdapter3.IconCompatParcelizer.write();
            }
            this.incomingRecyclerView.setLayoutManager(linearLayoutManager);
            this.incomingRecyclerView.setNestedScrollingEnabled(false);
            this.incomingRecyclerView.setAdapter(this.MediaBrowserCompat$MediaItem);
            IncomingAdapter incomingAdapter4 = this.MediaBrowserCompat$MediaItem;
            if (incomingAdapter4.write) {
                incomingAdapter4.write = false;
            }
            this.emptyIncomingTextView.setVisibility(8);
            this.container.setVisibility(0);
        }
        this.selectionProxyTextView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        this.emptyIncomingTextView.setVisibility(0);
        this.emptyIncomingTextView.setText(access_2200.IconCompatParcelizer);
        this.container.setVisibility(8);
        this.incomingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        this.selectionProxyTextView.setVisibility(8);
    }

    public final void aw_() {
        super.aw_();
        read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void write(int i) {
        LocationSource locationSource = ((IncomingAdapter) this.incomingRecyclerView.MediaDescriptionCompat).read.get(i).MediaBrowserCompat$CustomActionResultReceiver;
        setUuidFromUtf8Bytes RatingCompat = setUuidFromUtf8Bytes.RatingCompat();
        Intent intent = new Intent(getContext(), SummaryDetailActivity.class);
        boolean z = "PENDING".compareTo(locationSource.MediaSessionCompat$QueueItem) == 0;
        C4957mT mTVar = this.incomingPresenter;
        mTVar.write.read(locationSource, RatingCompat, mTVar.read.MediaBrowserCompat$ItemReceiver.setItemInvoker());
        intent.addFlags(603979776);
        intent.putExtra("request_to_pay.SummaryDetailActivity.titleName", getString(R.string.request_to_pay_incoming_detail_title));
        intent.putExtra("request_to_pay.SummaryDetailActivity.button.paynow", z);
        intent.putExtra("source", this.MediaBrowserCompat$SearchResultReceiver);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", RatingCompat);
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
            startActivityForResult(intent, 6001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6001 && i2 == -1) {
            IncomingAdapter incomingAdapter = this.MediaBrowserCompat$MediaItem;
            if (incomingAdapter.write) {
                incomingAdapter.write = false;
            }
            C4957mT mTVar = this.incomingPresenter;
            mTVar.IconCompatParcelizer = 1;
            mTVar.MediaDescriptionCompat = 1;
            read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.incomingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        }
    }

    /* access modifiers changed from: private */
    public void read(List<ImmutableSortedMap.Builder> list) {
        if (isMenuVisible()) {
            C4957mT mTVar = this.incomingPresenter;
            if (!(mTVar.IconCompatParcelizer > mTVar.MediaDescriptionCompat)) {
                this.container.setVisibility(0);
                IncomingAdapter incomingAdapter = this.MediaBrowserCompat$MediaItem;
                ActivityBuilder_ContributePrepaidTravelGettingStartedActivity activityBuilder_ContributePrepaidTravelGettingStartedActivity = new ActivityBuilder_ContributePrepaidTravelGettingStartedActivity(this, list);
                if (!incomingAdapter.write) {
                    incomingAdapter.write = true;
                    activityBuilder_ContributePrepaidTravelGettingStartedActivity.MediaBrowserCompat$CustomActionResultReceiver(true);
                }
                this.selectionProxyTextView.setVisibility(8);
                this.emptyIncomingTextView.setVisibility(8);
            }
        }
    }
}
