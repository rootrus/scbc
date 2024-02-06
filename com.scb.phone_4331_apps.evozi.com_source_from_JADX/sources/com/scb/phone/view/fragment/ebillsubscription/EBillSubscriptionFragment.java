package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionSearchActivity;
import com.scb.phone.view.activity.ebillsubscription.RtpEBillSubscriptionDetailActivity;
import com.scb.phone.view.adapter.ebillsubscription.C5753x4ef7ff3;
import com.scb.phone.view.adapter.ebillsubscription.EBillSubscriptionAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.HmlPinActivity;
import p040o.MapFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1600;
import p040o.getViewBoundariesImage;
import p040o.setTapText;

public class EBillSubscriptionFragment extends BaseFragment implements C5753x4ef7ff3, CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer {
    private EBillSubscriptionAdapter IconCompatParcelizer;
    @HmlPinActivity
    public getViewBoundariesImage eBillSubscriptionPresenter;
    @BindView
    TextView noEBillSubscriptionTextView;
    @BindView
    RecyclerView recyclerView;
    @BindView
    NestedScrollView scrollView;

    public static EBillSubscriptionFragment write() {
        return new EBillSubscriptionFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87172131493944, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.eBillSubscriptionPresenter.MediaBrowserCompat$ItemReceiver(this);
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.IconCompatParcelizer() {
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
        setTransitioning();
        getViewBoundariesImage getviewboundariesimage = this.eBillSubscriptionPresenter;
        if (getviewboundariesimage.RatingCompat != null) {
            getviewboundariesimage.RatingCompat.Keep();
        }
        getviewboundariesimage.IconCompatParcelizer.IconCompatParcelizer();
        getviewboundariesimage.IconCompatParcelizer.IconCompatParcelizer(new getViewBoundariesImage.read(getviewboundariesimage, (byte) 0));
        return inflate;
    }

    public void setUserVisibleHint(boolean z) {
        getViewBoundariesImage getviewboundariesimage;
        super.setUserVisibleHint(z);
        if (z && (getviewboundariesimage = this.eBillSubscriptionPresenter) != null) {
            getviewboundariesimage.MediaBrowserCompat$ItemReceiver();
        }
    }

    @OnClick
    public void onButtonNewSubscriptionClick() {
        Intent intent = new Intent(getActivity(), EBillSubscriptionSearchActivity.class);
        FragmentActivity activity = getActivity();
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(MapFragment mapFragment, List<access$1600> list, boolean z) {
        if (this.eBillSubscriptionPresenter.write) {
            this.noEBillSubscriptionTextView.setVisibility(0);
            return;
        }
        EBillSubscriptionAdapter eBillSubscriptionAdapter = this.IconCompatParcelizer;
        if (eBillSubscriptionAdapter == null) {
            this.IconCompatParcelizer = new EBillSubscriptionAdapter(getContext(), list, this);
            getContext();
            this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.recyclerView.setNestedScrollingEnabled(false);
            this.recyclerView.setAdapter(this.IconCompatParcelizer);
            this.eBillSubscriptionPresenter.MediaBrowserCompat$ItemReceiver();
            return;
        }
        eBillSubscriptionAdapter.write.addAll(list);
        eBillSubscriptionAdapter.IconCompatParcelizer.write();
    }

    public final void aw_() {
        super.aw_();
        this.eBillSubscriptionPresenter.MediaBrowserCompat$ItemReceiver();
    }

    public final void read(int i) {
        access$1600 access_1600;
        List<access$1600> list = this.IconCompatParcelizer.write;
        if (list != null) {
            access_1600 = list.get(i);
        } else {
            access_1600 = null;
        }
        Intent intent = new Intent(getContext(), RtpEBillSubscriptionDetailActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EBILL_SUBSCRIPTION_ITEM_DISPLAY", access_1600);
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
            startActivityForResult(intent, 6021);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity) getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 6021(0x1785, float:8.437E-42)
            if (r3 != r0) goto L_0x001e
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity
            if (r0 == 0) goto L_0x001e
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity r0 = (com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity) r0
            o.getViewBoundariesImage r1 = r0.eBillSubscriptionPresenter
            if (r1 == 0) goto L_0x001e
            r1.MediaBrowserCompat$CustomActionResultReceiver()
            o.getViewBoundariesImage r0 = r0.eBillSubscriptionPresenter
            r0.MediaBrowserCompat$ItemReceiver()
        L_0x001e:
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionFragment.onActivityResult(int, int, android.content.Intent):void");
    }
}
