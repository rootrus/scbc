package p040o;

import com.google.android.gms.common.api.Api;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;
import p040o.addApi;
import p040o.fromDataField;
import p040o.getMaskAnimations;

/* renamed from: o.proxyGetIPassportDetector$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7383x8a61e826 implements getIIdDeserializerKta {
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, FormatException, ChecksumException {
        return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        addApi.read write = getZStart.write(setfontassetdelegate_mediabrowsercompat_itemreceiver, false);
        for (rsnScriptForEach[] next : write.MediaBrowserCompat$ItemReceiver) {
            rsnScriptSetVarI rsnscriptsetvari = write.IconCompatParcelizer;
            rsnScriptForEach rsnscriptforeach = next[4];
            rsnScriptForEach rsnscriptforeach2 = next[5];
            rsnScriptForEach rsnscriptforeach3 = next[6];
            rsnScriptForEach rsnscriptforeach4 = next[7];
            rsnScriptForEach rsnscriptforeach5 = next[0];
            rsnScriptForEach rsnscriptforeach6 = next[4];
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int abs = (rsnscriptforeach5 == null || rsnscriptforeach6 == null) ? Integer.MAX_VALUE : (int) Math.abs(rsnscriptforeach5.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach6.MediaBrowserCompat$CustomActionResultReceiver);
            rsnScriptForEach rsnscriptforeach7 = next[6];
            rsnScriptForEach rsnscriptforeach8 = next[2];
            int min = Math.min(abs, (((rsnscriptforeach7 == null || rsnscriptforeach8 == null) ? Integer.MAX_VALUE : (int) Math.abs(rsnscriptforeach7.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach8.MediaBrowserCompat$CustomActionResultReceiver)) * 17) / 18);
            rsnScriptForEach rsnscriptforeach9 = next[1];
            rsnScriptForEach rsnscriptforeach10 = next[5];
            int abs2 = (rsnscriptforeach9 == null || rsnscriptforeach10 == null) ? Integer.MAX_VALUE : (int) Math.abs(rsnscriptforeach9.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach10.MediaBrowserCompat$CustomActionResultReceiver);
            rsnScriptForEach rsnscriptforeach11 = next[7];
            rsnScriptForEach rsnscriptforeach12 = next[3];
            if (!(rsnscriptforeach11 == null || rsnscriptforeach12 == null)) {
                i = (int) Math.abs(rsnscriptforeach11.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach12.MediaBrowserCompat$CustomActionResultReceiver);
            }
            int min2 = Math.min(min, Math.min(abs2, (i * 17) / 18));
            rsnScriptForEach rsnscriptforeach13 = next[0];
            rsnScriptForEach rsnscriptforeach14 = next[4];
            int abs3 = (rsnscriptforeach13 == null || rsnscriptforeach14 == null) ? 0 : (int) Math.abs(rsnscriptforeach13.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach14.MediaBrowserCompat$CustomActionResultReceiver);
            rsnScriptForEach rsnscriptforeach15 = next[6];
            rsnScriptForEach rsnscriptforeach16 = next[2];
            int max = Math.max(abs3, (((rsnscriptforeach15 == null || rsnscriptforeach16 == null) ? 0 : (int) Math.abs(rsnscriptforeach15.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach16.MediaBrowserCompat$CustomActionResultReceiver)) * 17) / 18);
            rsnScriptForEach rsnscriptforeach17 = next[1];
            rsnScriptForEach rsnscriptforeach18 = next[5];
            int abs4 = (rsnscriptforeach17 == null || rsnscriptforeach18 == null) ? 0 : (int) Math.abs(rsnscriptforeach17.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach18.MediaBrowserCompat$CustomActionResultReceiver);
            rsnScriptForEach rsnscriptforeach19 = next[7];
            rsnScriptForEach rsnscriptforeach20 = next[3];
            getMaskAnimations.read read = getXStart.read(rsnscriptsetvari, rsnscriptforeach, rsnscriptforeach2, rsnscriptforeach3, rsnscriptforeach4, min2, Math.max(max, Math.max(abs4, (((rsnscriptforeach19 == null || rsnscriptforeach20 == null) ? 0 : (int) Math.abs(rsnscriptforeach19.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach20.MediaBrowserCompat$CustomActionResultReceiver)) * 17) / 18)));
            getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(read.RatingCompat, read.read, next, rsnIncAllocationCreateTyped.PDF_417);
            getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL, read.MediaBrowserCompat$ItemReceiver);
            fromDataField.read.write write2 = (fromDataField.read.write) read.write;
            if (write2 != null) {
                getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.PDF417_EXTRA_METADATA, write2);
            }
            arrayList.add(getlayers_mediabrowsercompat_customactionresultreceiver);
        }
        getLayers$MediaBrowserCompat$CustomActionResultReceiver[] getlayers_mediabrowsercompat_customactionresultreceiverArr = (getLayers$MediaBrowserCompat$CustomActionResultReceiver[]) arrayList.toArray(new getLayers$MediaBrowserCompat$CustomActionResultReceiver[arrayList.size()]);
        if (getlayers_mediabrowsercompat_customactionresultreceiverArr != null && getlayers_mediabrowsercompat_customactionresultreceiverArr.length != 0 && getlayers_mediabrowsercompat_customactionresultreceiverArr[0] != null) {
            return getlayers_mediabrowsercompat_customactionresultreceiverArr[0];
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
