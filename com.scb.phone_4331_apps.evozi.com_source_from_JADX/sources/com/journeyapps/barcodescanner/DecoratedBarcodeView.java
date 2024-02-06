package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import p040o.rsnScriptInvokeV;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$MediaItem;

public class DecoratedBarcodeView extends FrameLayout {
    private TextView IconCompatParcelizer;
    public BarcodeView read;
    /* access modifiers changed from: private */
    public ViewfinderView write;

    public interface write {
    }

    public void setTorchListener(write write2) {
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        write((AttributeSet) null);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        write(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        write(attributeSet);
    }

    private void write(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(rsnScriptInvokeV$MediaBrowserCompat$MediaItem.zxing_view_zxing_scanner_layout, rsnScriptInvokeV.write.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_barcode_surface);
        this.read = barcodeView;
        if (barcodeView != null) {
            barcodeView.MediaBrowserCompat$CustomActionResultReceiver(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_viewfinder_view);
            this.write = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.read);
                this.IconCompatParcelizer = (TextView) findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void setStatusText(String str) {
        TextView textView = this.IconCompatParcelizer;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchOn() {
        this.read.setTorch(true);
    }

    public void setTorchOff() {
        this.read.setTorch(false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        } else if (i == 25) {
            setTorchOff();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }
}
