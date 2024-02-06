package p040o;

import com.scb.phone.view.activity.easycash.EasycashAdditionalDocumentTypeActivity;
import p040o.ImageProcessor;

/* renamed from: o.pF */
public final class C7344pF implements MileageQuantitySelectionActivity<EasycashAdditionalDocumentTypeActivity> {
    public static void write(EasycashAdditionalDocumentTypeActivity easycashAdditionalDocumentTypeActivity, ImageProcessor.ProcessProgressListener processProgressListener) {
        easycashAdditionalDocumentTypeActivity.documentTypePresenter = processProgressListener;
    }
}
