package p040o;

/* renamed from: o.PersonalLimitActivity */
public final class PersonalLimitActivity {
    private static long IconCompatParcelizer;
    private static PersonalizeActivity MediaBrowserCompat$ItemReceiver;
    private static PersonalLimitActivity read = new PersonalLimitActivity();

    private PersonalLimitActivity() {
    }

    public static final PersonalizeActivity read() {
        synchronized (read) {
            PersonalizeActivity personalizeActivity = MediaBrowserCompat$ItemReceiver;
            if (personalizeActivity == null) {
                return new PersonalizeActivity();
            }
            MediaBrowserCompat$ItemReceiver = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            personalizeActivity.MediaBrowserCompat$ItemReceiver = null;
            IconCompatParcelizer -= 8192;
            return personalizeActivity;
        }
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(PersonalizeActivity personalizeActivity) {
        onGetStartedClick.write((Object) personalizeActivity, "segment");
        if (!(personalizeActivity.MediaBrowserCompat$ItemReceiver == null && personalizeActivity.MediaMetadataCompat == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!personalizeActivity.MediaDescriptionCompat) {
            synchronized (read) {
                if (IconCompatParcelizer + 8192 <= 65536) {
                    IconCompatParcelizer += 8192;
                    personalizeActivity.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver;
                    personalizeActivity.write = 0;
                    personalizeActivity.read = personalizeActivity.write;
                    MediaBrowserCompat$ItemReceiver = personalizeActivity;
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
        }
    }
}
