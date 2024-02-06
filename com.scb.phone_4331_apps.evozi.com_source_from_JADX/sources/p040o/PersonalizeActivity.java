package p040o;

import java.util.Arrays;

/* renamed from: o.PersonalizeActivity */
public final class PersonalizeActivity {
    public boolean IconCompatParcelizer;
    public final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    public PersonalizeActivity MediaBrowserCompat$ItemReceiver;
    public boolean MediaDescriptionCompat;
    public PersonalizeActivity MediaMetadataCompat;
    public int read;
    public int write;

    public PersonalizeActivity() {
        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[8192];
        this.IconCompatParcelizer = true;
        this.MediaDescriptionCompat = false;
    }

    public PersonalizeActivity(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        onGetStartedClick.write((Object) bArr, "data");
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
        this.read = i;
        this.write = i2;
        this.MediaDescriptionCompat = z;
        this.IconCompatParcelizer = z2;
    }

    public final PersonalizeActivity IconCompatParcelizer() {
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return new PersonalizeActivity(copyOf, this.read, this.write, false, true);
    }

    public final PersonalizeActivity read() {
        PersonalizeActivity personalizeActivity = this.MediaBrowserCompat$ItemReceiver;
        if (personalizeActivity == this) {
            personalizeActivity = null;
        }
        PersonalizeActivity personalizeActivity2 = this.MediaMetadataCompat;
        if (personalizeActivity2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        personalizeActivity2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        PersonalizeActivity personalizeActivity3 = this.MediaBrowserCompat$ItemReceiver;
        if (personalizeActivity3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        personalizeActivity3.MediaMetadataCompat = this.MediaMetadataCompat;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaMetadataCompat = null;
        return personalizeActivity;
    }

    public final PersonalizeActivity IconCompatParcelizer(PersonalizeActivity personalizeActivity) {
        onGetStartedClick.write((Object) personalizeActivity, "segment");
        personalizeActivity.MediaMetadataCompat = this;
        personalizeActivity.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        PersonalizeActivity personalizeActivity2 = this.MediaBrowserCompat$ItemReceiver;
        if (personalizeActivity2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        personalizeActivity2.MediaMetadataCompat = personalizeActivity;
        this.MediaBrowserCompat$ItemReceiver = personalizeActivity;
        return personalizeActivity;
    }

    public final void IconCompatParcelizer(PersonalizeActivity personalizeActivity, int i) {
        onGetStartedClick.write((Object) personalizeActivity, "sink");
        if (personalizeActivity.IconCompatParcelizer) {
            int i2 = personalizeActivity.write;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!personalizeActivity.MediaDescriptionCompat) {
                    int i4 = personalizeActivity.read;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) bArr, "src");
                        onGetStartedClick.write((Object) bArr, "dest");
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        personalizeActivity.write -= personalizeActivity.read;
                        personalizeActivity.read = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i5 = this.read;
            byte[] bArr3 = personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver;
            int i6 = personalizeActivity.write;
            onGetStartedClick.write((Object) bArr2, "src");
            onGetStartedClick.write((Object) bArr3, "dest");
            System.arraycopy(bArr2, i5, bArr3, i6, i);
            personalizeActivity.write += i;
            this.read += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    /* renamed from: o.PersonalizeActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public String read;
        public readStringList write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(int i, String str, String str2, readStringList readstringlist) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = readstringlist;
        }
    }
}
