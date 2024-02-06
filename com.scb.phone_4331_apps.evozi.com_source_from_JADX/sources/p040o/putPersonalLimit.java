package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;

/* renamed from: o.putPersonalLimit */
public final /* synthetic */ class putPersonalLimit implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomDeltaSlider write;

    public /* synthetic */ putPersonalLimit(CustomDeltaSlider customDeltaSlider, int i) {
        this.write = customDeltaSlider;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
