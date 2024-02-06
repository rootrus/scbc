package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.landing.EasycashBaseLandingFragment;

/* renamed from: o.postRegisterNewPin */
public final /* synthetic */ class postRegisterNewPin implements View.OnClickListener {
    private final /* synthetic */ EasycashBaseLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getCpuArchitectureInt write;

    public /* synthetic */ postRegisterNewPin(EasycashBaseLandingFragment easycashBaseLandingFragment, getCpuArchitectureInt getcpuarchitectureint) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashBaseLandingFragment;
        this.write = getcpuarchitectureint;
    }

    public final void onClick(View view) {
        EasycashBaseLandingFragment easycashBaseLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        easycashBaseLandingFragment.MediaBrowserCompat$CustomActionResultReceiver.read(this.write);
    }
}
