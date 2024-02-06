package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.PassportDetector_Factory */
public final /* synthetic */ class PassportDetector_Factory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ convertMemInfoToBytes read;
    private final /* synthetic */ getSymbolsFound write;

    public /* synthetic */ PassportDetector_Factory(getSymbolsFound getsymbolsfound, convertMemInfoToBytes convertmeminfotobytes) {
        this.write = getsymbolsfound;
        this.read = convertmeminfotobytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getSymbolsFound getsymbolsfound = this.write;
        convertMemInfoToBytes convertmeminfotobytes = this.read;
        CheckExtractActivity_MembersInjector.setGroupDividerEnabled setgroupdividerenabled = (CheckExtractActivity_MembersInjector.setGroupDividerEnabled) obj;
        if (getsymbolsfound.read.IconCompatParcelizer.setCheckable().equals("th")) {
            str = convertmeminfotobytes.IconCompatParcelizer;
        } else {
            str = convertmeminfotobytes.MediaBrowserCompat$ItemReceiver;
        }
        setgroupdividerenabled.read(str);
    }
}
