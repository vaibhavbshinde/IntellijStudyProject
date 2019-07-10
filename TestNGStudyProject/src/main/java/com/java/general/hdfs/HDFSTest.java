package com.java.general.hdfs;

import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HDFSTest {

  // This is copied from the entry in core-site.xml for the property fs.defaultFS.
    // Replace with your Hadoop deployment details.
    public static final String HDFS_ROOT_URL = "hdfs://tbhortonctl01.int.iad2.xaxis.net:8020";
    private Configuration conf;

    public HDFSTest() {
        conf = new Configuration();
        conf.set( "fs.hdfs.impl" , org.apache.hadoop.hdfs.DistributedFileSystem.class.getName() );
        conf.set( "fs.file.impl" , org.apache.hadoop.fs.LocalFileSystem.class.getName() );
    }

    public static void main(String[] args) throws Exception {
        HDFSTest demo = new HDFSTest();
        // Reads a file from the user's home directory.
        // Replace jj with the name of your folder
        // Assumes that input.txt is already in HDFS folder
        String uri = HDFS_ROOT_URL + "/user/appmgr/mplatform/consumer-clustering/samples/enrichment/9745084e-ea70-4f15-aac9-565d9af0cdc9";
        demo.printHDFSFileContents( uri );
    }

    // Example - Print hdfs file contents to console using Java
    public void printHDFSFileContents(String uri) throws Exception {
        FileSystem fs = FileSystem.get( URI.create( uri ) , conf );
        InputStream in = null;
        try {
            in = fs.open( new Path( uri ) );
            IOUtils.copyBytes( in , System.out , 4096 , false );
        } finally {
            IOUtils.closeStream( in );
        }
    }
}
