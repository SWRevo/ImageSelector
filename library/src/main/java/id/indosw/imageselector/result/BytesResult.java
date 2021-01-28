package id.indosw.imageselector.result;

import id.indosw.imageselector.PhotoSelector;
import id.indosw.imageselector.tools.Tools;

import java.io.File;

class BytesResult extends Result<byte[]> {

    BytesResult(PhotoSelector.ResultCallback<byte[]> callback) {
        super(callback);
    }

    @Override
    byte[] onImageResult(File file) {
        return Tools.readBytesFromFile(file);
    }

}
