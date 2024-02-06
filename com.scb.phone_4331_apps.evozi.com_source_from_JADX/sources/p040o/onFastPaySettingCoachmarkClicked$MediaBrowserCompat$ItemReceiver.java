package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AbstractMultimap;

/* renamed from: o.onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver */
public final class onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver implements AbstractMultimap.AsMap {
    private final FragmentBuilder_BindSentFragment MediaBrowserCompat$CustomActionResultReceiver;

    private onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSentFragment fragmentBuilder_BindSentFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindSentFragment, "stickyParamCache");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSentFragment;
    }

    public final List<inject_base64Decoder> MediaBrowserCompat$ItemReceiver() {
        List<? extends inject_base64Decoder> list = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        return list == null ? HmlNationalIdActivity.IconCompatParcelizer : list;
    }

    public final void read(inject_base64Decoder inject_base64decoder) {
        List<? extends inject_base64Decoder> list;
        onGetStartedClick.write((Object) inject_base64decoder, "param");
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
        }
        List<? extends inject_base64Decoder> list2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            Collection collection = list2;
            onGetStartedClick.write((Object) collection, "$this$toMutableList");
            list = new ArrayList<>(collection);
        } else {
            list = null;
        }
        if (list != null) {
            list.add(inject_base64decoder);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void read(List<? extends inject_base64Decoder> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
