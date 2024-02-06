package p040o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.load */
public final class C7236load implements RSRuntimeException {
    public static final C7236load MediaBrowserCompat$CustomActionResultReceiver = new C7236load(MediaBrowserCompat$SearchResultReceiver, MediaDescriptionCompat);
    public static final Set<Float4> MediaBrowserCompat$ItemReceiver = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Float4[]{new Float4("proto"), new Float4("json")})));
    private static String MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.IconCompatParcelizer("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    private static final String MediaDescriptionCompat = AlertController$RecycleListView.IconCompatParcelizer("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    static final String write = AlertController$RecycleListView.IconCompatParcelizer("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    final String IconCompatParcelizer;
    final String read;

    static {
        new C7236load(write, (String) null);
    }

    public C7236load(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final String IconCompatParcelizer() {
        return "cct";
    }

    public final Set<Float4> MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final byte[] read() {
        if (this.IconCompatParcelizer == null && this.read == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.read;
        objArr[2] = "\\";
        String str = this.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
