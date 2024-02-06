package com.pdfview;

import android.content.Context;
import android.util.AttributeSet;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.io.File;
import p040o.DSPMV;
import p040o.IdWorkflowActivity;
import p040o.getKeepAlive$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class PDFView extends SubsamplingScaleImageView {
    public File MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public float write;

    public PDFView(Context context) {
        this(context, (byte) 0);
    }

    private /* synthetic */ PDFView(Context context, byte b) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        this.write = 8.0f;
        setMinimumTileDpi(120);
        setMinimumScaleType(4);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static final class write<T> implements DSPMV<IdWorkflowActivity.C69161> {
        private /* synthetic */ PDFView IconCompatParcelizer;

        public write(PDFView pDFView) {
            this.IconCompatParcelizer = pDFView;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver() {
            PDFView pDFView = this.IconCompatParcelizer;
            File write = pDFView.MediaBrowserCompat$CustomActionResultReceiver;
            if (write == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return new getKeepAlive$MediaBrowserCompat$ItemReceiver(pDFView, write, this.IconCompatParcelizer.write);
        }
    }
}
