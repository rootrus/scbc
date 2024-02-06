package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Proxy;
import java.util.HashMap;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder */
public abstract class ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder {
    protected Proxy IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    protected String MediaBrowserCompat$ItemReceiver;
    private HashMap MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    private int RatingCompat;
    protected int read;
    public String write;

    public ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder() {
        this.read = 20000;
        this.MediaDescriptionCompat = "";
        this.RatingCompat = 262144;
        this.MediaBrowserCompat$MediaItem = new HashMap();
    }

    public ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder(String str, int i) {
        this.read = 20000;
        this.MediaDescriptionCompat = "";
        this.RatingCompat = 262144;
        this.MediaBrowserCompat$MediaItem = new HashMap();
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = i;
    }

    public ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder(String str) {
        this.read = 20000;
        this.MediaDescriptionCompat = "";
        this.RatingCompat = 262144;
        this.MediaBrowserCompat$MediaItem = new HashMap();
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* access modifiers changed from: protected */
    public final byte[] write(IssuerSearchAdapter$CustomViewHolder issuerSearchAdapter$CustomViewHolder, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.RatingCompat);
        byteArrayOutputStream.write(this.MediaDescriptionCompat.getBytes());
        InformationPanelAdapter$ItemHolder informationPanelAdapter$ItemHolder = new InformationPanelAdapter$ItemHolder();
        informationPanelAdapter$ItemHolder.setOutput(byteArrayOutputStream, str);
        for (String str2 : this.MediaBrowserCompat$MediaItem.keySet()) {
            informationPanelAdapter$ItemHolder.setPrefix(str2, (String) this.MediaBrowserCompat$MediaItem.get(str2));
        }
        informationPanelAdapter$ItemHolder.setPrefix("i", issuerSearchAdapter$CustomViewHolder.MediaMetadataCompat);
        informationPanelAdapter$ItemHolder.setPrefix(KtaJsonExactionHelper.OBJECT, issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$MediaItem);
        informationPanelAdapter$ItemHolder.setPrefix("c", issuerSearchAdapter$CustomViewHolder.write);
        informationPanelAdapter$ItemHolder.setPrefix("v", issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver);
        informationPanelAdapter$ItemHolder.startTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Envelope");
        informationPanelAdapter$ItemHolder.startTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Header");
        informationPanelAdapter$ItemHolder.endTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Header");
        informationPanelAdapter$ItemHolder.startTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Body");
        issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver((XmlSerializer) informationPanelAdapter$ItemHolder);
        informationPanelAdapter$ItemHolder.endTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Body");
        informationPanelAdapter$ItemHolder.endTag(issuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver, "Envelope");
        informationPanelAdapter$ItemHolder.flush();
        byteArrayOutputStream.write(13);
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }
}
