package p040o;

import com.scb.phone.view.custom.login.CustomPinTextInput;

/* renamed from: o.getOrderChequeLanding */
public final /* synthetic */ class getOrderChequeLanding implements Runnable {
    private final /* synthetic */ CustomPinTextInput IconCompatParcelizer;

    public /* synthetic */ getOrderChequeLanding(CustomPinTextInput customPinTextInput) {
        this.IconCompatParcelizer = customPinTextInput;
    }

    public final void run() {
        CustomPinTextInput customPinTextInput = this.IconCompatParcelizer;
        customPinTextInput.read.MediaBrowserCompat$CustomActionResultReceiver(customPinTextInput.IconCompatParcelizer.toString());
    }
}
