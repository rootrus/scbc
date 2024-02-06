package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.inject_adapter */
final class inject_adapter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FundFactSheetActivity write;

    inject_adapter(FundFactSheetActivity fundFactSheetActivity) {
        this.write = fundFactSheetActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        onGetStartedClick.IconCompatParcelizer(this.write.invoke(obj), "invoke(...)");
    }
}
