package p040o;

import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.FragmentBuilder_BindHmlDocumentSubmissionFragment */
public final class FragmentBuilder_BindHmlDocumentSubmissionFragment implements FragmentBuilder_BindHmlDocumentUploadFragment {
    private Map<String, InteractionRegionResponse> IconCompatParcelizer = new HashMap();

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, InteractionRegionResponse interactionRegionResponse) {
        this.IconCompatParcelizer.put(str, interactionRegionResponse);
    }

    public final InteractionRegionResponse MediaBrowserCompat$ItemReceiver(String str) {
        return this.IconCompatParcelizer.get(str);
    }

    public final void read() {
        this.IconCompatParcelizer.clear();
    }
}
