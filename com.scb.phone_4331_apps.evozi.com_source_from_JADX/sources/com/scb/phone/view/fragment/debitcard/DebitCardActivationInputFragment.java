package com.scb.phone.view.fragment.debitcard;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.item.ItemIconCustom;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.EasycashMCMCDetailService;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIIdExtractionServerOnDeviceFactory;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.StreetViewPanorama;
import p040o.awaitEvenIfOnMainThread;
import p040o.checkEntryPoint;
import p040o.loanInfoDetail;
import p040o.nativeGetField;
import p040o.nativeGetFields;
import p040o.nativeGetRows;
import p040o.nativeGetRows$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.postCalculation;
import p040o.removeAllReports;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class DebitCardActivationInputFragment extends BaseFragment implements IdCaptureModule_GetIIdExtractionServerOnDeviceFactory {
    private checkEntryPoint IconCompatParcelizer = new checkEntryPoint(new ArrayList());
    private FragmentBuilder_BindCreditLimitDisplayFragment MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver RatingCompat;
    @BindView
    ItemIconCustom accountCustomComponent;
    @BindView
    Button activateButton;
    @BindView
    public CustomEditText cardInputEditText;
    @BindView
    TextView cardInputError;
    @BindView
    ViewPager cardViewPager;
    @BindView
    CircleIndicator circleIndicator;
    @BindView
    Group contentDisplayStateGroup;
    @BindView
    Group emptyStateGroup;
    @HmlPinActivity
    public nativeGetRows presenter;
    @BindView
    public ConstraintLayout rootConstraint;

    public static DebitCardActivationInputFragment MediaBrowserCompat$ItemReceiver() {
        return new DebitCardActivationInputFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86422131493869, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        nativeGetRows nativegetrows = this.presenter;
        if (nativegetrows.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativegetrows.RatingCompat.AlertController$RecycleListView();
        }
        nativegetrows.write.MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReportJsonTransform$$Lambda$4.DEBIT_CARD_FUNCTION.toString());
        nativegetrows.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.nativeGetRows.4.onNext(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.nativeGetRows.4.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.nativeGetRows.4.onError(java.lang.Throwable):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.nativeGetRows.4.onError(java.lang.Throwable):void, class status: UNLOADED
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
        this.cardViewPager.setAdapter(this.IconCompatParcelizer);
        this.cardViewPager.addOnPageChangeListener(new ViewPager$MediaBrowserCompat$MediaItem() {
            public final void onPageSelected(int i) {
                nativeGetRows nativegetrows = DebitCardActivationInputFragment.this.presenter;
                nativeGetField nativegetfield = new nativeGetField(nativegetrows, i);
                if (nativegetrows.RatingCompat != null) {
                    nativegetfield.IconCompatParcelizer(nativegetrows.RatingCompat);
                }
            }
        });
        this.circleIndicator.setViewPager(this.cardViewPager);
        this.IconCompatParcelizer.registerDataSetObserver(this.circleIndicator.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                nativeGetRows nativegetrows = DebitCardActivationInputFragment.this.presenter;
                String obj = editable.toString();
                nativegetrows.read = obj;
                nativeGetFields nativegetfields = new nativeGetFields(nativegetrows, obj);
                if (nativegetrows.RatingCompat != null) {
                    nativegetfields.IconCompatParcelizer(nativegetrows.RatingCompat);
                }
            }
        };
        this.cardInputEditText.clearFocus();
        this.cardInputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.cardInputEditText.setOnBackListener(new EasycashMCMCDetailService(this));
        this.cardInputEditText.setOnEditorActionListener(new loanInfoDetail(this));
        this.cardInputEditText.setOnFocusChangeListener(new postCalculation(this));
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver) {
            this.RatingCompat = (DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.RatingCompat = null;
    }

    public final void IconCompatParcelizer(List<removeAllReports> list) {
        checkEntryPoint checkentrypoint = this.IconCompatParcelizer;
        checkentrypoint.write = list;
        checkentrypoint.notifyDataSetChanged();
    }

    public final void MediaBrowserCompat$ItemReceiver(awaitEvenIfOnMainThread awaitevenifonmainthread) {
        this.accountCustomComponent.setUpWithDisplay(awaitevenifonmainthread);
    }

    public final void write() {
        this.emptyStateGroup.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        int i = 0;
        this.contentDisplayStateGroup.setVisibility(0);
        CircleIndicator circleIndicator2 = this.circleIndicator;
        if (!z) {
            i = 8;
        }
        circleIndicator2.setVisibility(i);
    }

    public final void read(String str) {
        this.cardInputEditText.removeTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.cardInputEditText.setText(str);
        this.cardInputEditText.setSelection(str.length());
        this.cardInputEditText.addTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.activateButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver debitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver = this.RatingCompat;
        if (debitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver != null) {
            debitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver.AppCompatActivity();
        }
    }

    public final void read(boolean z) {
        if (z) {
            this.cardInputEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
            this.cardInputError.setVisibility(8);
            return;
        }
        this.cardInputEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        this.cardInputError.setVisibility(0);
    }

    @OnClick
    public void onActivateButtonClicked() {
        nativeGetRows nativegetrows = this.presenter;
        int currentItem = this.cardViewPager.getCurrentItem();
        String obj = this.cardInputEditText.getText().toString();
        if (nativegetrows.RatingCompat != null) {
            nativegetrows.RatingCompat.AlertController$RecycleListView();
        }
        nativegetrows.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(obj.replace(" ", ""), nativegetrows.MediaBrowserCompat$ItemReceiver.get(currentItem).MediaBrowserCompat$CustomActionResultReceiver);
        nativegetrows.IconCompatParcelizer.IconCompatParcelizer(new nativeGetRows$MediaBrowserCompat$CustomActionResultReceiver(nativegetrows));
    }

    public static /* synthetic */ void write(DebitCardActivationInputFragment debitCardActivationInputFragment) {
        debitCardActivationInputFragment.cardInputEditText.clearFocus();
        debitCardActivationInputFragment.rootConstraint.requestFocus();
    }
}
