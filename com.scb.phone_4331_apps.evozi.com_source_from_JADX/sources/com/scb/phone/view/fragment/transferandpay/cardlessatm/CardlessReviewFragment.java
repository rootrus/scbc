package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMSuccessfulRequestActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C4054b;
import p040o.CaptureActivity;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.IImageStorage;
import p040o.ZSYR2K;
import p040o.getBottomRightCornerHeight;
import p040o.getImageByBitmapId;
import p040o.parseEvent;
import p040o.parseEventExecution;
import p040o.setupButtonBarView;
import p040o.writeUInt64NoTag;

public class CardlessReviewFragment extends BaseFragment implements getBottomRightCornerHeight {
    private String IconCompatParcelizer;
    private parseEvent MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getImageByBitmapId cardlessATMReviewPresenter;
    @BindView
    ConstraintLayout cardlessImportantCsLayout;
    @BindView
    TextView conditionTv;
    @BindView
    CustomTransferAndPayItem customAmount;
    @BindView
    CustomTransferAndPaySource customSource;
    @BindView
    Spinner customSpinner;
    @BindView
    protected DefaultButton mContinueButton;

    public static CardlessReviewFragment write(parseEvent parseevent, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_CARDLESS_REVIEW", parseevent);
        bundle.putString("source", str);
        bundle.putString("CONDITION", str2);
        CardlessReviewFragment cardlessReviewFragment = new CardlessReviewFragment();
        cardlessReviewFragment.setArguments(bundle);
        return cardlessReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85992131493826, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.IconCompatParcelizer = AbsActionBarView();
        this.MediaBrowserCompat$CustomActionResultReceiver = (parseEvent) getArguments().getParcelable("com.scb.phone.EXTRA_CARDLESS_REVIEW");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("source", this.IconCompatParcelizer);
        zsyr2kArr[1] = new ZSYR2K("type", IImageStorage.DEPOSIT.typeCode.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) ? "deposit" : "card");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("cardless_atm_review", zsyr2kArr);
        }
        this.cardlessATMReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        String string = getArguments().getString("CONDITION");
        getImageByBitmapId getimagebybitmapid = this.cardlessATMReviewPresenter;
        parseEvent parseevent = this.MediaBrowserCompat$CustomActionResultReceiver;
        getimagebybitmapid.write = parseevent;
        String str = parseevent.MediaBrowserCompat$MediaItem;
        if (("CCW_CC".equals(str) || "CCW_SC".equals(str)) && string != null) {
            CaptureActivity.C31452 r3 = new writeUInt64NoTag.IconCompatParcelizer(string) {
                private final /* synthetic */ String read;

                public final void IconCompatParcelizer(
/*
Method generation error in method: o.CaptureActivity.2.IconCompatParcelizer(java.lang.Object):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CaptureActivity.2.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
            };
            if (getimagebybitmapid.RatingCompat != null) {
                r3.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
            }
        } else {
            C4054b.C40605 r7 = C4054b.C40605.MediaBrowserCompat$CustomActionResultReceiver;
            if (getimagebybitmapid.RatingCompat != null) {
                r7.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
            }
        }
        CaptureActivity.C31441 r72 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(
/*
Method generation error in method: o.CaptureActivity.1.IconCompatParcelizer(java.lang.Object):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.CaptureActivity.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
        if (getimagebybitmapid.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r72.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
        }
        return inflate;
    }

    public final void write(parseEvent parseevent) {
        this.customSource.setSourceName(parseevent.write);
        this.customSource.setAccountNumber(parseevent.IconCompatParcelizer);
        this.customSource.setAvatar(parseevent.MediaBrowserCompat$ItemReceiver, R.drawable.logo_scb_new);
        this.customSource.setAccountBalance(parseevent.RatingCompat);
        this.customAmount.setText(getString(R.string.cardless_atm_amount).toUpperCase());
        this.customAmount.setValue(parseevent.read);
        if (parseevent.MediaBrowserCompat$CustomActionResultReceiver != null) {
            CustomTransferAndPayItem customTransferAndPayItem = this.customAmount;
            CrashlyticsReport.Session.Application application = parseevent.MediaBrowserCompat$CustomActionResultReceiver;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValuesAligned(application, true);
            this.customAmount.mBottomSpace.setVisibility(8);
        }
        this.customSpinner.setAdapter(new ArrayAdapter(getActivity(), R.layout.f84812131493708, parseevent.MediaBrowserCompat$SearchResultReceiver.toArray(new String[parseevent.MediaBrowserCompat$SearchResultReceiver.size()])));
        this.customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (view instanceof TextView) {
                    ((TextView) view).setTextSize(0, (float) CardlessReviewFragment.this.getResources().getDimensionPixelSize(R.dimen.f72302131165354));
                }
            }
        });
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseEventExecution parseeventexecution) {
        if (getActivity() != null) {
            getActivity().finish();
        }
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("source", this.IconCompatParcelizer);
        zsyr2kArr[1] = new ZSYR2K("type", IImageStorage.DEPOSIT.typeCode.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) ? "deposit" : "card");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("cardless_atm_slip", zsyr2kArr);
        }
        CardlessATMSuccessfulRequestActivity.IconCompatParcelizer(getContext(), parseeventexecution);
    }

    public final void write(String str) {
        this.conditionTv.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.cardlessImportantCsLayout.setVisibility(8);
    }

    @OnClick
    public void onContinueButtonClick() {
        getImageByBitmapId getimagebybitmapid = this.cardlessATMReviewPresenter;
        setupButtonBarView setupbuttonbarview = new setupButtonBarView(getimagebybitmapid, getimagebybitmapid.write.MediaMetadataCompat.get(this.customSpinner.getSelectedItemPosition()));
        if (getimagebybitmapid.RatingCompat != null) {
            setupbuttonbarview.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
        }
    }
}
