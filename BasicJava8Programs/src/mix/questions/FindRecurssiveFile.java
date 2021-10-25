package mix.questions;

import java.io.File;

public class FindRecurssiveFile {

    public void walk( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
                System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
                System.out.println( "File:" + f.getAbsoluteFile() );
            }
        }
    }

    public static void main(String[] args) {
    	FindRecurssiveFile fw = new FindRecurssiveFile();
        fw.walk("c:\\" );
    }

}
