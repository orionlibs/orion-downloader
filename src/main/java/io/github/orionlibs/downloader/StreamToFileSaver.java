package io.github.orionlibs.downloader;

import io.github.orionlibs.orion_object.ResourceCloser;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

class StreamToFileSaver
{
    static void saveStreamToFile(BufferedInputStream input, String fileToDownloadTo) throws IOException
    {
        OutputStream fos = null;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream())
        {
            byte[] buf = new byte[1024];
            int n = 0;
            while((n = input.read(buf)) != -1)
            {
                output.write(buf, 0, n);
            }
            fos = Files.newOutputStream(Paths.get(fileToDownloadTo));
            fos.write(output.toByteArray());
        }
        finally
        {
            ResourceCloser.closeResource(input);
            ResourceCloser.closeResource(fos);
        }
    }
}
