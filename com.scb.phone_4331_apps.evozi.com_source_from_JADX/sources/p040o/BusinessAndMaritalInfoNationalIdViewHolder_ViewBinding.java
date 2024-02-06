package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/* renamed from: o.BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding */
public abstract class BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding {
    public String IconCompatParcelizer;
    private HashMap MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private int MediaBrowserCompat$ItemReceiver = 262144;
    protected String MediaBrowserCompat$SearchResultReceiver;
    protected int MediaDescriptionCompat = 20000;
    public String RatingCompat;
    private String read = "";
    public boolean write;

    public BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding() {
    }

    public BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding(String str, int i) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaDescriptionCompat = i;
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$CustomActionResultReceiver(LendingIssuerAdapter$IssuerViewHolder_ViewBinding lendingIssuerAdapter$IssuerViewHolder_ViewBinding, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.MediaBrowserCompat$ItemReceiver);
        byteArrayOutputStream.write(this.read.getBytes());
        ETBSelectionAdapter$TwoButtonHolder_ViewBinding eTBSelectionAdapter$TwoButtonHolder_ViewBinding = new ETBSelectionAdapter$TwoButtonHolder_ViewBinding();
        eTBSelectionAdapter$TwoButtonHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((OutputStream) byteArrayOutputStream, str);
        for (String str2 : this.MediaBrowserCompat$CustomActionResultReceiver.keySet()) {
            eTBSelectionAdapter$TwoButtonHolder_ViewBinding.IconCompatParcelizer(str2, (String) this.MediaBrowserCompat$CustomActionResultReceiver.get(str2));
        }
        lendingIssuerAdapter$IssuerViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(eTBSelectionAdapter$TwoButtonHolder_ViewBinding);
        eTBSelectionAdapter$TwoButtonHolder_ViewBinding.read();
        byteArrayOutputStream.write(13);
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }
}
