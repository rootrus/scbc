package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.onClickRetry */
public final class onClickRetry extends HmlNTBSelectAccountActivity implements closePinLocation<String> {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    final long MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onClickRetry) && this.MediaBrowserCompat$CustomActionResultReceiver == ((onClickRetry) obj).MediaBrowserCompat$CustomActionResultReceiver;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (int) (j ^ (j >>> 32));
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        String str;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onTakePhotoClickBeforeCheck ontakephotoclickbeforecheck = (onTakePhotoClickBeforeCheck) hmlPromptPayVerificationActivity.IconCompatParcelizer(onTakePhotoClickBeforeCheck.IconCompatParcelizer);
        if (ontakephotoclickbeforecheck == null || (str = ontakephotoclickbeforecheck.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        onGetStartedClick.IconCompatParcelizer((Object) name, "oldName");
        CharSequence charSequence = name;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, " @", charSequence.length() - 1, false);
        if (IconCompatParcelizer2 < 0) {
            IconCompatParcelizer2 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + IconCompatParcelizer2 + 10);
        String substring = name.substring(0, IconCompatParcelizer2);
        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(obj);
        return name;
    }

    public final /* synthetic */ void write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) str, "oldState");
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    /* renamed from: o.onClickRetry$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<onClickRetry> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public onClickRetry(long j) {
        super(IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }

    public final <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlPromptPayVerificationActivity.IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        return baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(r, this);
    }

    public final <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        E e = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) e.MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver)) {
            return null;
        }
        return e;
    }

    public final HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);
        Object obj = iconCompatParcelizer;
        if (MediaBrowserCompat$ItemReceiver) {
            obj = HmlPromptPayAboutActivity.IconCompatParcelizer;
        }
        return (HmlPromptPayVerificationActivity) obj;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity2 = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return hmlPromptPayVerificationActivity != HmlPromptPayAboutActivity.IconCompatParcelizer ? (HmlPromptPayVerificationActivity) hmlPromptPayVerificationActivity.read(hmlPromptPayVerificationActivity2, C6894x2375c6f.write) : hmlPromptPayVerificationActivity2;
    }
}
