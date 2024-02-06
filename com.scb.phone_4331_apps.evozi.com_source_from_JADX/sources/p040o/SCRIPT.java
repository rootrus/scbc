package p040o;

import com.kofax.mobile.sdk.p083w.C8515ao;
import java.util.HashMap;

/* renamed from: o.SCRIPT */
public final class SCRIPT extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "ICC Profile";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Profile Size");
        write.put(4, "CMM Type");
        write.put(8, "Version");
        write.put(12, "Class");
        write.put(16, "Color space");
        write.put(20, "Profile Connection Space");
        write.put(24, "Profile Date/Time");
        write.put(36, C8515ao.f5179Qz);
        write.put(40, "Primary Platform");
        write.put(44, "CMM Flags");
        write.put(48, "Device manufacturer");
        write.put(52, "Device model");
        write.put(56, "Device attributes");
        write.put(64, "Rendering Intent");
        write.put(68, "XYZ values");
        write.put(80, "Profile Creator");
        write.put(128, "Tag Count");
        write.put(1093812784, "AToB 0");
        write.put(1093812785, "AToB 1");
        write.put(1093812786, "AToB 2");
        write.put(1649957210, "Blue Colorant");
        write.put(1649693251, "Blue TRC");
        write.put(1110589744, "BToA 0");
        write.put(1110589745, "BToA 1");
        write.put(1110589746, "BToA 2");
        write.put(1667329140, "Calibration Date/Time");
        write.put(1952543335, "Char Target");
        write.put(1667785060, "Chromatic Adaptation");
        write.put(1667789421, "Chromaticity");
        write.put(1668313716, "Copyright");
        write.put(1668441193, "CrdInfo");
        write.put(1684893284, "Device Mfg Description");
        write.put(1684890724, "Device Model Description");
        write.put(1684371059, "Device Settings");
        write.put(1734438260, "Gamut");
        write.put(1800688195, "Gray TRC");
        write.put(1733843290, "Green Colorant");
        write.put(1733579331, "Green TRC");
        write.put(1819635049, "Luminance");
        write.put(1835360627, "Measurement");
        write.put(1651208308, "Media Black Point");
        write.put(2004119668, "Media White Point");
        write.put(1852010348, "Named Color");
        write.put(1852009522, "Named Color 2");
        write.put(1919251312, "Output Response");
        write.put(1886545200, "Preview 0");
        write.put(1886545201, "Preview 1");
        write.put(1886545202, "Preview 2");
        write.put(1684370275, "Profile Description");
        write.put(1886610801, "Profile Sequence Description");
        write.put(1886610480, "Ps2 CRD 0");
        write.put(1886610481, "Ps2 CRD 1");
        write.put(1886610482, "Ps2 CRD 2");
        write.put(1886610483, "Ps2 CRD 3");
        write.put(1886597747, "Ps2 CSA");
        write.put(1886597737, "Ps2 Rendering Intent");
        write.put(1918392666, "Red Colorant");
        write.put(1918128707, "Red TRC");
        write.put(1935897188, "Screening Desc");
        write.put(1935897198, "Screening");
        write.put(1952801640, "Technology");
        write.put(1650877472, "Ucrbg");
        write.put(1987405156, "Viewing Conditions Description");
        write.put(1986618743, "Viewing Conditions");
        write.put(1685283693, "Apple Multi-language Profile Name");
    }

    public SCRIPT() {
        read((createCubemapFromCubeFaces) new TYPE(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
