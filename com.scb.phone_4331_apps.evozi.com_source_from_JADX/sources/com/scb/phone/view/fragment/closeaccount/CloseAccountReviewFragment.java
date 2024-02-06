package com.scb.phone.view.fragment.closeaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountAmountDetailsActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountConfirmationOtpActivity;
import com.scb.phone.view.custom.closeaccount.AccountAmountCustomComponent;
import com.scb.phone.view.custom.common.MultilineDataComponent;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CycleDetector;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MapTypeAdapterFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Streams;
import p040o.ZSYR2K;
import p040o.getBoundFields;
import p040o.getDynamicTilesList;
import p040o.setTapText;
import p040o.subSequence;

public class CloseAccountReviewFragment extends BaseFragment implements IdCaptureModule.KtaExceptionResponseDeserializer {
    @BindView
    AccountAmountCustomComponent closingAccountAmountDataComponent;
    @BindView
    MultilineDataComponent closingAccountDataComponent;
    @BindView
    TextView contactInformationTextView;
    @BindView
    MultilineDataComponent depositTypeDataComponent;
    @BindView
    TextView extraInfo;
    @HmlPinActivity
    public getBoundFields presenter;
    @BindView
    MultilineDataComponent receivingAccountDataComponent;

    public static Fragment write(String str) {
        CloseAccountReviewFragment closeAccountReviewFragment = new CloseAccountReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TYPE", str);
        closeAccountReviewFragment.setArguments(bundle);
        return closeAccountReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86222131493849, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getBoundFields getboundfields = this.presenter;
        getboundfields.IconCompatParcelizer.write(DebitCardResetOtpActivity.zip(getboundfields.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver().doOnNext(new Streams.AppendableWriter.CurrentWrite(getboundfields)), getboundfields.read.IconCompatParcelizer(), new subSequence(getboundfields, getArguments().getString("EXTRA_TYPE"))), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<CycleDetector.ComponentNode>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.getBoundFields.2.onNext(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.getBoundFields.2.onNext(java.lang.Object):void, class status: UNLOADED
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
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CycleDetector.ComponentNode componentNode) {
        this.closingAccountDataComponent.setDisplay(componentNode.write);
        this.depositTypeDataComponent.setDisplay(componentNode.IconCompatParcelizer);
        this.receivingAccountDataComponent.setDisplay(componentNode.MediaBrowserCompat$ItemReceiver);
        this.closingAccountAmountDataComponent.setDisplayData(componentNode.MediaBrowserCompat$CustomActionResultReceiver);
        this.contactInformationTextView.setText(componentNode.read);
        this.extraInfo.setText(componentNode.MediaBrowserCompat$SearchResultReceiver);
    }

    public final void read() {
        CloseAccountAmountDetailsActivity.MediaBrowserCompat$ItemReceiver(getContext());
    }

    public final void write() {
        this.closingAccountAmountDataComponent.setButtonListener(new getDynamicTilesList(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent read = CloseAccountConfirmationOtpActivity.read(getActivity());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onConfirmClicked() {
        getBoundFields getboundfields = this.presenter;
        MapTypeAdapterFactory.Adapter adapter = MapTypeAdapterFactory.Adapter.MediaBrowserCompat$ItemReceiver;
        if (getboundfields.RatingCompat != null) {
            adapter.IconCompatParcelizer(getboundfields.RatingCompat);
        }
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("view_breakdown", "click")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("close_acct_breakdown", zsyr2kArr);
        }
    }
}
