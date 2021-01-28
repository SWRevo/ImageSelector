package id.indosw.imageselector.result;

import id.indosw.imageselector.PhotoSelector;

import java.io.File;

class FileResult extends Result<File> {

    FileResult(PhotoSelector.ResultCallback<File> callback) {
        super(callback);
    }

    @Override
    File onImageResult(File file) {
        return file;
    }

}
