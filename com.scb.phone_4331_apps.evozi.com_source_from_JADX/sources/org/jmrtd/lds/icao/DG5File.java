package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.jmrtd.lds.DisplayedImageDataGroup;
import org.jmrtd.lds.DisplayedImageInfo;

public class DG5File extends DisplayedImageDataGroup {
    private static final long serialVersionUID = 923840683207218244L;

    public DG5File(List<DisplayedImageInfo> list) {
        super(101, list, 24384);
    }

    public DG5File(InputStream inputStream) throws IOException {
        super(101, inputStream);
    }
}
