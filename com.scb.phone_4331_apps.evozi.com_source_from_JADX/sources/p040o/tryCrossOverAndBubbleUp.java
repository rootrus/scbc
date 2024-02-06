package p040o;

/* renamed from: o.tryCrossOverAndBubbleUp */
public final class tryCrossOverAndBubbleUp {

    @HmlSetNTBPinActivity
    /* renamed from: o.tryCrossOverAndBubbleUp$write */
    public static final class write {
        private write() {
        }

        @HmlPinActivity
        public write(FragmentBuilder_BindUnlinkAccountFragment fragmentBuilder_BindUnlinkAccountFragment) {
            onGetStartedClick.write((Object) fragmentBuilder_BindUnlinkAccountFragment, "cardInfoMapper");
        }
    }

    public static String read(String str, String str2) {
        onGetStartedClick.write((Object) str2, "replacement");
        if (str == null) {
            return str;
        }
        CharSequence charSequence = str;
        return (GoodToKnowActivity.read(charSequence, "\n", false) || str.length() != 16) ? str : new LifestyleCustomizationActivity("\\b([0-9]{4})([0-9]{2})[0-9xX]{6}([0-9]{4})\\b").IconCompatParcelizer(charSequence, str2);
    }
}
