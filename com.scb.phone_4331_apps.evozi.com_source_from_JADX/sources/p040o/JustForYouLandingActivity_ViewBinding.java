package p040o;

/* renamed from: o.JustForYouLandingActivity_ViewBinding */
public class JustForYouLandingActivity_ViewBinding {
    public static final <T> void IconCompatParcelizer(Appendable appendable, T t, FundFactSheetActivity<? super T, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) appendable, "$this$appendElement");
        if (fundFactSheetActivity != null) {
            appendable.append((CharSequence) fundFactSheetActivity.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
