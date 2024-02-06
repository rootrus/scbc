package p040o;

import java.nio.charset.StandardCharsets;
import p040o.RenderScript;

/* renamed from: o.filterByAuthorizedAccounts */
public final class filterByAuthorizedAccounts extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.filterByAuthorizedAccounts$read */
    public static final class read {
        public final String IconCompatParcelizer;
        public rsnIncContextFinish MediaBrowserCompat$CustomActionResultReceiver;
        public rsnIncContextFinish MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;
        public RenderScript.ContextType MediaDescriptionCompat;
        public sendMessage MediaMetadataCompat;
        public int read;
        public final StringBuilder write;

        private read() {
        }

        public read(String str) {
            byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
            StringBuilder sb = new StringBuilder(bytes.length);
            int length = bytes.length;
            int i = 0;
            while (i < length) {
                char c = (char) (bytes[i] & 255);
                if (c != '?' || str.charAt(i) == '?') {
                    sb.append(c);
                    i++;
                } else {
                    throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
                }
            }
            this.IconCompatParcelizer = sb.toString();
            this.MediaDescriptionCompat = RenderScript.ContextType.FORCE_NONE;
            this.write = new StringBuilder(str.length());
            this.read = -1;
        }

        public final void read(int i) {
            sendMessage sendmessage = this.MediaMetadataCompat;
            if (sendmessage == null || i > sendmessage.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaMetadataCompat = sendMessage.MediaBrowserCompat$CustomActionResultReceiver(i, this.MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
