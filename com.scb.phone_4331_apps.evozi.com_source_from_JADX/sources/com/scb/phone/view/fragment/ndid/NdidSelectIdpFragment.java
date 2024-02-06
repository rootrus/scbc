package com.scb.phone.view.fragment.ndid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.C9869bm;
import p040o.CameraSourceParametersHolder;
import p040o.FinalizablePhantomReference;
import p040o.ForwardingTable;
import p040o.HmlPinActivity;
import p040o.ISdkDaggerPerContextComponent;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cancelAutoFocus;
import p040o.getKernelIDAdd;
import p040o.getListener;
import p040o.hasDocumentSampleImage;
import p040o.onCheckBoxClick;
import p040o.setDisplayOrientation;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.stopPreview;

public class NdidSelectIdpFragment extends BaseFragment implements getListener {
    private getKernelIDAdd IconCompatParcelizer = new getKernelIDAdd();
    private write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView agreeTermsConditionTextView;
    @BindView
    CustomSpinnerWithTitle idpSpinner;
    @BindView
    Button nextButton;
    @HmlPinActivity
    public ISdkDaggerPerContextComponent presenter;

    public interface write {
        void read(List<String> list);
    }

    /* access modifiers changed from: protected */
    public String write() {
        return "open_account";
    }

    public static NdidSelectIdpFragment IconCompatParcelizer() {
        return new NdidSelectIdpFragment();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (write) getParentFragment();
        } else if (context instanceof write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (write) context;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement IdpConfirmedListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.IconCompatParcelizer.read("feature", write());
        getKernelIDAdd getkernelidadd = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkernelidadd.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ndid_rp_verifying_partner");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88612131494088, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.presenter;
        iSdkDaggerPerContextComponent.read = iSdkDaggerPerContextComponent.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer();
        stopPreview stoppreview = new stopPreview(iSdkDaggerPerContextComponent);
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            stoppreview.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
        }
        CameraSourceParametersHolder cameraSourceParametersHolder = CameraSourceParametersHolder.read;
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cameraSourceParametersHolder.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String string = getString(R.string.ndid_select_idp_terms_cond_message_left);
        String string2 = getString(R.string.ndid_select_idp_terms_cond_message_clickable);
        String string3 = getString(R.string.ndid_select_idp_terms_cond_message_right);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(string2);
        sb.append(string3);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = NdidSelectIdpFragment.this.presenter;
                hasDocumentSampleImage hasdocumentsampleimage = hasDocumentSampleImage.write;
                if (iSdkDaggerPerContextComponent.RatingCompat != null) {
                    hasdocumentsampleimage.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                if (NdidSelectIdpFragment.this.getContext() != null) {
                    textPaint.setColor(setLastBaselineToBottomHeight.read(NdidSelectIdpFragment.this.getContext(), R.color.f67252131099881));
                }
            }
        }, string.length(), string.length() + string2.length(), 33);
        this.agreeTermsConditionTextView.setText(spannableString);
        this.agreeTermsConditionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.agreeTermsConditionTextView.setHighlightColor(0);
    }

    public final void write(List<String> list) {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.idpSpinner;
        customSpinnerWithTitle.IconCompatParcelizer = false;
        if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            customSpinnerWithTitle.spinner.setSelection(0);
        }
        this.idpSpinner.setItems(list, true, false);
        this.idpSpinner.setMandatory(true);
        this.idpSpinner.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                if (NdidSelectIdpFragment.this.idpSpinner.spinner.getSelectedItemPosition() > 0) {
                    ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = NdidSelectIdpFragment.this.presenter;
                    boolean z = true;
                    iSdkDaggerPerContextComponent.IconCompatParcelizer = iSdkDaggerPerContextComponent.read.get(NdidSelectIdpFragment.this.idpSpinner.spinner.getSelectedItemPosition() - 1);
                    setDisplayOrientation setdisplayorientation = new setDisplayOrientation(iSdkDaggerPerContextComponent);
                    if (iSdkDaggerPerContextComponent.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setdisplayorientation.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
                    }
                }
            }
        });
    }

    public final void read(boolean z) {
        this.nextButton.setEnabled(z);
    }

    @OnClick
    public void onNextButtonClick() {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.presenter;
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            iSdkDaggerPerContextComponent.RatingCompat.AlertController$RecycleListView();
        }
        ForwardingTable forwardingTable = new ForwardingTable(iSdkDaggerPerContextComponent.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, iSdkDaggerPerContextComponent.IconCompatParcelizer.IconCompatParcelizer, (String) iSdkDaggerPerContextComponent.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write, (String) iSdkDaggerPerContextComponent.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read, String.valueOf(iSdkDaggerPerContextComponent.IconCompatParcelizer.write), String.valueOf(iSdkDaggerPerContextComponent.IconCompatParcelizer.read));
        FinalizablePhantomReference finalizablePhantomReference = iSdkDaggerPerContextComponent.MediaMetadataCompat;
        finalizablePhantomReference.write(finalizablePhantomReference.write(forwardingTable), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<String>>() {
            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.ISdkDaggerPerContextComponent.4.onNext(java.lang.Object):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ISdkDaggerPerContextComponent.4.onNext(java.lang.Object):void, class status: UNLOADED
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
Method generation error in method: o.ISdkDaggerPerContextComponent.4.onError(java.lang.Throwable):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ISdkDaggerPerContextComponent.4.onError(java.lang.Throwable):void, class status: UNLOADED
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

    @OnCheckedChanged
    public void onConsentChecked(boolean z) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.presenter;
        iSdkDaggerPerContextComponent.write = z;
        C9869bm bmVar = new C9869bm(iSdkDaggerPerContextComponent, z);
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            bmVar.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
        }
    }

    @OnCheckedChanged
    public void onTermsCondChecked(boolean z) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.presenter;
        iSdkDaggerPerContextComponent.MediaBrowserCompat$SearchResultReceiver = z;
        cancelAutoFocus cancelautofocus = new cancelAutoFocus(iSdkDaggerPerContextComponent, z);
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            cancelautofocus.IconCompatParcelizer(iSdkDaggerPerContextComponent.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(List<String> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(list);
    }

    public final void read() {
        try {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("th".equals(setStackedBackground()) ? "https://info.scb.co.th/scbeasy/NDID/NDID_TC_thai.html" : "https://info.scb.co.th/scbeasy/NDID/NDID_TC_eng.html"));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    data = setTapText.write(activity, data).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(data.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(data);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
