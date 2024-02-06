package p040o;

/* renamed from: o.onTakePhotoClickBeforeCheck */
public final class onTakePhotoClickBeforeCheck extends HmlNTBSelectAccountActivity {
    public static final write IconCompatParcelizer = new write((byte) 0);
    final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onTakePhotoClickBeforeCheck) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((onTakePhotoClickBeforeCheck) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onTakePhotoClickBeforeCheck(String str) {
        super(IconCompatParcelizer);
        onGetStartedClick.write((Object) str, "name");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    /* renamed from: o.onTakePhotoClickBeforeCheck$write */
    public static final class write implements HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<onTakePhotoClickBeforeCheck> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }
}
