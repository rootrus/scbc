package p040o;

import java.util.List;

/* renamed from: o.getStream */
public final class getStream extends CLSUUID {
    public final List<getBatteryLevel> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getStream(Boolean bool, String str, List<getBatteryLevel> list) {
        super(bool, str);
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) list, "accountDisplays");
        this.write = list;
    }
}
