package p040o;

import java.util.HashMap;

/* renamed from: o.U16_4 */
public final class U16_4 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "IPTC";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(256, "Enveloped Record Version");
        write.put(261, "Destination");
        write.put(276, "File Format");
        write.put(278, "File Version");
        write.put(286, "Service Identifier");
        write.put(296, "Envelope Number");
        write.put(306, "Product Identifier");
        write.put(316, "Envelope Priority");
        write.put(326, "Date Sent");
        write.put(336, "Time Sent");
        write.put(346, "Coded Character Set");
        write.put(356, "Unique Object Name");
        write.put(376, "ARM Identifier");
        write.put(378, "ARM Version");
        write.put(512, "Application Record Version");
        write.put(515, "Object Type Reference");
        write.put(516, "Object Attribute Reference");
        write.put(517, "Object Name");
        write.put(519, "Edit Status");
        write.put(520, "Editorial Update");
        write.put(522, "Urgency");
        write.put(524, "Subject Reference");
        write.put(527, "Category");
        write.put(532, "Supplemental Category(s)");
        write.put(534, "Fixture Identifier");
        write.put(537, "Keywords");
        write.put(538, "Content Location Code");
        write.put(539, "Content Location Name");
        write.put(542, "Release Date");
        write.put(547, "Release Time");
        write.put(549, "Expiration Date");
        write.put(550, "Expiration Time");
        write.put(552, "Special Instructions");
        write.put(554, "Action Advised");
        write.put(557, "Reference Service");
        write.put(559, "Reference Date");
        write.put(562, "Reference Number");
        write.put(567, "Date Created");
        write.put(572, "Time Created");
        write.put(574, "Digital Date Created");
        write.put(575, "Digital Time Created");
        write.put(577, "Originating Program");
        write.put(582, "Program Version");
        write.put(587, "Object Cycle");
        write.put(592, "By-line");
        write.put(597, "By-line Title");
        write.put(602, "City");
        write.put(604, "Sub-location");
        write.put(607, "Province/State");
        write.put(612, "Country/Primary Location Code");
        write.put(613, "Country/Primary Location Name");
        write.put(615, "Original Transmission Reference");
        write.put(617, "Headline");
        write.put(622, "Credit");
        write.put(627, "Source");
        write.put(628, "Copyright Notice");
        write.put(630, "Contact");
        write.put(632, "Caption/Abstract");
        write.put(633, "Local Caption");
        write.put(634, "Caption Writer/Editor");
        write.put(637, "Rasterized Caption");
        write.put(642, "Image Type");
        write.put(643, "Image Orientation");
        write.put(647, "Language Identifier");
        write.put(662, "Audio Type");
        write.put(663, "Audio Sampling Rate");
        write.put(664, "Audio Sampling Resolution");
        write.put(665, "Audio Duration");
        write.put(666, "Audio Outcue");
        write.put(696, "Job Identifier");
        write.put(697, "Master Document Identifier");
        write.put(698, "Short Document Identifier");
        write.put(699, "Unique Document Identifier");
        write.put(700, "Owner Identifier");
        write.put(712, "Object Data Preview File Format");
        write.put(713, "Object Data Preview File Format Version");
        write.put(714, "Object Data Preview Data");
    }

    public U16_4() {
        read((createCubemapFromCubeFaces) new U16(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
