package cn.edu.ncu.eureka;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface CLibrary extends Library{
    String libName = Platform.isWindows()?"msvcrt":"c";
    public CLibrary Instance = Native.load(libName,CLibrary.class);

    void printf(String format, String args);
}
