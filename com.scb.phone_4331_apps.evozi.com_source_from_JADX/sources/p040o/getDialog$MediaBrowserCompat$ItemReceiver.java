package p040o;

import android.animation.TypeEvaluator;

/* renamed from: o.getDialog$MediaBrowserCompat$ItemReceiver */
class getDialog$MediaBrowserCompat$ItemReceiver implements TypeEvaluator<ButtonBarLayout$MediaBrowserCompat$ItemReceiver[]> {
    private ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] IconCompatParcelizer;

    getDialog$MediaBrowserCompat$ItemReceiver() {
    }

    /* renamed from: write */
    public ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] evaluate(float f, ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr, ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2) {
        if (ButtonBarLayout.MediaBrowserCompat$CustomActionResultReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr, buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2)) {
            ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr3 = this.IconCompatParcelizer;
            if (buttonBarLayout$MediaBrowserCompat$ItemReceiverArr3 == null || !ButtonBarLayout.MediaBrowserCompat$CustomActionResultReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr3, buttonBarLayout$MediaBrowserCompat$ItemReceiverArr)) {
                this.IconCompatParcelizer = ButtonBarLayout.MediaBrowserCompat$ItemReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr);
            }
            for (int i = 0; i < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length; i++) {
                ButtonBarLayout$MediaBrowserCompat$ItemReceiver buttonBarLayout$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer[i];
                ButtonBarLayout$MediaBrowserCompat$ItemReceiver buttonBarLayout$MediaBrowserCompat$ItemReceiver2 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i];
                ButtonBarLayout$MediaBrowserCompat$ItemReceiver buttonBarLayout$MediaBrowserCompat$ItemReceiver3 = buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i];
                int i2 = 0;
                while (true) {
                    float[] fArr = buttonBarLayout$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    buttonBarLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver[i2] = (fArr[i2] * (1.0f - f)) + (buttonBarLayout$MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$ItemReceiver[i2] * f);
                    i2++;
                }
            }
            return this.IconCompatParcelizer;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
