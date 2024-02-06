package p040o;

import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;

/* renamed from: o.FragmentBuilder_BindHmlNTBAccountSetupFragment */
public final class FragmentBuilder_BindHmlNTBAccountSetupFragment implements FragmentBuilder_BindHmlLandingFragment {
    private OptimizationActions.Action.Asset.Response MediaBrowserCompat$CustomActionResultReceiver;
    private loadInBackground read;

    public FragmentBuilder_BindHmlNTBAccountSetupFragment(OptimizationActions.Action.Asset.Response response, loadInBackground loadinbackground) {
        this.MediaBrowserCompat$CustomActionResultReceiver = response;
        this.read = loadinbackground;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getCode();
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getLabel();
    }

    public final String write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getSentiment();
    }

    public final C6552xadbb583e MediaBrowserCompat$ItemReceiver() {
        return C6552xadbb583e.read(this.MediaBrowserCompat$CustomActionResultReceiver.getSentiment());
    }

    public final String read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getTarget();
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getTargetUrl();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptimizationResponseImpl{responseObject=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sender=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
