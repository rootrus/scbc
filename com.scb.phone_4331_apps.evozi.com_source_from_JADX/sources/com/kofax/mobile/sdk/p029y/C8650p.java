package com.kofax.mobile.sdk.p029y;

import com.kofax.BuildConfig;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionResult;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.p030z.C1012a;
import p040o.HmlPinActivity;
import p040o.PrepaidDetailsActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.y.p */
public class C8650p implements IIdExtractor {

    /* renamed from: St */
    private final IIdExtractor f5344St;
    /* access modifiers changed from: private */

    /* renamed from: Su */
    public final PrepaidDetailsActivity_ViewBinding f5345Su = new PrepaidDetailsActivity_ViewBinding();

    @HmlPinActivity
    public C8650p(@C1012a IIdExtractor iIdExtractor) {
        this.f5344St = iIdExtractor;
    }

    public void extractFields(final IdExtractionParameters idExtractionParameters) {
        C0767k.m1801b(BuildConfig.TIMING_TAG, "Entering extraction...");
        this.f5344St.extractFields(new IdExtractionParameters(idExtractionParameters.getProjectName(), idExtractionParameters.getIdType(), idExtractionParameters.getFrontImage(), idExtractionParameters.getFrontBarcodes(), idExtractionParameters.getBackImage(), idExtractionParameters.getBackBarcodes(), idExtractionParameters.isProcessed(), idExtractionParameters.getExtractFaceImage(), idExtractionParameters.getExtractSignatureImage(), new IIdExtractionListener() {
            public void onExtractionComplete(IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
                StringBuilder sb = new StringBuilder();
                sb.append("IIdExtractor.extractFields(");
                sb.append(idExtractionParameters.getProjectName());
                sb.append(", ");
                String str = "<null>, ";
                sb.append(idExtractionParameters.getFrontImage() != null ? "<image>, " : str);
                if (idExtractionParameters.getBackImage() != null) {
                    str = "<image>, ";
                }
                sb.append(str);
                sb.append(idExtractionParameters.getListener() != null ? "<listener>): " : "<null>): ");
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(C8650p.this.f5345Su.toString());
                C0767k.m1801b(BuildConfig.TIMING_TAG, sb2.toString());
                C0767k.m1801b(BuildConfig.TIMING_TAG, "Extraction complete.");
                if (idExtractionParameters.getListener() != null) {
                    idExtractionParameters.getListener().onExtractionComplete(iIdExtractionResult, aggregateException);
                }
                C8650p.this.f5345Su.write = PrepaidDetailsActivity_ViewBinding.write.UNSTARTED;
                PrepaidDetailsActivity_ViewBinding.read read = PrepaidDetailsActivity_ViewBinding.read.UNSPLIT;
            }
        }, idExtractionParameters.getImageProcessingListener()));
        this.f5345Su.write = PrepaidDetailsActivity_ViewBinding.write.UNSTARTED;
        PrepaidDetailsActivity_ViewBinding.read read = PrepaidDetailsActivity_ViewBinding.read.UNSPLIT;
        this.f5345Su.IconCompatParcelizer();
    }

    public void cancel() {
        this.f5345Su.write = PrepaidDetailsActivity_ViewBinding.write.UNSTARTED;
        PrepaidDetailsActivity_ViewBinding.read read = PrepaidDetailsActivity_ViewBinding.read.UNSPLIT;
        this.f5344St.cancel();
    }
}
