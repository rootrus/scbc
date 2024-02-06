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
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.requesttopay.EnterProxyActivity;
import com.scb.phone.view.activity.requesttopay.SummaryDetailActivity;
import com.scb.phone.view.adapter.requesttopay.OutgoingAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributePreregistrationInformationActivity;
import p040o.C4960mX;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedMap;
import p040o.MapFragment;
import p040o.MenuItemImpl;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.getDocumentFramingError;
import p040o.setOffset;
import p040o.setOverflowReserved;
import p040o.setSymbol;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class OutgoingFragment extends BaseRequestToPayFragment implements getDocumentFramingError.read, OutgoingAdapter.read {
    /* access modifiers changed from: private */
    public OutgoingAdapter MediaBrowserCompat$SearchResultReceiver;
    @BindView
    TextView emptyOutgoingTextView;
    @HmlPinActivity
    public C4960mX outgoingPresenter;
    @BindView
    RecyclerView outgoingRecyclerView;

    public static OutgoingFragment read(String str) {
        OutgoingFragment outgoingFragment = new OutgoingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        outgoingFragment.setArguments(bundle);
        return outgoingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89482131494175, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$SearchResultReceiver = new OutgoingAdapter(this);
        this.outgoingPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4960mX mXVar = this.outgoingPresenter;
        mXVar.write.read();
        mXVar.write.IconCompatParcelizer(new C4960mX.write(mXVar, (byte) 0));
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

    public void onDestroyView() {
        this.outgoingPresenter.onDestroy();
        RecyclerView recyclerView = this.outgoingRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.outgoingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.outgoingRecyclerView = null;
        }
        super.onDestroyView();
    }

    @OnClick
    public void onNewRequestClick() {
        Intent intent = new Intent(getContext(), EnterProxyActivity.class);
        intent.putExtra("source", AbsActionBarView());
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
            startActivityForResult(intent, 6000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6000 && i2 == -1) {
            OutgoingAdapter outgoingAdapter = this.MediaBrowserCompat$SearchResultReceiver;
            if (outgoingAdapter.write) {
                outgoingAdapter.write = false;
            }
            C4960mX mXVar = this.outgoingPresenter;
            mXVar.read = 1;
            mXVar.MediaBrowserCompat$SearchResultReceiver = 1;
            read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.outgoingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        }
    }

    public void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (z && this.outgoingPresenter != null) {
            this.customSpinner.setSelection(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<setSymbol> list) {
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
                this.customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public final void onNothingSelected(AdapterView<?> adapterView) {
                    }

                    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                        if (TextUtils.equals(((ImmutableSortedMap.Builder) arrayList.get(i)).IconCompatParcelizer, "ALL")) {
                            OutgoingFragment.this.MediaBrowserCompat$CustomActionResultReceiver = arrayList2;
                        } else {
                            OutgoingFragment.this.MediaBrowserCompat$CustomActionResultReceiver = OutgoingFragment.read((ImmutableSortedMap.Builder) arrayList2.get(i - 1));
                        }
                        OutgoingFragment.this.outgoingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
                        OutgoingAdapter IconCompatParcelizer2 = OutgoingFragment.this.MediaBrowserCompat$SearchResultReceiver;
                        if (IconCompatParcelizer2.write) {
                            IconCompatParcelizer2.write = false;
                        }
                        C4960mX mXVar = OutgoingFragment.this.outgoingPresenter;
                        mXVar.read = 1;
                        mXVar.MediaBrowserCompat$SearchResultReceiver = 1;
                        OutgoingFragment outgoingFragment = OutgoingFragment.this;
                        outgoingFragment.read(outgoingFragment.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                });
            }
        } else {
            MenuItemImpl menuItemImpl = new setOverflowReserved(getContext(), this.toolbarProxy.findViewById(R.id.menu_proxy_filter)).MediaBrowserCompat$CustomActionResultReceiver;
            this.proxyIdTextView.setTag((Object) null);
            menuItemImpl.clear();
        }
        this.IconCompatParcelizer.setTitle(getString(R.string.request_money_selecting_proxy_title));
        this.container.setVisibility(8);
    }

    public final void write(boolean z, List<setOffset> list, int i) {
        if (list == null) {
            OutgoingAdapter outgoingAdapter = this.MediaBrowserCompat$SearchResultReceiver;
            if (outgoingAdapter.write) {
                outgoingAdapter.write = false;
            }
        } else if (list.isEmpty() || i == 0) {
            this.emptyOutgoingTextView.setVisibility(0);
            this.container.setVisibility(8);
        } else {
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            if (z) {
                OutgoingAdapter outgoingAdapter2 = this.MediaBrowserCompat$SearchResultReceiver;
                outgoingAdapter2.read = list;
                outgoingAdapter2.IconCompatParcelizer.write();
            } else {
                OutgoingAdapter outgoingAdapter3 = this.MediaBrowserCompat$SearchResultReceiver;
                outgoingAdapter3.read.addAll(list);
                outgoingAdapter3.IconCompatParcelizer.write();
            }
            this.outgoingRecyclerView.setLayoutManager(linearLayoutManager);
            this.outgoingRecyclerView.setNestedScrollingEnabled(false);
            this.outgoingRecyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
            OutgoingAdapter outgoingAdapter4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (outgoingAdapter4.write) {
                outgoingAdapter4.write = false;
            }
            this.emptyOutgoingTextView.setVisibility(8);
            this.container.setVisibility(0);
        }
        this.selectionProxyTextView.setVisibility(8);
    }

    public final void IconCompatParcelizer(access$2200 access_2200) {
        this.emptyOutgoingTextView.setVisibility(0);
        this.emptyOutgoingTextView.setText(access_2200.IconCompatParcelizer);
        this.container.setVisibility(8);
        this.outgoingRecyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        this.selectionProxyTextView.setVisibility(8);
        OutgoingAdapter outgoingAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (outgoingAdapter.write) {
            outgoingAdapter.write = false;
        }
    }

    public final void aw_() {
        super.aw_();
        read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void read(int i) {
        MapFragment.zza zza = ((OutgoingAdapter) this.outgoingRecyclerView.MediaDescriptionCompat).read.get(i).read;
        setUuidFromUtf8Bytes RatingCompat = setUuidFromUtf8Bytes.RatingCompat();
        Intent intent = new Intent(getContext(), SummaryDetailActivity.class);
        C4960mX mXVar = this.outgoingPresenter;
        mXVar.IconCompatParcelizer.write(zza, RatingCompat, mXVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setItemInvoker());
        intent.addFlags(603979776);
        intent.putExtra("request_to_pay.SummaryDetailActivity.titleName", getString(R.string.request_to_pay_outgoing_detail_title));
        intent.putExtra("request_to_pay.SummaryDetailActivity.button.paynow", false);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", RatingCompat);
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

    /* access modifiers changed from: private */
    public void read(List<ImmutableSortedMap.Builder> list) {
        if (isMenuVisible()) {
            C4960mX mXVar = this.outgoingPresenter;
            if (!(mXVar.read > mXVar.MediaBrowserCompat$SearchResultReceiver)) {
                this.container.setVisibility(0);
                OutgoingAdapter outgoingAdapter = this.MediaBrowserCompat$SearchResultReceiver;
                ActivityBuilder_ContributePreregistrationInformationActivity activityBuilder_ContributePreregistrationInformationActivity = new ActivityBuilder_ContributePreregistrationInformationActivity(this, list);
                if (!outgoingAdapter.write) {
                    outgoingAdapter.write = true;
                    activityBuilder_ContributePreregistrationInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(true);
                }
                this.selectionProxyTextView.setVisibility(8);
                this.emptyOutgoingTextView.setVisibility(8);
            }
        }
    }
}
