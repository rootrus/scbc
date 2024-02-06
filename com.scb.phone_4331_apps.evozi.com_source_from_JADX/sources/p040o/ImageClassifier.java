package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ImageClassifier */
public class ImageClassifier extends writeUInt64NoTag<proxyGetIIdExtractionServerKta> {
    @HmlPinActivity
    public ImageClassifier(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    /* renamed from: o.ImageClassifier$ImageClassificationStatus */
    public final /* synthetic */ class ImageClassificationStatus implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ addImageOutEventListener MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ ImageClassificationStatus(addImageOutEventListener addimageouteventlistener) {
            this.MediaBrowserCompat$CustomActionResultReceiver = addimageouteventlistener;
        }

        public final void IconCompatParcelizer(Object obj) {
            addImageOutEventListener addimageouteventlistener = this.MediaBrowserCompat$CustomActionResultReceiver;
            C1162x44a04885 checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper = (C1162x44a04885) obj;
            checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer();
            checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(addimageouteventlistener.MediaBrowserCompat$ItemReceiver());
        }
    }
}
