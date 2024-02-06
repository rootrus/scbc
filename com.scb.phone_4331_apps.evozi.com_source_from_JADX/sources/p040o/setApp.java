package p040o;

import java.util.List;

/* renamed from: o.setApp */
public final class setApp extends setGenerator {
    public final List<setGenerator> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setApp(PlacePhotoMetadataResult placePhotoMetadataResult, List<? extends setGenerator> list, int i) {
        super(placePhotoMetadataResult, i);
        onGetStartedClick.write((Object) placePhotoMetadataResult, "tile");
        onGetStartedClick.write((Object) list, "tiles");
        this.write = list;
    }
}
