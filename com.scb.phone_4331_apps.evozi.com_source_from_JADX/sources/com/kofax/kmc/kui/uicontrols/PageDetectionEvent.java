package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.EventObject;
import p040o.HmlReviewDocumentActivity;

public class PageDetectionEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: J */
    private final BoundingTetragon f3531J;

    /* renamed from: me */
    private final HmlReviewDocumentActivity<Bitmap> f3532me;

    public PageDetectionEvent(Object obj, Bitmap bitmap, BoundingTetragon boundingTetragon) {
        this(obj, (HmlReviewDocumentActivity<Bitmap>) new C7882a(bitmap), boundingTetragon);
    }

    public PageDetectionEvent(Object obj, HmlReviewDocumentActivity<Bitmap> hmlReviewDocumentActivity, BoundingTetragon boundingTetragon) {
        super(obj);
        this.f3532me = hmlReviewDocumentActivity;
        this.f3531J = boundingTetragon;
    }

    public final Bitmap getPreviewImage() {
        return this.f3532me.get();
    }

    public final BoundingTetragon getBound() {
        return this.f3531J;
    }

    /* renamed from: com.kofax.kmc.kui.uicontrols.PageDetectionEvent$a */
    static class C7882a implements HmlReviewDocumentActivity<Bitmap> {
        private final Bitmap _bitmap;

        private C7882a(Bitmap bitmap) {
            this._bitmap = bitmap;
        }

        /* renamed from: aE */
        public Bitmap get() {
            return this._bitmap;
        }
    }
}
