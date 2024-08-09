package io.github.orionlibs.downloader;

class TargetFileValidator
{
    static void validate(String fileToDownloadTo)
    {
        if(fileToDownloadTo == null || fileToDownloadTo.isEmpty())
        {
            throw new IllegalArgumentException("fileToDownloadTo is null/empty.");
        }
    }
}
