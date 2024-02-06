package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p024l.C0967f;
import p040o.HmlPinActivity;

public class DocumentCaptureExperience extends DocumentBaseCaptureExperience {
    private static final String TAG = DocumentCaptureExperience.class.getSimpleName();

    /* renamed from: nd */
    private DocumentCaptureExperienceCriteriaHolder f695nd;
    @HmlPinActivity

    /* renamed from: ne */
    C0967f f696ne;

    public DocumentCaptureExperience(ImageCaptureView imageCaptureView) {
        this(imageCaptureView, m509a((DocumentCaptureExperienceCriteriaHolder) null), false);
    }

    public DocumentCaptureExperience(ImageCaptureView imageCaptureView, DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder) {
        this(imageCaptureView, m509a(documentCaptureExperienceCriteriaHolder), true);
    }

    /* renamed from: a */
    private static DocumentCaptureExperienceCriteriaHolder m509a(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder) {
        return documentCaptureExperienceCriteriaHolder != null ? documentCaptureExperienceCriteriaHolder : new DocumentCaptureExperienceCriteriaHolder();
    }

    private DocumentCaptureExperience(ImageCaptureView imageCaptureView, DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder, boolean z) {
        super(imageCaptureView, documentCaptureExperienceCriteriaHolder);
        Injector.getInjector(this._ctx.getApplicationContext()).injectMembers(this);
        initBase(imageCaptureView, this.f696ne, documentCaptureExperienceCriteriaHolder);
        m510a(documentCaptureExperienceCriteriaHolder, z);
    }

    public void setCaptureCriteria(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder) {
        m510a(documentCaptureExperienceCriteriaHolder, true);
    }

    /* renamed from: a */
    private void m510a(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder, boolean z) {
        if (documentCaptureExperienceCriteriaHolder != null) {
            DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder2 = new DocumentCaptureExperienceCriteriaHolder(documentCaptureExperienceCriteriaHolder);
            this.f695nd = documentCaptureExperienceCriteriaHolder2;
            super.mo10747a(documentCaptureExperienceCriteriaHolder2);
            this.f696ne.mo12370c(this.f695nd.getDetectionSettings());
            if (!this._captureController.hasDocumentSampleImage() && z) {
                m511c(this._ctx);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public DocumentCaptureExperienceCriteriaHolder getCaptureCriteria() {
        return new DocumentCaptureExperienceCriteriaHolder(this.f695nd);
    }

    /* renamed from: c */
    private void m511c(Context context) {
        setDocumentSampleImage(C0859c.m2231a(context, "document_sample"));
    }
}
