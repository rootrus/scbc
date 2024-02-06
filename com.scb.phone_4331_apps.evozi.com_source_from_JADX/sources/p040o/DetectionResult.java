package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.DetectionResult */
public final /* synthetic */ class DetectionResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.FileIOEngine write;

    public /* synthetic */ DetectionResult(Image.FileIOEngine fileIOEngine) {
        this.write = fileIOEngine;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.FileIOEngine fileIOEngine = this.write;
        CheckExtractActivity_MembersInjector.setPopupCallback setpopupcallback = (CheckExtractActivity_MembersInjector.setPopupCallback) obj;
        String str = fileIOEngine.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            String str2 = fileIOEngine.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(str2 == null || str2.length() == 0)) {
                String str3 = fileIOEngine.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
                if (!(str3 == null || str3.length() == 0)) {
                    String str4 = fileIOEngine.MediaDescriptionCompat.read;
                    if (!(str4 == null || str4.length() == 0) && getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str4).doubleValue() >= fileIOEngine.IconCompatParcelizer.doubleValue()) {
                        String str5 = fileIOEngine.MediaDescriptionCompat.IconCompatParcelizer.read;
                        if (!(str5 == null || str5.length() == 0)) {
                            String str6 = fileIOEngine.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                            if (!(str6 == null || str6.length() == 0)) {
                                String str7 = fileIOEngine.MediaDescriptionCompat.write.MediaBrowserCompat$CustomActionResultReceiver;
                                if (!(str7 == null || str7.length() == 0)) {
                                    String str8 = fileIOEngine.MediaDescriptionCompat.write.MediaBrowserCompat$ItemReceiver;
                                    if (!(str8 == null || str8.length() == 0)) {
                                        String str9 = fileIOEngine.MediaDescriptionCompat.write.write;
                                        if (!(str9 == null || str9.length() == 0)) {
                                            String str10 = fileIOEngine.MediaDescriptionCompat.write.read;
                                            if (!(str10 == null || str10.length() == 0)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        setpopupcallback.IconCompatParcelizer(Boolean.valueOf(z));
    }
}
