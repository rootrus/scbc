package com.scb.phone.view.fragment.closeaccount;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountReviewActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.JsonTreeReader;
import p040o.ObjectTypeAdapter;
import p040o.ReflectiveTypeAdapterFactory;
import p040o.UnsafeAllocator;
import p040o.ZSYR2K;
import p040o.access$2300;
import p040o.getStreetViewPanoramaAsync;
import p040o.removeFirst;
import p040o.requestActivityUpdates;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;

public class CloseAccountSelectionOwnSelectedFragment extends BaseFragment implements IdCaptureModule.OnDeviceExceptionResponseDeserializer.C6904a {
    private IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public ReflectiveTypeAdapterFactory.Adapter presenter;
    @BindView
    Button reviewButton;
    @BindView
    ImageView startIcon;
    @BindView
    TextView subtitle;
    @BindView
    TextView title;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static CloseAccountSelectionOwnSelectedFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new CloseAccountSelectionOwnSelectedFragment();
    }

    public void onAttach(Context context) {
        if (getParentFragment() instanceof IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IconCompatParcelizer) getParentFragment();
        } else if (context instanceof IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IconCompatParcelizer) context;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement AccountTargetSelectionListener");
            throw new ClassCastException(sb.toString());
        }
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86232131493850, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ReflectiveTypeAdapterFactory.Adapter adapter = this.presenter;
        adapter.MediaBrowserCompat$ItemReceiver.write(adapter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getStreetViewPanoramaAsync>() {
            public final /* synthetic */ void onNext(Object obj) {
                getStreetViewPanoramaAsync getstreetviewpanoramaasync = (getStreetViewPanoramaAsync) obj;
                getStreetViewPanoramaAsync unused = Adapter.this.write = getstreetviewpanoramaasync;
                Adapter adapter = Adapter.this;
                UnsafeAllocator.C39233 r1 = new writeUInt64NoTag.IconCompatParcelizer(getstreetviewpanoramaasync) {
                    private final /* synthetic */ getStreetViewPanoramaAsync IconCompatParcelizer;

                    public final void IconCompatParcelizer(
/*
Method generation error in method: o.UnsafeAllocator.3.IconCompatParcelizer(java.lang.Object):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.UnsafeAllocator.3.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                };
                if (adapter.RatingCompat != null) {
                    r1.IconCompatParcelizer(adapter.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                if (!Adapter.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    Adapter.this.MediaBrowserCompat$ItemReceiver(Adapter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            }
        });
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(removeFirst removefirst) {
        this.title.setText(removefirst.write);
        this.subtitle.setText(removefirst.read);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder), this.startIcon, removefirst.IconCompatParcelizer, getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    @OnClick
    public void onCloseIconClick() {
        ReflectiveTypeAdapterFactory.Adapter adapter = this.presenter;
        JsonTreeReader.C35571 r1 = JsonTreeReader.C35571.IconCompatParcelizer;
        if (adapter.RatingCompat != null) {
            r1.IconCompatParcelizer(adapter.RatingCompat);
        }
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    @OnClick
    public void onReviewButtonClick() {
        boolean z = true;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("subtype", "own")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("close_acct_input", zsyr2kArr);
        }
        ReflectiveTypeAdapterFactory.Adapter adapter = this.presenter;
        if (adapter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            adapter.RatingCompat.AlertController$RecycleListView();
        }
        adapter.read.MediaBrowserCompat$CustomActionResultReceiver(adapter.write.write, "OWN");
        adapter.read.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<requestActivityUpdates>() {
            public final void onError(Throwable th) {
                if (!Adapter.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    Adapter.this.MediaBrowserCompat$ItemReceiver(Adapter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                Adapter.MediaBrowserCompat$CustomActionResultReceiver(Adapter.this);
                Adapter adapter = Adapter.this;
                ObjectTypeAdapter.C36982 r0 = ObjectTypeAdapter.C36982.read;
                if (adapter.RatingCompat != null) {
                    r0.IconCompatParcelizer(adapter.RatingCompat);
                }
            }
        });
    }

    public final void IconCompatParcelizer() {
        CloseAccountReviewActivity.write(getContext(), "CLOSE_ACCOUNT_OWN_FRAGMENT");
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "select_receiving_account")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("close_acct_review", zsyr2kArr);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
