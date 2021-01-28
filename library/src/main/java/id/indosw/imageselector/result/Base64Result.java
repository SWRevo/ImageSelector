package id.indosw.imageselector.result;

import id.indosw.imageselector.PhotoSelector;
import id.indosw.imageselector.tools.Tools;

import java.io.File;

class Base64Result extends Result<String> {

    Base64Result(PhotoSelector.ResultCallback<String> callback) {
        super(callback);
    }

    @Override
    String onImageResult(File file) {
        return Tools.readBase64FromFile(file);
    }

}
