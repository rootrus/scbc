package p040o;

import java.net.URI;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: o.FragmentBuilder_BindHmlNTBManageEmailVerificationFragment */
public final class FragmentBuilder_BindHmlNTBManageEmailVerificationFragment {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final URI MediaBrowserCompat$ItemReceiver;
    public final URI MediaBrowserCompat$MediaItem;
    public final String MediaDescriptionCompat;
    public final FragmentBuilder_BindHmlNTBAccountConsentFragment read;
    public final String write;

    private FragmentBuilder_BindHmlNTBManageEmailVerificationFragment(String str, URI uri, URI uri2, String str2, String str3, String str4, FragmentBuilder_BindHmlNTBAccountConsentFragment fragmentBuilder_BindHmlNTBAccountConsentFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = uri;
        this.MediaBrowserCompat$ItemReceiver = uri2;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.MediaDescriptionCompat = str4;
        this.read = fragmentBuilder_BindHmlNTBAccountConsentFragment;
    }

    public /* synthetic */ FragmentBuilder_BindHmlNTBManageEmailVerificationFragment(String str, URI uri, URI uri2, String str2, String str3, String str4, FragmentBuilder_BindHmlNTBAccountConsentFragment fragmentBuilder_BindHmlNTBAccountConsentFragment, byte b) {
        this(str, uri, uri2, str2, str3, str4, fragmentBuilder_BindHmlNTBAccountConsentFragment);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            OneConfiguration(\n                siteKey='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("',\n                touchpoint='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append("',\n                host='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("',\n                apiKey='");
        sb.append(this.write);
        sb.append("',\n                sharedSecret='");
        sb.append(this.IconCompatParcelizer);
        sb.append("',\n                userId='");
        sb.append(this.MediaDescriptionCompat);
        sb.append("',\n                mode='");
        sb.append(this.read);
        sb.append("'\n            )\n        ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FragmentBuilder_BindHmlNTBManageEmailVerificationFragment) {
            FragmentBuilder_BindHmlNTBManageEmailVerificationFragment fragmentBuilder_BindHmlNTBManageEmailVerificationFragment = (FragmentBuilder_BindHmlNTBManageEmailVerificationFragment) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaDescriptionCompat) && this.read == fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment.MediaBrowserCompat$MediaItem);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.write, this.IconCompatParcelizer, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompat$MediaItem});
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBManageEmailVerificationFragment$write */
    public static final class write implements Callable {
        private final /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        public write(FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
        }

        public final /* synthetic */ Object call() {
            return this.MediaBrowserCompat$ItemReceiver.invoke();
        }
    }
}
