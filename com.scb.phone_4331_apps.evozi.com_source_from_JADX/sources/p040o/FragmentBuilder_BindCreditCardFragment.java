package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.EkycService;

/* renamed from: o.FragmentBuilder_BindCreditCardFragment */
public final class FragmentBuilder_BindCreditCardFragment extends RecyclerView.ParcelableVolumeInfo implements EkycService {
    private final setStatusBarBackgroundColor IconCompatParcelizer;
    private C6489x271d6c26 MediaBrowserCompat$CustomActionResultReceiver;
    private IconCompatParcelizer read;
    private int write = -1;

    /* renamed from: o.FragmentBuilder_BindCreditCardFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void read(int i);
    }

    public FragmentBuilder_BindCreditCardFragment(setStatusBarBackgroundColor setstatusbarbackgroundcolor, C6489x271d6c26 fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) setstatusbarbackgroundcolor, "snapHelper");
        onGetStartedClick.write((Object) fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, "behavior");
        this.IconCompatParcelizer = setstatusbarbackgroundcolor;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver;
        this.read = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        if (this.MediaBrowserCompat$CustomActionResultReceiver == C6489x271d6c26.NOTIFY_ON_SCROLL) {
            MediaBrowserCompat$CustomActionResultReceiver(recyclerView);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        if (this.MediaBrowserCompat$CustomActionResultReceiver == C6489x271d6c26.NOTIFY_ON_SCROLL_STATE_IDLE && i == 0) {
            MediaBrowserCompat$CustomActionResultReceiver(recyclerView);
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView) {
        setStatusBarBackgroundColor setstatusbarbackgroundcolor = this.IconCompatParcelizer;
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        onGetStartedClick.write((Object) setstatusbarbackgroundcolor, "helper");
        int IconCompatParcelizer2 = EkycService.read.IconCompatParcelizer(recyclerView, setstatusbarbackgroundcolor);
        if (this.write != IconCompatParcelizer2) {
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read(IconCompatParcelizer2);
            }
            this.write = IconCompatParcelizer2;
        }
    }
}
