package okhttp3.repackaged.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.PinLoginActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onMenuPromptPayClick;
import p040o.onMenuTopUpClick;
import p040o.onNeedHelpClick;

/* renamed from: okhttp3.repackaged.internal.framed.c */
class C10262c {
    private final onNeedHelpClick akH;
    /* access modifiers changed from: private */
    public int akI;
    private final PinLoginActivity source;

    public C10262c(PinLoginActivity pinLoginActivity) {
        onNeedHelpClick onneedhelpclick = new onNeedHelpClick((HowToAddAccountActivity) new onMenuTopUpClick(pinLoginActivity) {
            public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                if (C10262c.this.akI == 0) {
                    return -1;
                }
                long read = super.read(onmenupromptpayclick, Math.min(j, (long) C10262c.this.akI));
                if (read == -1) {
                    return -1;
                }
                C10262c cVar = C10262c.this;
                int unused = cVar.akI = (int) (((long) cVar.akI) - read);
                return read;
            }
        }, (Inflater) new Inflater() {
            public int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
                int inflate = super.inflate(bArr, i, i2);
                if (inflate != 0 || !needsDictionary()) {
                    return inflate;
                }
                setDictionary(Spdy3.aln);
                return super.inflate(bArr, i, i2);
            }
        });
        this.akH = onneedhelpclick;
        this.source = ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountActivity) onneedhelpclick);
    }

    /* renamed from: F */
    public List<Header> mo58818F(int i) throws IOException {
        this.akI += i;
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.source.mo56993x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfPairs < 0: ");
            sb.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            throw new IOException(sb.toString());
        } else if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver <= 1024) {
            ArrayList arrayList = new ArrayList(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            int i2 = 0;
            while (i2 < MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                PinLoginActivity_ViewBinding IconCompatParcelizer = readByteString().IconCompatParcelizer();
                PinLoginActivity_ViewBinding readByteString = readByteString();
                if (IconCompatParcelizer.write.length != 0) {
                    arrayList.add(new Header(IconCompatParcelizer, readByteString));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            m6108uQ();
            return arrayList;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfPairs > 1024: ");
            sb2.append(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            throw new IOException(sb2.toString());
        }
    }

    private PinLoginActivity_ViewBinding readByteString() throws IOException {
        return this.source.IconCompatParcelizer((long) this.source.mo56993x50fd9e4a());
    }

    /* renamed from: uQ */
    private void m6108uQ() throws IOException {
        if (this.akI > 0) {
            this.akH.IconCompatParcelizer();
            if (this.akI != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("compressedLimit > 0: ");
                sb.append(this.akI);
                throw new IOException(sb.toString());
            }
        }
    }

    public void close() throws IOException {
        this.source.close();
    }
}
