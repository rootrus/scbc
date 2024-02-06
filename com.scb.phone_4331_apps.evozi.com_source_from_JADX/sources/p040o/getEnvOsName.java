package p040o;

import p040o.TransformedImmutableList;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvOsName */
public final /* synthetic */ class getEnvOsName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ SupportPlaceAutocompleteFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getEnvOsName(getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver getenvtimezone_mediabrowsercompat_customactionresultreceiver, SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment) {
        this.IconCompatParcelizer = getenvtimezone_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = supportPlaceAutocompleteFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver getenvtimezone_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        TransformedImmutableList.TransformedView unused = getenvtimezone_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.read;
        ((CheckWorkflowActivity_MembersInjector) obj).read(TransformedImmutableList.TransformedView.MediaBrowserCompat$ItemReceiver(supportPlaceAutocompleteFragment));
    }
}
