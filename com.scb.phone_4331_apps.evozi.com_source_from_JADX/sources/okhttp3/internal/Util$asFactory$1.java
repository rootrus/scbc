package okhttp3.internal;

import okhttp3.Call;
import okhttp3.EventListener;
import p040o.onGetStartedClick;

public final class Util$asFactory$1 implements EventListener.Factory {
    final /* synthetic */ EventListener $this_asFactory;

    Util$asFactory$1(EventListener eventListener) {
        this.$this_asFactory = eventListener;
    }

    public final EventListener create(Call call) {
        onGetStartedClick.write((Object) call, "call");
        return this.$this_asFactory;
    }
}
