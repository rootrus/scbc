package okhttp3.internal;

import p040o.FundActionsSuccessActivity;
import p040o.onGetStartedClick;

public final class Util$execute$1 implements Runnable {
    final /* synthetic */ FundActionsSuccessActivity $block;
    final /* synthetic */ String $name;

    public Util$execute$1(String str, FundActionsSuccessActivity fundActionsSuccessActivity) {
        this.$name = str;
        this.$block = fundActionsSuccessActivity;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.$block.invoke();
        } finally {
            currentThread.setName(name);
        }
    }
}
